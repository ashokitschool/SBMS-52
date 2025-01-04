package in.ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.Product;

@RestController
public class ProductRestController {
	
	@PostMapping(
			value = "/product",
			consumes = { "application/json", "application/xml" },
			produces = "text/plain"
	)
	public ResponseEntity<String> addProduct(@RequestBody Product p){
		System.out.println(p);
		// logic to save product
		String msg = "Product saved";
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
	
	@PutMapping(
			value = "/product",
			consumes = "application/json",
			produces = "text/plain"
			
	)
	public ResponseEntity<String> updateProduct(@RequestBody Product p){
		System.out.println(p);
		// logic to update product
		String msg = "Product updated";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	
	@DeleteMapping(
			value = "/product/{pid}",
			produces = "text/plain"
	)
	public ResponseEntity<String> deleteProduct(@PathVariable Integer pid){
		// logic to delete
		return new ResponseEntity<>("Product Deleted", HttpStatus.OK);
	}
	

	@GetMapping(
			value = "/product/{pid}",
			produces = { "application/json", "application/xml" }
	)
	public ResponseEntity<Product> getProduct(@PathVariable Integer pid) {
		Product p = new Product(pid, "Mouse", 1200.00);
		return new ResponseEntity<Product>(p, HttpStatus.OK);
	}
	
	@GetMapping(
			value = "/products",
			produces = { "application/json", "application/xml" }
	)
	public ResponseEntity<List<Product>> getProducts(){
		
		Product p1 = new Product(1, "Mouse", 1200.00);
		Product p2 = new Product(2, "RAM", 5200.00);
		Product p3 = new Product(3, "Keyboard", 7200.00);
		
		List<Product> plist = Arrays.asList(p1, p2, p3);
		
		return new ResponseEntity<List<Product>>(plist, HttpStatus.OK);
	}
}






