import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public class TicketService {
    private static final List<Ticket> ticketStorage = List.of(
            new Ticket("1", "MainHall", 123, LocalTime.of(12, 0), true, 'B', 10.5),
            new Ticket("2", "MainHall", 124, LocalTime.of(13, 0), true, 'A', 12.0),
            new Ticket("3", "MainHall", 125, LocalTime.of(14, 0), false, 'C', 15.0),
            new Ticket("4", "SideHall", 126, LocalTime.of(15, 0), true, 'D', 9.0),
            new Ticket("5", "SideHall", 127, LocalTime.of(16, 0), false, 'A', 8.5),
            new Ticket("6", "SideHall", 128, LocalTime.of(17, 0), true, 'B', 11.0),
            new Ticket("7", "MainHall", 129, LocalTime.of(18, 0), false, 'E', 14.5),
            new Ticket("8", "MainHall", 130, LocalTime.of(19, 0), true, 'F', 13.5),
            new Ticket("9", "SideHall", 131, LocalTime.of(20, 0), false, 'G', 7.0),
            new Ticket("10", "SideHall", 132, LocalTime.of(21, 0), true, 'H', 9.5)
    );

    public static Optional<Ticket> getTicketById(String id) {
        return ticketStorage.stream()
                .filter(ticket -> ticket.getId().equals(id))
                .findFirst();
    }
}