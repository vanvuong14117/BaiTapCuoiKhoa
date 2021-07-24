<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm Chuc Vu</title>
</head>
<body>

<form:form method="POST" action="/editByIdChucVu" 
modelAttribute="chucVuEdit">

<label>ID:</label>

<input type="text" id="id" name="id" value="${chucVuEdit.id}" readonly><br>
<label>Ma Chuc Vu:</label>
<input type="text" id="machucvu" name="maChucVu" value="${chucVuEdit.maChucVu}"><br>
<label>Ten Chuc Vu:</label>
<input type="text" id="tenchucvu" name="tenChucVu" value="${chucVuEdit.tenChucVu}"><br>
<label>Mo Ta:</label>
<input type="text" id="motachucvu" name="moTa" value="${chucVuEdit.moTa}"><br>
<input type="submit" value="Update">

</form:form>

</body>
</html>