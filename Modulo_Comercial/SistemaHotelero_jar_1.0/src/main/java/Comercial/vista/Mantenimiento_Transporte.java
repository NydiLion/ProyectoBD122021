/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.vista;

import Comercial.datos.Conexion;
import Comercial.dominio.Transporte;
import Comercial.datos.TransporteDAO;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Diana
 */
public class Mantenimiento_Transporte extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mantenimiento_Transporte
     */
    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Transporte");
        modelo.addColumn("Clase Transporte");
        modelo.addColumn("Marca Transporte");
        modelo.addColumn("Modelo Transporte");
        modelo.addColumn("Tipo Transporte");
        modelo.addColumn("Placa Transporte");
        modelo.addColumn("Color Transporte");
        modelo.addColumn("Estado Transporte");
        modelo.addColumn("Motor Transporte");
        modelo.addColumn("Estatus Transporte");
        TransporteDAO transporteDAO = new TransporteDAO();

        List<Transporte> transporte = transporteDAO.select();

        Tbl_Transporte.setModel(modelo);
        String[] dato = new String[10];
        for (int i = 0; i < transporte.size(); i++) {
            dato[0] = transporte.get(i).getPK_codigo_transporte();
            dato[1] = transporte.get(i).getClase_transporte();
            dato[2] = transporte.get(i).getMarca_transporte();
            dato[3] = transporte.get(i).getModelo_transporte();
            dato[4] = transporte.get(i).getTipo_transporte();
            dato[5] = transporte.get(i).getPlaca_transporte();
            dato[6] = transporte.get(i).getColor_transporte();
            dato[7] = transporte.get(i).getEstado_transporte();
            dato[8] = transporte.get(i).getNumero_motor_transporte();
            dato[9] = transporte.get(i).getEstatus_transporte();
            //System.out.println("vendedor:" + vendedores);
            modelo.addRow(dato);
        }
    }

    public void buscar() {
        Transporte transporteAConsultar = new Transporte();
        TransporteDAO transporteDAO = new TransporteDAO();
        transporteAConsultar.setPK_codigo_transporte(Txt_id.getText());
        transporteAConsultar = transporteDAO.query(transporteAConsultar);
        Txt_clase.setText(transporteAConsultar.getClase_transporte());
        Txt_marca.setText(String.valueOf(transporteAConsultar.getMarca_transporte()));
        Txt_modelo.setText(String.valueOf(transporteAConsultar.getModelo_transporte()));
        Txt_tipo.setText(String.valueOf(transporteAConsultar.getTipo_transporte()));
        Txt_placa.setText(String.valueOf(transporteAConsultar.getPlaca_transporte()));
        Txt_color.setText(String.valueOf(transporteAConsultar.getColor_transporte()));
        Txt_estadoactual.setText(String.valueOf(transporteAConsultar.getEstado_transporte()));
        Txt_motor.setText(String.valueOf(transporteAConsultar.getNumero_motor_transporte()));
        Txt_estatus.setText(String.valueOf(transporteAConsultar.getEstatus_transporte()));
    }

    public void limpiar() {
        Txt_id.setText("");
        Txt_clase.setText("");
        Txt_marca.setText("");
        Txt_modelo.setText("");
        Txt_tipo.setText("");
        Txt_placa.setText("");
        Txt_color.setText("");
        Txt_estadoactual.setText("");
        Txt_motor.setText("");
        Txt_estatus.setText("");

    }
    public Mantenimiento_Transporte() {
        initComponents();
        llenadoDeTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        Btn_Ayuda = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Txt_id = new javax.swing.JTextField();
        Txt_clase = new javax.swing.JTextField();
        Txt_marca = new javax.swing.JTextField();
        Txt_modelo = new javax.swing.JTextField();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Modificar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        Btn_Reporte = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Txt_tipo = new javax.swing.JTextField();
        Txt_placa = new javax.swing.JTextField();
        Txt_color = new javax.swing.JTextField();
        Txt_estadoactual = new javax.swing.JTextField();
        Txt_estatus = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Txt_motor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Transporte = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Mantenimiento Transporte");

        Btn_Ayuda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Ayuda.setText("Ayuda");
        Btn_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AyudaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Transporte"));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Clase Trasnporte");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Marca Transporte");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Modelo Transporte");

        Txt_id.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Txt_clase.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Txt_marca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Txt_modelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Btn_Guardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Modificar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Modificar.setText("Modificar");
        Btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModificarActionPerformed(evt);
            }
        });

        Btn_Eliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Eliminar.setText("Eliminar");
        Btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EliminarActionPerformed(evt);
            }
        });

        Btn_Reporte.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Reporte.setText("Reporte");
        Btn_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ReporteActionPerformed(evt);
            }
        });

        Btn_Buscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Btn_Buscar.setText("Buscar");
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Tipo Transporte");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Placa Transporte");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Color Transporte");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Estado Transporte");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Estatus Transporte");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Motor Transporte");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_id)
                            .addComponent(Txt_clase)
                            .addComponent(Txt_marca)
                            .addComponent(Txt_modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(Txt_tipo))
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Buscar)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel9))
                                    .addGap(2, 2, 2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_estadoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_motor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(88, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Btn_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_id)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Btn_Buscar)
                        .addComponent(jLabel7)
                        .addComponent(Txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_clase, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel8)
                        .addComponent(Txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9)
                        .addComponent(Txt_estadoactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel11)
                        .addComponent(Txt_motor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Txt_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Guardar)
                    .addComponent(Btn_Modificar)
                    .addComponent(Btn_Eliminar)
                    .addComponent(Btn_Reporte))
                .addGap(48, 48, 48))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Transporte"));

        Tbl_Transporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tbl_Transporte);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(177, 177, 177)
                .addComponent(Btn_Ayuda)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Btn_Ayuda))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AyudaActionPerformed
        // TODO add your handling code here:
        try {
            if ((new File("src\\main\\java\\Comercial\\reportes\\AyudaMantenimientoLinea.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Comercial\\reportes\\AyudaMantenimientoTransporte.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Btn_AyudaActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        // TODO add your handling code here:
        String id = "0";
        Mantenimiento_Transporte mnttransporteDAO = new Mantenimiento_Transporte();
        TransporteDAO transporteDAO = new TransporteDAO();
        Transporte transporteAInsertar = new Transporte();
        //String cbxbodega = cbx_bodega.getSelectedItem().toString();
        transporteAInsertar.setPK_codigo_transporte(Txt_id.getText());
        transporteAInsertar.setClase_transporte(Txt_clase.getText());
        transporteAInsertar.setMarca_transporte(Txt_marca.getText());
        transporteAInsertar.setModelo_transporte(Txt_modelo.getText());
        transporteAInsertar.setTipo_transporte(Txt_tipo.getText());
        transporteAInsertar.setPlaca_transporte(Txt_placa.getText());
        transporteAInsertar.setColor_transporte(Txt_color.getText());
        transporteAInsertar.setEstado_transporte(Txt_estadoactual.getText());
        transporteAInsertar.setNumero_motor_transporte(Txt_motor.getText());
        transporteAInsertar.setEstatus_transporte(Txt_estatus.getText());

        transporteDAO.insert(transporteAInsertar);
        llenadoDeTablas();
        limpiar();
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed
        // TODO add your handling code here:
        TransporteDAO transporteDAO = new TransporteDAO();
        Transporte transporteAActualizar = new Transporte();
        transporteAActualizar.setPK_codigo_transporte(Txt_id.getText());
        transporteAActualizar.setClase_transporte(Txt_clase.getText());
        transporteAActualizar.setMarca_transporte(Txt_marca.getText());
        transporteAActualizar.setModelo_transporte(Txt_modelo.getText());
        transporteAActualizar.setTipo_transporte(Txt_tipo.getText());
        transporteAActualizar.setPlaca_transporte(Txt_placa.getText());
        transporteAActualizar.setColor_transporte(Txt_color.getText());
        transporteAActualizar.setEstado_transporte(Txt_estadoactual.getText());
        transporteAActualizar.setNumero_motor_transporte(Txt_motor.getText());
        transporteAActualizar.setEstatus_transporte(Txt_estatus.getText());
        transporteDAO.update(transporteAActualizar);
        JOptionPane.showMessageDialog(null, "Modificación Exitosa.");

        llenadoDeTablas();
        limpiar();
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    private void Btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EliminarActionPerformed
        // TODO add your handling code here:
        TransporteDAO transporteDAO = new TransporteDAO();
        Transporte transporteAEliminar = new Transporte();
        transporteAEliminar.setPK_codigo_transporte(Txt_id.getText());
        transporteDAO.delete(transporteAEliminar);
        JOptionPane.showMessageDialog(null, "Registro Eliminado.");

        llenadoDeTablas();
        limpiar();
    }//GEN-LAST:event_Btn_EliminarActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReporteActionPerformed
        // TODO add your handling code here:
         Map p = new HashMap();
                JasperReport report;
                JasperPrint print;
                try {
                    connection = Conexion.getConnection();
                    report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                            + "/src/main/java/Comercial/reportes/transporte.jrxml");
                    print = JasperFillManager.fillReport(report, p, connection);
                    JasperViewer view = new JasperViewer(print, false);
                    view.setTitle("Reporte de Transporte");
                    view.setVisible(true);
        
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }//GEN-LAST:event_Btn_ReporteActionPerformed
    private Connection connection = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ayuda;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JButton Btn_Reporte;
    private javax.swing.JTable Tbl_Transporte;
    private javax.swing.JTextField Txt_clase;
    private javax.swing.JTextField Txt_color;
    private javax.swing.JTextField Txt_estadoactual;
    private javax.swing.JTextField Txt_estatus;
    private javax.swing.JTextField Txt_id;
    private javax.swing.JTextField Txt_marca;
    private javax.swing.JTextField Txt_modelo;
    private javax.swing.JTextField Txt_motor;
    private javax.swing.JTextField Txt_placa;
    private javax.swing.JTextField Txt_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
