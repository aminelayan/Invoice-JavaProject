package com.javaproject.Repositories;

import com.javaproject.Models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// imports removed for brevity
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    List<Role> findAll();

    List<Role> findByName(String name);
}


