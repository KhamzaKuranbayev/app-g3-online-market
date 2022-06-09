package model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Region extends AbsUUID {
    private String name;
    private Long population;
    private Double area;
    private Country country;
}
