/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Core;

import Class_DAO.ChuyenDeDAO;
import Class_DAO.KhoaHocDAO;
import Class_Helper.XImage;
import java.sql.*;
import Class_Helper.*;
import Class_Entity.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 98tae
 */
public class Window_QLKhoaHoc extends javax.swing.JFrame {

    /**
     * Creates new form Window_KhoaHoc
     */
    Connection con;
    DefaultComboBoxModel<ChuyenDe> model_CD;
    DefaultTableModel model_tbl;
    int numberTBL = 0;
    ArrayList<KhoaHoc> list_KhoaHoc;
    KhoaHoc khoahoc;
    KhoaHocDAO dao_kh;
    ChuyenDeDAO dao_cd;
    ArrayList<String> ghichuu;

    public Window_QLKhoaHoc() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtchuyenDe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txthocPhi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnguoiTao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtkhaiGiang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtthoiGio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtngayTao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtghiChu = new javax.swing.JTextArea();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnbackTofirst = new javax.swing.JButton();
        btnnexttoLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChuyenDe = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        cbbchuyenDe = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("Chuyên Đề");

        txtchuyenDe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtchuyenDe.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setText("Học Phí");

        jLabel4.setText("Người Tạo");

        jLabel5.setText("Khai Giảng");

        jLabel6.setText("Thời Lượng (Giờ)");

        jLabel7.setText("Ngày Tạo");

        jLabel8.setText("Ghi Chú");

