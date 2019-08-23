<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <title>문제집 목록</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/resources/style.css">
</head>
<body>
 <jsp:include page="top.jsp" flush="false" />

<!--문제집을 추가할 수 있는 아이콘-->
<img id="addfolder" src="/resources/img/notebook.png" width ="130" height="130" style="position:fixed; right: 10px; bottom: 10px;" data-toggle="modal" data-target="#myModal"> 
 
  <!-- 문제집을 추가하는 Modal-->
 <form  action="/qna/insert_workbook" method="post">
  <div class="modal" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <div class="modal-header">
          <h3 class="modal-title">추가할 문제집의 제목을 입력해주세요.</h3>
          <button type="button" class="close" data-dismiss="modal">×</button>
        </div>
        
        <!-- 추가할 문제집 제목 입력 -->
        <div class="modal-body">
            <input type="text" class="form-control" id="workbook" name="workbook">
            <input type="hidden" class="form-control" id="userid" name="userid" value="han">
        </div>
        
        <!-- 버튼 클릭 시 문제집 추가 -->
        <div class="modal-footer">
          <button type="submit" class="btn btn-info" >문제집 추가</button>
        </div>
        
      </div>
    </div>
  </div>
  </form>
  
  
  <% int i = 1; %>
  <!-- 문제집 목록 전체조회 -->
   <table width="80%" align="center"> 
			<c:forEach items="${booklist}" var="booklist">
			 <% if(i%5 == 0) { %> <tr> <% i = 1; } %> 
				<td><a href="/qna/question?booknumber=<c:out value='${booklist.booknumber}'/>">
						<div class="card">
							<img src="/resources/img/folder.png" width="150px">
							<h3>
								<c:out value="${booklist.workbook}" />
							</h3>
						</div>
				</a></td>
				 <% if(i%5 == 0) { %> </tr> <% } i = i+1; %> 
			</c:forEach>	
	 </table>		 		

</body>
</html>