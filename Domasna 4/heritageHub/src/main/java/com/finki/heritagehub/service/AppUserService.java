package com.finki.heritagehub.service;

import com.finki.heritagehub.model.AppUser;
import com.finki.heritagehub.model.RoleUser;

import java.util.List;

public interface AppUserService {
    AppUser create(String username, String email, String password, RoleUser role, String token);
    AppUser findByUsername(String username);
    AppUser findByEmail(String email);
    List<AppUser> listAll();
    AppUser login(String username, String password);
    boolean confirmRegistration(String token);

    void setNewToken(String token, String email);
}
