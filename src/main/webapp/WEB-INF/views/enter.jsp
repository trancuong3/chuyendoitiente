<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chuyển đổi tiền tệ</title>
</head>
<body>
<form action="currency" method="post">
    <label for="rate">Tỉ giá USD/VND:</label>
    <input type="number" id="rate" name="rate" step="0.01" required><br>

    <label for="usd">Số tiền USD:</label>
    <input type="number" id="usd" name="usd" step="0.01" required><br>

    <button type="submit">Chuyển đổi</button>
</form>
</body>
</html>
