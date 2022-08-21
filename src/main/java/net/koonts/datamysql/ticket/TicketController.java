package net.koonts.datamysql.ticket;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	// This means that this class is a Controller
@RequestMapping(path="/ticket") // This means URL's start with /demo (after Application path)
public class TicketController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private TicketRepository ticketRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewTicket (@RequestParam String email
            , @RequestParam String summary, @RequestParam String fulldesc) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Ticket t = new Ticket();
        t.setEmail(email);
        t.setTicketsummary(summary);
        t.setTicketfull(fulldesc);
        if (ticketRepository.existsByTicketsummary(summary)) {
            return "Already exists";
        }
        ticketRepository.save(t);

        return "Saved";
    }

    @PostMapping(path="/all")
    public @ResponseBody Iterable<Ticket> getAllTickets(@RequestParam String email) {
        // This returns a JSON or XML with the users
        return ticketRepository.listAll();
    }

    @PostMapping(path="/byemail")
    public @ResponseBody Iterable<Ticket> getAllByEmail(@RequestParam String email) {
        // This returns a JSON or XML with the users
        if (ticketRepository.existsByEmail(email)) {
            return ticketRepository.findByEmail(email);
        }
        return null;
    }

}
