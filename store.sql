-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 01, 2021 at 01:32 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `store`
--

-- --------------------------------------------------------

--
-- Table structure for table `expense`
--

DROP TABLE IF EXISTS `expense`;
CREATE TABLE IF NOT EXISTS `expense` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `productid` varchar(255) DEFAULT NULL,
  `qty` double DEFAULT NULL,
  `unitprice` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expense`
--

INSERT INTO `expense` (`id`, `name`, `productid`, `qty`, `unitprice`) VALUES
(1, 'Shirt', 'A100', 10, 5000),
(2, 'Pen', 'A300', 50, 1000),
(3, 'Eraser', 'A400', 40, 5000),
(4, 'Trouser', 'A600', 50, 50000);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(7),
(7);

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
CREATE TABLE IF NOT EXISTS `invoice` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `productid` varchar(255) DEFAULT NULL,
  `qty` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `unitprice` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`id`, `name`, `productid`, `qty`, `total`, `unitprice`) VALUES
(3, 'Shirt', 'A100', 2, 10000, 5000),
(4, 'Belt', 'A789', 20, 10000, 500),
(5, 'Laptop', 'A564', 20, 600000, 30000),
(6, 'Trouser', 'A600', 2, 100000, 50000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
