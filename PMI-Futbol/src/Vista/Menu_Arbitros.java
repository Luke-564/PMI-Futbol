
package Vista;
import Controlador.ControladorArbitros;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Controlador.ControladorArchivo;
import Controlador.ControladorJugadoras;


public class Menu_Arbitros extends javax.swing.JFrame {

    //Las tablas en java trabajan con modelos, esos son los modelos para las
    //tabla de arbitros
    DefaultTableModel modelArbitros = new DefaultTableModel();
    //tabla de funciones
    DefaultTableModel modelFunciones = new DefaultTableModel();
    //ArchivoAdd commentMore actions
    ControladorArchivo ctrlAr = new ControladorArchivo();
    
    
    public Menu_Arbitros() {
        initComponents();
        
        //Le pone titulo a la pestaña
        this.setTitle("Menu de Futbol");
        //Le asigna un tamaño
        this.setSize(1100, 600);
        
        //Crea un string con las columnas de la tabla de Arbitros
        String tabla [] = {"Internacional", "Tarjetas", "Nombre", "Apellido", "Dni","Nacimiento"};
        //Guarda el string en el modelo de Arbitros
        modelArbitros.setColumnIdentifiers(tabla);
        //A la tabla de jugadoras le guarda su modelo correspondiente
        tablaArbitros.setModel(modelArbitros);
        
        String tablaFun [] = {"Internacional", "Tarjetas", "Nombre", "Apellido", "Dni"};
        //Guarda el string en el modelo de funciones
        modelFunciones.setColumnIdentifiers(tablaFun);
        //A la tabla de funciones le guarda su modelo correspondiente
        tablaFunciones.setModel(modelFunciones);
        
        //Variables para poner texto invisible
        TextPrompt dia = new TextPrompt("dia", txtDia);
        TextPrompt mes = new TextPrompt("mes", txtMes);
        TextPrompt anio = new TextPrompt("anio", txtAnio);
        TextPrompt dni = new TextPrompt("No podrá modificarse", txtDni);
        
        // Evitar que se cierre automáticamente sin confirmar            /*confirmacion de Salida*/Add commentMore actions
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        // Agregar listener para capturar el cierre de ventana
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            ControladorArbitros controlador = new ControladorArbitros();
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(
                 Menu_Arbitros.this,
                 "¿Estás seguro que querés salir?",
                    "Confirmar salida",
                    JOptionPane.YES_NO_OPTION
                );
             if (option == JOptionPane.YES_OPTION) {
                   ctrlAr.guardarArbEnArchivo(controlador.getListaArbitros()); // Aca llamo a mi funcion de guardar 
                 System.exit(0); 
             }
         }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPrincipal = new javax.swing.JPanel();
        pestañas = new javax.swing.JTabbedPane();
        fondoArbitros = new javax.swing.JPanel();
        fondoDatos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        lblTarjetas = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        bttModificar = new javax.swing.JButton();
        bttCargar = new javax.swing.JButton();
        bttEliminar = new javax.swing.JButton();
        CkBttInternacional = new javax.swing.JCheckBox();
        txtTarjetas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArbitros = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        bttBuscar = new javax.swing.JButton();
        bttActualizarTabla = new javax.swing.JButton();
        bttVolver = new javax.swing.JButton();
        fondoFunciones = new javax.swing.JPanel();
        fondoOpciones = new javax.swing.JPanel();
        ChkBxFiltroInternacional = new javax.swing.JCheckBox();
        lblFiltros = new javax.swing.JLabel();
        bttActualizarFiltro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaFunciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPrincipal.setBackground(new java.awt.Color(132, 146, 164));
        fondoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pestañas.setBackground(new java.awt.Color(223, 227, 235));
        pestañas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        fondoArbitros.setBackground(new java.awt.Color(248, 249, 255));
        fondoArbitros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoDatos.setBackground(new java.awt.Color(223, 227, 235));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblApellido.setText("Apellido");

        lblDni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDni.setText("Dni");

        lblNacionalidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNacionalidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNacionalidad.setText("Nacionalidad");

        lblNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNacimiento.setText("Fecha de nacimiento");

