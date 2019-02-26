<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="../include/top.jsp"%>
<%@ include file="../include/menu.jsp"%>	
	<main role="main" class="flex-shrink-0">
		<div class="container">
			<form method="post" >
				<div class="row">
				    <div class="col-md-8 order-md-1">
				      <h4 class="mb-3">Register</h4>
			          <div class="mb-3">
			            <label for="title">Title</label>
			            <input type="text" class="form-control" id="title" name="title" placeholder="" value="" required>
			          </div>
			          <div class="mb-3">
			            <label for="contents">Contents</label>
			            <textarea class="form-control" id="contents" name="contents" rows="8" cols="10" required></textarea>
			          </div>
				        <hr class="mb-4">
				        <h4 class="mb-3">Option</h4>
				         <div class="row mb-2">
				        	<div class="col-md-11"><input type="text" class="form-control" name="boardContentsList[0].contents" placeholder="" value=""></div><div class="col-md-1"><button class="btn btn-primary" type="button">+</button></div>
				        </div>
				        <div class="row mb-2">
				        	<div class="col-md-11"><input type="text" class="form-control" name="boardContentsList[1].contents" placeholder="" value=""></div><div class="col-md-1"><button class="btn btn-primary" type="button"> - </button></div>
				        </div>
				        <div class="row mb-2">
				        	<div class="col-md-11"><input type="text" class="form-control" name="boardContentsList[2].contents" placeholder="" value=""></div><div class="col-md-1"><button class="btn btn-primary" type="button"> - </button></div>
				        </div>
				        <hr class="mb-4">
				        <button class="btn btn-primary btn-lg btn-block" type="button" onclick="regForm();">등록</button>
				    </div>
				  </div>	
			</form>			
		</div>
	</main>
	<%@ include file="../include/js.jsp"%>
	<script>
	var regForm = function(){
		if(!confirm('등록하시겠습니까?')) return;
		
		$('.container form').attr('action', 'register-proc').submit();
	}
		
	</script>
<%@ include file="../include/footer.jsp"%>
