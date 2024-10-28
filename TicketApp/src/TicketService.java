import java.time.LocalTime;

public class TicketService {
    public static void main(String[] args) {
        // Empty ticket
        Ticket emptyTicket = new Ticket();

        // Full ticket with all fields initialized
        Ticket fullTicket = new Ticket("1234", "MainHall", 123, LocalTime.of(12, 0), true, 'B', 10.5);

        // Limited ticket with only concertHall, eventCode, and time
        Ticket limitedTicket = new Ticket("SideHall", 456,  LocalTime.of(14, 0));

        // Optionally set the price
        fullTicket.setPrice(100.00);

        // Display ticket details
        displayTicketInfo("Empty Ticket", emptyTicket);
        displayTicketInfo("Full Ticket", fullTicket);
        displayTicketInfo("Limited Ticket", limitedTicket);
    }

    private static void displayTicketInfo(String ticketType, Ticket ticket) {
        System.out.println(ticketType + " - Concert Hall: " + ticket.getConcertHall() + ", Event Code: " + ticket.getEventCode() + ", Time: " + ticket.getTime() + ", Price: " + ticket.getPrice());
    }
}
