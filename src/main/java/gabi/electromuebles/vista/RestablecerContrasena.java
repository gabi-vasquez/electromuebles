
package gabi.electromuebles.vista;

import gabi.electromuebles.modelo.EncriptarContraseñaMd5;
import gabi.electromuebles.modelo.UsuarioDAO;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class RestablecerContrasena extends javax.swing.JPanel {

    UsuarioDAO usuDao = new UsuarioDAO();
    EncriptarContraseñaMd5 ec = new EncriptarContraseñaMd5();
    public RestablecerContrasena() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnVolverLogin = new javax.swing.JButton();
        btnCambiarCon = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPalabraClave = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();

        jTextField1.setText("jTextField1");

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(265, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gabi/electromuebles/imagenes/user.png"))); // NOI18N

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña nueva");

        btnVolverLogin.setBackground(new java.awt.Color(0, 0, 102));
        btnVolverLogin.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnVolverLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverLogin.setText("VOLVER");
        btnVolverLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverLoginActionPerformed(evt);
            }
        });

        btnCambiarCon.setBackground(new java.awt.Color(0, 0, 102));
        btnCambiarCon.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnCambiarCon.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarCon.setText("CAMBIAR");
        btnCambiarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarConActionPerformed(evt);
            }
        });

        jLabel4.setText("Palabra clave");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentLayout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(jLabel1))
                        .addGroup(contentLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(contentLayout.createSequentialGroup()
                                    .addComponent(btnCambiarCon)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnVolverLogin))
                                .addComponent(txtPalabraClave, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPalabraClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiarCon)
                    .addComponent(btnVolverLogin))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLoginActionPerformed
        mostrarPaginaLogin();
    }//GEN-LAST:event_btnVolverLoginActionPerformed

    private void btnCambiarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarConActionPerformed
        actualizarContrasena();
    }//GEN-LAST:event_btnCambiarConActionPerformed

    public void mostrarPaginaLogin(){
        Login l = new Login();
        l.setSize(1020, 560);
        l.setLocation(0, 0);
        
        content.removeAll();
        content.add(l, BorderLayout.CENTER);
        content.setSize(256, 520);
        content.revalidate();
        content.repaint();
    }
    
    public void actualizarContrasena(){
        String usuario = txtUsuario.getText();
        String palabraClave = txtPalabraClave.getText();
        char[] contrasensaChar = txtContrasena.getPassword();
        String contra = new String(contrasensaChar);
        String contrasena = ec.getMd5(contra);
        
        if(usuDao.verificarUsuarioPalabra(usuario, palabraClave) == true){
            if(usuDao.actualizarContrasena(usuario, contrasena)== true){
                JOptionPane.showMessageDialog(null, "Contrasena actualizada con exito");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la contrasena");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario y palabra claave incorrectos");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarCon;
    private javax.swing.JButton btnVolverLogin;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtPalabraClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
