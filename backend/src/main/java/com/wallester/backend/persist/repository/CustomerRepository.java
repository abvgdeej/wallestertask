package com.wallester.backend.persist.repository;

import com.wallester.backend.persist.entity.CustomerEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * DAO of the {@link CustomerEntity}
 */
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
    List<CustomerEntity> findAllByFirstNameAndLastName(String firstName, String lastName);

    Page<CustomerEntity> findAllByFirstNameAndLastName(String firstName, String lastName, Pageable pageable);
}
