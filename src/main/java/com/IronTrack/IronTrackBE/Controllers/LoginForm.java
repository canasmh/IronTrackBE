package com.IronTrack.IronTrackBE.Controllers;

import lombok.Getter;

@Getter
public class LoginForm {
    public String email;
    public String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
