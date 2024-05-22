
package gabi.electromuebles.vista;

import gabi.electromuebles.modelo.EncriptarContraseñaMd5;
import gabi.electromuebles.modelo.Usuario;
import gabi.electromuebles.modelo.UsuarioDAO;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JPanel {

    EncriptarContraseñaMd5 ec = new EncriptarContraseñaMd5();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnRestablecerCon = new javax.swing.JButton();

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(265, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gabi/electromuebles/imagenes/user.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel3.setText("Usuario");

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel2.setText("Contraseña");

        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyPressed(evt);
            }
        });

        btnIniciarSesion.setBackground(new java.awt.Color(0, 102, 255));
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("INICIAR SESION");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnRestablecerCon.setForeground(new java.awt.Color(51, 51, 255));
        btnRestablecerCon.setText("Restablecer contraseña");
        btnRestablecerCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txtUsuario)
                            .addComponent(jLabel2)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRestablecerCon))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIniciarSesion)
                .addGap(28, 28, 28))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRestablecerCon)
                .addGap(25, 25, 25)
                .addComponent(btnIniciarSesion)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtContrasena.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            this.inicioSesion();
        }
    }//GEN-LAST:event_txtContrasenaKeyPressed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        inicioSesion();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRestablecerConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerConActionPerformed
        mostrarPaginaRestablerContrasena();
    }//GEN-LAST:event_btnRestablecerConActionPerformed
    private void inicioSesion() {

        String usuario = txtUsuario.getText();
        char[] contrasenaChar = txtContrasena.getPassword();
        String contra = new String(contrasenaChar);

        UsuarioDAO usuDao = new UsuarioDAO();
        String contrasena = ec.getMd5(contra);
        System.out.println(contrasena);
        Usuario u = usuDao.buscarUsuario(usuario, contrasena);

        if (u.getUsuario() == null || u.getContrasena() == null) {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            return;
        }

        if (u.getUsuario().equals(usuario) && u.getContrasena().equals(contrasena)) {
           if (u.getRol().equals("Administrador")) {
                PaginaPrincipalAdministrador vistaPrincipal = new PaginaPrincipalAdministrador();
                vistaPrincipal.setVisible(true);
            }else{
                PaginaPrincipalEmpleado vistaEm = new PaginaPrincipalEmpleado();
                vistaEm.setVisible(true);
            }
        }

    }

    public void mostrarPaginaRestablerContrasena() {

        RestablecerContrasena rc = new RestablecerContrasena();
        rc.setSize(265, 500);
        rc.setLocation(0, 0);

        content.removeAll();
        content.add(rc, BorderLayout.CENTER);
        content.setSize(300, 500);
        content.revalidate();
        content.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRestablecerCon;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
