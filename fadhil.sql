-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2023 at 10:48 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fadhil`
--

-- --------------------------------------------------------

--
-- Table structure for table `acc`
--

CREATE TABLE `acc` (
  `id` int(11) NOT NULL,
  `no_beli` varchar(30) NOT NULL,
  `kodea` varchar(20) NOT NULL,
  `j_beli` int(30) NOT NULL,
  `tgl_beli` date NOT NULL,
  `kodesup` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `acc`
--

INSERT INTO `acc` (`id`, `no_beli`, `kodea`, `j_beli`, `tgl_beli`, `kodesup`) VALUES
(13, 'FCH001', 'AKU008', 4, '2023-12-14', 'supp008'),
(14, 'FCH002', 'AKU007', 2, '2023-12-14', 'supp008'),
(15, 'FCH003', 'AKU009', 1, '2023-12-15', 'supp008'),
(16, 'FCH004', 'AKU005', 1, '2023-12-15', 'supp009'),
(17, 'FCH005', 'AKU001', 4, '2023-12-16', 'supp002'),
(18, 'FCH006', 'aku004', 6, '2023-12-16', 'supp008'),
(19, 'FCH007', 'AKU005', 5, '2023-12-17', 'supp009'),
(20, 'FCH008', 'AKU007', 8, '2023-12-18', 'supp011'),
(21, 'FCH009', 'AKU002', 8, '2023-12-19', 'supp011'),
(22, 'FCH010', 'AKU011', 5, '2023-12-20', 'supp011');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `nama_depan` varchar(100) NOT NULL,
  `nama_belakang` varchar(100) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `nama_depan`, `nama_belakang`, `username`, `password`) VALUES
(8, 'Fadhil  Cahya ', 'Hilmi', 'hilmiCy', 'admin'),
(9, 'Fadhil Ganteng', 'Banget', 'Fadhilgtg', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `master`
--

CREATE TABLE `master` (
  `kode_barang` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `harga_beli` int(11) NOT NULL,
  `harga_jual` int(11) NOT NULL,
  `stok` int(11) NOT NULL,
  `saham` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `master`
--

INSERT INTO `master` (`kode_barang`, `nama`, `harga_beli`, `harga_jual`, `stok`, `saham`) VALUES
('aku001', 'VIVO X100', 5000000, 6000000, 24, 120000000),
('aku002', 'VIVO X200', 6000000, 7000000, 40, 240000000),
('aku003', 'Realme gt 10 pro', 5000000, 6000000, 49, 245000000),
('aku004', 'Pocophone F6', 4000000, 5000000, 20, 80000000),
('aku005', 'Samsung S25', 20000000, 23000000, 10, 200000000),
('aku006', 'Iphone 5 Pro', 1500000, 2000000, 8, 12000000),
('aku007', 'Iphone 6 Pro', 2000000, 2500000, 20, 40000000),
('aku008', 'Iphone 7 Pro', 4000000, 5000000, 9, 36000000),
('aku009', 'Xiaomi 14 Pro', 10000000, 12000000, 6, 60000000),
('aku010', 'Infinix Note 30', 3000000, 3200000, 3, 9000000),
('aku011', 'Sony Experia X5', 4000000, 4500000, 10, 40000000);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `no_identitas` varchar(20) NOT NULL,
  `j_identitas` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `jk` varchar(10) NOT NULL,
  `nohp` varchar(13) NOT NULL,
  `tgl_plg` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`no_identitas`, `j_identitas`, `nama`, `alamat`, `jk`, `nohp`, `tgl_plg`) VALUES
('327504', 'KTP', 'Fadhil Cahya Hilmi', 'Bekasi', 'Laki-Laki', '08123', '2023-12-01'),
('327505', 'KTP', 'Rendy Simolarang', 'Jakarta', 'Laki-Laki', '08124', '2023-12-01'),
('327506', 'KTP', 'Alice Attaraxia', 'Tangerang Selatan', 'Perempuan', '08125', '2023-12-02'),
('327507', 'KTP', 'Alucard', 'Depok', 'Laki-Laki', '08126', '2023-12-02'),
('327508', 'KTP', 'Ryuhi Utomo', 'Depok', 'Laki-Laki', '08127', '2023-12-03'),
('327509', 'KTP', 'Rauf Simalakama', 'Depok', 'Laki-Laki', '08128', '2023-12-03'),
('327510', 'KTP', 'Joko Widodo', 'Garut', 'Laki-Laki', '08129', '2023-12-04'),
('327511', 'SIM', 'Kratos', 'Garut', 'Laki-Laki', '08130', '2023-12-04'),
('327512', 'KTP', 'Nida N.', 'Tasikmalaya', 'Perempuan', '08131', '2023-12-05'),
('327513', 'KTP', 'Danny Bungai', 'Palembang', 'Laki-Laki', '08132', '2023-12-06'),
('327514', 'KTP', 'Fanny Raskia', 'Bali', 'Perempuan', '08133', '2023-12-06'),
('327515', 'KTP', 'Uranus R.', 'Bekasi', 'Laki-Laki', '08134', '2023-12-07');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `id` int(11) NOT NULL,
  `kodea` varchar(30) NOT NULL,
  `qty` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `tgl_jual` date NOT NULL,
  `profit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`id`, `kodea`, `qty`, `total`, `tgl_jual`, `profit`) VALUES
(1, 'H1H2H3', 1, 20999999, '2023-12-02', 999999),
(2, 'H1H2H3', 1, 20999999, '2023-12-08', 999999),
(3, 'aku002', 4, 28000000, '2023-12-09', 4000000),
(4, 'aku002', 5, 35000000, '2023-12-09', 0),
(5, 'aku002', 5, 35000000, '2023-12-09', 5000000),
(6, 'aku002', 5, 35000000, '2023-12-10', 5000000),
(7, 'aku002', 3, 21000000, '2023-12-10', 3000000),
(8, 'AKU005', 2, 46000000, '2023-12-14', 6000000),
(9, 'aku006', 1, 2000000, '2023-12-14', 500000),
(10, 'aku006', 1, 2000000, '2023-12-15', 500000),
(11, 'aku004', 6, 30000000, '2023-12-15', 6000000),
(12, 'aku010', 2, 6400000, '2023-12-15', 400000);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `kode_supplier` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `notelp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`kode_supplier`, `nama`, `alamat`, `notelp`) VALUES
('supp001', 'Fadhil Tech', 'Bekasi', '082156'),
('supp002', 'karya Tech', 'Yogya', '0821421'),
('supp003', 'Fadhil reyy', 'Jakarta', '081245'),
('supp004', 'ready tech', 'Solo', '081245'),
('supp005', 'Kratos Company', 'Bekasi', '081353'),
('supp006', 'Most Wanted Elektronik', 'Bekasi', '081354'),
('supp007', 'Xiaomi Indonesia', 'Batam', '02183'),
('supp008', 'Poco Indonesa', 'Batam', '02184'),
('supp009', 'Samsung Indonesia', 'Jogja', '02178'),
('supp010', 'Infinix Indonesia', 'Batam', '021257'),
('supp011', 'Yurian Elektronik', 'Jakarta', '0215446');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acc`
--
ALTER TABLE `acc`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `master`
--
ALTER TABLE `master`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`no_identitas`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`kode_supplier`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `acc`
--
ALTER TABLE `acc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
