<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>${board} Update Form</h1>
		
		<form action="./${board}Update" method="post">
		  <div class="form-group">
		    <label for="title">Title:</label>
		    <input type="text" class="form-control" value="${dto.title}" id="title" name="title">
		    <input type="hidden" name="num" value="${dto.num}">
		  </div>
		  <div class="form-group">
		    <label for="writer">Writer:</label>
		    <input type="text" class="form-control" value="${dto.writer}" id="writer" name="writer">
		  </div>
		  <div class="form-group">
		    <label for="contents">Contentx:</label>
		    <textarea rows="5" cols="" class="form-control" name="contents">${dto.contents}</textarea>
		  </div>
		  
		  <button type="submit" class="btn btn-default">Update</button>
		</form>
		
	</div>

</body>
</html>