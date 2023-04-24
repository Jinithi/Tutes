<?php
include ("db.php"); 
$pagename="List of Users"; 

echo "<title>".$pagename."</title>";
echo "<body>";

echo "<h4>".$pagename."</h4>";

$SQL="select name from details";

$exeSQL=mysqli_query($conn, $SQL) or die (mysqli_error($conn));
echo "<table style='border: 0px'>";

while ($arrayp=mysqli_fetch_array($exeSQL))
{
echo "<tr>";

echo "<td style='border: 0px'>";
echo "<p><h5>".$arrayp['name']."</h5>"; 

echo "</td>";
echo "</tr>";
}
echo "</table>";

echo "</body>";
?>
