<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Administration page</title>
	</head>
	<body>
		<h1>Administration page</h1>
		<link rel="stylesheet" type="text/css" href="/css/adminStyle.css" />
		
		<div id="forms">
			<span class="BioProducer">
				<h2>Crea un nuovo BioProducer</h2>
				
				<form method="post" enctype="multipart/form-data" action="createBioProducer">
					<p>Inserire i dati per la creazione di una nuova entità di tipo BioProducer.</p>
					
					Nome dell'azienda: <input type="text" name="producerName"><br /><br />
					
					Informazioni generali sull'azienda:<br />
					<textarea name="infoAzienda"></textarea><br /><br />
					
					Informazioni sul metodo di produzione:<br />
					<textarea name="productionMethod"></textarea><br /><br />
									
					Informazioni pratiche:<br />
					<textarea name="practicalInfo"></textarea><br /><br />
					
					Prodotti offerti:<br />
					<c:forEach var="product" items="${organicProductsList}">
						<input type="checkbox" name="${f:h(product.key)}"/> ${f:h(product.productName)} <br />						
					</c:forEach><br /><br />
					
					Immagini del produttore:<br />
					<input type="file" name="imageProducer1" id="file"><br />
					<input type="file" name="imageProducer2" id="file"><br />
					<input type="file" name="imageProducer3" id="file"><br />
					<input type="file" name="imageProducer4" id="file"><br />
					<input type="submit" value="submit"/>
				</form>
			</span>
			
			<span class="OrganicProduct">
				<h2>Crea un nuovo OrganicProduct</h2>
				
				<form method="post" enctype="multipart/form-data" action="createOrganicProduct">
					<p>Inserire i dati per la creazione di una nuova entità di tipo OrganicProduct.</p>
					
					Nome del prodotto: <input type="text" name="productName"><br /><br />
					
					Categoria del prodotto: <input type="text" name="productCategory"><br /><br />
					
					Informazioni generali sul prodotto:<br />
					<textarea name="generalInfo"></textarea><br /><br />
					
					Informazioni sui benefici:<br />
					<textarea name="healthBenefits"></textarea><br /><br />

					Produttore:<br />
					<select name="producerKey" >
						<c:forEach var="producer" items="${bioProducersList}">
							<option value="${f:h(producer.key)}" >${f:h(producer.producerName)}</option>
						</c:forEach>	
				 	</select><br /><br />

					Ricette correlate:<br />
					<c:forEach var="recipe" items="${recipesList}">
						<input type="checkbox" name="${f:h(recipe.key)}"/> ${f:h(recipe.recipeName)} <br />						
					</c:forEach><br /><br />
					
					Immagini del prodotto:<br />
					<input type="file" name="imageProduct1" id="file"><br />
					<input type="file" name="imageProduct2" id="file"><br />
					<input type="file" name="imageProduct3" id="file"><br />
					<input type="file" name="imageProduct4" id="file"><br />			
					<input type="submit" value="submit"/>
				</form>
			</span>
			
			<span class="Recipe">
				<h2>Crea una nuova Recipe</h2>
				
				<form method="post" enctype="multipart/form-data" action="createRecipe">
					<p>Inserire i dati per la creazione di una nuova entità di tipo Recipe.</p>
					
					Nome della ricetta: <input type="text" name="recipeName"><br /><br />
					
					Tipo di ricetta: <input type="text" name="recipeType"><br /><br />
					
					Descrizione della ricetta:<br />
					<textarea name="recipeDescription"></textarea><br /><br />
					
					Prodotti correlati:<br />
					<c:forEach var="product" items="${organicProductsList}">
						<input type="checkbox" name="${f:h(product.key)}"/> ${f:h(product.productName)} <br />						
					</c:forEach><br /><br />	
					
					Immagini della ricetta:<br />
					<input type="file" name="imageRecipe1" id="file"><br />
					<input type="file" name="imageRecipe2" id="file"><br />
					<input type="file" name="imageRecipe3" id="file"><br />
					<input type="file" name="imageRecipe4" id="file"><br />	

					<input type="submit" value="submit"/>
				</form>
			</span>			
		</div>
		
		<div id="itemsLists">
			<% int imageIndex = 0; %>
			<span class="BioProducer">
				<h2>Elenco dei BioProducers</h2>
				<table>
					<tr>
						<td>producerName</td>
						<td>infoAzienda</td>
						<td>productionMethod</td>
						<td>practicalInfo</td>
						<td>producerImages</td>
					</tr>
					<c:forEach var="producer" items="${bioProducersList}">
						<tr>							
							<td>${f:h(producer.producerName)}</td>
							<td>${f:h(producer.infoAzienda)}</td>
							<td>${f:h(producer.productionMethod)}</td>
							<td>${f:h(producer.practicalInfo)}</td>	
							
							<% imageIndex = 0; %>
							<c:forEach var="image" items="${producer.images}">
								<td><img src="GetImage?producerKey=${f:h(producer.key)}&imageIndex=<%= imageIndex %>" /></td>
								<% imageIndex++; %>
							</c:forEach>						
						</tr>
					</c:forEach>				
				</table>
			</span>

			<span class="OrganicProduct">
				<h2>Elenco degli OrganicProducts</h2>
				<table>
					<tr>
						<td>productName</td>
						<td>productCategory</td>
						<td>generalInfo</td>
						<td>healthBenefits</td>
					</tr>
					<c:forEach var="product" items="${organicProductsList}">
						<tr>
							<td>${f:h(product.productName)}</td>
							<td>${f:h(product.productCategory)}</td>
							<td>${f:h(product.generalInfo)}</td>
							<td>${f:h(product.healthBenefits)}</td>			
							<% imageIndex = 0; %>
							<c:forEach var="image" items="${product.images}">
								<td><img src="GetImage?productKey=${f:h(product.key)}&imageIndex=<%= imageIndex %>" /></td>
								<% imageIndex++; %>
							</c:forEach>		
						</tr>
					</c:forEach>				
				</table>
			</span>
			
			<span class="Recipe">
				<h2>Elenco delle Recipes</h2>
				<table>
					<tr>
						<td>recipeName</td>
						<td>recipeType</td>
						<td>recipeDescription</td>
					</tr>
					<c:forEach var="recipe" items="${recipesList}">
						<tr>
							<td>${f:h(recipe.recipeName)}</td>
							<td>${f:h(recipe.recipeType)}</td>
							<td>${f:h(recipe.recipeDescription)}</td>
							<% imageIndex = 0; %>
							<c:forEach var="image" items="${recipe.images}">
								<td><img src="GetImage?recipeKey=${f:h(recipe.key)}&imageIndex=<%= imageIndex %>" /></td>
								<% imageIndex++; %>
							</c:forEach>	
						</tr>
					</c:forEach>				
				</table>
			</span>
		</div>
		
	</body>
</html>