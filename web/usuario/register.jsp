<%-- 
    Document   : register
    Created on : 1/12/2022, 12:08:45 p. m.
    Author     : Win10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <s:form action="%{action}">
                <!--Con esta linea se pasan los parametros para que permanezcan en la accion
                y no se elimine -->
                <s:hidden value="%{id}" name="id"/>
                <div class="mb-3">
                    <label for="name" class="form-label">Nombre</label>
                    <input class="form-control" id="name" name="name" placeholder="name" value="<s:if test="action== 'edit'"><s:property value="user.name" /></s:if>">
                    </div>
                    <div class="mb-3">
                        <label for="lastname" class="form-label" >Apellido</label>
                        <input class="form-control" id="lastname" name="lastname" placeholder="lastname" value="<s:if test="action== 'edit'"><s:property value="user.lastname" /></s:if>">
                    </div>
                    <div class="mb-3">
                        <label for="username" class="form-label">Nombre de usuario</label>
                        <input class="form-control" id="username" name="username" placeholder="username" value="<s:if test="action== 'edit'"><s:property value="user.username" /></s:if>">
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Contraseña</label>
                        <input type="password" class="form-control" id="password" name="password" placeholder="passsword" value="<s:if test="action== 'edit'"><s:property value="user.password" /></s:if>">
                    </div>
                <s:url id="url" action="edit">
                    <s:param name="id"><s:property value="user_id"/></s:param>
                </s:url>
                <button class="btn btn-primary" type="submit" id="url" ><s:property value='buttonMessage' /></button>
                <a class="btn btn-primary" href="/struts_crud/user/users" role="button">Regresar</a>
                <!--<s:submit value="<s:property value='buttonMessage' />"></s:submit>-->
            </s:form>
        </div>
    </body>
</html>