        txtNombre.setBackground(new java.awt.Color(61, 74, 90));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setBackground(new java.awt.Color(61, 74, 90));
        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));

        txtDni.setBackground(new java.awt.Color(61, 74, 90));
        txtDni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));

        txtNacionalidad.setBackground(new java.awt.Color(61, 74, 90));
        txtNacionalidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNacionalidad.setForeground(new java.awt.Color(255, 255, 255));

        lblTarjetas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTarjetas.setText("Tarjetas sacadas");

        txtDia.setBackground(new java.awt.Color(61, 74, 90));
        txtDia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDia.setForeground(new java.awt.Color(255, 255, 255));

        txtMes.setBackground(new java.awt.Color(61, 74, 90));
        txtMes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMes.setForeground(new java.awt.Color(255, 255, 255));

        txtAnio.setBackground(new java.awt.Color(61, 74, 90));
        txtAnio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAnio.setForeground(new java.awt.Color(255, 255, 255));

        bttModificar.setBackground(new java.awt.Color(25, 76, 119));
        bttModificar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttModificar.setForeground(new java.awt.Color(255, 255, 255));
        bttModificar.setText("Modificar");
        bttModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttModificarActionPerformed(evt);
            }
        });

        bttCargar.setBackground(new java.awt.Color(25, 76, 119));
        bttCargar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttCargar.setForeground(new java.awt.Color(255, 255, 255));
        bttCargar.setText("Cargar");
        bttCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCargarActionPerformed(evt);
            }
        });

        bttEliminar.setBackground(new java.awt.Color(53, 37, 68));
        bttEliminar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttEliminar.setForeground(new java.awt.Color(255, 255, 255));
        bttEliminar.setText("ELIMINAR");
        bttEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarActionPerformed(evt);
            }
        });

        CkBttInternacional.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CkBttInternacional.setText("Internacional");
        CkBttInternacional.setToolTipText("");
        CkBttInternacional.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        CkBttInternacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CkBttInternacionalActionPerformed(evt);
            }
        });

        txtTarjetas.setBackground(new java.awt.Color(61, 74, 90));
        txtTarjetas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTarjetas.setForeground(new java.awt.Color(255, 255, 255));
        txtTarjetas.setText("0");
        txtTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarjetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoDatosLayout = new javax.swing.GroupLayout(fondoDatos);
        fondoDatos.setLayout(fondoDatosLayout);
        fondoDatosLayout.setHorizontalGroup(
            fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoDatosLayout.createSequentialGroup()
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblDni)
                            .addComponent(lblNacionalidad))
                        .addGap(18, 18, 18)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CkBttInternacional)
                            .addGroup(fondoDatosLayout.createSequentialGroup()
                                .addComponent(lblTarjetas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(fondoDatosLayout.createSequentialGroup()
                        .addComponent(lblNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bttModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bttCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bttEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );
        fondoDatosLayout.setVerticalGroup(
            fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoDatosLayout.createSequentialGroup()
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTarjetas)
                            .addComponent(txtTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(CkBttInternacional)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDni)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNacionalidad)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNacimiento)))
                    .addGroup(fondoDatosLayout.createSequentialGroup()
                        .addComponent(bttModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttEliminar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        fondoArbitros.add(fondoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 21, 1010, 230));

        tablaArbitros.setBackground(new java.awt.Color(223, 227, 235));
        tablaArbitros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaArbitros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArbitrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaArbitros);

        fondoArbitros.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 800, 200));

        txtBuscar.setBackground(new java.awt.Color(61, 74, 90));
        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        fondoArbitros.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, -1));

        bttBuscar.setBackground(new java.awt.Color(32, 45, 60));
        bttBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttBuscar.setForeground(new java.awt.Color(255, 255, 255));
        bttBuscar.setText("Buscar");
        bttBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarActionPerformed(evt);
            }
        });
        fondoArbitros.add(bttBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 200, -1));

        bttActualizarTabla.setBackground(new java.awt.Color(25, 76, 119));
        bttActualizarTabla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttActualizarTabla.setForeground(new java.awt.Color(255, 255, 255));
        bttActualizarTabla.setText("Actualizar Tabla");
        bttActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttActualizarTablaActionPerformed(evt);
            }
        });
        fondoArbitros.add(bttActualizarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 200, -1));

        bttVolver.setBackground(new java.awt.Color(53, 37, 68));
        bttVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttVolver.setForeground(new java.awt.Color(255, 255, 255));
        bttVolver.setText("Volver");
        bttVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVolverActionPerformed(evt);
            }
        });
        fondoArbitros.add(bttVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 200, -1));

        pestañas.addTab("Menu", fondoArbitros);

        fondoFunciones.setBackground(new java.awt.Color(248, 249, 255));
        fondoFunciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoOpciones.setBackground(new java.awt.Color(223, 227, 235));

        ChkBxFiltroInternacional.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ChkBxFiltroInternacional.setText("Es internacional");
        ChkBxFiltroInternacional.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ChkBxFiltroInternacional.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ChkBxFiltroInternacionalStateChanged(evt);
            }
        });
        ChkBxFiltroInternacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBxFiltroInternacionalActionPerformed(evt);
            }
        });

        lblFiltros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFiltros.setText("Filtros");

        bttActualizarFiltro.setBackground(new java.awt.Color(25, 76, 119));
        bttActualizarFiltro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttActualizarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        bttActualizarFiltro.setText("Actualizar Tabla");
        bttActualizarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttActualizarFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoOpcionesLayout = new javax.swing.GroupLayout(fondoOpciones);
        fondoOpciones.setLayout(fondoOpcionesLayout);
        fondoOpcionesLayout.setHorizontalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChkBxFiltroInternacional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttActualizarFiltro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        fondoOpcionesLayout.setVerticalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChkBxFiltroInternacional)
                .addGap(18, 18, 18)
                .addComponent(bttActualizarFiltro)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        fondoFunciones.add(fondoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 430));

        tablaFunciones.setBackground(new java.awt.Color(223, 227, 235));
        tablaFunciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaFunciones);

        fondoFunciones.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 17, 720, 430));

        pestañas.addTab("Funciones", fondoFunciones);

        fondoPrincipal.add(pestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1040, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttModificarActionPerformed
        //Crea el lanza error
        boolean error = false;
        //Crea el cartel de muestra error
        JDialog informe = new JDialog(this, "Error!", true);
        informe.setSize(200, 150);
        informe.setLayout(new GridLayout(2, 1));
        informe.setLocationRelativeTo(this);
        
        String dni = txtDni.getText();
        ControladorArbitros controlador = new ControladorArbitros();
            
        try{
        controlador.setArbitro(controlador.getArbitroPorDni(dni));
        controlador.eliminarArbitroLista(dni);
        
        //Va guardando los datos obtenidos en el controlador, en caso de tener
        //un campo vacio, manda error con la variable error
        controlador.setArbitroNombre(txtNombre.getText().toUpperCase());
        if(controlador.getArbitroNombre().isEmpty()){
            throw new RuntimeException();
        }
        controlador.setArbitroApellido(txtApellido.getText().toUpperCase());
        if(controlador.getArbitroApellido().isEmpty()){
            throw new RuntimeException();
        }
        controlador.setArbitroNacionalidad(txtNacionalidad.getText().toUpperCase());
        if(controlador.getArbitroNacionalidad().isEmpty()){
            throw new RuntimeException();
        }
        controlador.setArbitroDni(txtDni.getText());
        if(controlador.getArbitroDni().isEmpty()){
            throw new RuntimeException();
        }
        controlador.setArbitroInternacional(CkBttInternacional.isSelected());
        if(controlador.getArbitrosInternacionales() == null){
            throw new RuntimeException();
        }
        controlador.setArbitroNacimiento(Integer.parseInt((String)txtDia.getText()),
               Integer.parseInt((String)txtMes.getText()), Integer.parseInt((String)txtAnio.getText()));
        if(controlador.getArbitroNacimientoAnio()== 0){
                throw new RuntimeException();
            }
        controlador.setArbitroTarjetas(Integer.parseInt((String)txtTarjetas.getText()));
        if(controlador.getArbitroTarjetas() < 0){
            throw new RuntimeException();
        }
        }
        catch(Exception e){
            error = true;
        }
        //Aca es cuando evalua si muestra error o cargado con exito
        if (error) {
            JOptionPane.showMessageDialog(this,"Campos incompletos o erroneos. Posiblemente el dni sea incorrecto o no exista");
        } else {
            //Guarda la jugadora a la lista
            controlador.setArbitroLista();
            refrescarTablaArbitros();
            JOptionPane.showMessageDialog(this,"Arbitro modificado con exito.");
        }

        //Refresca los txt, los deja sin contenido escrito por el usuario
        txtNombre.setText("");
        txtApellido.setText("");
        txtNacionalidad.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtAnio.setText("");
        txtDni.setText("");
        txtTarjetas.setText("");
        CkBttInternacional.setSelected(false);
    }//GEN-LAST:event_bttModificarActionPerformed

    private void bttCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCargarActionPerformed

         //Crea el lanza error
        boolean error = false;
            //Crea el cartel de muestra error
        JDialog informe = new JDialog(this, "Error!", true);
        informe.setSize(200, 150);
        informe.setLayout(new GridLayout(2, 1));
        informe.setLocationRelativeTo(this);

         //Crea un nuevo controlador de arbitros
        ControladorArbitros controlador = new ControladorArbitros();
            //Va guardando los datos obtenidos en el controlador, en caso de tener
            //un campo vacio, manda error con la variable error
        controlador.setArbitroNombre(txtNombre.getText().toUpperCase());
        if(controlador.getArbitroNombre().isEmpty()){
            error = true;
        }
        controlador.setArbitroApellido(txtApellido.getText().toUpperCase());
        if(controlador.getArbitroApellido().isEmpty()){
            error = true;
        }
        controlador.setArbitroNacionalidad(txtNacionalidad.getText().toUpperCase());
        if(controlador.getArbitroNacionalidad().isEmpty()){
            error = true;
        }
        controlador.setArbitroDni(txtDni.getText());
        if(controlador.getArbitroDni().isEmpty()){
            error = true;
        }
        controlador.setArbitroInternacional(CkBttInternacional.isSelected());
        if(controlador.getArbitrosInternacionales() == null){
            error = true;
        }
        
        try{
        controlador.setArbitroTarjetas(Integer.parseInt((String)txtTarjetas.getText()));
        if(controlador.getArbitroTarjetas() < 0){
            error = true;
        }
        controlador.setArbitroNacimiento(Integer.parseInt((String)txtDia.getText()),
               Integer.parseInt((String)txtMes.getText()), Integer.parseInt((String)txtAnio.getText()));
        if(controlador.getArbitroNacimientoAnio()== 0){
                error = true;
            }
        }
        catch(Exception e){
            error = true;
        }
        //Aca es cuando evalua si muestra error o cargado con exito
        if (error) {
            JOptionPane.showMessageDialog(this,"Campos incompletos o erroneos.");
        } else {
            //Guarda el Arbitro a la lista
            controlador.setArbitroLista();
            
            refrescarTablaArbitros();
            JOptionPane.showMessageDialog(this,"Arbitro cargado con exito.");
        }

        //Refresca los txt, los deja sin contenido escrito por el usuario
        txtNombre.setText("");
        txtApellido.setText("");
        txtNacionalidad.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtAnio.setText("");
        txtDni.setText("");
        txtTarjetas.setText("");
        CkBttInternacional.setSelected(false);
    }//GEN-LAST:event_bttCargarActionPerformed
    

    
    private void bttEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarActionPerformed
        //Crea el lanza error
        boolean error = false;
        //Crea el cartel de muestra error
        JDialog informe = new JDialog(this, "Error!", true);
        informe.setSize(200, 150);
        informe.setLayout(new GridLayout(2, 1));
        informe.setLocationRelativeTo(this);

        //Ver que onda
        String dni = txtDni.getText();
        ControladorArbitros controlador = new ControladorArbitros();
        try{
            controlador.eliminarArbitroLista(dni);
        } catch(Exception e){
            error = true;
        }
        if (error){
            JOptionPane.showMessageDialog(this,"No se pudo eliminar.");
        }
        else {
            JOptionPane.showMessageDialog(this,"Arbitro eliminado.");
            refrescarTablaArbitros();
        }
                //Refresca los txt, los deja sin contenido escrito por el usuario
        txtNombre.setText("");
        txtApellido.setText("");
        txtNacionalidad.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtAnio.setText("");
        txtDni.setText("");
        txtTarjetas.setText("");
        CkBttInternacional.setSelected(false);
    }//GEN-LAST:event_bttEliminarActionPerformed

    private void bttBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarActionPerformed
        // TODO add your handling code here:
        String nombre = txtBuscar.getText().toUpperCase();
        
        ControladorArbitros controlador = new ControladorArbitros();
        //Crea el objeto que tendra las filas de la tabla
        Object[] fila = new Object[6];
        //Elimina contenido anterior de la tabla
        while (modelArbitros.getRowCount() > 0) {
        modelArbitros.removeRow(0);
            }
        for (int i = 0; i < controlador.getArbitroSoloPorNombre(nombre).size(); i++) {
            controlador.setArbitroDeListaExterna(controlador.getArbitroSoloPorNombre(nombre), i);
            //Va guardando los datos correspondientes en las filas del objeto
            fila[0] = Boolean.toString(controlador.isArbitroInternacional());
            fila[1] = Integer.toString(controlador.getArbitroTarjetas());
            fila[2] = controlador.getArbitroNombre();
            fila[3] = controlador.getArbitroApellido();
            fila[4] = controlador.getArbitroDni();
            fila[5] = (Integer.toString(controlador.getArbitroNacimientoDia())+"/"+Integer.toString(controlador.getArbitroNacimientoMes())+"/"+
                        Integer.toString(controlador.getArbitroNacimientoAnio()));
            //Guarda las filas en la tabla
            modelArbitros.addRow(fila);
        }
    }//GEN-LAST:event_bttBuscarActionPerformed
    
