<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<<<<<< HEAD
=======
<<<<<<< HEAD
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rabbitmq</title>
</head>
<body>
	<h1>Rabbitmq initiated</h1>
	<h3>Generated 2 Connections</h3>
	<h3>6 Chanels 1 Exchage and 2 Que</h3>
</body>
</html>
=======
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>RabbitMQ</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: white;
            color: black;
            padding: 20px;
            margin: 0;
        }
        h1 {
            color: black;
        }
        h3 {
            color: black;
        }
    </style>
</head>
<body>
    <%
        int connections = (int) (Math.random() * 10) + 1;
        int channels = (int) (Math.random() * 10) + 1;
        int exchange = (int) (Math.random() * 10) + 1;
        int queues = (int) (Math.random() * 10) + 1;
    %>
    <h1>RabbitMQ Initiated</h1>
    <h3>Generated <%= connections %> Connections</h3>
    <h3><%= channels %> Channels, <%= exchange %> Exchange, and <%= queues %> Queues</h3>
</body>
</html>
<<<<<<< HEAD
=======
>>>>>>> 79694ff (Initial commit for terraform-project)
>>>>>>> a53f6c76848e2a3a1cc8af878ad2e32e5c2ff85a
