<?php
require 'Connect.php';
class sanpham
{
    function sanpham($masanpham, $hinhsanpham, $gia, $thongtinsanpham)
    {
        $this->masanpham = $masanpham;
        $this->hinhsanpham = $hinhsanpham;
        $this->gia = $gia;
        $this->thongtinsanpham = $thongtinsanpham;
    }
}

$truyvan = "select masanpham,hinhsanpham,gia,thongtinsanpham from chitietsanpham";
$data = mysqli_query($Connect, $truyvan);
$mangdulieu = array();
//Đọc từng dòng
while ($row = mysqli_fetch_assoc($data)) {
    array_push($mangdulieu, new sanpham($row["masanpham"], $row["hinhsanpham"], $row["gia"], $row["thongtinsanpham"]));
}
echo json_encode($mangdulieu);
