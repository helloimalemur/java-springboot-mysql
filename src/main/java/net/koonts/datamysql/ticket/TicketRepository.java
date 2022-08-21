package net.koonts.datamysql.ticket;

//https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html
//Example 1.4. Query creation from method names
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

    List<Ticket> findByEmail(String email); //abstract methods -- see doc above
    Boolean existsByEmail(String ticketid);
    Boolean existsByTicketid(String ticketid);
    Boolean existsByTicketsummary(String ticketsummary);
    Ticket findById(int ticketid);
}
