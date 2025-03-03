/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajo;

/**
 * Esta clase representa la pantalla de inicio del juego ¿QUIÉN PARECE QUIÉN?.
 *
 * @author Noe P.
 * @version 1.0
 */
public class PantallaInicio extends javax.swing.JFrame {

  /**
   * Constructor de la clase. Inicializa la interfaz gráfica y configura el titulo inicial.
   * También maximiza la pantalla cuando se abre.
   */
  public PantallaInicio() {
    initComponents();
    setTitle("¿QUIÉN PARECE QUIÉN?");
    setExtendedState(PantallaJuego.MAXIMIZED_BOTH);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pTitulo = new javax.swing.JPanel();
    lTitulo = new javax.swing.JLabel();
    pImagen = new javax.swing.JPanel();
    lImagen = new javax.swing.JLabel();
    pBotones = new javax.swing.JPanel();
    pNuevaPartida = new javax.swing.JPanel();
    bNuevaPartida = new javax.swing.JButton();
    pSalir = new javax.swing.JPanel();
    bSalir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    pTitulo.setBackground(new java.awt.Color(94, 0, 2));
    pTitulo.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N

    lTitulo.setBackground(new java.awt.Color(0, 0, 0));
    lTitulo.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
    lTitulo.setForeground(new java.awt.Color(204, 204, 0));
    lTitulo.setText("¿QUIÉN PARECE QUIÉN?");
    pTitulo.add(lTitulo);

    getContentPane().add(pTitulo, java.awt.BorderLayout.PAGE_START);

    pImagen.setBackground(new java.awt.Color(116, 0, 1));
    pImagen.setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));
    pImagen.setLayout(new java.awt.BorderLayout());

    lImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portada.jpg"))); // NOI18N
    lImagen.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    pImagen.add(lImagen, java.awt.BorderLayout.CENTER);

    getContentPane().add(pImagen, java.awt.BorderLayout.CENTER);

    pBotones.setLayout(new java.awt.BorderLayout());

    pNuevaPartida.setBackground(new java.awt.Color(145, 25, 15));

    bNuevaPartida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    bNuevaPartida.setText("Nueva partida");
    bNuevaPartida.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    bNuevaPartida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    bNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bNuevaPartidaActionPerformed(evt);
      }
    });
    pNuevaPartida.add(bNuevaPartida);

    pBotones.add(pNuevaPartida, java.awt.BorderLayout.CENTER);

    pSalir.setBackground(new java.awt.Color(181, 60, 41));

    bSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    bSalir.setText("Salir");
    bSalir.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    bSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bSalirActionPerformed(evt);
      }
    });
    pSalir.add(bSalir);

    pBotones.add(pSalir, java.awt.BorderLayout.PAGE_END);

    getContentPane().add(pBotones, java.awt.BorderLayout.PAGE_END);

    pack();
  }// </editor-fold>//GEN-END:initComponents
  /**
   * Con este método salimos del juego y se cierra la ventana.
   * @param evt evento que desencadena la ejecución del método
   */
  private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
    // TODO add your handling code here:
    System.exit(0);
  }//GEN-LAST:event_bSalirActionPerformed

  /**
   * Con este método abriremos una nueva ventana que será la del juego principal.
   * Creamos una pantalla nueva que será la del juego y cerramos la actual. 
   * @param evt evento que desencadena la ejecución del método
   */
  private void bNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevaPartidaActionPerformed
    // TODO add your handling code here:
    this.setVisible(false);
    PantallaJuego pantallaJuego = new PantallaJuego();
    pantallaJuego.setVisible(true);
    dispose();
  }//GEN-LAST:event_bNuevaPartidaActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new PantallaInicio().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton bNuevaPartida;
  private javax.swing.JButton bSalir;
  private javax.swing.JLabel lImagen;
  private javax.swing.JLabel lTitulo;
  private javax.swing.JPanel pBotones;
  private javax.swing.JPanel pImagen;
  private javax.swing.JPanel pNuevaPartida;
  private javax.swing.JPanel pSalir;
  private javax.swing.JPanel pTitulo;
  // End of variables declaration//GEN-END:variables

}
