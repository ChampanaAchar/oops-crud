package com.home.xworkz.xworkz.impl;

import com.home.xworkz.trainee.Trainee;
import com.home.xworkz.xworkz.Xworkz;

public class XworkzImpl implements Xworkz {
    public int index;
    Trainee trainee[]={};
    @Override
    public boolean addTrainee(Trainee trainee) {
        boolean isAdded=false;
        if(trainee!=null){
            if(trainee.getTraineeName()!=null){
                this.trainee[index++]=trainee;
                isAdded=true;
            }else System.out.println("Cannot continue classes");
        }else System.out.println("Invalid documents");
        return isAdded;
    }

    @Override
    public void getDetails() {
        for(Trainee trainee:trainee){
            System.out.println(trainee);
        }

    }

    @Override
    public void updateDetails(String duration) {
        boolean isUpdated=false;
       // trainee.setDuration(duration) ;
        isUpdated=true;

    }

    @Override
    public boolean deleteDetails() {
        this.trainee=null;
        return false;
    }
}
