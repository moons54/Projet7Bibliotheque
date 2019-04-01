<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-03-24
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
    <%@ include file="../_include/head.jsp" %>

</head>
<body><title>Modification profil</title>
<s:form action="utilisateur_mod">


    <s:textfield name="lecteur.identifiant" label="Identifiant de connexion" requiredLabel="true" ></s:textfield>
    <s:textfield name="lecteur.motDePasse" label="Mot de passe" requiredLabel="true" ></s:textfield>
    <s:textfield name="lecteur.nom" label="Nom" requiredLabel="true" ></s:textfield>
    <s:textfield name="lecteur.prenom" label="Prénom" requiredLabel="true" ></s:textfield>
    <s:textfield name="idutilisateur"/>
    <s:hidden name="lecteur.id"/>

    <s:submit />
</s:form>
</body>
</html>
