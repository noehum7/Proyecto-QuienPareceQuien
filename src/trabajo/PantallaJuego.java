/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Esta clase representa la pantalla principal del juego "¿Quién parece quién?".
 * Contiene los atributos necesarios para la lógica del juego, como la lista de
 * personajes, la lista de preguntas, la respuesta del usuario, etc. También
 * incluye los métodos necesarios para el funcionamiento del juego.
 *
 * @author Noe P.
 * @version 1.0
 */
public class PantallaJuego extends javax.swing.JFrame {
// Declarando los atributos de la clase:

  private Juego juego = new Juego();
  private ArrayList<Personaje> personajes;
  private ArrayList<String> preguntas;
  private boolean tachado;
  private int tachados;
  ImageIcon tachar;

//  Declarando los métodos: 
  /**
   * Este método reinicia la partida, creando un nuevo objeto Juego y
   * estableciendo nuevamente las imágenes y preguntas. Además, establece los
   * valores predeterminados para la respuesta y la selección del personaje.
   */
  public void reiniciarPartida() {
    juego = new Juego();
    establecerImagenes();
    juego.empezarPartida();
    lRespuesta.setText("");
    tPregunta.setText("Escribe el número de la pregunta.");
    cbPersonaje.setSelectedIndex(0);
    tachados = 0;
  }

  /**
   * Este método establece las imágenes de los personajes.
   */
  public void establecerImagenes() {
    ImageIcon isabel = new ImageIcon(this.getClass().getResource("/imagenes/Isabel.jpg"));
    lImagen2.setIcon(isabel);

    ImageIcon alexia = new ImageIcon(this.getClass().getResource("/imagenes/Alexia.jpg"));
    lImagen3.setIcon(alexia);

    ImageIcon rosalia = new ImageIcon(this.getClass().getResource("/imagenes/Rosalia.jpg"));
    lImagen4.setIcon(rosalia);
    
    ImageIcon sansa = new ImageIcon(this.getClass().getResource("/imagenes/Sansa.jpg"));
    lImagen5.setIcon(sansa);
    
    ImageIcon angelina = new ImageIcon(this.getClass().getResource("/imagenes/Angelina.jpg"));
    lImagen6.setIcon(angelina);
    
    ImageIcon fernando = new ImageIcon(this.getClass().getResource("/imagenes/Fernando.jpg"));
    lImagen7.setIcon(fernando);
    
    ImageIcon gandalf = new ImageIcon(this.getClass().getResource("/imagenes/Gandalf.jpg"));
    lImagen8.setIcon(gandalf);
    
    ImageIcon chris = new ImageIcon(this.getClass().getResource("/imagenes/Chris.jpg"));
    lImagen9.setIcon(chris);
  }

  /**
   * Este método establece los nombres de los personajes en sus JLabels
   * correspondientes.
   */
  public void establecerNombres() {
    lNombre1.setText(personajes.get(0).getNombre());
    lNombre2.setText(personajes.get(1).getNombre());
    lNombre3.setText(personajes.get(2).getNombre());
    lNombre4.setText(personajes.get(3).getNombre());
    lNombre5.setText(personajes.get(4).getNombre());
    lNombre6.setText(personajes.get(5).getNombre());
    lNombre7.setText(personajes.get(6).getNombre());
    lNombre8.setText(personajes.get(7).getNombre());
    lNombre9.setText(personajes.get(8).getNombre());
  }

  /**
   * Este método muestra las preguntas.
   */
  public void verPreguntas() {
    lPreguntas1.setText(preguntas.get(0));
    lPreguntas2.setText(preguntas.get(1));
    lPreguntas3.setText(preguntas.get(2));
    lPreguntas4.setText(preguntas.get(3));
    lPreguntas5.setText(preguntas.get(4));
    lPreguntas6.setText(preguntas.get(5));
    lPreguntas7.setText(preguntas.get(6));
    lPreguntas8.setText(preguntas.get(7));
  }

  /*
   * Este método verifica si se han tachado todos los personajes del juego. En caso
   * afirmativo, muestra un mensaje de Game Over y termina la partida.
   */
  public void personajesTachados() {
    if (tachados == 9) {
      JOptionPane.showMessageDialog(this, "Has tachado todos los personajes. ¡Game Over!");
      terminarJuego();
    }
  }

