package repository;

import dto.RoleDto;
import model.Role;

import java.util.List;
import java.util.UUID;

public interface RoleRepository {
    // CRUD Operations
    /*
      C - Create
      R - Read (all, one)
      U - Update
      D - Delete
     */
    RoleDto save(RoleDto roleDto);
    List<Role> findAll();
    Role findByName(String name);
    Role findById(UUID id);
    void deleteByName(String name);
    void deleteById(UUID id);
}
