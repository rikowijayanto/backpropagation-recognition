package backrpopagation_huruf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.StrictMath.exp;
import javax.swing.JOptionPane;

public class Training extends javax.swing.JFrame {
        int n=0;
        Object  inputS[]=new Object[63];
        Object inputT[]=new Object[7];
        double biastestY [] = new double [7];
        int [][] x = new int [63][26]; //nilai input
        double[] y= new double[7]; //nilai y
        double [] biasY=new double[7]; //bias output
        double [] y_inK = new double [7];
        double wtest [][];
        double vtest[][];
        double biastestZ[];
        int [][] t = new int [7][26];
        double [] faktorK = new double[7];
        double[] delta_biasY=new double[7]; //delta bias output
        double alpha;
        int iterasi;
        String Huruf[]=new String[26];
        int p;
        int hidden;
        boolean biner=false;
        
    public Training() {
        setTitle("Training");
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
                (screenSize.width - frameSize.width)/2,
               ( screenSize.height - frameSize.height)/2);
       JOptionPane.showMessageDialog(null, "Program ini hanya bisa menggunakan satu \nmasukan unit hidden hingga akhir dan satu jenis \nfungsi aktivasi", "PERINGATAN", HEIGHT);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tr63 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        tr1 = new javax.swing.JToggleButton();
        tr2 = new javax.swing.JToggleButton();
        tr3 = new javax.swing.JToggleButton();
        tr4 = new javax.swing.JToggleButton();
        tr5 = new javax.swing.JToggleButton();
        tr6 = new javax.swing.JToggleButton();
        tr7 = new javax.swing.JToggleButton();
        tr8 = new javax.swing.JToggleButton();
        tr9 = new javax.swing.JToggleButton();
        tr10 = new javax.swing.JToggleButton();
        tr11 = new javax.swing.JToggleButton();
        tr12 = new javax.swing.JToggleButton();
        tr13 = new javax.swing.JToggleButton();
        tr14 = new javax.swing.JToggleButton();
        tr15 = new javax.swing.JToggleButton();
        tr16 = new javax.swing.JToggleButton();
        tr17 = new javax.swing.JToggleButton();
        tr18 = new javax.swing.JToggleButton();
        tr19 = new javax.swing.JToggleButton();
        tr20 = new javax.swing.JToggleButton();
        tr21 = new javax.swing.JToggleButton();
        tr22 = new javax.swing.JToggleButton();
        tr23 = new javax.swing.JToggleButton();
        tr24 = new javax.swing.JToggleButton();
        tr25 = new javax.swing.JToggleButton();
        tr26 = new javax.swing.JToggleButton();
        tr27 = new javax.swing.JToggleButton();
        tr28 = new javax.swing.JToggleButton();
        tr29 = new javax.swing.JToggleButton();
        tr30 = new javax.swing.JToggleButton();
        tr31 = new javax.swing.JToggleButton();
        tr32 = new javax.swing.JToggleButton();
        tr33 = new javax.swing.JToggleButton();
        tr34 = new javax.swing.JToggleButton();
        tr35 = new javax.swing.JToggleButton();
        tr36 = new javax.swing.JToggleButton();
        tr37 = new javax.swing.JToggleButton();
        tr38 = new javax.swing.JToggleButton();
        tr39 = new javax.swing.JToggleButton();
        tr40 = new javax.swing.JToggleButton();
        tr41 = new javax.swing.JToggleButton();
        tr42 = new javax.swing.JToggleButton();
        tr43 = new javax.swing.JToggleButton();
        tr44 = new javax.swing.JToggleButton();
        tr45 = new javax.swing.JToggleButton();
        tr46 = new javax.swing.JToggleButton();
        tr47 = new javax.swing.JToggleButton();
        tr48 = new javax.swing.JToggleButton();
        tr49 = new javax.swing.JToggleButton();
        tr50 = new javax.swing.JToggleButton();
        tr51 = new javax.swing.JToggleButton();
        tr52 = new javax.swing.JToggleButton();
        tr53 = new javax.swing.JToggleButton();
        tr54 = new javax.swing.JToggleButton();
        tr55 = new javax.swing.JToggleButton();
        tr56 = new javax.swing.JToggleButton();
        tr57 = new javax.swing.JToggleButton();
        tr58 = new javax.swing.JToggleButton();
        tr59 = new javax.swing.JToggleButton();
        tr60 = new javax.swing.JToggleButton();
        tr61 = new javax.swing.JToggleButton();
        tr62 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t7 = new javax.swing.JToggleButton();
        t1 = new javax.swing.JToggleButton();
        t2 = new javax.swing.JToggleButton();
        t3 = new javax.swing.JToggleButton();
        t4 = new javax.swing.JToggleButton();
        t5 = new javax.swing.JToggleButton();
        t6 = new javax.swing.JToggleButton();
        tr_huruf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tr_clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tr_alpha1 = new javax.swing.JTextField();
        tr_iterasi = new javax.swing.JTextField();
        tr_hidden = new javax.swing.JTextField();
        tr_training = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tr_save = new javax.swing.JButton();
        radio_biner = new javax.swing.JRadioButton();
        radio_bipolar = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Training - Pengenalan Huruf");
        setBackground(new java.awt.Color(0, 0, 153));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane4MouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backpropagation_gambar/LOGO.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Nexa Black", 1, 26)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("ALPHABET RECOGNITION PROGRAM");

        jLabel19.setFont(new java.awt.Font("Nexa Regular", 0, 14)); // NOI18N
        jLabel19.setText("Menggunakan Algoritma Backpropagation (1 Layer Pada Hidden)");

        jLabel20.setFont(new java.awt.Font("Nexa Light", 1, 14)); // NOI18N
        jLabel20.setText("Departemen Matematika");

