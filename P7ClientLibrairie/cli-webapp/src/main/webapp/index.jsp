<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<%@ include file="/jsp/_include/head.jsp"%>
</head>
<body>
<h2>application web!</h2>
</body>

<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <h1 class="display-3">Fluid jumbo heading</h1>
        <p class="lead">Jumbo helper text</p>
        <hr class="my-2">
        <p>More info</p>
        <p class="lead">

            <s:a action="Login" class="btn btn-primary btn-lg" href="Jumbo action link" role="button">Jumbo action name</s:a>
        </p>
    </div>
</div>
</html>
</div>