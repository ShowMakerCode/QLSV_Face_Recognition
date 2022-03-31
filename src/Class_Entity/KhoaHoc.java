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
public class KhoaHoc {
    private int maKH;
    private String maCD;
    private int thoiLuong;
    private float hocPhi;
    private String ngayKG;
    private String ghiChu;
    private String maNV;
    private String ngayTao;

    public KhoaHoc() {
    }

    public KhoaHoc(String maCD, int thoiLuong, float hocPhi, String ngayKG, String ghiChu, String maNV, String ngayTao,int maKH) {
        this.maKH = maKH;
        this.maCD = maCD;
        this.thoiLuong = thoiLuong;
        this.hocPhi = hocPhi;
        this.ngayKG = ngayKG;
        this.ghiChu = ghiChu;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
    }

    public KhoaHoc(String maCD, int thoiLuong, float hocPhi, String ngayKG, String ghiChu, String maNV, String ngayTao) {
        this.maCD = maCD;
        this.thoiLuong = thoiLuong;
        this.hocPhi = hocPhi;
        this.ngayKG = ngayKG;
        this.ghiChu = ghiChu;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return String.valueOf(maKH) ;
    }
    
    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public String getNgayKG() {
        return ngayKG;
    }

    public void setNgayKG(String ngayKG) {
        this.ngayKG = ngayKG;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

   
    
}
