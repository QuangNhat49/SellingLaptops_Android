<?php

$con = mysqli_connect("localhost", "root", "", "androidsql");

$Email = $_POST["Email"];
$MatKhau = $_POST["MatKhau"];

$sql = "select * from taikhoan where Email = '$Email' and MatKhau = '$MatKhau'";
$result = mysqli_query($con, $sql);

if ($result->num_rows > 0)
    echo "Đăng nhập thành công";
else
    echo "Sai email hoặc mật khẩu";
