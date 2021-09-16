package com.emmanuel.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emmanuel.entity.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Serializable> {

}
