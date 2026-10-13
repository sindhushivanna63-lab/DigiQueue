import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    private int ticketNumber;
    private String customerName;
    private String serviceType;
    private String timestamp;

    public Ticket(int ticketNumber, String customerName, String serviceType) {
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
        this.serviceType = serviceType;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public int getTicketNumber() { return ticketNumber; }
    public String getCustomerName() { return customerName; }
    public String getServiceType() { return serviceType; }
    public String getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        return String.format("#%d | %s (%s) - Issued at %s", ticketNumber, customerName, serviceType, timestamp);
    }
}