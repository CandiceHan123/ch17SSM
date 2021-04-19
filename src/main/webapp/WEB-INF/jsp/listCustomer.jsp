<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>编号</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="row">
								<tr>
									<td>${row.id}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
</body>
</html>