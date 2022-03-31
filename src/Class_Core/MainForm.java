/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Core;

import Class_Entity.NguoiHoc;
import Class_Entity.NhanVien;
import Class_Helper.Auth;
import Class_Helper.Helper_Connection;
import Class_Helper.MyMessage;
import Class_Helper.XImage;
import Class_function.FameLoadingFaceID;
import Class_function.LoadDataFaceID;
import java.awt.Desktop;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import java.sql.*;
import javax.swing.ImageIcon;

/**
 *
 * @author 98tae
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    LoginForm login;
    MainForm mainform;
    WinDow_QlChuyenDe qlcd;
    Window_QLKhoaHoc qlkh;
    Window_QLNguoiHoc qlnh;
    Window_QlHocVien qlhv;
    FameLoadingFaceID gifload;
    public static Window_QLNhanVien qlnv;
    public static LoginForm logina;
    BaoCaoThongKe baocao;
    Connection con;

    public MainForm() {
        initComponents();
        init();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnChuyenDe = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnFaceID = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jlbTime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuDangNhap = new javax.swing.JMenuItem();
        mnuDangXuat = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuKetThuc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuChuyenDe = new javax.swing.JMenuItem();
        mnuKhoaHoc = new javax.swing.JMenuItem();
        mnuNguoiHoc = new javax.swing.JMenuItem();
        mnuHocVien = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnuNhanVien = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuBangDiem = new javax.swing.JMenuItem();
        mnuLuongNguoiHoc = new javax.swing.JMenuItem();
        mnuDiemChuyenDe = new javax.swing.JMenuItem();
        mnuDoanhThu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuHDSD = new javax.swing.JMenuItem();
        mnuInformation = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/log-out.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/turn-off.png"))); // NOI18N
        btnExit.setText("Kết thúc");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit);
        jToolBar1.add(jSeparator4);

        btnChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/e-learning.png"))); // NOI18N
        btnChuyenDe.setText("Chuyên Đề");
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyenDe.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChuyenDe);

        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/students.png"))); // NOI18N
        btnNguoiHoc.setText("Người Học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNguoiHoc);

        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/education.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa Học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhoaHoc);

        btnHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/graduated.png"))); // NOI18N
        btnHocVien.setText("Học Viên");
        btnHocVien.setFocusable(false);
        btnHocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocVien.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnHocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHocVien);
        jToolBar1.add(jSeparator3);
        jToolBar1.add(jSeparator5);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/protest.png"))); // NOI18N
        btnHuongDan.setText("Hướng Dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHuongDan);
        jToolBar1.add(jSeparator7);
        jToolBar1.add(jSeparator8);

        btnFaceID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/face-recognition.png"))); // NOI18N
        btnFaceID.setText("Tạo FaceID");
        btnFaceID.setFocusable(false);
        btnFaceID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFaceID.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFaceID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaceIDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFaceID);

        jButton1.setEnabled(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(2, 575, 2, 14));
        jButton1.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton1.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setText("jButton2");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMargin(new java.awt.Insets(11, 14, 0, 14));
        jButton2.setMaximumSize(new java.awt.Dimension(0, 0));
        jButton2.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Clock.png"))); // NOI18N

        jlbTime.setText("00:00:00");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bluetooh-connection.png"))); // NOI18N
        jLabel3.setText("Hệ Thống Đào Tạo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlbTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Hệ thống");

        mnuDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuDangNhap.setText("Đăng Nhập");
        mnuDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDangNhap);

        mnuDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuDangXuat.setText("Đăng Xuất");
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDangXuat);
        jMenu1.add(jSeparator2);

        mnuDoiMatKhau.setText("Đổi Mật Khẩu");
        mnuDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoiMatKhauActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDoiMatKhau);
        jMenu1.add(jSeparator1);

        mnuKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mnuKetThuc.setText("Kết Thúc");
        mnuKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKetThucActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKetThuc);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản Lý");

        mnuChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuChuyenDe.setText("Chuyên Đề");
        mnuChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });
        jMenu2.add(mnuChuyenDe);

        mnuKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuKhoaHoc.setText("Khóa Học");
        mnuKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        jMenu2.add(mnuKhoaHoc);

        mnuNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuNguoiHoc.setText("Người Học");
        mnuNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });
        jMenu2.add(mnuNguoiHoc);

        mnuHocVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuHocVien.setText("Học Viên");
        mnuHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
            }
        });
        jMenu2.add(mnuHocVien);
        jMenu2.add(jSeparator6);

        mnuNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuNhanVien.setText("Nhân Viên");
        mnuNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNhanVienActionPerformed(evt);
            }
        });
        jMenu2.add(mnuNhanVien);

        jMenuItem1.setText("Xóa FaceID");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống Kê");

        mnuBangDiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuBangDiem.setText("Bảng Điểm");
        mnuBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBangDiemActionPerformed(evt);
            }
        });
        jMenu3.add(mnuBangDiem);

        mnuLuongNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuLuongNguoiHoc.setText("Lượng người học");
        mnuLuongNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLuongNguoiHocActionPerformed(evt);
            }
        });
        jMenu3.add(mnuLuongNguoiHoc);

        mnuDiemChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuDiemChuyenDe.setText("Điểm Chuyên Đề");
        mnuDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDiemChuyenDeActionPerformed(evt);
            }
        });
        jMenu3.add(mnuDiemChuyenDe);

        mnuDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuDoanhThu.setText("Doanh Thu");
        mnuDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoanhThuActionPerformed(evt);
            }
        });
        jMenu3.add(mnuDoanhThu);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Trợ Giúp");

        mnuHDSD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnuHDSD.setText("Hướng Dẫn Sử Dụng");
        mnuHDSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        jMenu4.add(mnuHDSD);

        mnuInformation.setText("Giới Thiệu Sản Phẩm");
        mnuInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInformationActionPerformed(evt);
            }
        });
        jMenu4.add(mnuInformation);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoiMatKhauActionPerformed
        new changePassword().setVisible(true);
    }//GEN-LAST:event_mnuDoiMatKhauActionPerformed

    private void mnuKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKetThucActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuKetThucActionPerformed

    private void mnuNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNhanVienActionPerformed
        if (!Auth.isManager()) {
            MyMessage.msgFalse("Bạn Không Có Quyền Truy Cập");
            return;
        }
        qlnv.setVisible(true);
    }//GEN-LAST:event_mnuNhanVienActionPerformed

    private void mnuBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBangDiemActionPerformed
        baocao.selectTab(0);
        baocao.setVisible(true);
    }//GEN-LAST:event_mnuBangDiemActionPerformed

    private void mnuLuongNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLuongNguoiHocActionPerformed
        baocao.selectTab(1);
        baocao.setVisible(true);
    }//GEN-LAST:event_mnuLuongNguoiHocActionPerformed

    private void mnuDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDiemChuyenDeActionPerformed
        baocao.selectTab(2);
        baocao.setVisible(true);
    }//GEN-LAST:event_mnuDiemChuyenDeActionPerformed

    private void mnuDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoanhThuActionPerformed
        if (!Auth.isManager()) {
            MyMessage.msgFalse("Bạn Không Có Quyền Xem Doanh Thu");
            return;
        }
        baocao.selectTab(3);
        baocao.setVisible(true);
    }//GEN-LAST:event_mnuDoanhThuActionPerformed

    private void mnuInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInformationActionPerformed
        new Class_function.Information_Application(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_mnuInformationActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        dispose();
        Auth.user = null;
        reset_loginForm();
        login.setVisible(true);

    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDeActionPerformed
        if (qlcd.isVisible()) {
            qlcd.dispose();
        }
        qlcd = new WinDow_QlChuyenDe();
        qlcd.setVisible(true);
    }//GEN-LAST:event_btnChuyenDeActionPerformed

    private void btnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiHocActionPerformed
        if (qlnh.isVisible()) {
            qlnh.dispose();
        }
        qlnh = new Window_QLNguoiHoc();
        qlnh.setVisible(true);
    }//GEN-LAST:event_btnNguoiHocActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed
        if (qlkh.isVisible()) {
            qlkh.dispose();
        }
        qlkh = new Window_QLKhoaHoc();
        qlkh.setVisible(true);
    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void btnHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocVienActionPerformed
        if (qlhv.isVisible()) {
            qlhv.dispose();
        }
        qlhv = new Window_QlHocVien();
        qlhv.setVisible(true);
    }//GEN-LAST:event_btnHocVienActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        String path = ".\\src\\Class_Helper\\HDSD\\HDSD.html";
        try {
            Desktop.getDesktop().open(new File(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        taocaulenhBat("python 01_face_dataset.py", ".\\vbsbat\\dataset.bat");
        taocaulenhBat("python 02_face_training.py", ".\\vbsbat\\RunFaceTraning.bat");
        runHideBat("vbsbat\\dataset.bat", ".\\vbsbat\\data_set.vbs");
        runHideBat("vbsbat\\RunFaceTraning.bat", ".\\vbsbat\\RunFace_Traning.vbs");
        resetIDFace_Login();
        if (!Auth.isManager()) {
            mnuNhanVien.setEnabled(false);
        }
        String imgcon = ".\\src\\icon\\ezgif-5-7ee2894876.gif";
        File path = new File(imgcon);
        jButton2.setIcon(new ImageIcon(path.getAbsolutePath()));
    }//GEN-LAST:event_formWindowOpened

    private void btnFaceIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaceIDActionPerformed
        if (!IDFace_DangKy()) {
            return;
        }
        xWriteFile("", ".\\src\\Class_Helper\\Face-Detection-with-Name-Recognition\\return_IDFaceCheck.dat");
        new LoadDataFaceID().setVisible(true);
        String path = ".\\vbsbat\\data_set.vbs";
        try {
            Desktop.getDesktop().open(new File(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        DangKyLopTwo();
    }//GEN-LAST:event_btnFaceIDActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        File filex = new File(".\\src\\Class_Helper\\Face-Detection-with-Name-Recognition\\dataset");
        if (!filex.exists()) {
            filex.mkdirs();
        }
        File[] files = filex.listFiles();
        for (File f : files) {
            f.delete();
        }
        Delete_FaceID();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFaceID;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel jlbTime;
    private javax.swing.JMenuItem mnuBangDiem;
    private javax.swing.JMenuItem mnuChuyenDe;
    private javax.swing.JMenuItem mnuDangNhap;
    private javax.swing.JMenuItem mnuDangXuat;
    private javax.swing.JMenuItem mnuDiemChuyenDe;
    private javax.swing.JMenuItem mnuDoanhThu;
    private javax.swing.JMenuItem mnuDoiMatKhau;
    private javax.swing.JMenuItem mnuHDSD;
    private javax.swing.JMenuItem mnuHocVien;
    private javax.swing.JMenuItem mnuInformation;
    private javax.swing.JMenuItem mnuKetThuc;
    private javax.swing.JMenuItem mnuKhoaHoc;
    private javax.swing.JMenuItem mnuLuongNguoiHoc;
    private javax.swing.JMenuItem mnuNguoiHoc;
    private javax.swing.JMenuItem mnuNhanVien;
    // End of variables declaration//GEN-END:variables

    public void Time_run() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Date now = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat();
                    sdf.applyPattern("hh:mm:ss");
                    jlbTime.setText(sdf.format(now));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }

    private void init() {

        this.setIconImage(XImage.AppImage());
        setTitle("Dự Án Mẫu");
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        con = Helper_Connection.Connec();
        try {
            Time_run();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        qlcd = new WinDow_QlChuyenDe();
        qlkh = new Window_QLKhoaHoc();
        qlnh = new Window_QLNguoiHoc();
        qlhv = new Window_QlHocVien();
        qlnv = new Window_QLNhanVien();
        baocao = new BaoCaoThongKe();
        gifload = new FameLoadingFaceID();
        readerfile();
    }

    private void reset_loginForm() {
        login = new LoginForm();
    }

    private void resetIDFace_Login() {//làm thư mục idface.dat rỗng để python sinh mã code so sánh với hệ thống 
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(".\\src\\Class_Helper\\Face-Detection-with-Name-Recognition\\idface.dat"));
            bw.write("");
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private boolean IDFace_DangKy() {
        if (Auth.user == null) {
            return false;
        }
        String a = readerfile(); // lấy giá trị đã đăng ký ở file dat
        NhanVien nv = Auth.user;
        String sql = "select FaceID from Gmail_FaceID\n"
                + "where MANV = ?";
        try {
            PreparedStatement ptrs = con.prepareStatement(sql);
            ptrs.setString(1, nv.getMaNV());
            ResultSet rs = ptrs.executeQuery();
            if (rs.next()) {
                for (int i = 0; i < a.length(); i++) {
                    if (String.valueOf(rs.getInt(1)).equals(String.valueOf(a.charAt(i)))) { // nếu mã ở a giống với mã trong CSDL thì khoogn cho
                        MyMessage.msgFalse("Tài Khoản Của Bạn Đã Đăng Ký FaceID");
                        return false;
                    }
                }
                xWriteFile(String.valueOf(rs.getInt(1)), ".\\src\\Class_Helper\\Face-Detection-with-Name-Recognition\\registration.dat");//registration dùng để đọc số id đăng ký trong python
            } else {
                MyMessage.msgFalse("Tài Khoản Của Bạn Không Được Hỗ Trợ");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    private void xWriteFile(String x, String path) {
        try {
            File file = new File(path);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(x);
            WriteFile_forcheckingUpdateFaceIDs(x, true);
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void writeFile_nobolean(String x, String path) {
        try {
            File file = new File(path);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(x);
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void WriteFile_forcheckingUpdateFaceIDs(String x, boolean checkboleen) { // ghi dữ liệu vào checkid.dat
        try {
            File file = new File(".\\src\\Class_Helper\\Face-Detection-with-Name-Recognition\\check_ID.dat");
            FileWriter fw = new FileWriter(file, checkboleen);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(x);
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private String readerfile() { // đọc file check_id rồi trả về a với giá trị có trong file tương đương với mã id trong csdl
        FileReader fr = null;
        String a = "";
        try {
            fr = new FileReader(".\\src\\Class_Helper\\Face-Detection-with-Name-Recognition\\check_ID.dat");
            int i;
            while ((i = fr.read()) != -1) {
                a = a + String.valueOf((char) i);
            }
            return a;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    private void taocaulenhBat(String pathfile, String namefile) {
        try {
            File file = new File(".");
            String[] a = file.getCanonicalPath().split("\\\\"); // vì "\" là đặc biệt nên phải cắt đi 
            String stringArray[] = a; // đặt nó vào chuỗi
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < stringArray.length; i++) {
                sb.append("/" + stringArray[i]);  // sau khi chạy for ta có : /c/c
            }
            String str = sb.toString().substring(1); // đặt srt = sb ép striing và cắt đi gawjch đầu ta có c/c
            String x = "@echo off \n"
                    + str.replaceAll("/", "\ncd ") // thay thế chuỗi ký tự
                    + "\ncd src\n"
                    + "cd Class_Helper\n"
                    + "cd Face-Detection-with-Name-Recognition\n"
                    + "cls\n"
                    + pathfile
                    + "\n"
                    + "exit";
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(new File(namefile))); // chạy file set mặt
                bw.write(x);
                bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    bw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private void Delete_FaceID() {
        if (Auth.user == null) {
            return;
        }
        String textIDFace = readerfile();
        NhanVien nv = Auth.user;
        String sql = "select FaceID from Gmail_FaceID\n"
                + "where MANV = ?";
        try {
            PreparedStatement ptrs = con.prepareStatement(sql);
            ptrs.setString(1, nv.getMaNV());
            ResultSet rs = ptrs.executeQuery();
            if (rs.next()) {
                for (int i = 0; i < textIDFace.length(); i++) {
                    if (String.valueOf(rs.getInt(1)).equals(String.valueOf(textIDFace.charAt(i)))) {
                        textIDFace = textIDFace.replaceAll(String.valueOf(textIDFace.charAt(i)), "");// thay thế dữ liệu trong ng đăng ký bị xóa = ""
                        WriteFile_forcheckingUpdateFaceIDs(textIDFace, false);// ghi lại mã k trùng 
                        MyMessage.msgTrue("Xóa Thành Công");
                        writeFile_nobolean("NoData", ".\\src\\Class_Helper\\Face-Detection-with-Name-Recognition\\No_Face_reconginition.dat");// xóa thành công sẽ có nodata để đăng kí có thể check
                        return;
                    }
                }
                MyMessage.msgFalse("Tài Khoản Này Không Có FaceID Để Xóa");
            } else {
                MyMessage.msgFalse("Tài Khoản Của Bạn Không Được Hỗ Trợ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DangKyLopTwo() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                do {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dangky = quetFzaceId(); // liên tục đọc file nếu bên python đã quét đc 30 ảnh sẽ trả về đkythanhcong để so sánh bên java
                    if (dangky.equals("DangKyThanhCong")) {
                        try {
                            Thread.sleep(400);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        gifload.setVisible(true);
                        String path = ".\\vbsbat\\RunFace_Traning.vbs";// chạy file đăng ký
                        try {
                            Desktop.getDesktop().open(new File(path));
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        DangKyLopTwoo();
                        return;
                    }
                } while (true);
            }
        });
        thread.start();
    }

    public void DangKyLopTwoo() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                do {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String dangky = quetFzaceId();
                    if (dangky.equals("UpdateThanhCong")) { // file đăng ký chạy xong sẽ sinh ra đăng ký thành công để java so sánh và đóng trương trình
                        gifload.dispose();
                        MyMessage.msgTrue("Đăng Ký Hoàn Tất");
                        writeFile_nobolean("", ".\\src\\Class_Helper\\Face-Detection-with-Name-Recognition\\No_Face_reconginition.dat");// sau khi đăng ký
                        // sẽ làm rỗng file no_face để login hiểu là đã có gương mặt được đăng ký
                        return;
                    }
                } while (true);
            }
        });
        thread.start();
    }

    public String quetFzaceId() {//trả về giá trị tribg retun_iidfacecheck.dat
        try {
            FileInputStream fos = new FileInputStream(".\\src\\Class_Helper\\Face-Detection-with-Name-Recognition\\return_IDFaceCheck.dat");
            byte[] b = fos.readAllBytes();
            String txt = new String(b);
            return txt;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    private void runHideBat(String path, String pathfilesave) {
        try {
            String a = String.valueOf(new File(path).toURI().toURL());
            a = a.substring(6);
            String finalattacker = "main\n"
                    + "Sub main\n"
                    + "Set oShell = CreateObject (\"Wscript.Shell\") \n"
                    + "Dim strArgs\n"
                    + "strArgs = \"cmd /c " + a + "\"\n"
                    + "oShell.Run strArgs, 0, false\n"
                    + "End Sub";
            writeFile_nobolean(finalattacker, pathfilesave);
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

    }

}
