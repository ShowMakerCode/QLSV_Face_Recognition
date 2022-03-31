/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_DAO;

import Class_Entity.NguoiHoc;
import Class_Helper.Helper_Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author 98tae
 */
public class NguoiHocDao extends BaseDAO<NguoiHoc, String> {

    List<NguoiHoc> list;
    Connection con;

    public NguoiHocDao() {
        list = new ArrayList<>();
        con = Helper_Connection.Connec();
    }

    @Override
    public boolean Insert(NguoiHoc e) throws Exception {
        String sql = "INSERT INTO NguoiHoc"
                + " (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV, NgayDK)\n"
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pt = con.prepareStatement(sql);
        pt.setString(1, e.getMaNH());
        pt.setString(2, e.getHoTen());
        pt.setString(3, e.getNgaySinh());
        pt.setBoolean(4, e.getGioiTinh());
        pt.setString(5, e.getDienThoai());
        pt.setString(6, e.getEmail());
        pt.setString(7, e.getGhiChu());
        pt.setString(8, e.getMaNV());
        pt.setString(9, e.getNgayDK());
        return pt.executeUpdate() > 0;
    }

    @Override
    public boolean Update(NguoiHoc e) throws Exception {
        String sql = "UPDATE NguoiHoc SET  HoTen = ?,"
                + " NgaySinh =?, GioiTinh =?,"
                + " DienThoai =?, Email =?, GhiChu =?, MaNV =? , NgayDK = ?\n"
                + "where MaNH = ?";
        PreparedStatement pt = con.prepareStatement(sql);
        pt.setString(9, e.getMaNH());
        pt.setString(1, e.getHoTen());
        pt.setString(2, e.getNgaySinh());
        pt.setBoolean(3, e.getGioiTinh());
        pt.setString(4, e.getDienThoai());
        pt.setString(5, e.getEmail());
        pt.setString(6, e.getGhiChu());
        pt.setString(7, e.getMaNV());
        pt.setString(8, e.getNgayDK());
        return pt.executeUpdate() > 0;
    }

    @Override
    public boolean Delete(String key) throws Exception {
        String sql = "DELETE FROM NguoiHoc\n"
                + "where MaNH = ?";
        PreparedStatement pt = con.prepareStatement(sql);
        pt.setString(1, key);
        return pt.executeUpdate() > 0;
    }

    @Override
    public List<NguoiHoc> SelectAll() throws Exception {
        list.clear();

        String sql = "SELECT MaNH, HoTen, CONVERT(varchar, NgaySinh, 103) as NgaySinh, "
                + "GioiTinh, Email, DienThoai, GhiChu, MaNV,CONVERT(varchar, NgayDK, 103) as NgayDK\n"
                + "FROM   NguoiHoc";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            list.add(new NguoiHoc(rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getBoolean(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
        }
        return list;
    }

    
    @Override
    public NguoiHoc SelectByID(String key) throws Exception {
        String sql = "Select * FROM NguoiHoc\n"
                + "where MaNH = ?";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setString(1, key);
        ResultSet rs = ptrs.executeQuery();
        return new NguoiHoc(rs.getString(1), rs.getString(2), rs.getString(3),
                rs.getBoolean(4), rs.getString(5),
                rs.getString(6), rs.getString(7),
                rs.getString(8),
                rs.getString(9));
    }

    @Override
    protected List<NguoiHoc> SelectBySQL(String sql, Object... arg) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
