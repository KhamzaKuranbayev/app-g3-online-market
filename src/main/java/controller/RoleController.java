package controller;

import dto.RoleDto;
import dto.response.Response;
import service.RoleService;
import service.RoleServiceImpl;

public class RoleController {
    public RoleService roleService = new RoleServiceImpl();

    public Response save(RoleDto dto) {
       return roleService.save(dto);
    }
}
