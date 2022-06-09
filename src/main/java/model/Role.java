package model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Role extends AbsUUID {
    private String name;
    private String description;



}
