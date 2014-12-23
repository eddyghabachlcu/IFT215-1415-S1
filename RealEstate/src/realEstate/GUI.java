/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package realEstate;

import javax.swing.JOptionPane;

/**
 *
 * @author Prof
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(this);
        rbNorth.setSelected(true);
        rootPane.setDefaultButton(btnSubmit);
        this.setTitle("Real Estate");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgLocation = new javax.swing.ButtonGroup();
        pnlDetails = new javax.swing.JPanel();
        lblLocation = new javax.swing.JLabel();
        rbNorth = new javax.swing.JRadioButton();
        rbMountLebanon = new javax.swing.JRadioButton();
        rbBeirut = new javax.swing.JRadioButton();
        lblSurface = new javax.swing.JLabel();
        cbxSurface = new javax.swing.JComboBox();
        chkParking = new javax.swing.JCheckBox();
        lblBuyerName = new javax.swing.JLabel();
        txtBuyerName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        pnlInvoice = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInvoice = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        lblLocation.setText("Location:");

        rbgLocation.add(rbNorth);
        rbNorth.setText("North");
        rbNorth.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbNorthStateChanged(evt);
            }
        });

        rbgLocation.add(rbMountLebanon);
        rbMountLebanon.setText("Mount Lebanon");
        rbMountLebanon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbMountLebanonStateChanged(evt);
            }
        });

        rbgLocation.add(rbBeirut);
        rbBeirut.setText("Beirut");
        rbBeirut.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbBeirutStateChanged(evt);
            }
        });

        lblSurface.setText("Surface:");

        cbxSurface.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "150", "200", "250" }));

        chkParking.setText("Parking");

        lblBuyerName.setText("Buyer name:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlDetailsLayout.createSequentialGroup()
                            .addComponent(lblLocation)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbNorth)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbMountLebanon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbBeirut))
                        .addGroup(pnlDetailsLayout.createSequentialGroup()
                            .addComponent(lblSurface)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxSurface, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(chkParking)
                        .addGroup(pnlDetailsLayout.createSequentialGroup()
                            .addComponent(lblBuyerName)
                            .addGap(2, 2, 2)
                            .addComponent(txtBuyerName)))
                    .addComponent(btnSubmit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(rbNorth)
                    .addComponent(rbMountLebanon)
                    .addComponent(rbBeirut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurface)
                    .addComponent(cbxSurface, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkParking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuyerName)
                    .addComponent(txtBuyerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit))
        );

        pnlInvoice.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice"));

        txtInvoice.setEditable(false);
        txtInvoice.setColumns(20);
        txtInvoice.setRows(5);
        jScrollPane1.setViewportView(txtInvoice);

        javax.swing.GroupLayout pnlInvoiceLayout = new javax.swing.GroupLayout(pnlInvoice);
        pnlInvoice.setLayout(pnlInvoiceLayout);
        pnlInvoiceLayout.setHorizontalGroup(
            pnlInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlInvoiceLayout.setVerticalGroup(
            pnlInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvoiceLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
       
        if(txtBuyerName.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter buyer name","Waring",JOptionPane.INFORMATION_MESSAGE);
        }else{
                
            String location;
            if(rbNorth.isSelected()){
                location="North";
            }else if(rbMountLebanon.isSelected()){
                location="Mount Lebanon";
            }else{
                location="Beirut";
         }
        
            int surface = 
                    Integer.parseInt(
                            cbxSurface.getSelectedItem().toString());
            
            boolean parking;
        
            parking = chkParking.isSelected();
        
            String buyerName = txtBuyerName.getText();
        
            RealEstate re = 
                new RealEstate(location,surface,parking,buyerName);
        txtInvoice.setText(re.getInvoice());
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void changeSurfaceValues(String location){
        
        cbxSurface.removeAllItems();
        switch(location){
            case "North":
                cbxSurface.addItem("200");
                cbxSurface.addItem("250");
                break;
            case "Mount Lebanon":
                cbxSurface.addItem("150");
                cbxSurface.addItem("200");
                cbxSurface.addItem("250");
                break;
            default:
                cbxSurface.addItem("150");
                cbxSurface.addItem("200");
        }
    }
    
    private void rbNorthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbNorthStateChanged
        // TODO add your handling code here:
        
        if(rbNorth.isSelected()){
            changeSurfaceValues("North");
        }
    }//GEN-LAST:event_rbNorthStateChanged

    private void rbMountLebanonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbMountLebanonStateChanged
        // TODO add your handling code here:
        if(rbMountLebanon.isSelected()){
            changeSurfaceValues("Mount Lebanon");
        }
    }//GEN-LAST:event_rbMountLebanonStateChanged

    private void rbBeirutStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbBeirutStateChanged
        // TODO add your handling code here:
        if(rbBeirut.isSelected()){
            changeSurfaceValues("Beirut");
        }
    }//GEN-LAST:event_rbBeirutStateChanged

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbxSurface;
    private javax.swing.JCheckBox chkParking;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuyerName;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblSurface;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlInvoice;
    private javax.swing.JRadioButton rbBeirut;
    private javax.swing.JRadioButton rbMountLebanon;
    private javax.swing.JRadioButton rbNorth;
    private javax.swing.ButtonGroup rbgLocation;
    private javax.swing.JTextField txtBuyerName;
    private javax.swing.JTextArea txtInvoice;
    // End of variables declaration//GEN-END:variables
}
