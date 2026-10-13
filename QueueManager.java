import java.util.LinkedList;
import java.util.Queue;

public class QueueManager {
    private Queue<Ticket> queue = new LinkedList<>();
    private int counter = 101;

    public synchronized Ticket addCustomer(String name, String service) {
        if (name == null || name.trim().isEmpty()) return null;
        Ticket ticket = new Ticket(counter++, name.trim(), service);
        queue.add(ticket);
        return ticket;
    }

    public synchronized Ticket serveNext() {
        return queue.poll();
    }

    public synchronized Queue<Ticket> getQueueSnapshot() {
        return new LinkedList<>(queue);
    }
}