<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm Phong Ban</title>
</head>
<body>

<form:form method="POST" action="/editByIdNhanSu" 
modelAttribute="nhanSuEdit">
<label>ID:</label>
<input type="text" id="id" name="id" value="${nhanSuEdit.id}"><br>
<label>Ten Nhan Su:</label>
<input type="text" id="ten" name="ten" value="${nhanSuEdit.ten}"><br>
<label>Ngay Sinh:</label>
<input type="text" id="ngaysinh" name="ngaysinh"  value="${nhanSuEdit.ngaysinh}"><br>
<label>Note:</label>
<input type="text" id="cmt" name="cmt" value="${nhanSuEdit.cmt}"><br>
<label>Ma Phong Ban:</label>
<input type="text" id="phongban" name="maPhongBan" value="${nhanSuEdit.phongBan.maPhongBan}"><br>
<label>Ma Chuc Vu:</label>
<input type="text" id="chucvu" name="maChucVu" value="${nhanSuEdit.chucVu.maChucVu}"><br>

<input type="submit" value="Update">

</form:form>

</body>
</html>