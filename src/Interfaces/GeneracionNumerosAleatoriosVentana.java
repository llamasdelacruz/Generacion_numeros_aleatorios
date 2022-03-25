/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

import numerosAleatoriosGeneracion.Congruencia_mixta_generacion;
import numerosAleatoriosGeneracion.Cuadrados_generacion;
import pruebasEstadisticasDeAleatoriedad.Metodo_de_corridas;
import pruebasEstadisticasDeAleatoriedad.Prueba_de_frecuencias;

/**
 *
 * @author tetil
 */
public class GeneracionNumerosAleatoriosVentana extends javax.swing.JFrame {

    /**
     * Creates new form GeneracionNumerosAleatoriosVentana
     */
    public GeneracionNumerosAleatoriosVentana() {
        initComponents();
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoTipoDeGeneracion = new javax.swing.ButtonGroup();
        GrupoSemillaEntrada = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        RadioCuadrados = new javax.swing.JRadioButton();
        RadioMixto = new javax.swing.JRadioButton();
        etiqueta1 = new javax.swing.JLabel();
        semilla_caja = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        EntradaManual = new javax.swing.JRadioButton();
        Aleatorio = new javax.swing.JRadioButton();
        Generar = new javax.swing.JButton();
        etiqueta2 = new javax.swing.JLabel();
        cantidad_caja = new javax.swing.JTextField();
        Verificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Generacion"));

        GrupoTipoDeGeneracion.add(RadioCuadrados);
        RadioCuadrados.setText("Cuadrados");

        GrupoTipoDeGeneracion.add(RadioMixto);
        RadioMixto.setSelected(true);
        RadioMixto.setText("Mixto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(RadioMixto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(RadioCuadrados)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioCuadrados)
                    .addComponent(RadioMixto))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        etiqueta1.setText("Semilla:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Creacion de la semilla"));

        GrupoSemillaEntrada.add(EntradaManual);
        EntradaManual.setSelected(true);
        EntradaManual.setText("Entrada Manual");

