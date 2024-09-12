package com.xworks.passportapp;

import com.xworks.passportapp.passport.Passport;
import com.xworks.passportapp.passport.impl.PassportImpl;
import com.xworks.passportapp.user.User;

public class PassportRunner {
    public static void main(String[] args) {
        User user=new User();
        user.setUserName("Champana ");
        user.setAge(22);
        user.setDob("31-07-2002");
        user.setGender("Female");
        user.setPlace("Hiriyur");

        User user1 =new User();
        user1.setUserName("Bhuvan ");
        user1.setAge(21);
        user1.setDob("27-02-2003");
        user1.setGender("Male");
        user1.setPlace("Bhadravathi");

        User user2 =new User();
        user2.setUserName("Bharath ");
        user2.setAge(21);
        user2.setDob("27-02-2003");
        user2.setGender("Male");
        user2.setPlace("Banglore");

        Passport passport=new PassportImpl();
        passport.createPassport(user);
        passport.createPassport(user1);
        passport.createPassport(user2);
        passport.getDetails();
        //passport.updateDetails("Banglore");
       // passport.getDetails();
    }
}
