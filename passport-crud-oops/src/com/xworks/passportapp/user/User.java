package com.xworks.passportapp.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private String userName;
    private int age;
    private String gender;
    private String dob;
    private String place;
}
