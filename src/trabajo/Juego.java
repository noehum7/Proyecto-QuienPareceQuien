/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Esta clase representa un juego en el que hay que adivinar un personaje 
 * elegido al azar.
 * @version 1.0
 * @author Noe P.
 */
public class Juego {

  // Declaración de los atributos:
  private int puntuacion;
  private int turnos;
  private String iniciales;
  private ArrayList<Personaje> personajes;
  private Personaje azar;
  private boolean acertado;

  //  Declaración de métodos:
  /**
   * Constructor por parámetros de la clase Juego. Inicializa una instancia de
   * Juego.
   */
  public Juego() {
    puntuacion = 0;
    turnos = 0;
    iniciales = "";
    personajes = new ArrayList<>();
    azar = null;
    acertado = false;
  }

  /**
   * Método para empezar la partida. Se genera un número aleatorio que esté
   * entre 0 y el tamaño del arrayList. Con este número se escoge al azar un
   * personaje para jugar con él.
   */
  public void empezarPartida() {
    Random random = new Random();
    int indice = random.nextInt(obtenerPersonajes().size());
    azar = obtenerPersonajes().get(indice);
  }

  /**
   * Metodo que serializa un ArrayList de Personajes y los escribe en un fichero
   * "personajes.dat".
   */
  public void serializarPersonajes() {
    personajes.add(new Personaje("Ron Weasley", "Masculino", false, "Pelirrojo", "Marrones", Profesion.MAGO));
    personajes.add(new Personaje("Isabel la Catolica", "Femenino", true, "Rubio", "Azules", Profesion.REINA));
    personajes.add(new Personaje("Alexia Putellas", "Femenino", true, "Rubio", "Marrones", Profesion.DEPORTISTA));
    personajes.add(new Personaje("Rosalia", "Femenino", true, "Moreno", "Marrones", Profesion.CANTANTE));
    personajes.add(new Personaje("Sansa Stark", "Femenino", false, "Pelirrojo", "Verdes", Profesion.REINA));
    personajes.add(new Personaje("Angelina Jolie", "Femenino", true, "Castaño", "Verdes", Profesion.ACTRIZ));
    personajes.add(new Personaje("Fernando Alonso", "Masculino", true, "Castaño", "Marrones", Profesion.DEPORTISTA));
    personajes.add(new Personaje("Gandalf", "Masculino", false, "Gris", "Azules", Profesion.MAGO));
    personajes.add(new Personaje("Chris Evans", "Masculino", true, "Rubio", "Azules", Profesion.ACTOR));

    FileOutputStream fos = null;
    ObjectOutputStream salida = null;

    try {
      fos = new FileOutputStream("personajes.dat");
      salida = new ObjectOutputStream(fos);
      salida.writeObject(personajes);
    } catch (IOException e) {
      System.out.println("Error escribiendo el fichero: " + e.toString());
    } finally {
      try {
        salida.close();
        fos.close();
      } catch (IOException ex) {
        System.out.println("Error cerrando el fichero: " + ex.toString());
      }
    }
  }

  /**
   * Este método lee los personajes almacenados en el archivo 'personajes.dat' y 
   * los devuelve en un ArrayList de objetos Personaje. Si el archivo no existe, 
   * se llama al método serializarPersonajes().
   * @return Devuelve un ArrayList de objetos Personaje leídos del archivo.
   * @throws IOException Si ocurre un error durante la lectura del archivo.
   * @throws ClassNotFoundException Si no se encuentra la clase al deserializar
   * los objetos.
   * @see Si el archivo no existe llama al método serializarPersonajes() para
   * crearlo.
   */
  public ArrayList<Personaje> obtenerPersonajes() {
    FileInputStream fis = null;
    ObjectInputStream entrada = null;
    ArrayList<Personaje> personas = new ArrayList<>();

    try {
      File archivoPersonajes = new File("personajes.dat");
      if (!archivoPersonajes.exists()) {
        serializarPersonajes();
      }

      fis = new FileInputStream(archivoPersonajes);
      entrada = new ObjectInputStream(fis);
      personas = (ArrayList<Personaje>) entrada.readObject();
    } catch (IOException e) {
      System.out.println("Error leyendo el fichero: " + e.toString());
    } catch (ClassNotFoundException ex) {
      System.out.println("Error, clase no encontrada: " + ex.toString());
    } finally {
      try {
        if (entrada != null) {
          entrada.close();
        }
        if (fis != null) {
          fis.close();
        }
      } catch (IOException exe) {
        System.out.println("Error cerrando el fichero: " + exe.toString());
      }
    }
    return personas;
  }

  /**
   * Este método devuelve un ArrayList con preguntas para el juego.
   * @return Devuelve un ArrayList de preguntas.
   */
  public ArrayList verListadoPreguntas() {
    ArrayList<String> preguntas = new ArrayList<>();
    preguntas.add("1. ¿Tiene el pelo de color rubio?.");
    preguntas.add("2. ¿Tiene los ojos azules?.");
    preguntas.add("3. ¿Es real?.");
    preguntas.add("4. ¿Es deportista de profesión?.");
    preguntas.add("5. ¿Es un hombre?.");
    preguntas.add("6. ¿Es una mujer?.");
    preguntas.add("7. ¿Es un mago?.");
    preguntas.add("8. ¿Ha ganado un Grammy?.");
    return preguntas;
  }

