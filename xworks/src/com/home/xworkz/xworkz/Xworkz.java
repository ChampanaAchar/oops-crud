package com.home.xworkz.xworkz;

import com.home.xworkz.trainee.Trainee;

public interface Xworkz {
    boolean addTrainee(Trainee trainee);
    void getDetails();
    void updateDetails(String duration);
    boolean deleteDetails();
}
