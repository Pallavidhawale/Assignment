package Dto;

import Entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest 
{
private Customer customer;

public Object getCustomer() {
	// TODO Auto-generated method stub
	return null;
}
}
