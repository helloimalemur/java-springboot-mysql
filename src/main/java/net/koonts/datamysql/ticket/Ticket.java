package net.koonts.datamysql.ticket;

import javax.persistence.*;

//https://java-design-patterns.com/patterns/dao/
@Entity
public class Ticket {
    @Id
    @Column(name="ticketid")
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")

    private int ticketid;
    private String ticketsummary;
    private String email;
    private int phone;
    private String ticketfull;

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public void setTicketsummary(String ticketsummary) {
        this.ticketsummary = ticketsummary;
    }
    public String getTicketsummary() {
        return this.ticketsummary;
    }

    public void setTicketfull(String ticketfull) {
        this.ticketfull = ticketfull;
    }
    public String getTicketfull() {
        return this.ticketfull;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getPhone() {
        return phone;
    }

}

