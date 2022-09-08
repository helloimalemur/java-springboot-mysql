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
    private String fullmessage;
    private String email;
    private int phone;
    private String fullname;

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public void setTicketMessage(String ticketsummary) {
        this.fullmessage = ticketsummary;
    }
    public String getFullmessage() {
        return this.fullmessage;
    }

    public void setTicketname(String ticketfull) {
        this.fullname = ticketfull;
    }
    public String getFullname() {
        return this.fullname;
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

