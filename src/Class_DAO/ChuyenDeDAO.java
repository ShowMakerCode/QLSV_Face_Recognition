/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_DAO;

import Class_Entity.ChuyenDe;
import Class_Helper.Helper_Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.List;
import javax.mail.Header;

/**
 *
 * @author 98tae
 */
public class ChuyenDeDAO extends BaseDAO<ChuyenDe, String> {

    Connection con;
    List<ChuyenDe> list;

    public ChuyenDeDAO() {
        list = new ArrayList<>();
        con = Helper_Connection.Connec();

    }

    @Override
    public boolean Insert(ChuyenDe entity) throws Exception {
        String sql = "INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa)VALUES (?,?,?,?,?,?)";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setString(1, entity.getMaCD());
        ptrs.setString(2, entity.getTenCD());
        ptrs.setFloat(3, entity.getHocPhi());
        ptrs.setInt(4, entity.getThoiLuong());
        ptrs.setString(5, entity.getHinh());
        ptrs.setString(6, entity.getMoTa());
        return ptrs.executeUpdate() > 0;
    }

    @Override
    public boolean Update(ChuyenDe entity) throws Exception {
        String sql = "UPDATE ChuyenDe SET TenCD =?, HocPhi =?, ThoiLuong =?, Hinh =?, MoTa = ?\n"
                + "where MaCD = ?";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setString(6, entity.getMaCD());
        ptrs.setString(1, entity.getTenCD());
        ptrs.setFloat(2, entity.getHocPhi());
        ptrs.setInt(3, entity.getThoiLuong());
        ptrs.setString(4, entity.getHinh());
        ptrs.setString(5, entity.getMoTa());
        return ptrs.executeUpdate() > 0;
    }

    @Override
    public boolean Delete(String key) throws Exception {
        String sql = "DELETE FROM ChuyenDe\n"
                + "where MaCD = ?";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setString(1, key);
        return ptrs.executeUpdate() > 0;
    }

    @Override
    public List<ChuyenDe> SelectAll() throws Exception {
        list.clear();
        String sql = "select * from ChuyenDe";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            list.add(new ChuyenDe(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
        }
        return list;
    }

    @Override
    public ChuyenDe SelectByID(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<ChuyenDe> SelectBySQL(String sql, Object... arg) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
