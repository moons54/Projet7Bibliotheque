<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-04-19
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
    <%@ taglib prefix="margin-top" uri="/struts-dojo-tags" %>
    <%@ include file="../_include/head.jsp" %>

</head>

<body>
<title>Détail d'un ouvrage</title>


<div class="container card" style="margin-top: 10px">

    <div class="row" style="margin-top: 50px">
        <div class="col-sm-4">
            <div class="header ">
            <li class="list-group-item alert-primary">NOM DE L'OUVRAGE : <s:property value="ouvrage.intituleOuvrage"/></li></div>
                <li class="list-group-item">REFERENCE ISBN : <s:property value="ouvrage.isbn"/></li>
                <li class="list-group-item">NOM AUTEUR : <s:property value="ouvrage.auteur.intituleAuteur"/></li>
                <li class="list-group-item">EDITION : <s:iterator value="ouvrage.editeurs">
                    <td><s:property value="intituleEditeur"/></td>
                </s:iterator></li>
                <li class="list-group-item">GENRE : <s:iterator value="ouvrage.genres">
                    <td><s:property value="intituleGenre"/></td>
                </s:iterator>
                </li>
            </div>

 <div class="col-sm-8">
    <div class="card header">

        <li class="list-group-item alert-primary">PHOTO COUVERTURE</li>
<ul>
    <li class="text-center"><img src="images/<s:property value="ouvrage.photo"/>"/>

</ul>
        </div>
    </div>




    </div>
    <div class="card" style="margin-top: 20px">
        <s:property value="ouvrage.description"/>
    </div>
</div>

</body>
</html>
