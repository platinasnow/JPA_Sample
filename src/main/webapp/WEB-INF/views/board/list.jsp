<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../include/top.jsp"%>
<%@ include file="../include/menu.jsp"%>	
	<main role="main" class="flex-shrink-0">
		<div class="container">
			<form method="get" >
				<div class="input-group mt-3 mb-3">
					<select name="searchOption" class="input-group-append custom-select col-sm-2">
						<option value="">전체</option>
						<option value="name">작성자</option>
						<option value="title">제목</option>
						<option value="contents">내용</option>
					</select>
					<input type="text" name="searchInput" class="form-control col-sm-3" placeholder="Search ..." aria-describedby="button-addon2" value="${board.searchInput }">
					<div class="input-group-append"><button class="btn btn-outline-secondary" type="button" id="button-addon2" onclick="searchList();">Button</button></div>
				</div>
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Title</th>
							<th scope="col">REG_DATE</th>
							<th scope="col">REG_ID</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list.content }" var="vList" varStatus="count">
							<tr>
								<th scope="row">${list.totalElements - (pagination.page - 1) * pagination.itemPerPage - count.count + 1 }</th>
								<td><a href="view?idx=${vList.idx}">${vList.title }</a></td>
								<td><fmt:formatDate pattern="yyyy-MM-dd" value="${vList.regDate }"/> </td>
								<td>${vList.regId }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="float-right">
					<a href="register" class="btn btn-primary">등록</a>
				</div>	
				<%@ include file="../include/pagination.jsp"%>
			</form>			
		</div>
	</main>
	<%@ include file="../include/js.jsp"%>
	<script>
	function searchList(){
		$('#page').val(1);
		$('.container form').submit();
	}
	$('select[name="searchOption"]').val('${board.searchOption}');
	</script>
<%@ include file="../include/footer.jsp"%>
