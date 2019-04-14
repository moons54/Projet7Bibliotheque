<%--
  Created by IntelliJ IDEA.
  User: aurelienmimouni
  Date: 2019-03-11
  Time: 09:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<head>
    <%@ include file="../_include/head.jsp"%>
    <title>Inscription</title>
    <sx:head />
    <html>
<body>

<div class="container">
    <div class="row">
        <div class="col-xs-1 col-sm-3 col-md-3 col-lg-3"></div>
        <div class="col-xs-10 col-sm-6 col-md-6 col-lg-6">
            <div class="card text-center center-block ami_card">
                <div class="header-panel primary">Inscription</div>
                <div class="card-body">
                    <s:form action="nutilisateur" class="col-lg-12">
                        <s:textfield name="identifiant" class="form-control"  label="Identifiant" labelSeparator="" labelposition="top"/>
                        <s:password name="motDePasse" class="form-control" label="Mot de Passe" labelSeparator="" labelposition="top"/>
                        <s:password name="motDePasse2" class="form-control" label="deuxieme saisie mot de passe" labelSeparator="" labelposition="top"/>
                        <s:textfield name="nom" class="form-control" label="nom" labelSeparator="" labelposition="top"/>
                        <s:textfield name="prenom" class="form-control" label="prenom" labelSeparator="" labelposition="top" cssStyle="margin-bottom: 10px"/>
                            <div class="row">
                                <div class="col-md-offset-5 col-md-2 col-lg-offset-5 col-lg-2">
                                    <s:reset value="Annuler" class="btn btn-danger btn-block" />
                                    <s:submit value="Valider" class="btn btn-primary btn-block" />
                                </div>
                            </div>
                    </s:form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

