/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

import java.io.Serializable;

/**
 * Esta clase representa a un personaje ficticio o real.
 * @version 1.0
 * @author Noe P.
 */
public class Personaje implements Serializable {
// Declaración de los atributos:

  private String nombre;
  private String genero;
  private boolean real;
  private String colorPelo;
  private String colorOjos;
  private Profesion profesion;
  private static final long serialVersionUID = 1L;

// Declaración de métodos:
  
  /**
   * Constructor por defecto de la clase Personaje.
   */
  public Personaje() {
    nombre = "";
    genero = "";
    real = false;
    colorPelo = "";
    colorOjos = "";
    profesion = null;
  }

  /**
   * Constructor por parámetros.
   * @param nombre Nombre del personaje.
   * @param genero Género del personaje.
   * @param real Indica si el personaje es real o ficticio.
   * @param colorPelo Color de pelo del personaje.
   * @param colorOjos Color de ojos del personaje.
   * @param profesion Profesión del personaje.
   */
  public Personaje(String nombre, String genero, boolean real, String colorPelo, String colorOjos, Profesion profesion) {
    this.nombre = nombre;
    this.genero = genero;
    this.real = real;
    this.colorPelo = colorPelo;
    this.colorOjos = colorOjos;
    this.profesion = profesion;
  }

  /**
   * Método para obtener el nombre del personaje.
   * @return El nombre del personaje.
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Método para obtener el género del personaje.
   * @return El género del personaje.
   */
  public String getGenero() {
    return genero;
  }

  /**
   * Método para establecer si el personaje es real o ficticio.
   * @return True si el personaje es real, false si es ficticio.
   */
  public boolean isReal() {
    return real;
  }

  /**
   * Método para obtener el color de pelo del personaje.
   * @return El color de pelo del personaje.
   */
  public String getColorPelo() {
    return colorPelo;
  }

  /**
   * Método para obtener el color de ojos del personaje.
   * @return El color de ojos del personaje.
   */
  public String getColorOjos() {
    return colorOjos;
  }

  /**
   * Método para obtener la profesión del personaje.
   * @return La profesión del personaje.
   */
  public Profesion getProfesion() {
    return profesion;
  }

  /**
   * Método para obtener una cadena de caracteres que representa al personaje.
   * @return Una cadena de caracteres con la descripción del personaje.
   */
  @Override
  public String toString() {
    return nombre + ":\nEl género del personaje es " + genero + (real ? ", el personaje es real, " : ", el personaje no es real, ")
      + "su color de pelo es " + colorPelo + ", su color de ojos es " + colorOjos + " y su profesión es " + profesion + ".";
  }

}
