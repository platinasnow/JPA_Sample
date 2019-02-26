<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="include/top.jsp"%>
<%@ include file="include/menu.jsp"%>	
	<main role="main" class="flex-shrink-0">
		<div class="container">
			<c:forEach items="${list }" var="list">
				${list }
			</c:forEach>	
		</div>
	</main>
<%@ include file="include/footer.jsp"%>
