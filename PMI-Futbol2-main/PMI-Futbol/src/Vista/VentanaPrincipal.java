
package Vista;

import Controlador.ControladorArbitros;
import Controlador.ControladorArchivo;
import Controlador.ControladorJugadoras;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    //ArchivoAdd commentMore actions
    ControladorArchivo ctrlAr = new ControladorArchivo();
    
    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Asociacion de Futbol");
        this.setSize(1100, 600);
        
        // Evitar que se cierre automáticamente sin confirmar            /*confirmacion de Salida*/Add commentMore actions
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        // Agregar listener para capturar el cierre de ventana
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            ControladorJugadoras controlador = new ControladorJugadoras();
            ControladorArbitros controlador2 = new ControladorArbitros();
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(
                 VentanaPrincipal.this,
                 "¿Estás seguro que querés salir?",
                    "Confirmar salida",
                    JOptionPane.YES_NO_OPTION
                );
             if (option == JOptionPane.YES_OPTION) {
                ctrlAr.guardarArbEnArchivo(controlador2.getListaArbitros());
                ctrlAr.guardarJuEnArchivo(controlador.getListaJugadoras()); // Aca llamo a mi funcion de guardar 
                System.exit(0); 
             }
         }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblFutbol = new javax.swing.JLabel();
        bttArbitros = new javax.swing.JButton();
        bttJugadoras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(189, 231, 168));
        fondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 102), new java.awt.Color(0, 153, 102), new java.awt.Color(0, 153, 102), new java.awt.Color(0, 153, 102)));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 80)); // NOI18N
        lblTitulo.setText("Asociación");
        fondo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        lblFutbol.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        lblFutbol.setText("Futbol 5 - Femenino");
        fondo.add(lblFutbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        bttArbitros.setBackground(new java.awt.Color(204, 255, 204));
        bttArbitros.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bttArbitros.setText("Arbitros");
        bttArbitros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 5));
        bttArbitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttArbitrosActionPerformed(evt);
            }
        });
        fondo.add(bttArbitros, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 210, 120));

        bttJugadoras.setBackground(new java.awt.Color(204, 255, 204));
        bttJugadoras.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bttJugadoras.setText("Jugadoras");
        bttJugadoras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 5));
        bttJugadoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttJugadorasActionPerformed(evt);
            }
        });
        fondo.add(bttJugadoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 210, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttJugadorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttJugadorasActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_bttJugadorasActionPerformed

    private void bttArbitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttArbitrosActionPerformed
        // TODO add your handling code here:
        Menu_Arbitros menu = new Menu_Arbitros();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_bttArbitrosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttArbitros;
    private javax.swing.JButton bttJugadoras;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel lblFutbol;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
