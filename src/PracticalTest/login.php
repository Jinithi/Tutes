<?php
$pagename="login"; 
echo "<title>".$pagename."</title>"; 
echo "<body>";

echo "<h4>".$pagename."</h4>"; 


echo "<form method=post action=login_process.php>" ;
echo "<table style='border: 0px'>";
echo "<tr><td style='border: 0px'>*User name </td>";
echo "<td style='border: 0px'><input type=text name=r_userName size=35></td></tr>";
echo "<tr><td style='border: 0px'>*Password </td>";
echo "<td style='border: 0px'><input type=password name=r_password1 maxlength=10 size=35></td></tr>";
echo "<td style='border: 0px'><input type=login value='Login' name='loginbtn' id='loginbtn'></td>";
echo "</tr>";
echo "</table>";
echo "</form>" ;
echo "</body>";
?>
