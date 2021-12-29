package com.example.flywaydemo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/***
 * 
 * @author vsrr.ramanujadasu
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
