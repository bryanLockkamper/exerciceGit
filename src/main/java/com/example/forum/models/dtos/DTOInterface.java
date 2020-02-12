package com.example.forum.models.dtos;

public interface DTOInterface<EntityType> {
    void fromEntity(EntityType entity);
    EntityType toEntity();
}
