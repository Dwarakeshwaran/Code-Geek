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

$ins_sql = "INSERT INTO users(username,password)
values('$username','$password')";


if(!mysqli_query($conn,$ins_sql)){
	echo 'Not inserted';
}	
else{
	echo 'inserted successfully';
}
?>