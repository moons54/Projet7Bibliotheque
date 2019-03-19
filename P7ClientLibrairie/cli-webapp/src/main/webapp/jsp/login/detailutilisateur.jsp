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


<s:actionmessage name="ncoordonnees"/>
<title>Détail d'un lecteur</title>


<s:property value="lecteur.iD"/>
<s:property value="lecteur.identifiant"/>
<s:property value="lecteur.nom"/>
<s:property value="lecteur.prenom"/>
<s:property value="lecteur.motDePasse"/>
<s:property value="lecteur.dateInscription"/>


    </body>
</html>
