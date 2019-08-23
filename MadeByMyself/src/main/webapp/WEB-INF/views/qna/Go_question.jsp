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
 

<img id="addfolder" src="/resources/img/add.png" data-toggle="modal" data-target="#myModal" style=" width: 150px;
	height: 150px;
	position: fixed;
	right: 20px;
	bottom: 20px;"> 
 
  <!-- The Modal -->
 <form  action="/qna/insert_workbook" method="post">
  <div class="modal" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h3 class="modal-title">만들 문제집의 제목을 입력해주세요.</h3>
          <button type="button" class="close" data-dismiss="modal">×</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
            <input type="text" class="form-control" id="workbook" name="workbook" value="${workbook_list.workbook}">
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="submit" class="btn btn-info" >문제 추가</button>
        </div>
        
      </div>
    </div>
  </div>
  </form>
 <% int i = 0; %>
	<c:forEach items="${questionlist}" var="questionlist">
		<div class="card bg-light text-dark">
			<div class="card-body"><c:out value="${questionlist.qname}"/>
			 <hr class="my-4">
			 <button type="button" class="btn btn-info" data-toggle="collapse" data-target="#demo<%=i%>">정답보기</button>
			<div id="demo<%=i%>" class="collapse"><c:out value="${questionlist.aname}"></c:out>
			</div>
			</div>
			  <% i = i+1; %>	
		</div>
	</c:forEach>

</body>
</html>