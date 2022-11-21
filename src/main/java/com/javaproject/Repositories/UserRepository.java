package com.javaproject.Repositories;

import com.javaproject.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
// imports removed for brevity
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}

