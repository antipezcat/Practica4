<html>
<head>
<title>${titulo}</title>
<link href="/css/stylesheet.css" rel="stylesheet" >
</head>
<body>
    <#include "menu.ftl">
<h1>Registro</h1>
    <form action="/datosEstudiante/" method="post">
        <fieldset>
        <legend>Formulario de Registro</legend>
         <input name="matricula" type="text" placeholder="Matricula"/><br/>
         <input name="nombre" type="text" placeholder="Nombre"/><br/>
         <input name="apellido" type="text" placeholder="Apellido"/><br/>
         <input name="telefono" type="text" placeholder="Telefono"/><br/>
        <button name="Enviar" type="submit" id = "guardar">Guardar</button>
        </fieldset>
        </form>

</body>
</html>