        GrupoSemillaEntrada.add(Aleatorio);
        Aleatorio.setText("Aleatoria");
        Aleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AleatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Aleatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EntradaManual)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntradaManual)
                    .addComponent(Aleatorio))
                .addGap(23, 23, 23))
        );

        Generar.setText("Generar");
        Generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerarMouseClicked(evt);
            }
        });

        etiqueta2.setText("Cantidad:");

        Verificar.setText("Verificar numeros");
        Verificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerificarMouseClicked(evt);
            }
        });

        MostrarTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(MostrarTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Verificar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(Generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(semilla_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiqueta2)
                                    .addComponent(cantidad_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(etiqueta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semilla_caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etiqueta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidad_caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Generar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AleatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AleatorioActionPerformed

    private void GenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarMouseClicked
        //boton generar 
        int semilla ;
        int cantidad ;

        


        if (EntradaManual.isSelected()) {
            //datos por el usuario

            if(!semilla_caja.getText().isBlank() && !cantidad_caja.getText().isBlank()){
                
                NumerosAleatoriosTabla.clear();
                semilla = Integer.parseInt(semilla_caja.getText());
                cantidad = Integer.parseInt(cantidad_caja.getText());

                if (RadioMixto.isSelected()) {
                    //Mixto por usuario
                    
                    List<String> ResulatadosUsuario = Congruencia_mixta_generacion.Mixta_generacion_datos_usuario(cantidad, semilla);

                    Clear_Table1();
                    titulo = new String[]{"m", "x", "a", "c" , "Numero Aleatorio"};
                    tabla.setColumnIdentifiers(titulo);
                    MostrarTabla.setModel(tabla);
                    
                    
                    for (int i = 0; i < ResulatadosUsuario.size(); i++) {

                        columnas = ResulatadosUsuario.get(i).split(" ");
                        NumerosAleatoriosTabla.add(columnas[4]);
                        tabla.addRow(new Object[]{ columnas[0], columnas[1], columnas[2], columnas[3], columnas[4]});


                    }
                    
                    
                } else {
                    //cuadrados por usuario
                    if (semilla_caja.getText().length()%2 == 0) {
                    
                        List<String> ResulatadosUsuario = Cuadrados_generacion.cuadrados_generacion_datos_usuario(semilla_caja.getText(), cantidad);

                        Clear_Table1();
                        titulo = new String[]{"Semilla", "e", "2e", "Semilla**2" , "Numero Aleatorio"};
                        tabla.setColumnIdentifiers(titulo);
                        MostrarTabla.setModel(tabla);


                        for (int i = 0; i < ResulatadosUsuario.size(); i++) {

                            columnas = ResulatadosUsuario.get(i).split(" ");
                            NumerosAleatoriosTabla.add(columnas[4]);
                            tabla.addRow(new Object[]{ columnas[0], columnas[1], columnas[2], columnas[3], columnas[4]});


                        }
        
                    } else {
                        JOptionPane.showMessageDialog(null, "Debes colocar un numero con una cantidad de digitos par", "Error", JOptionPane.WARNING_MESSAGE);
                    }

                }    

            }else{

                JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos", "Error", JOptionPane.WARNING_MESSAGE);

            }
            
            
            

        } else {
            //con numero aleatorios
            
            if (!cantidad_caja.getText().isBlank()) {
                NumerosAleatoriosTabla.clear();

                cantidad = Integer.parseInt(cantidad_caja.getText());

                if (RadioMixto.isSelected()) {
                    //Mixto por aleatorios
                    
                    List<String> ResulatadosUsuario = Congruencia_mixta_generacion.Mixta_generacion_datos_aleatorios(cantidad);

                    Clear_Table1();
                    titulo = new String[]{"m", "x", "a", "c" , "Numero Aleatorio"};
                    tabla.setColumnIdentifiers(titulo);
                    MostrarTabla.setModel(tabla);
                    
                    
                    for (int i = 0; i < ResulatadosUsuario.size(); i++) {

                        columnas = ResulatadosUsuario.get(i).split(" ");
                        NumerosAleatoriosTabla.add(columnas[4]);
                        tabla.addRow(new Object[]{ columnas[0], columnas[1], columnas[2], columnas[3], columnas[4]});


                    }
                    
                    
                } else {
                    //cuadrados por aleatorios
                    
                    List<String> ResulatadosUsuario = Cuadrados_generacion.cuadrados_generacion_datos_aleatorios(cantidad);

                        Clear_Table1();
                        titulo = new String[]{"Semilla", "e", "2e", "Semilla**2" , "Numero Aleatorio"};
                        tabla.setColumnIdentifiers(titulo);
                        MostrarTabla.setModel(tabla);


                        for (int i = 0; i < ResulatadosUsuario.size(); i++) {

                            columnas = ResulatadosUsuario.get(i).split(" ");
                            NumerosAleatoriosTabla.add(columnas[4]);
                            tabla.addRow(new Object[]{ columnas[0], columnas[1], columnas[2], columnas[3], columnas[4]});


                        }

                }
                
            } else {

                JOptionPane.showMessageDialog(null, "Debes rellenar el campo 'Cantidad' ", "Error", JOptionPane.WARNING_MESSAGE);
                
            }


            
        }

        

        
        
       
    }//GEN-LAST:event_GenerarMouseClicked

    private void VerificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerificarMouseClicked
        
        new ComprobacionNumerosAleatorios(NumerosAleatoriosTabla).setVisible(true);
        
        
    }//GEN-LAST:event_VerificarMouseClicked
    
    

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
            java.util.logging.Logger.getLogger(GeneracionNumerosAleatoriosVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneracionNumerosAleatoriosVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneracionNumerosAleatoriosVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneracionNumerosAleatoriosVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneracionNumerosAleatoriosVentana().setVisible(true);
            }
        });
    }
    
    private List<String> retornar_decimales_metodo(List<String> Aleatorios){
        
        
    }
    private void Clear_Table1(){
        for (int i = 0; i < tabla.getRowCount(); i++) {
            tabla.removeRow(i);
        i-=1;
        }
    }
    
    String[] titulo;
    DefaultTableModel tabla = new DefaultTableModel();
    String[] columnas;
    List<String> NumerosAleatoriosTabla = new ArrayList<>();
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Aleatorio;
    private javax.swing.JRadioButton EntradaManual;
    private javax.swing.JButton Generar;
    private javax.swing.ButtonGroup GrupoSemillaEntrada;
    private javax.swing.ButtonGroup GrupoTipoDeGeneracion;
    private javax.swing.JTable MostrarTabla;
    private javax.swing.JRadioButton RadioCuadrados;
    private javax.swing.JRadioButton RadioMixto;
    private javax.swing.JButton Verificar;
    private javax.swing.JTextField cantidad_caja;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField semilla_caja;
    // End of variables declaration//GEN-END:variables
}
