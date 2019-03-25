<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-03-19
  Time: 00:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<head>
    <%@ include file="../_include/head.jsp"%>
    <s:actionmessage name="nutilisateur"/>
</head>
<body>

<title>Suite de l'inscription</title>
<s:form action="ncoordonnees">
    <s:textfield name="rue" label="numéro rue + voie"  />
    <s:textfield name="codePostal" label="code postal"  />
    <s:textfield name="ville" label="ville"/>
    <s:textfield name="telephone" label="numéro de téléphone"/>
    <s:textfield name="email" label="email" />
    <%--<s:textfield name="coordonnees.lecteur.id" label="lecteur"><s:property value="idutilisateur"/></s:textfield>--%>
<s:hidden name="idutilisateur"/>
    <s:submit />
</s:form>

</body>
</html>
