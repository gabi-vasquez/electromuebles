package gabi.electromuebles.vista;

import gabi.electromuebles.modelo.Cliente;
import gabi.electromuebles.modelo.FacturaDAO;
import gabi.electromuebles.modelo.ProductoElectronicoDAO;
import gabi.electromuebles.modelo.ProductoMueble;
import gabi.electromuebles.modelo.ProductoElectronico;
import gabi.electromuebles.modelo.ProductoMuebleDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Factura extends javax.swing.JPanel {

    FacturaDAO fact = new FacturaDAO();
    ProductoElectronicoDAO peDAO = new ProductoElectronicoDAO();
    ProductoMuebleDAO pmDAO = new ProductoMuebleDAO();

    public Factura() {
        initComponents();
        cargarFecha();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBuscarProdu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedulaBuscarCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccionCl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rbMayo = new javax.swing.JRadioButton();
        rbMino = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        txtNombrepBuscar = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnAgregarFactura = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTelefonoCli = new javax.swing.JTextField();

        buttonGroup1.add(rbMayo);
        buttonGroup1.add(rbMino);

        setPreferredSize(new java.awt.Dimension(1000, 2000));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1000, 2000));

        txtBuscarProdu.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarProdu.setAutoscrolls(true);
        txtBuscarProdu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBuscarProdu.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setText("Ingresa la cedula del cliente:");

        txtCedulaBuscarCliente.setPreferredSize(new java.awt.Dimension(270, 30));

        btnBuscarCliente.setBackground(new java.awt.Color(0, 0, 102));
        btnBuscarCliente.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("BUSCAR");
        btnBuscarCliente.setPreferredSize(new java.awt.Dimension(270, 30));
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Cliente");

        txtFecha.setEditable(false);
        txtFecha.setPreferredSize(new java.awt.Dimension(270, 30));

        jLabel3.setText("Fecha");

        txtNombreCliente.setPreferredSize(new java.awt.Dimension(270, 30));

        jLabel4.setText("N° Factura");

        jLabel5.setText("Direccion");

        txtDireccionCl.setPreferredSize(new java.awt.Dimension(270, 30));

        jLabel6.setText("Cedula");

        txtCedula.setPreferredSize(new java.awt.Dimension(270, 30));

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cant.", "Producto", "Vr.Unit", "Vr. Total"
            }
        ));
        jScrollPane1.setViewportView(tablaFactura);

        jLabel8.setText("Total");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel7.setText("Factura");

        rbMayo.setSelected(true);
        rbMayo.setText("Mayorista");

        rbMino.setText("Minorista");

        jLabel9.setText("Recibi");

        btnAgregarCliente.setBackground(new java.awt.Color(0, 0, 102));
        btnAgregarCliente.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente.setText("GENERAR FACTURA");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Vr. Unit", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaProducto);

        btnBuscarProducto.setBackground(new java.awt.Color(0, 0, 102));
        btnBuscarProducto.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setText("BUSCAR");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnAgregarFactura.setBackground(new java.awt.Color(0, 0, 102));
        btnAgregarFactura.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnAgregarFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarFactura.setText("AGREGAR FACTURA");
        btnAgregarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFacturaActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefono");

        txtTelefonoCli.setMinimumSize(new java.awt.Dimension(170, 30));
        txtTelefonoCli.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout txtBuscarProduLayout = new javax.swing.GroupLayout(txtBuscarProdu);
        txtBuscarProdu.setLayout(txtBuscarProduLayout);
        txtBuscarProduLayout.setHorizontalGroup(
            txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtBuscarProduLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtBuscarProduLayout.createSequentialGroup()
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(txtBuscarProduLayout.createSequentialGroup()
                                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(txtBuscarProduLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtCedulaBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(txtDireccionCl, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtBuscarProduLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(txtBuscarProduLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(152, 152, 152))
                    .addGroup(txtBuscarProduLayout.createSequentialGroup()
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txtBuscarProduLayout.createSequentialGroup()
                                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(txtBuscarProduLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtBuscarProduLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtBuscarProduLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(btnAgregarFactura)
                                .addGap(172, 172, 172))))))
            .addGroup(txtBuscarProduLayout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtBuscarProduLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtBuscarProduLayout.createSequentialGroup()
                        .addComponent(rbMino)
                        .addGap(34, 34, 34)
                        .addComponent(rbMayo))
                    .addGroup(txtBuscarProduLayout.createSequentialGroup()
                        .addComponent(txtNombrepBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBuscarProducto)))
                .addGap(134, 134, 134))
        );
        txtBuscarProduLayout.setVerticalGroup(
            txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtBuscarProduLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtBuscarProduLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(txtBuscarProduLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCedulaBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(rbMino)
                                    .addComponent(rbMayo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionCl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtTelefonoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtBuscarProduLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtBuscarProduLayout.createSequentialGroup()
                                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombrepBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtBuscarProduLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(203, 203, 203)))))
                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtBuscarProduLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1355, 1355, 1355))
        );

        jScrollPane2.setViewportView(txtBuscarProdu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnAgregarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarFacturaActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        try {
            long cedulaBuscar = Long.parseLong(txtCedulaBuscarCliente.getText());
            Cliente cliente = fact.buscarCliente(cedulaBuscar);
            if (cliente.getId() == 0) {
                JOptionPane.showMessageDialog(null, "No existe el cliente");
                return;
            }
            txtCedula.setText(Long.toString(cliente.getCedula()));
            txtNombreCliente.setText(cliente.getNombreCompleto());
            txtDireccionCl.setText(cliente.getDireccion());
            txtTelefonoCli.setText(Long.toString(cliente.getTelefono()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar la informacion del cliente");
        }


    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        try {
            String nombre = txtNombrepBuscar.getText();
            ArrayList<ProductoMueble> muebles = pmDAO.buscarProductoMueble(nombre);
            ArrayList<ProductoElectronico> electronicos = peDAO.buscarProductoElectronico(nombre);
            if (electronicos.isEmpty() && muebles.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontro ningun producto con el nombre que digitado");
                return;
            }
            String[] nombreColumnas = new String[]{
                "nombre", "precio", "tipo"
            };
            String datos[][] = new String[electronicos.size() + muebles.size()][nombreColumnas.length];
            for (int i = 0; i < electronicos.size(); i++) {
                ProductoElectronico pe = electronicos.get(i);
                datos[i][0] = pe.getNombre();
                datos[i][1] = Double.toString(pe.getPrecio());
                datos[i][2] = pe.getTipo();
            }
            for (int i = electronicos.size(); i < electronicos.size() + muebles.size(); i++) {
                ProductoMueble pm = muebles.get(i - electronicos.size());
                datos[i][0] = pm.getNombre();
                datos[i][1] = Double.toString(pm.getPrecio());
                datos[i][2] = pm.getTipo();
            }
            DefaultTableModel model = new DefaultTableModel(datos, nombreColumnas);
            tablaProducto.setModel(model);
        }catch(Exception e){
            
           JOptionPane.showMessageDialog(null, "No se puedo cargar los datos a la tabla");
        }

    }//GEN-LAST:event_btnBuscarProductoActionPerformed

public void cargarFecha() {
    txtFecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarFactura;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JRadioButton rbMayo;
    private javax.swing.JRadioButton rbMino;
    private javax.swing.JTable tablaFactura;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JPanel txtBuscarProdu;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaBuscarCliente;
    private javax.swing.JTextField txtDireccionCl;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombrepBuscar;
    private javax.swing.JTextField txtTelefonoCli;
    // End of variables declaration//GEN-END:variables
}
