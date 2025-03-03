/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo;

import java.util.ArrayList;

/**
 *
 * @author Noe P.
 */
public class pruebaBD {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws Exception {
    // TODO code application logic here
    ConexionDB4O prueba = new ConexionDB4O();
    prueba.abrirBD();

    ArrayList<Personaje> personajes = new ArrayList<>();
    personajes.add(new Personaje("Ron Weasley", "Masculino", false, "Pelirrojo", "Marrones", Profesion.MAGO));
    personajes.add(new Personaje("Isabel la Catolica", "Femenino", true, "Rubio", "Azules", Profesion.REINA));
    personajes.add(new Personaje("Alexia Putellas", "Femenino", true, "Rubio", "Marrones", Profesion.DEPORTISTA));
    personajes.add(new Personaje("Rosalia", "Femenino", true, "Moreno", "Marrones", Profesion.CANTANTE));
   
    if (prueba.obtenerPersonajesQBE().isEmpty()) {
      prueba.insertarPersonajes(personajes);
    }
    
    for (Personaje prueba1 : prueba.obtenerPersonajesQBE()) {
      System.out.println(prueba1 + "\n");
    }
    prueba.cerrarBD();
  }

}
