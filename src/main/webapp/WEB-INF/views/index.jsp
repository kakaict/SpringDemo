<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<body>
		<p>
			hello ${name} , from index
		</p>
		
			<c:forEach var="team" items="${teams}">
				<li>${team.name}</li>
			</c:forEach>
			
	</body>

</html>