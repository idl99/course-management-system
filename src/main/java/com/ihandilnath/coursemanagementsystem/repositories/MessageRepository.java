package com.ihandilnath.coursemanagementsystem.repositories;

import com.ihandilnath.coursemanagementsystem.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
