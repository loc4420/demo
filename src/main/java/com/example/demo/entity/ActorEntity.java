package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "actor")
public class ActorEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "actorId")
    private Long actorId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "lastUpdate")
    private String lastUpdate;

    public ActorEntity() {
    }

    public ActorEntity(Long actorId, String firstName, String lastName, String lastUpdate) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
