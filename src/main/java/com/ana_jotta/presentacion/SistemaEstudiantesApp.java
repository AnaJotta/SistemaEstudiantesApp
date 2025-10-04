package com.ana_jotta.presentacion;



import com.ana_jotta.datos.EstudianteDAO;
import com.ana_jotta.dominio.Estudiante;
import java.util.Scanner;

public class SistemaEstudiantesApp {
  public static void main(String[] args) {
    var salir = false;
    var consola = new Scanner(System.in);
    // Se crea una instancia clase servicio
    var estudianteDao = new EstudianteDAO();
    while(!salir){
      try {
        mostrarMenu();
        salir = ejecutarOpciones(consola, estudianteDao);
      } catch(Exception e){
        System.out.println("Ocurrió un error al ejecutar operación: "
                + e.getMessage());
      }
      System.out.println();
    }// fin while
  }

  public static void mostrarMenu(){
    System.out.println("""
            *** Sistema de Estudiantes ***
            1. Listar Estudiantes
            2. Buscar Estudiante
            3. Añadir Estudiante
            4. Modificar Estudiante
            5. Eliminar Estudiante
            6. Salir
            Elige una opcion: 
            """);
  }
  private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO){
    var opcion = Integer.parseInt(consola.nextLine());
    var salir = false;
    switch (opcion){
      case 1 -> { // Listar estudiantes
        System.out.println("Listado de Estudiantes..");
        var estudiantes = estudianteDAO.listarEstudiantes();
        estudiantes.forEach(System.out::println);
      }
      case 2 -> { // Buscar estudiante por id
        System.out.println("Introduce el id_estudiante a buscar:");
        var idEstudiante = Integer.parseInt(consola.nextLine());
        var estudiante = new Estudiante(idEstudiante);
        var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
        if(encontrado)
          System.out.println("Estudiante encontrado: " + estudiante);
        else
          System.out.println("Estudiante NO encontrado: " + estudiante);
      }
      case 3 -> { // Añadir estudiante
        System.out.println("Añadir Estudiante: ");
        System.out.print("Nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Teléfono: ");
        var telefono = consola.nextLine();
        System.out.print("Email: ");
        var email = consola.nextLine();
        // crear el objeto estudiante (sin el id)
        var estudiante = new Estudiante(nombre, apellido, telefono, email);
        var agregado = estudianteDAO.agregarEstudiante(estudiante);
        if(agregado)
          System.out.println("Estudiante añadido: " + estudiante);
        else
          System.out.println("Estudiante NO añadido: " + estudiante);
      }
      case 4 -> { // Modificar estudiante
        System.out.println("Modificar Estudiante: ");
        System.out.println("Id Estudiante: ");
        var idEstudiante = Integer.parseInt(consola.nextLine());
        System.out.print("Nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Teléfono: ");
        var telefono = consola.nextLine();
        System.out.print("Email: ");
        var email = consola.nextLine();
        // Crear el objeto estudiante a modificar
        var estudiante =
                new Estudiante(idEstudiante, nombre, apellido, telefono, email);
        var modificado = estudianteDAO.modificarEstudiante(estudiante);
        if(modificado)
          System.out.println("Estudiante modificado: " + estudiante);
        else
          System.out.println("Estudiante NO modificado: " + estudiante);
      }
      case 5 -> { // Eliminar estudiante
        System.out.println("Eliminar Estudiante: ");
        System.out.println("Id Estudiante: ");
        var idEstudiante = Integer.parseInt(consola.nextLine());
        var estudiante = new Estudiante(idEstudiante);
        var eliminado = estudianteDAO.eliminarEstudiante(estudiante);
        if(eliminado)
          System.out.println("Estudiante eliminado: " + estudiante);
        else
          System.out.println("Estudiante NO eliminado: " + estudiante);
      }
      case 6 -> { // Salir
        System.out.println("Hasta Pronto!");
        salir = true;
      }
      default -> System.out.println("Opción no reconocida");
    }
    return salir;
  }

}

