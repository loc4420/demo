package com.example.demo.respository;

import com.example.demo.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRespository extends JpaRepository<ActorEntity,Long> {

}
