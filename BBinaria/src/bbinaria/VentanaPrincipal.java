/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbinaria;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    // Atributos de la clase
    BusquedaBinariaDP bbinariaDP = new BusquedaBinariaDP();
    //BusquedaBinariaMD = new BusquedaBinariaMD(bbinariaDP);
    
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        btnSelecArchivo = new javax.swing.JButton();
        btnBuscNumer = new javax.swing.JButton();
        btnObtenResult = new javax.swing.JButton();
        fieldNumero = new javax.swing.JTextField();
        btnElimResult = new javax.swing.JButton();
        btnLimpiarPant = new javax.swing.JButton();
        btnElimArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaImpresion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaImpresion = new javax.swing.JTable();
        ultimoResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Búsqueda Binaria");

        btnSelecArchivo.setText("Seleccionar archivo");
        btnSelecArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecArchivoActionPerformed(evt);
            }
        });

        btnBuscNumer.setText("Buscar número");
        btnBuscNumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscNumerActionPerformed(evt);
            }
        });

        btnObtenResult.setText("Obtener resultados");

        btnElimResult.setText("Eliminar resultados");

        btnLimpiarPant.setText("Limpiar pantalla");

        btnElimArchivo.setText("Eliminar archivo");

        areaImpresion.setEditable(false);
        areaImpresion.setColumns(20);
        areaImpresion.setLineWrap(true);
        areaImpresion.setRows(5);
        jScrollPane1.setViewportView(areaImpresion);

        tablaImpresion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Resultado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaImpresion.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaImpresion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(ultimoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(294, 294, 294))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnBuscNumer)
                        .addGap(18, 18, 18)
                        .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnLimpiarPant))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSelecArchivo)
                                .addGap(104, 104, 104)
                                .addComponent(btnElimArchivo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnObtenResult)
                                .addGap(93, 93, 93)
                                .addComponent(btnElimResult)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ultimoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecArchivo)
                    .addComponent(btnElimArchivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElimResult)
                    .addComponent(btnObtenResult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarPant)
                    .addComponent(btnBuscNumer)
                    .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecArchivoActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        String direccion = fc.getSelectedFile().getAbsolutePath();
        
        // Validar el archivo segun su direccion
        try {
            bbinariaDP.verificarArchivo(direccion);
            int[] temp = bbinariaDP.getArregloNums();
            for(int n: temp)
                areaImpresion.append(n + ", ");
        } catch (Exception ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_btnSelecArchivoActionPerformed

    private void btnBuscNumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscNumerActionPerformed
    if(bbinariaDP.verificarNumero(fieldNumero.getText())) {
        int[] resultado = bbinariaDP.buscarNumero();
        
        ultimoResultado.setText("# " + bbinariaDP.getNumero() + " encontrado en " + resultado[1] + " iteraciones");
        }
    else
        mensajeEmergente("Error", "Número no válido");
    
    fieldNumero.setText("");
    }//GEN-LAST:event_btnBuscNumerActionPerformed
   public static void mensajeEmergente(String titulo, String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaImpresion;
    private javax.swing.JButton btnBuscNumer;
    private javax.swing.JButton btnElimArchivo;
    private javax.swing.JButton btnElimResult;
    private javax.swing.JButton btnLimpiarPant;
    private javax.swing.JButton btnObtenResult;
    private javax.swing.JButton btnSelecArchivo;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaImpresion;
    private javax.swing.JLabel ultimoResultado;
    // End of variables declaration//GEN-END:variables
}
