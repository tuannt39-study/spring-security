package vn.its.repository;

import org.springframework.data.repository.CrudRepository;

import vn.its.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

	Role findByName(String name);
	
}
