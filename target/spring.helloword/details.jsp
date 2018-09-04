<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${hotEvents.keyWord }</h3>
	<h4>创建于：${hotEvents.createDate }</h4>
	<h5>${hotEvents.hotContent }</h5>
	<h3>评论</h3>
	<c:forEach items="${details }" var="details">
	<div style="background-color: gray ;width:50%;margin:10px 0" >
		<p>评论时间：${details.commentDate }</p>
		<%--<fmt:formatDate value="${details.commentDate }" type="both" pattern="yyyy-MM-dd HH:mm:ss" />--%>
		<p>${details.content }</p>
	</div>
	</c:forEach>
	<div>
		<form action="addContent.do?id=${hotEvents.id }" method="post">
			<p>快速评论：</p>
				<textarea rows="5" cols="80" name="content" value=""></textarea><span id="notNull" style="color:red"></span><br>
				<input type="button" id="commit" value="提交"><a href="search.do?pageNo=1">返回首页</a>
		</form>
	</div>
</body>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#commit").click(function(){
			var content = $("[name=content]").val();
			if(content==""){
				$("#notNull").text("评论不能为空！")
				return false;
			}else{
				$("form").submit();
			}
		})
	})
</script>
</html>