package service;

import dto.RoleDto;
import dto.response.Response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Role;
import repository.RoleRepository;
import repository.impl.RoleRepositoryImpl;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleServiceImpl implements RoleService{
    private RoleRepository roleRepository = new RoleRepositoryImpl();

    @Override
    public Response save(RoleDto dto) {
        RoleDto savedRole = roleRepository.save(dto);
        return new Response(true, "Role Successfully saved!", savedRole);
    }
}
