/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_DAO;

import Class_Entity.NhanVien;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

/**
 *
 * @author 98tae
 */
public class NhanVienDAO extends BaseDAO<NhanVien, String> {

    Connection con;
    List<NhanVien> listt;
    public NhanVienDAO() {
        listt = new ArrayList<>();
        con = Class_Helper.Helper_Connection.Connec();

    }

    @Override
    public boolean Insert(NhanVien entity) throws Exception {
        String sql = "insert into NhanVien values (?,?,?,?)";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setString(1, entity.getMaNV());
        ptrs.setString(2, entity.getMatKhau());
        ptrs.setString(3, entity.getHoTen());
        ptrs.setBoolean(4, entity.getVaiTro());
        return ptrs.executeUpdate() > 0;
    }

    @Override
    public boolean Update(NhanVien entity) throws Exception {
        String sql = "UPDATE NhanVien SET MatKhau = ?, HoTen = ?, VaiTro =?\n"
                + "where MaNV = ?";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setString(4, entity.getMaNV());
        ptrs.setString(1, entity.getMatKhau());
        ptrs.setString(2, entity.getHoTen());
        ptrs.setBoolean(3, entity.getVaiTro());
        return ptrs.executeUpdate() > 0;
    }

    @Override
    public boolean Delete(String key) throws Exception {
        String sql = "delete from NhanVien where MaNV = ?";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setString(1, key);
        return ptrs.executeUpdate() > 0;
    }

    @Override
    public List<NhanVien> SelectAll() throws Exception {
        listt.clear();
        String sql = "select * from NhanVien";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            listt.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4)));
        }
        return listt;
    }

    @Override
    public NhanVien SelectByID(String key) throws Exception {
        String sql = "select MatKhau , HoTen , VaiTro from NhanVien where MaNV = ?";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setString(1, key);
        ResultSet rs = ptrs.executeQuery();
        return new NhanVien(key, rs.getString(1), rs.getString(2), rs.getBoolean(3));
                
    }

    @Override
    protected List<NhanVien> SelectBySQL(String sql, Object... arg) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   


}
