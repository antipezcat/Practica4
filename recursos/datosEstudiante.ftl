
<html>
<head>
    <title>${titulo}</title>
    <link href="/css/stylesheet.css" rel="stylesheet" >
</head>
<body>
    <#include "menu.ftl">
    
    <h1>Estudiante agregadado satisfactoriamente</h1>
    <table>
        <tbody>
        <tr><td>Matricula</td><td>${estudiante.matricula}</td></tr> 
        <tr><td>Nombre</td><td>${estudiante.nombre}</td></tr>
        <tr><td>Apellido</td><td>${estudiante.apellido}</td></tr>
          <tr><td>Telefono</td><td>${estudiante.telefono}</td></tr>
        </tbody>
    </table>
</body>
</html>