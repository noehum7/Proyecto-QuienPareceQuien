/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

/**
 * Esta clase representa la puntuación del juego.
 * @version 1.0
 * @author Noe P.
 */
public class Puntuaciones implements Comparable<Puntuaciones> {
  //Declaración de los atributos:
  private int puntuacion;
  private String iniciales;

  //  Declaración de métodos:
  
  /**
   * Constructor por parámetros de la clase Puntuaciones.
   * @param iniciales Cadena que representa las iniciales del jugador.
   * @param puntuacion Número que representa la puntuación.
   */
  public Puntuaciones(String iniciales, int puntuacion) {
    this.iniciales = iniciales;
    this.puntuacion = puntuacion;
  }

  /**
   * Método que devuelve la puntuación.
   * @return Número que representa la puntuación.
   */
  public int getPuntuacion() {
    return puntuacion;
  }

  /**
   * Método que devuelve las iniciales del jugador.
   * @return Las iniciales del jugador.
   */
  public String getIniciales() {
    return iniciales;
  }

  /**
   * Método para comparar dos puntuaciones.
   * @param o Puntuación con la que se compara la puntuación actual.
   * @return Devuelve un entero negativo si la puntuación actual es menor que la
   * puntuación de la puntuación o, un entero positivo si la puntuación actual
   * es mayor que la puntuación de la puntuación o, y cero si ambas puntuaciones
   * son iguales.
   */
  @Override
  public int compareTo(Puntuaciones o) {
    return Integer.compare(puntuacion, o.puntuacion);
  }

}
