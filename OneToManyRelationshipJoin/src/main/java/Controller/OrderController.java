package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Dto.OrderRequest;
import Entity.Customer;
import Repository.CustomerRepository;
import Repository.ProductRepository;

@RestController
public class OrderController
{
	@Autowired
     private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request)
	{
		return customerRepository.save(request.getClass());
	}
} 
