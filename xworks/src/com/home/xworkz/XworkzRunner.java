package com.home.xworkz;

import com.home.xworkz.trainee.Trainee;
import com.home.xworkz.xworkz.Xworkz;
import com.home.xworkz.xworkz.impl.XworkzImpl;

public class XworkzRunner {
    public static void main(String[] args) {
        Trainee trainee=new Trainee();
        trainee.setTraineeName("Bhuvan");
        trainee.setAge(21);
        trainee.setDuration("4Months");
        trainee.setFees(25000.00);

        Xworkz training=new XworkzImpl();
       training.addTrainee(trainee);
        training.getDetails();
        training.updateDetails("5months");
        training.getDetails();
    }
}
