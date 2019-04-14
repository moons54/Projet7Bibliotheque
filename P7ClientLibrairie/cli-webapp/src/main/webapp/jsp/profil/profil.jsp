<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-04-08
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
    <%@ taglib prefix="margin-top" uri="/struts-dojo-tags" %>
    <%@ include file="../_include/head.jsp" %>

</head>
<body>
<title>Mon profil</title>
<div class="container card" style="margin-top: 10px">
    <div class="row" style="margin-top: 50px">

   <%--<div class="col-xs-1 col-sm-3 col-md-3 col-lg-3"></div>--%>
        <div class="col-sm-4">
            <div class="card">
                    <div class="card-header">
                        Mon Profil
                    </div>
                    <ul class="list-group list-group-flush"><s:hidden value="#session.user.id"/>
                        <li class="list-group-item">Nom : <s:property value="#session.user.identifiant"/></li>
                        <li class="list-group-item">prénom : <s:property value="#session.user.nom"/></li>
                        <li class="list-group-item">Date d'inscription : <s:property value="#session.user.dateInscription"/></li>
                    </ul>
                </div>
            </div>
        <div class="col-sm-8">
            <div class="card text-center">
                    <div class="card-header">
                       Historique de mes emprunts
                    </div>
                <table class="table">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Ouvrage</th>
                        <th scope="col">Genre</th>
                        <th scope="col">Date d'emprunt</th>
                        <th scope="col">Description</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>exmeple</td>
                        <td>exemple</td>
                        <td>@exempl</td>
                        <td>@exemple</td>
                    </tr>


                    </tbody>
                </table>
                </div>
            </div>
        </div>
    <div class="row" style="margin-top: 50px">
        <div class="col-sm-12">
            <div class="card" style="margin-bottom: 50px">
                <div class="card-header">
                   livres en cours
                </div>
                <table class="table">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">Livres en cours</th>
                        <th scope="col">Date d'emprunt</th>
                        <th scope="col">Date de retour prévue</th>
                        <th scope="col">Durée d'emprunt prolongé</th>
                        <th scope="col">Délais dépassé</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td>Exmple</td>
                        <td>Exmple</td>
                        <td>Exmple</td>
                        <td>Exmple</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
