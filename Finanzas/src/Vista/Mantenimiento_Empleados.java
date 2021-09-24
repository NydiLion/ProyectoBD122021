/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.EmpleadoDAO;
import java.io.File;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.Objects;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import Modelo.Empleado;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author OtakuGT
 */
public class Mantenimiento_Empleados extends javax.swing.JInternalFrame {

    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("DPI");
        modelo.addColumn("Correo");
        modelo.addColumn("Puesto");
        modelo.addColumn("Estado");
        modelo.addColumn("Contratado");
        EmpleadoDAO empleadosDAO = new EmpleadoDAO();
        List<Empleado> empleados = empleadosDAO.select();
        Tabla.setModel(modelo);
        Object[] objeto = new Object[8];
        for (int i = 0; i < empleados.size(); i++) {
            objeto[0] = empleados.get(i).getId_empleado();
            objeto[1] = empleados.get(i).getNombre_empleado();
            objeto[2] = empleados.get(i).getApellido_empleado();
            objeto[3] = empleados.get(i).getDpi_empleado();
            objeto[4] = empleados.get(i).getCorreo_empleado();
            objeto[5] = empleados.get(i).getPuesto_empleado();
            objeto[6] = empleados.get(i).getEstado_empleado();
            objeto[7] = empleados.get(i).getFcontrato_empleado();

            modelo.addRow(objeto);
        }
    }

    /**
     * Creates new form FrmCrudUsuarios
     */
 

    public Mantenimiento_Empleados() {
        initComponents();
        llenadoDeTablas();
    }

    public void limpiar() {
        txt_ID.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_DPI.setText("");
        txt_correo.setText("");
        lbl_fcontrato.setText("");
        cbx_puesto.setSelectedItem("");
        RBEU1.setSelected(false);
        RBEU0.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGCambiarContrasena = new javax.swing.ButtonGroup();
        BtnGEstadoUs = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txt_ID = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_DPI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        RBEU1 = new javax.swing.JRadioButton();
        RBEU0 = new javax.swing.JRadioButton();
        BtnIng = new javax.swing.JButton();
        BtnMod = new javax.swing.JButton();
        BtnElim = new javax.swing.JButton();
        BtnBus = new javax.swing.JButton();
        txt_correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BtnAyuda = new javax.swing.JButton();
        BtnRep = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbx_puesto = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lbl_fcontrato = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento Empleados");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("ID Usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("DPI");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado empleado"));

        BtnGEstadoUs.add(RBEU1);
        RBEU1.setText("Habilitado");

        BtnGEstadoUs.add(RBEU0);
        RBEU0.setText("Deshabilitado");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(RBEU1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBEU0)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBEU1)
                    .addComponent(RBEU0))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        BtnIng.setText("Ingresar");
        BtnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngActionPerformed(evt);
            }
        });

        BtnMod.setText("Modificar");
        BtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModActionPerformed(evt);
            }
        });

        BtnElim.setText("Eliminar");
        BtnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimActionPerformed(evt);
            }
        });

        BtnBus.setText("Buscar");
        BtnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBusActionPerformed(evt);
            }
        });

        jLabel6.setText("Correo");

        BtnAyuda.setText("?");
        BtnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAyudaActionPerformed(evt);
            }
        });

        BtnRep.setText("Reporte");
        BtnRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRepActionPerformed(evt);
            }
        });

        jLabel5.setText("Puesto");

        cbx_puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proto 1", "Proto 2", "Proto 3" }));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Contrato"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_fcontrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lbl_fcontrato, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(txt_nombre)
                            .addComponent(txt_apellido))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnAyuda))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DPI, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(BtnIng, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnRep, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cbx_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtnBus, BtnElim, BtnIng, BtnMod});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_DPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAyuda)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbx_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIng)
                    .addComponent(BtnMod)
                    .addComponent(BtnElim)
                    .addComponent(BtnBus)
                    .addComponent(BtnRep)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BtnBus, BtnElim, BtnIng, BtnMod});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRepActionPerformed
        /*BitacoraDao BitacoraDAO = new BitacoraDao();
        Bitacora AInsertar = new Bitacora();

        AInsertar.setId_Usuario(Login.usuarioSesion);
        AInsertar.setAccion("Reporte");
        AInsertar.setCodigoAplicacion("10");
        AInsertar.setModulo("0");
        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            connection = Conexion.getConnection();
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                + "/src/main/java/seguridad/reportes/ReporteMantenimientousuarios.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Reporte de Mantenimiento Usuarios");
            view.setVisible(true);

        } catch (Exception e) {
        }*/
    }//GEN-LAST:event_BtnRepActionPerformed

    private void BtnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAyudaActionPerformed
        /*BitacoraDao BitacoraDAO = new BitacoraDao();
        Bitacora AInsertar = new Bitacora();

        AInsertar.setId_Usuario(Login.usuarioSesion);
        AInsertar.setAccion("Ayuda");
        AInsertar.setCodigoAplicacion("10");
        AInsertar.setModulo("0");
        try {
            BitacoraDAO.insert(AInsertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Mantenimiento_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if ((new File("src\\main\\java\\seguridad\\ayuda\\AyudaMantenimientoUsuarios.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\seguridad\\ayuda\\AyudaMantenimientoUsuarios.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
    }//GEN-LAST:event_BtnAyudaActionPerformed

    private void BtnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBusActionPerformed
        Empleado empleadoBuscar = new Empleado();
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        String texto=txt_ID.getText();
        texto=texto.replaceAll(" ", "");
        if(texto.length()==0){
             JOptionPane.showMessageDialog(null, "No hay texto en el ID de busqueda", "Error de busqueda", JOptionPane.ERROR_MESSAGE);
           
        }
        else  {  
            JOptionPane.showMessageDialog(null, "Registro Encontrado", "Busqueda Encontrada", JOptionPane.INFORMATION_MESSAGE);
        int IntID=Integer.parseInt(txt_ID.getText());  
        empleadoBuscar.setId_empleado(IntID);
        
        empleadoBuscar = empleadoDAO.query(empleadoBuscar);
        
        txt_ID.setText(String.valueOf(empleadoBuscar.getId_empleado()));
        txt_nombre.setText(String.valueOf(empleadoBuscar.getNombre_empleado()));
        txt_apellido.setText(String.valueOf(empleadoBuscar.getApellido_empleado()));
        txt_DPI.setText(String.valueOf(empleadoBuscar.getDpi_empleado()));
        txt_correo.setText(String.valueOf(empleadoBuscar.getCorreo_empleado()));
        cbx_puesto.setSelectedItem(empleadoBuscar.getPuesto_empleado());
         if (empleadoBuscar.getEstado_empleado() == 1) {
            RBEU1.setSelected(true);
        }
        if (empleadoBuscar.getEstado_empleado() == 0) {
            RBEU0.setSelected(true);
        }
        lbl_fcontrato.setText(String.valueOf(empleadoBuscar.getFcontrato_empleado()));

        fcontrato = empleadoBuscar.getFcontrato_empleado();
        {
        }
        llenadoDeTablas();
         }
    }//GEN-LAST:event_BtnBusActionPerformed

    private void BtnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimActionPerformed


        Empleado empleadoElim = new Empleado();
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        String texto=txt_ID.getText();
        texto=texto.replaceAll(" ", "");
        if(texto.length()==0){
             JOptionPane.showMessageDialog(null, "No hay texto en el ID", "Error", JOptionPane.ERROR_MESSAGE);
           
        }
        else  {  
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el registro?", "Alerta!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            switch (resp) {
                case JOptionPane.YES_OPTION:
                    String ID = txt_ID.getText();
                    int IntID = Integer.parseInt(ID);
                    empleadoElim.setId_empleado(IntID);
                    empleadoDAO.delete(empleadoElim);
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado.");
                    llenadoDeTablas();
                    limpiar();
                    break;
                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(null, "No se ha eliminado ningun registro");
                    break;
                case JOptionPane.CANCEL_OPTION:
                    break;
                default:
                    break;
            }
        }
        
    }//GEN-LAST:event_BtnElimActionPerformed

    private void BtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModActionPerformed
        Empleado empleadomod = new Empleado();
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de modificar el registro?", "Alerta!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        switch (resp) {
            case JOptionPane.YES_OPTION:
                String ID = txt_ID.getText();
                int IntID = Integer.parseInt(ID);
                String DPI = txt_DPI.getText();
                int IntDPI = Integer.parseInt(DPI);
                String puesto = (String) cbx_puesto.getSelectedItem();
                empleadomod.setId_empleado(IntID);
                empleadomod.setNombre_empleado(txt_nombre.getText());
                empleadomod.setApellido_empleado(txt_apellido.getText());
                empleadomod.setDpi_empleado(IntDPI);
                empleadomod.setCorreo_empleado(txt_correo.getText());
                empleadomod.setPuesto_empleado(puesto);
                //
                if (RBEU1.isSelected()) {
                    empleadomod.setEstado_empleado(1);
                }       if (RBEU0.isSelected()) {
                    empleadomod.setEstado_empleado(0);
                }       empleadomod.setFcontrato_empleado(fcontrato);
                empleadoDAO.update(empleadomod);
                JOptionPane.showMessageDialog(null, "Modificación Exitosa");
                llenadoDeTablas();
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "No se ha modificado ningun registro");
                break;
            case JOptionPane.CANCEL_OPTION:
                break;
            default:
                break;
        }
        
    }//GEN-LAST:event_BtnModActionPerformed

    private void BtnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngActionPerformed
        Empleado usuarioInsertar = new Empleado();
        EmpleadoDAO usuarioDAO = new EmpleadoDAO();

        if (txt_ID.getText().length() != 0 && txt_nombre.getText().length() != 0
            && txt_apellido.getText().length() != 0 && txt_DPI.getText().length() != 0 &&  RBEU1.isSelected() || RBEU0.isSelected()) {
            {
        String ID = txt_ID.getText();
        int IntID = Integer.parseInt(ID);
        String DPI = txt_DPI.getText();
        int IntDPI = Integer.parseInt(DPI);
        String puesto = (String) cbx_puesto.getSelectedItem();                
                usuarioInsertar.setId_empleado(IntID);
                usuarioInsertar.setNombre_empleado(txt_nombre.getText());
                usuarioInsertar.setApellido_empleado(txt_apellido.getText());
                usuarioInsertar.setDpi_empleado(IntDPI);
                usuarioInsertar.setCorreo_empleado(txt_correo.getText());
                usuarioInsertar.setPuesto_empleado(puesto);

                if (RBEU1.isSelected()) {
                    usuarioInsertar.setEstado_empleado(1);
                }
                if (RBEU0.isSelected()) {
                    usuarioInsertar.setEstado_empleado(0);
                }
                usuarioInsertar.setFcontrato_empleado(fecha.format(date));
              
                limpiar();
                llenadoDeTablas();
                usuarioDAO.insert(usuarioInsertar);
                        JOptionPane.showMessageDialog(null, "El registro se completo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios","Error!",JOptionPane.ERROR_MESSAGE);
            llenadoDeTablas();
        }
        llenadoDeTablas();
    }//GEN-LAST:event_BtnIngActionPerformed

    String fcontrato = null;
    Date date = new Date();
    DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");private Connection connection = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAyuda;
    public javax.swing.JButton BtnBus;
    public javax.swing.JButton BtnElim;
    public javax.swing.ButtonGroup BtnGCambiarContrasena;
    public javax.swing.ButtonGroup BtnGEstadoUs;
    public javax.swing.JButton BtnIng;
    public javax.swing.JButton BtnMod;
    private javax.swing.JButton BtnRep;
    public javax.swing.JRadioButton RBEU0;
    public javax.swing.JRadioButton RBEU1;
    public javax.swing.JTable Tabla;
    private javax.swing.JComboBox<String> cbx_puesto;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fcontrato;
    public javax.swing.JTextField txt_DPI;
    public javax.swing.JTextField txt_ID;
    public javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    public javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
