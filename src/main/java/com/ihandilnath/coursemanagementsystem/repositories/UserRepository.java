package com.ihandilnath.coursemanagementsystem.repositories;

import com.ihandilnath.coursemanagementsystem.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
