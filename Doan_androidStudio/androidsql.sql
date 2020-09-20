-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th8 22, 2020 lúc 02:45 AM
-- Phiên bản máy phục vụ: 10.4.13-MariaDB
-- Phiên bản PHP: 7.2.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `androidsql`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietsanpham`
--

CREATE TABLE `chitietsanpham` (
  `machitiet` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `masanpham` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `thongtinsanpham` varchar(1000) COLLATE utf8_unicode_ci NOT NULL,
  `gia` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `hinhsanpham` varchar(256) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietsanpham`
--

INSERT INTO `chitietsanpham` (`machitiet`, `masanpham`, `thongtinsanpham`, `gia`, `hinhsanpham`) VALUES
('m1', '1', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '17.990.000', 'acer1.png'),
('m10', '9', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '23.490.000', 'Dell02.png'),
('m11', '11', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '24.490.000', 'acer02.png'),
('m12', '12', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '25.490.000', 'acer03.png'),
('m13', '13', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '26.490.000', 'acer04.png'),
('m14', '14', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '27.490.000', 'acer04.png'),
('m15', '15', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '28.490.000', 'acer2.png'),
('m16', '16', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '29.490.000', 'acer3.png'),
('m17', '17', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '30.490.000', 'acer4.png'),
('m18', '18', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '31.490.000', '	\r\nacer04.png'),
('m2', '2', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '25.490.000.', 'acer2.png'),
('m3', '3', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '19.490.000', 'acer3.png'),
('m4', '4', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '29.290.000', 'acer4.png'),
('m5', '5', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '18.790.000', 'msi1.png'),
('m6', '6', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '21.990.000', 'msi2.png'),
('m7', '7', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '10.190.000', 'asus1.png'),
('m8', '8', '\r\nHệ điều hành	Win 10 bản quyền\r\nBộ vi xử lý	Intel Core i7 9750H 2.60 GHz up to 4.50 GHz, 12MB\r\nBộ nhớ Ram	16GB DDR4\r\nỔ đĩa cứng	512GB SSD\r\nMàn hình	15.6\" FHD IPS\r\nĐồ họa	NVIDIA GEFORCE RTX2060 6GB GDDR6\r\nKhe cắm mở rộng	2-in-1 SD Card Reader\r\nWifi	802.11 AC\r\nKeyboard + Mouse	\r\nKeyboard Laptop + Touchpad\r\nPin (Battery)	4 Cell\r\nÂm thanh	Waves MaxxAudio\r\nPhụ kiện kèm theo	Full box\r\nKích thước	23.7 (H) x 364.3 (W) x 273.4 (D) (mm)\r\nKhối lượng	2.68 kg\r\nBảo hành	12 tháng\r\nHãng sản xuất	DELL', '13.390.000', 'dell1.png');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `danhmuc`
--

CREATE TABLE `danhmuc` (
  `madanhmuc` int(11) NOT NULL,
  `tendanhmuc` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `hinhdanhmuc` varchar(30) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `danhmuc`
--

INSERT INTO `danhmuc` (`madanhmuc`, `tendanhmuc`, `hinhdanhmuc`) VALUES
(1, 'Asus', 'asuslogo.png'),
(2, 'MSI', 'msilogo.png'),
(3, 'ACER', 'acerlogo.png'),
(4, 'DELL', 'delllogo.png');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `masanpham` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tensanpham` varchar(50) CHARACTER SET utf8 NOT NULL,
  `gia` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `hinhsanpham` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `madanhmuc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`masanpham`, `tensanpham`, `gia`, `hinhsanpham`, `madanhmuc`) VALUES
('1', 'Acer', '17.990.000', 'acer1.png', 3),
('10', 'Acer', '23.490.000', 'acer01.png', 3),
('11', 'Acer', '24.490.000', 'acer02.png', 3),
('12', 'Acer', '25.490.000', 'acer03.png', 3),
('13', 'Acer', '26.490.000', 'acer04.png', 3),
('14', 'Acer', '27.490.000', 'acer04.png', 3),
('15', 'Acer', '28.490.000', 'acer2.png', 3),
('16', 'Acer', '29.490.000', 'acer3.png', 3),
('17', 'Acer', '30.490.000', 'acer4.png', 3),
('18', 'Acer', '31.490.000', 'acer04.png', 3),
('2', 'Acer', '19.000.000', 'acer2.png', 3),
('3', 'Acer', '19.490.000', 'acer3.png', 3),
('4', 'Acer', '29.290.000', 'acer4.png', 3),
('5', 'MSI ', '18.790.000', 'msi1.png', 2),
('6', 'MSI ', '21.990.000', 'msi2.png', 2),
('7', 'ASUS ', '10.190.000', 'asus1.png', 1),
('8', 'Dell ', '13.390.000', 'dell1.png', 4),
('9', 'Dell', '23.490.000', 'Dell02.png', 4);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `ID` int(11) NOT NULL,
  `HoTen` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `DiaChi` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `SDT` int(11) NOT NULL,
  `Email` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `MatKhau` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`ID`, `HoTen`, `DiaChi`, `SDT`, `Email`, `MatKhau`) VALUES
(22, 'nhat', 'Vn', 0, 'Nhat@Nhat.com', '123'),
(34, 'NQN', 'Viet Nam', 123456789, 'n', '1'),
(35, 'Cao Tri', 'Viet Nam', 1111, 'T', '1');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitietsanpham`
--
ALTER TABLE `chitietsanpham`
  ADD PRIMARY KEY (`machitiet`),
  ADD KEY `masanpham` (`masanpham`);

--
-- Chỉ mục cho bảng `danhmuc`
--
ALTER TABLE `danhmuc`
  ADD PRIMARY KEY (`madanhmuc`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`masanpham`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`ID`,`Email`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `danhmuc`
--
ALTER TABLE `danhmuc`
  MODIFY `madanhmuc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitietsanpham`
--
ALTER TABLE `chitietsanpham`
  ADD CONSTRAINT `chitietsanpham_ibfk_1` FOREIGN KEY (`masanpham`) REFERENCES `sanpham` (`masanpham`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