  /**
   * Este método finaliza el juego y cierra la pantalla.
   */
  public void terminarJuego() {
    this.dispose();
  }

  /**
   * Constructor de la clase. Inicializa los componentes de la interfaz gráfica,
   * establece la visibilidad, la maximiza y asigna un título a la ventana.
   * Además, inicializa el contador de personajes tachados en 0 y llama a los
   * métodos para establecer las imágenes, nombres y preguntas de los
   * personajes, empezar la partida, y mostrar un mensaje en el campo de texto
   * de la pregunta.
   */
  public PantallaJuego() {
    initComponents();
    setTitle("¿QUIÉN PARECE QUIÉN?");
    personajes = juego.obtenerPersonajes();
    preguntas = juego.verListadoPreguntas();
    tachado = false;
    tachados = 0;
    tachar = new ImageIcon(getClass().getResource("/imagenes/X.png"));
    juego.empezarPartida();
    tPregunta.setText("Escribe el número de la pregunta.");
    setExtendedState(PantallaJuego.MAXIMIZED_BOTH);
    establecerImagenes();
    establecerNombres();
    verPreguntas();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    pCentro = new javax.swing.JPanel();
    pPersonajes = new javax.swing.JPanel();
    pImagen1 = new javax.swing.JPanel();
    lImagen1 = new javax.swing.JLabel();
    lNombre1 = new javax.swing.JLabel();
    pImagen2 = new javax.swing.JPanel();
    lImagen2 = new javax.swing.JLabel();
    lNombre2 = new javax.swing.JLabel();
    pImagen3 = new javax.swing.JPanel();
    lImagen3 = new javax.swing.JLabel();
    lNombre3 = new javax.swing.JLabel();
    pImagen4 = new javax.swing.JPanel();
    lImagen4 = new javax.swing.JLabel();
    lNombre4 = new javax.swing.JLabel();
    pImagen5 = new javax.swing.JPanel();
    lImagen5 = new javax.swing.JLabel();
    lNombre5 = new javax.swing.JLabel();
    pImagen6 = new javax.swing.JPanel();
    lImagen6 = new javax.swing.JLabel();
    lNombre6 = new javax.swing.JLabel();
    pImagen7 = new javax.swing.JPanel();
    lImagen7 = new javax.swing.JLabel();
    lNombre7 = new javax.swing.JLabel();
    pImagen8 = new javax.swing.JPanel();
    lImagen8 = new javax.swing.JLabel();
    lNombre8 = new javax.swing.JLabel();
    pImagen9 = new javax.swing.JPanel();
    lImagen9 = new javax.swing.JLabel();
    lNombre9 = new javax.swing.JLabel();
    pPreguntas = new javax.swing.JPanel();
    lListadoPreguntas = new javax.swing.JLabel();
    lPreguntas1 = new javax.swing.JLabel();
    lPreguntas2 = new javax.swing.JLabel();
    lPreguntas3 = new javax.swing.JLabel();
    lPreguntas4 = new javax.swing.JLabel();
    lPreguntas5 = new javax.swing.JLabel();
    lPreguntas6 = new javax.swing.JLabel();
    lPreguntas7 = new javax.swing.JLabel();
    lPreguntas8 = new javax.swing.JLabel();
    pInferior = new javax.swing.JPanel();
    pAdivinar = new javax.swing.JPanel();
    pRespuesta = new javax.swing.JPanel();
    lRespuesta = new javax.swing.JLabel();
    pAcciones = new javax.swing.JPanel();
    bPreguntar = new javax.swing.JButton();
    bAdivinar = new javax.swing.JButton();
    bTachar = new javax.swing.JButton();
    pPregunta = new javax.swing.JPanel();
    tPregunta = new javax.swing.JTextField();
    cbPersonaje = new javax.swing.JComboBox<>();
    mMenu = new javax.swing.JMenuBar();
    mReiniciar = new javax.swing.JMenu();
    mPuntuaciones = new javax.swing.JMenu();
    mSalir = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));

    pCentro.setBackground(new java.awt.Color(145, 25, 15));
    pCentro.setForeground(new java.awt.Color(255, 255, 255));
    pCentro.setPreferredSize(new java.awt.Dimension(494, 170));
    pCentro.setLayout(new javax.swing.BoxLayout(pCentro, javax.swing.BoxLayout.LINE_AXIS));

    pPersonajes.setBackground(new java.awt.Color(204, 204, 0));
    pPersonajes.setForeground(new java.awt.Color(255, 255, 255));
    pPersonajes.setLayout(new java.awt.GridLayout(3, 3, 2, 1));

    pImagen1.setBackground(new java.awt.Color(181, 60, 41));
    pImagen1.setLayout(new java.awt.BorderLayout());

    lImagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ron.jpg"))); // NOI18N
    lImagen1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lImagen1MouseClicked(evt);
      }
    });
    pImagen1.add(lImagen1, java.awt.BorderLayout.CENTER);

    lNombre1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lNombre1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    pImagen1.add(lNombre1, java.awt.BorderLayout.SOUTH);

    pPersonajes.add(pImagen1);

    pImagen2.setBackground(new java.awt.Color(181, 60, 41));
    pImagen2.setLayout(new java.awt.BorderLayout());

    lImagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Isabel.jpg"))); // NOI18N
    lImagen2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lImagen2MouseClicked(evt);
      }
    });
    pImagen2.add(lImagen2, java.awt.BorderLayout.CENTER);

    lNombre2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lNombre2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    pImagen2.add(lNombre2, java.awt.BorderLayout.SOUTH);

    pPersonajes.add(pImagen2);

    pImagen3.setBackground(new java.awt.Color(181, 60, 41));
    pImagen3.setLayout(new java.awt.BorderLayout());

    lImagen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alexia.jpg"))); // NOI18N
    lImagen3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lImagen3MouseClicked(evt);
      }
    });
    pImagen3.add(lImagen3, java.awt.BorderLayout.CENTER);

    lNombre3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lNombre3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    pImagen3.add(lNombre3, java.awt.BorderLayout.SOUTH);

    pPersonajes.add(pImagen3);

    pImagen4.setBackground(new java.awt.Color(181, 60, 41));
    pImagen4.setLayout(new java.awt.BorderLayout());

    lImagen4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lImagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rosalia.jpg"))); // NOI18N
    lImagen4.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lImagen4MouseClicked(evt);
      }
    });
    pImagen4.add(lImagen4, java.awt.BorderLayout.CENTER);

    lNombre4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pImagen4.add(lNombre4, java.awt.BorderLayout.SOUTH);

    pPersonajes.add(pImagen4);

    pImagen5.setBackground(new java.awt.Color(181, 60, 41));
    pImagen5.setLayout(new java.awt.BorderLayout());

    lImagen5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lImagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sansa.jpg"))); // NOI18N
    lImagen5.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lImagen5MouseClicked(evt);
      }
    });
    pImagen5.add(lImagen5, java.awt.BorderLayout.CENTER);

    lNombre5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lNombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pImagen5.add(lNombre5, java.awt.BorderLayout.SOUTH);

    pPersonajes.add(pImagen5);

    pImagen6.setBackground(new java.awt.Color(181, 60, 41));
    pImagen6.setLayout(new java.awt.BorderLayout());

    lImagen6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lImagen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Angelina.jpg"))); // NOI18N
    lImagen6.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lImagen6MouseClicked(evt);
      }
    });
    pImagen6.add(lImagen6, java.awt.BorderLayout.CENTER);

    lNombre6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lNombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pImagen6.add(lNombre6, java.awt.BorderLayout.SOUTH);

    pPersonajes.add(pImagen6);

    pImagen7.setBackground(new java.awt.Color(181, 60, 41));
    pImagen7.setLayout(new java.awt.BorderLayout());

    lImagen7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lImagen7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fernando.jpg"))); // NOI18N
    lImagen7.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lImagen7MouseClicked(evt);
      }
    });
    pImagen7.add(lImagen7, java.awt.BorderLayout.CENTER);

    lNombre7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lNombre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pImagen7.add(lNombre7, java.awt.BorderLayout.SOUTH);

    pPersonajes.add(pImagen7);

    pImagen8.setBackground(new java.awt.Color(181, 60, 41));
    pImagen8.setLayout(new java.awt.BorderLayout());

    lImagen8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lImagen8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gandalf.jpg"))); // NOI18N
    lImagen8.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lImagen8MouseClicked(evt);
      }
    });
    pImagen8.add(lImagen8, java.awt.BorderLayout.CENTER);

    lNombre8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lNombre8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pImagen8.add(lNombre8, java.awt.BorderLayout.SOUTH);

    pPersonajes.add(pImagen8);

    pImagen9.setBackground(new java.awt.Color(181, 60, 41));
    pImagen9.setLayout(new java.awt.BorderLayout());

    lImagen9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lImagen9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Chris.jpg"))); // NOI18N
    lImagen9.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lImagen9MouseClicked(evt);
      }
    });
    pImagen9.add(lImagen9, java.awt.BorderLayout.CENTER);

    lNombre9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lNombre9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pImagen9.add(lNombre9, java.awt.BorderLayout.SOUTH);

    pPersonajes.add(pImagen9);

    pCentro.add(pPersonajes);

    pPreguntas.setBackground(new java.awt.Color(217, 91, 68));
    pPreguntas.setLayout(new java.awt.GridLayout(9, 0));

    lListadoPreguntas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lListadoPreguntas.setText("                                         Listado de preguntas");
    lListadoPreguntas.setFocusable(false);
    lListadoPreguntas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    pPreguntas.add(lListadoPreguntas);

    lPreguntas1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lPreguntas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pPreguntas.add(lPreguntas1);

    lPreguntas2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lPreguntas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pPreguntas.add(lPreguntas2);

    lPreguntas3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lPreguntas3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pPreguntas.add(lPreguntas3);

    lPreguntas4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lPreguntas4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pPreguntas.add(lPreguntas4);

    lPreguntas5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lPreguntas5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pPreguntas.add(lPreguntas5);

    lPreguntas6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lPreguntas6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pPreguntas.add(lPreguntas6);

    lPreguntas7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lPreguntas7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pPreguntas.add(lPreguntas7);

    lPreguntas8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    lPreguntas8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pPreguntas.add(lPreguntas8);

    pCentro.add(pPreguntas);

    getContentPane().add(pCentro, java.awt.BorderLayout.CENTER);

    pInferior.setBackground(new java.awt.Color(204, 204, 0));
    pInferior.setForeground(new java.awt.Color(255, 255, 255));
    pInferior.setLayout(new java.awt.GridLayout(1, 0));

    pAdivinar.setBackground(new java.awt.Color(181, 60, 41));
    pAdivinar.setLayout(new java.awt.BorderLayout(0, 10));

    pRespuesta.setBackground(new java.awt.Color(217, 91, 68));
    pRespuesta.setLayout(new java.awt.BorderLayout());

    lRespuesta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lRespuesta.setToolTipText("");
    lRespuesta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
    pRespuesta.add(lRespuesta, java.awt.BorderLayout.CENTER);

    pAdivinar.add(pRespuesta, java.awt.BorderLayout.CENTER);

    pAcciones.setBackground(new java.awt.Color(181, 60, 41));
    pAcciones.setLayout(new java.awt.GridLayout(3, 1));

    bPreguntar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    bPreguntar.setText("Hacer pregunta");
    bPreguntar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    bPreguntar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bPreguntarActionPerformed(evt);
      }
    });
    pAcciones.add(bPreguntar);

    bAdivinar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    bAdivinar.setText("Adivinar personaje");
    bAdivinar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    bAdivinar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bAdivinarActionPerformed(evt);
      }
    });
    pAcciones.add(bAdivinar);

    bTachar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    bTachar.setText("Tachar personaje");
    bTachar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    bTachar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bTacharActionPerformed(evt);
      }
    });
    pAcciones.add(bTachar);

    pAdivinar.add(pAcciones, java.awt.BorderLayout.EAST);

    pInferior.add(pAdivinar);

    pPregunta.setBackground(new java.awt.Color(181, 60, 41));

    tPregunta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    tPregunta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tPregunta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(210, 190, 173), null, null));
    tPregunta.setPreferredSize(new java.awt.Dimension(50, 26));
    tPregunta.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        tPreguntaFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        tPreguntaFocusLost(evt);
      }
    });
    tPregunta.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tPreguntaActionPerformed(evt);
      }
    });

    cbPersonaje.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    cbPersonaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ron Weasley", "Isabel la Catolica", "Alexia Putellas", "Rosalia", "Sansa Stark", "Angelina Jolie", "Fernando Alonso", "Gandalf", "Chris Evans" }));
    cbPersonaje.setBorder(null);
    cbPersonaje.setPreferredSize(new java.awt.Dimension(50, 32));
    cbPersonaje.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbPersonajeActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout pPreguntaLayout = new javax.swing.GroupLayout(pPregunta);
    pPregunta.setLayout(pPreguntaLayout);
    pPreguntaLayout.setHorizontalGroup(
      pPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pPreguntaLayout.createSequentialGroup()
        .addGap(65, 65, 65)
        .addGroup(pPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(tPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cbPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(303, Short.MAX_VALUE))
    );
    pPreguntaLayout.setVerticalGroup(
      pPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(pPreguntaLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(tPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(cbPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(59, Short.MAX_VALUE))
    );

    pInferior.add(pPregunta);

    getContentPane().add(pInferior, java.awt.BorderLayout.PAGE_END);

    mMenu.setBackground(new java.awt.Color(255, 255, 255));
    mMenu.setBorder(null);
    mMenu.setForeground(new java.awt.Color(255, 255, 255));
    mMenu.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

    mReiniciar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    mReiniciar.setText("Reiniciar partida");
    mReiniciar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    mReiniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    mReiniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    mReiniciar.setIconTextGap(10);
    mReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        mReiniciarMouseClicked(evt);
      }
    });
    mMenu.add(mReiniciar);

    mPuntuaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    mPuntuaciones.setText("Ver puntuaciones");
    mPuntuaciones.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    mPuntuaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    mPuntuaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    mPuntuaciones.setIconTextGap(10);
    mPuntuaciones.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        mPuntuacionesMouseClicked(evt);
      }
    });
    mMenu.add(mPuntuaciones);

    mSalir.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
    mSalir.setText("Salir");
    mSalir.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
    mSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    mSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    mSalir.setIconTextGap(10);
    mSalir.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        mSalirMouseClicked(evt);
      }
    });
    mMenu.add(mSalir);

    setJMenuBar(mMenu);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  /**
   * Este método se ejecuta al hacer clic en el botón "Preguntar". Se encarga de
   * obtener la opción de pregunta seleccionada por el usuario, realizar la
   * pregunta correspondiente y mostrar la respuesta obtenida. También controla
   * excepciones.
   *  
   * @param evt evento que desencadena la ejecución del método.
   */
  private void bPreguntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPreguntarActionPerformed
    // TODO add your handling code here:
    try {
      String resultado = tPregunta.getText();
      if(resultado.contains(" ")) {
        throw new Exception();
      }
      int opcionPregunta = Integer.parseInt(resultado);
      String respuesta = juego.hacerPreguntas(opcionPregunta);
      lRespuesta.setText(respuesta);
    } catch (NumberFormatException e) {
      lRespuesta.setText("El valor introducido no es un número.");
    } catch(Exception ex) {
      lRespuesta.setText("Sólo puedes introducir un único valor a la vez.");
    }
  }//GEN-LAST:event_bPreguntarActionPerformed

  /**
   * Este método obtiene la respuesta seleccionada en el ComboBox, llama al
   * método "adivinarPersonaje" y muestra un mensaje indicando si se ha acertado
   * o no. Si se ha acertado, solicita al usuario que introduzca sus iniciales y
   * llama al método "inicialesYPuntuacion". Por último, muestra las
   * puntuaciones en un cuadro de diálogo y cierra la ventana actual.
   *
   * @see Se llama al método adivinarPersonaje() para saber si se ha acertado el
   * personaje.
   * @see Se llama al método inicialesYPuntuacion() para guardar las iniciales
   * introducidas.
   * @see Se llama al método PuntuacionesFichero() para mostrar las
   * puntuaciones.
   * @param evt evento que desencadena la ejecución del método.
   */
  private void bAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdivinarActionPerformed
    // TODO add your handling code here:
    String respuesta = (String) cbPersonaje.getSelectedItem();
    juego.adivinarPersonaje(respuesta);
    if (juego.acertado()) {
      String iniciales = JOptionPane.showInputDialog("Enhorabuena, has adivinado el personaje.\nIntroduce tus iniciales:");
      juego.inicialesYPuntuacion(iniciales);
      String mensaje = juego.PuntuacionesFichero();
      JOptionPane.showMessageDialog(this, mensaje, "Puntuaciones", JOptionPane.INFORMATION_MESSAGE);
      this.dispose();
    } else {
      JOptionPane.showMessageDialog(this, "Lo siento, no has acertado. Sigue jugando.", "Fallo", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_bAdivinarActionPerformed

  /**
   * Este método establece el booleano tachado en true y suma uno más al
   * contador de tachados.
   *
   * @param evt evento que desencadena la ejecución del método.
   */
  private void bTacharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTacharActionPerformed
    // TODO add your handling code here:
    tachado = true;
    tachados++;
  }//GEN-LAST:event_bTacharActionPerformed

  /**
   * Este método comprueba si se ha pulsado el botón de tachar personaje. En
   * caso afirmativo cambia la imagen por otra de una X para tachar al
   * personaje. Por último vuelve a establecer el booleano tachado en false y
   * llama al método personajesTachados().
   *
   * @see Se llama al método personajesTachados() para comprobar si están todos
   * los personajes tachados.
   * @param evt evento que desencadena la ejecución del método.
   */
  private void lImagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lImagen2MouseClicked
    // TODO add your handling code here:
    if (tachado) {
      lImagen2.setIcon(tachar);
    }
    tachado = false;
    personajesTachados();
  }//GEN-LAST:event_lImagen2MouseClicked

  /**
   * Este método comprueba si se ha pulsado el botón de tachar personaje. En
   * caso afirmativo cambia la imagen por otra de una X para tachar al
   * personaje. Por último vuelve a establecer el booleano tachado en false y
   * llama al método personajesTachados().
   *
   * @see Se llama al método personajesTachados() para comprobar si están todos
   * los personajes tachados.
   * @param evt evento que desencadena la ejecución del método.
   */
  private void lImagen4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lImagen4MouseClicked
    // TODO add your handling code here:
    if (tachado) {
      lImagen4.setIcon(tachar);
    }
    tachado = false;
    personajesTachados();
  }//GEN-LAST:event_lImagen4MouseClicked

  /**
   * Este método comprueba si se ha pulsado el botón de tachar personaje. En
   * caso afirmativo cambia la imagen por otra de una X para tachar al
   * personaje. Por último vuelve a establecer el booleano tachado en false y
   * llama al método personajesTachados().
   *
   * @see Se llama al método personajesTachados() para comprobar si están todos
   * los personajes tachados.
   * @param evt evento que desencadena la ejecución del método.
   */
  private void lImagen5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lImagen5MouseClicked
    // TODO add your handling code here:
    if (tachado) {
      lImagen5.setIcon(tachar);
    }
    tachado = false;
    personajesTachados();
  }//GEN-LAST:event_lImagen5MouseClicked

  /**
   * Este método comprueba si se ha pulsado el botón de tachar personaje. En
   * caso afirmativo cambia la imagen por otra de una X para tachar al
   * personaje. Por último vuelve a establecer el booleano tachado en false y
   * llama al método personajesTachados().
   *
   * @see Se llama al método personajesTachados() para comprobar si están todos
   * los personajes tachados.
   * @param evt evento que desencadena la ejecución del método.
   */
  private void lImagen6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lImagen6MouseClicked
    // TODO add your handling code here:
    if (tachado) {
      lImagen6.setIcon(tachar);
    }
    tachado = false;
    personajesTachados();
  }//GEN-LAST:event_lImagen6MouseClicked

  /**
   * Este método comprueba si se ha pulsado el botón de tachar personaje. En
   * caso afirmativo cambia la imagen por otra de una X para tachar al
   * personaje. Por último vuelve a establecer el booleano tachado en false y
   * llama al método personajesTachados().
   *
   * @see Se llama al método personajesTachados() para comprobar si están todos
   * los personajes tachados.
   * @param evt evento que desencadena la ejecución del método.
   */
  private void lImagen7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lImagen7MouseClicked
    // TODO add your handling code here:
    if (tachado) {
      lImagen7.setIcon(tachar);
    }
    tachado = false;
    personajesTachados();
  }//GEN-LAST:event_lImagen7MouseClicked

  /**
   * Este método comprueba si se ha pulsado el botón de tachar personaje. En
   * caso afirmativo cambia la imagen por otra de una X para tachar al
   * personaje. Por último vuelve a establecer el booleano tachado en false y
   * llama al método personajesTachados().
   *
   * @see Se llama al método personajesTachados() para comprobar si están todos
   * los personajes tachados.
   * @param evt evento que desencadena la ejecución del método.
   */
  private void lImagen8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lImagen8MouseClicked
    // TODO add your handling code here:
    if (tachado) {
      lImagen8.setIcon(tachar);
    }
    tachado = false;
    personajesTachados();
  }//GEN-LAST:event_lImagen8MouseClicked

  /**
   * Este método comprueba si se ha pulsado el botón de tachar personaje. En
   * caso afirmativo cambia la imagen por otra de una X para tachar al
   * personaje. Por último vuelve a establecer el booleano tachado en false y
   * llama al método personajesTachados().
   *
   * @see Se llama al método personajesTachados() para comprobar si están todos
   * los personajes tachados.
   * @param evt evento que desencadena la ejecución del método.
   */
  private void lImagen9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lImagen9MouseClicked
    // TODO add your handling code here:
    if (tachado) {
      lImagen9.setIcon(tachar);
    }
    tachado = false;
    personajesTachados();
  }//GEN-LAST:event_lImagen9MouseClicked

  private void tPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPreguntaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tPreguntaActionPerformed

  private void tPreguntaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tPreguntaFocusLost
    // TODO add your handling code here:
  }//GEN-LAST:event_tPreguntaFocusLost

  private void tPreguntaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tPreguntaFocusGained
    // TODO add your handling code here:
  }//GEN-LAST:event_tPreguntaFocusGained

  private void cbPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPersonajeActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbPersonajeActionPerformed

  /**
   * Este método comprueba si se ha pulsado el botón de tachar personaje. En
   * caso afirmativo cambia la imagen por otra de una X para tachar al
   * personaje. Por último vuelve a establecer el booleano tachado en false y
   * llama al método personajesTachados().
   *
   * @see Se llama al método personajesTachados() para comprobar si están todos
   * los personajes tachados.
   * @param evt evento que desencadena la ejecución del método.
   */
  private void lImagen3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lImagen3MouseClicked
    // TODO add your handling code here:
    if (tachado) {
      lImagen3.setIcon(tachar);
    }
    tachado = false;
    personajesTachados();
  }//GEN-LAST:event_lImagen3MouseClicked

  /**
   * Este método comprueba si se ha pulsado el botón de tachar personaje. En
   * caso afirmativo cambia la imagen por otra de una X para tachar al
   * personaje. Por último vuelve a establecer el booleano tachado en false y
   * llama al método personajesTachados().
   *
   * @see Se llama al método personajesTachados() para comprobar si están todos
   * los personajes tachados.
   * @param evt evento que desencadena la ejecución del método.
   */
  private void lImagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lImagen1MouseClicked
    // TODO add your handling code here:
    if (tachado) {
      lImagen1.setIcon(tachar);
    }
    tachado = false;
    personajesTachados();
  }//GEN-LAST:event_lImagen1MouseClicked
  /**
   * Con este método conseguimos salir del juego si pulsamos el botón salir.
   * @param evt evento que desencadena la ejecución del método
   */
  private void mSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSalirMouseClicked
    // TODO add your handling code here:
    System.exit(0);
  }//GEN-LAST:event_mSalirMouseClicked

  /**
   * Con este método reiniciamos la partida.
   * @see Llamamos al método reiniciarPartidad().
   * @param evt evento que desencadena la ejecución del método
   */
  private void mReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mReiniciarMouseClicked
    // TODO add your handling code here:
        reiniciarPartida();
  }//GEN-LAST:event_mReiniciarMouseClicked

  /**
   * Si hacemos click en el botón ver puntuaciones veremos el histórico
   * de las 10 mejores puntuaciones.
   * @param evt evento que desencadena la ejecución del método.
   */
  private void mPuntuacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mPuntuacionesMouseClicked
    // TODO add your handling code here:
    ArrayList<Puntuaciones> puntuacionesTotales = new ArrayList<>();
    String mensaje = "";
    // Leemos el fichero:
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;

    try {
      archivo = new File("puntuaciones.txt");
      if (!archivo.exists()) {
        archivo.createNewFile();
      }
      fr = new FileReader(archivo);
      br = new BufferedReader(fr);
      String linea;

      while ((linea = br.readLine()) != null) {
        String[] puntuaciones = linea.split(" - ");
        String iniciales = puntuaciones[0];
        int puntos = Integer.parseInt(puntuaciones[1]);
        puntuacionesTotales.add(new Puntuaciones(iniciales, puntos));
      }
    } catch (IOException e) {
      System.out.println("Error leyendo el fichero: " + e.toString());
    } finally {
      try {
        br.close();
        fr.close();
      } catch (IOException ex) {
        System.out.println("Error cerrando el fichero: " + ex.toString());
      }
    }

    for (Puntuaciones ranking : puntuacionesTotales) {
      mensaje += (puntuacionesTotales.indexOf(ranking) + 1) + "." + ranking.getIniciales() + " - " + ranking.getPuntuacion() + "\n";
    }
    if (archivo.length() == 0) {
      JOptionPane.showMessageDialog(this, "Todavía no hay puntuaciones registradas.");
    } else {
      JOptionPane.showMessageDialog(this, mensaje, "Puntuaciones", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_mPuntuacionesMouseClicked

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
      java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new PantallaJuego().setVisible(true);
      }
    });
  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton bAdivinar;
  private javax.swing.JButton bPreguntar;
  private javax.swing.JButton bTachar;
  private javax.swing.JComboBox<String> cbPersonaje;
  private javax.swing.JLabel lImagen1;
  private javax.swing.JLabel lImagen2;
  private javax.swing.JLabel lImagen3;
  private javax.swing.JLabel lImagen4;
  private javax.swing.JLabel lImagen5;
  private javax.swing.JLabel lImagen6;
  private javax.swing.JLabel lImagen7;
  private javax.swing.JLabel lImagen8;
  private javax.swing.JLabel lImagen9;
  private javax.swing.JLabel lListadoPreguntas;
  private javax.swing.JLabel lNombre1;
  private javax.swing.JLabel lNombre2;
  private javax.swing.JLabel lNombre3;
  private javax.swing.JLabel lNombre4;
  private javax.swing.JLabel lNombre5;
  private javax.swing.JLabel lNombre6;
  private javax.swing.JLabel lNombre7;
  private javax.swing.JLabel lNombre8;
  private javax.swing.JLabel lNombre9;
  private javax.swing.JLabel lPreguntas1;
  private javax.swing.JLabel lPreguntas2;
  private javax.swing.JLabel lPreguntas3;
  private javax.swing.JLabel lPreguntas4;
  private javax.swing.JLabel lPreguntas5;
  private javax.swing.JLabel lPreguntas6;
  private javax.swing.JLabel lPreguntas7;
  private javax.swing.JLabel lPreguntas8;
  private javax.swing.JLabel lRespuesta;
  private javax.swing.JMenuBar mMenu;
  private javax.swing.JMenu mPuntuaciones;
  private javax.swing.JMenu mReiniciar;
  private javax.swing.JMenu mSalir;
  private javax.swing.JPanel pAcciones;
  private javax.swing.JPanel pAdivinar;
  private javax.swing.JPanel pCentro;
  private javax.swing.JPanel pImagen1;
  private javax.swing.JPanel pImagen2;
  private javax.swing.JPanel pImagen3;
  private javax.swing.JPanel pImagen4;
  private javax.swing.JPanel pImagen5;
  private javax.swing.JPanel pImagen6;
  private javax.swing.JPanel pImagen7;
  private javax.swing.JPanel pImagen8;
  private javax.swing.JPanel pImagen9;
  private javax.swing.JPanel pInferior;
  private javax.swing.JPanel pPersonajes;
  private javax.swing.JPanel pPregunta;
  private javax.swing.JPanel pPreguntas;
  private javax.swing.JPanel pRespuesta;
  private javax.swing.JTextField tPregunta;
  // End of variables declaration//GEN-END:variables
}
