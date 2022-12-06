<%-- 
    Document   : users.jsp
    Created on : 2/12/2022, 5:09:27 p. m.
    Author     : Win10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="../resources/css/snackbar.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div class="container">
            <table class="table table-striped table-hover" style="width: 400px; text-align: left">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Nombre de usuario</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <s:iterator value="users">
                        <tr>
                            <td><s:property value="name" /></td>
                            <td><s:property value="lastname" /></td>
                            <td><s:property value="username" /></td>
                            <td>
                                
                                <s:url id="url" action="editform">
                                    <s:param name="id"><s:property value="user_id"/></s:param>
                                </s:url>
                                <s:a href="%{url}" data-toggle="tooltip" data-placement="top" title="Editar información">
                                    <img src='<s:url value="../img/icons/edit.png"></s:url>' height="20px" width="20px"/>
                                </s:a>
                                    
                                    
                                <s:url id="url" action="delete">
                                    <s:param name="id"><s:property value="user_id"/></s:param>
                                </s:url>
                                <s:a href="%{url}" data-toggle="tooltip" data-placement="top" title="Eliminar" onclick="myFunction()">
                                    <img src='<s:url value="../img/icons/delete.png"></s:url>' height="20px" width="20px"/>
                                </s:a>
                                    
                            </td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>
            <a class="btn btn-primary" href="/struts_crud/user/registerform" role="button" data-toggle="tooltip" data-placement="top" title="Registrar un usuario">Registro</a>
            <button class="btn btn-primary" data-toggle="tooltip" data-placement="top" title="Registrar un usuario" onclick="myFunction()">Prueba</button>
            <div id="snackbar">Eliminado correctamente</div>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="../resources/js/snackbar.js"></script>
    </body>
</html>
