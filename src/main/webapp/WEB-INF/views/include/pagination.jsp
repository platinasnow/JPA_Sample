<script type="text/javascript">
	function goPage(page){
		$("#page").val(page);
		$(".container form").submit();
	};
</script>
<input type="hidden" name="search" value="true" />
<input type="hidden" id="page" name="page" value="${pagination.page}" />
<nav aria-label="Page navigation">
  <ul class="pagination justify-content-center">
    <li class="page-item"><a class="page-link" href="#" onclick="goPage('${pagination.jumpPrevPage}')"><</a></li>
    <c:forEach begin="${pagination.pageBegin }" end="${pagination.pageEnd }" step="1" var="pageNumber">
		<c:choose>
			<c:when test="${pagination.currentPage == pageNumber }">
				<li class="page-item active"><a class="page-link" href="#">${pageNumber }</a></li>
			</c:when>
			<c:otherwise>
				<li class="page-item"><a class="page-link" href="#" onclick="goPage('${pageNumber }')">${pageNumber }</a></li>
			</c:otherwise>
		</c:choose>
	</c:forEach>
    <li class="page-item"><a class="page-link" href="#" onclick="goPage('${pagination.jumpNextPage }')">></a></li>
  </ul>
</nav>	
