/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbinaria;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author ASUS
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    // Atributos de la clase
    BusquedaBinariaDP bbinariaDP;
    BusquedaBinariaMD bbinariaMD;

    /**
     * Creates new form VentanaPrincipal
     *
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     */
    public VentanaPrincipal() throws SQLException, IOException {
        initComponents();
        bbinariaDP = new BusquedaBinariaDP();
        setLocationRelativeTo(null);
        bbinariaMD = new BusquedaBinariaMD(bbinariaDP);
        TableColumnModel m = tablaImpresion.getColumnModel();
        m.getColumn(0).setPreferredWidth(50);
        m.getColumn(1).setPreferredWidth(650);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tablaImpresion.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        this.setBackground(Color.BLACK);

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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaImpresion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaImpresion = new javax.swing.JTable();
        btnSelecArchivo = new javax.swing.JButton();
        btnObtenResult = new javax.swing.JButton();
        btnBuscNumer = new javax.swing.JButton();
        fieldNumero = new javax.swing.JTextField();
        btnElimArchivo = new javax.swing.JButton();
        btnElimResult = new javax.swing.JButton();
        btnLimpiarPant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 51));
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Búsqueda Binaria");

        areaImpresion.setEditable(false);
        areaImpresion.setColumns(20);
        areaImpresion.setLineWrap(true);
        areaImpresion.setRows(5);
        jScrollPane1.setViewportView(areaImpresion);

        tablaImpresion.setBackground(new java.awt.Color(255, 255, 255));
        tablaImpresion.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
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

        btnSelecArchivo.setBackground(new java.awt.Color(255, 255, 255));
        btnSelecArchivo.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btnSelecArchivo.setText("Seleccionar archivo");
        btnSelecArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecArchivoActionPerformed(evt);
            }
        });

        btnObtenResult.setBackground(new java.awt.Color(255, 255, 255));
        btnObtenResult.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btnObtenResult.setText("Obtener resultados");
        btnObtenResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenResultActionPerformed(evt);
            }
        });

        btnBuscNumer.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscNumer.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btnBuscNumer.setText("Buscar número");
        btnBuscNumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscNumerActionPerformed(evt);
            }
        });

        fieldNumero.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        btnElimArchivo.setBackground(new java.awt.Color(255, 255, 255));
        btnElimArchivo.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btnElimArchivo.setText("Eliminar archivo");
        btnElimArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimArchivoActionPerformed(evt);
            }
        });

        btnElimResult.setBackground(new java.awt.Color(255, 255, 255));
        btnElimResult.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btnElimResult.setText("Eliminar resultados");
        btnElimResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimResultActionPerformed(evt);
            }
        });

        btnLimpiarPant.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarPant.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btnLimpiarPant.setText("Limpiar pantalla");
        btnLimpiarPant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarPantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscNumer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldNumero))
                    .addComponent(btnSelecArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnObtenResult, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnElimArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElimResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiarPant, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecArchivo)
                    .addComponent(btnElimArchivo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElimResult)
                    .addComponent(btnObtenResult))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiarPant)
                        .addComponent(btnBuscNumer)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            areaImpresion.setText("");
            for (int n : temp) {
                areaImpresion.append(n + ", ");
            }
        } catch (Exception ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSelecArchivoActionPerformed

    private void btnBuscNumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscNumerActionPerformed
        try {
            buscar();

        } catch (NullPointerException e) {
            mensajeEmergente("Error", "Seleccione un archivo antes de comenzar la búsqueda");
        }
    }//GEN-LAST:event_btnBuscNumerActionPerformed

    private void btnElimArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimArchivoActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el archivo?");
        if (confirmacion == 0) {
            bbinariaDP.eliminarArchivo();
            areaImpresion.setText("");
        }
    }//GEN-LAST:event_btnElimArchivoActionPerformed

    private void btnLimpiarPantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarPantActionPerformed
        areaImpresion.setText("");
    }//GEN-LAST:event_btnLimpiarPantActionPerformed

    private void btnObtenResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenResultActionPerformed
        imprimirEnTabla();
    }//GEN-LAST:event_btnObtenResultActionPerformed

    private void btnElimResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimResultActionPerformed
        try {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar los resultados?");
            if (confirmacion == 0) {
                bbinariaDP.eliminarResultadosDP();
                DefaultTableModel model = (DefaultTableModel) tablaImpresion.getModel();
                model.setRowCount(0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnElimResultActionPerformed

    public static void mensajeEmergente(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public void imprimirEnTabla() {
        try {
            String[][] datos = bbinariaMD.consultar();
            DefaultTableModel model = (DefaultTableModel) tablaImpresion.getModel();
            model.setRowCount(0);

            for (String[] dato : datos) {
                model.insertRow(model.getRowCount(), new Object[]{dato[0], dato[1]});
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void buscar() {
        try {
            int porBuscar = Integer.parseInt(fieldNumero.getText());
            bbinariaDP.setNumeroBuscar(porBuscar);
            bbinariaDP.buscarNumero();
            imprimirEnTabla();
        } catch (NumberFormatException e) {
            mensajeEmergente("Error", "Número no válido");
        } finally {
            fieldNumero.setText("");
        }
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
                try {
                    new VentanaPrincipal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaImpresion;
    // End of variables declaration//GEN-END:variables
}
