public class TicketApp {
    public static void main(String[] args) {

    }

    private static void displayTicketInfo(Ticket ticket) {
        System.out.println("Concert Hall: " + ticket.getConcertHall() + ", Event Code: " + ticket.getEventCode() + ", Time: " + ticket.getTime() + ", Price: " + ticket.getPrice());
    }
}
