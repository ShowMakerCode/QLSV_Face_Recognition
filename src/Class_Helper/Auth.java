/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Helper;

import Class_Entity.NhanVien;

/**
 *
 * @author 98tae
 */
public class Auth {
    public static NhanVien user = null;
    public static void Clearn(){
    Auth.user = null;
    }
    public static boolean isLogin(){
        return Auth.user != null;
    }
    
    public static boolean isManager(){
        return Auth.isLogin()&&user.getVaiTro();
    
    }
}
