package net.codejava.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RollonTableService {
	@Autowired RollonTableRepository repo;
	
	public void save(RollonTable customer) {
		repo.save(customer);
	}
	
	public List<RollonTable> listAll() {
		return (List<RollonTable>) repo.findAll();
	}
	
	public RollonTable get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	/*public List<RollonTable> search(String keyword) {
		return repo.search(keyword);
	}*/
	
	/*public List<RollonTable> getAccounts() {
	return repo.getAccounts();
	}*/
	
}
