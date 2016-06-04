/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import freemarker.template.Configuration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.*;
import static spark.Spark.get;
import static spark.Spark.staticFileLocation;
import spark.template.freemarker.FreeMarkerEngine;

/**
 *
 * @author abollaita
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    private static List<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        //indicando los recursos publicos. //Imagenes/ css / js
        staticFileLocation("/publico");
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setClassForTemplateLoading(Practica4.class, "/recursos"); // Indicando la carpeta donde estaran los templates
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(configuration);

        Estudiante estudiantePrueba = new Estudiante("1111625", "Dariana", "Tavera", "8094137185");
        Estudiante estudiantePrueba1 = new Estudiante("111111", "Darariant", "Ta", "8094137185");
        listaEstudiantes.add(estudiantePrueba);
        listaEstudiantes.add(estudiantePrueba1);
        before((request, response) -> {
            System.out.println("Filtro Before -> Realizando llamada a la ruta: " + request.pathInfo());
        });

        after((request, response) -> {
            System.out.println("Filtro After -> Hello");
        });

        get("/inicio", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("titulo", "Inicio");
            return new ModelAndView(attributes, "inicio.ftl");
        }, freeMarkerEngine);

        get("/formularioEstudiante", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("titulo", "Formulario en FreeMarker");
            return new ModelAndView(attributes, "formularioEstudiante.ftl");
        }, freeMarkerEngine);
        post("/datosEstudiante/", (request, response) -> {

            String matricula = request.queryParams("matricula");
            String nombre = request.queryParams("nombre");
            String apellido = request.queryParams("apellido");
            String telefono = request.queryParams("telefono");
            Estudiante estudiante = new Estudiante(matricula, nombre, apellido, telefono);
            listaEstudiantes.add(estudiante);

            Map<String, Object> attributes = new HashMap<>();
            attributes.put("titulo", "Procesando Estudiante");
            attributes.put("estudiante", estudiante);
            return new ModelAndView(attributes, "datosEstudiante.ftl");
        }, freeMarkerEngine); //

        get("/lista", (req, res) -> {

            Map<String, Object> attributes = new HashMap<>();
            attributes.put("data", listaEstudiantes);

            return new ModelAndView(attributes, "lista.ftl");

        }, freeMarkerEngine);

        get("/editarEstudiante/:id", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            String id = req.params(":id");
            Estudiante estudianteU = listaEstudiantes.get(Integer.parseInt(id)-1);
            attributes.put("estudiante", estudianteU);

            return new ModelAndView(attributes, "editarEstudiante.ftl");
        }, freeMarkerEngine);

        post("/editarEstudiante/:id", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            String id = req.params(":id");
            Estudiante estudianteU = listaEstudiantes.get(Integer.parseInt(id)-1);
           System.out.println(estudianteU);
            attributes.put("estudiante", estudianteU);
            if (estudianteU!= null) {
                String nMatricula = req.queryParams("matricula");
                String nNombre = req.queryParams("nombre");
                String nApellido = req.queryParams("apellido");
                String nTelefono = req.queryParams("telefono");
                
                if (nMatricula != null) {
                    estudianteU.setMatricula(nMatricula);
                }
                if (nNombre != null) {
                    estudianteU.setNombre(nNombre);
                }
                if (nApellido != null) {
                    estudianteU.setApellido(nApellido);
                }
                if (nTelefono != null) {
                    estudianteU.setTelefono(nTelefono);
                }
                res.status(200);
                res.redirect("/inicio");
                return new ModelAndView(attributes, "inicio.ftl");
            } else {
                res.status(404); // 404 Not found
            }
             
            return new ModelAndView(attributes, "error.ftl");
        }, freeMarkerEngine); //

          get("/borrarEstudiante/:matricula", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            String id = req.params(":id");
            Estudiante estudianteU = listaEstudiantes.get(Integer.parseInt(id)-1);
            
           /* for (Estudiante listaEstudiante : listaEstudiantes) {
                if(id.equals(listaEstudiante.getId())){
                estudianteU = listaEstudiante;
                }
            }
           */
           estudianteU.setApellido("-");
          estudianteU.setMatricula("-");
          estudianteU.setNombre("-");
          estudianteU.setTelefono("-");
            return new ModelAndView(attributes, "borrarEstudiante.ftl");
        }, freeMarkerEngine);
        
    }

}
