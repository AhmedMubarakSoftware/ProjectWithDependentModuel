package com.aman.customRepos.repos;

import com.aman.customRepos.entites.CustomFoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomFooDAO extends JpaRepository<CustomFoo, Long> {

    CustomFoo findByName(String name);

    @Query("SELECT f FROM CustomFoo f WHERE LOWER(f.name) = LOWER(:name)")
    CustomFooDAO retrieveByName(@Param("name") String name);
}