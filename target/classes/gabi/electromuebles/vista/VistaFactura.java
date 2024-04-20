package gabi.electromuebles.vista;

import gabi.electromuebles.modelo.Cliente;
import gabi.electromuebles.modelo.DetallesFactura;
import gabi.electromuebles.modelo.DetallesFacturaDAO;
import gabi.electromuebles.modelo.Empleado;
import gabi.electromuebles.modelo.Factura;
import gabi.electromuebles.modelo.EmpleadoDAO;
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

public class VistaFactura extends javax.swing.JPanel {

    FacturaDAO fact = new FacturaDAO();
    EmpleadoDAO empDAO = new EmpleadoDAO();
    ProductoElectronicoDAO peDAO = new ProductoElectronicoDAO();
    ProductoMuebleDAO pmDAO = new ProductoMuebleDAO();
    DetallesFacturaDAO dfDAO = new DetallesFacturaDAO();
    ArrayList<String[]> productos = new ArrayList<>();
    double valorTotal = 0.0;

    public VistaFactura() {
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
        jLabel5 = new javax.swing.JLabel();
        txtDireccionCl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtTotalFactura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rbMayo = new javax.swing.JRadioButton();
        rbMino = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtRecibi = new javax.swing.JTextField();
        btnGenerarFactura = new javax.swing.JButton();
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

        jLabel5.setText("Direccion");

        txtDireccionCl.setPreferredSize(new java.awt.Dimension(270, 30));

        jLabel6.setText("Id");

        txtId.setPreferredSize(new java.awt.Dimension(270, 30));

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cant.", "Producto", "Vr. Unit", "Vr. Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaFactura);

        jLabel8.setText("Total");

        txtTotalFactura.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel7.setText("Factura");

        rbMayo.setSelected(true);
        rbMayo.setText("Mayorista");

        rbMino.setText("Minorista");

        jLabel9.setText("Recibi");

