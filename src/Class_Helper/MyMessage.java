/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Helper;

import javax.swing.JOptionPane;

/**
 *
 * @author 98tae
 */
public class MyMessage {
    public static void msgTrue(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void msgFalse(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Lỗi",
                JOptionPane.ERROR_MESSAGE);
    }
    
    public static void msgWarning(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Cảnh báo",
                JOptionPane.WARNING_MESSAGE);
    }
    
    public static boolean question(String msg) {
        int choose = JOptionPane.showConfirmDialog(null, msg,
                "Question", JOptionPane.YES_NO_OPTION);
        return choose != JOptionPane.YES_OPTION;
    }
}
