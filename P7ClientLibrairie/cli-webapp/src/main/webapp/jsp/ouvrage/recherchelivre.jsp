<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-04-13
  Time: 15:07
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
<div class="container card">
    <s:form action="rechercherlivre">
    <div class="input-group mb-3">
        <div class="input-group-prepend">
            <div class="input-group-text">
                <input type="checkbox" aria-label="Checkbox for following text input">
            </div>
        </div>
        <s:textfield name="intitule"></s:textfield>
        <s:textfield name="genre.intituleGenre"></s:textfield>
                <input type="text" class="form-control" aria-label="Text input with checkbox">
    </div>
</div>
</s:form>
</body>
</html>
