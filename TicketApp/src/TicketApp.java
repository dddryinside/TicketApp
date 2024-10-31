import java.util.Optional;

public class TicketApp {
    public static void main(String[] args) {
        Optional<Ticket> ticketOptional = TicketService.getTicketById(String.valueOf(1));
        if (ticketOptional.isPresent()) {
            displayTicketInfo(ticketOptional.get());
        } else {
            throw new RuntimeException("Ticket is not found!");
        }
    }

    private static void displayTicketInfo(Ticket ticket) {
        System.out.println("Concert Hall: " + ticket.getConcertHall() + ", Event Code: " + ticket.getEventCode() + ", Time: " + ticket.getTime() + ", Price: " + ticket.getPrice());
    }
}