  /**
   * Este método realiza una pregunta específica sobre el objeto seleccionado y
   * devuelve una respuesta.
   * @param opcion Un numero que indica la pregunta que se va a hacer.
   * @return Devuelve si o no a la pregunta hecha.
   */
  public String hacerPreguntas(int opcion) {
    String respuesta = "";
    switch (opcion) {
      case 1:
        if (azar.getColorPelo().equalsIgnoreCase("Rubio")) {
          respuesta = "Sí.";
        } else {
          respuesta = "No.";
        }
        break;
      case 2:
        if (azar.getColorOjos().equalsIgnoreCase("Azules")) {
          respuesta = "Sí.";
        } else {
          respuesta = "No.";
        }
        break;
      case 3:
        if (azar.isReal()) {
          respuesta = "Sí.";
        } else {
          respuesta = "No.";
        }
        break;
      case 4:
        if (azar.getProfesion().equals(Profesion.DEPORTISTA)) {
          respuesta = "Sí.";
        } else {
          respuesta = "No.";
        }
        break;
      case 5:
        if (azar.getGenero().equals("Masculino")) {
          respuesta = "Sí.";
        } else {
          respuesta = "No.";
        }
        break;
      case 6:
        if (azar.getGenero().equals("Femenino")) {
          respuesta = "Sí.";
        } else {
          respuesta = "No.";
        }
        break;
      case 7:
        if (azar.getProfesion().equals(Profesion.MAGO)) {
          respuesta = "Sí.";
        } else {
         respuesta = "No.";
        }
        break;
      case 8:
        if (azar.getProfesion().equals(Profesion.CANTANTE)) {
          respuesta = "Sí.";
        } else {
          respuesta = "No.";
        }
        break;
      default:
        respuesta = "Escribe un número entre el 1 y el 8.";
    }

    turnos++;
    return respuesta;
  }

  /**
   * Este método comprueba si la respuesta introducida es el personaje o no. Si
   * aciertas, establece el boolean acertado en true, y sino lo establece en
   * false y suma un fallo.
   * @param respuesta Una cadena que indica la respuesta proporcionada por el
   * usuario.
   */
  public void adivinarPersonaje(String respuesta) {
    int fallos = 0;
    if (azar != null) {
      if (respuesta.equalsIgnoreCase(azar.getNombre())) {
        acertado = true;
      } else {
        fallos++;
      }
    }
    puntuacion += fallos;
  }

  /**
   * Este método establece las iniciales proporcionadas por el usuario como el
   * nombre del jugador actual. A continuación, calcula la puntuación del
   * jugador sumando el número de turnos que ha necesitado para adivinar el
   * personaje.
   * @param iniciales Una cadena que representa las iniciales del jugador
   * actual.
   */
  public void inicialesYPuntuacion(String iniciales) {
    this.iniciales = iniciales;
    puntuacion += turnos;
  }

  /**
   * Este método se encarga de leer y escribir en un archivo de texto las
   * puntuaciones de los jugadores y mostrarlas ordenadas del 1 al 10.
   * @return Devuelve una cadena de caracteres con el histórico de puntuaciones
   * ordenadas.
   */
  public String PuntuacionesFichero() {
    String mensaje = "";
    ArrayList<Puntuaciones> puntuacionesTotales = new ArrayList<>();
    puntuacionesTotales.add(new Puntuaciones(iniciales, puntuacion));

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

      Collections.sort(puntuacionesTotales);

      if (puntuacionesTotales.size() > 10) {
        puntuacionesTotales.remove(10);
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

    //Escribimos las puntuaciones en el fichero:
    FileWriter ficheroPuntuaciones = null;
    PrintWriter pw = null;

    try {
      ficheroPuntuaciones = new FileWriter("puntuaciones.txt");
      pw = new PrintWriter(ficheroPuntuaciones);
      for (Puntuaciones pruebas : puntuacionesTotales) {
        pw.println(pruebas.getIniciales() + " - " + pruebas.getPuntuacion());
      }

    } catch (IOException e) {
      System.out.println("Error al escribir en el fichero: " + e.toString());
    } finally {
      try {
        pw.close();
        ficheroPuntuaciones.close();
      } catch (IOException ex) {
        System.out.println("Error cerrando el fichero: " + ex.toString());
      }
    }

    //Mostramos por pantalla las puntuaciones ordenadas del 1 al 10.
    for (Puntuaciones ranking : puntuacionesTotales) {
      mensaje += (puntuacionesTotales.indexOf(ranking) + 1) + "." + ranking.getIniciales() + " - " + ranking.getPuntuacion() + "\n";
    }
    return mensaje;
  }

  /**
   * Este método comprueba el valor de acertado. 
   * @return Devuelve un valor booleano que indica si el jugador ha adivinado el personaje o no.
   */
  public boolean acertado() {
    return acertado;
  }
  
}
