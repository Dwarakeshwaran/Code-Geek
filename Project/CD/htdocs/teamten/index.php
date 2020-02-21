<?php
$conn = new mysqli('localhost','root','','login');

$user_sql = "SELECT * FROM users";
$user_query = mysqli_query($conn,$user_sql);
$user_view = mysqli_fetch_assoc($user_query);

do{
	echo $user_view['username']; 

}while($user_view=mysqli_fetch_assoc($user_query))






?>