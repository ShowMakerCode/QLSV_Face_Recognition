/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Helper;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
/**
 *
 * @author 98tae
 */
public class XImage {
    public static Image AppImage(){
       ImageIcon icon = new ImageIcon(".\\src\\icon\\fpt.png");
        return icon.getImage();
    }
    public static void save(File src){
         File dst = new File("logos", src.getName());
        //tạo thư mục logos nếu chưa tồn tại
        if (!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();
        }
        //copy file vào thư mục logos
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ImageIcon read(String fileName){
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
