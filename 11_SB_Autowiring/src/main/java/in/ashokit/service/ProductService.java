package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	private ProductDao dao;

	public void saveProduct() {
		dao.saveProduct();
	}
}
