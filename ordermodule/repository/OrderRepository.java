package com.tns.ifet.ordermodule.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
	 // Find orders by customer ID
    List<Order> findByCustomerId(Long customerId);
    
    // Find orders by status (e.g., "Pending", "Shipped", "Delivered")
    List<Order> findByStatus(String status);

}
