/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu3apps;

/**
 *
 * @author Andres
 */
 

import java.util.ArrayList;
import javax.swing.JOptionPane;
 


    public class Menu extends javax.swing.JFrame {
    int i = 0;
    int j = 0;
    int h = 0;
    int k = 0;
    int x = 0;
    int y = 0;
    int s = 0;
    int aux = 0;
    int inicio = 0;
    int contador = 0;
    String mensaje = "";
    String entrada1 = "";
    String temporal = "";
    String datos = "";
    String espacio[] = {" "};
    ArrayList burbuja = new ArrayList();
    ArrayList burbuja1 = new ArrayList();
    ArrayList memoria = new ArrayList();
    

    public void LimpiarTxt() {
        txtsecnum.setText("");
    }

    /**
     * Creates new form Menu
     */
    
    public Menu() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        lblsecnum.setVisible(true);
        txtsecnum.setVisible(true);
        btnmossec.setVisible(true);
        btnsecguardar.setVisible(true);
        btnnuevonum.setVisible(true);
        btnordnum.setVisible(true);
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox = new javax.swing.ButtonGroup();
        lblsecnum = new javax.swing.JLabel();
        btnmossec = new javax.swing.JButton();
        btnsecguardar = new javax.swing.JButton();
        txtsecnum = new javax.swing.JTextField();
        btnordnum = new javax.swing.JButton();
        btnnuevonum = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblsecnum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblsecnum.setText("  Secuencia de Numeros");

        btnmossec.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnmossec.setText("Contenido");
        btnmossec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmossecActionPerformed(evt);
            }
        });

        btnsecguardar.setText("Guardar");
        btnsecguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsecguardarActionPerformed(evt);
            }
        });

        btnordnum.setText("Ordenar");
        btnordnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordnumActionPerformed(evt);
            }
        });

        btnnuevonum.setText("Nuevo");
        btnnuevonum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevonumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsecnum, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsecnum, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsecguardar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnuevonum)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnmossec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnordnum)))))
                .addContainerGap(723, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lblsecnum, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtsecnum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsecguardar)
                    .addComponent(btnmossec)
                    .addComponent(btnordnum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnnuevonum)
                .addGap(377, 377, 377))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnsecguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsecguardarActionPerformed
        // TODO add your handling code here:
        try {
            datos = txtsecnum.getText();//entrada de datos
            datos += " ";//sumo un espacio para guardar el ultimo dato en el arreglo

            //Llenado del arreglo
            for (i = 0; i < datos.length(); i++) {

                entrada1 = datos.substring(i, i + 1);//extrae caracter por caracter

                if (!entrada1.equals(espacio[0]))//si es diferente a un espacio se ejecuta
                {
                    temporal += entrada1;
                } else if (entrada1.equals(espacio[0])) { //si es igual a un espacio se ejecuta
                    burbuja.add(temporal); //deposita en el arreglo
                    burbuja1.add(temporal);
                    temporal = "";
                    k++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos invalidos, porfavor vuelve a intentar");
        }
        
        
    
    
    }//GEN-LAST:event_btnsecguardarActionPerformed

    private void btnmossecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmossecActionPerformed
        // TODO add your handling code here:
        for (j = 0; j < k; j++) {
            if(j==0){
                mensaje += ("\n Mayor a menor \n"+(j + 1) + "-: " + burbuja.get(j) + "\n");
            }
            else{
                mensaje += ((j + 1) + "-: " + burbuja.get(j) + "\n");
            }
        }
        
        
                
        for (h = 0; h < k; h++) {
            
            if(h==0){
                mensaje += ("\n Menor a mayor \n"+(h + 1) + "-: " + burbuja1.get(h) + "\n");
            }
            else{
                mensaje += ((h + 1) + "-: " + burbuja1.get(h) + "\n");
            }
        }

        JOptionPane.showMessageDialog(null, mensaje);
        mensaje = "";
    }//GEN-LAST:event_btnmossecActionPerformed

    private void btnordnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnordnumActionPerformed
        // TODO add your handling code here:
        
        try {
                         
            for (x = 0; x < k; x++) {//
                for (y = 0; y < k; y++) {//le pongo un limite de k veces porque es el numero de datos que entro
                    int uno = Integer.parseInt(burbuja.get(x).toString());//convierto los String a enteros para poder compararlos con el if
                    int dos = Integer.parseInt(burbuja.get(y).toString());

                    if (uno >= dos ) {
                        //aux = burbuja[x];
                        aux = Integer.parseInt(burbuja.get(x).toString());
                        //burbuja[x]=burbuja[y];                                                  
                        burbuja.set(x, burbuja.get(y));
                        //burbuja[y]=aux;
                        burbuja.set(y, aux);
                    }
                }
            }
            for (x = 0; x < k; x++) {//la veces que encuentra un espacio es k
                for (y = 0; y < k; y++) {//le pongo un limite de k veces porque es el numero de datos que entro
                    int uno = Integer.parseInt(burbuja1.get(x).toString());//convierto los String a enteros para poder compararlos con el if
                    int dos = Integer.parseInt(burbuja1.get(y).toString());

                    if (uno <= dos ) {
                        //aux = burbuja[x];
                        aux = Integer.parseInt(burbuja1.get(x).toString());
                        //burbuja[x]=burbuja[y];                                                  
                        burbuja1.set(x, burbuja1.get(y));
                        //burbuja[y]=aux;
                        burbuja1.set(y, aux);
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "¡Listo!, los números se han ordenado mayor a menor y menor a mayor");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al introducir datos, porfavor verifica los números o espacios");
        }
    }//GEN-LAST:event_btnordnumActionPerformed

    private void btnnuevonumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevonumActionPerformed
        // TODO add your handling code here:
        LimpiarTxt();
        for (i = 0; i < burbuja.size(); i++) {
            burbuja.set(i, (""));
            burbuja.remove(i--);
        }

        i = 0;
        j = 0;
        k = 0;
        x = 0;
        y = 0;
        aux = 0;
        inicio = 0;
        contador = 0;
        mensaje = "";
        entrada1 = "";
        temporal = "";
        datos = "";

        txtsecnum.requestFocus();
    }//GEN-LAST:event_btnnuevonumActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmossec;
    private javax.swing.JButton btnnuevonum;
    private javax.swing.JButton btnordnum;
    private javax.swing.JButton btnsecguardar;
    private javax.swing.ButtonGroup checkbox;
    private javax.swing.JLabel lblsecnum;
    private javax.swing.JTextField txtsecnum;
    // End of variables declaration//GEN-END:variables
}
