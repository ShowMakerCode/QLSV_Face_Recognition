/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Entity;

/**
 *
 * @author 98tae
 */
public class BangDiem {
    private String bangDiem,maNH,hoTen,xepLoai;
    private float diem;

    public BangDiem() {
    }

    public BangDiem(String bangDiem, String maNH, String hoTen, String xepLoai, float diem) {
        this.bangDiem = bangDiem;
        this.maNH = maNH;
        this.hoTen = hoTen;
        this.xepLoai = xepLoai;
        this.diem = diem;
    }

    public String getBangDiem() {
        return bangDiem;
    }

    public void setBangDiem(String bangDiem) {
        this.bangDiem = bangDiem;
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getXepLoai() {
        if (this.diem >= 9 ) {
            xepLoai = "Xuất Sắc";
        }else if (this.diem >= 8 ) {
            xepLoai = "Giỏi";
        }else if (this.diem >= 7) {
            xepLoai = "Khá";
        }else if (this.diem >= 5 ) {
            xepLoai = "Trung Bình";
        }else {
            xepLoai= "Yếu";
        }
        return xepLoai;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
    
}
