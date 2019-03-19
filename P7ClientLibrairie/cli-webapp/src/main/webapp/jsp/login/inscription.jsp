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

<s:form action="nutilisateur">
    <s:textfield name="identifiant" label="Pseudo"  />
    <s:password name="motDePasse" label="Mot de Passe"  />
    <s:password name="motDePasse2" label="deuxieme saisie mot de passe"/>
    <s:textfield name="nom" label="nom"/>
    <s:textfield name="prenom" label="prenom" />
   <%-- <s:textfield name="num_Cni" label="numero CNI"/>--%>
    <%--<s:date name="dateNaissance" format="dd/MM/yyyy"/>--%>
    <%--&lt;%&ndash;    <s:textfield name="lecteur.dateInscription" label="date insc" />&ndash;%&gt;--%>
    <%--<sx:datetimepicker name="dateNaissance" label="Format(yyyy-MM-dd)"
                       displayFormat="yyyy-MM-dd"/>--%>
    <s:submit />
</s:form>

<%--
<s:form action="utilisateur_new">
&lt;%&ndash;
    <s:textfield name="lecteur.identifiant" label="Identifiant de connexion" requiredLabel="true" ></s:textfield>
    <s:textfield name="lecteur.motDePasse" label="Mot de passe" requiredLabel="true" ></s:textfield>
    <s:textfield name="lecteur.nom" label="Nom" requiredLabel="true" ></s:textfield>
    <s:textfield name="lecteur.prenom" label="Prénom" requiredLabel="true" ></s:textfield>
    <s:textfield name="lecteur.dateDeNaissance" label="date de naissance" requiredLabel="true" ></s:textfield>
  &lt;%&ndash;  <s:textfield name="lecteur.numCni" label="num cni" requiredLabel="true" ></s:textfield>&ndash;%&gt;
    <s:textfield name="lecteur.dateInscription" label="date inscritption" requiredLabel="true" ></s:textfield>&ndash;%&gt;

    &lt;%&ndash;<s:textfield name="lecteur.email" label="Email" requiredLabel="true" ></s:textfield>&ndash;%&gt;
    <s:submit value="OK"/>
</s:form>--%>
</body>
</html>
