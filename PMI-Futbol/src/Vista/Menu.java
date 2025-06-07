
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
        this.setSize(1000, 600);
        model.addColumn("Posicion");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Goles");
        refrescarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btt_Grupo_Jug = new javax.swing.ButtonGroup();
        PanelFondo1 = new javax.swing.JPanel();
        PanelPestanias = new javax.swing.JTabbedPane();
        Pestania_Jugadoras = new javax.swing.JPanel();
        Pestanias_Menu_Jugadoras = new javax.swing.JTabbedPane();
        Panel_Cargar = new javax.swing.JPanel();
        Lbl_Nombre = new javax.swing.JLabel();
        Lbl_Apellido = new javax.swing.JLabel();
        Lbl_Nacimiento = new javax.swing.JLabel();
        Lbl_Nacionalidad = new javax.swing.JLabel();
        Lbl_Posicion = new javax.swing.JLabel();
        Lbl_Club = new javax.swing.JLabel();
        Lbl_TAmarillas = new javax.swing.JLabel();
        Lbl_TRojas = new javax.swing.JLabel();
        Lbl_Goles = new javax.swing.JLabel();
        Btt_Cargar = new javax.swing.JButton();
        Combo_Club = new javax.swing.JComboBox<>();
        Txt_NombreJ = new javax.swing.JTextField();
        Combo_Posicion = new javax.swing.JComboBox<>();
        Num_Amarillas = new javax.swing.JSpinner();
        Num_Rojas = new javax.swing.JSpinner();
        Num_Goles = new javax.swing.JSpinner();
        Txt_ApellidoJ = new javax.swing.JTextField();
        Txt_NacionalidadJ = new javax.swing.JTextField();
        Txt_Dia = new javax.swing.JTextField();
        Txt_Mes = new javax.swing.JTextField();
        Txt_Anio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        Panel_Eliminar = new javax.swing.JPanel();
        Lbl_eliminar = new javax.swing.JLabel();
        TxtBuscarEliminar = new javax.swing.JTextField();
        Btt_eliminar = new javax.swing.JButton();
        BttBuscarParaEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblEliminar = new javax.swing.JTable();
        Panel_Actualizar = new javax.swing.JPanel();
        Lbl_modificar = new javax.swing.JLabel();
        Txt_modificar = new javax.swing.JTextField();
        BttBuscarParaActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblActualizar = new javax.swing.JTable();
        Btt_Actualizar = new javax.swing.JButton();
        Panel_BusCodigo = new javax.swing.JPanel();
        BttBuscarPorCodigo = new javax.swing.JButton();
        LblBuscarCodigo = new javax.swing.JLabel();
        TxtBuscarCodigo = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblMostrarCodigo = new javax.swing.JTable();
        Panel_BusNombre = new javax.swing.JPanel();
        BttBuscarPorNombre = new javax.swing.JButton();
        TxtBuscarNombre = new javax.swing.JTextField();
        LblBuscarNombre = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TblMostrarNombre = new javax.swing.JTable();
        Panel_Goles = new javax.swing.JPanel();
        BttBuscarGoles = new javax.swing.JButton();
        LblMasGoles = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TblMostrarGoles = new javax.swing.JTable();
        Num_Goles1 = new javax.swing.JSpinner();
        Panel_Posicion = new javax.swing.JPanel();
        LblBuscarPosicion = new javax.swing.JLabel();
        BttBuscarPosicion = new javax.swing.JButton();
        CboPosicion = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        TblPosicion = new javax.swing.JTable();
        Panel_CantEquipo = new javax.swing.JPanel();
        BttBuscarCantEquipo = new javax.swing.JButton();
        LblCantEquipo = new javax.swing.JLabel();
        CboCantEquipo = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        TblPosicion1 = new javax.swing.JTable();
        Panel_TRojas = new javax.swing.JPanel();
        LblMasRojas = new javax.swing.JLabel();
        SppRojas = new javax.swing.JSpinner();
        BttBuscarRojas = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        TblPosicion2 = new javax.swing.JTable();
        Panel_Mostrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtClub = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_MostrarEquipos = new javax.swing.JTable();
        Btt_MostrarEquipo = new javax.swing.JButton();
        Pestania_Arbitros = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        PanelFondo1.setBackground(new java.awt.Color(204, 204, 255));
        PanelFondo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPestanias.setBackground(new java.awt.Color(255, 255, 153));

        Pestania_Jugadoras.setBackground(new java.awt.Color(255, 228, 244));
        Pestania_Jugadoras.setPreferredSize(new java.awt.Dimension(1000, 600));

        Pestanias_Menu_Jugadoras.setBackground(new java.awt.Color(248, 255, 252));
        Pestanias_Menu_Jugadoras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 255), new java.awt.Color(255, 204, 255), new java.awt.Color(255, 204, 255), new java.awt.Color(255, 204, 255)));
        Pestanias_Menu_Jugadoras.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        Pestanias_Menu_Jugadoras.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Pestanias_Menu_Jugadoras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Pestanias_Menu_Jugadoras.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Pestanias_Menu_Jugadoras.setPreferredSize(new java.awt.Dimension(990, 590));
        Pestanias_Menu_Jugadoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pestanias_Menu_JugadorasMouseClicked(evt);
            }
        });

        Panel_Cargar.setBackground(new java.awt.Color(239, 255, 245));

        Lbl_Nombre.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_Nombre.setText("Nombre:");

        Lbl_Apellido.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_Apellido.setText("Apellido:");

        Lbl_Nacimiento.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_Nacimiento.setText("Fecha de Nacimiento:");

        Lbl_Nacionalidad.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_Nacionalidad.setText("Nacionalidad:");

        Lbl_Posicion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_Posicion.setText("Posicion:");

        Lbl_Club.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_Club.setText("Club:");

        Lbl_TAmarillas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_TAmarillas.setText("Tarjetas Amarillas:");

        Lbl_TRojas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_TRojas.setText("Tarjetas Rojas:");

        Lbl_Goles.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_Goles.setText("Goles:");

        Btt_Cargar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Btt_Cargar.setText("Subir");
        Btt_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_CargarActionPerformed(evt);
            }
        });

        Combo_Club.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Combo_Club.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boca", "River", "Racing", "Independiente", "Tigre", "Juventud", "Estudiantes", "Platense", "Banfield", "Lanus" }));

        Txt_NombreJ.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Txt_NombreJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NombreJActionPerformed(evt);
            }
        });

        Combo_Posicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Combo_Posicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delantera", "Arquera", "Defensora", "Lateral" }));

        Num_Amarillas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Num_Rojas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Num_Goles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Txt_ApellidoJ.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Txt_NacionalidadJ.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Txt_Dia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Txt_Mes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Txt_Anio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setText("dia:");

        jLabel3.setText("mes:");

        jLabel4.setText("año:");

        lblDni.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblDni.setText("DNI:");

        txtDni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout Panel_CargarLayout = new javax.swing.GroupLayout(Panel_Cargar);
        Panel_Cargar.setLayout(Panel_CargarLayout);
        Panel_CargarLayout.setHorizontalGroup(
            Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CargarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_CargarLayout.createSequentialGroup()
                        .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_CargarLayout.createSequentialGroup()
                                .addComponent(Lbl_Nacionalidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_NacionalidadJ, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                            .addGroup(Panel_CargarLayout.createSequentialGroup()
                                .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_CargarLayout.createSequentialGroup()
                                        .addComponent(Lbl_Club)
                                        .addGap(18, 18, 18)
                                        .addComponent(Combo_Club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(Lbl_Posicion)
                                        .addGap(18, 18, 18)
                                        .addComponent(Combo_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Panel_CargarLayout.createSequentialGroup()
                                        .addComponent(lblDni)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(Panel_CargarLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_CargarLayout.createSequentialGroup()
                                .addComponent(Lbl_TAmarillas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Num_Amarillas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_CargarLayout.createSequentialGroup()
                                .addComponent(Lbl_TRojas)
                                .addGap(18, 18, 18)
                                .addComponent(Num_Rojas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_CargarLayout.createSequentialGroup()
                                .addComponent(Lbl_Goles)
                                .addGap(37, 37, 37)
                                .addComponent(Num_Goles, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btt_Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(Panel_CargarLayout.createSequentialGroup()
                        .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_CargarLayout.createSequentialGroup()
                                    .addComponent(Lbl_Apellido)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txt_ApellidoJ))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_CargarLayout.createSequentialGroup()
                                    .addComponent(Lbl_Nombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Txt_NombreJ, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel_CargarLayout.createSequentialGroup()
                                .addComponent(Lbl_Nacimiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Panel_CargarLayout.setVerticalGroup(
            Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CargarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Nombre)
                    .addComponent(Txt_NombreJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Apellido)
                    .addComponent(Txt_ApellidoJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Nacimiento)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CargarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CargarLayout.createSequentialGroup()
                                .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Txt_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Txt_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_CargarLayout.createSequentialGroup()
                        .addComponent(lblDni)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CargarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_Nacionalidad)
                    .addComponent(Txt_NacionalidadJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lbl_Club)
                        .addComponent(Combo_Club, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Combo_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lbl_Posicion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_CargarLayout.createSequentialGroup()
                        .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_CargarLayout.createSequentialGroup()
                                .addComponent(Lbl_TAmarillas)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CargarLayout.createSequentialGroup()
                                .addComponent(Num_Amarillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_TRojas)
                            .addComponent(Num_Rojas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_CargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Goles)
                            .addComponent(Num_Goles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_CargarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Btt_Cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        Pestanias_Menu_Jugadoras.addTab("Cargar", Panel_Cargar);

        Panel_Eliminar.setBackground(new java.awt.Color(239, 255, 245));

        Lbl_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_eliminar.setText("Nombre de la Jugadora:");

        TxtBuscarEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtBuscarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarEliminarActionPerformed(evt);
            }
        });

        Btt_eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Btt_eliminar.setText("ELIMINAR");

        BttBuscarParaEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BttBuscarParaEliminar.setText("Buscar");
        BttBuscarParaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttBuscarParaEliminarActionPerformed(evt);
            }
        });

        TblEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TblEliminar);

        javax.swing.GroupLayout Panel_EliminarLayout = new javax.swing.GroupLayout(Panel_Eliminar);
        Panel_Eliminar.setLayout(Panel_EliminarLayout);
        Panel_EliminarLayout.setHorizontalGroup(
            Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(Panel_EliminarLayout.createSequentialGroup()
                        .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_EliminarLayout.createSequentialGroup()
                                .addComponent(Lbl_eliminar)
                                .addGap(0, 65, Short.MAX_VALUE))
                            .addComponent(TxtBuscarEliminar))
                        .addGap(18, 18, 18)
                        .addComponent(BttBuscarParaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_EliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        Panel_EliminarLayout.setVerticalGroup(
            Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EliminarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Panel_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_EliminarLayout.createSequentialGroup()
                        .addComponent(Lbl_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtBuscarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BttBuscarParaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btt_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        Pestanias_Menu_Jugadoras.addTab("Eliminar", Panel_Eliminar);

        Panel_Actualizar.setBackground(new java.awt.Color(239, 255, 245));

        Lbl_modificar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Lbl_modificar.setText("Nombre de la Jugadora:");

        Txt_modificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Txt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_modificarActionPerformed(evt);
            }
        });

        BttBuscarParaActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BttBuscarParaActualizar.setText("Buscar");
        BttBuscarParaActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttBuscarParaActualizarActionPerformed(evt);
            }
        });

        TblActualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TblActualizar);

        Btt_Actualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Btt_Actualizar.setText("ACTUALIZAR");

        javax.swing.GroupLayout Panel_ActualizarLayout = new javax.swing.GroupLayout(Panel_Actualizar);
        Panel_Actualizar.setLayout(Panel_ActualizarLayout);
        Panel_ActualizarLayout.setHorizontalGroup(
            Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                        .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                                .addComponent(Lbl_modificar)
                                .addGap(0, 54, Short.MAX_VALUE))
                            .addComponent(Txt_modificar))
                        .addGap(18, 18, 18)
                        .addComponent(BttBuscarParaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ActualizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btt_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        Panel_ActualizarLayout.setVerticalGroup(
            Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BttBuscarParaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                        .addComponent(Lbl_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btt_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        Pestanias_Menu_Jugadoras.addTab("Actualizar Datos", Panel_Actualizar);

        Panel_BusCodigo.setBackground(new java.awt.Color(239, 255, 245));

        BttBuscarPorCodigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BttBuscarPorCodigo.setText("Buscar");
        BttBuscarPorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttBuscarPorCodigoActionPerformed(evt);
            }
        });

        LblBuscarCodigo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LblBuscarCodigo.setText("Dni de la jugadora:");

        TxtBuscarCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtBuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarCodigoActionPerformed(evt);
            }
        });

        TblMostrarCodigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TblMostrarCodigo);

        javax.swing.GroupLayout Panel_BusCodigoLayout = new javax.swing.GroupLayout(Panel_BusCodigo);
        Panel_BusCodigo.setLayout(Panel_BusCodigoLayout);
        Panel_BusCodigoLayout.setHorizontalGroup(
            Panel_BusCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BusCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_BusCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblBuscarCodigo)
                    .addComponent(TxtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BttBuscarPorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(Panel_BusCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_BusCodigoLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jScrollPane4)
                    .addGap(12, 12, 12)))
        );
        Panel_BusCodigoLayout.setVerticalGroup(
            Panel_BusCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BusCodigoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Panel_BusCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BttBuscarPorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_BusCodigoLayout.createSequentialGroup()
                        .addComponent(LblBuscarCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(411, Short.MAX_VALUE))
            .addGroup(Panel_BusCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_BusCodigoLayout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        Pestanias_Menu_Jugadoras.addTab("Buscar por Dni", Panel_BusCodigo);

        Panel_BusNombre.setBackground(new java.awt.Color(239, 255, 245));

        BttBuscarPorNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BttBuscarPorNombre.setText("Buscar");
        BttBuscarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttBuscarPorNombreActionPerformed(evt);
            }
        });

        TxtBuscarNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarNombreActionPerformed(evt);
            }
        });

        LblBuscarNombre.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LblBuscarNombre.setText("Nombre de la jugadora:");

        TblMostrarNombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TblMostrarNombre);

        javax.swing.GroupLayout Panel_BusNombreLayout = new javax.swing.GroupLayout(Panel_BusNombre);
        Panel_BusNombre.setLayout(Panel_BusNombreLayout);
        Panel_BusNombreLayout.setHorizontalGroup(
            Panel_BusNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BusNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_BusNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_BusNombreLayout.createSequentialGroup()
                        .addGroup(Panel_BusNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblBuscarNombre)
                            .addComponent(TxtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BttBuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(Panel_BusNombreLayout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addContainerGap())))
        );
        Panel_BusNombreLayout.setVerticalGroup(
            Panel_BusNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BusNombreLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(Panel_BusNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BttBuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_BusNombreLayout.createSequentialGroup()
                        .addComponent(LblBuscarNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Pestanias_Menu_Jugadoras.addTab("Buscar por nombre", Panel_BusNombre);

        Panel_Goles.setBackground(new java.awt.Color(239, 255, 245));

        BttBuscarGoles.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BttBuscarGoles.setText("Buscar");
        BttBuscarGoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttBuscarGolesActionPerformed(evt);
            }
        });

        LblMasGoles.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LblMasGoles.setText("Cantidad de goles a buscar:");

        TblMostrarGoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(TblMostrarGoles);

        Num_Goles1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout Panel_GolesLayout = new javax.swing.GroupLayout(Panel_Goles);
        Panel_Goles.setLayout(Panel_GolesLayout);
        Panel_GolesLayout.setHorizontalGroup(
            Panel_GolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_GolesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_GolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_GolesLayout.createSequentialGroup()
                        .addGroup(Panel_GolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblMasGoles)
                            .addGroup(Panel_GolesLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Num_Goles1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(BttBuscarGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        Panel_GolesLayout.setVerticalGroup(
            Panel_GolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_GolesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_GolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BttBuscarGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_GolesLayout.createSequentialGroup()
                        .addComponent(LblMasGoles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num_Goles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Pestanias_Menu_Jugadoras.addTab("Mas goles", Panel_Goles);

        Panel_Posicion.setBackground(new java.awt.Color(239, 255, 245));

        LblBuscarPosicion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LblBuscarPosicion.setText("Jugadoras por posicion:");

        BttBuscarPosicion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BttBuscarPosicion.setText("Buscar");
        BttBuscarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttBuscarPosicionActionPerformed(evt);
            }
        });

        CboPosicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CboPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delantera ", "Arquera ", "Lateral ", "Defensora" }));

        TblPosicion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(TblPosicion);

        javax.swing.GroupLayout Panel_PosicionLayout = new javax.swing.GroupLayout(Panel_Posicion);
        Panel_Posicion.setLayout(Panel_PosicionLayout);
        Panel_PosicionLayout.setHorizontalGroup(
            Panel_PosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PosicionLayout.createSequentialGroup()
                .addGroup(Panel_PosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_PosicionLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(Panel_PosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblBuscarPosicion)
                            .addComponent(CboPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(BttBuscarPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PosicionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7)))
                .addContainerGap())
        );
        Panel_PosicionLayout.setVerticalGroup(
            Panel_PosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PosicionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_PosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_PosicionLayout.createSequentialGroup()
                        .addComponent(LblBuscarPosicion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CboPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BttBuscarPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Pestanias_Menu_Jugadoras.addTab("Posiciones", Panel_Posicion);

        Panel_CantEquipo.setBackground(new java.awt.Color(239, 255, 245));

        BttBuscarCantEquipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BttBuscarCantEquipo.setText("Buscar");
        BttBuscarCantEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttBuscarCantEquipoActionPerformed(evt);
            }
        });

        LblCantEquipo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LblCantEquipo.setText("Equipo a buscar:");

        CboCantEquipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CboCantEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boca", "River", "Racing", "Independiente", "Tigre", "Juventud", "Estudiantes", "Platense", "Banfield", "Lanus" }));

        TblPosicion1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(TblPosicion1);

        javax.swing.GroupLayout Panel_CantEquipoLayout = new javax.swing.GroupLayout(Panel_CantEquipo);
        Panel_CantEquipo.setLayout(Panel_CantEquipoLayout);
        Panel_CantEquipoLayout.setHorizontalGroup(
            Panel_CantEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CantEquipoLayout.createSequentialGroup()
                .addGroup(Panel_CantEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CantEquipoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Panel_CantEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_CantEquipoLayout.createSequentialGroup()
                                .addComponent(LblCantEquipo)
                                .addGap(0, 175, Short.MAX_VALUE))
                            .addComponent(CboCantEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(BttBuscarCantEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_CantEquipoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8)))
                .addContainerGap())
        );
        Panel_CantEquipoLayout.setVerticalGroup(
            Panel_CantEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CantEquipoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Panel_CantEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_CantEquipoLayout.createSequentialGroup()
                        .addComponent(LblCantEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CboCantEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BttBuscarCantEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Pestanias_Menu_Jugadoras.addTab("Cant. por Equipo", Panel_CantEquipo);

        Panel_TRojas.setBackground(new java.awt.Color(239, 255, 245));

        LblMasRojas.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LblMasRojas.setText("Cantidad de Tarjetas Rojas: ");

        SppRojas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        BttBuscarRojas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BttBuscarRojas.setText("Buscar");
        BttBuscarRojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttBuscarRojasActionPerformed(evt);
            }
        });

        TblPosicion2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(TblPosicion2);

        javax.swing.GroupLayout Panel_TRojasLayout = new javax.swing.GroupLayout(Panel_TRojas);
        Panel_TRojas.setLayout(Panel_TRojasLayout);
        Panel_TRojasLayout.setHorizontalGroup(
            Panel_TRojasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TRojasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_TRojasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TRojasLayout.createSequentialGroup()
                        .addGroup(Panel_TRojasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Panel_TRojasLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(SppRojas))
                            .addComponent(LblMasRojas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(BttBuscarRojas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9))
                .addContainerGap())
        );
        Panel_TRojasLayout.setVerticalGroup(
            Panel_TRojasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TRojasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_TRojasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BttBuscarRojas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_TRojasLayout.createSequentialGroup()
                        .addComponent(LblMasRojas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SppRojas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Pestanias_Menu_Jugadoras.addTab("Tarjetas Rojas", Panel_TRojas);

        Panel_Mostrar.setBackground(new java.awt.Color(239, 255, 245));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Escriba el nombre del club:");

        txtClub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Tbl_MostrarEquipos.setBackground(new java.awt.Color(255, 204, 204));
        Tbl_MostrarEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tbl_MostrarEquipos);

        Btt_MostrarEquipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btt_MostrarEquipo.setText("Buscar");
        Btt_MostrarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_MostrarEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_MostrarLayout = new javax.swing.GroupLayout(Panel_Mostrar);
        Panel_Mostrar.setLayout(Panel_MostrarLayout);
        Panel_MostrarLayout.setHorizontalGroup(
            Panel_MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MostrarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Panel_MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_MostrarLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(Panel_MostrarLayout.createSequentialGroup()
                        .addGroup(Panel_MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtClub))
                        .addGap(18, 18, 18)
                        .addComponent(Btt_MostrarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Panel_MostrarLayout.setVerticalGroup(
            Panel_MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MostrarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_MostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel_MostrarLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btt_MostrarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Pestanias_Menu_Jugadoras.addTab("Mostrar Equipo", Panel_Mostrar);

        javax.swing.GroupLayout Pestania_JugadorasLayout = new javax.swing.GroupLayout(Pestania_Jugadoras);
        Pestania_Jugadoras.setLayout(Pestania_JugadorasLayout);
        Pestania_JugadorasLayout.setHorizontalGroup(
            Pestania_JugadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pestania_JugadorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pestanias_Menu_Jugadoras, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        Pestania_JugadorasLayout.setVerticalGroup(
            Pestania_JugadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pestania_JugadorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pestanias_Menu_Jugadoras, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        PanelPestanias.addTab("Jugadoras", Pestania_Jugadoras);

        Pestania_Arbitros.setBackground(new java.awt.Color(222, 249, 211));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(195, 238, 178), new java.awt.Color(195, 238, 178), new java.awt.Color(195, 238, 178), new java.awt.Color(195, 238, 178)));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel1.setBackground(new java.awt.Color(255, 235, 249));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cargar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 235, 249));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 235, 249));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Actualizar datos", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 235, 249));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Buscar por Nombre", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 235, 249));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Filtrar", jPanel5);

        javax.swing.GroupLayout Pestania_ArbitrosLayout = new javax.swing.GroupLayout(Pestania_Arbitros);
        Pestania_Arbitros.setLayout(Pestania_ArbitrosLayout);
        Pestania_ArbitrosLayout.setHorizontalGroup(
            Pestania_ArbitrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pestania_ArbitrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(401, Short.MAX_VALUE))
        );
        Pestania_ArbitrosLayout.setVerticalGroup(
            Pestania_ArbitrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pestania_ArbitrosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        PanelPestanias.addTab("Arbitros", Pestania_Arbitros);

        PanelFondo1.add(PanelPestanias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Pestanias_Menu_JugadorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pestanias_Menu_JugadorasMouseClicked

    }//GEN-LAST:event_Pestanias_Menu_JugadorasMouseClicked

    private void Btt_MostrarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_MostrarEquipoActionPerformed
        String club = txtClub.getText();
        ControladorJugadoras controlador = new ControladorJugadoras();
        listaAux.clear();
        for(int i = 0; i < controlador.mostrarEquipo(club).size();i ++){
            controlador.guardarJugadora(controlador.mostrarEquipo(club), i);
            Object[] fila = new Object[4];
            fila[0] = controlador.getPosicionJugadora();
            fila[1] = controlador.getNombreJugadora();
            fila[2] = controlador.getApellidoJugadora();
            fila[3] = controlador.getGolesJugadora();
            //Agrega la fila a la tabla
            model.addRow(fila);
        }
    }//GEN-LAST:event_Btt_MostrarEquipoActionPerformed

    private void BttBuscarRojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttBuscarRojasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttBuscarRojasActionPerformed

    private void BttBuscarCantEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttBuscarCantEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttBuscarCantEquipoActionPerformed

    private void BttBuscarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttBuscarPosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttBuscarPosicionActionPerformed

    private void BttBuscarGolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttBuscarGolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttBuscarGolesActionPerformed

    private void TxtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarNombreActionPerformed

    private void BttBuscarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttBuscarPorNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttBuscarPorNombreActionPerformed

    private void TxtBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarCodigoActionPerformed

    private void BttBuscarPorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttBuscarPorCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttBuscarPorCodigoActionPerformed

    private void BttBuscarParaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttBuscarParaActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttBuscarParaActualizarActionPerformed

    private void Txt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_modificarActionPerformed

    private void BttBuscarParaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttBuscarParaEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttBuscarParaEliminarActionPerformed

    private void TxtBuscarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarEliminarActionPerformed

    private void Txt_NombreJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NombreJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreJActionPerformed

    private void Btt_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_CargarActionPerformed
        ControladorJugadoras controlador = new ControladorJugadoras();
        try{
            controlador.setJugadoraNombre(Txt_NombreJ.getText());
            controlador.setJugadoraApellido(Txt_ApellidoJ.getText());
            //controlador.setJugadoraNacimiento(Txt_Dia.getText(), Txt_Mes.getText(), Txt_Anio.getText());
            controlador.setJugadoraNacionalidad(Txt_NacionalidadJ.getText());
            controlador.setJugadoraPosicion(Combo_Posicion.getSelectedItem().toString());
            controlador.setJugadoraClub(Combo_Club.getSelectedItem().toString());
            controlador.setJugadoraT_Amarillas(Num_Amarillas.getComponentCount());
            controlador.setJugadoraT_Rojas(Num_Rojas.getComponentCount());
            controlador.setJugadoraGoles(Num_Goles.getComponentCount());
            controlador.setJugadoraDni(txtDni.getText());
            controlador.agregarJugadoraALaLista();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error al cargar la jugadora.");
        }
    }//GEN-LAST:event_Btt_CargarActionPerformed

    public final void refrescarTabla(){
        Tbl_MostrarEquipos.setModel(model);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttBuscarCantEquipo;
    private javax.swing.JButton BttBuscarGoles;
    private javax.swing.JButton BttBuscarParaActualizar;
    private javax.swing.JButton BttBuscarParaEliminar;
    private javax.swing.JButton BttBuscarPorCodigo;
    private javax.swing.JButton BttBuscarPorNombre;
    private javax.swing.JButton BttBuscarPosicion;
    private javax.swing.JButton BttBuscarRojas;
    private javax.swing.JButton Btt_Actualizar;
    private javax.swing.JButton Btt_Cargar;
    private javax.swing.ButtonGroup Btt_Grupo_Jug;
    private javax.swing.JButton Btt_MostrarEquipo;
    private javax.swing.JButton Btt_eliminar;
    private javax.swing.JComboBox<String> CboCantEquipo;
    private javax.swing.JComboBox<String> CboPosicion;
    private javax.swing.JComboBox<String> Combo_Club;
    private javax.swing.JComboBox<String> Combo_Posicion;
    private javax.swing.JLabel LblBuscarCodigo;
    private javax.swing.JLabel LblBuscarNombre;
    private javax.swing.JLabel LblBuscarPosicion;
    private javax.swing.JLabel LblCantEquipo;
    private javax.swing.JLabel LblMasGoles;
    private javax.swing.JLabel LblMasRojas;
    private javax.swing.JLabel Lbl_Apellido;
    private javax.swing.JLabel Lbl_Club;
    private javax.swing.JLabel Lbl_Goles;
    private javax.swing.JLabel Lbl_Nacimiento;
    private javax.swing.JLabel Lbl_Nacionalidad;
    private javax.swing.JLabel Lbl_Nombre;
    private javax.swing.JLabel Lbl_Posicion;
    private javax.swing.JLabel Lbl_TAmarillas;
    private javax.swing.JLabel Lbl_TRojas;
    private javax.swing.JLabel Lbl_eliminar;
    private javax.swing.JLabel Lbl_modificar;
    private javax.swing.JSpinner Num_Amarillas;
    private javax.swing.JSpinner Num_Goles;
    private javax.swing.JSpinner Num_Goles1;
    private javax.swing.JSpinner Num_Rojas;
    private javax.swing.JPanel PanelFondo1;
    private javax.swing.JTabbedPane PanelPestanias;
    private javax.swing.JPanel Panel_Actualizar;
    private javax.swing.JPanel Panel_BusCodigo;
    private javax.swing.JPanel Panel_BusNombre;
    private javax.swing.JPanel Panel_CantEquipo;
    private javax.swing.JPanel Panel_Cargar;
    private javax.swing.JPanel Panel_Eliminar;
    private javax.swing.JPanel Panel_Goles;
    private javax.swing.JPanel Panel_Mostrar;
    private javax.swing.JPanel Panel_Posicion;
    private javax.swing.JPanel Panel_TRojas;
    private javax.swing.JPanel Pestania_Arbitros;
    private javax.swing.JPanel Pestania_Jugadoras;
    private javax.swing.JTabbedPane Pestanias_Menu_Jugadoras;
    private javax.swing.JSpinner SppRojas;
    private javax.swing.JTable TblActualizar;
    private javax.swing.JTable TblEliminar;
    private javax.swing.JTable TblMostrarCodigo;
    private javax.swing.JTable TblMostrarGoles;
    private javax.swing.JTable TblMostrarNombre;
    private javax.swing.JTable TblPosicion;
    private javax.swing.JTable TblPosicion1;
    private javax.swing.JTable TblPosicion2;
    private javax.swing.JTable Tbl_MostrarEquipos;
    private javax.swing.JTextField TxtBuscarCodigo;
    private javax.swing.JTextField TxtBuscarEliminar;
    private javax.swing.JTextField TxtBuscarNombre;
    private javax.swing.JTextField Txt_Anio;
    private javax.swing.JTextField Txt_ApellidoJ;
    private javax.swing.JTextField Txt_Dia;
    private javax.swing.JTextField Txt_Mes;
    private javax.swing.JTextField Txt_NacionalidadJ;
    private javax.swing.JTextField Txt_NombreJ;
    private javax.swing.JTextField Txt_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDni;
    private javax.swing.JTextField txtClub;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
