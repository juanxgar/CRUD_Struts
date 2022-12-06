<%-- 
    Document   : holamundo
    Created on : 30/11/2022, 10:38:26 a. m.
    Author     : Win10
--%>

<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="titulo" /></title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="page-header">
                <h1 style="color: blue">
                    <s:property value="titulo" />
                    <s:date name="fecha" format="dd/MM/yyyy" />
                </h1>
            </div>
            <table class="table table-striped table-hover" style="width: 400px; text-align: left">
                <thead>
                    <tr>
                        <th>Nombre</th>
                    </tr>
                </thead>
                <tbody>
                    <s:iterator value="cursos">
                        <tr>
                            <td><s:property /></td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>
        </div>
    </body>
</html>
