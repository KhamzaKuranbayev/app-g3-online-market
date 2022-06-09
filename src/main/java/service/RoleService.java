package service;

import dto.RoleDto;
import dto.response.Response;
import model.Role;

public interface RoleService {
    Response save(RoleDto dto);

}
