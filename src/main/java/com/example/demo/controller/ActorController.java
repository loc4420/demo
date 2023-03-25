package com.example.demo.controller;

import com.example.demo.entity.ActorEntity;
import com.example.demo.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/actor")
public class ActorController {
    @Autowired
    private ActorService actorService;

    @GetMapping
    public List<ActorEntity> getAllActor(){
     return actorService.findAllActor();
    }

    @GetMapping("/{id}")
    public Optional<ActorEntity> getActorById(@PathVariable("id") Long id){
        return actorService.findById(id);
    }

    @PostMapping
    public  ActorEntity postActor(@RequestBody ActorEntity actorEntity){
        return actorService.addActor(actorEntity);
    }

    @PutMapping
    public ActorEntity putActor(@RequestBody ActorEntity actorEntity){
        return actorService.updateActor(actorEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteActor(@PathVariable("id") Long id) {
        actorService.delActor(id);
    }
}
