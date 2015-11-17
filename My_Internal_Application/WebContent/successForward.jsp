<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<!-- home.do -->
<html>
	<head>
		<link href="html/themes/css/my-own-css.css" rel="stylesheet" type="text/css">
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		<script src="html/themes/js/my-own-js.js"></script>
	</head>
	<body>
		<h1 style="text-align:center;"><bean:write name="StrutsForm" property="message" /></h1>
		
		<div>
			<div class="grid-three">
				<h2 id="ajax-content"></h2>
				<button type="submit" id="btn">Load Ajax Content</button>
			</div>
			<div class="grid-three">
				<div id="form">
					<form>
						Nome: <input type="text" id="nome"/>
					</form>
				</div>
				<button type="submit" id="btn2">Load Form</button>
			</div>
			
			<div class="grid-three">
				<h2 id="display-nome">Your name'll appear here!</h2>
			</div>
		</div>
		
		<hr style="clear:both;">	
			   
		<div class="grid-two">
		<h2>FORMATED TABLE</h2>
		   <table class="table-negociacao">
			   <thead>
				   	<tr>
			   			<th>ID</th>
			   			<th>PRECO</th>
			   			<th>QUANTIDADE</th>
		   			</tr>
			   </thead>
			   <tbody>
				    <c:forEach var="negociacao" items="${requestScope.listaNegociacao}">
				    <tr>
				      <td>${negociacao.id}</td>
				      <td>${negociacao.preco}</td>
				      <td>${negociacao.quantidade}</td>
				      </tr>
				  </c:forEach>
			    </tbody> 
			</table>
		</div>
		<div class="grid-two">
		<h2>JSON STRING (GSON)</h2>
			<p style="text-align:left">${requestScope.listaJSON}</p>
		</div>
	</body>
</html>