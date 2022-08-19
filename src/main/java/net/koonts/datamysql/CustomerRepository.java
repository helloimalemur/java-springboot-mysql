package net.koonts.datamysql;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByLastName(String lastName);
    List<Customer> findByEmail(String email);
    Boolean existsByEmail(String email);

    Customer findById(long id);
}
