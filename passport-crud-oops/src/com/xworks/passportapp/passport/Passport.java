package com.xworks.passportapp.passport;

import com.xworks.passportapp.user.User;

public interface Passport {
    boolean createPassport(User user);
    void getDetails();
    boolean updateDetails(String place);
    boolean deleteDetails();
}
