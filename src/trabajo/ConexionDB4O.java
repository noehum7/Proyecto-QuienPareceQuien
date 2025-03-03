/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;

/**
 *
 * @author Noe P.
 */
public class ConexionDB4O {

  private ObjectContainer bd;

  public ConexionDB4O() {
    bd = null;
  }

  public ObjectContainer abrirBD() {
    bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "personajes.db4o");
    return bd;
  }

  public void cerrarBD() {
    bd.close();
    bd = null;
  }

  public void insertarPersonajes(ArrayList<Personaje> personajes) {
    for (Personaje prueba : personajes) {
      bd.store(prueba);
    }
  }

  public ArrayList<Personaje> obtenerPersonajesQBE() throws Exception {
    ArrayList<Personaje> resultado = new ArrayList<>();
    if (bd != null) {
      Personaje v = new Personaje(null, null, false, null, null, null);
      ObjectSet res = bd.queryByExample(v);

      while (res.hasNext()) {
        Personaje persona = (Personaje) res.next();
        resultado.add(persona);
      }
    } else {
      throw new Exception("Error");
    }
    return resultado;
  }
}
