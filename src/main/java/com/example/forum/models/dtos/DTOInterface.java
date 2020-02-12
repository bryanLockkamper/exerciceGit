package com.example.forum.controllers.dtos;

public interface DTOInterface<EntityType> {
    void fromEntity(EntityType entity);
    EntityType toEntity();
}
