<html>
<head>
 <link href="/css/stylesheet.css" rel="stylesheet" >
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Editar Estudiante</title>
</head>
<body>
    <#include "menu.ftl">
<div>
 <form  method="post">
        <fieldset>
        <legend>Editar Estudiante</legend>
         <input name="matricula" type="text" value=${estudiante.matricula}><br/>
         <input name="nombre" type="text" value=${estudiante.nombre}><br/>
         <input name="apellido" type="text" value=${estudiante.apellido}><br/>
         <input name="telefono" type="text" value=${estudiante.telefono}<br/>
        <button name="Enviar" type="submit" id = "guardar">Guardar</button>
        </fieldset>
        </form>
 
   
</div>
</body>
</html>