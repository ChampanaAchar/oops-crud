package com.xworks.passportapp.passport.impl;

import com.xworks.passportapp.passport.Passport;
import com.xworks.passportapp.user.User;

public class PassportImpl implements Passport {
    public int index;
    User user[]={null,null,null};
    @Override
    public boolean createPassport(User user) {
        boolean isCreated=false;
        if(user!=null){
            if(user.getUserName()!=null){
                this.user[index++]=user;
                isCreated=true;
            }else System.out.println("Invalid details");
        }else System.out.println("Cannot be created");
        return isCreated;
    }

    @Override
    public void getDetails() {
        for(User user:user){
            System.out.println(user);
        }

    }

    @Override
    public boolean updateDetails(String place) {
        boolean isUpdated=false;
       // user.setPlace(place);
       // isUpdated=true;
        return isUpdated;
    }

    @Override
    public boolean deleteDetails() {
        this.user=null;
        return true;
    }
}
