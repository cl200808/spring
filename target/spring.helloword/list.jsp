<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="search.do" method="post">
	<div align="center">
		<input type="text" name="search" value="${search }">
		<input type="submit" value="搜索">
		<h1 >热点事件排行榜</h1>
	</div>
		<table border="2px blod back" cellpadding="0" cellspacing="0"  width="100%" align="center">
			<tr bgcolor="gray">
				<th>关键词</th>
				<th>搜索指数</th>
				<th>创建时间</th> 
			</tr>
			<c:forEach items="${list }" var="list">
			<tr align="center">
				<td><a href="comment.do?id=${list.id }">${list.keyWord }</a></td>
				<td>${list.searchSum }</td>
				<td>${list.createDate}</td>
				<%--<td><fmt:formatDate value="${list.createDate }" type="both" pattern="yyyy-MM-dd" /></td>--%>
			</tr>
			</c:forEach>
		</table>
		<div align="center">
		
		<input type="hidden" name="pageNo" value="1">
		<input type='hidden' name='pageTotal' value='${p.pageTotal }'>
			<a href="#" onclick="first(1)">首页</a>
			<a href="#" onclick="prev(${p.pageNo})">上一页</a>
			<a href="#" onclick="next(${p.pageNo})">下一页</a>
			<a href="#" onclick="last(${p.pageTotal})">末页</a>
			第${p.pageNo }页/共${p.pageTotal }页
		</div>
	</form>
</body>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	function first(obj){
		$("[name=pageNo]").val(obj);
		$("form").submit();
	}
	function last(obj){
		$("[name=pageNo]").val(obj);
		$("form").submit();
	}
	function prev(obj){
		--obj;
		if(obj==0){
			alert('已经是第一页了');
		}else{
			$("[name=pageNo]").val(obj);
			$("form").submit();
		}
	}
	function next(obj){
		var pageTotal=$("[name=pageTotal]").val();
		if(obj==pageTotal){
			alert('已经是最后一页页了');
		}else{
			++obj;
			$("[name=pageNo]").val(obj);
			$("form").submit();
		}
	}
</script>
</html>