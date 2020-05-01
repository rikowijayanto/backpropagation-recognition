package backrpopagation_huruf;
//baru

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.StrictMath.exp;
import javax.swing.JOptionPane;

public class Testing extends javax.swing.JFrame {
        int n;
        double B[]=new double[7];
        int t[]=new int[7];
        String[] huruf=new String[10];
        Object inputS[]= new Object[63];
        double [] z1= new double [7];
        int S[]=new int[63];
        double net[]=new double[7];
        int Target[][]=new int[7][26];
        int p=-1;
        double biastestZ [] = new double [7];
        double W[][]=new double[7][7];
        double [] biasZ = new double [7];
        double [] z_inJ = new double [7];
        double [][] v = new double [63][7];
        double [] z = new double [7];
        double y_inK [] = new double [7];
        double biasY [] = new double [7];
        double y[] = new double [7];
        int hidden;
        boolean biner;
    
    public Testing() {
        setTitle("Testing");
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
                (screenSize.width - frameSize.width)/2,
               ( screenSize.height - frameSize.height)/2);
        if(biner){
            radio_biner.setSelected(true);
            radio_bipolar.setEnabled(false);
        } else{
            radio_bipolar.setSelected(true);
            radio_biner.setEnabled(false);
        }
    }
    public Testing(double[] b, double[][] w, double [] biasZ, double [][] v,String[] Huruf,  int[][] t, int m, int hidden, boolean biner ){
        setTitle("Testing");
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
                (screenSize.width - frameSize.width)/2,
               ( screenSize.height - frameSize.height)/2);
        B=b;
        biastestZ = biasZ;
        this.v = v;
        W=w;
        huruf=Huruf;
        Target=t;
        n=m;
        this.z1=z1;
        this.hidden = hidden;
        this.biner=biner;
        if(biner){
            radio_biner.setSelected(true);
            radio_bipolar.setEnabled(false);
        } else{
            radio_bipolar.setSelected(true);
            radio_biner.setEnabled(false);
        }
    }

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tes63 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        tes1 = new javax.swing.JToggleButton();
        tes2 = new javax.swing.JToggleButton();
        tes3 = new javax.swing.JToggleButton();
        tes4 = new javax.swing.JToggleButton();
        tes5 = new javax.swing.JToggleButton();
        tes6 = new javax.swing.JToggleButton();
        tes7 = new javax.swing.JToggleButton();
        tes8 = new javax.swing.JToggleButton();
        tes9 = new javax.swing.JToggleButton();
        tes10 = new javax.swing.JToggleButton();
        tes11 = new javax.swing.JToggleButton();
        tes12 = new javax.swing.JToggleButton();
        tes13 = new javax.swing.JToggleButton();
        tes14 = new javax.swing.JToggleButton();
        tes15 = new javax.swing.JToggleButton();
        tes16 = new javax.swing.JToggleButton();
        tes17 = new javax.swing.JToggleButton();
        tes18 = new javax.swing.JToggleButton();
        tes19 = new javax.swing.JToggleButton();
        tes20 = new javax.swing.JToggleButton();
        tes21 = new javax.swing.JToggleButton();
        tes22 = new javax.swing.JToggleButton();
        tes23 = new javax.swing.JToggleButton();
        tes24 = new javax.swing.JToggleButton();
        tes25 = new javax.swing.JToggleButton();
        tes26 = new javax.swing.JToggleButton();
        tes27 = new javax.swing.JToggleButton();
        tes28 = new javax.swing.JToggleButton();
        tes29 = new javax.swing.JToggleButton();
        tes30 = new javax.swing.JToggleButton();
        tes31 = new javax.swing.JToggleButton();
        tes32 = new javax.swing.JToggleButton();
        tes33 = new javax.swing.JToggleButton();
        tes34 = new javax.swing.JToggleButton();
        tes35 = new javax.swing.JToggleButton();
        tes36 = new javax.swing.JToggleButton();
        tes37 = new javax.swing.JToggleButton();
        tes38 = new javax.swing.JToggleButton();
        tes39 = new javax.swing.JToggleButton();
        tes40 = new javax.swing.JToggleButton();
        tes41 = new javax.swing.JToggleButton();
        tes42 = new javax.swing.JToggleButton();
        tes43 = new javax.swing.JToggleButton();
        tes44 = new javax.swing.JToggleButton();
        tes45 = new javax.swing.JToggleButton();
        tes46 = new javax.swing.JToggleButton();
        tes47 = new javax.swing.JToggleButton();
        tes48 = new javax.swing.JToggleButton();
        tes49 = new javax.swing.JToggleButton();
        tes50 = new javax.swing.JToggleButton();
        tes51 = new javax.swing.JToggleButton();
        tes52 = new javax.swing.JToggleButton();
        tes53 = new javax.swing.JToggleButton();
        tes54 = new javax.swing.JToggleButton();
        tes55 = new javax.swing.JToggleButton();
        tes56 = new javax.swing.JToggleButton();
        tes57 = new javax.swing.JToggleButton();
        tes58 = new javax.swing.JToggleButton();
        tes59 = new javax.swing.JToggleButton();
        tes60 = new javax.swing.JToggleButton();
        tes61 = new javax.swing.JToggleButton();
        tes62 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        T7 = new javax.swing.JToggleButton();
        T1 = new javax.swing.JToggleButton();
        T2 = new javax.swing.JToggleButton();
        T3 = new javax.swing.JToggleButton();
        T4 = new javax.swing.JToggleButton();
        T5 = new javax.swing.JToggleButton();
        T6 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        tes_huruf = new javax.swing.JTextField();
        tes_keterangan = new javax.swing.JTextField();
        tes_testing = new javax.swing.JButton();
        tes_refresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        radio_biner = new javax.swing.JRadioButton();
        radio_bipolar = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TRAINING MODE");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Testing - Pengenalan Huruf");
        setBackground(new java.awt.Color(255, 255, 0));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tes63.setBackground(java.awt.Color.green);
        tes63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes63.setText("F");
        tes63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes63ActionPerformed(evt);
            }
        });
        jPanel1.add(tes63, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pola Huruf");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        tes1.setBackground(java.awt.Color.green);
        tes1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes1.setText("F");
        tes1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes1ActionPerformed(evt);
            }
        });
        jPanel1.add(tes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 30, 30));

        tes2.setBackground(java.awt.Color.green);
        tes2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes2.setText("F");
        tes2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes2ActionPerformed(evt);
            }
        });
        jPanel1.add(tes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, 30));

        tes3.setBackground(java.awt.Color.green);
        tes3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes3.setText("F");
        tes3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes3ActionPerformed(evt);
            }
        });
        jPanel1.add(tes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 30, 30));

        tes4.setBackground(java.awt.Color.green);
        tes4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes4.setText("F");
        tes4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes4ActionPerformed(evt);
            }
        });
        jPanel1.add(tes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 30, 30));

        tes5.setBackground(java.awt.Color.green);
        tes5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes5.setText("F");
        tes5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes5ActionPerformed(evt);
            }
        });
        jPanel1.add(tes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 30, 30));

        tes6.setBackground(java.awt.Color.green);
        tes6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes6.setText("F");
        tes6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes6ActionPerformed(evt);
            }
        });
        jPanel1.add(tes6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 30, 30));

        tes7.setBackground(java.awt.Color.green);
        tes7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes7.setText("F");
        tes7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes7ActionPerformed(evt);
            }
        });
        jPanel1.add(tes7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 30, 30));

        tes8.setBackground(java.awt.Color.green);
        tes8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes8.setText("F");
        tes8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes8ActionPerformed(evt);
            }
        });
        jPanel1.add(tes8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, 30));

        tes9.setBackground(java.awt.Color.green);
        tes9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes9.setText("F");
        tes9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes9ActionPerformed(evt);
            }
        });
        jPanel1.add(tes9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 30, 30));

        tes10.setBackground(java.awt.Color.green);
        tes10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes10.setText("F");
        tes10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes10ActionPerformed(evt);
            }
        });
        jPanel1.add(tes10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 30, 30));

        tes11.setBackground(java.awt.Color.green);
        tes11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes11.setText("F");
        tes11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes11ActionPerformed(evt);
            }
        });
        jPanel1.add(tes11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 30, 30));

        tes12.setBackground(java.awt.Color.green);
        tes12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes12.setText("F");
        tes12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes12ActionPerformed(evt);
            }
        });
        jPanel1.add(tes12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 30, 30));

        tes13.setBackground(java.awt.Color.green);
        tes13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes13.setText("F");
        tes13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes13ActionPerformed(evt);
            }
        });
        jPanel1.add(tes13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 30, 30));

        tes14.setBackground(java.awt.Color.green);
        tes14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes14.setText("F");
        tes14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes14ActionPerformed(evt);
            }
        });
        jPanel1.add(tes14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, 30));

        tes15.setBackground(java.awt.Color.green);
        tes15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes15.setText("F");
        tes15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes15ActionPerformed(evt);
            }
        });
        jPanel1.add(tes15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 30, 30));

        tes16.setBackground(java.awt.Color.green);
        tes16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes16.setText("F");
        tes16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes16ActionPerformed(evt);
            }
        });
        jPanel1.add(tes16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 30, 30));

        tes17.setBackground(java.awt.Color.green);
        tes17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes17.setText("F");
        tes17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes17ActionPerformed(evt);
            }
        });
        jPanel1.add(tes17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 30, 30));

        tes18.setBackground(java.awt.Color.green);
        tes18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes18.setText("F");
        tes18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes18ActionPerformed(evt);
            }
        });
        jPanel1.add(tes18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 30, 30));

        tes19.setBackground(java.awt.Color.green);
        tes19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes19.setText("F");
        tes19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes19ActionPerformed(evt);
            }
        });
        jPanel1.add(tes19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 30, 30));

        tes20.setBackground(java.awt.Color.green);
        tes20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes20.setText("F");
        tes20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes20ActionPerformed(evt);
            }
        });
        jPanel1.add(tes20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 30, 30));

        tes21.setBackground(java.awt.Color.green);
        tes21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes21.setText("F");
        tes21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes21ActionPerformed(evt);
            }
        });
        jPanel1.add(tes21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 30, 30));

        tes22.setBackground(java.awt.Color.green);
        tes22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes22.setText("F");
        tes22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes22ActionPerformed(evt);
            }
        });
        jPanel1.add(tes22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 30, 30));

        tes23.setBackground(java.awt.Color.green);
        tes23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes23.setText("F");
        tes23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes23ActionPerformed(evt);
            }
        });
        jPanel1.add(tes23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 30, 30));

        tes24.setBackground(java.awt.Color.green);
        tes24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes24.setText("F");
        tes24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes24ActionPerformed(evt);
            }
        });
        jPanel1.add(tes24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 30, 30));

        tes25.setBackground(java.awt.Color.green);
        tes25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes25.setText("F");
        tes25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes25ActionPerformed(evt);
            }
        });
        jPanel1.add(tes25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 30, 30));

        tes26.setBackground(java.awt.Color.green);
        tes26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes26.setText("F");
        tes26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes26ActionPerformed(evt);
            }
        });
        jPanel1.add(tes26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 30, 30));

        tes27.setBackground(java.awt.Color.green);
        tes27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes27.setText("F");
        tes27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes27ActionPerformed(evt);
            }
        });
        jPanel1.add(tes27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 30, 30));

        tes28.setBackground(java.awt.Color.green);
        tes28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes28.setText("F");
        tes28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes28ActionPerformed(evt);
            }
        });
        jPanel1.add(tes28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 30, 30));

        tes29.setBackground(java.awt.Color.green);
        tes29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes29.setText("F");
        tes29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes29ActionPerformed(evt);
            }
        });
        jPanel1.add(tes29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 30, 30));

        tes30.setBackground(java.awt.Color.green);
        tes30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes30.setText("F");
        tes30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes30ActionPerformed(evt);
            }
        });
        jPanel1.add(tes30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 30, 30));

        tes31.setBackground(java.awt.Color.green);
        tes31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes31.setText("F");
        tes31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes31ActionPerformed(evt);
            }
        });
        jPanel1.add(tes31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 30, 30));

        tes32.setBackground(java.awt.Color.green);
        tes32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes32.setText("F");
        tes32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes32ActionPerformed(evt);
            }
        });
        jPanel1.add(tes32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 30, 30));

        tes33.setBackground(java.awt.Color.green);
        tes33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes33.setText("F");
        tes33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes33ActionPerformed(evt);
            }
        });
        jPanel1.add(tes33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 30, 30));

        tes34.setBackground(java.awt.Color.green);
        tes34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes34.setText("F");
        tes34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes34ActionPerformed(evt);
            }
        });
        jPanel1.add(tes34, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 30, 30));

        tes35.setBackground(java.awt.Color.green);
        tes35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes35.setText("F");
        tes35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes35ActionPerformed(evt);
            }
        });
        jPanel1.add(tes35, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 30, 30));

        tes36.setBackground(java.awt.Color.green);
        tes36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes36.setText("F");
        tes36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes36ActionPerformed(evt);
            }
        });
        jPanel1.add(tes36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 30, 30));

        tes37.setBackground(java.awt.Color.green);
        tes37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes37.setText("F");
        tes37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes37ActionPerformed(evt);
            }
        });
        jPanel1.add(tes37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 30, 30));

        tes38.setBackground(java.awt.Color.green);
        tes38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes38.setText("F");
        tes38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes38ActionPerformed(evt);
            }
        });
        jPanel1.add(tes38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 30, 30));

        tes39.setBackground(java.awt.Color.green);
        tes39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes39.setText("F");
        tes39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes39ActionPerformed(evt);
            }
        });
        jPanel1.add(tes39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 30, 30));

        tes40.setBackground(java.awt.Color.green);
        tes40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes40.setText("F");
        tes40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes40ActionPerformed(evt);
            }
        });
        jPanel1.add(tes40, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 30, 30));

        tes41.setBackground(java.awt.Color.green);
        tes41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes41.setText("F");
        tes41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes41ActionPerformed(evt);
            }
        });
        jPanel1.add(tes41, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 30, 30));

        tes42.setBackground(java.awt.Color.green);
        tes42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes42.setText("F");
        tes42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes42ActionPerformed(evt);
            }
        });
        jPanel1.add(tes42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 30, 30));

        tes43.setBackground(java.awt.Color.green);
        tes43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes43.setText("F");
        tes43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes43ActionPerformed(evt);
            }
        });
        jPanel1.add(tes43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 30, 30));

        tes44.setBackground(java.awt.Color.green);
        tes44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes44.setText("F");
        tes44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes44ActionPerformed(evt);
            }
        });
        jPanel1.add(tes44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 30, 30));

        tes45.setBackground(java.awt.Color.green);
        tes45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes45.setText("F");
        tes45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes45ActionPerformed(evt);
            }
        });
        jPanel1.add(tes45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 30, 30));

        tes46.setBackground(java.awt.Color.green);
        tes46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes46.setText("F");
        tes46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes46ActionPerformed(evt);
            }
        });
        jPanel1.add(tes46, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 30, 30));

        tes47.setBackground(java.awt.Color.green);
        tes47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes47.setText("F");
        tes47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes47ActionPerformed(evt);
            }
        });
        jPanel1.add(tes47, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 30, 30));

        tes48.setBackground(java.awt.Color.green);
        tes48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes48.setText("F");
        tes48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes48ActionPerformed(evt);
            }
        });
        jPanel1.add(tes48, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 30, 30));

        tes49.setBackground(java.awt.Color.green);
        tes49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes49.setText("F");
        tes49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes49ActionPerformed(evt);
            }
        });
        jPanel1.add(tes49, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 30, 30));

        tes50.setBackground(java.awt.Color.green);
        tes50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes50.setText("F");
        tes50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes50ActionPerformed(evt);
            }
        });
        jPanel1.add(tes50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 30, 30));

        tes51.setBackground(java.awt.Color.green);
        tes51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes51.setText("F");
        tes51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes51ActionPerformed(evt);
            }
        });
        jPanel1.add(tes51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 30, 30));

        tes52.setBackground(java.awt.Color.green);
        tes52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes52.setText("F");
        tes52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes52ActionPerformed(evt);
            }
        });
        jPanel1.add(tes52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 30, 30));

        tes53.setBackground(java.awt.Color.green);
        tes53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes53.setText("F");
        tes53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes53ActionPerformed(evt);
            }
        });
        jPanel1.add(tes53, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 30, 30));

        tes54.setBackground(java.awt.Color.green);
        tes54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes54.setText("F");
        tes54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes54ActionPerformed(evt);
            }
        });
        jPanel1.add(tes54, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 30, 30));

        tes55.setBackground(java.awt.Color.green);
        tes55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes55.setText("F");
        tes55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes55ActionPerformed(evt);
            }
        });
        jPanel1.add(tes55, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 30, 30));

        tes56.setBackground(java.awt.Color.green);
        tes56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes56.setText("F");
        tes56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes56ActionPerformed(evt);
            }
        });
        jPanel1.add(tes56, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 30, 30));

        tes57.setBackground(java.awt.Color.green);
        tes57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes57.setText("F");
        tes57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes57ActionPerformed(evt);
            }
        });
        jPanel1.add(tes57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 30, 30));

        tes58.setBackground(java.awt.Color.green);
        tes58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes58.setText("F");
        tes58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes58ActionPerformed(evt);
            }
        });
        jPanel1.add(tes58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 30, 30));

        tes59.setBackground(java.awt.Color.green);
        tes59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes59.setText("F");
        tes59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes59ActionPerformed(evt);
            }
        });
        jPanel1.add(tes59, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 30, 30));

        tes60.setBackground(java.awt.Color.green);
        tes60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes60.setText("F");
        tes60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes60ActionPerformed(evt);
            }
        });
        jPanel1.add(tes60, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 30, 30));

        tes61.setBackground(java.awt.Color.green);
        tes61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes61.setText("F");
        tes61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes61ActionPerformed(evt);
            }
        });
        jPanel1.add(tes61, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 30, 30));

        tes62.setBackground(java.awt.Color.green);
        tes62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tes62.setText("F");
        tes62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tes62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes62ActionPerformed(evt);
            }
        });
        jPanel1.add(tes62, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 30, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Huruf");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 20));

        T7.setBackground(java.awt.Color.green);
        T7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        T7.setText("F");
        T7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T7ActionPerformed(evt);
            }
        });
        jPanel2.add(T7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 30, 30));

        T1.setBackground(java.awt.Color.green);
        T1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        T1.setText("F");
        T1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T1MouseClicked(evt);
            }
        });
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        jPanel2.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 30, 30));

        T2.setBackground(java.awt.Color.green);
        T2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        T2.setText("F");
        T2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });
        jPanel2.add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 30, 30));

        T3.setBackground(java.awt.Color.green);
        T3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        T3.setText("F");
        T3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T3ActionPerformed(evt);
            }
        });
        jPanel2.add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 30, 30));

        T4.setBackground(java.awt.Color.green);
        T4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        T4.setText("F");
        T4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T4ActionPerformed(evt);
            }
        });
        jPanel2.add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 30, 30));

        T5.setBackground(java.awt.Color.green);
        T5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        T5.setText("F");
        T5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T5ActionPerformed(evt);
            }
        });
        jPanel2.add(T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 30, 30));

        T6.setBackground(java.awt.Color.green);
        T6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        T6.setText("F");
        T6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T6ActionPerformed(evt);
            }
        });
        jPanel2.add(T6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 30, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Huruf :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        tes_huruf.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        tes_huruf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tes_huruf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes_hurufActionPerformed(evt);
            }
        });
        tes_huruf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tes_hurufKeyTyped(evt);
            }
        });
        jPanel2.add(tes_huruf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, 60));

        tes_keterangan.setBackground(new java.awt.Color(0, 102, 204));
        tes_keterangan.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        tes_keterangan.setForeground(new java.awt.Color(255, 255, 255));
        tes_keterangan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tes_keterangan.setBorder(null);
        tes_keterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes_keteranganActionPerformed(evt);
            }
        });
        jPanel2.add(tes_keterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 180, -1));

        tes_testing.setBackground(new java.awt.Color(255, 255, 0));
        tes_testing.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tes_testing.setText("TEST");
        tes_testing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes_testingActionPerformed(evt);
            }
        });

        tes_refresh.setBackground(new java.awt.Color(255, 255, 0));
        tes_refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tes_refresh.setText("REFRESH");
        tes_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes_refreshActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.blue);
        jLabel4.setText("PROGRAM PENGENALAN HURUF");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.blue);
        jLabel5.setText("TESTING MODE - BACKPROPAGATION");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backpropagation_gambar/lambang-its-png-v1.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Institut Teknologi Sepuluh Nopember Surabaya");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel9.setText("Riko Wijayanto & Ayu Ni'matul F.");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backpropagation_gambar/pencil-2998243_960_720.png"))); // NOI18N

        radio_biner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radio_biner.setText("Biner");
        radio_biner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_binerActionPerformed(evt);
            }
        });

        radio_bipolar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radio_bipolar.setText("Bipolar");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tes_testing, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tes_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10)
                                    .addGap(17, 17, 17)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(radio_bipolar)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(radio_biner)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(radio_biner))
                                    .addComponent(jButton1))
                                .addGap(3, 3, 3)
                                .addComponent(radio_bipolar))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tes_testing, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tes_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T7ActionPerformed
        JOptionPane.showMessageDialog(null, "Anda tidak dapat memilih kode huruf");
    }//GEN-LAST:event_T7ActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        JOptionPane.showMessageDialog(null, "Anda tidak dapat memilih kode huruf");
        
    }//GEN-LAST:event_T1ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        JOptionPane.showMessageDialog(null, "Anda tidak dapat memilih kode huruf");
    }//GEN-LAST:event_T2ActionPerformed

    private void T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T3ActionPerformed
        JOptionPane.showMessageDialog(null, "Anda tidak dapat memilih kode huruf");
    }//GEN-LAST:event_T3ActionPerformed

    private void T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T4ActionPerformed
        JOptionPane.showMessageDialog(null, "Anda tidak dapat memilih kode huruf");
    }//GEN-LAST:event_T4ActionPerformed

    private void T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T5ActionPerformed
        JOptionPane.showMessageDialog(null, "Anda tidak dapat memilih kode huruf");
    }//GEN-LAST:event_T5ActionPerformed

    private void T6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T6ActionPerformed
        JOptionPane.showMessageDialog(null, "Anda tidak dapat memilih kode huruf");
    }//GEN-LAST:event_T6ActionPerformed

    private void tes_hurufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes_hurufActionPerformed
        tes_huruf.enable(false);
        JOptionPane.showMessageDialog(null, "Anda tidak dapat memasukkan huruf");
    }//GEN-LAST:event_tes_hurufActionPerformed

    private void tes_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes_refreshActionPerformed
        // TODO add your handling code here:
        p = -1;
