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
	<h1><u>Đây là danh sách Chuc vu:</u></h1>
	<table border="1">
		<tr bgcolor="#6666FF">
			<th style="font-size: 30px" width="100px">Id</th>
			<th style="font-size: 30px" width="200px">Ma Chuc Vu</th>
			<th style="font-size: 30px" width="300px">Ten Chuc Vu</th>
			<th style="font-size: 30px" width="300px">Mo Ta</th>
			<th style="font-size: 30px" width="300px">Chi Tiet</th>
			<th style="font-size: 30px" width="300px">Delete</th>
			<th style="font-size: 30px" width="300px">Edit</th>
		</tr>
		<tr height="5px">
		</tr>
		<c:forEach var="chucVu" items="${listChucVus}">
			<tr bgcolor="green">
				<th style="font-size: 30px">${chucVu.id}</th>
				<th style="font-size: 30px">${chucVu.maChucVu}</th>
				<th style="font-size: 30px">${chucVu.tenChucVu}</th>
				<th style="font-size: 30px">${chucVu.moTa}</th>
				<th style="font-size: 30px"><a href="/searchChucVu/${chucVu.id}">Chi Tiet</a><br></th> 
				<th style="font-size: 30px"><a href="/deleteByIdChucVu/${chucVu.id}">Delete Chuc Vu</a><br></th> 
			    <th style="font-size: 30px"><a href="/editByIdChucVu/${chucVu.id}">Edit Chuc Vu</a><br></th>
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