<?php
    require'Connect.php';
    $madm=$_GET['madm'];
class sanpham
{
    function sanpham($masanpham, $tensanpham, $gia,$hinhsanpham)
    {
        $this->masanpham = $masanpham;
        $this->tensanpham = $tensanpham;
        $this->gia=$gia;
        $this->hinhsanpham = $hinhsanpham;
    }
}

$truyvan = "select * from sanpham where madanhmuc=$madm";
$data = mysqli_query($Connect, $truyvan);
$mangdulieu = array();
//Đọc từng dòng
while ($row = mysqli_fetch_assoc($data)) {
    array_push($mangdulieu, new sanpham($row["masanpham"], $row["tensanpham"], $row["gia"], $row["hinhsanpham"]));

}

echo json_encode($mangdulieu);