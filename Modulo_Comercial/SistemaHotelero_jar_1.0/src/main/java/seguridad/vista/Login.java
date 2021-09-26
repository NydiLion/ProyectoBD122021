/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.vista;

import Comercial.vista.MDIComercial;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import seguridad.datos.UsuarioDAO;
import java.awt.HeadlessException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import seguridad.datos.BitacoraDao;
import seguridad.datos.Hash;
import seguridad.datos.UsuarioDAO;
import seguridad.dominio.Usuario;
import seguridad.datos.PermisosDAO;
import seguridad.dominio.Bitacora;

/**
 *
 * @author Diana
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static String usuarioSesion = "";
    public static String usuarioComercial = "";

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(420, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        btncambiodecontra = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbxAcceso = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("SEGURIDAD DEL SISTEMA");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Contraseña");

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtUsuario.setName("txtUsuario"); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnAceptar.setText("Ingresar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtContraseña.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        btncambiodecontra.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btncambiodecontra.setText("Cambiar Contraseña");
        btncambiodecontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiodecontraActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setText("Seleccione el Area");

        cbxAcceso.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cbxAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione: ", "Area Seguridad", "Area Comercial", " " }));
        cbxAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAccesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btncambiodecontra))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cbxAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(101, 101, 101)
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(btnAceptar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)))
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btncambiodecontra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String cbx_AccesoSeguridad = cbxAcceso.getSelectedItem().toString();
        
        String cbx_AccesoComercial = cbxAcceso.getSelectedItem().toString();

        if (txtUsuario.getText().trim().isEmpty() || txtContraseña.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO PUEDEN HABER CAMPOS VACIOS", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {

                //viene de Uusuario y UsuarioDAO ...
                seguridad.dominio.Usuario usuarioAConsultar = new seguridad.dominio.Usuario();
                UsuarioDAO usuarioDAO = new UsuarioDAO();
                usuarioAConsultar.setUser_usuario((txtUsuario.getText()));

                BitacoraDao BitacoraDAO = new BitacoraDao();

                Bitacora Insertar = new Bitacora();
                Insertar.setId_Usuario(Login.usuarioSesion);
                Insertar.setAccion("Login");
                Insertar.setCodigoAplicacion("0");

                Insertar.setModulo("0");


                Insertar.setModulo("0");
                
                try {
                    BitacoraDAO.insert(Insertar);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
                }

                System.out.println(usuarioAConsultar.toString());
                // Recuperación de información a través de otro objeto
                usuarioAConsultar = usuarioDAO.query(usuarioAConsultar);
               
                // se hace llamada a Hahs.sha1 para ingresar contraseña normalmente 
                 String nuevoPass = Hash.sha1(txtContraseña.getText());
                 //en vez de txtContraseña se hace llamada a nuevoPass 
                if (nuevoPass.equals(usuarioAConsultar.getPassword_usuario()) && txtUsuario.getText().equals(usuarioAConsultar.getUser_usuario())) {
                    //  if (txtUsuario.getText().equals(Integer.toString(usuarioAConsultar.getId_usuario()))) {
                    // if (txtContraseña.getText().equals(usuarioAConsultar.getPassword_usuario())){
                    JOptionPane.showMessageDialog(null, "Bienvenido\n", "Mensaje de bienvenida", JOptionPane.INFORMATION_MESSAGE);

                    String area;
                    area = cbxAcceso.getSelectedItem().toString();

                    switch (area) {

                        case "Area Seguridad":
                                try {
                            usuarioSesion = txtUsuario.getText();
                            MDI_Sistema menuGeneral = new MDI_Sistema();
                            menuGeneral.setVisible(true);
                            this.dispose();
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        break;

                       

                        

                        case "Area Comercial":
                                
                               try {
                            usuarioComercial = txtUsuario.getText();
                            MDIComercial menucomercial = new MDIComercial();
                            menucomercial.setVisible(true);
                            this.dispose();

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        break;

                        default:
                    }

                    //----
                    PermisosDAO permisos = new PermisosDAO();
                    permisos.setNombreUsuario(usuarioAConsultar.getNombre_usuario());
                    //----

                    this.dispose();

                    JOptionPane.showMessageDialog(null, permisos.getNombreUsuario());
                } else {
                    JOptionPane.showMessageDialog(this, "ERROR AL ENCONTRAR USUARIO O CONTRASEÑA", "ERROR", JOptionPane.ERROR_MESSAGE);
                    txtContraseña.setText("");
                    txtUsuario.setText("");
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "ERROR AL ENCONTRAR USUARIO O CONTRASEÑA", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtContraseña.setText("");
                txtUsuario.setText("");

            }
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btncambiodecontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiodecontraActionPerformed
        // TODO add your handling code here:
        CambioC menuGeneral = new CambioC();
        menuGeneral.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btncambiodecontraActionPerformed

    private void cbxAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAccesoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //FLATLAF
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btncambiodecontra;
    private javax.swing.JComboBox<String> cbxAcceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
