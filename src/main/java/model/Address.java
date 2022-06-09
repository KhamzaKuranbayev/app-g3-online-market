package model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address extends AbsUUID{
    private String street;
    private String home;
    private District district;

}
