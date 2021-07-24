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
	<h1><u>Đây là danh sách Nhan Su:</u></h1>
	<table border="1">
		<tr bgcolor="#6666FF">
			<th style="font-size: 30px" width="100px">Id</th>
			<th style="font-size: 30px" width="200px">Ten Nhan Su</th>
			<th style="font-size: 30px" width="300px">Ngay Sinh</th>
			<th style="font-size: 30px" width="300px">Mo Ta</th>
			<th style="font-size: 30px" width="300px">Phong Ban</th>
			<th style="font-size: 30px" width="300px">Chuc vu</th>
			<th style="font-size: 30px" width="300px">Chi Tiet</th>
			<th style="font-size: 30px" width="300px">Delete</th>
			<th style="font-size: 30px" width="300px">Edit</th>
		</tr>
		<tr height="5px">
		</tr>
		<c:forEach var="nhanSu"   items="${listNhanSus}">
			<tr bgcolor="green">
				<th style="font-size: 50px">${nhanSu.id}</th>
				<th style="font-size: 50px">${nhanSu.ten}</th>
				<th style="font-size: 50px">${nhanSu.ngaysinh}</th>
				<th style="font-size: 50px">${nhanSu.cmt}</th>
				<th style="font-size: 30px">${nhanSu.chucVu.maChucVu}</th>
				<th style="font-size: 30px">${nhanSu.phongBan.maPhongBan}</th>
				<th style="font-size: 50px"><a href="/searchNhanSu/${nhanSu.id}">Details</a><br></th>
				<th style="font-size: 50px"><a href="/deleteByIdNhanSu/${nhanSu.id}">DeleteById</a><br></th>
			    <th style="font-size: 50px"><a href="/editByIdNhanSu/${nhanSu.id}">Edit</a><br></th>
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