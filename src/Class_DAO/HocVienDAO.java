/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_DAO;

import Class_Entity.HocVien;
import java.util.List;
import java.sql.*;
import Class_Helper.*;
import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public class HocVienDAO extends BaseDAO<HocVien, String> {

    Connection con;
    ArrayList<HocVien> list;

    public HocVienDAO() {
        con = Helper_Connection.Connec();
        list = new ArrayList<>();
    }

    @Override
    public boolean Insert(HocVien e) throws Exception {
        String sql = "INSERT INTO HocVien(MaKH, MaNH, Diem)VALUES (?,?,?)";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setInt(1, e.getMaKH());
        ptrs.setString(2, e.getMaNH());
        ptrs.setFloat(3, e.getDiem());
        return ptrs.executeUpdate() > 0;
    }

    @Override
    public boolean Update(HocVien e) throws Exception {
        String sql = "UPDATE HocVien SET Diem =? WHERE  MaHV = ?";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setFloat(1, e.getDiem());
        ptrs.setInt(2, e.getMaHV());
        return ptrs.executeUpdate() > 0;
    }

    @Override
    public boolean Delete(String key) throws Exception {
        String sql = "DELETE FROM HocVien  WHERE  MaHV = ?";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setInt(1, Integer.parseInt(key));
        return ptrs.executeUpdate() > 0;

    }

    @Override
    public List<HocVien> SelectAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HocVien SelectByID(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<HocVien> SelectBySQL(String sql, Object... arg) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
