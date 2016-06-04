/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica4;

/**
 *
 * @author Dar
 */

public class Estudiante {
    private static int cont = 0;
    int id=cont;
    String matricula;
    String nombre;
    String apellido;
    String telefono;

   

    public Estudiante() {
    }

    @Override
    public String toString() {
        return String.format(" matricula: %s, Nombre: %s, Apellido: %s, Telefono: %s", matricula, nombre, apellido, telefono);
    }

    /**
     *
     * @param matricula
     * @param nombre
     * @param apellido
     * @param telefono
     */
    public Estudiante(String matricula, String nombre, String apellido, String telefono) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
         cont++;
         this.id = cont;
    }
    
      public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;

    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    public String getEditarLink() {
        return "<a href='/editarEstudiante/" + this.id + "'>Editar</a>";
    }

    public String getBorrarLink() {
        return "<a href='/borrarEstudiante/" + this.id + "'>Borrar</a>";
    }
    

}
