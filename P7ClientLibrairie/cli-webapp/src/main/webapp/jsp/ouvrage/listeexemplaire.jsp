<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-04-11
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
    <%@ taglib prefix="margin-top" uri="/struts-dojo-tags" %>
    <%@ include file="../_include/head.jsp" %>

</head>
<body>

<div class="container card" style="margin-top: 10px">

    <table class="table table-sm table-light">
        <thead class="table-info">
        <tr>
            <th scope="col">Référence interne</th>
            <th scope="col">Nom de l'ouvrage</th>
            <th scope="col">Déscription</th>
            <th scope="col">Ref ISBN</th>
            <th scope="col">Auteur</th>
            <th scope="col">Editeur</th>
        </tr>
        </thead>
        <tbody>
    <s:iterator value="exemplaireList" >
        <tr>
           <th scope="row"><s:property value="referenceInterne"/></th>
            <td><s:property value="ouvrage.intituleOuvrage" /></td>
            <td class="glyphicon-font small"><s:property value="ouvrage.description"/></td>
            <td><s:property value="ouvrage.isbn"/></td>
            <td><s:property value="ouvrage.auteur.intituleAuteur"/></td>
        <s:iterator value="ouvrage.editeurs">
        <td><s:property value="intituleEditeur"/></td>
        </s:iterator>

        </tr>
    </s:iterator>

        </tbody>
    </table>




</div>

</body>

    </html>
