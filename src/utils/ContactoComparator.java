package utils;
import java.util.Comparator;
//import java.util.Set;
//import java.util.TreeSet;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{
    @Override
     public int compare(Contacto c1, Contacto c2){
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        int comparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());

        if(comparacionApellido != 0 ){
            return comparacionApellido;
        }else if (comparacionNombre != 0) {
            return comparacionNombre;
        }
        return c1.getTelefono().compareToIgnoreCase(c2.getTelefono());
    }
}

