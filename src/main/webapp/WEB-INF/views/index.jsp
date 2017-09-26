<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<body>
		<p>
			hello ${name}
		</p>
			<c:forEach var="team" items="${teams}">
				<ul>
					<li>
					name : ${team.name}<br>
					city : ${team.city}<br>
					coach : ${team.coach.name}<br>
					players: 
					<c:forEach var="player" items="${team.players}">
						<ul>
							<li>
								name : ${player.name}<br>
							</li>
						</ul>
					</c:forEach>
					
					</li>
				</ul>
			</c:forEach>
	</body>

</html>