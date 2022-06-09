package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleDto {
    private UUID id;
    private String name;
    private String description;

    public RoleDto(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
