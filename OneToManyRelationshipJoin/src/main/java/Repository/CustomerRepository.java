package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Dto.OrderRequest;
import Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

	Customer save(Class<? extends OrderRequest> class1);

}
