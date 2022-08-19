package net.koonts.datamysql;


import org.springframework.data.repository.CrudRepository;
import net.koonts.datamysql.Customer;

public interface UserRepository extends CrudRepository<Customer, Integer> {

}
