/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Entity;

import java.io.Serializable;

/**
 *
 * @author 98tae
 */
public class Remember_Password implements Serializable{
    private String user,pass;
    private int tick;

    public Remember_Password() {
    }

    public Remember_Password(String user, String pass, int tick) {
        this.user = user;
        this.pass = pass;
        this.tick = tick;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }

   
}