        jLabel21.setFont(new java.awt.Font("Nexa Light", 1, 14)); // NOI18N
        jLabel21.setText("Fakultas Matematika, Komputasi, Sains Data");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 255));
        jLabel25.setText("Oleh :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setText(" Riko Wijayanto   061111540000010");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 255));
        jLabel27.setText(" Ayu Ni'matul F.   061115400000013");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backpropagation_gambar/MATITS.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Nexa Light", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Institut Teknologi Sepuluh Nopember");

        jLabel29.setFont(new java.awt.Font("Nexa Light", 0, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("2018");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel17))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel28)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel27)))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(266, 266, 266)
                                        .addComponent(jLabel24)))
                                .addGap(268, 268, 268))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(jLabel21))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel19)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addGap(365, 365, 365))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(160, 160, 160))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(3, 3, 3)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28))
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jLabel24))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("HOME", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(576, 633));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 2));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(java.awt.Color.blue);
        jLabel6.setText("PROGRAM PENGENALAN HURUF");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.blue);
        jLabel7.setText("TRAINING MODE - BACKPROPAGATION");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("Institut Teknologi Sepuluh Nopember Surabaya");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backpropagation_gambar/lambang-its-png-v1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tr63.setBackground(java.awt.Color.green);
        tr63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr63.setText("F");
        tr63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr63ActionPerformed(evt);
            }
        });
        jPanel1.add(tr63, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pola Huruf");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        tr1.setBackground(java.awt.Color.green);
        tr1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr1.setText("F");
        tr1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr1ActionPerformed(evt);
            }
        });
        jPanel1.add(tr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 30, 30));

        tr2.setBackground(java.awt.Color.green);
        tr2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr2.setText("F");
        tr2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr2ActionPerformed(evt);
            }
        });
        jPanel1.add(tr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, 30));

        tr3.setBackground(java.awt.Color.green);
        tr3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr3.setText("F");
        tr3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr3ActionPerformed(evt);
            }
        });
        jPanel1.add(tr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 30, 30));

        tr4.setBackground(java.awt.Color.green);
        tr4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr4.setText("F");
        tr4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr4ActionPerformed(evt);
            }
        });
        jPanel1.add(tr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 30, 30));

        tr5.setBackground(java.awt.Color.green);
        tr5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr5.setText("F");
        tr5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr5ActionPerformed(evt);
            }
        });
        jPanel1.add(tr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 30, 30));

        tr6.setBackground(java.awt.Color.green);
        tr6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr6.setText("F");
        tr6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr6ActionPerformed(evt);
            }
        });
        jPanel1.add(tr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 30, 30));

        tr7.setBackground(java.awt.Color.green);
        tr7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr7.setText("F");
        tr7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr7ActionPerformed(evt);
            }
        });
        jPanel1.add(tr7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 30, 30));

        tr8.setBackground(java.awt.Color.green);
        tr8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr8.setText("F");
        tr8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr8ActionPerformed(evt);
            }
        });
        jPanel1.add(tr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, 30));

        tr9.setBackground(java.awt.Color.green);
        tr9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr9.setText("F");
        tr9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr9ActionPerformed(evt);
            }
        });
        jPanel1.add(tr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 30, 30));

        tr10.setBackground(java.awt.Color.green);
        tr10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr10.setText("F");
        tr10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr10ActionPerformed(evt);
            }
        });
        jPanel1.add(tr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 30, 30));

        tr11.setBackground(java.awt.Color.green);
        tr11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr11.setText("F");
        tr11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr11ActionPerformed(evt);
            }
        });
        jPanel1.add(tr11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 30, 30));

        tr12.setBackground(java.awt.Color.green);
        tr12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr12.setText("F");
        tr12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr12ActionPerformed(evt);
            }
        });
        jPanel1.add(tr12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 30, 30));

        tr13.setBackground(java.awt.Color.green);
        tr13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr13.setText("F");
        tr13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr13ActionPerformed(evt);
            }
        });
        jPanel1.add(tr13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 30, 30));

        tr14.setBackground(java.awt.Color.green);
        tr14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr14.setText("F");
        tr14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr14ActionPerformed(evt);
            }
        });
        jPanel1.add(tr14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, 30));

        tr15.setBackground(java.awt.Color.green);
        tr15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr15.setText("F");
        tr15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr15ActionPerformed(evt);
            }
        });
        jPanel1.add(tr15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 30, 30));

        tr16.setBackground(java.awt.Color.green);
        tr16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr16.setText("F");
        tr16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr16ActionPerformed(evt);
            }
        });
        jPanel1.add(tr16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 30, 30));

        tr17.setBackground(java.awt.Color.green);
        tr17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr17.setText("F");
        tr17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr17ActionPerformed(evt);
            }
        });
        jPanel1.add(tr17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 30, 30));

        tr18.setBackground(java.awt.Color.green);
        tr18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr18.setText("F");
        tr18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr18ActionPerformed(evt);
            }
        });
        jPanel1.add(tr18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 30, 30));

        tr19.setBackground(java.awt.Color.green);
        tr19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr19.setText("F");
        tr19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr19ActionPerformed(evt);
            }
        });
        jPanel1.add(tr19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 30, 30));

        tr20.setBackground(java.awt.Color.green);
        tr20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr20.setText("F");
        tr20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr20ActionPerformed(evt);
            }
        });
        jPanel1.add(tr20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 30, 30));

        tr21.setBackground(java.awt.Color.green);
        tr21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr21.setText("F");
        tr21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr21ActionPerformed(evt);
            }
        });
        jPanel1.add(tr21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 30, 30));

        tr22.setBackground(java.awt.Color.green);
        tr22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr22.setText("F");
        tr22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr22ActionPerformed(evt);
            }
        });
        jPanel1.add(tr22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 30, 30));

        tr23.setBackground(java.awt.Color.green);
        tr23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr23.setText("F");
        tr23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr23ActionPerformed(evt);
            }
        });
        jPanel1.add(tr23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 30, 30));

        tr24.setBackground(java.awt.Color.green);
        tr24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr24.setText("F");
        tr24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr24ActionPerformed(evt);
            }
        });
        jPanel1.add(tr24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 30, 30));

        tr25.setBackground(java.awt.Color.green);
        tr25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr25.setText("F");
        tr25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr25ActionPerformed(evt);
            }
        });
        jPanel1.add(tr25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 30, 30));

        tr26.setBackground(java.awt.Color.green);
        tr26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr26.setText("F");
        tr26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr26ActionPerformed(evt);
            }
        });
        jPanel1.add(tr26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 30, 30));

        tr27.setBackground(java.awt.Color.green);
        tr27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr27.setText("F");
        tr27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr27ActionPerformed(evt);
            }
        });
        jPanel1.add(tr27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 30, 30));

        tr28.setBackground(java.awt.Color.green);
        tr28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr28.setText("F");
        tr28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr28ActionPerformed(evt);
            }
        });
        jPanel1.add(tr28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 30, 30));

        tr29.setBackground(java.awt.Color.green);
        tr29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr29.setText("F");
        tr29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr29ActionPerformed(evt);
            }
        });
        jPanel1.add(tr29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 30, 30));

        tr30.setBackground(java.awt.Color.green);
        tr30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr30.setText("F");
        tr30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr30ActionPerformed(evt);
            }
        });
        jPanel1.add(tr30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 30, 30));

        tr31.setBackground(java.awt.Color.green);
        tr31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr31.setText("F");
        tr31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr31ActionPerformed(evt);
            }
        });
        jPanel1.add(tr31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 30, 30));

        tr32.setBackground(java.awt.Color.green);
        tr32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr32.setText("F");
        tr32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr32ActionPerformed(evt);
            }
        });
        jPanel1.add(tr32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 30, 30));

        tr33.setBackground(java.awt.Color.green);
        tr33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr33.setText("F");
        tr33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr33ActionPerformed(evt);
            }
        });
        jPanel1.add(tr33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 30, 30));

        tr34.setBackground(java.awt.Color.green);
        tr34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr34.setText("F");
        tr34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr34ActionPerformed(evt);
            }
        });
        jPanel1.add(tr34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 30, 30));

        tr35.setBackground(java.awt.Color.green);
        tr35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr35.setText("F");
        tr35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr35ActionPerformed(evt);
            }
        });
        jPanel1.add(tr35, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 30, 30));

        tr36.setBackground(java.awt.Color.green);
        tr36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr36.setText("F");
        tr36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr36ActionPerformed(evt);
            }
        });
        jPanel1.add(tr36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 30, 30));

        tr37.setBackground(java.awt.Color.green);
        tr37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr37.setText("F");
        tr37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr37ActionPerformed(evt);
            }
        });
        jPanel1.add(tr37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 30, 30));

        tr38.setBackground(java.awt.Color.green);
        tr38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr38.setText("F");
        tr38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr38ActionPerformed(evt);
            }
        });
        jPanel1.add(tr38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 30, 30));

        tr39.setBackground(java.awt.Color.green);
        tr39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr39.setText("F");
        tr39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr39ActionPerformed(evt);
            }
        });
        jPanel1.add(tr39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 30, 30));

        tr40.setBackground(java.awt.Color.green);
        tr40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr40.setText("F");
        tr40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr40ActionPerformed(evt);
            }
        });
        jPanel1.add(tr40, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 30, 30));

        tr41.setBackground(java.awt.Color.green);
        tr41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr41.setText("F");
        tr41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr41ActionPerformed(evt);
            }
        });
        jPanel1.add(tr41, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 30, 30));

        tr42.setBackground(java.awt.Color.green);
        tr42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr42.setText("F");
        tr42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr42ActionPerformed(evt);
            }
        });
        jPanel1.add(tr42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 30, 30));

        tr43.setBackground(java.awt.Color.green);
        tr43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr43.setText("F");
        tr43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr43ActionPerformed(evt);
            }
        });
        jPanel1.add(tr43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 30, 30));

        tr44.setBackground(java.awt.Color.green);
        tr44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr44.setText("F");
        tr44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr44ActionPerformed(evt);
            }
        });
        jPanel1.add(tr44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 30, 30));

        tr45.setBackground(java.awt.Color.green);
        tr45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr45.setText("F");
        tr45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr45ActionPerformed(evt);
            }
        });
        jPanel1.add(tr45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 30, 30));

        tr46.setBackground(java.awt.Color.green);
        tr46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr46.setText("F");
        tr46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr46ActionPerformed(evt);
            }
        });
        jPanel1.add(tr46, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 30, 30));

        tr47.setBackground(java.awt.Color.green);
        tr47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr47.setText("F");
        tr47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr47ActionPerformed(evt);
            }
        });
        jPanel1.add(tr47, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 30, 30));

        tr48.setBackground(java.awt.Color.green);
        tr48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr48.setText("F");
        tr48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr48ActionPerformed(evt);
            }
        });
        jPanel1.add(tr48, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 30, 30));

        tr49.setBackground(java.awt.Color.green);
        tr49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr49.setText("F");
        tr49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr49ActionPerformed(evt);
            }
        });
        jPanel1.add(tr49, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 30, 30));

        tr50.setBackground(java.awt.Color.green);
        tr50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr50.setText("F");
        tr50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr50ActionPerformed(evt);
            }
        });
        jPanel1.add(tr50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 30, 30));

        tr51.setBackground(java.awt.Color.green);
        tr51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr51.setText("F");
        tr51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr51ActionPerformed(evt);
            }
        });
        jPanel1.add(tr51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 30, 30));

        tr52.setBackground(java.awt.Color.green);
        tr52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr52.setText("F");
        tr52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr52ActionPerformed(evt);
            }
        });
        jPanel1.add(tr52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 30, 30));

        tr53.setBackground(java.awt.Color.green);
        tr53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr53.setText("F");
        tr53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr53ActionPerformed(evt);
            }
        });
        jPanel1.add(tr53, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 30, 30));

        tr54.setBackground(java.awt.Color.green);
        tr54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr54.setText("F");
        tr54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr54ActionPerformed(evt);
            }
        });
        jPanel1.add(tr54, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 30, 30));

        tr55.setBackground(java.awt.Color.green);
        tr55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr55.setText("F");
        tr55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr55ActionPerformed(evt);
            }
        });
        jPanel1.add(tr55, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 30, 30));

        tr56.setBackground(java.awt.Color.green);
        tr56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr56.setText("F");
        tr56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr56ActionPerformed(evt);
            }
        });
        jPanel1.add(tr56, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 30, 30));

        tr57.setBackground(java.awt.Color.green);
        tr57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr57.setText("F");
        tr57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr57ActionPerformed(evt);
            }
        });
        jPanel1.add(tr57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 30, 30));

        tr58.setBackground(java.awt.Color.green);
        tr58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr58.setText("F");
        tr58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr58ActionPerformed(evt);
            }
        });
        jPanel1.add(tr58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 30, 30));

        tr59.setBackground(java.awt.Color.green);
        tr59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr59.setText("F");
        tr59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr59ActionPerformed(evt);
            }
        });
        jPanel1.add(tr59, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 30, 30));

        tr60.setBackground(java.awt.Color.green);
        tr60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr60.setText("F");
        tr60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr60ActionPerformed(evt);
            }
        });
        jPanel1.add(tr60, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 30, 30));

        tr61.setBackground(java.awt.Color.green);
        tr61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr61.setText("F");
        tr61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr61ActionPerformed(evt);
            }
        });
        jPanel1.add(tr61, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 30, 30));

        tr62.setBackground(java.awt.Color.green);
        tr62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr62.setText("F");
        tr62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tr62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr62ActionPerformed(evt);
            }
        });
        jPanel1.add(tr62, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 30, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Huruf");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        t7.setBackground(java.awt.Color.green);
        t7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t7.setText("F");
        t7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        jPanel2.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 30, 30));

        t1.setBackground(java.awt.Color.green);
        t1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t1.setText("F");
        t1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 30, 30));

        t2.setBackground(java.awt.Color.green);
        t2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t2.setText("F");
        t2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 30, 30));

        t3.setBackground(java.awt.Color.green);
        t3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t3.setText("F");
        t3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 30, 30));

        t4.setBackground(java.awt.Color.green);
        t4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t4.setText("F");
        t4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 30, 30));

        t5.setBackground(java.awt.Color.green);
        t5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t5.setText("F");
        t5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 30, 30));

        t6.setBackground(java.awt.Color.green);
        t6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        t6.setText("F");
        t6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        jPanel2.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 30, 30));

        tr_huruf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tr_huruf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tr_huruf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_hurufActionPerformed(evt);
            }
        });
        jPanel2.add(tr_huruf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 120, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Huruf :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("*Masukkan huruf yang sesuai");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        tr_clear.setBackground(new java.awt.Color(255, 255, 0));
        tr_clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr_clear.setText("REFRESH");
        tr_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tr_clearMouseClicked(evt);
            }
        });
        tr_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_clearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Iterasi :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Alpha :");

        tr_alpha1.setBackground(new java.awt.Color(204, 255, 255));
        tr_alpha1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tr_alpha1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tr_alpha1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        tr_alpha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_alpha1ActionPerformed(evt);
            }
        });

        tr_iterasi.setBackground(new java.awt.Color(204, 255, 255));
        tr_iterasi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tr_iterasi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tr_iterasi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        tr_iterasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_iterasiActionPerformed(evt);
            }
        });

        tr_hidden.setBackground(new java.awt.Color(204, 255, 255));
        tr_hidden.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tr_hidden.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tr_hidden.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        tr_hidden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_hiddenActionPerformed(evt);
            }
        });

        tr_training.setBackground(new java.awt.Color(255, 255, 0));
        tr_training.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tr_training.setText("TRAINING");
        tr_training.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tr_trainingMouseClicked(evt);
            }
        });
        tr_training.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_trainingActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Hidden :");

        tr_save.setBackground(new java.awt.Color(255, 0, 255));
        tr_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tr_save.setText("SIMPAN");
        tr_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tr_saveMouseClicked(evt);
            }
        });
        tr_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr_saveActionPerformed(evt);
            }
        });

        radio_biner.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radio_biner.setText("Biner");
        radio_biner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_binerActionPerformed(evt);
            }
        });

        radio_bipolar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radio_bipolar.setText("Bipolar");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("LAKUKAN TESTING");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18)
                                    .addComponent(tr_alpha1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tr_save)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(radio_bipolar)
                                                .addComponent(radio_biner)))))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(tr_training, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tr_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tr_iterasi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tr_hidden, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(radio_biner))
                            .addComponent(tr_hidden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(radio_bipolar))
                            .addComponent(tr_iterasi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tr_save)
                            .addComponent(tr_alpha1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tr_training, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(tr_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jTabbedPane4.addTab("PROGRAM", jPanel6);

        jMenuBar1.setBackground(new java.awt.Color(102, 255, 102));
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 570, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static Double Sigmoid(Double x){
    Double hasil;
    hasil = 1/(1+exp(-x));
    return hasil;
}
public static Double DiffSigmoid(Double x){
    Double hasil;
    hasil = Sigmoid(x)*(1-Sigmoid(x));
    return hasil;
}

public static Double Sigmoid2(Double x){
    Double hasil;
    hasil = (2/(1+exp(-x)))-1;
    return hasil;
}
public static Double DiffSigmoid2(Double x){
    Double hasil;
    hasil = ((1+Sigmoid2(x))*(1-Sigmoid2(x))/2);
    return hasil;
}
    
    
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void jTabbedPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane4MouseClicked

    }//GEN-LAST:event_jTabbedPane4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Testing testing = new Testing( biastestY, wtest ,biastestZ,vtest, Huruf, t, p, hidden, biner);
        testing.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void radio_binerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_binerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_binerActionPerformed

    private void tr_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_saveActionPerformed
        if(radio_biner.isSelected() && radio_bipolar.isSelected()) {
            JOptionPane.showMessageDialog(null, "Pilih salah satu fungsi aktivasi");
            radio_biner.setSelected(false);
            radio_bipolar.setSelected(false);
        } else if (!radio_biner.isSelected() && !radio_bipolar.isSelected()) {
            JOptionPane.showMessageDialog(null, "Fungsi aktivasi belum dipilih");
        } else {

            if ( tr_huruf.getText().equals("") || tr_alpha1.getText().equals("") || tr_iterasi.getText().equals("") || tr_hidden.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Kolom isian tidak boleh kosong ");
            } else {
                tr_save.setSelected(true);
                Integer Iterasi = Integer.parseInt(tr_iterasi.getText());
                Double alpha=Double.parseDouble(tr_alpha1.getText());

                if (Iterasi < 0 ) {
                    JOptionPane.showMessageDialog(null, "Iterasi harus lebih dari 0");

                }
                else if ( alpha < 0 || alpha > 1 ) {
                    JOptionPane.showMessageDialog(null, "Nilai Alfa tidak boleh kosong dan harus 0 <= Alfa <= 1 ");
                } else {

                    tr_huruf.enable(false);
                    tr_iterasi.enable(false);
                    tr_alpha1.enable(false);
                    tr_hidden.enable(false);

                    inputS[0]=tr1.getSelectedObjects();
                    inputS[1]=tr2.getSelectedObjects();
                    inputS[2]=tr3.getSelectedObjects();
                    inputS[3]=tr4.getSelectedObjects();
                    inputS[4]=tr5.getSelectedObjects();
                    inputS[5]=tr6.getSelectedObjects();
                    inputS[6]=tr7.getSelectedObjects();
                    inputS[7]=tr8.getSelectedObjects();
                    inputS[8]=tr9.getSelectedObjects();
                    inputS[9]=tr10.getSelectedObjects();
                    inputS[10]=tr11.getSelectedObjects();
                    inputS[11]=tr12.getSelectedObjects();
                    inputS[12]=tr13.getSelectedObjects();
                    inputS[13]=tr14.getSelectedObjects();
                    inputS[14]=tr15.getSelectedObjects();
                    inputS[15]=tr16.getSelectedObjects();
                    inputS[16]=tr17.getSelectedObjects();
                    inputS[17]=tr18.getSelectedObjects();
                    inputS[18]=tr19.getSelectedObjects();
                    inputS[19]=tr20.getSelectedObjects();
                    inputS[20]=tr21.getSelectedObjects();
                    inputS[21]=tr22.getSelectedObjects();
                    inputS[22]=tr23.getSelectedObjects();
                    inputS[23]=tr24.getSelectedObjects();
                    inputS[24]=tr25.getSelectedObjects();
                    inputS[25]=tr26.getSelectedObjects();
                    inputS[26]=tr27.getSelectedObjects();
                    inputS[27]=tr28.getSelectedObjects();
                    inputS[28]=tr29.getSelectedObjects();
                    inputS[29]=tr30.getSelectedObjects();
                    inputS[30]=tr31.getSelectedObjects();
                    inputS[31]=tr32.getSelectedObjects();
                    inputS[32]=tr33.getSelectedObjects();
                    inputS[33]=tr34.getSelectedObjects();
                    inputS[34]=tr35.getSelectedObjects();
                    inputS[35]=tr36.getSelectedObjects();
                    inputS[36]=tr37.getSelectedObjects();
                    inputS[37]=tr38.getSelectedObjects();
                    inputS[38]=tr39.getSelectedObjects();
                    inputS[39]=tr40.getSelectedObjects();
                    inputS[40]=tr41.getSelectedObjects();
                    inputS[41]=tr42.getSelectedObjects();
                    inputS[42]=tr43.getSelectedObjects();
                    inputS[43]=tr44.getSelectedObjects();
                    inputS[44]=tr45.getSelectedObjects();
                    inputS[45]=tr46.getSelectedObjects();
                    inputS[46]=tr47.getSelectedObjects();
                    inputS[47]=tr48.getSelectedObjects();
                    inputS[48]=tr49.getSelectedObjects();
                    inputS[49]=tr50.getSelectedObjects();
                    inputS[50]=tr51.getSelectedObjects();
                    inputS[51]=tr52.getSelectedObjects();
                    inputS[52]=tr53.getSelectedObjects();
                    inputS[53]=tr54.getSelectedObjects();
                    inputS[54]=tr55.getSelectedObjects();
                    inputS[55]=tr56.getSelectedObjects();
                    inputS[56]=tr57.getSelectedObjects();
                    inputS[57]=tr58.getSelectedObjects();
                    inputS[58]=tr59.getSelectedObjects();
                     inputS[59]=tr60.getSelectedObjects();
                    inputS[60]=tr61.getSelectedObjects();
                    inputS[61]=tr62.getSelectedObjects();
                    inputS[62]=tr63.getSelectedObjects();

                    //Menginisiasi S

                    for(int i=0;i<63; i++){
                        if(radio_biner.isSelected()) {
                            if(inputS[i]!=null) {
                                x[i][n]=1;
                            } else {
                                x[i][n]=0;
                            }
                        } else if (radio_bipolar.isSelected()){
                            if(inputS[i]!=null) {
                                x[i][n]=1;
                            } else {
                                x[i][n]=-1;
                            }
                        }

                    }

                    inputT[0]=t1.getSelectedObjects();
                    inputT[1]=t2.getSelectedObjects();
                    inputT[2]=t3.getSelectedObjects();
                    inputT[3]=t4.getSelectedObjects();
                    inputT[4]=t5.getSelectedObjects();
                    inputT[5]=t6.getSelectedObjects();
                    inputT[6]=t7.getSelectedObjects();

                    for(int i=0;i<7; i++){
                        if(radio_biner.isSelected()) {
                            if(inputT[i]!=null) {
                                t[i][n]=1;
                            } else {
                                t[i][n]=0;
                            }
                        } else if (radio_bipolar.isSelected()){
                            if(inputT[i]!=null) {
                                t[i][n]=1;
                            } else {
                                t[i][n]=-1;
                            }
                        }
                    }
                    //Mengambil inputan huruf
                    Huruf[n]=tr_huruf.getText();

                    n=n+1;
                    p=n;

                    JOptionPane.showMessageDialog(null, "Huruf disimpan dalam database");
                }

            }
        }
    }//GEN-LAST:event_tr_saveActionPerformed

    private void tr_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tr_saveMouseClicked

    }//GEN-LAST:event_tr_saveMouseClicked

    private void tr_trainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_trainingActionPerformed

        hidden = Integer.parseInt(tr_hidden.getText());

        wtest = new double [hidden][7];
        vtest = new double [63][hidden];
        biastestZ = new double [hidden];
        double  [] biasZ = new double [hidden]; //bias hidden
        double [][] w = new double[hidden][7]; //bobot menuju outoput
        double[] z = new double[hidden]; //nilai z
        double[][] v = new double[63][hidden];//bobot menuju hidden
        double [] z_inJ = new double [hidden]; //
        double [][] delta_w = new double[hidden][7];//delta bobot hidden
        double [][] delta_v = new double[63][hidden];//delta bobot hidden
        double [] faktorJ = new double[hidden];
        double[] faktor_inJ = new double[hidden];//faktor_in pada hidden
        double [] delta_biasZ=new double [hidden]; //delta bias hidden

        if(tr_save.isSelected()) {
            Integer iterasi = Integer.parseInt(tr_iterasi.getText());
            Double alpha = Double.parseDouble(tr_alpha1.getText());
            int it=0;

            for (int i=0; i< 63; i++) {
                for(int j=0; j<hidden; j++) {
                    v[i][j] = Math.random()-0.5;
                }
            }

            for (int i=0; i< hidden; i++) {
                for(int j=0; j<7; j++) {
                    w[i][j] = Math.random()-0.5;
                }
            }

            for (int i=0; i<hidden; i++) {
                biasZ[i] = Math.random()-0.5;
            }

            for (int i=0; i<7; i++) {
                biasY[i] = Math.random()-0.5;
            }

            //FEEDFORWARD

            while (it < iterasi) {
                for(int k=0; k<p; k++){
                    for(int j=0; j<hidden; j++){
                        z_inJ[j]=0.0;
                        for(int i=0; i<63; i++){
                            z_inJ[j]=z_inJ[j]+(x[i][k]*v[i][j]);
                        }
                        z_inJ[j] = z_inJ[j]+biasZ[j];
                    }

                    for (int j=0; j<hidden; j++) {

                        if(radio_biner.isSelected()) {
                            z[j] = Sigmoid(z_inJ[j]);
                        } else if(radio_bipolar.isSelected()){
                            z[j] = Sigmoid2(z_inJ[j]);
                        }

                    }

                    for( int r=0; r<7; r++){
                        y_inK[r]= 0.0;
                        for(int j=0; j<hidden; j++){
                            y_inK[r]=y_inK[r]+(z[j]*w[j][r]);
                        }
                        y_inK[r]= y_inK[r] + biasY[r];
                    }

                    for (int j=0; j<7; j++) {
                        if(radio_biner.isSelected()) {
                            y[j] = Sigmoid(y_inK[j]);
                        } else if(radio_bipolar.isSelected()){
                            y[j] = Sigmoid2(y_inK[j]);
                        }

                    }
                    
                    for (int i=0; i<7; i++) {
                        if(radio_biner.isSelected()) {
                            faktorK [i] = (t[i][k]-y[i])*DiffSigmoid(y_inK[i]);
                            radio_bipolar.setEnabled(false);
                            biner = true;
                        } else if(radio_bipolar.isSelected()){
                            faktorK [i] = (t[i][k]-y[i])*DiffSigmoid2(y_inK[i]);
                            radio_biner.setEnabled(false);
                        }
                    }

                    for (int i=0; i<7; i++) {
                        for (int j=0; j< hidden; j++) {
                            delta_w[j][i] = alpha*faktorK[i]*z[j];
                        }
                        delta_biasY[i] = alpha*faktorK[i];
                    }

                    for(int j=0; j<hidden; j++){
                        faktor_inJ[j]=0.0;
                        for( int r=0; r<7; r++){
                            faktor_inJ[j]=faktor_inJ[j]+(faktorK[r]*w[j][r]);
                        }
                    }

                    for(int j=0; j<hidden; j++){
                        if(radio_biner.isSelected()) {
                            faktorJ[j]=faktor_inJ[j]*DiffSigmoid(z_inJ[j]);
                        } else if(radio_bipolar.isSelected()) {
                            faktorJ[j]=faktor_inJ[j]*DiffSigmoid2(z_inJ[j]);
                        }
                    }

                    for(int j=0; j<hidden; j++){
                        for(int i=0; i<63; i++){
                            delta_v[i][j]=alpha*faktorJ[j]*x[i][k];
                        }
                        delta_biasZ[j]=alpha*faktorJ[j];

                    }

                    for(int j=0; j<hidden; j++){
                        for(int r=0; r<7; r++){
                            w[j][r]=w[j][r]+delta_w[j][r];

                        }
                    }

                    for(int j=0; j<63; j++){
                        for(int r=0; r<hidden; r++){
                            v[j][r]=v[j][r]+delta_v[j][r];

                        }
                    }

                    for(int j=0; j<hidden; j++){
                        biasZ[j]=biasZ[j]+delta_biasZ[j];
                    }

                    for(int j=0; j<7; j++){
                        biasY[j]=biasY[j]+delta_biasY[j];

                    }

                    for(int i=0; i<63;i++){
                        for(int j=0; j<hidden; j++){
                            vtest[i][j]=v[i][j];
                        }
                    }
                    
                    for(int j=0; j<hidden;j++){
                        for(int r=0; r<7; r++){
                            wtest[j][r]=w[j][r];
                            
                        }
                    }
                    
                    for(int j=0; j<hidden;j++){
                        biastestZ[j]=biasZ[j];
                    }
                    for(int r=0; r<7;r++){
                        biastestY[r]=biasY[r];
                    }

                }

                it++;
            }

            JOptionPane.showMessageDialog(null, "Training huruf "+tr_huruf.getText()+" berhasil dilakukan");
           
        } else {
            JOptionPane.showMessageDialog(null, "Tombol simpan harus ditekan terlebih dahulu");
        }
    }//GEN-LAST:event_tr_trainingActionPerformed

    private void tr_trainingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tr_trainingMouseClicked

    }//GEN-LAST:event_tr_trainingMouseClicked

    private void tr_hiddenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_hiddenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_hiddenActionPerformed

    private void tr_iterasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_iterasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_iterasiActionPerformed

    private void tr_alpha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_alpha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_alpha1ActionPerformed

    private void tr_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_clearActionPerformed

        tr1.setSelected(false);
        tr1.setBackground(Color.GREEN);
        tr2.setSelected(false);
        tr2.setBackground(Color.GREEN);
        tr3.setSelected(false);
        tr3.setBackground(Color.GREEN);
        tr4.setSelected(false);
        tr4.setBackground(Color.GREEN);
        tr5.setSelected(false);
        tr5.setBackground(Color.GREEN);
        tr6.setSelected(false);
        tr6.setBackground(Color.GREEN);
        tr7.setSelected(false);
        tr7.setBackground(Color.GREEN);
        tr8.setSelected(false);
        tr8.setBackground(Color.GREEN);
        tr9.setSelected(false);
        tr9.setBackground(Color.GREEN);
        tr10.setSelected(false);
        tr10.setBackground(Color.GREEN);
        tr11.setSelected(false);
        tr11.setBackground(Color.GREEN);
        tr12.setSelected(false);
        tr12.setBackground(Color.GREEN);
        tr13.setSelected(false);
        tr13.setBackground(Color.GREEN);
        tr14.setSelected(false);
        tr14.setBackground(Color.GREEN);
        tr15.setSelected(false);
        tr15.setBackground(Color.GREEN);
        tr16.setSelected(false);
        tr16.setBackground(Color.GREEN);
        tr17.setSelected(false);
        tr17.setBackground(Color.GREEN);
        tr18.setSelected(false);
        tr18.setBackground(Color.GREEN);
        tr19.setSelected(false);
        tr19.setBackground(Color.GREEN);
        tr20.setSelected(false);
        tr20.setBackground(Color.GREEN);
        tr21.setSelected(false);
        tr21.setBackground(Color.GREEN);
        tr22.setSelected(false);
        tr22.setBackground(Color.GREEN);
        tr23.setSelected(false);
        tr23.setBackground(Color.GREEN);
        tr24.setSelected(false);
        tr24.setBackground(Color.GREEN);
        tr25.setSelected(false);
        tr25.setBackground(Color.GREEN);
        tr26.setSelected(false);
        tr26.setBackground(Color.GREEN);
        tr27.setSelected(false);
        tr27.setBackground(Color.GREEN);
        tr28.setSelected(false);
        tr28.setBackground(Color.GREEN);
        tr29.setSelected(false);
        tr29.setBackground(Color.GREEN);
        tr30.setSelected(false);
        tr30.setBackground(Color.GREEN);
        tr31.setSelected(false);
        tr31.setBackground(Color.GREEN);
        tr32.setSelected(false);
        tr32.setBackground(Color.GREEN);
        tr33.setSelected(false);
        tr33.setBackground(Color.GREEN);
        tr34.setSelected(false);
        tr34.setBackground(Color.GREEN);
        tr35.setSelected(false);
        tr35.setBackground(Color.GREEN);
        tr36.setSelected(false);
        tr36.setBackground(Color.GREEN);
        tr37.setSelected(false);
        tr37.setBackground(Color.GREEN);
        tr38.setSelected(false);
        tr38.setBackground(Color.GREEN);
        tr39.setSelected(false);
        tr39.setBackground(Color.GREEN);
        tr40.setSelected(false);
        tr40.setBackground(Color.GREEN);
        tr41.setSelected(false);
        tr41.setBackground(Color.GREEN);
        tr42.setSelected(false);
        tr42.setBackground(Color.GREEN);
        tr43.setSelected(false);
        tr43.setBackground(Color.GREEN);
        tr44.setSelected(false);
        tr44.setBackground(Color.GREEN);
        tr45.setSelected(false);
        tr45.setBackground(Color.GREEN);
        tr46.setSelected(false);
        tr46.setBackground(Color.GREEN);
        tr47.setSelected(false);
        tr47.setBackground(Color.GREEN);
        tr48.setSelected(false);
        tr48.setBackground(Color.GREEN);
        tr49.setSelected(false);
        tr49.setBackground(Color.GREEN);
        tr50.setSelected(false);
        tr50.setBackground(Color.GREEN);
        tr51.setSelected(false);
        tr51.setBackground(Color.GREEN);
        tr52.setSelected(false);
        tr52.setBackground(Color.GREEN);
        tr53.setSelected(false);
        tr53.setBackground(Color.GREEN);
        tr54.setSelected(false);
        tr54.setBackground(Color.GREEN);
        tr55.setSelected(false);
        tr55.setBackground(Color.GREEN);
        tr56.setSelected(false);
        tr56.setBackground(Color.GREEN);
        tr57.setSelected(false);
        tr57.setBackground(Color.GREEN);
        tr58.setSelected(false);
        tr58.setBackground(Color.GREEN);
        tr59.setSelected(false);
        tr59.setBackground(Color.GREEN);
        tr60.setSelected(false);
        tr60.setBackground(Color.GREEN);
        tr61.setSelected(false);
        tr61.setBackground(Color.GREEN);
        tr62.setSelected(false);
        tr62.setBackground(Color.GREEN);
        tr63.setSelected(false);
        tr63.setBackground(Color.GREEN);

        t1.setSelected(false);
        t1.setBackground(Color.GREEN);
        t2.setSelected(false);
        t2.setBackground(Color.GREEN);
        t3.setSelected(false);
        t3.setBackground(Color.GREEN);
        t4.setSelected(false);
        t4.setBackground(Color.GREEN);
        t5.setSelected(false);
        t5.setBackground(Color.GREEN);
        t6.setSelected(false);
        t6.setBackground(Color.GREEN);
        t7.setSelected(false);
        t7.setBackground(Color.GREEN);

        tr1.setText("F");
        tr2.setText("F");
        tr3.setText("F");
        tr4.setText("F");
        tr5.setText("F");
        tr6.setText("F");
        tr7.setText("F");
        tr8.setText("F");
        tr9.setText("F");
        tr10.setText("F");
        tr11.setText("F");
        tr12.setText("F");
        tr13.setText("F");
        tr14.setText("F");
        tr15.setText("F");
        tr16.setText("F");
        tr17.setText("F");
        tr18.setText("F");
        tr19.setText("F");
        tr20.setText("F");
        tr21.setText("F");
        tr22.setText("F");
        tr23.setText("F");
        tr24.setText("F");
        tr25.setText("F");
        tr26.setText("F");
        tr27.setText("F");
        tr28.setText("F");
        tr29.setText("F");
        tr30.setText("F");
        tr31.setText("F");
        tr32.setText("F");
        tr33.setText("F");
        tr34.setText("F");
        tr35.setText("F");
        tr36.setText("F");
        tr37.setText("F");
        tr38.setText("F");
        tr39.setText("F");
        tr40.setText("F");
        tr41.setText("F");
        tr42.setText("F");
        tr43.setText("F");
        tr44.setText("F");
        tr45.setText("F");
        tr46.setText("F");
        tr47.setText("F");
        tr48.setText("F");
        tr49.setText("F");
        tr50.setText("F");
        tr51.setText("F");
        tr52.setText("F");
        tr53.setText("F");
        tr54.setText("F");
        tr55.setText("F");
        tr56.setText("F");
        tr57.setText("F");
        tr58.setText("F");
        tr59.setText("F");
        tr60.setText("F");
        tr61.setText("F");
        tr61.setText("F");
        tr61.setText("F");

        t1.setText("F");
        t2.setText("F");
        t3.setText("F");
        t4.setText("F");
        t5.setText("F");
        t6.setText("F");
        t7.setText("F");

        tr_iterasi.setText("");
        tr_huruf.setText("");
        tr_alpha1.setText("");

        tr_iterasi.enable(true);
        tr_huruf.enable(true);
        tr_alpha1.enable(true);

        JOptionPane.showMessageDialog(null, "Refresh sukses");
    }//GEN-LAST:event_tr_clearActionPerformed

    private void tr_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tr_clearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_clearMouseClicked

    private void tr_hurufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr_hurufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tr_hurufActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        if (t6.isSelected()) {
            t6.setBackground(Color.WHITE);
            t6.setText("T");
        } else {
            t6.setBackground(Color.GREEN);
            t6.setText("F");

        }
    }//GEN-LAST:event_t6ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        if (t5.isSelected()) {
            t5.setBackground(Color.WHITE);
            t5.setText("T");
        } else {
            t5.setBackground(Color.GREEN);
            t5.setText("F");

        }
    }//GEN-LAST:event_t5ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        if (t4.isSelected()) {
            t4.setBackground(Color.WHITE);
            t4.setText("T");
        } else {
            t4.setBackground(Color.GREEN);
            t4.setText("F");

        }
    }//GEN-LAST:event_t4ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        if (t3.isSelected()) {
            t3.setBackground(Color.WHITE);
            t3.setText("T");
        } else {
            t3.setBackground(Color.GREEN);
            t3.setText("F");

        }
    }//GEN-LAST:event_t3ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        if (t2.isSelected()) {
            t2.setBackground(Color.WHITE);
            t2.setText("T");
        } else {
            t2.setBackground(Color.GREEN);
            t2.setText("F");

        }
    }//GEN-LAST:event_t2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        if (t1.isSelected()) {
            t1.setBackground(Color.WHITE);
            t1.setText("T");
        } else {
            t1.setBackground(Color.GREEN);
            t1.setText("F");

        }
    }//GEN-LAST:event_t1ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        if (t7.isSelected()) {
            t7.setBackground(Color.WHITE);
            t7.setText("T");
        } else {
            t7.setBackground(Color.GREEN);
            t7.setText("-1");

        }
    }//GEN-LAST:event_t7ActionPerformed

    private void tr62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr62ActionPerformed
        if (tr62.isSelected()) {
            tr62.setBackground(Color.WHITE);
            tr62.setText("T");
        } else {
            tr62.setBackground(Color.GREEN);
            tr62.setText("F");

        }
    }//GEN-LAST:event_tr62ActionPerformed

    private void tr61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr61ActionPerformed
        if (tr61.isSelected()) {
            tr61.setBackground(Color.WHITE);
            tr61.setText("T");
        } else {
            tr61.setBackground(Color.GREEN);
            tr61.setText("F");

        }
    }//GEN-LAST:event_tr61ActionPerformed

    private void tr60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr60ActionPerformed
        if (tr60.isSelected()) {
            tr60.setBackground(Color.WHITE);
            tr60.setText("T");
        } else {
            tr60.setBackground(Color.GREEN);
            tr60.setText("F");

        }
    }//GEN-LAST:event_tr60ActionPerformed

    private void tr59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr59ActionPerformed
        if (tr59.isSelected()) {
            tr59.setBackground(Color.WHITE);
            tr59.setText("T");
        } else {
            tr59.setBackground(Color.GREEN);
            tr59.setText("F");

        }
    }//GEN-LAST:event_tr59ActionPerformed

    private void tr58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr58ActionPerformed
        if (tr58.isSelected()) {
            tr58.setBackground(Color.WHITE);
            tr58.setText("T");
        } else {
            tr58.setBackground(Color.GREEN);
            tr58.setText("F");

        }
    }//GEN-LAST:event_tr58ActionPerformed

    private void tr57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr57ActionPerformed
        if (tr57.isSelected()) {
            tr57.setBackground(Color.WHITE);
            tr57.setText("T");
        } else {
            tr57.setBackground(Color.GREEN);
            tr57.setText("F");

        }
    }//GEN-LAST:event_tr57ActionPerformed

    private void tr56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr56ActionPerformed
        if (tr56.isSelected()) {
            tr56.setBackground(Color.WHITE);
            tr56.setText("T");
        } else {
            tr56.setBackground(Color.GREEN);
            tr56.setText("F");

        }
    }//GEN-LAST:event_tr56ActionPerformed

    private void tr55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr55ActionPerformed
        if (tr55.isSelected()) {
            tr55.setBackground(Color.WHITE);
            tr55.setText("T");
        } else {
            tr55.setBackground(Color.GREEN);
            tr55.setText("F");

        }
    }//GEN-LAST:event_tr55ActionPerformed

    private void tr54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr54ActionPerformed
        if (tr54.isSelected()) {
            tr54.setBackground(Color.WHITE);
            tr54.setText("T");
        } else {
            tr54.setBackground(Color.GREEN);
            tr54.setText("F");

        }
    }//GEN-LAST:event_tr54ActionPerformed

    private void tr53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr53ActionPerformed
        if (tr53.isSelected()) {
            tr53.setBackground(Color.WHITE);
            tr53.setText("T");
        } else {
            tr53.setBackground(Color.GREEN);
            tr53.setText("F");

        }
    }//GEN-LAST:event_tr53ActionPerformed

    private void tr52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr52ActionPerformed
        if (tr52.isSelected()) {
            tr52.setBackground(Color.WHITE);
            tr52.setText("T");
        } else {
            tr52.setBackground(Color.GREEN);
            tr52.setText("F");

        }
    }//GEN-LAST:event_tr52ActionPerformed

    private void tr51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr51ActionPerformed
        if (tr51.isSelected()) {
            tr51.setBackground(Color.WHITE);
            tr51.setText("T");
        } else {
            tr51.setBackground(Color.GREEN);
            tr51.setText("F");

        }
    }//GEN-LAST:event_tr51ActionPerformed

    private void tr50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr50ActionPerformed
        if (tr50.isSelected()) {
            tr50.setBackground(Color.WHITE);
            tr50.setText("T");
        } else {
            tr50.setBackground(Color.GREEN);
            tr50.setText("F");

        }
    }//GEN-LAST:event_tr50ActionPerformed

    private void tr49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr49ActionPerformed
        if (tr49.isSelected()) {
            tr49.setBackground(Color.WHITE);
            tr49.setText("T");
        } else {
            tr49.setBackground(Color.GREEN);
            tr49.setText("F");

        }
    }//GEN-LAST:event_tr49ActionPerformed

    private void tr48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr48ActionPerformed
        if (tr48.isSelected()) {
            tr48.setBackground(Color.WHITE);
            tr48.setText("T");
        } else {
            tr48.setBackground(Color.GREEN);
            tr48.setText("F");

        }
    }//GEN-LAST:event_tr48ActionPerformed

    private void tr47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr47ActionPerformed
        if (tr47.isSelected()) {
            tr47.setBackground(Color.WHITE);
            tr47.setText("T");
        } else {
            tr47.setBackground(Color.GREEN);
            tr47.setText("F");

        }
    }//GEN-LAST:event_tr47ActionPerformed

    private void tr46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr46ActionPerformed
        if (tr46.isSelected()) {
            tr46.setBackground(Color.WHITE);
            tr46.setText("T");
        } else {
            tr46.setBackground(Color.GREEN);
            tr46.setText("F");

        }
    }//GEN-LAST:event_tr46ActionPerformed

    private void tr45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr45ActionPerformed
        if (tr45.isSelected()) {
            tr45.setBackground(Color.WHITE);
            tr45.setText("T");
        } else {
            tr45.setBackground(Color.GREEN);
            tr45.setText("F");

        }
    }//GEN-LAST:event_tr45ActionPerformed

    private void tr44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr44ActionPerformed
        if (tr44.isSelected()) {
            tr44.setBackground(Color.WHITE);
            tr44.setText("T");
        } else {
            tr44.setBackground(Color.GREEN);
            tr44.setText("F");

        }
    }//GEN-LAST:event_tr44ActionPerformed

    private void tr43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr43ActionPerformed
        if (tr43.isSelected()) {
            tr43.setBackground(Color.WHITE);
            tr43.setText("T");
        } else {
            tr43.setBackground(Color.GREEN);
            tr43.setText("F");

        }
    }//GEN-LAST:event_tr43ActionPerformed

    private void tr42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr42ActionPerformed
        if (tr42.isSelected()) {
            tr42.setBackground(Color.WHITE);
            tr42.setText("T");
        } else {
            tr42.setBackground(Color.GREEN);
            tr42.setText("F");

        }
    }//GEN-LAST:event_tr42ActionPerformed

    private void tr41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr41ActionPerformed
        if (tr41.isSelected()) {
            tr41.setBackground(Color.WHITE);
            tr41.setText("T");
        } else {
            tr41.setBackground(Color.GREEN);
            tr41.setText("F");

        }
    }//GEN-LAST:event_tr41ActionPerformed

    private void tr40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr40ActionPerformed
        if (tr40.isSelected()) {
            tr40.setBackground(Color.WHITE);
            tr40.setText("T");
        } else {
            tr40.setBackground(Color.GREEN);
            tr40.setText("F");

        }
    }//GEN-LAST:event_tr40ActionPerformed

    private void tr39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr39ActionPerformed
        if (tr39.isSelected()) {
            tr39.setBackground(Color.WHITE);
            tr39.setText("T");
        } else {
            tr39.setBackground(Color.GREEN);
            tr39.setText("F");

        }
    }//GEN-LAST:event_tr39ActionPerformed

    private void tr38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr38ActionPerformed
        if (tr38.isSelected()) {
            tr38.setBackground(Color.WHITE);
            tr38.setText("T");
        } else {
            tr38.setBackground(Color.GREEN);
            tr38.setText("F");

        }
    }//GEN-LAST:event_tr38ActionPerformed

    private void tr37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr37ActionPerformed
        if (tr37.isSelected()) {
            tr37.setBackground(Color.WHITE);
            tr37.setText("T");
        } else {
            tr37.setBackground(Color.GREEN);
            tr37.setText("F");

        }
    }//GEN-LAST:event_tr37ActionPerformed

    private void tr36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr36ActionPerformed
        if (tr36.isSelected()) {
            tr36.setBackground(Color.WHITE);
            tr36.setText("T");
        } else {
            tr36.setBackground(Color.GREEN);
            tr36.setText("F");

        }
    }//GEN-LAST:event_tr36ActionPerformed

    private void tr35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr35ActionPerformed
        if (tr35.isSelected()) {
            tr35.setBackground(Color.WHITE);
            tr35.setText("T");
        } else {
            tr35.setBackground(Color.GREEN);
            tr35.setText("F");

        }
    }//GEN-LAST:event_tr35ActionPerformed

    private void tr34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr34ActionPerformed
        if (tr34.isSelected()) {
            tr34.setBackground(Color.WHITE);
            tr34.setText("T");
        } else {
            tr34.setBackground(Color.GREEN);
            tr34.setText("F");

        }
    }//GEN-LAST:event_tr34ActionPerformed

    private void tr33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr33ActionPerformed
        if (tr33.isSelected()) {
            tr33.setBackground(Color.WHITE);
            tr33.setText("T");
        } else {
            tr33.setBackground(Color.GREEN);
            tr33.setText("F");

        }
    }//GEN-LAST:event_tr33ActionPerformed

    private void tr32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr32ActionPerformed
        if (tr32.isSelected()) {
            tr32.setBackground(Color.WHITE);
            tr32.setText("T");
        } else {
            tr32.setBackground(Color.GREEN);
            tr32.setText("F");

        }
    }//GEN-LAST:event_tr32ActionPerformed

    private void tr31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr31ActionPerformed
        if (tr31.isSelected()) {
            tr31.setBackground(Color.WHITE);
            tr31.setText("T");
        } else {
            tr31.setBackground(Color.GREEN);
            tr31.setText("F");

        }
    }//GEN-LAST:event_tr31ActionPerformed

    private void tr30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr30ActionPerformed
        if (tr30.isSelected()) {
            tr30.setBackground(Color.WHITE);
            tr30.setText("T");
        } else {
            tr30.setBackground(Color.GREEN);
            tr30.setText("F");

        }
    }//GEN-LAST:event_tr30ActionPerformed

    private void tr29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr29ActionPerformed
        if (tr29.isSelected()) {
            tr29.setBackground(Color.WHITE);
            tr29.setText("T");
        } else {
            tr29.setBackground(Color.GREEN);
            tr29.setText("F");

        }
    }//GEN-LAST:event_tr29ActionPerformed

    private void tr28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr28ActionPerformed
        if (tr28.isSelected()) {
            tr28.setBackground(Color.WHITE);
            tr28.setText("T");
        } else {
            tr28.setBackground(Color.GREEN);
            tr28.setText("F");

        }
    }//GEN-LAST:event_tr28ActionPerformed

    private void tr27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr27ActionPerformed
        if (tr27.isSelected()) {
            tr27.setBackground(Color.WHITE);
            tr27.setText("T");
        } else {
            tr27.setBackground(Color.GREEN);
            tr27.setText("F");

        }
    }//GEN-LAST:event_tr27ActionPerformed

    private void tr26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr26ActionPerformed
        if (tr26.isSelected()) {
            tr26.setBackground(Color.WHITE);
            tr26.setText("T");
        } else {
            tr26.setBackground(Color.GREEN);
            tr26.setText("F");

        }
    }//GEN-LAST:event_tr26ActionPerformed

    private void tr25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr25ActionPerformed
        if (tr25.isSelected()) {
            tr25.setBackground(Color.WHITE);
            tr25.setText("T");
        } else {
            tr25.setBackground(Color.GREEN);
            tr25.setText("F");

        }
    }//GEN-LAST:event_tr25ActionPerformed

    private void tr24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr24ActionPerformed
        if (tr24.isSelected()) {
            tr24.setBackground(Color.WHITE);
            tr24.setText("T");
        } else {
            tr24.setBackground(Color.GREEN);
            tr24.setText("F");

        }
    }//GEN-LAST:event_tr24ActionPerformed

    private void tr23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr23ActionPerformed
        if (tr23.isSelected()) {
            tr23.setBackground(Color.WHITE);
            tr23.setText("T");
        } else {
            tr23.setBackground(Color.GREEN);
            tr23.setText("F");

        }
    }//GEN-LAST:event_tr23ActionPerformed

    private void tr22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr22ActionPerformed
        if (tr22.isSelected()) {
            tr22.setBackground(Color.WHITE);
            tr22.setText("T");
        } else {
            tr22.setBackground(Color.GREEN);
            tr22.setText("F");

        }
    }//GEN-LAST:event_tr22ActionPerformed

    private void tr21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr21ActionPerformed
        if (tr21.isSelected()) {
            tr21.setBackground(Color.WHITE);
            tr21.setText("T");
        } else {
            tr21.setBackground(Color.GREEN);
            tr21.setText("F");

        }
    }//GEN-LAST:event_tr21ActionPerformed

    private void tr20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr20ActionPerformed
        if (tr20.isSelected()) {
            tr20.setBackground(Color.WHITE);
            tr20.setText("T");
        } else {
            tr20.setBackground(Color.GREEN);
            tr20.setText("F");

        }
    }//GEN-LAST:event_tr20ActionPerformed

    private void tr19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr19ActionPerformed
        if (tr19.isSelected()) {
            tr19.setBackground(Color.WHITE);
            tr19.setText("T");
        } else {
            tr19.setBackground(Color.GREEN);
            tr19.setText("F");

        }
    }//GEN-LAST:event_tr19ActionPerformed

    private void tr18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr18ActionPerformed
        if (tr18.isSelected()) {
            tr18.setBackground(Color.WHITE);
            tr18.setText("T");
        } else {
            tr18.setBackground(Color.GREEN);
            tr18.setText("F");

        }
    }//GEN-LAST:event_tr18ActionPerformed

    private void tr17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr17ActionPerformed
        if (tr17.isSelected()) {
            tr17.setBackground(Color.WHITE);
            tr17.setText("T");
        } else {
            tr17.setBackground(Color.GREEN);
            tr17.setText("F");

        }
    }//GEN-LAST:event_tr17ActionPerformed

    private void tr16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr16ActionPerformed
        if (tr16.isSelected()) {
            tr16.setBackground(Color.WHITE);
            tr16.setText("T");
        } else {
            tr16.setBackground(Color.GREEN);
            tr16.setText("F");

        }
    }//GEN-LAST:event_tr16ActionPerformed

    private void tr15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr15ActionPerformed
        if (tr15.isSelected()) {
            tr15.setBackground(Color.WHITE);
            tr15.setText("T");
        } else {
            tr15.setBackground(Color.GREEN);
            tr15.setText("F");

        }
    }//GEN-LAST:event_tr15ActionPerformed

    private void tr14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr14ActionPerformed
        if (tr14.isSelected()) {
            tr14.setBackground(Color.WHITE);
            tr14.setText("T");
        } else {
            tr14.setBackground(Color.GREEN);
            tr14.setText("F");

        }
    }//GEN-LAST:event_tr14ActionPerformed

    private void tr13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr13ActionPerformed
        if (tr13.isSelected()) {
            tr13.setBackground(Color.WHITE);
            tr13.setText("T");
        } else {
            tr13.setBackground(Color.GREEN);
            tr13.setText("F");

        }
    }//GEN-LAST:event_tr13ActionPerformed

    private void tr12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr12ActionPerformed
        if (tr12.isSelected()) {
            tr12.setBackground(Color.WHITE);
            tr12.setText("T");
        } else {
            tr12.setBackground(Color.GREEN);
            tr12.setText("F");

        }
    }//GEN-LAST:event_tr12ActionPerformed

    private void tr11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr11ActionPerformed
        if (tr11.isSelected()) {
            tr11.setBackground(Color.WHITE);
            tr11.setText("T");
        } else {
            tr11.setBackground(Color.GREEN);
            tr11.setText("F");

        }
    }//GEN-LAST:event_tr11ActionPerformed

    private void tr10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr10ActionPerformed
        if (tr10.isSelected()) {
            tr10.setBackground(Color.WHITE);
            tr10.setText("T");
        } else {
            tr10.setBackground(Color.GREEN);
            tr10.setText("F");

        }
    }//GEN-LAST:event_tr10ActionPerformed

    private void tr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr9ActionPerformed
        if (tr9.isSelected()) {
            tr9.setBackground(Color.WHITE);
            tr9.setText("T");
        } else {
            tr9.setBackground(Color.GREEN);
            tr9.setText("F");

        }
    }//GEN-LAST:event_tr9ActionPerformed

    private void tr8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr8ActionPerformed
        if (tr8.isSelected()) {
            tr8.setBackground(Color.WHITE);
            tr8.setText("T");
        } else {
            tr8.setBackground(Color.GREEN);
            tr8.setText("F");

        }
    }//GEN-LAST:event_tr8ActionPerformed

    private void tr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr7ActionPerformed
        if (tr7.isSelected()) {
            tr7.setBackground(Color.WHITE);
            tr7.setText("T");
        } else {
            tr7.setBackground(Color.GREEN);
            tr7.setText("F");

        }
    }//GEN-LAST:event_tr7ActionPerformed

    private void tr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr6ActionPerformed
        if (tr6.isSelected()) {
            tr6.setBackground(Color.WHITE);
            tr6.setText("T");
        } else {
            tr6.setBackground(Color.GREEN);
            tr6.setText("F");

        }
    }//GEN-LAST:event_tr6ActionPerformed

    private void tr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr5ActionPerformed
        if (tr5.isSelected()) {
            tr5.setBackground(Color.WHITE);
            tr5.setText("T");
        } else {
            tr5.setBackground(Color.GREEN);
            tr5.setText("F");

        }
    }//GEN-LAST:event_tr5ActionPerformed

    private void tr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr4ActionPerformed
        if (tr4.isSelected()) {
            tr4.setBackground(Color.WHITE);
            tr4.setText("T");
        } else {
            tr4.setBackground(Color.GREEN);
            tr4.setText("F");

        }
    }//GEN-LAST:event_tr4ActionPerformed

    private void tr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr3ActionPerformed
        if (tr3.isSelected()) {
            tr3.setBackground(Color.WHITE);
            tr3.setText("T");
        } else {
            tr3.setBackground(Color.GREEN);
            tr3.setText("F");

        }
    }//GEN-LAST:event_tr3ActionPerformed

    private void tr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr2ActionPerformed
        if (tr2.isSelected()) {
            tr2.setBackground(Color.WHITE);
            tr2.setText("T");
        } else {
            tr2.setBackground(Color.GREEN);
            tr2.setText("F");

        }
    }//GEN-LAST:event_tr2ActionPerformed

    private void tr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr1ActionPerformed

        if (tr1.isSelected()) {
            tr1.setBackground(Color.WHITE);
            tr1.setText("T");
        } else {
            tr1.setBackground(Color.GREEN);
            tr1.setText("F");

        }
    }//GEN-LAST:event_tr1ActionPerformed

    private void tr63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr63ActionPerformed
        if (tr63.isSelected()) {
            tr63.setBackground(Color.WHITE);
            tr63.setText("T");
        } else {
            tr63.setBackground(Color.GREEN);
            tr63.setText("F");

        }
    }//GEN-LAST:event_tr63ActionPerformed

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
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Training.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Training().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JRadioButton radio_biner;
    private javax.swing.JRadioButton radio_bipolar;
    private javax.swing.JToggleButton t1;
    private javax.swing.JToggleButton t2;
    private javax.swing.JToggleButton t3;
    private javax.swing.JToggleButton t4;
    private javax.swing.JToggleButton t5;
    private javax.swing.JToggleButton t6;
    private javax.swing.JToggleButton t7;
    private javax.swing.JToggleButton tr1;
    private javax.swing.JToggleButton tr10;
    private javax.swing.JToggleButton tr11;
    private javax.swing.JToggleButton tr12;
    private javax.swing.JToggleButton tr13;
    private javax.swing.JToggleButton tr14;
    private javax.swing.JToggleButton tr15;
    private javax.swing.JToggleButton tr16;
    private javax.swing.JToggleButton tr17;
    private javax.swing.JToggleButton tr18;
    private javax.swing.JToggleButton tr19;
    private javax.swing.JToggleButton tr2;
    private javax.swing.JToggleButton tr20;
    private javax.swing.JToggleButton tr21;
    private javax.swing.JToggleButton tr22;
    private javax.swing.JToggleButton tr23;
    private javax.swing.JToggleButton tr24;
    private javax.swing.JToggleButton tr25;
    private javax.swing.JToggleButton tr26;
    private javax.swing.JToggleButton tr27;
    private javax.swing.JToggleButton tr28;
    private javax.swing.JToggleButton tr29;
    private javax.swing.JToggleButton tr3;
    private javax.swing.JToggleButton tr30;
    private javax.swing.JToggleButton tr31;
    private javax.swing.JToggleButton tr32;
    private javax.swing.JToggleButton tr33;
    private javax.swing.JToggleButton tr34;
    private javax.swing.JToggleButton tr35;
    private javax.swing.JToggleButton tr36;
    private javax.swing.JToggleButton tr37;
    private javax.swing.JToggleButton tr38;
    private javax.swing.JToggleButton tr39;
    private javax.swing.JToggleButton tr4;
    private javax.swing.JToggleButton tr40;
    private javax.swing.JToggleButton tr41;
    private javax.swing.JToggleButton tr42;
    private javax.swing.JToggleButton tr43;
    private javax.swing.JToggleButton tr44;
    private javax.swing.JToggleButton tr45;
    private javax.swing.JToggleButton tr46;
    private javax.swing.JToggleButton tr47;
    private javax.swing.JToggleButton tr48;
    private javax.swing.JToggleButton tr49;
    private javax.swing.JToggleButton tr5;
    private javax.swing.JToggleButton tr50;
    private javax.swing.JToggleButton tr51;
    private javax.swing.JToggleButton tr52;
    private javax.swing.JToggleButton tr53;
    private javax.swing.JToggleButton tr54;
    private javax.swing.JToggleButton tr55;
    private javax.swing.JToggleButton tr56;
    private javax.swing.JToggleButton tr57;
    private javax.swing.JToggleButton tr58;
    private javax.swing.JToggleButton tr59;
    private javax.swing.JToggleButton tr6;
    private javax.swing.JToggleButton tr60;
    private javax.swing.JToggleButton tr61;
    private javax.swing.JToggleButton tr62;
    private javax.swing.JToggleButton tr63;
    private javax.swing.JToggleButton tr7;
    private javax.swing.JToggleButton tr8;
    private javax.swing.JToggleButton tr9;
    private javax.swing.JTextField tr_alpha1;
    private javax.swing.JButton tr_clear;
    private javax.swing.JTextField tr_hidden;
    private javax.swing.JTextField tr_huruf;
    private javax.swing.JTextField tr_iterasi;
    private javax.swing.JButton tr_save;
    private javax.swing.JButton tr_training;
    // End of variables declaration//GEN-END:variables
}
