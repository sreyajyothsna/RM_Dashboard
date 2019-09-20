package net.codejava.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolloffTableService {
	@Autowired RolloffTableRepository repo;
	
	public void save(RolloffTable customer) {
		repo.save(customer);
	}
	
	public List<RolloffTable> listAll() {
		return (List<RolloffTable>) repo.findAll();
	}
	
	public RolloffTable get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
	