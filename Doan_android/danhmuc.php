<?php
    require'Connect.php';
class danhmuc
{
    function danhmuc($madanhmuc, $tendanhmuc,$hinhdanhmuc)
    {
        $this->madanhmuc = $madanhmuc;
        $this->tendanhmuc = $tendanhmuc;
        $this->hinhdanhmuc = $hinhdanhmuc;
    }
}

$truyvan = "select * from danhmuc";
$data = mysqli_query($Connect, $truyvan);
$mangdulieu = array();
//Đọc từng dòng
while ($row = mysqli_fetch_assoc($data)) {
    array_push($mangdulieu, new danhmuc($row["madanhmuc"], $row["tendanhmuc"],$row["hinhdanhmuc"]));

}

echo json_encode($mangdulieu);