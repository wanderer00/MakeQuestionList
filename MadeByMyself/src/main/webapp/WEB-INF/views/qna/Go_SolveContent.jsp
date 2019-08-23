<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제집 목록</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="/resources/style.css">
</head>
<body>

 <jsp:include page="top.jsp" flush="false" />
 
<form id="fm" action="/qna/go_" method="post">
<div align="center" width="60%">
<h2>풀 문제집을 선택하여 주세요!</h2>
			<%
				String subject[] ={"국어","수학","영어", "과학", "JSP","DBP","정보보호", "WSM" ,"NMT","사회", "NCP"};
						for (int i = 0; i < subject.length; i++) {
							if(i%5==0){%><br><%} %>
			        <a href="javascript:goList();">
					<div class="card">
						<img src="img/folder.png" style="width: 150px">
						<h3><%=subject[i] %></h3>
					</div></a>
			<% 
			}
			%>
				<input type="submit" value="NEXT" class="fixedbutton">
</div>		
</form>
</body>
</html>