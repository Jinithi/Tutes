<?php
session_start();
include("db.php");
mysqli_report(MYSQLI_REPORT_OFF);

$pagename="PROCESS"; 
echo "<title>".$pagename."</title>"; 
echo "<body>";

echo "<h4>".$pagename."</h4>"; 

$fname=trim($_POST['r_name']);
$mobileno=trim($_POST['r_mobileno']);
$telno=trim($_POST['r_telno']);
$email=trim($_POST['r_email']);
$hobby=trim($_POST['r_hobby']);

//Write a SQL query to insert a new user into Users table 
$SQL="insert into details (name,email,personalNumber,Home)
values ('C','".$fname."', '".$mobileno."', '".$telno."', '".$email."')";

mysqli_query($conn, $SQL);


//Write SQL query to insert new user into users table and execute SQL query
$SQL="insert into details
(name, email, personalNumber, Home, personId, hobby)
values 
('C','".$fname."','".$email."','".$mobileno."','".$telno."','C', '".$hobby."')";



echo "</body>";
?>
