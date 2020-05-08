-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2020 at 01:49 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `finally`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `course` varchar(30) NOT NULL,
  `groups` varchar(30) NOT NULL,
  `school` varchar(30) NOT NULL,
  `typeMagic` varchar(30) NOT NULL,
  `login` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `surname`, `course`, `groups`, `school`, `typeMagic`, `login`, `password`) VALUES
(1, 'Tair', 'Ospanov', '3', 'warrior', '1_school', 'fire', 'Tako', '123'),
(2, 'Ruslan', 'Zhazikbaev', '1', 'magician', '1_school', 'dark', 'Overlord', '321'),
(3, 'Sanjar', 'Suranchinov', '2', 'magician', '2_school', 'shine', 'Stalker', '4567'),
(4, 'Kirito', 'Hachami', '3', 'warrior', '3_school', 'energy', 'swordsman', '987'),
(5, 'Naruto', 'Uzumaki', '1', 'warrior', '1_school', 'fire', 'DemonFox', '134679'),
(6, 'Vann', 'Rivera', '1', 'magician', '1_school', 'wind', 'Resport', 'szRYlq'),
(7, 'Sasuke', 'Uchiha', '1', 'warrior', '1_school', 'wind', 'Susano', 'qwert'),
(8, 'Elian', 'Simmons', '2', 'magician', '2_school', 'wind', 'ASD', '123'),
(9, 'River', 'King', '2', 'warrior', '2_school', 'null', 'Darknet', '456321'),
(10, 'Moses', 'Jones', '3', 'magician', '3_school', 'fire', 'GotRay', '789asd'),
(11, 'Hugo', 'Coleman', '2', 'magician', '2_school', 'fire', 'Naruto', 'asd987'),
(12, 'Titus', 'Young', '2', 'warrior', '2_school', 'earth', 'Super777', 'x02o5f'),
(13, 'Harper', 'Perez', '3', 'magician', '3_school', 'wind', 'Cka3o4Huk', '789632145');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