//        radio_biner.setSelected(false);
//        radio_bipolar.setSelected(false);
        tes_keterangan.setText("");
        tes_huruf.setBackground(Color.WHITE);
        tes1.setSelected(false);
        tes1.setBackground(Color.GREEN);
        tes2.setSelected(false);
        tes2.setBackground(Color.GREEN);
        tes3.setSelected(false);
        tes3.setBackground(Color.GREEN);
        tes4.setSelected(false);
        tes4.setBackground(Color.GREEN);
        tes5.setSelected(false);
        tes5.setBackground(Color.GREEN);
        tes6.setSelected(false);
        tes6.setBackground(Color.GREEN);
        tes7.setSelected(false);
        tes7.setBackground(Color.GREEN);
        tes8.setSelected(false);
        tes8.setBackground(Color.GREEN);
        tes9.setSelected(false);
        tes9.setBackground(Color.GREEN);
        tes10.setSelected(false);
        tes10.setBackground(Color.GREEN);
        tes11.setSelected(false);
        tes11.setBackground(Color.GREEN);
        tes12.setSelected(false);
        tes12.setBackground(Color.GREEN);
        tes13.setSelected(false);
        tes13.setBackground(Color.GREEN);
        tes14.setSelected(false);
        tes14.setBackground(Color.GREEN);
        tes15.setSelected(false);
        tes15.setBackground(Color.GREEN);
        tes16.setSelected(false);
        tes16.setBackground(Color.GREEN);
        tes17.setSelected(false);
        tes17.setBackground(Color.GREEN);
        tes18.setSelected(false);
        tes18.setBackground(Color.GREEN);
        tes19.setSelected(false);
        tes19.setBackground(Color.GREEN);
        tes20.setSelected(false);
        tes20.setBackground(Color.GREEN);
        tes21.setSelected(false);
        tes21.setBackground(Color.GREEN);
        tes22.setSelected(false);
        tes22.setBackground(Color.GREEN);
        tes23.setSelected(false);
        tes23.setBackground(Color.GREEN);
        tes24.setSelected(false);
        tes24.setBackground(Color.GREEN);
        tes25.setSelected(false);
        tes25.setBackground(Color.GREEN);
        tes26.setSelected(false);
        tes26.setBackground(Color.GREEN);
        tes27.setSelected(false);
        tes27.setBackground(Color.GREEN);
        tes28.setSelected(false);
        tes28.setBackground(Color.GREEN);
        tes29.setSelected(false);
        tes29.setBackground(Color.GREEN);
        tes30.setSelected(false);
        tes30.setBackground(Color.GREEN);
        tes31.setSelected(false);
        tes31.setBackground(Color.GREEN);
        tes32.setSelected(false);
        tes32.setBackground(Color.GREEN);
        tes33.setSelected(false);
        tes33.setBackground(Color.GREEN);
        tes34.setSelected(false);
        tes34.setBackground(Color.GREEN);
        tes35.setSelected(false);
        tes35.setBackground(Color.GREEN);
        tes36.setSelected(false);
        tes36.setBackground(Color.GREEN);
        tes37.setSelected(false);
        tes37.setBackground(Color.GREEN);
        tes38.setSelected(false);
        tes38.setBackground(Color.GREEN);
        tes39.setSelected(false);
        tes39.setBackground(Color.GREEN);
        tes40.setSelected(false);
        tes40.setBackground(Color.GREEN);
        tes41.setSelected(false);
        tes41.setBackground(Color.GREEN);
        tes42.setSelected(false);
        tes42.setBackground(Color.GREEN);
        tes43.setSelected(false);
        tes43.setBackground(Color.GREEN);
        tes44.setSelected(false);
        tes44.setBackground(Color.GREEN);
        tes45.setSelected(false);
        tes45.setBackground(Color.GREEN);
        tes46.setSelected(false);
        tes46.setBackground(Color.GREEN);
        tes47.setSelected(false);
        tes47.setBackground(Color.GREEN);
        tes48.setSelected(false);
        tes48.setBackground(Color.GREEN);
        tes49.setSelected(false);
        tes49.setBackground(Color.GREEN);
        tes50.setSelected(false);
        tes50.setBackground(Color.GREEN);
        tes51.setSelected(false);
        tes51.setBackground(Color.GREEN);

        tes52.setSelected(false);
        tes52.setBackground(Color.GREEN);
        tes53.setSelected(false);
        tes53.setBackground(Color.GREEN);
        tes54.setSelected(false);
        tes54.setBackground(Color.GREEN);
        tes55.setSelected(false);
        tes55.setBackground(Color.GREEN);
        tes56.setSelected(false);
        tes56.setBackground(Color.GREEN);
        tes57.setSelected(false);
        tes57.setBackground(Color.GREEN);
        tes58.setSelected(false);
        tes58.setBackground(Color.GREEN);
        tes59.setSelected(false);
        tes59.setBackground(Color.GREEN);
        tes60.setSelected(false);
        tes60.setBackground(Color.GREEN);
        tes61.setSelected(false);
        tes61.setBackground(Color.GREEN);
        tes62.setSelected(false);
        tes62.setBackground(Color.GREEN);
        tes63.setSelected(false);
        tes63.setBackground(Color.GREEN);
        
        
        T1.setSelected(false);
        T1.setBackground(Color.GREEN);
        T2.setSelected(false);
        T2.setBackground(Color.GREEN);
        T3.setSelected(false);
        T3.setBackground(Color.GREEN);
        T4.setSelected(false);
        T4.setBackground(Color.GREEN);
        T5.setSelected(false);
        T5.setBackground(Color.GREEN);
        T6.setSelected(false);
        T6.setBackground(Color.GREEN);
        T7.setSelected(false);
        T7.setBackground(Color.GREEN);
        
        tes1.setText("F");
        tes2.setText("F");
        tes3.setText("F");
        tes4.setText("F");
        tes5.setText("F");
        tes6.setText("F");
        tes7.setText("F");
        tes8.setText("F");
        tes9.setText("F");
        tes10.setText("F");
        tes11.setText("F");
        tes12.setText("F");
        tes13.setText("F");
        tes14.setText("F");
        tes15.setText("F");
        tes16.setText("F");
        tes17.setText("F");
        tes18.setText("F");
        tes19.setText("F");
        tes20.setText("F");
        tes21.setText("F");
        tes22.setText("F");
        tes23.setText("F");
        tes24.setText("F");
        tes25.setText("F");
        tes26.setText("F");
        tes27.setText("F");
        tes28.setText("F");
        tes29.setText("F");
        tes30.setText("F");
        tes31.setText("F");
        tes32.setText("F");
        tes33.setText("F");
        tes34.setText("F");
        tes35.setText("F");
        tes36.setText("F");
        tes37.setText("F");
        tes38.setText("F");
        tes39.setText("F");
        tes40.setText("F");
        tes41.setText("F");
        tes42.setText("F");
        tes43.setText("F");
        tes44.setText("F");
        tes45.setText("F");
        tes46.setText("F");
        tes47.setText("F");
        tes48.setText("F");
        tes49.setText("F");
        tes50.setText("F");
        tes51.setText("F");
        tes52.setText("F");
        tes53.setText("F");
        tes54.setText("F");
        tes55.setText("F");
        tes56.setText("F");
        tes57.setText("F");
        tes58.setText("F");
        tes59.setText("F");
        tes60.setText("F");
        tes61.setText("F");
        tes62.setText("F");
        tes63.setText("F");
        
        T1.setText("F");
        T2.setText("F");
        T3.setText("F");
        T4.setText("F");
        T5.setText("F");
        T6.setText("F");
        T7.setText("F");
        
        tes_huruf.setText("");
        JOptionPane.showMessageDialog(null, "Refresh sukses");
    }//GEN-LAST:event_tes_refreshActionPerformed

    private void tes_testingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes_testingActionPerformed
        // TODO add your handling code here:
        inputS[0]=tes1.getSelectedObjects();
        inputS[1]=tes2.getSelectedObjects();
        inputS[2]=tes3.getSelectedObjects();
        inputS[3]=tes4.getSelectedObjects();
        inputS[4]=tes5.getSelectedObjects();
        inputS[5]=tes6.getSelectedObjects();
        inputS[6]=tes7.getSelectedObjects();
        inputS[7]=tes8.getSelectedObjects();
        inputS[8]=tes9.getSelectedObjects();
        inputS[9]=tes10.getSelectedObjects();
        inputS[10]=tes11.getSelectedObjects();
        inputS[11]=tes12.getSelectedObjects();
        inputS[12]=tes13.getSelectedObjects();
        inputS[13]=tes14.getSelectedObjects();
        inputS[14]=tes15.getSelectedObjects();
        inputS[15]=tes16.getSelectedObjects();
        inputS[16]=tes17.getSelectedObjects();
        inputS[17]=tes18.getSelectedObjects();
        inputS[18]=tes19.getSelectedObjects();
        inputS[19]=tes20.getSelectedObjects();
        inputS[20]=tes21.getSelectedObjects();
        inputS[21]=tes22.getSelectedObjects();
        inputS[22]=tes23.getSelectedObjects();
        inputS[23]=tes24.getSelectedObjects();
        inputS[24]=tes25.getSelectedObjects();
        inputS[25]=tes26.getSelectedObjects();       
        inputS[26]=tes27.getSelectedObjects();
        inputS[27]=tes28.getSelectedObjects();
        inputS[28]=tes29.getSelectedObjects();
        inputS[29]=tes30.getSelectedObjects();
        inputS[30]=tes31.getSelectedObjects();
        inputS[31]=tes32.getSelectedObjects();
        inputS[32]=tes33.getSelectedObjects();
        inputS[33]=tes34.getSelectedObjects();
        inputS[34]=tes35.getSelectedObjects();
        inputS[35]=tes36.getSelectedObjects();
        inputS[36]=tes37.getSelectedObjects();
        inputS[37]=tes38.getSelectedObjects();
        inputS[38]=tes39.getSelectedObjects();
        inputS[39]=tes40.getSelectedObjects();
        inputS[40]=tes41.getSelectedObjects();
        inputS[41]=tes42.getSelectedObjects();
        inputS[42]=tes43.getSelectedObjects();
        inputS[43]=tes44.getSelectedObjects();
        inputS[44]=tes45.getSelectedObjects();
        inputS[45]=tes46.getSelectedObjects();
        inputS[46]=tes47.getSelectedObjects();
        inputS[47]=tes48.getSelectedObjects();
        inputS[48]=tes49.getSelectedObjects();
        inputS[49]=tes50.getSelectedObjects();
        inputS[50]=tes51.getSelectedObjects();
        inputS[51]=tes52.getSelectedObjects();
        inputS[52]=tes53.getSelectedObjects();
        inputS[53]=tes54.getSelectedObjects();
        inputS[54]=tes55.getSelectedObjects();
        inputS[55]=tes56.getSelectedObjects();
        inputS[56]=tes57.getSelectedObjects();
        inputS[57]=tes58.getSelectedObjects();
        inputS[58]=tes59.getSelectedObjects();
        inputS[59]=tes60.getSelectedObjects();
        inputS[60]=tes61.getSelectedObjects();
        inputS[61]=tes62.getSelectedObjects();
        inputS[62]=tes63.getSelectedObjects(); 
        
       
   
        for(int i=0;i<63; i++){
            if(radio_biner.isSelected()) {
                if(inputS[i]!=null) {
                    S[i]=1;
            } else {
                    S[i]=0;
                }
        } else if (radio_bipolar.isSelected()){
                 if(inputS[i]!=null) {
                    S[i]=1;
            } else {
                    S[i]=-1;
                }
            }
        }
        
        
        for(int i=0; i<hidden; i++){
            z_inJ[i]=0.0;
          for(int j=0; j<63; j++){
              z_inJ[i]=z_inJ[i]+(S[j]*v[j][i]);
          }
          z_inJ[i] = z_inJ[i]+biastestZ[i];
        }
      
        
      for(int j=0; j<hidden; j++) {
          if(radio_biner.isSelected()) {
          z[j] =Sigmoid(z_inJ[j]);
          } else if(radio_bipolar.isSelected()){
              z[j] =Sigmoid2(z_inJ[j]);
          }
      }
    

        for(int i=0; i<7; i++){
            y_inK[i]=0.0;
          for(int j=0; j<hidden; j++){
              y_inK[i]=y_inK[i]+(z[j]*W[j][i]);
          }
          y_inK[i] = y_inK[i]+B[i];
      }
      
      
     
      for(int j=0; j<7; j++) {
          if(radio_biner.isSelected()) {
          y[j] = Sigmoid(y_inK[j]);
          } else if(radio_bipolar.isSelected()){
            y[j] = Sigmoid2(y_inK[j]);  
          }
        
      }
        System.out.println(y[6]);
       

      for ( int k=0; k<7; k++) {
          if(radio_biner.isSelected()) {
                t[k] = (int)(Math.round(y[k]));
                } else if(radio_bipolar.isSelected()) {
                    if(y[k] > 0) {
                    t[k] = (int)(Math.ceil(y[k]));
                    
                } else {
                    t[k] = (int)(Math.floor(y[k]));
                   
             }
           }
        }
      
      
        if(t[0]==1) {
            T1.setSelected(true);
            T1.setText("T");
            T1.setBackground(Color.WHITE);
        }
        if(t[1]==1) {
            T2.setSelected(true);
            T2.setText("T");
            T2.setBackground(Color.WHITE);
        }
        if(t[2]==1) {
            T3.setSelected(true);
            T3.setText("T");
            T3.setBackground(Color.WHITE);
        }
        if(t[3]==1) {
            T4.setSelected(true);
            T4.setText("T");
            T4.setBackground(Color.WHITE);
        }
        if(t[4]==1) {
            T5.setSelected(true);
            T5.setText("T");
            T5.setBackground(Color.WHITE);
        }
        if(t[5]==1) {
            T6.setSelected(true);
            T6.setText("T");
            T6.setBackground(Color.WHITE);
        }
        if(t[6]==1) {
            T7.setSelected(true);
            T7.setText("T");
            T7.setBackground(Color.WHITE);
        }
        
        for(int m=0; m<n; m++){
            if((Target[0][m]==t[0])&&(Target[1][m]==t[1])&&(Target[2][m]==t[2])&&
                    (Target[3][m]==t[3])&&(Target[4][m]==t[4])&&(Target[5][m]==t[5])
                    &&(Target[6][m]==t[6]))
                     p=m;  
        } 
        
        if(p!=-1){
            tes_huruf.setText(huruf[p]);
            tes_keterangan.setText("*Pola huruf dikenali dengan baik");}
        else {
            tes_huruf.setText("NIHIL");
            tes_keterangan.setText("*Pola tidak dikenali dengan baik");
            tes_huruf.setBackground(Color.red);
            p=-1;
        } 
     
    }//GEN-LAST:event_tes_testingActionPerformed

    
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
    private void tes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes1ActionPerformed
        if (tes1.isSelected()) {
            tes1.setBackground(Color.WHITE);
            tes1.setText("T");
        } else {
            tes1.setBackground(Color.GREEN);
            tes1.setText("F");
            
        }
    }//GEN-LAST:event_tes1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void tes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes2ActionPerformed
        if (tes2.isSelected()) {
            tes2.setBackground(Color.WHITE);
            tes2.setText("T");
        } else {
            tes2.setBackground(Color.GREEN);
            tes2.setText("F");
            
        }
    }//GEN-LAST:event_tes2ActionPerformed

    private void tes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes3ActionPerformed
       if (tes3.isSelected()) {
            tes3.setBackground(Color.WHITE);
            tes3.setText("T");
        } else {
            tes3.setBackground(Color.GREEN);
            tes3.setText("F");
            
        }
    }//GEN-LAST:event_tes3ActionPerformed

    private void tes4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes4ActionPerformed
       if (tes4.isSelected()) {
            tes4.setBackground(Color.WHITE);
            tes4.setText("T");
        } else {
            tes4.setBackground(Color.GREEN);
            tes4.setText("F");
            
        }
    }//GEN-LAST:event_tes4ActionPerformed

    private void tes5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes5ActionPerformed
        if (tes5.isSelected()) {
            tes5.setBackground(Color.WHITE);
            tes5.setText("T");
        } else {
            tes5.setBackground(Color.GREEN);
            tes5.setText("F");
            
        }
    }//GEN-LAST:event_tes5ActionPerformed

    private void tes6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes6ActionPerformed
        if (tes6.isSelected()) {
            tes6.setBackground(Color.WHITE);
            tes6.setText("T");
        } else {
            tes6.setBackground(Color.GREEN);
            tes6.setText("F");
            
        }
    }//GEN-LAST:event_tes6ActionPerformed

    private void tes7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes7ActionPerformed
        if (tes7.isSelected()) {
            tes7.setBackground(Color.WHITE);
            tes7.setText("T");
        } else {
            tes7.setBackground(Color.GREEN);
            tes7.setText("F");
            
        }
    }//GEN-LAST:event_tes7ActionPerformed

    private void tes8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes8ActionPerformed
        if (tes8.isSelected()) {
            tes8.setBackground(Color.WHITE);
            tes8.setText("T");
        } else {
            tes8.setBackground(Color.GREEN);
            tes8.setText("F");
            
        }
    }//GEN-LAST:event_tes8ActionPerformed

    private void tes9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes9ActionPerformed
        if (tes9.isSelected()) {
            tes9.setBackground(Color.WHITE);
            tes9.setText("T");
        } else {
            tes9.setBackground(Color.GREEN);
            tes9.setText("F");
            
        }
    }//GEN-LAST:event_tes9ActionPerformed

    private void tes10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes10ActionPerformed
       if (tes10.isSelected()) {
            tes10.setBackground(Color.WHITE);
            tes10.setText("T");
        } else {
            tes10.setBackground(Color.GREEN);
            tes10.setText("F");
            
        }
    }//GEN-LAST:event_tes10ActionPerformed

    private void tes11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes11ActionPerformed
        if (tes11.isSelected()) {
            tes11.setBackground(Color.WHITE);
            tes11.setText("T");
        } else {
            tes11.setBackground(Color.GREEN);
            tes11.setText("F");
            
        }
    }//GEN-LAST:event_tes11ActionPerformed

    private void tes12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes12ActionPerformed
        if (tes12.isSelected()) {
            tes12.setBackground(Color.WHITE);
            tes12.setText("T");
        } else {
            tes12.setBackground(Color.GREEN);
            tes12.setText("F");
            
        }
    }//GEN-LAST:event_tes12ActionPerformed

    private void tes13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes13ActionPerformed
        if (tes13.isSelected()) {
            tes13.setBackground(Color.WHITE);
            tes13.setText("T");
        } else {
            tes13.setBackground(Color.GREEN);
            tes13.setText("F");
            
        }
    }//GEN-LAST:event_tes13ActionPerformed

    private void tes14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes14ActionPerformed
        if (tes14.isSelected()) {
            tes14.setBackground(Color.WHITE);
            tes14.setText("T");
        } else {
            tes14.setBackground(Color.GREEN);
            tes14.setText("F");
            
        }
    }//GEN-LAST:event_tes14ActionPerformed

    private void tes15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes15ActionPerformed
      if (tes15.isSelected()) {
            tes15.setBackground(Color.WHITE);
            tes15.setText("T");
        } else {
            tes15.setBackground(Color.GREEN);
            tes15.setText("F");
            
        }
    }//GEN-LAST:event_tes15ActionPerformed

    private void tes17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes17ActionPerformed
        if (tes17.isSelected()) {
            tes17.setBackground(Color.WHITE);
            tes17.setText("T");
        } else {
            tes17.setBackground(Color.GREEN);
            tes17.setText("F");
            
        }
    }//GEN-LAST:event_tes17ActionPerformed

    private void tes18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes18ActionPerformed
        if (tes18.isSelected()) {
            tes18.setBackground(Color.WHITE);
            tes18.setText("T");
        } else {
            tes18.setBackground(Color.GREEN);
            tes18.setText("F");
            
        }
    }//GEN-LAST:event_tes18ActionPerformed

    private void tes19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes19ActionPerformed
        if (tes19.isSelected()) {
            tes19.setBackground(Color.WHITE);
            tes19.setText("T");
        } else {
            tes19.setBackground(Color.GREEN);
            tes19.setText("F");
            
        }
    }//GEN-LAST:event_tes19ActionPerformed

    private void tes20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes20ActionPerformed
        if (tes20.isSelected()) {
            tes20.setBackground(Color.WHITE);
            tes20.setText("T");
        } else {
            tes20.setBackground(Color.GREEN);
            tes20.setText("F");
            
        }
    }//GEN-LAST:event_tes20ActionPerformed

    private void tes21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes21ActionPerformed
        if (tes21.isSelected()) {
            tes21.setBackground(Color.WHITE);
            tes21.setText("T");
        } else {
            tes21.setBackground(Color.GREEN);
            tes21.setText("F");
            
        }
    }//GEN-LAST:event_tes21ActionPerformed

    private void tes22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes22ActionPerformed
        if (tes22.isSelected()) {
            tes22.setBackground(Color.WHITE);
            tes22.setText("T");
        } else {
            tes22.setBackground(Color.GREEN);
            tes22.setText("F");
            
        }
    }//GEN-LAST:event_tes22ActionPerformed

    private void tes23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes23ActionPerformed
        if (tes23.isSelected()) {
            tes23.setBackground(Color.WHITE);
            tes23.setText("T");
        } else {
            tes23.setBackground(Color.GREEN);
            tes23.setText("F");
            
        }
    }//GEN-LAST:event_tes23ActionPerformed

    private void tes24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes24ActionPerformed
        if (tes24.isSelected()) {
            tes24.setBackground(Color.WHITE);
            tes24.setText("T");
        } else {
            tes24.setBackground(Color.GREEN);
            tes24.setText("F");
            
        }
    }//GEN-LAST:event_tes24ActionPerformed

    private void tes25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes25ActionPerformed
        if (tes25.isSelected()) {
            tes25.setBackground(Color.WHITE);
            tes25.setText("T");
        } else {
            tes25.setBackground(Color.GREEN);
            tes25.setText("F");
            
        }
    }//GEN-LAST:event_tes25ActionPerformed

    private void tes26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes26ActionPerformed
        if (tes26.isSelected()) {
            tes26.setBackground(Color.WHITE);
            tes26.setText("T");
        } else {
            tes26.setBackground(Color.GREEN);
            tes26.setText("F");
            
        }
    }//GEN-LAST:event_tes26ActionPerformed

    private void tes27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes27ActionPerformed
        if (tes27.isSelected()) {
            tes27.setBackground(Color.WHITE);
            tes27.setText("T");
        } else {
            tes27.setBackground(Color.GREEN);
            tes27.setText("F");
            
        }
    }//GEN-LAST:event_tes27ActionPerformed

    private void tes28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes28ActionPerformed
        if (tes28.isSelected()) {
            tes28.setBackground(Color.WHITE);
            tes28.setText("T");
        } else {
            tes28.setBackground(Color.GREEN);
            tes28.setText("F");
            
        }
    }//GEN-LAST:event_tes28ActionPerformed

    private void tes29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes29ActionPerformed
        if (tes29.isSelected()) {
            tes29.setBackground(Color.WHITE);
            tes29.setText("T");
        } else {
            tes29.setBackground(Color.GREEN);
            tes29.setText("F");
            
        }
    }//GEN-LAST:event_tes29ActionPerformed

    private void tes30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes30ActionPerformed
        if (tes30.isSelected()) {
            tes30.setBackground(Color.WHITE);
            tes30.setText("T");
        } else {
            tes30.setBackground(Color.GREEN);
            tes30.setText("F");
            
        }
    }//GEN-LAST:event_tes30ActionPerformed

    private void tes31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes31ActionPerformed
        if (tes31.isSelected()) {
            tes31.setBackground(Color.WHITE);
            tes31.setText("T");
        } else {
            tes31.setBackground(Color.GREEN);
            tes31.setText("F");
            
        }
    }//GEN-LAST:event_tes31ActionPerformed

    private void tes32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes32ActionPerformed
        if (tes32.isSelected()) {
            tes32.setBackground(Color.WHITE);
            tes32.setText("T");
        } else {
            tes32.setBackground(Color.GREEN);
            tes32.setText("F");
            
        }
    }//GEN-LAST:event_tes32ActionPerformed

    private void tes33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes33ActionPerformed
        if (tes33.isSelected()) {
            tes33.setBackground(Color.WHITE);
            tes33.setText("T");
        } else {
            tes33.setBackground(Color.GREEN);
            tes33.setText("F");
            
        }
    }//GEN-LAST:event_tes33ActionPerformed

    private void tes34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes34ActionPerformed
        if (tes34.isSelected()) {
            tes34.setBackground(Color.WHITE);
            tes34.setText("T");
        } else {
            tes34.setBackground(Color.GREEN);
            tes34.setText("F");
            
        }
    }//GEN-LAST:event_tes34ActionPerformed

    private void tes35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes35ActionPerformed
        if (tes35.isSelected()) {
            tes35.setBackground(Color.WHITE);
            tes35.setText("T");
        } else {
            tes35.setBackground(Color.GREEN);
            tes35.setText("F");
            
        }
    }//GEN-LAST:event_tes35ActionPerformed

    private void tes36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes36ActionPerformed
        if (tes36.isSelected()) {
            tes36.setBackground(Color.WHITE);
            tes36.setText("T");
        } else {
            tes36.setBackground(Color.GREEN);
            tes36.setText("F");
            
        }
    }//GEN-LAST:event_tes36ActionPerformed

    private void tes37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes37ActionPerformed
        if (tes37.isSelected()) {
            tes37.setBackground(Color.WHITE);
            tes37.setText("T");
        } else {
            tes37.setBackground(Color.GREEN);
            tes37.setText("F");
            
        }
    }//GEN-LAST:event_tes37ActionPerformed

    private void tes38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes38ActionPerformed
        if (tes38.isSelected()) {
            tes38.setBackground(Color.WHITE);
            tes38.setText("T");
        } else {
            tes38.setBackground(Color.GREEN);
            tes38.setText("F");
            
        }
    }//GEN-LAST:event_tes38ActionPerformed

    private void tes39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes39ActionPerformed
        if (tes39.isSelected()) {
            tes39.setBackground(Color.WHITE);
            tes39.setText("T");
        } else {
            tes39.setBackground(Color.GREEN);
            tes39.setText("F");
            
        }
    }//GEN-LAST:event_tes39ActionPerformed

    private void tes40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes40ActionPerformed
        if (tes40.isSelected()) {
            tes40.setBackground(Color.WHITE);
            tes40.setText("T");
        } else {
            tes40.setBackground(Color.GREEN);
            tes40.setText("F");
            
        }
    }//GEN-LAST:event_tes40ActionPerformed

    private void tes41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes41ActionPerformed
        if (tes41.isSelected()) {
            tes41.setBackground(Color.WHITE);
            tes41.setText("T");
        } else {
            tes41.setBackground(Color.GREEN);
            tes41.setText("F");
            
        }
    }//GEN-LAST:event_tes41ActionPerformed

    private void tes42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes42ActionPerformed
        if (tes42.isSelected()) {
            tes42.setBackground(Color.WHITE);
            tes42.setText("T");
        } else {
            tes42.setBackground(Color.GREEN);
            tes42.setText("F");
            
        }
    }//GEN-LAST:event_tes42ActionPerformed

    private void tes43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes43ActionPerformed
        if (tes43.isSelected()) {
            tes43.setBackground(Color.WHITE);
            tes43.setText("T");
        } else {
            tes43.setBackground(Color.GREEN);
            tes43.setText("F");
            
        }
    }//GEN-LAST:event_tes43ActionPerformed

    private void tes44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes44ActionPerformed
       if (tes44.isSelected()) {
            tes44.setBackground(Color.WHITE);
            tes44.setText("T");
        } else {
            tes44.setBackground(Color.GREEN);
            tes44.setText("F");
            
        }
    }//GEN-LAST:event_tes44ActionPerformed

    private void tes45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes45ActionPerformed
        if (tes45.isSelected()) {
            tes45.setBackground(Color.WHITE);
            tes45.setText("T");
        } else {
            tes45.setBackground(Color.GREEN);
            tes45.setText("F");
            
        }
    }//GEN-LAST:event_tes45ActionPerformed

    private void tes46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes46ActionPerformed
        if (tes46.isSelected()) {
            tes46.setBackground(Color.WHITE);
            tes46.setText("T");
        } else {
            tes46.setBackground(Color.GREEN);
            tes46.setText("F");
            
        }
    }//GEN-LAST:event_tes46ActionPerformed

    private void tes47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes47ActionPerformed
        if (tes47.isSelected()) {
            tes47.setBackground(Color.WHITE);
            tes47.setText("T");
        } else {
            tes47.setBackground(Color.GREEN);
            tes47.setText("F");
            
        }
    }//GEN-LAST:event_tes47ActionPerformed

    private void tes48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes48ActionPerformed
        if (tes48.isSelected()) {
            tes48.setBackground(Color.WHITE);
            tes48.setText("T");
        } else {
            tes48.setBackground(Color.GREEN);
            tes48.setText("F");
            
        }
    }//GEN-LAST:event_tes48ActionPerformed

    private void tes49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes49ActionPerformed
       if (tes49.isSelected()) {
            tes49.setBackground(Color.WHITE);
            tes49.setText("T");
        } else {
            tes49.setBackground(Color.GREEN);
            tes49.setText("F");
            
        }
    }//GEN-LAST:event_tes49ActionPerformed

    private void tes50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes50ActionPerformed
        if (tes50.isSelected()) {
            tes50.setBackground(Color.WHITE);
            tes50.setText("T");
        } else {
            tes50.setBackground(Color.GREEN);
            tes50.setText("F");
            
        }
    }//GEN-LAST:event_tes50ActionPerformed

    private void tes51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes51ActionPerformed
       if (tes51.isSelected()) {
            tes51.setBackground(Color.WHITE);
            tes51.setText("T");
        } else {
            tes51.setBackground(Color.GREEN);
            tes51.setText("F");
            
        }
    }//GEN-LAST:event_tes51ActionPerformed

    private void tes52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes52ActionPerformed
        if (tes52.isSelected()) {
            tes52.setBackground(Color.WHITE);
            tes52.setText("T");
        } else {
            tes52.setBackground(Color.GREEN);
            tes52.setText("F");
            
        }
    }//GEN-LAST:event_tes52ActionPerformed

    private void tes53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes53ActionPerformed
        if (tes53.isSelected()) {
            tes53.setBackground(Color.WHITE);
            tes53.setText("T");
        } else {
            tes53.setBackground(Color.GREEN);
            tes53.setText("F");
            
        }
    }//GEN-LAST:event_tes53ActionPerformed

    private void tes54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes54ActionPerformed
        if (tes54.isSelected()) {
            tes54.setBackground(Color.WHITE);
            tes54.setText("T");
        } else {
            tes54.setBackground(Color.GREEN);
            tes54.setText("F");
            
        }
    }//GEN-LAST:event_tes54ActionPerformed

    private void tes55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes55ActionPerformed
        if (tes55.isSelected()) {
            tes55.setBackground(Color.WHITE);
            tes55.setText("T");
        } else {
            tes55.setBackground(Color.GREEN);
            tes55.setText("F");
            
        }
    }//GEN-LAST:event_tes55ActionPerformed

    private void tes56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes56ActionPerformed
        if (tes56.isSelected()) {
            tes56.setBackground(Color.WHITE);
            tes56.setText("T");
        } else {
            tes56.setBackground(Color.GREEN);
            tes56.setText("F");
            
        }
    }//GEN-LAST:event_tes56ActionPerformed

    private void tes57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes57ActionPerformed
       if (tes57.isSelected()) {
            tes57.setBackground(Color.WHITE);
            tes57.setText("T");
        } else {
            tes57.setBackground(Color.GREEN);
            tes57.setText("F");
            
        }
    }//GEN-LAST:event_tes57ActionPerformed

    private void tes58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes58ActionPerformed
       if (tes58.isSelected()) {
            tes58.setBackground(Color.WHITE);
            tes58.setText("T");
        } else {
            tes58.setBackground(Color.GREEN);
            tes58.setText("F");
            
        }
    }//GEN-LAST:event_tes58ActionPerformed

    private void tes59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes59ActionPerformed
        if (tes59.isSelected()) {
            tes59.setBackground(Color.WHITE);
            tes59.setText("T");
        } else {
            tes59.setBackground(Color.GREEN);
            tes59.setText("F");
            
        }
    }//GEN-LAST:event_tes59ActionPerformed

    private void tes60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes60ActionPerformed
        if (tes60.isSelected()) {
            tes60.setBackground(Color.WHITE);
            tes60.setText("T");
        } else {
            tes60.setBackground(Color.GREEN);
            tes60.setText("F");
            
        }
    }//GEN-LAST:event_tes60ActionPerformed

    private void tes61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes61ActionPerformed
        if (tes61.isSelected()) {
            tes61.setBackground(Color.WHITE);
            tes61.setText("T");
        } else {
            tes61.setBackground(Color.GREEN);
            tes61.setText("F");
            
        }
    }//GEN-LAST:event_tes61ActionPerformed

    private void tes62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes62ActionPerformed
        if (tes62.isSelected()) {
            tes62.setBackground(Color.WHITE);
            tes62.setText("T");
        } else {
            tes62.setBackground(Color.GREEN);
            tes62.setText("F");
            
        }
    }//GEN-LAST:event_tes62ActionPerformed

    private void tes63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes63ActionPerformed
        if (tes63.isSelected()) {
            tes63.setBackground(Color.WHITE);
            tes63.setText("T");
        } else {
            tes63.setBackground(Color.GREEN);
            tes63.setText("F");
            
        }
    }//GEN-LAST:event_tes63ActionPerformed

    private void tes_hurufKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tes_hurufKeyTyped
        tes_huruf.enable(false);
    }//GEN-LAST:event_tes_hurufKeyTyped

    private void tes16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes16ActionPerformed
       if (tes16.isSelected()) {
            tes16.setBackground(Color.WHITE);
            tes16.setText("T");
        } else {
            tes16.setBackground(Color.GREEN);
            tes16.setText("F");
            
        }
    }//GEN-LAST:event_tes16ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        this.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_formComponentShown

    private void tes_keteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes_keteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tes_keteranganActionPerformed

    private void T1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_T1MouseClicked

    private void radio_binerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_binerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_binerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        p=-1;
        T1.setSelected(false);
        T1.setBackground(Color.GREEN);
        T2.setSelected(false);
        T2.setBackground(Color.GREEN);
        T3.setSelected(false);
        T3.setBackground(Color.GREEN);
        T4.setSelected(false);
        T4.setBackground(Color.GREEN);
        T5.setSelected(false);
        T5.setBackground(Color.GREEN);
        T6.setSelected(false);
        T6.setBackground(Color.GREEN);
        T7.setSelected(false);
        T7.setBackground(Color.GREEN);
        tes_keterangan.setText(" ");
        T1.setText("F");
        T2.setText("F");
        T3.setText("F");
        T4.setText("F");
        T5.setText("F");
        T6.setText("F");
        T7.setText("F");
        
        tes_huruf.setText("");
        tes_huruf.setBackground(Color.white);
        JOptionPane.showMessageDialog(null, "clear sukses");
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Testing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Testing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton T1;
    private javax.swing.JToggleButton T2;
    private javax.swing.JToggleButton T3;
    private javax.swing.JToggleButton T4;
    private javax.swing.JToggleButton T5;
    private javax.swing.JToggleButton T6;
    private javax.swing.JToggleButton T7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton radio_biner;
    private javax.swing.JRadioButton radio_bipolar;
    private javax.swing.JToggleButton tes1;
    private javax.swing.JToggleButton tes10;
    private javax.swing.JToggleButton tes11;
    private javax.swing.JToggleButton tes12;
    private javax.swing.JToggleButton tes13;
    private javax.swing.JToggleButton tes14;
    private javax.swing.JToggleButton tes15;
    private javax.swing.JToggleButton tes16;
    private javax.swing.JToggleButton tes17;
    private javax.swing.JToggleButton tes18;
    private javax.swing.JToggleButton tes19;
    private javax.swing.JToggleButton tes2;
    private javax.swing.JToggleButton tes20;
    private javax.swing.JToggleButton tes21;
    private javax.swing.JToggleButton tes22;
    private javax.swing.JToggleButton tes23;
    private javax.swing.JToggleButton tes24;
    private javax.swing.JToggleButton tes25;
    private javax.swing.JToggleButton tes26;
    private javax.swing.JToggleButton tes27;
    private javax.swing.JToggleButton tes28;
    private javax.swing.JToggleButton tes29;
    private javax.swing.JToggleButton tes3;
    private javax.swing.JToggleButton tes30;
    private javax.swing.JToggleButton tes31;
    private javax.swing.JToggleButton tes32;
    private javax.swing.JToggleButton tes33;
    private javax.swing.JToggleButton tes34;
    private javax.swing.JToggleButton tes35;
    private javax.swing.JToggleButton tes36;
    private javax.swing.JToggleButton tes37;
    private javax.swing.JToggleButton tes38;
    private javax.swing.JToggleButton tes39;
    private javax.swing.JToggleButton tes4;
    private javax.swing.JToggleButton tes40;
    private javax.swing.JToggleButton tes41;
    private javax.swing.JToggleButton tes42;
    private javax.swing.JToggleButton tes43;
    private javax.swing.JToggleButton tes44;
    private javax.swing.JToggleButton tes45;
    private javax.swing.JToggleButton tes46;
    private javax.swing.JToggleButton tes47;
    private javax.swing.JToggleButton tes48;
    private javax.swing.JToggleButton tes49;
    private javax.swing.JToggleButton tes5;
    private javax.swing.JToggleButton tes50;
    private javax.swing.JToggleButton tes51;
    private javax.swing.JToggleButton tes52;
    private javax.swing.JToggleButton tes53;
    private javax.swing.JToggleButton tes54;
    private javax.swing.JToggleButton tes55;
    private javax.swing.JToggleButton tes56;
    private javax.swing.JToggleButton tes57;
    private javax.swing.JToggleButton tes58;
    private javax.swing.JToggleButton tes59;
    private javax.swing.JToggleButton tes6;
    private javax.swing.JToggleButton tes60;
    private javax.swing.JToggleButton tes61;
    private javax.swing.JToggleButton tes62;
    private javax.swing.JToggleButton tes63;
    private javax.swing.JToggleButton tes7;
    private javax.swing.JToggleButton tes8;
    private javax.swing.JToggleButton tes9;
    private javax.swing.JTextField tes_huruf;
    private javax.swing.JTextField tes_keterangan;
    private javax.swing.JButton tes_refresh;
    private javax.swing.JButton tes_testing;
    // End of variables declaration//GEN-END:variables
}
