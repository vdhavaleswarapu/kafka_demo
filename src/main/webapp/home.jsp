<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction Here!</title>
</head>
<body>
<form action="addTransaction">
<label for="senderID">Sender ID:</label><br>
<input type="text" name="senderID"><br>
<label for="receiverID">Receiver ID:</label><br>
<input type="text" name="receiverID"><br>
<label for="amt">Transaction Amount:</label><br>
<input type="int" name="amt"><br>
<label for="currency">Select currency:</label>
<select name="currency" id="currency">
  <option value="USD">USD</option>
  <option value="GBP">GBP</option>
  <option value="EUR">EUR</option>
</select><br>
<label for="key">PIN:</label><br>
<input type="password" name="key"><br>
<input type="submit"><br>
</form>
</body>
</html>