package model;

import lombok.*;

import java.util.Random;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbsUUID {
    private String firstname;
    private String lastname;
    private Integer age;
    private Role role;
    private Address address;


}
