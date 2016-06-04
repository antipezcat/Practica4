<html>
<head>
    <title>Lista de Estudiantes</title>
    <link href="/css/stylesheet.css" rel="stylesheet" >
</head>
<body>
    <#include "menu.ftl">
    <h1>Lista de Estudiantes</h1>
    
    <#if data??>
    <div id="lista">
            <table>
                <tr>
                    <th>ID</th>
                    <th>Matricula</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Telefono</th>
                    <th colspan="2">Accion</th>
                </tr>
                <#list data as estudiante>
                    <tr>
                        <td>${estudiante.getId()}</td>
                        <td>${estudiante.getMatricula()}</td>
                        <td>${estudiante.getNombre()}</td>
                        <td>${estudiante.getApellido()}</td>
                        <td>${estudiante.getTelefono()}</td>
                        <td>${estudiante.getEditarLink()}</td> 
                        <td>${estudiante.getBorrarLink()}</td> 
                    </tr>
                </#list>
            </table>
        </div>
        <#else>
            No hay estudiante registrados
        </#if>
    </table>
     <div id="button"> <a href="/formularioEstudiante" >Agregar estudiante</a> </div>
</body>
</html>