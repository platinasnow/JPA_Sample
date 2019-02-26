<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../include/top.jsp"%>
<%@ include file="../include/menu.jsp"%>	
	<main role="main" class="flex-shrink-0">
		<div class="container">
			<form method="post" >
				<div class="row">
				    <div class="col-md-8 order-md-1">
				      <h4 class="mb-3">View</h4>
			          <div class="mb-3">
			            <label for="title">Title</label>
			            <input type="text" class="form-control" id="title" name="title" placeholder="" readonly="readonly" value="${item.title }" required>
			          </div>
			          <div class="mb-3">
			            <label for="contents">Contents</label>
			            <textarea class="form-control" id="contents" name="contents" rows="8" cols="10" readonly="readonly" required>${item.contents }</textarea>
			          </div>
				        <hr class="mb-4">
				        <h4 class="mb-3">Option</h4>
				        <c:forEach items="${item.boardContentsList }" var="list">
				        	<div class="row mb-2">
					        	<div class="col-md-12"><input type="text" class="form-control"  placeholder="" readonly="readonly" value="${list.contents }"></div>
					        </div>
				        </c:forEach>
				        <hr class="mb-4">
				    </div>
				  </div>	
			</form>			
		</div>
	</main>
	<%@ include file="../include/js.jsp"%>
	<script>
	</script>
<%@ include file="../include/footer.jsp"%>
