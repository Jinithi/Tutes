<?php
$pagename="New Users to the system"; 

echo "<title>".$pagename."</title>"; 
echo "<body>";

echo "<h4>".$pagename."</h4>"; 



echo "<form method=post action=enter_process.php>" ;
echo "<table style='border: 0px'>";
echo "<tr><td style='border: 0px'>*Name </td>";
echo "<td style='border: 0px'><input type=text name=r_Name size=35></td></tr>";
echo "<tr><td style='border: 0px'>*mobile No </td>";
echo "<td style='border: 0px'><input type=text name=r_mobileno size=35></td></tr>";
echo "<tr><td style='border: 0px'>*Tel No </td>";
echo "<td style='border: 0px'><input type=text name=r_telno size=35></td></tr>";
echo "<tr><td style='border: 0px'>*Email Address </td>";
echo "<td style='border: 0px'><input type=text name=r_email size=35></td></tr>";
echo "<tr>";
echo "<td style='border: 0px'><input type=submit value='Sign Up' name='submitbtn' id='submitbtn'></td>";
echo "</tr>";
echo "</table>";
echo "</form>" ;


echo "</body>";
?>
