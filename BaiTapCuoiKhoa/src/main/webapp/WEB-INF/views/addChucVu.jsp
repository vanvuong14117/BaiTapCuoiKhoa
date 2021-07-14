<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm sinh viên</title>
</head>
<body>
<form method="POST" action="saukhiaddChucVu" 
modelAttribute="userModelTranfer">

<label>Ma Chuc Vu:</label>
<input type="text" id="machucvu" name="maChucVu"><br>
<label>Ten Chuc Vu:</label>
<input type="text" id="tenchucvu" name="tenChucVu"><br>
<label>Note:</label>
<input type="text" id="note" name="moTa"><br>
<input type="submit" value="Save">

</form>

</body>
</html>