        txtghiChu.setColumns(20);
        txtghiChu.setRows(5);
        jScrollPane1.setViewportView(txtghiChu);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnbackTofirst.setText("|<");
        btnbackTofirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackTofirstActionPerformed(evt);
            }
        });

        btnnexttoLast.setText(">|");
        btnnexttoLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnexttoLastActionPerformed(evt);
            }
        });

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txthocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtnguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtchuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtkhaiGiang, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtthoiGio, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnbackTofirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(21, 21, 21)
                .addComponent(btnNext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnexttoLast)
                .addGap(53, 53, 53))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, jLabel6, jLabel7, txtchuyenDe, txthocPhi, txtkhaiGiang, txtngayTao, txtnguoiTao, txtthoiGio});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtkhaiGiang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtthoiGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtngayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtchuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txthocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtnguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi)
                    .addComponent(btnBack)
                    .addComponent(btnbackTofirst)
                    .addComponent(btnnexttoLast)
                    .addComponent(btnNext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtchuyenDe, txthocPhi, txtkhaiGiang, txtngayTao, txtnguoiTao, txtthoiGio});

        jTabbedPane1.addTab("Cập Nhật", jPanel2);

        tblChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Thời Lượng", "Học Phí", "Khai Giảng", "Tạo Bởi", "Ngày Tạo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChuyenDeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblChuyenDe);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Danh Sách", jPanel3);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbbchuyenDe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbchuyenDeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbchuyenDe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cbbchuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Chuyên Đề");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (!CheckValidate()) {
            return;
        }
        String ngayKG = XDate.toString(XDate.toDate(this.txtkhaiGiang.getText(), "dd/MM/yyyy"), "MM/dd/yyyy");
        String NgayTao = XDate.toString(XDate.toDate(this.txtngayTao.getText(), "dd/MM/yyyy"), "MM/dd/yyyy");
        System.out.println(ngayKG + NgayTao);
        try {
            ChuyenDe cd_Add = (ChuyenDe) model_CD.getSelectedItem();
            if (dao_kh.Insert(new KhoaHoc(cd_Add.getMaCD(),
                    Integer.parseInt(txtthoiGio.getText()),
                    Float.parseFloat(txthocPhi.getText()),
                    ngayKG,
                    txtghiChu.getText(),
                    txtnguoiTao.getText(),
                    NgayTao))) {
                MyMessage.msgTrue("Thêm Thành Công");
                LoadDataToTable(cd_Add.getMaCD());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String ngayKG = XDate.toString(XDate.toDate(this.txtkhaiGiang.getText(), "dd/MM/yyyy"), "MM/dd/yyyy");
        String NgayTao = XDate.toString(XDate.toDate(this.txtngayTao.getText(), "dd/MM/yyyy"), "MM/dd/yyyy");
        int zed = tblChuyenDe.getSelectedRow();
        try {
            ChuyenDe cd_Add = (ChuyenDe) model_CD.getSelectedItem();
            if (dao_kh.Update(new KhoaHoc(cd_Add.getMaCD(),
                    Integer.parseInt(txtthoiGio.getText()),
                    Float.parseFloat(txthocPhi.getText()),
                    ngayKG,
                    txtghiChu.getText(),
                    txtnguoiTao.getText(),
                    NgayTao,
                    Integer.parseInt(tblChuyenDe.getValueAt(tblChuyenDe.getSelectedRow(), 0).toString())))) {
                MyMessage.msgTrue("Sửa Thành Công");
                LoadDataToTable(cd_Add.getMaCD());
                settext(zed);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            ChuyenDe cd_Add = (ChuyenDe) model_CD.getSelectedItem();
            if (dao_kh.Delete(tblChuyenDe.getValueAt(tblChuyenDe.getSelectedRow(), 0).toString())) {
                MyMessage.msgTrue("Xóa Thành Công");
                LoadDataToTable(cd_Add.getMaCD());
                resetText();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        resetText();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnbackTofirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackTofirstActionPerformed
        numberTBL = 0;
        settext(numberTBL);
    }//GEN-LAST:event_btnbackTofirstActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (numberTBL == 0) {
            numberTBL = tblChuyenDe.getRowCount();
        }
        numberTBL--;
        settext(numberTBL);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (numberTBL == tblChuyenDe.getRowCount() - 1) {
            numberTBL = -1;
        }
        numberTBL++;
        settext(numberTBL);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnnexttoLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnexttoLastActionPerformed
        numberTBL = tblChuyenDe.getRowCount() - 1;
        settext(numberTBL);
    }//GEN-LAST:event_btnnexttoLastActionPerformed

    private void cbbchuyenDeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbchuyenDeItemStateChanged
        if (Auth.user == null) {
            return;
        }
        txtnguoiTao.setText(Auth.user.getMaNV());
        ChuyenDe cd = (ChuyenDe) cbbchuyenDe.getSelectedItem();
        LoadDataToTable(cd.getMaCD());
        txtchuyenDe.setText(cd.getTenCD());
        LoadDataToTG_HP();
        if (tblChuyenDe.getRowCount() == 0) {
            resetText();
            return;
        }
        settext(0);
    }//GEN-LAST:event_cbbchuyenDeItemStateChanged

    private void tblChuyenDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChuyenDeMouseClicked
        int viTri = tblChuyenDe.getSelectedRow();
        if (viTri < 0) {
            return;
        }
        settext(viTri);
    }//GEN-LAST:event_tblChuyenDeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (!Auth.isManager()) {
            btnXoa.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void settext(int viTri) {
        txtkhaiGiang.setText(String.valueOf(tblChuyenDe.getValueAt(viTri, 3)));
        txthocPhi.setText(String.valueOf(tblChuyenDe.getValueAt(viTri, 2)));
        txtthoiGio.setText(String.valueOf(tblChuyenDe.getValueAt(viTri, 1)));
        txtnguoiTao.setText(String.valueOf(tblChuyenDe.getValueAt(viTri, 4)));
        txtngayTao.setText(String.valueOf(tblChuyenDe.getValueAt(viTri, 5)));
        txtghiChu.setText(ghichuu.get(viTri));

    }

    private boolean CheckValidate() {
        if (Helper_Validate.isEmpty(txtkhaiGiang, "Không Được Để Trống Mã Người Học")) {
            return false;
        }

        if (Helper_Validate.isEmpty(txtthoiGio, "Không Được Để Trống Ngày Sinh Người Học")) {
            return false;
        }
        if (Helper_Validate.isEmpty(txtnguoiTao, "Không Được Để Trống Gmail Người Học")) {
            return false;
        }
        if (Helper_Validate.isEmpty(txtngayTao, "Không Được Để Trống Số Điện Thoại Người Học")) {
            return false;
        }
        if (Helper_Validate.isEmpty(txtghiChu, "Không Được Để Trống Ghi Chú Người Học")) {
            return false;
        }

        return true;
    }

    private void resetText() {
        txtkhaiGiang.setText("");
        txtngayTao.setText("");
        txtghiChu.setText("");
    }

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
            java.util.logging.Logger.getLogger(Window_QLKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window_QLKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window_QLKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window_QLKhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window_QLKhoaHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnbackTofirst;
    private javax.swing.JButton btnnexttoLast;
    private javax.swing.JComboBox<String> cbbchuyenDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblChuyenDe;
    private javax.swing.JTextField txtchuyenDe;
    private javax.swing.JTextArea txtghiChu;
    private javax.swing.JTextField txthocPhi;
    private javax.swing.JTextField txtkhaiGiang;
    private javax.swing.JTextField txtngayTao;
    private javax.swing.JTextField txtnguoiTao;
    private javax.swing.JTextField txtthoiGio;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setTitle("Quản Lý Khóa Học");
        model_CD = (DefaultComboBoxModel) cbbchuyenDe.getModel();
        ghichuu = new ArrayList<>();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dao_kh = new KhoaHocDAO();
        dao_cd = new ChuyenDeDAO();
        khoahoc = new KhoaHoc();
        list_KhoaHoc = new ArrayList<>();
        model_tbl = (DefaultTableModel) tblChuyenDe.getModel();
        setLocationRelativeTo(null);
        this.setIconImage(XImage.AppImage());
        con = Helper_Connection.Connec();
        if (con != null) {
            LoadDataToComBoBox();
        }
        txtthoiGio.setEnabled(false);
        txthocPhi.setEnabled(false);
        txtnguoiTao.setEnabled(false);

    }

    private void LoadDataToComBoBox() {
        model_CD.removeAllElements();
        String Sql = "select * from ChuyenDe";
        List<ChuyenDe> listcd = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            while (rs.next()) {
                model_CD.addElement(new ChuyenDe(rs.getString(1), rs.getString(2),
                        rs.getFloat(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void LoadDataToTable(String MaCD) {
        model_tbl.setRowCount(0);
        try {
            ghichuu.clear();
            String sql = "select MaKH,ChuyenDe.ThoiLuong,ChuyenDe.HocPhi,\n"
                    + "	 CONVERT(varchar,NgayKG, 103) as NgayKG,MaNV, CONVERT(varchar, NgayTao, 103) as NgayTao,GhiChu\n"
                    + "  from ChuyenDe join KhoaHoc on ChuyenDe.MaCD = KhoaHoc.MaCD where ChuyenDe.MaCD = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, String.valueOf(MaCD));
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                model_tbl.addRow(new Object[]{rs.getString(1),
                    rs.getInt(2),
                    rs.getFloat(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)

                });
                ghichuu.add(rs.getString(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void LoadDataToTG_HP() {
        try {
            ChuyenDe cd = (ChuyenDe) model_CD.getSelectedItem();
            txthocPhi.setText(String.valueOf(cd.getHocPhi()));
            txtthoiGio.setText(String.valueOf(cd.getThoiLuong()));
        } catch (Exception ex) {
            Logger.getLogger(Window_QLKhoaHoc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
