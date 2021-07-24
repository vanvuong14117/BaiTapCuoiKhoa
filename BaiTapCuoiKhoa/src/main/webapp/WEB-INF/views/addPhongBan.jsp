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
<form method="POST" action="sauKhiAddPhongBan" 
modelAttribute="phongBanModelTranfer">

<label>Ma Phong Ban:</label>
<input type="text" id="maphongban" name="maPhongBan"><br>
<label>Ten Phong Ban:</label>
<input type="text" id="tenphongban" name="tenPhongBan"><br>
<label>Note:</label>
<input type="text" id="note" name="moTa"><br>
<input type="submit" value="Save">

</form>

</body>
</html>