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
    <title>Title</title>
</head>
<body>
<a:actionerror/>

</body>

<%@ include file="../_include/head.jsp"%>
<%--<s:form action="Login">
<fieldset>
    <legend>Authentification</legend>

    <div class="form-group">
        <s:label for="identification">Identification</s:label>
        <s:textfield name="identifiant" type="text" class="form-control"  placeholder="merci de saisir votre identifiant"/>
        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
    </div>
    <div class="form-group">
        <s:label for="exampleInputPassword1">Password</s:label>
        <s:textfield name="motDePasse" type="password" class="form-control"  placeholder="Password"/>
    </div>

    </fieldset>
    <s:submit value="connecter"  type="submit" class="btn btn-primary">Connection</s:submit>
</fieldset>
</s:form>--%>

<s:form action="Login">
    <s:textfield name="identifiant" label="Pseudo"  />
    <s:password name="motDePasse" label="Mot de Passe"  />
    <s:submit />
</s:form>

<s:if test="%{#session.user==null}">
    <li><s:a action="nutilisateur">Inscription</s:a></li>
</s:if>

</html>
