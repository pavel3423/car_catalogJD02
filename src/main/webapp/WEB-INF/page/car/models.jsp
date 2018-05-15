<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/begin-html.jsp"%>

<div class="row">
	<h4>
		<br>
		<c:out value="${brand}" />
	</h4>
	<div class="col-md-12">
		<br>
	</div>
	<c:forEach items="${models}" var="model">

		<div class="card col-md-2" style="width: 11rem; margin: 12;">
			<a href="${brand}/${model.model}"> <img class="card-img-top"
				src="${model.image}" alt="${model.model}"></a>
			<div align="center">

				<div class="card-body">
					<a href="${brand}/${model.model}" class="btn btn-outline-success">${model.model}</a>
				</div>
			</div>
		</div>

	</c:forEach>
</div>

<%@ include file="../include/end-html.jsp"%>