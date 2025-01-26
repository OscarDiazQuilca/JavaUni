
package controller;
import model.PrestamoLibro;

public class TestPrestamoLibro {
    public static void main(String[] args) {
        
       PrestamoLibro p1; 

        p1 = new PrestamoLibro(789, "Fundamentos de Programacion JAVA"); 
        
        
        System.out.println("Codigo libro : " + p1.getCod_libro());
        System.out.println("Nombre libro : " + p1.getNom_libro());
        
        p1.setNom_usuario("OSCAR DIAZ");
        p1.setFecha_prestamo("12-01-2025");
        p1.setFecha_devolucion("15-01-2025");
        p1.setEstado("ACTIVO");
        
        System.out.println("Nombre usario : " + p1.getNom_usuario());
        System.out.println("Fecha prestamo : " + p1.getFecha_prestamo());
        
        System.out.println("Fecha devolucion : " + p1.getFecha_devolucion());
        System.out.println("Estado : " + p1.getEstado());
        
         
    }
    
}
