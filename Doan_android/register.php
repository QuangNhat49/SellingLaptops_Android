<?php

$con = mysqli_connect("localhost", "root", "", "androidsql");

$HoTen = $_POST["HoTen"];
$DiaChi = $_POST["DiaChi"];
$SDT = $_POST["SDT"];
$Email = $_POST["Email"];
$MatKhau = $_POST["MatKhau"];

$sql = "insert into taikhoan(HoTen, DiaChi, SDT, Email, MatKhau) value ('$HoTen', '$DiaChi', '$SDT', '$Email', '$MatKhau')";
$result = mysqli_query($con, $sql);

if ($result)
    echo "Đăng kí thành công";
else
    echo "Lỗi";