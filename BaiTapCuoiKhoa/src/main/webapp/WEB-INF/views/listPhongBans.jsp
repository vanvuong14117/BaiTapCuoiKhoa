<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Lấy danh sách Users</title>


</head>
<body>
	<h1><u>Đây là danh sách Phong Ban:</u></h1>
	<table border="1">
		<tr bgcolor="#6666FF">
			<th style="font-size: 30px" width="100px">Id</th>
			<th style="font-size: 30px" width="200px">Ma Phong Ban</th>
			<th style="font-size: 30px" width="300px">Ten Phong Ban</th>
			<th style="font-size: 30px" width="300px">Mo Ta</th>
			<th style="font-size: 30px" width="300px">Chi Tiet</th>
			<th style="font-size: 30px" width="300px">Delete</th>
			<th style="font-size: 30px" width="300px">Edit</th>
		</tr>
		<tr height="5px">
		</tr>
		<c:forEach var="phongBan" items="${listPhongBans}">
			<tr bgcolor="green">
				<th style="font-size: 30px">${phongBan.id}</th>
				<th style="font-size: 30px">${phongBan.maPhongBan}</th>
				<th style="font-size: 30px">${phongBan.tenPhongBan}</th>
				<th style="font-size: 30px">${phongBan.moTa}</th>
				<th style="font-size: 30px"><a href="/searchPhongBan/${phongBan.id}">Chi Tiet</a><br></th>
				<th style="font-size: 30px"><a href="/deleteByIdPhongBan/${phongBan.id}">Delete Phong Ban</a><br></th>
			    <th style="font-size: 30px"><a href="/editByIdPhongBan/${phongBan.id}">Edit Phong Ban</a><br></th>
			</tr>

		</c:forEach>
	</table>

<script>
function myFunction(id) {
  alert(location.hostname);
  //window.location = 'http://something.jsp?name=' + name + '&age=' + age;
  document.location.href = "/deleteByUser/"+id;
}
</script>
</body>
</html>