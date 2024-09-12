package com.home.xworkz.trainee;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class Trainee {
    private String traineeName;
    private int age;
    private double fees;
    private String duration;

}
