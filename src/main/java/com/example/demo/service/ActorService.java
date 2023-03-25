package com.example.demo.service;

import com.example.demo.entity.ActorEntity;

import java.util.List;
import java.util.Optional;

public interface ActorService {
    List<ActorEntity> findAllActor();
    Optional<ActorEntity> findById(Long id);
    ActorEntity addActor(ActorEntity newActor);
    ActorEntity updateActor(ActorEntity saveActor);
    void delActor (Long id);
}
