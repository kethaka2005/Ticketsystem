package com.oop.cw.Backend.Controller.UsersComtroller;

import com.oop.cw.Backend.Model.Users.UserCredentials;
import com.oop.cw.Backend.Service.Response;

public interface UserController {

    Response register(UserCredentials userCredentials);

    Response login(UserCredentials userCredentials);

    Response changePassword(UserCredentials userCredentials);

    Response deleteAccount(UserCredentials userCredentials);

}
