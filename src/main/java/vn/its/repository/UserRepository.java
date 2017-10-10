package vn.its.repository;

import org.springframework.data.repository.CrudRepository;

import vn.its.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByEmail(String email);
	
}
