-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 27, 2023 at 02:43 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project_java2`
--

-- --------------------------------------------------------

--
-- Table structure for table `datamahasiswa_javac3`
--

CREATE TABLE `datamahasiswa_javac3` (
  `nama` varchar(50) NOT NULL,
  `nim` int(50) NOT NULL,
  `prodi` enum('IFSI','IFD3','IFRPL') NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datamahasiswa_javac3`
--

INSERT INTO `datamahasiswa_javac3` (`nama`, `nim`, `prodi`, `email`) VALUES
('asal', 123, 'IFSI', '123@gmail.com'),
('Mochamad Fajar AL Farizi', 21110002, 'IFSI', '21110002@stmik-mi.ac.id'),
('Husnul Khotimah', 21110192, 'IFSI', 'husnulkhotimah99897@gmail,com'),
('Anggita Angraeni', 21110349, 'IFSI', 'anggitaangraeni1@gmail.com'),
('Annur Marjabiah', 21110352, 'IFSI', 'annurmarjabiah@gmail.com'),
('Rendi Sutendi', 21110856, 'IFSI', '21110856@stmik-mi.ac.id');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` varchar(50) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
('001', 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datamahasiswa_javac3`
--
ALTER TABLE `datamahasiswa_javac3`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
