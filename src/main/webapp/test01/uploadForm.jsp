<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="upload.do" method="post" enctype="multipart/form-data" accept-charset="UTF-8">
		파일 1 : <input type="file" name="file1"><br>
		파일 2 : <input type="file" name="file2"><br>
		매개변수 : <input type="text" name="param1"><br>
		<input type="submit" value="업로드">
	</form>
</body>
</html>