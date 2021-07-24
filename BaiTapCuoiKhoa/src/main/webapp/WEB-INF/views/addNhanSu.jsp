<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm Nhan Su</title>
</head>
<body>
<form method="POST" action="sauKhiAddNhanSu" 
modelAttribute="nhanSuModelTranfer">

<label>Ten Nhan Su:</label>
<input type="text" id="ten" name="ten"><br>
<label>Ngay Sinh:</label>
<input type="text" id="ngaysinh" name="ngaysinh"><br>
<label>Note:</label>
<input type="text" id="cmt" name="cmt"><br>
<label>Ma Phong Ban:</label>
<input type="text" id="phongban" name="maPhongBan"><br>
<label>Ma Chuc Vu:</label>
<input type="text" id="chucvu" name="maChucVu"><br>
<input type="submit" value="Save">

</form>

</body>
</html>