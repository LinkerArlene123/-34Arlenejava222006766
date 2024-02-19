-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 09:53 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `linker_login`
--

-- --------------------------------------------------------

--
-- Table structure for table `registered people`
--

CREATE TABLE `registered people` (
  `ID` int(11) NOT NULL,
  `Names` varchar(50) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `E-mail` varchar(50) NOT NULL,
  `Phone number` varchar(15) NOT NULL,
  `Country` varchar(15) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `registered people`
--

INSERT INTO `registered people` (`ID`, `Names`, `Username`, `Gender`, `E-mail`, `Phone number`, `Country`, `Password`) VALUES
(8, 'ARLENE', 'LILI', 'female', 'INEZA@GMAIL.COM', '0783655462', 'RWANDA', '123'),
(9, 'linker', 'linker', 'female', 'arlene@gmail.com', '235566', 'BURUNDI', '123'),
(13, 'ineza linker arlene', 'ineza linker arlene', 'female', 'inezalinkera@gmail.com', '078365651', 'RWANDA', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `registered people`
--
ALTER TABLE `registered people`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `registered people`
--
ALTER TABLE `registered people`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
