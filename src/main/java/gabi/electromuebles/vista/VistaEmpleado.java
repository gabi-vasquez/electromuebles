package gabi.electromuebles.vista;

import gabi.electromuebles.modelo.Empleado;
import gabi.electromuebles.modelo.EmpleadoDAO;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class VistaEmpleado extends javax.swing.JPanel {

    private EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    private ArrayList<Empleado> empleadosActualizar = new ArrayList<>();
    private int filaSeleccionada = -1;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public VistaEmpleado() {
        empleados = empleadoDAO.todosEmpleados();
        initComponents();
        cargarEmpleados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        txtbuscarEmpleados = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(850, 550));

        btnBuscar.setBackground(new java.awt.Color(102, 255, 102));
        btnBuscar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "nombreCompleto", "cedula", "telefono", "activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.setCellSelectionEnabled(true);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionarFila(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnNuevo.setBackground(new java.awt.Color(51, 255, 51));
        btnNuevo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 255, 51));
        btnEditar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnEditar.setText("ACTUALIZAR");
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
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentLayout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(txtbuscarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addComponent(btnBuscar))
                        .addGroup(contentLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(btnNuevo)
                            .addGap(42, 42, 42)
                            .addComponent(btnEditar))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
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
            long cedula = Long.parseLong(txtbuscarEmpleados.getText());
            Empleado empleado = empleadoDAO.buscarEmpleado(cedula);
            if (empleado.getId() == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningun empleado con la cedula digitada");
                return;
            }
            String[] nombreColumnas = new String[]{
                "id", "nombreCompleto", "cedula", "telefono", "activo"
            };
            String datos[][] = {{Integer.toString(empleado.getId()), empleado.getNombreCompleto(), Long.toString(empleado.getCedula()), Long.toString(empleado.getTelefono()), Boolean.toString(empleado.isActivo())}};

            actualizarModelo(datos, nombreColumnas);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo puedes buscar con el numero de cedula");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        mostrarPaginaAgregarEmpleado();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        for (int i = 0; i < empleadosActualizar.size(); i++) {
            Empleado empleado = empleadosActualizar.get(i);
            empleadoDAO.actualizarEmpleado(empleado.getId(), empleado.getNombreCompleto(), empleado.getCedula(), empleado.getTelefono(), empleado.isActivo());
        }
        empleadosActualizar.clear();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void seleccionarFila(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seleccionarFila
        filaSeleccionada = tabla.rowAtPoint(evt.getPoint());
        System.out.println(filaSeleccionada);
    }//GEN-LAST:event_seleccionarFila

    public void mostrarPaginaAgregarEmpleado() {
        AgregarEmpleado aE = new AgregarEmpleado();
        aE.setSize(1020, 560);
        aE.setLocation(0, 0);

        content.removeAll();
        content.add(aE, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    public void cargarEmpleados() {
        
        String[] nombreColumnas = new String[]{
            "id", "nombreCompleto", "cedula", "telefono", "activo"
        };
        String datos[][] = new String[empleados.size()][nombreColumnas.length];

        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            datos[i][0] = Integer.toString(empleado.getId());
            datos[i][1] = empleado.getNombreCompleto();
            datos[i][2] = Long.toString(empleado.getCedula());
            datos[i][3] = Long.toString(empleado.getTelefono());
            datos[i][4] = Boolean.toString(empleado.isActivo());
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

                    Empleado empleado = new Empleado();

                    int id = Integer.parseInt(model.getValueAt(fila, 0).toString());
                    String nombre = model.getValueAt(fila, 1).toString();
                    long cedula = Long.parseLong(model.getValueAt(fila, 2).toString());
                    long telefono = Long.parseLong(model.getValueAt(fila, 3).toString());
                    boolean activo = Boolean.parseBoolean(model.getValueAt(fila, 4).toString());

                    empleado.setId(id);
                    empleado.setNombreCompleto(nombre);
                    empleado.setCedula(cedula);
                    empleado.setTelefono(telefono);
                    empleado.setActivo(activo);
                    empleadosActualizar.add(empleado);
                }
            }
        });
        tabla.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel content;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtbuscarEmpleados;
    // End of variables declaration//GEN-END:variables
}
