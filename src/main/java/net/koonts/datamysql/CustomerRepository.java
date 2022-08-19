package net.koonts.datamysql;

//https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByLastName(String lastName);
    List<Customer> findByEmail(String email);
    Boolean existsByEmail(String email);

    Customer findById(long id);
}
