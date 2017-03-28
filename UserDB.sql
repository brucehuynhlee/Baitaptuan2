-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 28, 2017 at 11:18 PM
-- Server version: 5.5.50-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `UserDB`
--

-- --------------------------------------------------------

--
-- Table structure for table `Users`
--

CREATE TABLE IF NOT EXISTS `Users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `age` int(8) NOT NULL,
  `email` varchar(30) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `pass_word` varchar(30) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `school` varchar(100) NOT NULL,
  `class_school` varchar(100) NOT NULL,
  `favourite` varchar(100) DEFAULT NULL,
  `archivement` varchar(100) NOT NULL,
  `research` varchar(200) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`user_name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=29 ;

--
-- Dumping data for table `Users`
--

INSERT INTO `Users` (`id`, `first_name`, `last_name`, `age`, `email`, `address`, `pass_word`, `user_name`, `school`, `class_school`, `favourite`, `archivement`, `research`) VALUES
(0, 'Nguyen', 'Huynh', 21, 'brucehuynhlee@gmail.com', 'Ha Noi', '1', '1', 'HUST', 'CNTT2.04', 'Sport', 'none', 'none'),
(2, 'Huá»³nh', 'Nguyá»?n', 12, 'bruceleemen@gmail.com', 'HÃ  Ná»?i', '123', 'brucelee', 'Bach Khoa', 'CNTT2.04', NULL, 'none', 'none'),
(22, 'Æ°Ãªw', 'ewew', 12, '2123433', '32434324', '23423423', 'ewew', '234234234', '234234', NULL, 'none', 'none'),
(23, 'Huynh', 'bruceleemen', 12, 'bruceleemen@gmail.com', 'HÃ  Ná»?i', '123', 'Nguyen', 'Bach Khoa', 'CNTT2.04', 'MMA', 'none', 'none'),
(24, 'Nguyen', 'namteo', 23, 'brucehuynhlee@gmail.com', 'homestead', 'secret', 'huynh', '3', '23', '2332', '2332', '2323'),
(25, 'Nguyen', 'f', 12, 'ff', 'homestead', 'secret', 'huynhfr', 'fff', 'ddd', 'ddd', 'wrwqre', 'wqrqwrq'),
(26, 'Huá»³nh', 'uá»³nh', 12, 'fdf', 'dfdfdf', '1', '1sassaa', 'dfdfdfdf', 'dfdfdfdf', 'dfdfdfdf', 'dfdfdfdf', 'none'),
(27, 'Huá»³nh', 'uá»³nh', 12, 'fdf', 'dfdfdf', '1', '1wqwqw', 'dfdfdfdf', 'dfdfdfdf', 'dfdfdfdf', 'dfdfdfdf', 'dfdfdfdfdf'),
(28, 'Nguyen', 'namteo', 23, 'brucehuynhlee@gmail.com', 'homestead', 'secret', 'werdwe', '3', '23', 'g', 'sdfds', 'dsfsd');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
