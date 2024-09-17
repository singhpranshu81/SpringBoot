package com.mph.sprbootdemo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mph.sprbootdemo.entity.Semployee;

@Repository
public interface SemployeeRepository  extends JpaRepository<Semployee, Integer>{
public Semployee findByEname(String name);

@Query("select e from Semployee e where e.email = %:email%")
public Semployee ssemail(@Param("email") String email);

//  If u want to use normal query then use native query=true and put query in value=
//@Query(value="select * from Semployee  where email = %:email%", nativeQuery=true)
//public Semployee ssemail(@Param("email") String email);
}
