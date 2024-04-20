package gabi.electromuebles.vista;

import gabi.electromuebles.modelo.ProductoElectronico;
import gabi.electromuebles.modelo.ProductoElectronicoDAO;
import gabi.electromuebles.modelo.ProductoMueble;
import gabi.electromuebles.modelo.ProductoMuebleDAO;
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

public class Producto extends javax.swing.JPanel {

    private final static String PRODUCTO = "src/main/java/gabi/electromuebles/imagenes/producto1.png";

    ProductoElectronicoDAO peDAO = new ProductoElectronicoDAO();
    ProductoMuebleDAO pmDAO = new ProductoMuebleDAO();
    ArrayList<ProductoElectronico> actProductosElectronicos = new ArrayList<>();
    ArrayList<ProductoMueble> actProductosMuebles = new ArrayList<>();

    public Producto() {
        initComponents();
        cargarImagenes();
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
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        content.setPreferredSize(new java.awt.Dimension(1000, 550));

        buscarProductos.setText("        ");

        btnBuscar.setBackground(new java.awt.Color(0, 0, 102));
        btnBuscar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.lightGray));
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
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnNuevo.setBackground(new java.awt.Color(0, 0, 102));
        btnNuevo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 0, 102));
        btnEditar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 102));
        btnEliminar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(buscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnBuscar))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnEditar)
                        .addGap(43, 43, 43)
                        .addComponent(btnEliminar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buscarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(293, 293, 293))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        mostrarPaginaAgregarProducto();

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        System.out.println("Buscar producto");
        String nombre = buscarProductos.getText();
        ArrayList<ProductoElectronico> electronicos = peDAO.buscarProductoElectronico(nombre);
        ArrayList<ProductoMueble> muebles = pmDAO.buscarProductoMueble(nombre);
        if (electronicos.isEmpty() && muebles.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontro ningun producto con el nombre que digito");
            return;
        }
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

                    if (model.getValueAt(fila, 5).toString().equals("Electronico")) {
                        String marca = model.getValueAt(fila, 6).toString();
                        ProductoElectronico producto = new ProductoElectronico();
                        producto.setId(id);
                        producto.setDescripcion(descripcion);
                        producto.setCantidad(cantidad);
                        producto.setPrecio(precio);
                        producto.setTipo(tipo);
                        producto.setMarca(marca);
                        actProductosElectronicos.add(producto);
                    } else {
                        String dimensiones = model.getValueAt(fila, 7).toString();
                        String material = model.getValueAt(fila, 8).toString();
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
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        for (int i = 0; i < actProductosElectronicos.size(); i++) {
            ProductoElectronico pe = actProductosElectronicos.get(i);
            peDAO.actualizarProductoElectronico(pe.getId(), pe.getNombre(), pe.getDescripcion(), pe.getCantidad(), pe.getPrecio(), pe.getTipo(), pe.getMarca());
        }
        actProductosElectronicos.clear();
        
        for (int i = 0; i < actProductosMuebles.size(); i++) {
            ProductoMueble pm = actProductosMuebles.get(i);
            pmDAO.actualizarProductoMueble(pm.getId(), pm.getNombre(), pm.getDescripcion(), pm.getCantidad(), pm.getPrecio(), pm.getTipo(), pm.getDimensiones(),pm.getMaterial());
        }
        actProductosMuebles.clear();

           
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            int filaSeleccionada = tabla.getSelectedRow();
            String tipo = tabla.getValueAt(filaSeleccionada, 5).toString();
            int id = Integer.parseInt(tabla.getValueAt(filaSeleccionada,0).toString());
            if(tipo.equals("Electronico")){
                peDAO.eliminarProductoElectronico(id);
            }else{
                pmDAO.eliminarProductoMueble(id);
            }
        }catch(Exception e){
            System.out.println("Error en la eliminacion del producto");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void mostrarPaginaAgregarProducto() {
        AgregarProducto aP = new AgregarProducto();
        aP.setSize(1020, 1020);
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

                    if (model.getValueAt(fila, 5).toString().equals("Electronico")) {
                        String marca = model.getValueAt(fila, 6).toString();
                        ProductoElectronico producto = new ProductoElectronico();
                        producto.setId(id);
                        producto.setNombre(nombre);
                        producto.setDescripcion(descripcion);
                        producto.setCantidad(cantidad);
                        producto.setPrecio(precio);
                        producto.setTipo(tipo);
                        producto.setMarca(marca);
                        actProductosElectronicos.add(producto);
                    } else {
                        String dimensiones = model.getValueAt(fila, 7).toString();
                        String material = model.getValueAt(fila, 8).toString();
                        ProductoMueble producto = new ProductoMueble();
                        producto.setId(id);
                        producto.setNombre(nombre);
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

    private void cargarImagenes() {
        BufferedImage img = null;

        try {
            img = ImageIO.read(new File(PRODUCTO));
            Image dimg = img.getScaledInstance(230, 280, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            jLabel2.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JTextField buscarProductos;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
