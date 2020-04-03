<!doctype html>
<html>

<head>
	<title>Kiosk</title>
	<!--Load Bootstrap-->
	<asset:stylesheet src="bootstrap-grid.css"/>
	<asset:stylesheet src="bootstrap.css"/>
	<asset:stylesheet src="bootstrap-responsive.min.css"/>




	<script src="js/respond.js"></script>
</head>

<body>
	<g:form url="[resource:customerInstance, action:'customerLookup']" >
			<g:render template="kioskForm"/>
	</g:form>
	
	
	<g:javascript library="jquery"/>
	<asset:javascript src="bootstrap.js"/>

</body>
</html>