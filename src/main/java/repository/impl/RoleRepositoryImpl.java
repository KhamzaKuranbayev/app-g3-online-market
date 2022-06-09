package repository.impl;

import dto.RoleDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Role;
import repository.RoleRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class RoleRepositoryImpl implements RoleRepository {
    public static List<Role> roleStorage = new ArrayList<>();

    @Override
    public RoleDto save(RoleDto roleDto) {
        Role role = new Role();
        role.setName(roleDto.getName());
        role.setDescription(roleDto.getDescription());
        roleStorage.add(role);
        return new RoleDto(role.getID(), role.getName(), role.getDescription());
    }

    @Override
    public List<Role> findAll() {
        return roleStorage;
    }

    @Override
    public Role findByName(String name) {
        for (Role role : roleStorage) {
            if(role.getName().equals(name))
                return role;
        }
        return null;
    }

    @Override
    public Role findById(UUID id) {
        for (Role role : roleStorage) {
            if(role.getID().equals(id))
                return role;
        }
        return null;
    }

    @Override
    public void deleteByName(String name) {
        /*for (Role role : roleStorage) {
            if(role.getName().equals(name))
                roleStorage.remove(role);
        }*/

        roleStorage.removeIf(role -> role.getName().equals(name));
    }

    @Override
    public void deleteById(UUID id) {
        roleStorage.removeIf(role -> role.getID().equals(id));
    }
}
