<?php

$conn = new mysqli('localhost','root','','login');

if($conn->connect_error){
	die('connection failed');
}
else{
	echo "connection successful";
}

$username = $_POST['username'];
$password = $_POST['password'];

$conn_sql = "SELECT * FROM users WHERE username='$username' AND password = '$password' ";
$res = mysqli_query($conn,$conn_sql);


if(isset($_POST['username']) && isset($_POST['password'])){

	if($_POST['username'] == $username && $_POST['password'] == $password)
	{header('location: index.php');}
}

?>