//Metodo para refrescar la tabla de arbitros
    public void refrescarTablaArbitros(){
        //Crea un controlador de arbitros
        ControladorArbitros controlador = new ControladorArbitros();
        //Crea el objeto que tendra las filas de la tabla
        String[] fila = new String[6];
        //Elimina contenido anterior de la tabla
        while (modelArbitros.getRowCount() > 0) {
            modelArbitros.removeRow(0);
        }
        //Recorre la lista del controlador
        for (int i = 0; i < controlador.getSizeLista(); i++) {
            //Guarda la jugadora de dicho lugar de la fila en la variable jugadora del controlador
            controlador.setArbitro(controlador.getArbitroLista(i));
            //Va guardando los datos correspondientes en las filas del objeto
            fila[0] = Boolean.toString(controlador.isArbitroInternacional());
            fila[1] = Integer.toString(controlador.getArbitroTarjetas());
            fila[2] = controlador.getArbitroNombre();
            fila[3] = controlador.getArbitroApellido();
            fila[4] = controlador.getArbitroDni();
            fila[5] = (Integer.toString(controlador.getArbitroNacimientoDia())+"/"+Integer.toString(controlador.getArbitroNacimientoMes())+"/"+
                        Integer.toString(controlador.getArbitroNacimientoAnio()));
            //Guarda las filas en la tabla
            modelArbitros.addRow(fila);
        } 
    }
    public void refrescarTablaFunciones(){
        //Crea un controlador de arbitros
        ControladorArbitros controlador = new ControladorArbitros();
        //Crea el objeto que tendra las filas de la tabla
        String[] fila = new String[5];
        //Elimina contenido anterior de la tabla
        while (modelFunciones.getRowCount() > 0) {
            modelFunciones.removeRow(0);
        }
        if((boolean)ChkBxFiltroInternacional.isSelected() == true){
            //Recorre la lista del controlador
            for (int i = 0; i < controlador.getArbitrosInternacionales().size(); i++) {
              //Guarda la jugadora de dicho lugar de la fila en la variable jugadora del controlador
              controlador.setArbitroDeListaExterna(controlador.getArbitrosInternacionales(),i);
              //Va guardando los datos correspondientes en las filas del objeto
              fila[0] = Boolean.toString(controlador.isArbitroInternacional());
              fila[1] = Integer.toString(controlador.getArbitroTarjetas());
              fila[2] = controlador.getArbitroNombre();
              fila[3] = controlador.getArbitroApellido();
              fila[4] = controlador.getArbitroDni();
               //Guarda las filas en la tabla
              modelFunciones.addRow(fila);
            } 
        }
        else{
            for (int i = 0; i < controlador.getSizeLista(); i++) {
            //Guarda la jugadora de dicho lugar de la fila en la variable jugadora del controlador
            controlador.setArbitroDesdeLista(i);
            if(controlador.isArbitroInternacional() == false){
            //Va guardando los datos correspondientes en las filas del objeto
            fila[0] = Boolean.toString(controlador.isArbitroInternacional());
            fila[1] = Integer.toString(controlador.getArbitroTarjetas());
            fila[2] = controlador.getArbitroNombre();
            fila[3] = controlador.getArbitroApellido();
            fila[4] = controlador.getArbitroDni();
            //Guarda las filas en la tabla
            modelFunciones.addRow(fila);
            }
            }
        }
    }
    private void bttActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttActualizarTablaActionPerformed
        // TODO add your handling code here:
        refrescarTablaArbitros();

    }//GEN-LAST:event_bttActualizarTablaActionPerformed

    private void CkBttInternacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CkBttInternacionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CkBttInternacionalActionPerformed

    private void ChkBxFiltroInternacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBxFiltroInternacionalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ChkBxFiltroInternacionalActionPerformed

    private void ChkBxFiltroInternacionalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ChkBxFiltroInternacionalStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkBxFiltroInternacionalStateChanged

    private void bttActualizarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttActualizarFiltroActionPerformed
        // TODO add your handling code here:
        refrescarTablaFunciones();
    }//GEN-LAST:event_bttActualizarFiltroActionPerformed

    private void bttVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVolverActionPerformed
        //Boton de volver a la Ventana Principal
        VentanaPrincipal inicio = new VentanaPrincipal();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.setVisible(false);
    
    }//GEN-LAST:event_bttVolverActionPerformed

    private void txtTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarjetasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarjetasActionPerformed

    private void tablaArbitrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArbitrosMouseClicked
        int row = tablaArbitros.getSelectedRow();
        int col = tablaArbitros.getSelectedColumn();
        ControladorArbitros controlador = new ControladorArbitros();
        if(row != -1 && col != -1){
            String dni = (String)tablaArbitros.getValueAt(row, col);
            controlador.setArbitro(controlador.getArbitroPorDni(dni));
            txtNombre.setText(controlador.getArbitroNombre());
            txtApellido.setText(controlador.getArbitroApellido());
            txtDni.setText(controlador.getArbitroDni());
            txtNacionalidad.setText(controlador.getArbitroNacionalidad());
            txtDia.setText(Integer.toString(controlador.getArbitroNacimientoDia()));
            txtMes.setText(Integer.toString(controlador.getArbitroNacimientoMes()));
            txtAnio.setText(Integer.toString(controlador.getArbitroNacimientoAnio()));
            txtTarjetas.setText(Integer.toString(controlador.getArbitroTarjetas()));
            CkBttInternacional.setSelected(controlador.isArbitroInternacional());
        }
        
        
        
    }//GEN-LAST:event_tablaArbitrosMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkBxFiltroInternacional;
    private javax.swing.JCheckBox CkBttInternacional;
    private javax.swing.JButton bttActualizarFiltro;
    private javax.swing.JButton bttActualizarTabla;
    private javax.swing.JButton bttBuscar;
    private javax.swing.JButton bttCargar;
    private javax.swing.JButton bttEliminar;
    private javax.swing.JButton bttModificar;
    private javax.swing.JButton bttVolver;
    private javax.swing.JPanel fondoArbitros;
    private javax.swing.JPanel fondoDatos;
    private javax.swing.JPanel fondoFunciones;
    private javax.swing.JPanel fondoOpciones;
    private javax.swing.JPanel fondoPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFiltros;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTarjetas;
    private javax.swing.JTabbedPane pestañas;
    private javax.swing.JTable tablaArbitros;
    private javax.swing.JTable tablaFunciones;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTarjetas;
    // End of variables declaration//GEN-END:variables
}
