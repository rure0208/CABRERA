package Vista;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class CotizacionNormalForm extends javax.swing.JInternalFrame {
    double acum;
    Inicio in = new Inicio();
    public CotizacionNormalForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox5 = new javax.swing.JComboBox<>();
        ventana = new javax.swing.JPanel();
        txt_extra = new javax.swing.JComboBox<>();
        lbl_nombre2 = new javax.swing.JLabel();
        txt_stock2 = new javax.swing.JTextField();
        txt_tamaño = new javax.swing.JComboBox<>();
        lbl_nombre3 = new javax.swing.JLabel();
        txt_sabor = new javax.swing.JComboBox<>();
        lbl_direccion2 = new javax.swing.JLabel();
        txt_producto = new javax.swing.JComboBox<>();
        lbl_estado7 = new javax.swing.JLabel();
        lbl_direccion3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_estado4 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        lbl_estado5 = new javax.swing.JLabel();
        lbl_estado6 = new javax.swing.JLabel();
        txt_cobroextra = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Pastel", "Cupcakes", "Gelatinas", " " }));

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setTitle("Cotización Normal");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        ventana.setBackground(new java.awt.Color(255, 255, 255));
        ventana.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_extra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Queso extra", "Relleno de queso", "Nuez", "Cholate extra" }));

        lbl_nombre2.setText("Producto:");

        txt_tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Individual", "Mediano", "Grande", "Media plancha", "Plancha completa" }));

        lbl_nombre3.setText("Tamaño:");

        txt_sabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Chocolate", "Vainilla", "Fresa", "Zanahoria" }));
        txt_sabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_saborActionPerformed(evt);
            }
        });

        lbl_direccion2.setText("Sabor:");

        txt_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Pastel", "Cupcakes" }));
        txt_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_productoMouseClicked(evt);
            }
        });
        txt_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_productoActionPerformed(evt);
            }
        });

        lbl_estado7.setText("Observaciones:");

        lbl_direccion3.setText("Toping Extra:");

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Cotizaciones");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_estado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bolsa-de-dinero.png"))); // NOI18N
        lbl_estado4.setText("Subtotal: $");

        txt_subtotal.setEditable(false);

        lbl_estado5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/extra.png"))); // NOI18N
        lbl_estado5.setText("Extra:      $");

        lbl_estado6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dinero.png"))); // NOI18N
        lbl_estado6.setText("Total:      $");

        txt_cobroextra.setEditable(false);

        txt_total.setEditable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/comprobado.png"))); // NOI18N
        jButton2.setToolTipText("Acepta Cotización");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btn_salir.setToolTipText("Rechaza cotización");
        btn_salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_estado4)
                                .addComponent(lbl_estado5))
                            .addComponent(lbl_estado6))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cobroextra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_estado4)
                    .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_estado5)
                    .addComponent(txt_cobroextra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_estado6)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(btn_salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ventanaLayout = new javax.swing.GroupLayout(ventana);
        ventana.setLayout(ventanaLayout);
        ventanaLayout.setHorizontalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLayout.createSequentialGroup()
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_estado7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_stock2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ventanaLayout.createSequentialGroup()
                                .addComponent(lbl_nombre2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ventanaLayout.createSequentialGroup()
                                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_direccion3)
                                    .addComponent(lbl_nombre3)
                                    .addComponent(lbl_direccion2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_sabor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_tamaño, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_extra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventanaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        ventanaLayout.setVerticalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaLayout.createSequentialGroup()
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombre2)
                            .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_direccion2))
                .addGap(18, 18, 18)
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre3)
                    .addComponent(txt_tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion3)
                    .addComponent(txt_extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_estado7)
                    .addComponent(txt_stock2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventanaLayout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 348, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("CotizacionNormal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_productoActionPerformed
      
    }//GEN-LAST:event_txt_productoActionPerformed

    private void txt_saborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_saborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_saborActionPerformed

    private void txt_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_productoMouseClicked
        producto();
    }//GEN-LAST:event_txt_productoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        FechasDisponiblesForm fd=new FechasDisponiblesForm();
        fd.setVisible(true);
      // in.CentrarVentana(fd);
       //JOptionPane.showConfirmDialog(null,"Desea confirmar pedido");
        
    }//GEN-LAST:event_jButton2ActionPerformed

 
    void producto()
{
    String op= "--Seleccionar--";
     if(op=="Pastel")
     {
         JOptionPane.showMessageDialog(null,"pasteles");
     }
     else
     { if(op=="Cupcakes")
     {
         JOptionPane.showMessageDialog(null,"cupcakes");
     }
     }
     
    
}
void sabor ()
{
    String op= "--Seleccionar--";
     switch (op){
         case "Chocolate":
             break;
         case "Vainilla":
             break;
         case "Fresa":
             break;
         case "Zanahoria":
             break;
     }
}
void tamaño(){
    String op= "--Seleccionar--";
     switch (op){
         case "Individual":
             break;
         case "Mediano":
             break;
         case "Grande":
             break;
         case "Media plancha":
             break;
         case "Plancha completa":
             break;
     }
}
void Extra()
{
    String op= "--Seleccionar--";
     switch (op){
         case "Queso extra":
             break;
         case "Relleno de queso":
             break;
         case "Nuez":
             break;
         case "Chocolate extra":
             break;
     }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_direccion2;
    private javax.swing.JLabel lbl_direccion3;
    private javax.swing.JLabel lbl_estado4;
    private javax.swing.JLabel lbl_estado5;
    private javax.swing.JLabel lbl_estado6;
    private javax.swing.JLabel lbl_estado7;
    private javax.swing.JLabel lbl_nombre2;
    private javax.swing.JLabel lbl_nombre3;
    private javax.swing.JTextField txt_cobroextra;
    private javax.swing.JComboBox<String> txt_extra;
    private javax.swing.JComboBox<String> txt_producto;
    private javax.swing.JComboBox<String> txt_sabor;
    private javax.swing.JTextField txt_stock2;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JComboBox<String> txt_tamaño;
    private javax.swing.JTextField txt_total;
    private javax.swing.JPanel ventana;
    // End of variables declaration//GEN-END:variables
}
