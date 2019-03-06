package ffg.harish.dynamicforms.repository;

import ffg.harish.dynamicforms.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Customer repository
 * Created by Harish Kadamudi on 25/02/2016.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}