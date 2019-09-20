package net.codejava.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HireTableService {
	@Autowired HireTableRepository repo;
	
	public void save(HireTable customer) {
		repo.save(customer);
	}
	
	public List<HireTable> listAll() {
		return (List<HireTable>) repo.findAll();
	}
	
	public HireTable get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	/*public List<HireTable> search(String keyword) {
		return repo.search(keyword);
	}*/
	
	
}
