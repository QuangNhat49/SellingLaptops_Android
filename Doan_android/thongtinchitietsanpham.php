<?php
    require'Connect.php';
    $masp=$_GET['masp'];
class chitietsanpham
{
    function chitietsanpham($masanpham,$tensanpham, $thongtinsanpham,$gia,$hinhsanpham)
    {
        $this->masanpham = $masanpham;
        $this->tensanpham = $tensanpham;
        $this->thongtinsanpham = $thongtinsanpham;
        $this->gia=$gia;
        $this->hinhsanpham=$hinhsanpham;
    }
}

$truyvan = "select * from chitietsanpham where masanpham=$masp";
$data = mysqli_query($Connect, $truyvan);
$mangdulieu = array();
//Đọc từng dòng
while ($row = mysqli_fetch_assoc($data)) {
    array_push($mangdulieu, new chitietsanpham($row["masanpham"],$row["tensanpham"] ,$row["thongtinsanpham"], $row["gia"],$row["hinhsanpham"]));

}

echo json_encode($mangdulieu);