        btnGenerarFactura.setBackground(new java.awt.Color(0, 0, 102));
        btnGenerarFactura.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnGenerarFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarFactura.setText("GENERAR FACTURA");
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Producto", "Vr. Unit", "Tipo", "Cant. Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
                                                .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(157, 307, Short.MAX_VALUE))
                    .addGroup(txtBuscarProduLayout.createSequentialGroup()
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txtBuscarProduLayout.createSequentialGroup()
                                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(txtBuscarProduLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRecibi, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtBuscarProduLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(btnAgregarFactura)
                                .addGap(172, 172, 172))
                            .addGroup(txtBuscarProduLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombrepBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtBuscarProduLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRecibi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(txtBuscarProduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarFactura))
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

    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed
        try {
            String nombreEmpleado = txtRecibi.getText();
            Empleado empleado = empDAO.buscarEmpleadoPorNombre(nombreEmpleado);
            if (empleado.getId() == 0) {
                JOptionPane.showMessageDialog(null, "Empleado NO encontrado");
                return;
            }
            int idCliente = Integer.parseInt(txtId.getText());
            int idEmpleado = empleado.getId();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formatter.parse(txtFecha.getText());
            Factura factura = fact.crearFactura(idCliente, idEmpleado, fecha, valorTotal);
            if(factura.getId() == 0){
                JOptionPane.showMessageDialog(null, "No se pudo generar la factura -> ID");
                return;
            }
            
            for(int i = 0; i < productos.size(); i++) {
                String[] infoProducto = productos.get(i);
                if(infoProducto[1].equals("Electronico")) {
                    int id = Integer.parseInt(infoProducto[0]);
                    int cantidad = Integer.parseInt(infoProducto[2]);
                    int cantidadTotal = Integer.parseInt(infoProducto[3]);
                    peDAO.actualizarCatidad(id, cantidadTotal - cantidad);
                    dfDAO.crearDetallesFactura(factura.getId(), id, 0, cantidad, Double.parseDouble(infoProducto[4]), Double.parseDouble(infoProducto[5]));
                } else {
                    int id = Integer.parseInt(infoProducto[0]);
                    int cantidad = Integer.parseInt(infoProducto[2]);
                    int cantidadTotal = Integer.parseInt(infoProducto[3]);
                    pmDAO.actualizarCatidad(id, cantidadTotal - cantidad);
                    dfDAO.crearDetallesFactura(factura.getId(), 0, id, cantidad, Double.parseDouble(infoProducto[4]), Double.parseDouble(infoProducto[5]));
                }
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar la factura");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    private void btnAgregarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFacturaActionPerformed
        try {
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de productos que deseas agegar a la facura"));
            int filaSeleccionada = tablaProducto.getSelectedRow();
            int id = Integer.parseInt(tablaProducto.getValueAt(filaSeleccionada, 0).toString());
            String nombre = tablaProducto.getValueAt(filaSeleccionada, 1).toString();
            double valorUnitario = Double.parseDouble(tablaProducto.getValueAt(filaSeleccionada, 2).toString());
            String tipo = tablaProducto.getValueAt(filaSeleccionada, 3).toString();
            int cantidadTotal = Integer.parseInt(tablaProducto.getValueAt(filaSeleccionada, 4).toString());
            if (cantidad > cantidadTotal) {
                JOptionPane.showMessageDialog(null, "Cantidad de productos no disponibles");
                return;
            }

            String[] nombreColumnas = new String[]{
                "Id", "Cant.", "Producto", "Vr. Unit", "Vr. Total"
            };
            int cantidadFilas = tablaFactura.getModel().getRowCount();
            int cantidadColumnas = nombreColumnas.length;
            Object datos[][] = new String[cantidadFilas + 1][cantidadColumnas];

            for (int i = 0; i < cantidadFilas; i++) {
                for (int j = 0; j < cantidadColumnas; j++) {
                    Object valor = tablaFactura.getValueAt(i, j);
                    datos[i][j] = valor;
                }
            }

            double valorTotalProducto = cantidad * valorUnitario;
            valorTotal += valorTotalProducto;
            
            String producto[] = {
                Integer.toString(id),
                tipo, 
                Integer.toString(cantidad), 
                Integer.toString(cantidadTotal),
                Double.toString(valorUnitario),
                Double.toString(valorTotalProducto),
            };
            productos.add(producto);
            
            datos[cantidadFilas][0] = Integer.toString(id);
            datos[cantidadFilas][1] = Integer.toString(cantidad);
            datos[cantidadFilas][2] = nombre;
            datos[cantidadFilas][3] = Double.toString(valorUnitario);
            datos[cantidadFilas][4] = Double.toString(valorTotalProducto);

            DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                    datos,
                    nombreColumnas
            ) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            txtTotalFactura.setText(Double.toString(valorTotal));
            tablaFactura.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO se pudo agregar el producto a la factura");
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnAgregarFacturaActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        try {
            long cedulaBuscar = Long.parseLong(txtCedulaBuscarCliente.getText());
            Cliente cliente = fact.buscarCliente(cedulaBuscar);
            if (cliente.getId() == 0) {
                JOptionPane.showMessageDialog(null, "No existe el cliente");
                return;
            }
            txtId.setText(Integer.toString(cliente.getId()));
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
                "Id", "Producto", "Vr. Unit", "Tipo", "Cant. Total"
            };
            String datos[][] = new String[electronicos.size() + muebles.size()][nombreColumnas.length];
            for (int i = 0; i < electronicos.size(); i++) {
                ProductoElectronico pe = electronicos.get(i);
                datos[i][0] = Integer.toString(pe.getId());
                datos[i][1] = pe.getNombre();
                datos[i][2] = Double.toString(pe.getPrecio());
                datos[i][3] = pe.getTipo();
                datos[i][4] = Integer.toString(pe.getCantidad());
            }
            for (int i = electronicos.size(); i < electronicos.size() + muebles.size(); i++) {
                ProductoMueble pm = muebles.get(i - electronicos.size());
                datos[i][0] = Integer.toString(pm.getId());
                datos[i][1] = pm.getNombre();
                datos[i][2] = Double.toString(pm.getPrecio());
                datos[i][3] = pm.getTipo();
                datos[i][4] = Integer.toString(pm.getCantidad());
            }
            DefaultTableModel model = new DefaultTableModel(datos, nombreColumnas);
            tablaProducto.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puedo cargar los datos a la tabla");
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    public void cargarFecha() {
        txtFecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFactura;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rbMayo;
    private javax.swing.JRadioButton rbMino;
    private javax.swing.JTable tablaFactura;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JPanel txtBuscarProdu;
    private javax.swing.JTextField txtCedulaBuscarCliente;
    private javax.swing.JTextField txtDireccionCl;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombrepBuscar;
    private javax.swing.JTextField txtRecibi;
    private javax.swing.JTextField txtTelefonoCli;
    private javax.swing.JTextField txtTotalFactura;
    // End of variables declaration//GEN-END:variables
}
