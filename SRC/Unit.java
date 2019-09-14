
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SUMIT
 */
public class Unit extends javax.swing.JFrame {

    /**
     * Creates new form Unit
     */
    public Unit() {
        initComponents();
        setLocation(300,50);
        getContentPane().setBackground(new Color(100,50,200));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UNIT CONVERTER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("SELECT THE TYPE OF UNIT YOU WNAT TO CONVERT");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "ANGLE", "TEMP", "TIME", "WEIGHT" }));
        jComboBox1.setBorder(new javax.swing.border.MatteBorder(null));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("->");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 255));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("From");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("To");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("MAIN MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(66, 66, 66)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        jTextField1.setEnabled(false);
        jComboBox2.setEnabled(false);
        jTextField2.setEnabled(false);
        jComboBox3.setEnabled(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setEnabled(true);jTextField2.setEnabled(true);
        jComboBox2.setEnabled(true);jComboBox3.setEnabled(true);
        jComboBox2.removeAllItems();jComboBox3.removeAllItems();
        if(jComboBox1.getSelectedItem().equals("ANGLE"))
        {
        jComboBox2.addItem("Select");   
        jComboBox2.addItem("Degree");
        jComboBox2.addItem("Radian");
        jComboBox3.addItem("Select");   
        jComboBox3.addItem("Degree");
        jComboBox3.addItem("Radian");
        }
        else if(jComboBox1.getSelectedItem().equals("TEMP"))
        {
            jComboBox2.addItem("Select");
            jComboBox2.addItem("Celsius");
            jComboBox2.addItem("Fahrenhit");
            jComboBox2.addItem("Kelvin");
            jComboBox3.addItem("Select");
            jComboBox3.addItem("Celsius");
            jComboBox3.addItem("Fahrenhit");
            jComboBox3.addItem("Kelvin");
        }
        else if(jComboBox1.getSelectedItem().equals("TIME"))
        {
        jComboBox2.addItem("Select");   
        jComboBox2.addItem("Day");
        jComboBox2.addItem("Hours");
        jComboBox2.addItem("Microsecond");   
        jComboBox2.addItem("Millisecond");
        jComboBox2.addItem("Minute");
        jComboBox2.addItem("Second");
        jComboBox2.addItem("Week");
        jComboBox3.addItem("Select");
        jComboBox3.addItem("Day");
        jComboBox3.addItem("Hours");
        jComboBox3.addItem("Microsecond");   
        jComboBox3.addItem("Millisecond");
        jComboBox3.addItem("Minute");
        jComboBox3.addItem("Second");
        jComboBox3.addItem("Week");
        }
         else if(jComboBox1.getSelectedItem().equals("WEIGHT"))
        { 
        jComboBox2.addItem("Select");
        jComboBox2.addItem("Gram");
        jComboBox2.addItem("Kilogram");
        jComboBox2.addItem("Milligram");   
        
        
        jComboBox2.addItem("Tonne");
        jComboBox3.addItem("Select");
        jComboBox3.addItem("Gram");
        jComboBox3.addItem("Kilogram");
        jComboBox3.addItem("Milligram");   
        
        jComboBox3.addItem("Tonne");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
          jComboBox2.removeAllItems();jComboBox3.removeAllItems();
          jTextField1.setEnabled(false);jTextField2.setEnabled(false);
        jComboBox2.setEnabled(false);jComboBox3.setEnabled(false);
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new MAIN().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        if(jTextField1.getText().equals("")) jTextField2.setText(" ");
        else{
            try{
        String s=jTextField1.getText();
        if(s.equals("-"))
        {
            s="-1";   
         
        }
        double c=Double.parseDouble(s);
        if(jComboBox2.getSelectedItem().equals("Celsius"))
        {
            Object o=jComboBox3.getSelectedItem();
            if(o.equals("Kelvin"))
            {
                double k=c+273.15;
                jTextField2.setText(k+"");
            }
            else if(o.equals("Fahrenhit"))
            {
                double f=(1.8*c)+32;
                jTextField2.setText(f+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Kelvin"))
        {
            Object o=jComboBox3.getSelectedItem();
            if(o.equals("Celsius"))
            {
                double cs=c-273.15;
                jTextField2.setText(cs+"");
            }
            else if(o.equals("Fahrenhit"))
            {
                double f=(1.8*c)-459.67;
                jTextField2.setText(f+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Fahrenhit"))
        {
            Object o=jComboBox3.getSelectedItem();
            if(o.equals("Celsius"))
            {
                double cs=(c-32)/1.8;
                jTextField2.setText(cs+"");
            }
            else if(o.equals("Kelvin"))
            {
                double k=(c+459.67)/1.8;
                jTextField2.setText(k+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Degree"))
        {
            if(jComboBox3.getSelectedItem().equals("Radian"))
            {
                jTextField2.setText(Math.toRadians(c)+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Radian"))
        {
            if(jComboBox3.getSelectedItem().equals("Degree"))
            {
                jTextField2.setText(Math.toDegrees(c)+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Day"))
        {
            if(jComboBox3.getSelectedItem().equals("Hours"))
            {
                double d=c*24;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Microsecond"))
            {
                double d=c*86400000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Millisecond"))
            {
                double d=c*86400000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Minute"))
            {
                double d=c*1440.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Second"))
            {
                double d=c*86400.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Week"))
            {
                double d=c/7;
                jTextField2.setText(d+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Hours"))
        {
            if(jComboBox3.getSelectedItem().equals("Day"))
            {
                double d=c/24.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Hours"))
            {
                //double d=c/24.0;
                jTextField2.setText(c+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Microsecond"))
            {
                double d=c*3600000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Millisecond"))
            {
                double d=c*3600000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Minute"))
            {
                double d=c*60.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Second"))
            {
                double d=c*3600.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Week"))
            {
                double d=c*0.00595;
                jTextField2.setText(d+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Microsecond"))
        {
            if(jComboBox3.getSelectedItem().equals("Day"))
            {
                double d=c/86400000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Hours"))
            {
                double d=c/3600000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Microsecond"))
            {
                //double d=c*3600000000.0;
                jTextField2.setText(c+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Millisecond"))
            {
                double d=c*0.001;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Minute"))
            {
                double d=c/60000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Second"))
            {
                double d=c/1000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Week"))
            {
                double d=c/604800000000.0;
                jTextField2.setText(d+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Millisecond"))
        {
            if(jComboBox3.getSelectedItem().equals("Day"))
            {
                double d=c/86400000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Hours"))
            {
                double d=c/3600000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Microsecond"))
            {
                double d=c/0.001;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Millisecond"))
            {
               // double d=c*0.001;
                jTextField2.setText(c+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Minute"))
            {
                double d=c/60000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Second"))
            {
                double d=c/1000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Week"))
            {
                double d=c/604800000.0;
                jTextField2.setText(d+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Minute"))
        {
            if(jComboBox3.getSelectedItem().equals("Day"))
            {
                double d=c/1440.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Hours"))
            {
                double d=c/60.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Microsecond"))
            {
                double d=c*60000000;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Millisecond"))
            {
               double d=c*60000;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Minute"))
            {
                //double d=c/60000.0;
                jTextField2.setText(c+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Second"))
            {
                double d=c*60.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Week"))
            {
                double d=c/10080.0;
                jTextField2.setText(d+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Second"))
        {
            if(jComboBox3.getSelectedItem().equals("Day"))
            {
                double d=c/86400.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Hours"))
            {
                double d=c/3600.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Microsecond"))
            {
                double d=c*1000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Millisecond"))
            {
                double d=c*1000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Minute"))
            {
                double d=c/60.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Second"))
            {
                //double d=c/1000.0;
                jTextField2.setText(c+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Week"))
            {
                double d=c/604800.0;
                jTextField2.setText(d+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Week"))
        {
            if(jComboBox3.getSelectedItem().equals("Day"))
            {
                double d=c*7;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Hours"))
            {
                double d=c*168;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Microsecond"))
            {
                double d=c*604800000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Millisecond"))
            {
                double d=c*604800000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Minute"))
            {
                double d=c*10080.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Second"))
            {
                double d=c*604800.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Week"))
            {
                //double d=c/604800.0;
                jTextField2.setText(c+"");
            }
        }
       else if(jComboBox2.getSelectedItem().equals("Gram"))
        {
            if(jComboBox3.getSelectedItem().equals("Gram"))
            {
                //double d=c*7;
                jTextField2.setText(c+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Kilogram"))
            {
                double d=c/1000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Milligram"))
            {
                double d=c*1000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Tonne"))
            {
                double d=c*0.000001;
                jTextField2.setText(d+"");
            }
        }
       else if(jComboBox2.getSelectedItem().equals("Kilogram"))
        {
            if(jComboBox3.getSelectedItem().equals("Gram"))
            {
                double d=c*1000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Kilogram"))
            {
                //double d=c/1000.0;
                jTextField2.setText(c+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Milligram"))
            {
                double d=c*1000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Tonne"))
            {
                double d=c*0.001;
                jTextField2.setText(d+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Milligram"))
        {
            if(jComboBox3.getSelectedItem().equals("Gram"))
            {
                double d=c/1000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Kilogram"))
            {
                double d=c/1000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Milligram"))
            {
               // double d=c*1000.0;
                jTextField2.setText(c+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Tonne"))
            {
                double d=c*0.000000001;
                jTextField2.setText(d+"");
            }
        }
        else if(jComboBox2.getSelectedItem().equals("Tonne"))
        {
            if(jComboBox3.getSelectedItem().equals("Gram"))
            {
                double d=c*1000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Kilogram"))
            {
                double d=c*1000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Milligram"))
            {
                double d=c*1000000000.0;
                jTextField2.setText(d+"");
            }
            else if(jComboBox3.getSelectedItem().equals("Tonne"))
            {
               // double d=c*0.000001;
                jTextField2.setText(c+"");
            }
        }
            }catch(Exception ee){ JOptionPane.showMessageDialog(this,"Enter Input");}
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        jTextField1.setText("");jTextField2.setText("");
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        // TODO add your handling code here:
         jTextField1.setText("");jTextField2.setText("");
    }//GEN-LAST:event_jComboBox3ItemStateChanged

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
            java.util.logging.Logger.getLogger(Unit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Unit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Unit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Unit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Unit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
