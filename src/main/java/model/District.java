package model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class District extends AbsUUID{
    private String name;
    private Long population;
    private Double area;
    private Region region;

}
