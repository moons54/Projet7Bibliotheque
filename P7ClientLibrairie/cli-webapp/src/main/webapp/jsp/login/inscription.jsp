<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-03-11
  Time: 09:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<head>
    <%@ include file="../_include/head.jsp"%>
    <title>Inscription</title>
    <sx:head />
    <html>
<body>

<s:form action="nutilisateur">
    <s:textfield name="identifiant" label="Pseudo"  />
    <s:password name="motDePasse" label="Mot de Passe"  />
    <s:password name="motDePasse2" label="deuxieme saisie mot de passe"/>
    <s:textfield name="nom" label="nom"/>
    <s:textfield name="prenom" label="prenom" />
    <s:submit />
</s:form>
</body>
</html>
