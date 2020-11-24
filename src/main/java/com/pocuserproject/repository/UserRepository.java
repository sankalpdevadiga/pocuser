package com.pocuserproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pocuserproject.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
