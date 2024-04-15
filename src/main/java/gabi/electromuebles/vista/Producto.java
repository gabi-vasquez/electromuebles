package gabi.electromuebles.vista;

import gabi.electromuebles.modelo.ProductoElectronico;
import gabi.electromuebles.modelo.ProductoElectronicoDAO;
import gabi.electromuebles.modelo.ProductoMueble;
import gabi.electromuebles.modelo.ProductoMuebleDAO;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class Producto extends javax.swing.JPanel {

    ProductoElectronicoDAO peDAO = new ProductoElectronicoDAO();
    ProductoMuebleDAO pmDAO = new ProductoMuebleDAO();
    ArrayList<ProductoElectronico> actProductosElectronicos = new ArrayList<>();
    ArrayList<ProductoMueble> actProductosMuebles = new ArrayList<>();

    public Producto() {
        initComponents();
        cargarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        buscarProductos = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(850, 550));

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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nombre", "descripcion", "cantidad", "precio", "tipo", "marca", "dimensiones", "material"
            }
        ));
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

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(buscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(btnBuscar))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addGap(42, 42, 42)
                                .addComponent(btnEditar)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
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
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        mostrarPaginaAgregarProducto();

    }//GEN-LAST:event_btnNuevoActionPerformed

    public void mostrarPaginaAgregarProducto() {
        AgregarProducto aP = new AgregarProducto();
        aP.setSize(1020, 560);
        aP.setLocation(0, 0);

        content.removeAll();
        content.add(aP, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    public void cargarProductos() {
        ArrayList<ProductoElectronico> electronicos = peDAO.todosProductosElectronicos();
        ArrayList<ProductoMueble> muebles = pmDAO.todosProductosMuebles();

        String[] nombreColumnas = new String[]{
            "id", "nombre", "descripcion", "cantidad", "precio", "tipo", "marca", "dimensiones", "material"
        };
        String datos[][] = new String[electronicos.size() + muebles.size()][nombreColumnas.length];

        for (int i = 0; i < electronicos.size(); i++) {
            ProductoElectronico pe = electronicos.get(i);
            datos[i][0] = Integer.toString(pe.getId());
            datos[i][1] = pe.getNombre();
            datos[i][2] = pe.getDescripcion();
            datos[i][3] = Integer.toString(pe.getCantidad());
            datos[i][4] = Double.toString(pe.getPrecio());
            datos[i][5] = pe.getTipo();
            datos[i][6] = pe.getMarca();
        }
        for (int i = electronicos.size(); i < electronicos.size() + muebles.size(); i++) {
            ProductoMueble pm = muebles.get(i - electronicos.size());
            datos[i][0] = Integer.toString(pm.getId());
            datos[i][1] = pm.getNombre();
            datos[i][2] = pm.getDescripcion();
            datos[i][3] = Integer.toString(pm.getCantidad());
            datos[i][4] = Double.toString(pm.getPrecio());
            datos[i][5] = pm.getTipo();
            datos[i][7] = pm.getDimensiones();
            datos[i][8] = pm.getMaterial();
        }

        DefaultTableModel model = new DefaultTableModel(datos, nombreColumnas);
        model.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int fila = e.getFirstRow();
                    //int column = e.getColumn();
                    int id = Integer.parseInt(model.getValueAt(fila, 0).toString());
                    String nombre = model.getValueAt(fila, 1).toString();
                    String descripcion = model.getValueAt(fila, 2).toString();
                    int cantidad = Integer.parseInt(model.getValueAt(fila, 3).toString());
                    double precio = Double.parseDouble(model.getValueAt(fila, 4).toString());
                    String tipo = model.getValueAt(fila, 5).toString();
                    String marca = model.getValueAt(fila, 6).toString();
                    String dimensiones = model.getValueAt(fila, 7).toString();
                    String material = model.getValueAt(fila, 8).toString();
                    
                    if (model.getValueAt(fila, 5).toString().equals("Electronico")) {
                        ProductoElectronico producto = new ProductoElectronico();
                        producto.setId(id);
                        producto.setDescripcion(descripcion);
                        producto.setCantidad(cantidad);
                        producto.setPrecio(precio);
                        producto.setTipo(tipo);
                        producto.setMarca(marca);
                        actProductosElectronicos.add(producto);
                    } else {
                        ProductoMueble producto = new ProductoMueble();
                        producto.setId(id);
                        producto.setDescripcion(descripcion);
                        producto.setCantidad(cantidad);
                        producto.setPrecio(precio);
                        producto.setTipo(tipo);
                        producto.setDimensiones(dimensiones);
                        producto.setMaterial(material);
                        actProductosMuebles.add(producto);

                    }
                }
            }
        });
        tabla.setModel(model);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JTextField buscarProductos;
    private javax.swing.JPanel content;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
