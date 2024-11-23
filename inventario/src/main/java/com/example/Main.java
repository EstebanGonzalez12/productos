package com.example;
import com.example.Entidad.Inventario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Inventario inventario = new Inventario();
        inventario.setnombreDelProducto("Iphone 11");
        inventario.setprecioDelProducto(3000000);
        inventario.setcantidadEnStock(80);

        em.persist(inventario);
        em.getTransaction().commit();
        em.close();
    }
    
    //leer
    // public static Inventario leerInventario(Long id){
    //     EntityManager em = emf.createEntityManager();
    //     Inventario inventario1 = em.find(Inventario.class, id);
    //     em.close();
    //     return inventario1;
    // }
    
    //actualizar
    // public static void actualizarInventario(Long id, String nuevoNombre, int nuevoPrecio, int nuevoCantidad ){
    //     EntityManager em = emf.createEntityManager();
    //     em.getTransaction().begin();

    //     Inventario inventario2 = em.find(Inventario.class, id);
    //     if (inventario2 !=null){
    //         inventario2.setnombreDelProducto("Samsung s24");
    //         inventario2.setprecioDelProducto(2000000);
    //         inventario2.setcantidadEnStock(70);
    //         em.merge(inventario2);
    //     }
    // }

    //Eliminar
    // public static void eliminarInventario(Long id) {
    //     EntityManager em = emf.createEntityManager();
    //     em.getTransaction().begin();

    //     Inventario inventario3 = em.find(Inventario.class, id);
    //     if(inventario3 != null) {
    //         em.remove(inventario3);
    //     }
    // }

}     
