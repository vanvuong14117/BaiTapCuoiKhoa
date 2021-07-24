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

<form:form method="POST" action="/editByIdPhongBan" 
modelAttribute="phongBanEdit">

<label>ID:</label>
<input type="text" id="id" name="id" value="${phongBanEdit.id}"><br>
<label>Ma Phong Ban:</label>
<input type="text" id="machucvu" name="maPhongBan" value="${phongBanEdit.maPhongBan}"><br>
<label>Ten Phong Ban:</label>
<input type="text" id="tenchucvu" name="tenPhongBan" value="${phongBanEdit.tenPhongBan}"><br>
<label>Mo Ta:</label>
<input type="text" id="motachucvu" name="moTa" value="${phongBanEdit.moTa}"><br>
<input type="submit" value="Update">

</form:form>

</body>
</html>