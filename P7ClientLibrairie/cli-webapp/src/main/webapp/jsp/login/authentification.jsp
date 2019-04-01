<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-02-25
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="a" uri="/struts-tags" %>
<html>
<head>
    <title>Authentification</title>
</head>
<body>
<a:actionerror/>

</body>

<%@ include file="../_include/head.jsp"%>


<s:form action="Login">
    <s:textfield name="identifiant" label="Pseudo"  />
    <s:password name="motDePasse" label="Mot de Passe"  />
    <s:submit />
</s:form>

<s:if test="%{#session.user==null}">
    <li><s:a action="nutilisateur">Inscription</s:a></li>
</s:if>

</html>
