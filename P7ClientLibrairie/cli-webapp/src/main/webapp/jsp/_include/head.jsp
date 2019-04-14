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
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<%--
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/united/bootstrap.min.css" rel="stylesheet" integrity="sha384-WTtvlZJeRyCiKUtbQ88X1x9uHmKi0eHCbQ8irbzqSLkE0DpAZuixT5yFvgX0CjIu" crossorigin="anonymous">
--%>
<%--
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/superhero/bootstrap.min.css" rel="stylesheet" integrity="sha384-LS4/wo5Z/8SLpOLHs0IbuPAGOWTx30XSoZJ8o7WKH0UJhRpjXXTpODOjfVnNjeHu" crossorigin="anonymous">
--%>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/minty/bootstrap.min.css" rel="stylesheet" integrity="sha384-9NlqO4dP5KfioUGS568UFwM3lbWf3Uj3Qb7FBHuIuhLoDp3ZgAqPE1/MYLEBPZYM" crossorigin="anonymous">
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
                <s:a class="nav-link" action="rechercherlivre">Rechercher un ouvrage<span class="sr-only">(current)</span></s:a>
            </li>

            <s:if test="%{#session.user.identifiant!=''}">
                <li class="nav-item active">
                    <s:a class="nav-link" action="monprofil">Mon compte<s:param name="idutilisateur" value="%{#session.user.id}"/> <span class="sr-only">(current)</span></s:a>
                <li><s:a action="DoLogout">Déconnexion</s:a></li>
                </li>
            </s:if>
            <%--<s:if test="%{#session.user.identifiant!='admin'}">
                <li>
                <s:a class="ami_txtfield"><s:property value="#session.user" />
                    <li class="nav-item active">
                    <s:a class="nav-link" action="maliste">liste utilisateur<span class="sr-only">(current)</span></s:a>
                </li>
                </s:a>
                <li><s:a action="DoLogout">Déconnexion</s:a></li>
            </s:if>--%>

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