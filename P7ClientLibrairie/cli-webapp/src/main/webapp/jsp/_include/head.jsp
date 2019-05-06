<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-02-25
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>


<!-- Bootstrap CSS -->
<script type="text/javascript" src="https://cdn.datatables.net/v/bs4/dt-1.10.18/sl-1.3.0/datatables.min.js"></script>

<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4-4.1.1/dt-1.10.18/r-2.2.2/sl-1.3.0/datatables.min.css"/>

<script type="text/javascript" src="https://cdn.datatables.net/v/bs4-4.1.1/dt-1.10.18/r-2.2.2/sl-1.3.0/datatables.min.js"></script>
<link href="css/DataTables-1.10.18/css/dataTables.bootstrap4.min.css">


<script src="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css"/>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lumen/bootstrap.min.css" rel="stylesheet" integrity="sha384-iqcNtN3rj6Y1HX/R0a3zu3ngmbdwEa9qQGHdkXwSRoiE+Gj71p0UNDSm99LcXiXV" crossorigin="anonymous">


<%--<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>--%>
<%--
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/united/bootstrap.min.css" rel="stylesheet" integrity="sha384-WTtvlZJeRyCiKUtbQ88X1x9uHmKi0eHCbQ8irbzqSLkE0DpAZuixT5yFvgX0CjIu" crossorigin="anonymous">
--%>
<%--
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css" rel="stylesheet" integrity="sha384-LS4/wo5Z/8SLpOLHs0IbuPAGOWTx30XSoZJ8o7WKH0UJhRpjXXTpODOjfVnNjeHu" crossorigin="anonymous">
--%>
<%--<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/minty/bootstrap.min.css" rel="stylesheet" integrity="sha384-9NlqO4dP5KfioUGS568UFwM3lbWf3Uj3Qb7FBHuIuhLoDp3ZgAqPE1/MYLEBPZYM" crossorigin="anonymous">--%>
<link href="css/biblio.css" rel="stylesheet">
<div class="navbar navbar-expand-lg navbar-light bg-primary">
    <a class="navbar-brand " href="index.action">Accueil</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">

            <li class="nav-item active">
                <s:a class="nav-link" action="nutilisateur">S'inscrire<span class="sr-only">(current)</span></s:a>
            </li>
            <li class="nav-item active">
                <s:a class="nav-link" action="liste_ouvrage">Listes des ouvrages<span class="sr-only">(current)</span></s:a>
            </li>
            <li class="nav-item active">
                <s:a class="nav-link" action="recherche">Rechercher un ouvrage<span class="sr-only">(current)</span></s:a>
            </li>

            <s:if test="%{#session.user.identifiant!=''}">
                <li class="nav-item active">
                    <s:a class="nav-link" action="monprofil">Mon compte<s:param name="idutilisateur" value="%{#session.user.id}"/> <span class="sr-only">(current)</span></s:a>
                <li><s:a action="DoLogout">Déconnexion</s:a></li>
                </li>
            </s:if>
            <s:if test="%{#session.user==null}">
                <li class="nav-item active">
                    <s:a class="nav-link" action="Login">Authentification<span class="sr-only">(current)</span></s:a>
                </li>
            </s:if>
            <s:if test="#session.user">
                <h2 class="ami_txtfield"> Bienvenue <s:property value="#session.user.identifiant"/></h2>
            </s:if>
        </ul>
    </div>



</div>
</html>