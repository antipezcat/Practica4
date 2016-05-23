<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Update user</title>
</head>
<body>
<div>
 <form action="/datosEstudiante/" method="post">
        <fieldset>
        <legend>Editar Estudiante</legend>
         <input name="matricula" type="number" value=${estudiante.matricula}/><br/>
         <input name="nombre" type="text" value=${estudiante.nombre}/><br/>
         <input name="apellido" type="text" value=${estudiante.apellido}/><br/>
         <input name="telefono" type="text" value=${estudiante.telefono}br/>
        <button name="Enviar" type="submit" id = "guardar">Guardar</button>
        </fieldset>
        </form>
 
   
</div>
</body>
</html>