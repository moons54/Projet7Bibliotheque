<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-04-15
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h1>Struts 2 example</h1>

<s:form action="resultAction" namespace="/">

    <s:doubleselect label="choix multicritere ouvrage"
                    name="genreouvrage" list="searchEngine"
                    doubleName="auteur"
                    doubleList="languageMap"  />






    <s:submit value="submit" name="submit" />

</s:form>

</body>
</html>