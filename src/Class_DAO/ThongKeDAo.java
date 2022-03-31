/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_DAO;

import Class_Helper.Helper_Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import Class_Helper.XDate;

/**
 *
 * @author 98tae
 */
public class ThongKeDAo{
    Connection con ;
    public ThongKeDAo() {
        con = Helper_Connection.Connec();
    }
    

    public List<Object[]> getBangDiem(int maKH) {
        String sql = "{Call sp_BangDiem(?)}";
        List<Object[]> list = new ArrayList<>();
        try {
            PreparedStatement ptrs = con.prepareStatement(sql);
            ptrs.setInt(1, maKH);
            ResultSet rs = ptrs.executeQuery();
            while (rs.next()) {
                list.add(new Object[] {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getFloat(3)
                });
            }
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getLuongNguoiHoc() {
        String sql = "{Call sp_ThongKeNguoiHoc}";
        List<Object[]> list = new ArrayList<>();
        try {
            PreparedStatement ptrs = con.prepareStatement(sql);
            ResultSet rs = ptrs.executeQuery();
            while (rs.next()) {
                String dkSN = XDate.toString(XDate.toDate(rs.getString(3), "yyyy-MM-dd"), "dd/MM/yyyy");
                String dkMN = XDate.toString(XDate.toDate(rs.getString(4), "yyyy-MM-dd"), "dd/MM/yyyy");
                list.add(new Object[] {
                    rs.getString(1),
                    rs.getInt(2),
                    dkSN,
                    dkMN
                });
            }

            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getDiemChuyenDe() {
        String sql = "{Call sp_ThongKeDiem}";
        List<Object[]> list = new ArrayList<>();
        try {
            PreparedStatement ptrs = con.prepareStatement(sql);
            ResultSet rs = ptrs.executeQuery();
            while (rs.next()) {
                String dtb = String.format("%.2f", rs.getFloat(5));
                list.add(new Object[] {
                    rs.getString(1),
                    rs.getInt(2),
                    rs.getFloat(3),
                    rs.getFloat(4),
                    dtb
                });
            }
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getDoanhThu(int nam) {
        String sql = "{Call sp_ThongKeDoanhThu(?)}";
        List<Object[]> list = new ArrayList<>();
        try {
            PreparedStatement ptrs = con.prepareStatement(sql);
            ptrs.setInt(1, nam);
            ResultSet rs = ptrs.executeQuery();
            while (rs.next()) {
                list.add(new Object[] {
                    rs.getString(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getInt(7),
                    rs.getInt(5),
                    rs.getInt(6),
                    rs.getInt(4)
                });
            }
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
