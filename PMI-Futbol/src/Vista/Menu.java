
package Vista;

import Controlador.ControladorJugadoras;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    List <Object> listaAux = new ArrayList<>();
    
    public Menu() {
        initComponents();
        this.setTitle("Menu de Futbol");
        this.setSize(1100, 600);
        model.addColumn("Posicion");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Goles");
        refrescarTabla();
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
        txtNacionalidad = new javax.swing.JTextField();
        lblPosicion = new javax.swing.JLabel();
        lblClub = new javax.swing.JLabel();
        lblGoles = new javax.swing.JLabel();
        lblTarjetas = new javax.swing.JLabel();
        cboPosicion = new javax.swing.JComboBox<>();
        cboClub = new javax.swing.JComboBox<>();
        sppGoles = new javax.swing.JSpinner();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        sppAmarillas = new javax.swing.JSpinner();
        sppRojas = new javax.swing.JSpinner();
        lblAmarillas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bttCargar = new javax.swing.JButton();
        bttEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugadoras = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        bttBuscar = new javax.swing.JButton();
        bttActualizarTabla = new javax.swing.JButton();
        fondoFunciones = new javax.swing.JPanel();
        fondoOpciones = new javax.swing.JPanel();
        bttCantJu = new javax.swing.JRadioButton();
        bttCantGoles = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        bttMasExpu = new javax.swing.JRadioButton();
        bttJugadorasPosicion = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFunciones = new javax.swing.JTable();
        tapaPestañas = new javax.swing.JPanel();
        pestañasOpciones = new javax.swing.JTabbedPane();
        vacio = new javax.swing.JPanel();
        cantJu = new javax.swing.JPanel();
        bttBuscarJugadoras = new javax.swing.JButton();
        txtBuscarPorEquipoJugadoras = new javax.swing.JTextField();
        cantGol = new javax.swing.JPanel();
        txtBuscarCantidadGoles = new javax.swing.JTextField();
        bttBuscarCantidadGoles = new javax.swing.JButton();
        masExpulsiones = new javax.swing.JPanel();
        txtBuscarMasExpulsiones = new javax.swing.JTextField();
        bttBuscarMasExpulsiones = new javax.swing.JButton();
        porPosicion = new javax.swing.JPanel();
        txtBuscarPorPosicion = new javax.swing.JTextField();
        bttBuscarPorPosicion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPrincipal.setBackground(new java.awt.Color(255, 204, 204));
        fondoPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pestañas.setBackground(new java.awt.Color(153, 0, 153));
        pestañas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        fondoJugadoras.setBackground(new java.awt.Color(204, 0, 204));
        fondoJugadoras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
        fondoJugadoras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txtNacionalidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblPosicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPosicion.setText("Posición");

        lblClub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblClub.setText("Club");

        lblGoles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGoles.setText("Goles");

        lblTarjetas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTarjetas.setText("Tarjetas");

        cboPosicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delantera", "Portera", "Defensora", "Medio Campista" }));

        cboClub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cboClub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boca", "River", "Racing", "Independiente", "Tigre", "Juventud", "Estudiantes", "Platense ", "Banfield ", "Lanus" }));

        sppGoles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtDia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtMes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtAnio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        sppAmarillas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        sppRojas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblAmarillas.setText("Amarillas");

        jLabel1.setText("Rojas");

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setText("Actualizar");

        bttCargar.setBackground(new java.awt.Color(255, 204, 255));
        bttCargar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttCargar.setText("Cargar");

        bttEliminar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttEliminar.setText("ELIMINAR");

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
                            .addComponent(lblPosicion)
                            .addComponent(lblClub)
                            .addComponent(lblGoles))
                        .addGap(41, 41, 41)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboPosicion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboClub, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sppGoles)))
                    .addGroup(fondoDatosLayout.createSequentialGroup()
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(18, 18, 18)
                                .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAmarillas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sppAmarillas, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addComponent(lblTarjetas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sppRojas, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bttEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        fondoDatosLayout.setVerticalGroup(
            fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDni)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGoles))
                    .addComponent(sppGoles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNacionalidad)
                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAmarillas)
                        .addComponent(lblTarjetas)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sppAmarillas)
                    .addComponent(sppRojas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNacimiento))
                .addContainerGap())
            .addGroup(fondoDatosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondoJugadoras.add(fondoDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 21, -1, -1));

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
        jScrollPane1.setViewportView(tablaJugadoras);

        fondoJugadoras.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 790, 200));

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fondoJugadoras.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 192, -1));

        bttBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttBuscar.setText("Buscar");
        fondoJugadoras.add(bttBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 192, -1));

        bttActualizarTabla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttActualizarTabla.setText("Actualizar Tabla");
        fondoJugadoras.add(bttActualizarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 192, -1));

        pestañas.addTab("Menu", fondoJugadoras);

        fondoFunciones.setBackground(new java.awt.Color(204, 0, 204));
        fondoFunciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
        fondoFunciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttGrupoFunciones.add(bttCantJu);
        bttCantJu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttCantJu.setText("Cantidad de jugadoras");
        bttCantJu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttCantJuMouseClicked(evt);
            }
        });

        bttGrupoFunciones.add(bttCantGoles);
        bttCantGoles.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttCantGoles.setText("Cantidad de goles");
        bttCantGoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttCantGolesMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Buscar por:");

        bttGrupoFunciones.add(bttMasExpu);
        bttMasExpu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttMasExpu.setText("Más expulsiones");
        bttMasExpu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttMasExpuMouseClicked(evt);
            }
        });

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
                        .addComponent(jLabel2))
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
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addComponent(bttCantJu)
                .addGap(18, 18, 18)
                .addComponent(bttCantGoles)
                .addGap(18, 18, 18)
                .addComponent(bttMasExpu)
                .addGap(18, 18, 18)
                .addComponent(bttJugadorasPosicion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondoFunciones.add(fondoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 430));

        tblFunciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblFunciones);

        fondoFunciones.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 137, 720, 310));

        javax.swing.GroupLayout tapaPestañasLayout = new javax.swing.GroupLayout(tapaPestañas);
        tapaPestañas.setLayout(tapaPestañasLayout);
        tapaPestañasLayout.setHorizontalGroup(
            tapaPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        tapaPestañasLayout.setVerticalGroup(
            tapaPestañasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        fondoFunciones.add(tapaPestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 720, 40));

        javax.swing.GroupLayout vacioLayout = new javax.swing.GroupLayout(vacio);
        vacio.setLayout(vacioLayout);
        vacioLayout.setHorizontalGroup(
            vacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        vacioLayout.setVerticalGroup(
            vacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        pestañasOpciones.addTab("tab5", vacio);

        cantJu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bttBuscarJugadoras.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttBuscarJugadoras.setText("Buscar");

        txtBuscarPorEquipoJugadoras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout cantJuLayout = new javax.swing.GroupLayout(cantJu);
        cantJu.setLayout(cantJuLayout);
        cantJuLayout.setHorizontalGroup(
            cantJuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cantJuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarPorEquipoJugadoras, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttBuscarJugadoras, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        cantJuLayout.setVerticalGroup(
            cantJuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cantJuLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(cantJuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttBuscarJugadoras)
                    .addComponent(txtBuscarPorEquipoJugadoras))
                .addContainerGap())
        );

        pestañasOpciones.addTab("tab1", cantJu);

        txtBuscarCantidadGoles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        bttBuscarCantidadGoles.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttBuscarCantidadGoles.setText("Buscar");

        javax.swing.GroupLayout cantGolLayout = new javax.swing.GroupLayout(cantGol);
        cantGol.setLayout(cantGolLayout);
        cantGolLayout.setHorizontalGroup(
            cantGolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cantGolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarCantidadGoles, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttBuscarCantidadGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        cantGolLayout.setVerticalGroup(
            cantGolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cantGolLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(cantGolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttBuscarCantidadGoles)
                    .addComponent(txtBuscarCantidadGoles))
                .addContainerGap())
        );

        pestañasOpciones.addTab("tab2", cantGol);

        txtBuscarMasExpulsiones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        bttBuscarMasExpulsiones.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttBuscarMasExpulsiones.setText("Buscar");

        javax.swing.GroupLayout masExpulsionesLayout = new javax.swing.GroupLayout(masExpulsiones);
        masExpulsiones.setLayout(masExpulsionesLayout);
        masExpulsionesLayout.setHorizontalGroup(
            masExpulsionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masExpulsionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarMasExpulsiones, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttBuscarMasExpulsiones, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        masExpulsionesLayout.setVerticalGroup(
            masExpulsionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masExpulsionesLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(masExpulsionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttBuscarMasExpulsiones)
                    .addComponent(txtBuscarMasExpulsiones))
                .addContainerGap())
        );

        pestañasOpciones.addTab("tab3", masExpulsiones);

        txtBuscarPorPosicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        bttBuscarPorPosicion.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bttBuscarPorPosicion.setText("Buscar");

        javax.swing.GroupLayout porPosicionLayout = new javax.swing.GroupLayout(porPosicion);
        porPosicion.setLayout(porPosicionLayout);
        porPosicionLayout.setHorizontalGroup(
            porPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, porPosicionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarPorPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttBuscarPorPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        porPosicionLayout.setVerticalGroup(
            porPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, porPosicionLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(porPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttBuscarPorPosicion)
                    .addComponent(txtBuscarPorPosicion))
                .addContainerGap())
        );

        pestañasOpciones.addTab("tab4", porPosicion);

        fondoFunciones.add(pestañasOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 720, 110));

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

    private void bttCantJuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttCantJuMouseClicked
        // TODO add your handling code here:
        pestañasOpciones.setSelectedIndex(1);
    }//GEN-LAST:event_bttCantJuMouseClicked

    private void bttCantGolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttCantGolesMouseClicked
        // TODO add your handling code here:
        pestañasOpciones.setSelectedIndex(2);
    }//GEN-LAST:event_bttCantGolesMouseClicked

    private void bttMasExpuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttMasExpuMouseClicked
        // TODO add your handling code here:
        pestañasOpciones.setSelectedIndex(3);
    }//GEN-LAST:event_bttMasExpuMouseClicked

    private void bttJugadorasPosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttJugadorasPosicionMouseClicked
        // TODO add your handling code here:
        pestañasOpciones.setSelectedIndex(4);
    }//GEN-LAST:event_bttJugadorasPosicionMouseClicked

    public final void refrescarTabla(){
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttActualizarTabla;
    private javax.swing.JButton bttBuscar;
    private javax.swing.JButton bttBuscarCantidadGoles;
    private javax.swing.JButton bttBuscarJugadoras;
    private javax.swing.JButton bttBuscarMasExpulsiones;
    private javax.swing.JButton bttBuscarPorPosicion;
    private javax.swing.JRadioButton bttCantGoles;
    private javax.swing.JRadioButton bttCantJu;
    private javax.swing.JButton bttCargar;
    private javax.swing.JButton bttEliminar;
    private javax.swing.ButtonGroup bttGrupoFunciones;
    private javax.swing.JRadioButton bttJugadorasPosicion;
    private javax.swing.JRadioButton bttMasExpu;
    private javax.swing.JPanel cantGol;
    private javax.swing.JPanel cantJu;
    private javax.swing.JComboBox<String> cboClub;
    private javax.swing.JComboBox<String> cboPosicion;
    private javax.swing.JPanel fondoDatos;
    private javax.swing.JPanel fondoFunciones;
    private javax.swing.JPanel fondoJugadoras;
    private javax.swing.JPanel fondoOpciones;
    private javax.swing.JPanel fondoPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAmarillas;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblClub;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblGoles;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lblTarjetas;
    private javax.swing.JPanel masExpulsiones;
    private javax.swing.JTabbedPane pestañas;
    private javax.swing.JTabbedPane pestañasOpciones;
    private javax.swing.JPanel porPosicion;
    private javax.swing.JSpinner sppAmarillas;
    private javax.swing.JSpinner sppGoles;
    private javax.swing.JSpinner sppRojas;
    private javax.swing.JTable tablaJugadoras;
    private javax.swing.JPanel tapaPestañas;
    private javax.swing.JTable tblFunciones;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarCantidadGoles;
    private javax.swing.JTextField txtBuscarMasExpulsiones;
    private javax.swing.JTextField txtBuscarPorEquipoJugadoras;
    private javax.swing.JTextField txtBuscarPorPosicion;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPanel vacio;
    // End of variables declaration//GEN-END:variables
}
