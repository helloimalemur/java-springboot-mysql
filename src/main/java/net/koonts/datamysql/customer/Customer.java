package net.koonts.datamysql;

import javax.persistence.*;

//https://java-design-patterns.com/patterns/dao/
@Entity
public class Customer {
    @Id
    @Column(name="id")
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    //@SequenceGenerator(name = "id_Sequence", sequenceName = "CUSTOMER")
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
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

