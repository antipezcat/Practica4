<html>
<head>
    <title>Lista de Estudiantes</title>
</head>
<body>
    <h1>Lista de Estudiantes</h1>
    <#if data??>
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
                        <td><a href="/editarEstudiante/">Editar</a></td> 
                        <td><a href="/borrarEstudiante/">Borrar</a></td> 
                    </tr>
                </#list>
            </table>
        <#else>
            No hay estudiante registrados
        </#if>
    </table>
</body>
</html>