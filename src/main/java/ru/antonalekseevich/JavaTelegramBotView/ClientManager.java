package ru.antonalekseevich.JavaTelegramBotView;

import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.API_REQUEST;

import java.util.Stack;
import java.util.UUID;

public class ClientManager implements Runnable {

    public static Stack<API_REQUEST> queue = new Stack<>();

    ThreadGroup RequestersGroup = new ThreadGroup("Request");
    int Requesters;
    Thread[] RequestersThreads;

    public void recalculateWorkersRequired() {
        Requesters = ((queue.size() * 1.75) > (Short.MAX_VALUE * 2)) ? (Short.MAX_VALUE * 2)
                : ((queue.size() == 0) ? 1 : (int) (queue.size() * 1.75));
    }

    public void removeDeadThreads() {
        int alive = 0;
        if (RequestersThreads == null) return;
        for (Thread thread : RequestersThreads)
            if (thread != null && thread.getState() != Thread.State.TERMINATED) alive++;
        Thread[] aliveWorkerThreads = new Thread[alive];
        alive = 0;
        for (Thread workerThread : RequestersThreads)
            if (workerThread != null && workerThread.getState() != Thread.State.TERMINATED)
                aliveWorkerThreads[alive++] = workerThread;
        RequestersThreads = aliveWorkerThreads.clone();
        System.gc();
    }

    public void updateRequestersThreads() {
        recalculateWorkersRequired();
        removeDeadThreads();
        if (RequestersThreads != null) if (RequestersThreads.length > Requesters) return;
        Thread[] newRequestersThreads = new Thread[Requesters];
        if (RequestersThreads != null) System.arraycopy(RequestersThreads, 0, newRequestersThreads, 0, RequestersThreads.length);
        for (int i = newRequestersThreads.length - 1; i >= 0; i--)
            if (newRequestersThreads[i] == null)
                newRequestersThreads[i] = new Thread(RequestersGroup, new Requester(), String.format("Requester-%s", UUID.randomUUID()));
        RequestersThreads = newRequestersThreads;
        Runtime.getRuntime().runFinalization();
    }

    @Override
    public void run() {
        try {
            while (true) {
                updateRequestersThreads();
                for (Thread RequestersThread : RequestersThreads)
                    if (RequestersThread != null && RequestersThread.getState() == Thread.State.NEW && !queue.empty())
                        RequestersThread.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
