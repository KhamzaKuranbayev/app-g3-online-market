package model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Country extends AbsUUID{
    private String name;
    private Long population;
    private Double area;
    private String phoneCode;       // +998, +777,...
}
