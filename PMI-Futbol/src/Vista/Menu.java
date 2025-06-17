
package Vista;
//Liberias
import Controlador.ControladorJugadoras;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Controlador.ControladorArchivo;

public class Menu extends javax.swing.JFrame {
    
    //Las tablas en java trabajan con modelos, esos son los modelos para las
    //tabla de jugadora
    DefaultTableModel modelJugadoras = new DefaultTableModel();
    //tabla de equipos
    DefaultTableModel modelEquipos = new DefaultTableModel();
    //tabla de Goles
    DefaultTableModel modelGoles = new DefaultTableModel();
    //tabla de Rojas
    DefaultTableModel modelRojas = new DefaultTableModel();
    //tabla de Posicion
    DefaultTableModel modelPosicion = new DefaultTableModel();
    //ArchivoAdd commentMore actions
    ControladorArchivo ctrlAr = new ControladorArchivo();
    
    public Menu() {
        initComponents();
        
        //Le pone titulo a la pestaña
        this.setTitle("Menu de Futbol");
        //Le asigna un tamaño
        this.setSize(1100, 600);
        
        //Crea un string con las columnas de la tabla de jugadoras
        String tabla [] = {"DNI", "NOMBRE", "APELLIDO","CLUB", "POSICION","GOLES"};
        //Guarda el string en el modelo de jugadoras
        modelJugadoras.setColumnIdentifiers(tabla);
        //A la tabla de jugadoras le guarda su modelo correspondiente
        tablaJugadoras.setModel(modelJugadoras);
        
        //Crea un string con las columnas de la tabla de equipos
        String tablaClub [] = {"EQUIPO", "JUGADORAS" };
        //Guarda el string en el modelo de equipos
        modelEquipos.setColumnIdentifiers(tablaClub);
        //A la tabla de equipos le guarda su modelo correspondiente
        tablaEquipos.setModel(modelEquipos);
        
        //Crea un string con las columnas de la tabla de goles
        String tablagol [] = {"EQUIPO", "NOMBRE","APELLIDO", "GOLES" };
        //Guarda el string en el modelo de goles
        modelGoles.setColumnIdentifiers(tablagol);
        //A la tabla de goles le guarda su modelo correspondiente
        tablaGoles.setModel(modelGoles);
        
        //Crea un string con las columnas de la tabla de rojas
        String tablaroja [] = {"EQUIPO", "NOMBRE","APELLIDO", "EXPULSIONES" };
        //Guarda el string en el modelo de rojas
        modelRojas.setColumnIdentifiers(tablaroja);
        //A la tabla de rojas le guarda su modelo correspondiente
        tablaRojas.setModel(modelRojas);
        
        //Crea un string con las columnas de la tabla de posicion
        String tablaposicion [] = {"POSICION", "JUGADORAS" };
        //Guarda el string en el modelo de rojas
        modelPosicion.setColumnIdentifiers(tablaposicion);
        //A la tabla de rojas le guarda su modelo correspondiente
        tablaPosicion.setModel(modelPosicion);
        
        //Variables para poner texto invisible
        TextPrompt dia = new TextPrompt("dia", txtDia);
        TextPrompt mes = new TextPrompt("mes", txtMes);
        TextPrompt anio = new TextPrompt("anio", txtAnio);
        TextPrompt dni = new TextPrompt("No podrá modificarse", txtDni);
        
        // Evitar que se cierre automáticamente sin confirmar            /*confirmacion de Salida*/Add commentMore actions
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Agregar listener para capturar el cierre de ventana
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            ControladorJugadoras controlador = new ControladorJugadoras();
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(
                 Menu.this,
                 "¿Estás seguro que querés salir?",
                    "Confirmar salida",
                    JOptionPane.YES_NO_OPTION
                );
             if (option == JOptionPane.YES_OPTION) {
                   ctrlAr.guardarJuEnArchivo(controlador.getListaJugadoras()); // Aca llamo a mi funcion de guardar 
                 System.exit(0); 
             }
         }
        });
        bttModificar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttGrupoFunciones = new javax.swing.ButtonGroup();
        fondoPrincipal = new javax.swing.JPanel();
        pestañas = new javax.swing.JTabbedPane();
        fondoJugadoras = new javax.swing.JPanel();
        fondoDatos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        lblPosicion = new javax.swing.JLabel();
        lblClub = new javax.swing.JLabel();
        lblGoles = new javax.swing.JLabel();
        lblTarjetas = new javax.swing.JLabel();
        cboPosicion = new javax.swing.JComboBox<>();
        cboClub = new javax.swing.JComboBox<>();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        lblAmarillas = new javax.swing.JLabel();
        lblRojas = new javax.swing.JLabel();
        bttModificar = new javax.swing.JButton();
        bttCargar = new javax.swing.JButton();
        bttEliminar = new javax.swing.JButton();
        txtAmarillas = new javax.swing.JTextField();
        txtGoles = new javax.swing.JTextField();
        txtRojas = new javax.swing.JTextField();
        cboNacionalidad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugadoras = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        bttBuscar = new javax.swing.JButton();
        bttVolver = new javax.swing.JButton();
        bttActualizarTabla1 = new javax.swing.JButton();
        fondoFunciones = new javax.swing.JPanel();
        fondoOpciones = new javax.swing.JPanel();
        bttCantJu = new javax.swing.JRadioButton();
        bttCantGoles = new javax.swing.JRadioButton();
        lblTituloBuscar = new javax.swing.JLabel();
        bttMasExpu = new javax.swing.JRadioButton();
        bttJugadorasPosicion = new javax.swing.JRadioButton();
        tapaPestañas = new javax.swing.JPanel();
        pestañasOpciones = new javax.swing.JTabbedPane();
        vacio = new javax.swing.JPanel();
        cantJu = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEquipos = new javax.swing.JTable();
        cantGol = new javax.swing.JPanel();
        txtBuscarCantidadGoles = new javax.swing.JTextField();
        bttBuscarCantidadGoles = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaGoles = new javax.swing.JTable();
        masExpulsiones = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaRojas = new javax.swing.JTable();
        porPosicion = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPosicion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPrincipal.setBackground(new java.awt.Color(242, 235, 242));
        fondoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pestañas.setBackground(new java.awt.Color(198, 197, 217));
        pestañas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        fondoJugadoras.setBackground(new java.awt.Color(128, 111, 166));
        fondoJugadoras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
        fondoJugadoras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoDatos.setBackground(new java.awt.Color(190, 143, 191));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblApellido.setText("Apellido");

        lblDni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDni.setText("Dni");

        lblNacionalidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNacionalidad.setText("Nacionalidad");

        lblNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNacimiento.setText("Fecha de nacimiento");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtDni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblPosicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPosicion.setText("Posición");

        lblClub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblClub.setText("Club");

        lblGoles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGoles.setText("Goles");

        lblTarjetas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTarjetas.setText("Tarjetas");

        cboPosicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DELANTERA", "ARQUERA", "DEFENSORA", "MEDIOCAMPISTA" }));

        cboClub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboClub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOCA", "RIVER", "RACING", "INDEPENDIENTE", "TIGRE", "JUVENTUD", "ESTUDIANTES", "PLATENSE", "BANFIELD", "LANUS" }));

        txtDia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtMes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtAnio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblAmarillas.setText("Amarillas");

        lblRojas.setText("Rojas");

        bttModificar.setBackground(new java.awt.Color(242, 235, 242));
        bttModificar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttModificar.setText("Modificar");
        bttModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(198, 197, 217), 2));
        bttModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttModificarActionPerformed(evt);
            }
        });

        bttCargar.setBackground(new java.awt.Color(242, 235, 242));
        bttCargar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttCargar.setText("Cargar");
        bttCargar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(198, 197, 217), 2));
        bttCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCargarActionPerformed(evt);
            }
        });

        bttEliminar.setBackground(new java.awt.Color(48, 97, 140));
        bttEliminar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttEliminar.setText("ELIMINAR");
        bttEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 51, 112), 2));
        bttEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEliminarActionPerformed(evt);
            }
        });

        txtAmarillas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtGoles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtRojas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cboNacionalidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARGENTINA", "BOLIVIANA", "PERUANA", "URUGUAYA", "BRASILERA", " ", " " }));

        javax.swing.GroupLayout fondoDatosLayout = new javax.swing.GroupLayout(fondoDatos);
        fondoDatos.setLayout(fondoDatosLayout);
        fondoDatosLayout.setHorizontalGroup(
            fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fondoDatosLayout.createSequentialGroup()
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoDatosLayout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(53, 53, 53)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoDatosLayout.createSequentialGroup()
                                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellido)
                                    .addComponent(lblDni))
                                .addGap(53, 53, 53)
                                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAmarillas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondoDatosLayout.createSequentialGroup()
                                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblGoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cboPosicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboClub, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(fondoDatosLayout.createSequentialGroup()
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(fondoDatosLayout.createSequentialGroup()
                                .addComponent(lblNacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoDatosLayout.createSequentialGroup()
                                .addComponent(lblNacionalidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboNacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoDatosLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lblAmarillas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTarjetas)
                                .addGap(64, 64, 64)
                                .addComponent(lblRojas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoDatosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRojas, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bttModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bttEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        fondoDatosLayout.setVerticalGroup(
            fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoDatosLayout.createSequentialGroup()
                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPosicion)
                            .addComponent(cboPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClub)
                            .addComponent(cboClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDni)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGoles)
                            .addComponent(txtGoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNacionalidad)
                                .addComponent(cboNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAmarillas)
                                .addComponent(lblTarjetas)
                                .addComponent(lblRojas)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNacimiento)
                            .addComponent(txtAmarillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRojas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fondoDatosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(bttModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondoJugadoras.add(fondoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 21, 990, -1));

        tablaJugadoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaJugadoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaJugadorasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaJugadoras);

        fondoJugadoras.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 790, 200));

        txtBuscar.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fondoJugadoras.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 192, -1));

        bttBuscar.setBackground(new java.awt.Color(242, 235, 242));
        bttBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttBuscar.setText("Buscar");
        bttBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(198, 197, 217), 2));
        bttBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarActionPerformed(evt);
            }
        });
        fondoJugadoras.add(bttBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 192, -1));

        bttVolver.setBackground(new java.awt.Color(48, 97, 140));
        bttVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttVolver.setText("Volver");
        bttVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 51, 112), 3));
        bttVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVolverActionPerformed(evt);
            }
        });
        fondoJugadoras.add(bttVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 192, -1));

        bttActualizarTabla1.setBackground(new java.awt.Color(242, 235, 242));
        bttActualizarTabla1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttActualizarTabla1.setText("Actualizar Tabla");
        bttActualizarTabla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(198, 197, 217), 2));
        bttActualizarTabla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttActualizarTabla1ActionPerformed(evt);
            }
        });
        fondoJugadoras.add(bttActualizarTabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 192, -1));

        pestañas.addTab("Menu", fondoJugadoras);

        fondoFunciones.setBackground(new java.awt.Color(128, 111, 166));
        fondoFunciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
        fondoFunciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoOpciones.setBackground(new java.awt.Color(190, 143, 191));

        bttCantJu.setBackground(new java.awt.Color(190, 143, 191));
        bttGrupoFunciones.add(bttCantJu);
        bttCantJu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttCantJu.setText("Cantidad de jugadoras");
        bttCantJu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttCantJuMouseClicked(evt);
            }
        });

        bttCantGoles.setBackground(new java.awt.Color(190, 143, 191));
        bttGrupoFunciones.add(bttCantGoles);
        bttCantGoles.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttCantGoles.setText("Cantidad de goles");
        bttCantGoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttCantGolesMouseClicked(evt);
            }
        });

        lblTituloBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloBuscar.setText("Buscar por:");

        bttMasExpu.setBackground(new java.awt.Color(190, 143, 191));
        bttGrupoFunciones.add(bttMasExpu);
        bttMasExpu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttMasExpu.setText("Más expulsiones");
        bttMasExpu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttMasExpuMouseClicked(evt);
            }
        });

        bttJugadorasPosicion.setBackground(new java.awt.Color(190, 143, 191));
        bttGrupoFunciones.add(bttJugadorasPosicion);
        bttJugadorasPosicion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttJugadorasPosicion.setText("Jugadoras por posicion");
        bttJugadorasPosicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttJugadorasPosicionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fondoOpcionesLayout = new javax.swing.GroupLayout(fondoOpciones);
        fondoOpciones.setLayout(fondoOpcionesLayout);
        fondoOpcionesLayout.setHorizontalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoOpcionesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblTituloBuscar))
                    .addGroup(fondoOpcionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bttJugadorasPosicion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(bttMasExpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttCantGoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bttCantJu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        fondoOpcionesLayout.setVerticalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTituloBuscar)
                .addGap(25, 25, 25)
                .addComponent(bttCantJu)
                .addGap(18, 18, 18)
                .addComponent(bttCantGoles)
                .addGap(18, 18, 18)
                .addComponent(bttMasExpu)
                .addGap(18, 18, 18)
                .addComponent(bttJugadorasPosicion)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        fondoFunciones.add(fondoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 430));

        tapaPestañas.setBackground(new java.awt.Color(128, 111, 166));

        javax.swing.GroupLayout tapaPestañasLayout = new javax.swing.GroupLayout(tapaPestañas);
        tapaPestañas.setLayout(tapaPestañasLayout);
        tapaPestañasLayout.setHorizontalGroup(
            tapaPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        tapaPestañasLayout.setVerticalGroup(
            tapaPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        fondoFunciones.add(tapaPestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 720, 30));

        javax.swing.GroupLayout vacioLayout = new javax.swing.GroupLayout(vacio);
        vacio.setLayout(vacioLayout);
        vacioLayout.setHorizontalGroup(
            vacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        vacioLayout.setVerticalGroup(
            vacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        pestañasOpciones.addTab("tab5", vacio);

        cantJu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tablaEquipos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaEquipos);

        javax.swing.GroupLayout cantJuLayout = new javax.swing.GroupLayout(cantJu);
        cantJu.setLayout(cantJuLayout);
        cantJuLayout.setHorizontalGroup(
            cantJuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cantJuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
        );
        cantJuLayout.setVerticalGroup(
            cantJuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cantJuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );

        pestañasOpciones.addTab("tab1", cantJu);

        txtBuscarCantidadGoles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        bttBuscarCantidadGoles.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttBuscarCantidadGoles.setText("Buscar");
        bttBuscarCantidadGoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttBuscarCantidadGolesActionPerformed(evt);
            }
        });

        tablaGoles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaGoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaGoles);

        javax.swing.GroupLayout cantGolLayout = new javax.swing.GroupLayout(cantGol);
        cantGol.setLayout(cantGolLayout);
        cantGolLayout.setHorizontalGroup(
            cantGolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cantGolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cantGolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(cantGolLayout.createSequentialGroup()
                        .addComponent(txtBuscarCantidadGoles, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttBuscarCantidadGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        cantGolLayout.setVerticalGroup(
            cantGolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cantGolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cantGolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttBuscarCantidadGoles)
                    .addComponent(txtBuscarCantidadGoles))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        pestañasOpciones.addTab("tab2", cantGol);

        tablaRojas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaRojas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaRojas);

        javax.swing.GroupLayout masExpulsionesLayout = new javax.swing.GroupLayout(masExpulsiones);
        masExpulsiones.setLayout(masExpulsionesLayout);
        masExpulsionesLayout.setHorizontalGroup(
            masExpulsionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masExpulsionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        masExpulsionesLayout.setVerticalGroup(
            masExpulsionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masExpulsionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );

        pestañasOpciones.addTab("tab3", masExpulsiones);

        tablaPosicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaPosicion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaPosicion);

        javax.swing.GroupLayout porPosicionLayout = new javax.swing.GroupLayout(porPosicion);
        porPosicion.setLayout(porPosicionLayout);
        porPosicionLayout.setHorizontalGroup(
            porPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(porPosicionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        porPosicionLayout.setVerticalGroup(
            porPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, porPosicionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pestañasOpciones.addTab("tab4", porPosicion);

        fondoFunciones.add(pestañasOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 720, 430));

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
    
    //Botones para cambiar de funciones
    private void bttCantJuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttCantJuMouseClicked
        //conecta la opcion con la pestaña correspondiente
        pestañasOpciones.setSelectedIndex(1);
        ControladorJugadoras controlador = new ControladorJugadoras();
        refrescarTablas();
        //Crea el objeto que tendra las filas de la tabla
        Object[] fila = new Object[2];
        fila[0] = "BOCA";
        fila[1] = controlador.cantidadEquipo("BOCA");
        modelEquipos.addRow(fila);
        fila[0] = "RIVER";
        fila[1] = controlador.cantidadEquipo("RIVER");
        modelEquipos.addRow(fila);
        fila[0] = "RACING";
        fila[1] = controlador.cantidadEquipo("RACING");
        modelEquipos.addRow(fila);
        fila[0] = "INDEPENDIENTE";
        fila[1] = controlador.cantidadEquipo("INDEPENDIENTE");
        modelEquipos.addRow(fila);
        fila[0] = "TIGRE";
        fila[1] = controlador.cantidadEquipo("TIGRE");
        modelEquipos.addRow(fila);
        fila[0] = "JUVENTUD";
        fila[1] = controlador.cantidadEquipo("JUVENTUD");
        modelEquipos.addRow(fila);
        fila[0] = "ESTUDIANTES";
        fila[1] = controlador.cantidadEquipo("ESTUDIANTES");
        modelEquipos.addRow(fila);
        fila[0] = "PLATENSE";
        fila[1] = controlador.cantidadEquipo("PLATENSE");
        modelEquipos.addRow(fila);
        fila[0] = "BANFIELD";
        fila[1] = controlador.cantidadEquipo("BANFIELD");
        modelEquipos.addRow(fila);
        fila[0] = "LANUS";
        fila[1] = controlador.cantidadEquipo("LANUS");
        modelEquipos.addRow(fila);
    }//GEN-LAST:event_bttCantJuMouseClicked

    private void bttCantGolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttCantGolesMouseClicked
        //conecta la opcion con la pestaña correspondiente
        pestañasOpciones.setSelectedIndex(2);
    }//GEN-LAST:event_bttCantGolesMouseClicked

    private void bttMasExpuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttMasExpuMouseClicked
        //conecta la opcion con la pestaña correspondiente
        pestañasOpciones.setSelectedIndex(3);
        //Controlador
        ControladorJugadoras controlador = new ControladorJugadoras();
        refrescarTablas();
        //Crea un objeto que tendra las filas de la tabla
        Object[] fila = new Object[4];
        //Recorre la lista de la funcion masExpulsiones
        for(int i = 0; i < controlador.masExpulsiones().size(); i++) {
            controlador.guardarJugadora(controlador.masExpulsiones(), i);
            fila[0] = controlador.getClubJugadora();
            fila[1] = controlador.getNombreJugadora();
            fila[2] = controlador.getApellidoJugadora();
            fila[3] = controlador.getRojasJugadora();
            modelRojas.addRow(fila);
        }
    }//GEN-LAST:event_bttMasExpuMouseClicked

    private void bttJugadorasPosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttJugadorasPosicionMouseClicked
        //conecta la opcion con la pestaña correspondiente
        pestañasOpciones.setSelectedIndex(4);
        //Controlador
        ControladorJugadoras controlador = new ControladorJugadoras();
        refrescarTablas();
        //Crea el objeto que tendra las filas de la tabla
        Object[] fila = new Object[2];
        fila[0] = "DELANTERA";
        fila[1] = controlador.jugadorasDePosicion("DELANTERA");
        modelPosicion.addRow(fila);
        fila[0] = "ARQUERA";
        fila[1] = controlador.jugadorasDePosicion("ARQUERA");
        modelPosicion.addRow(fila);
        fila[0] = "DEFENSORA";
        fila[1] = controlador.jugadorasDePosicion("DEFENSORA");
        modelPosicion.addRow(fila);
        fila[0] = "MEDIOCAMPISTA";
        fila[1] = controlador.jugadorasDePosicion("MEDIOCAMPISTA");
        modelPosicion.addRow(fila);
    }//GEN-LAST:event_bttJugadorasPosicionMouseClicked

    //Boton de cargar una jugadora
    private void bttCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCargarActionPerformed
        
        //Crea el lanza error
        boolean error = false;
        //Crea el cartel de muestra error
        JDialog informe = new JDialog(this, "Error!", true);
        informe.setSize(200, 150);
        informe.setLayout(new GridLayout(2, 1));
        informe.setLocationRelativeTo(this);
        
        //Crea un nuevo controlador de jugadoras
        ControladorJugadoras controlador = new ControladorJugadoras();
        //Va guardando los datos obtenidos en el controlador, en caso de tener
        //un campo vacio, manda error con la variable error
        controlador.setJugadoraNombre(txtNombre.getText());
        if(controlador.getNombreJugadora().isEmpty()){
            error = true;
        }
        controlador.setJugadoraApellido(txtApellido.getText());
        if(controlador.getApellidoJugadora().isEmpty()){
            error = true;
        }
        controlador.setJugadoraNacimiento(Integer.parseInt((String)txtDia.getText()), 
            Integer.parseInt((String)txtMes.getText()), Integer.parseInt((String)txtAnio.getText()));
        if(controlador.getNacimientoAnioJugadora() == 0){
            error = true;
        }
        controlador.setJugadoraNacionalidad(cboNacionalidad.getSelectedItem().toString());
        if(controlador.getNacionalidadJugadora().isEmpty()){
            error = true;
        }
        controlador.setJugadoraPosicion(cboPosicion.getSelectedItem().toString());
        if(controlador.getPosicionJugadora().isEmpty()){
            error = true;
        }
        controlador.setJugadoraClub(cboClub.getSelectedItem().toString());
        if(controlador.getClubJugadora().isEmpty()){
            error = true;
        }
        controlador.setJugadoraT_Amarillas(Integer.parseInt((String)txtAmarillas.getText()));
        if(controlador.getAmarillasJugadora() == -1){
            error = true;
        }
        controlador.setJugadoraT_Rojas(Integer.parseInt((String)txtRojas.getText()));
        if(controlador.getRojasJugadora() == -1){
            error = true;
        }
        controlador.setJugadoraGoles(Integer.parseInt((String)txtGoles.getText()));
        if(controlador.getGolesJugadora() == -1){
            error = true;
        }
        controlador.setJugadoraDni(txtDni.getText());
        if(controlador.getDniJugadora().isEmpty()){
            error = true;
        }
    
        //Aca es cuando evalua si muestra error o cargado con exito
        if (error) {
            JOptionPane.showMessageDialog(this,"Complete todos los campos.");
        } else {
            try{
                //Guarda la jugadora a la lista
                controlador.agregarJugadoraALaLista();
                refrescarTablaCarga();
                JOptionPane.showMessageDialog(this,"Jugadora cargada con exito.");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"No se pudo cargar jugadora. Demasiadas en el equipo");
            }
        }
        
        //Refresca los txt, los deja sin contenido escrito por el usuario
        txtNombre.setText("");
        txtApellido.setText("");
        //txtNacionalidad.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtAnio.setText("");
        txtDni.setText("");
        txtGoles.setText("");
        txtRojas.setText("");
        txtAmarillas.setText("");
        //
        bttModificar.setEnabled(false);
    }//GEN-LAST:event_bttCargarActionPerformed

    //Boton de volver a la Ventana Principal
    private void bttVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVolverActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal inicio = new VentanaPrincipal();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_bttVolverActionPerformed

    //Boton de Actualizar datos de la jugadora
    private void bttModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttModificarActionPerformed
        //Crea el lanza error
        boolean error = false;
        //Crea el cartel de muestra error
        JDialog informe = new JDialog(this, "Error!", true);
        informe.setSize(200, 150);
        informe.setLayout(new GridLayout(2, 1));
        informe.setLocationRelativeTo(this);
        //Desbloquea el txtdni
        txtDni.setEnabled(true);
        String dni = txtDni.getText();
        ControladorJugadoras controlador = new ControladorJugadoras();
        controlador.setJugadora(controlador.buscarDniJugadora(dni));
        //Va guardando los datos obtenidos en el controlador, en caso de tener
        //un campo vacio, manda error con la variable error
        controlador.setJugadoraNombre(txtNombre.getText());
        if(controlador.getNombreJugadora().isEmpty()){
            error = true;
        }
        controlador.setJugadoraApellido(txtApellido.getText());
        if(controlador.getApellidoJugadora().isEmpty()){
            error = true;
        }
        controlador.setJugadoraNacimiento(Integer.parseInt((String)txtDia.getText()),
               Integer.parseInt((String)txtMes.getText()), Integer.parseInt((String)txtAnio.getText()));
        if(controlador.getNacimientoAnioJugadora()== 0){
                error = true;
            }
        controlador.setJugadoraNacionalidad(cboNacionalidad.getSelectedItem().toString());
        if(controlador.getNacionalidadJugadora().isEmpty()){
            error = true;
        }
        controlador.setJugadoraPosicion(cboPosicion.getSelectedItem().toString());
        if(controlador.getPosicionJugadora().isEmpty()){
            error = true;
        }
        controlador.setJugadoraClub(cboClub.getSelectedItem().toString());
        String club = cboClub.getSelectedItem().toString();
        if(controlador.getClubJugadora().isEmpty()){
            error = true;
        }
        controlador.setJugadoraT_Amarillas(Integer.parseInt((String)txtAmarillas.getText()));
        if(controlador.getAmarillasJugadora() == -1){
            error = true;
        }
        controlador.setJugadoraT_Rojas(Integer.parseInt((String)txtRojas.getText()));
        if(controlador.getRojasJugadora() == -1){
            error = true;
        }
        controlador.setJugadoraGoles(Integer.parseInt((String)txtGoles.getText()));
        if(controlador.getGolesJugadora() == -1){
            error = true;
        }
        controlador.setJugadoraDni(txtDni.getText());
        if(controlador.getDniJugadora().isEmpty()){
            error = true;
        }
        
        //Aca es cuando evalua si muestra error o cargado con exito
        if (error) {
            JOptionPane.showMessageDialog(this,"Complete todos los campos.");
        } else {
            try{
                //Guarda la jugadora a la lista
                if(5 == controlador.cantidadJugadorasPorEquipo(club)) {
                    controlador.agregarJugadoraALaLista();
                    controlador.setJugadora(controlador.buscarDniJugadora(dni));
                    controlador.eliminarJugadora(dni);
                    JOptionPane.showMessageDialog(this,"Jugadora modificada con exito.");
                }
                else if(7 == controlador.cantidadJugadorasPorEquipo(club)) {
                    controlador.setJugadora(controlador.buscarDniJugadora(dni));
                    controlador.eliminarJugadora(dni);
                    controlador.agregarJugadoraALaLista();
                    JOptionPane.showMessageDialog(this,"Jugadora modificada con exito.");
                }
                else {
                    controlador.setJugadora(controlador.buscarDniJugadora(dni));
                    controlador.eliminarJugadora(dni);
                    controlador.agregarJugadoraALaLista();
                    JOptionPane.showMessageDialog(this,"Jugadora modificada con exito.");
                }
            }
            catch(RuntimeException e){
                JOptionPane.showMessageDialog(this,"NO se pudo.");
            }
        }
        
        refrescarTablaCarga();
        
        //Refresca los txt, los deja sin contenido escrito por el usuario
        txtNombre.setText("");
        txtApellido.setText("");
        //txtNacionalidad.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtAnio.setText("");
        txtDni.setText("");
        txtGoles.setText("");
        txtRojas.setText("");
        txtAmarillas.setText("");
        bttCargar.setEnabled(true);
    }//GEN-LAST:event_bttModificarActionPerformed

    //Botton de Eliminar una jugadora
    private void bttEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEliminarActionPerformed
        //Crea el lanza error
        boolean error = false;
        //Crea el cartel de muestra error
        JDialog informe = new JDialog(this, "Error!", true);
        informe.setSize(200, 150);
        informe.setLayout(new GridLayout(2, 1));
        informe.setLocationRelativeTo(this);
        
        //Guarda el dni
        String dni = txtDni.getText();
        //Crea controlador
        ControladorJugadoras controlador = new ControladorJugadoras();
        //Intenta eliminar
        try{
            controlador.eliminarJugadora(dni);
        } catch(Exception e){
            error = true;
        }
        if (error){
            JOptionPane.showMessageDialog(this,"No se puede eliminar. Minimo de jugadoras en equipo");
        }
        else {
            String str = txtNombre.getText();
            if(str.isEmpty()){
                JOptionPane.showMessageDialog(this,"No hay datos.");
            }
            else {
                JOptionPane.showMessageDialog(this,"Jugadora eliminada.");
            }
        }
        bttCargar.setEnabled(true);
        txtDni.setEnabled(true);
        //Refresca los txt, los deja sin contenido escrito por el usuario
        txtNombre.setText("");
        txtApellido.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtAnio.setText("");
        txtDni.setText("");
        txtGoles.setText("");
        txtRojas.setText("");
        txtAmarillas.setText("");
        refrescarTablas();
        //
        bttModificar.setEnabled(false);
    }//GEN-LAST:event_bttEliminarActionPerformed

    //Boton de buscar una jugadora
    private void bttBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarActionPerformed
        // TODO add your handling code here:
        String nombre = txtBuscar.getText().toUpperCase();
        ControladorJugadoras controlador = new ControladorJugadoras();
        //Elimina contenido anterior de la tabla
        while (modelJugadoras.getRowCount() > 0) {
            modelJugadoras.removeRow(0);
        }  
        for (int i = 0; i < controlador.busqueda_Nombre(nombre).size(); i++) {
            controlador.guardarJugadora(controlador.busqueda_Nombre(nombre), i);
            
            //Crea el objeto que tendra las filas de la tabla
            Object[] fila = new Object[6];        
            //Va guardando los datos correspondientes en las filas del objeto
            fila[0] = controlador.getDniJugadora();
            fila[3] = controlador.getClubJugadora();
            fila[1] = controlador.getNombreJugadora();
            fila[2] = controlador.getApellidoJugadora();
            fila[4] = controlador.getPosicionJugadora();
            fila[5] = controlador.getDniJugadora();
            //Guarda las filas en la tabla
            modelJugadoras.addRow(fila);
        }
        if(controlador.busqueda_Nombre(nombre).isEmpty()){
            controlador.setJugadora(controlador.buscarDniJugadora(nombre));
            
            //Crea el objeto que tendra las filas de la tabla
            Object[] fila = new Object[6];        
            //Va guardando los datos correspondientes en las filas del objeto
            fila[0] = controlador.getDniJugadora();
            fila[3] = controlador.getClubJugadora();
            fila[1] = controlador.getNombreJugadora();
            fila[2] = controlador.getApellidoJugadora();
            fila[4] = controlador.getPosicionJugadora();
            fila[5] = controlador.getGolesJugadora();
            //Guarda las filas en la tabla
            modelJugadoras.addRow(fila);
        }
        if(controlador.busqueda_Nombre(nombre).isEmpty()){
            for (int i = 0; i < controlador.busquedaApellido(nombre).size(); i++) {
                controlador.guardarJugadora(controlador.busquedaApellido(nombre), i);
            
                //Crea el objeto que tendra las filas de la tabla
                Object[] fila = new Object[6];         
                //Va guardando los datos correspondientes en las filas del objeto
                fila[0] = controlador.getDniJugadora();
                fila[3] = controlador.getClubJugadora();
                fila[1] = controlador.getNombreJugadora();
                fila[2] = controlador.getApellidoJugadora();
                fila[4] = controlador.getPosicionJugadora();
                fila[5] = controlador.getDniJugadora();
                //Guarda las filas en la tabla
                modelJugadoras.addRow(fila);
            }
        }
        bttModificar.setEnabled(false);
    }//GEN-LAST:event_bttBuscarActionPerformed

    //Boton de actualizar tabla de jugadoras
    private void bttActualizarTabla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttActualizarTabla1ActionPerformed
        // TODO add your handling code here:
        refrescarTablaCarga();
        txtDni.setEnabled(true);
        bttCargar.setEnabled(true);
        bttModificar.setEnabled(false);
    }//GEN-LAST:event_bttActualizarTabla1ActionPerformed

    //Boton de buscar por goles
    private void bttBuscarCantidadGolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttBuscarCantidadGolesActionPerformed
        // TODO add your handling code here:
        refrescarTablas();
        int goles = Integer.parseInt((String)txtBuscarCantidadGoles.getText());
        //Controlador 
        ControladorJugadoras controlador = new ControladorJugadoras();
        //Crea el objeto que tendra las filas de la tabla
        Object[] fila = new Object[4];
        //Recorre la lista de cantidad de goles
        for(int i = 0; i < controlador.cantGoles(goles).size();i++) {
            controlador.guardarJugadora(controlador.cantGoles(goles), i);
            fila[0] = controlador.getClubJugadora();
            fila[1] = controlador.getNombreJugadora();
            fila[2] = controlador.getApellidoJugadora();
            fila[3] = controlador.getGolesJugadora();
            modelGoles.addRow(fila);
        }
    }//GEN-LAST:event_bttBuscarCantidadGolesActionPerformed

    //Accion de tocar la tabla
    private void tablaJugadorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaJugadorasMouseClicked
        // TODO add your handling code here:
        int row = tablaJugadoras.getSelectedRow();
        int col = tablaJugadoras.getSelectedColumn();
        //Controlador
        ControladorJugadoras controlador = new ControladorJugadoras();
        // Obtener el contenido de la celda seleccionada
        if(row != -1 && col != -1) {
            String dni = (String)tablaJugadoras.getValueAt(row, 0);
            controlador.setJugadora(controlador.buscarDniJugadora(dni));
            txtNombre.setText(controlador.getNombreJugadora());
            txtApellido.setText(controlador.getApellidoJugadora());
            txtDni.setText(controlador.getDniJugadora());
            cboNacionalidad.setSelectedItem(controlador.getNacionalidadJugadora());
            txtDia.setText(Integer.toString(controlador.getNacimientoDiaJugadora()));
            txtMes.setText(Integer.toString(controlador.getNacimientoMesJugadora()));
            txtAnio.setText(Integer.toString(controlador.getNacimientoAnioJugadora()));
            cboPosicion.setSelectedItem(controlador.getPosicionJugadora());
            cboClub.setSelectedItem(controlador.getClubJugadora());
            txtGoles.setText(Integer.toString(controlador.getGolesJugadora()));
            txtRojas.setText(Integer.toString(controlador.getRojasJugadora()));
            txtAmarillas.setText(Integer.toString(controlador.getAmarillasJugadora()));
            //Bloquea el txtdni
            txtDni.setEnabled(false);
            bttCargar.setEnabled(false);
        }
        bttModificar.setEnabled(true);
    }//GEN-LAST:event_tablaJugadorasMouseClicked
    
    //Metodo para refrescar la tabla de jugadoras
    public final void refrescarTablaCarga(){
        //Crea un controlador de jugadoras
        ControladorJugadoras controlador = new ControladorJugadoras();
        //Crea el objeto que tendra las filas de la tabla
        Object[] fila = new Object[6];
        //Elimina contenido anterior de la tabla
        while (modelJugadoras.getRowCount() > 0) {
            modelJugadoras.removeRow(0);
        }
        //Recorre la lista del controlador
        for (int i = 0; i < controlador.getListaJugadoras().size(); i++) {
            //Guarda la jugadora de dicho lugar de la fila en la variable jugadora del controlador
            controlador.guardarJugadora(controlador.getListaJugadoras(), i);
            //Va guardando los datos correspondientes en las filas del objeto
            fila[4] = controlador.getPosicionJugadora();
            fila[3] = controlador.getClubJugadora();
            fila[1] = controlador.getNombreJugadora();
            fila[2] = controlador.getApellidoJugadora();
            fila[0] = controlador.getDniJugadora();
            fila[5] = controlador.getGolesJugadora();
            //Guarda las filas en la tabla
            modelJugadoras.addRow(fila);
        }
        //Refresca los txt, los deja sin contenido escrito por el usuario
        txtNombre.setText("");
        txtApellido.setText("");
        //txtNacionalidad.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtAnio.setText("");
        txtDni.setText("");
        txtGoles.setText("");
        txtRojas.setText("");
        txtAmarillas.setText("");
    }
    //Metodo para refrescar la tabla de funciones
    public final void refrescarTablas() {
        //Elimina contenido anterior de la tabla de Carga
        refrescarTablaCarga();
        //Elimina contenido anterior de la tabla de Equipos
        while (modelEquipos.getRowCount() > 0) {
            modelEquipos.removeRow(0);
        }
        //Elimina contenido anterior de la tabla de Goles
        while (modelGoles.getRowCount() > 0) {
            modelGoles.removeRow(0);
        }
        //Elimina contenido anterior de la tabla de Expulsiones
        while (modelRojas.getRowCount() > 0) {
            modelRojas.removeRow(0);
        }
        //Elimina contenido anterior de la tabla de Posiciones
        while (modelPosicion.getRowCount() > 0) {
            modelPosicion.removeRow(0);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttActualizarTabla1;
    private javax.swing.JButton bttBuscar;
    private javax.swing.JButton bttBuscarCantidadGoles;
    private javax.swing.JRadioButton bttCantGoles;
    private javax.swing.JRadioButton bttCantJu;
    private javax.swing.JButton bttCargar;
    private javax.swing.JButton bttEliminar;
    private javax.swing.ButtonGroup bttGrupoFunciones;
    private javax.swing.JRadioButton bttJugadorasPosicion;
    private javax.swing.JRadioButton bttMasExpu;
    private javax.swing.JButton bttModificar;
    private javax.swing.JButton bttVolver;
    private javax.swing.JPanel cantGol;
    private javax.swing.JPanel cantJu;
    private javax.swing.JComboBox<String> cboClub;
    private javax.swing.JComboBox<String> cboNacionalidad;
    private javax.swing.JComboBox<String> cboPosicion;
    private javax.swing.JPanel fondoDatos;
    private javax.swing.JPanel fondoFunciones;
    private javax.swing.JPanel fondoJugadoras;
    private javax.swing.JPanel fondoOpciones;
    private javax.swing.JPanel fondoPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAmarillas;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblClub;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblGoles;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lblRojas;
    private javax.swing.JLabel lblTarjetas;
    private javax.swing.JLabel lblTituloBuscar;
    private javax.swing.JPanel masExpulsiones;
    private javax.swing.JTabbedPane pestañas;
    private javax.swing.JTabbedPane pestañasOpciones;
    private javax.swing.JPanel porPosicion;
    private javax.swing.JTable tablaEquipos;
    private javax.swing.JTable tablaGoles;
    private javax.swing.JTable tablaJugadoras;
    private javax.swing.JTable tablaPosicion;
    private javax.swing.JTable tablaRojas;
    private javax.swing.JPanel tapaPestañas;
    private javax.swing.JTextField txtAmarillas;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCantidadGoles;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtGoles;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRojas;
    private javax.swing.JPanel vacio;
    // End of variables declaration//GEN-END:variables
}
