/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Helper;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 98tae
 */
public class Helper_Validate {

    public static boolean isEmpty(JTextField txtValue, String msg) {
        String txt = txtValue.getText().trim();
        if (txt.length() == 0) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }
        txtValue.setBackground(Color.white);
        return false;
    }

    public static boolean isEmpty(JTextArea txtValue, String msg) {
        String txt = txtValue.getText().trim();
        if (txt.length() == 0) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }
        txtValue.setBackground(Color.white);
        return false;
    }

    public static boolean isEmpty(JPasswordField txtValue, String msg) {
        String txt = String.valueOf(txtValue.getPassword()).trim();
        if (txt.length() == 0) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.yellow);
            txtValue.requestFocus();
            return true;
        }
        txtValue.setBackground(Color.white);
        return false;
    }

    public static boolean isNotNumberScores(JTextField txtValue, String msg_Format, String msg_Domain) {
        String Number = String.valueOf(txtValue.getText());
        String pattern = "[0-9]{1}[.]{0,1}[0-9]{0,1}";
        if (!Number.matches(pattern)) {
            MyMessage.msgWarning(msg_Format);
            txtValue.setBackground(Color.YELLOW);
            txtValue.requestFocus();
            return true;
        }
        if (Double.parseDouble(Number) < 0 | Double.parseDouble(Number) > 10) {
            MyMessage.msgWarning(msg_Domain);
            txtValue.setBackground(Color.YELLOW);
            txtValue.requestFocus();
            return true;
        }
        String pattern2 = "[0-9]{1}[.]{1}";
        if (Number.matches(pattern2)) {
            MyMessage.msgWarning(msg_Format);
            txtValue.setBackground(Color.YELLOW);
            txtValue.requestFocus();
            return true;
        }

        txtValue.setBackground(Color.white);
        return false;

    }

    public static boolean isNotNumberPhone(JTextField txtValue, String msg) {
        String Number = String.valueOf(txtValue.getText());
        String pattern = "0[0-9]{8,15}";
        if (!Number.matches(pattern)) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.YELLOW);
            txtValue.requestFocus();
            return true;
        }

        txtValue.setBackground(Color.white);
        return false;
    }

    public static boolean isNotEmail(JTextField txtValue, String msg) {
        String Gmail = String.valueOf(txtValue.getText());
        String pattern = "^[a-zA-Z]\\w{2,}@\\w{2,}(\\.\\w{2,3}){1,2}$";
        if (!Gmail.matches(pattern)) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.YELLOW);
            txtValue.requestFocus();
            return true;
        }
        txtValue.setBackground(Color.white);
        return false;
    }

    public static boolean PassWordCheck(JTextField txtValue, String msg) {
        String CodeSTD = String.valueOf(txtValue.getText());
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        if (!CodeSTD.matches(pattern)) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.YELLOW);
            txtValue.requestFocus();
            return true;
        }

        txtValue.setBackground(Color.white);
        return false;
    }

    public static boolean focus_Errol(boolean boo, String msg, JTextField txtValue) {
        if (!boo) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.YELLOW);
            txtValue.requestFocus();
            return true;
        }
        txtValue.setBackground(Color.white);
        return false;
    }

    public static boolean RegexCheckisNumber(JTextField txtValue, String msg , String msg2) {
        String Number = String.valueOf(txtValue.getText());
        String pattern = "[0-9]{1,}";
        if (!Number.matches(pattern)) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.YELLOW);
            txtValue.requestFocus();
            return true;
        }
        if ( Integer.parseInt(Number) < 0) {
            if (!Number.matches(pattern)) {
            MyMessage.msgWarning(msg);
            txtValue.setBackground(Color.YELLOW);
            txtValue.requestFocus();
            return true;
        }
        txtValue.setBackground(Color.white);

        }
        return false;
    }
    }
        


