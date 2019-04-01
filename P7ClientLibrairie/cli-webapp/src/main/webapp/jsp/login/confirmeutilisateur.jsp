<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-03-11
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>


    <%@ include file="../_include/head.jsp"%>


</head>
<body>


<title>Validation de votre saisie</title>


<ul>

    <li><s:property value="lecteur.id"/></li>
    <li><s:property value="lecteur.identifiant"/></li>
    <li><s:property value="lecteur.nom"/></li>
    <li><s:property value="lecteur.prenom"/></li>
    <li><s:property value="lecteur.motDePasse"/></li>
    <li><s:property value="lecteur.dateInscription"/></li>

</ul>



</body>

<div><s:a action="ncoordonnees">Confirmer cette saisie<s:param name="idutilisateur" value="lecteur.id"/></s:a>
    <div><s:a action="utilisateur_supp">Annuler cette saisie<s:param name="idutilisateur" value="lecteur.id"/></s:a>


    </div>

</html>

