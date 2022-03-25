/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import pruebasEstadisticasDeAleatoriedad.Metodo_de_corridas;
import pruebasEstadisticasDeAleatoriedad.Prueba_de_frecuencias;

/**
 *
 * @author tetil
 */
public class ComprobacionNumerosAleatorios extends javax.swing.JFrame {

    List<String> NumerosAleatorios;
    
    /**
     * Creates new form ComprobacionNumerosAleatorios
     */
    public ComprobacionNumerosAleatorios(List<String> arreglo) {
        initComponents();
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);

        NumerosAleatorios = arreglo;
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoPruebas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        error_caja = new javax.swing.JTextField();
        Aceptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Frecuencia = new javax.swing.JRadioButton();
        Corridas = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Margen de error en porcentaje: ");

        error_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                error_cajaActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pruebas estadisticas"));

        GrupoPruebas.add(Frecuencia);
        Frecuencia.setSelected(true);
        Frecuencia.setText("Prueba de frecuencias");

        GrupoPruebas.add(Corridas);
        Corridas.setText("Metodo de corridas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Frecuencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Corridas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Frecuencia)
                    .addComponent(Corridas))
                .addContainerGap())
        );

        TextArea.setEditable(false);
        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TextArea.setRows(5);
        TextArea.setText("\n");
        jScrollPane2.setViewportView(TextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(error_caja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(error_caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void error_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_error_cajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_error_cajaActionPerformed

    private void AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarMouseClicked
        
        if (Frecuencia.isSelected() && error_caja.getText().isBlank() == false) {
            
           
            ArrayList<Object> Datos = Prueba_de_frecuencias.metodo_prueba_de_frecuencias(Float.parseFloat(error_caja.getText()),  NumerosAleatorios);

            
            double x0 = (double) Datos.get(0);
            double tabla = (double) Datos.get(1);
            boolean h0 = (boolean) Datos.get(2);
            String veredicto;

            if(h0){
                veredicto = "Se acepta H0";
            }else{
                veredicto = "Se rechaza H0";
            }

            TextArea.setText(x0 + "<" + tabla + "\n" + veredicto);
           
        } else if (Corridas.isSelected() && error_caja.getText().isBlank() == false) {
            
            
            ArrayList<Object> Datos  = Metodo_de_corridas.proceso_metodo_corridas(Integer.parseInt(error_caja.getText()), NumerosAleatorios);

            double valor_alfa = (float) Datos.get(0);
            double formula = (double) Datos.get(1);
            double valor_alfa_menos1 = (double) Datos.get(2);
            boolean h0 = (boolean) Datos.get(3);
            String veredicto;

            if(h0){
                veredicto = "Se acepta H0";
            }else{
                veredicto = "Se rechaza H0";
            }

            TextArea.setText(valor_alfa + "<=" + formula+ " <=" + valor_alfa_menos1 + "\n" + veredicto);
            
        }else{
            JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_AceptarMouseClicked

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ComprobacionNumerosAleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprobacionNumerosAleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprobacionNumerosAleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprobacionNumerosAleatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprobacionNumerosAleatorios().setVisible(true);
            }
        });
    }*/
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JRadioButton Corridas;
    private javax.swing.JRadioButton Frecuencia;
    private javax.swing.ButtonGroup GrupoPruebas;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField error_caja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
