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
    <title>Détail d'un nouveau lecteur</title>


</head>
<body>

<s:property value="lecteur.id"/>
<s:property value="lecteur.indentifiant"/>
<s:property value="lecteur.nom"/>
<s:property value="lecteur.prenom"/>

    </body>
</html>
