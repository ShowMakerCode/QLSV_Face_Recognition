/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_DAO;

import Class_Entity.KhoaHoc;
import java.util.ArrayList;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author 98tae
 */
public class KhoaHocDAO extends BaseDAO<KhoaHoc, String> {

    Connection con;
    List<KhoaHoc> listt;

    public KhoaHocDAO() {
        listt = new ArrayList<>();
        con = Class_Helper.Helper_Connection.Connec();

    }

    @Override
    public boolean Insert(KhoaHoc entity) throws Exception {
        String sql = "INSERT INTO KhoaHoc( MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao)VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setString(1, entity.getMaCD());
        ptrs.setFloat(2, entity.getHocPhi());
        ptrs.setInt(3, entity.getThoiLuong());
        ptrs.setString(4, entity.getNgayKG());
        ptrs.setString(5, entity.getGhiChu());
        ptrs.setString(6, entity.getMaNV());
        ptrs.setString(7, entity.getNgayTao());
        return ptrs.executeUpdate() > 0;
    }

    @Override
    public boolean Update(KhoaHoc entity) throws Exception {
        String sql = "UPDATE KhoaHoc SET  MaCD = ?, HocPhi = ?,"
                + " ThoiLuong = ?, NgayKG = ?, GhiChu = ?, MaNV = ?,"
                + " NgayTao = ?\n"
                + "where MaKH = ?";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setString(1, entity.getMaCD());
        ptrs.setFloat(2, entity.getHocPhi());
        ptrs.setInt(3, entity.getThoiLuong());
        ptrs.setString(4, entity.getNgayKG());
        ptrs.setString(5, entity.getGhiChu());
        ptrs.setString(6, entity.getMaNV());
        ptrs.setString(7, entity.getNgayTao());
        ptrs.setInt(8, entity.getMaKH());
        return ptrs.executeUpdate() > 0;
    }

    @Override
    public boolean Delete(String key) throws Exception {
        String sql = "DELETE FROM KhoaHoc\n"
                + "where MaKH = ?";
        PreparedStatement ptrs = con.prepareStatement(sql);
        ptrs.setString(1, key);
        return ptrs.executeUpdate() > 0;

    }

    @Override
    public List<KhoaHoc> SelectAll() throws Exception {
        String sql = "SELECT MaCD, ThoiLuong, HocPhi, convert(varchar, NgayKG, 103) as NgayKG,"
                + " GhiChu, MaNV,convert(varchar, NgayTao, 103) as NgayTao, MaKH\n"
                + "FROM  KhoaHoc";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            listt.add(new KhoaHoc(rs.getString(1),
                    rs.getInt(2),
                    rs.getFloat(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getInt(8)));
        }
        return listt;
    }

    @Override
    public KhoaHoc SelectByID(String key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Integer> selectYears() throws SQLException {
        String sql = "SELECT DISTINCT year(NgayKG) as [Year] FROM KhoaHoc ORDER BY [Year] DESC";
        List<Integer> list = new ArrayList<>();
        try {
            PreparedStatement pt = con.prepareStatement(sql);
            ResultSet rs = pt.executeQuery();
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();

            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    

    @Override
    protected List<KhoaHoc> SelectBySQL(String sql, Object... arg) throws Exception {
        listt.clear();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            listt.add(new KhoaHoc(rs.getString(1),
                    rs.getInt(2),
                    rs.getFloat(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getInt(8)));
        }
        return listt;
    }

}
