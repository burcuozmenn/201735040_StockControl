/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockcontrol;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author burcu
 */
public class AddProduct extends javax.swing.JFrame {
       
    String ID;      //Product ID
    
    private int i=0;
    private String[] items;
    
    private boolean initCompleted = false; //flag for all component init completed

    ConnectionDB apConnection;      //DB reference
    
    //get item attributes by id
    private void setItemsAttributes(String ID) {
        
        ResultSet result = null;
        
        result = apConnection.getItemByID(ID);
         
            try {
                System.out.println("AddProduct class connected to DB.");
                while(result.next()){
                    stockLevel.setText(result.getString("stocklevel"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(StockControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    //Secondary constructor to pass argument from StockControl.java
    public AddProduct(String ID) {
        this.ID = ID;
        
        apConnection = new ConnectionDB();//get reference for db
        
        initComponents();
        
        items = apConnection.getItemsByID();    //get items to combobox
        if(items != null) {
            this.productID.removeAllItems();
            
            for(i=0;i<items.length;i++) {
                this.productID.addItem(items[i]);                
            }
            
            i=0;
        }
        String idAll = this.productID.getSelectedItem().toString();
        if( !idAll.equals(null)){
            setItemsAttributes(ID);
            initCompleted = true;
        }
    }
    
    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        productID = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        stockLevel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addProduct = new javax.swing.JButton();
        newProduct = new javax.swing.JButton();
        productQuantity = new javax.swing.JTextField();
        addProductSE = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setMaximumSize(new java.awt.Dimension(340, 130));
        jPanel2.setMinimumSize(new java.awt.Dimension(340, 130));
        jPanel2.setPreferredSize(new java.awt.Dimension(340, 130));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Product ID");
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 20));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        productID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        productID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productID??temStateChanged(evt);
            }
        });
        productID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIDActionPerformed(evt);
            }
        });
        jPanel2.add(productID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Stock Level");
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 20));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        stockLevel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stockLevel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(stockLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 80, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Quantity");
        jLabel10.setPreferredSize(new java.awt.Dimension(80, 20));
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        addProduct.setText("Add Product");
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });
        jPanel2.add(addProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 100, -1));

        newProduct.setText("New Product");
        newProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProductActionPerformed(evt);
            }
        });
        jPanel2.add(newProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, -1));

        productQuantity.setText("0");
        productQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                productQuantityKeyTyped(evt);
            }
        });
        jPanel2.add(productQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 80, 25));

        addProductSE.setText("Save and Exit");
        addProductSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductSEActionPerformed(evt);
            }
        });
        addProductSE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addProductSEKeyReleased(evt);
            }
        });
        jPanel2.add(addProductSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProductActionPerformed
        // TODO add your handling code here:
        NewProduct newProduct = new NewProduct();
        newProduct.setVisible(true);
        newProduct.setDefaultCloseOperation(DISPOSE_ON_CLOSE);    //default exit operation         
    }//GEN-LAST:event_newProductActionPerformed

    private void productIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIDActionPerformed
        // TODO add your handling code here:
        if(initCompleted)
       {
           String ID = productID.getSelectedItem().toString();
           setItemsAttributes(ID);
       }
    }//GEN-LAST:event_productIDActionPerformed

    private void productID??temStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productID??temStateChanged
        // TODO add your handling code here:
        if(initCompleted)
       {
           String ID = productID.getSelectedItem().toString();
           setItemsAttributes(ID);
       }
    }//GEN-LAST:event_productID??temStateChanged

    private void productQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productQuantityKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();        

        if(!Character.isDigit(c)) { //for get only numeric input
            evt.consume();
        }
    }//GEN-LAST:event_productQuantityKeyTyped

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        // TODO add your handling code here:
        String sql = "";
        if(productQuantity.getText()!=null) {
            int CurrenQuantity = Integer.parseInt(stockLevel.getText());
            int extraQuantity = Integer.parseInt(productQuantity.getText());
            
            apConnection.addProduct(productID.getSelectedItem().toString(), CurrenQuantity, extraQuantity);
            
            String ID = productID.getSelectedItem().toString();
            setItemsAttributes(ID);
        }
    }//GEN-LAST:event_addProductActionPerformed

    private void addProductSEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addProductSEKeyReleased
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_addProductSEKeyReleased

    private void addProductSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductSEActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_addProductSEActionPerformed

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProduct;
    private javax.swing.JButton addProductSE;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton newProduct;
    private javax.swing.JComboBox<String> productID;
    private javax.swing.JTextField productQuantity;
    private javax.swing.JLabel stockLevel;
    // End of variables declaration//GEN-END:variables
}
