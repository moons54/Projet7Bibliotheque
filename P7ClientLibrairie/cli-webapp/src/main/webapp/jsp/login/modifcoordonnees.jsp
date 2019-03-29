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
<s:form action="coordonnees_mod">



<s:textfield name="coordonnees.lecteur.id" />

  <s:textfield name="coordonnees.email" label="Email" requiredLabel="true" ></s:textfield>
     <s:textfield name="coordonnees.telephone" label="telephone" requiredLabel="true" ></s:textfield>
     <s:textfield name="coordonnees.rue" label="rue" requiredLabel="true" ></s:textfield>
    <s:textfield name="coordonnees.codePostal" label="code postale" requiredLabel="true" ></s:textfield>
    <s:textfield name="coordonnees.ville" label="ville" requiredLabel="true" ></s:textfield>

    <s:hidden name="coordonnees.ID"/>

    <s:textfield name="idutilisateur"/>
    <s:param name="idutilisateur" value="coordonnees.lecteur.id"/>

    <s:submit />
</s:form>
</body>
</html>
