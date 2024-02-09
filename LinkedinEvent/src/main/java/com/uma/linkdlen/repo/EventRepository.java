package com.uma.linkdlen.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uma.linkdlen.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

	Optional<Event> findById(Long id);

	void deleteById(Long id );

}
