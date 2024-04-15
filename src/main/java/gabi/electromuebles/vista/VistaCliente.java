package gabi.electromuebles.vista;

import gabi.electromuebles.modelo.ClienteDAO;
import gabi.electromuebles.modelo.Cliente;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class VistaCliente extends javax.swing.JPanel {

    private ClienteDAO clienteDAO = new ClienteDAO();
    private ArrayList<Cliente> clientesActualizar = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public VistaCliente() {
        clientes = clienteDAO.todosClientes();
        initComponents();
        cargarClientes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        buscarClientes = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(850, 550));

        btnBuscar.setBackground(new java.awt.Color(102, 255, 102));
        btnBuscar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "nombreCompleto", "cedula", "telefono", "direccion", "TipoCliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnNuevo.setBackground(new java.awt.Color(51, 255, 51));
        btnNuevo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 255, 51));
        btnEditar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnNuevo)
                        .addGap(42, 42, 42)
                        .addComponent(btnEditar))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(buscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(btnBuscar)))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            long cedula = Long.parseLong(buscarClientes.getText());
            Cliente cliente = clienteDAO.buscarCliente(cedula);
            if (cliente.getId() == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningun cliente con la cedula digitada");
                return;
            }
            
            String[] nombreColumnas = new String[]{
                "id", "nombreCompleto", "cedula", "telefono", "direccion", "tipoCliente"
            };
            String datos[][] = {{Integer.toString(cliente.getId()), cliente.getNombreCompleto(), Long.toString(cliente.getCedula()), Long.toString(cliente.getTelefono()), cliente.getDireccion(), cliente.getTipoCliente()}};

            actualizarModelo(datos, nombreColumnas);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo es posible buscar con el numero de cedula del cliente");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        mostrarPaginaAgregarCliente();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        for (int i = 0; i < clientesActualizar.size(); i++) {
            Cliente cliente = clientesActualizar.get(i);
            clienteDAO.actualizarCliente(cliente.getId(), cliente.getNombreCompleto(), cliente.getCedula(), cliente.getTelefono(), cliente.getDireccion(),cliente.getTipoCliente());
        }
        clientesActualizar.clear();
    }//GEN-LAST:event_btnEditarActionPerformed

    public void mostrarPaginaAgregarCliente() {
        AgregarCliente aC = new AgregarCliente();
        aC.setSize(1020, 560);
        aC.setLocation(0, 0);

        content.removeAll();
        content.add(aC, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    public void cargarClientes() {
        String[] nombreColumnas = new String[]{
            "id", "nombreCompleto", "cedula", "telefono", "direccion", "tipoCliente"
        };
        String datos[][] = new String[clientes.size()][nombreColumnas.length];

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            datos[i][0] = Integer.toString(cliente.getId());
            datos[i][1] = cliente.getNombreCompleto();
            datos[i][2] = Long.toString(cliente.getCedula());
            datos[i][3] = Long.toString(cliente.getTelefono());
            datos[i][4] = cliente.getDireccion();
            datos[i][5] = cliente.getTipoCliente();
        }
        actualizarModelo(datos, nombreColumnas);
    }

    public void actualizarModelo(String[][] datos, String[] nombreColumnas) {
        DefaultTableModel model = new DefaultTableModel(datos, nombreColumnas);
        model.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int fila = e.getFirstRow();
                    //int column = e.getColumn();

                    Cliente cliente = new Cliente();

                    int id = Integer.parseInt(model.getValueAt(fila, 0).toString());
                    String nombre = model.getValueAt(fila, 1).toString();
                    long cedula = Long.parseLong(model.getValueAt(fila, 2).toString());
                    long telefono = Long.parseLong(model.getValueAt(fila, 3).toString());
                    String direccion = model.getValueAt(fila, 4).toString();
                    String tipoCliente = model.getValueAt(fila, 5).toString();

                    cliente.setId(id);
                    cliente.setNombreCompleto(nombre);
                    cliente.setCedula(cedula);
                    cliente.setTelefono(telefono);
                    cliente.setDireccion(direccion);
                    cliente.setTipoCliente(tipoCliente);
                    clientesActualizar.add(cliente);
                }
            }
        });
        tabla.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JTextField buscarClientes;
    private javax.swing.JPanel content;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
