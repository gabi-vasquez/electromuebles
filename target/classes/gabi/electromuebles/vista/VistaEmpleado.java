package gabi.electromuebles.vista;

import gabi.electromuebles.modelo.Empleado;
import gabi.electromuebles.modelo.EmpleadoDAO;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
        btnBorrarEmple = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        content.setPreferredSize(new java.awt.Dimension(1000, 490));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 102));
        btnBuscar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
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

        btnNuevo.setBackground(new java.awt.Color(0, 0, 102));
        btnNuevo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 0, 102));
        btnEditar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("ACTUALIZAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrarEmple.setBackground(new java.awt.Color(0, 0, 102));
        btnBorrarEmple.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnBorrarEmple.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarEmple.setText("ELIMINAR");
        btnBorrarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarEmpleActionPerformed(evt);
            }
        });

        jLabel2.setText("Para buscar empleados ingresa la cedula correspondiente.");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(31, 31, 31)
                        .addComponent(btnEditar)
                        .addGap(28, 28, 28)
                        .addComponent(btnBorrarEmple))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(txtbuscarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnBuscar)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gabi/electromuebles/imagenes/emp.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(320, 390));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnBorrarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarEmpleActionPerformed
        int filaSeleccionada = tabla.getSelectedRow();
        long cedula = Long.parseLong(tabla.getValueAt(filaSeleccionada, 2).toString());
        empleadoDAO.eliminarEmpleado(cedula);
    }//GEN-LAST:event_btnBorrarEmpleActionPerformed

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
    private javax.swing.JButton btnBorrarEmple;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtbuscarEmpleados;
    // End of variables declaration//GEN-END:variables
}
