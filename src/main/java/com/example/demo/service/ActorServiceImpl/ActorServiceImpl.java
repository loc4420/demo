package com.example.demo.service.ActorServiceImpl;

import com.example.demo.entity.ActorEntity;
import com.example.demo.respository.ActorRespository;
import com.example.demo.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorRespository actorRespository;

    @Override
    public List<ActorEntity> findAllActor() {
        List<ActorEntity> actorEntityList = new ArrayList<>();
        return actorEntityList = actorRespository.findAll();
    }

    @Override
    public Optional<ActorEntity> findById(Long id) {
        return actorRespository.findById(id);
    }

    @Override
    public ActorEntity addActor(ActorEntity newActor) {
        return actorRespository.save(newActor);
    }

    @Override
    public ActorEntity updateActor(ActorEntity saveActor) {
        return actorRespository.save(saveActor);
    }

    @Override
    public void delActor(Long id) {
        actorRespository.deleteById(id);
    }
}
