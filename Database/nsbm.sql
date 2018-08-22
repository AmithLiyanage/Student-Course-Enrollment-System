-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 17, 2018 at 11:57 AM
-- Server version: 5.6.11
-- PHP Version: 5.5.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `nsbm`
--
CREATE DATABASE IF NOT EXISTS `nsbm` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `nsbm`;

-- --------------------------------------------------------

--
-- Table structure for table `instructor`
--

CREATE TABLE IF NOT EXISTS `instructor` (
  `InsID` int(5) NOT NULL AUTO_INCREMENT,
  `InsFullName` varchar(50) NOT NULL,
  `InsName` varchar(50) NOT NULL,
  `nic` varchar(11) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `qualifications` varchar(200) NOT NULL,
  `contactNo` int(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`InsID`),
  UNIQUE KEY `InsID` (`InsID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `instructor`
--

INSERT INTO `instructor` (`InsID`, `InsFullName`, `InsName`, `nic`, `gender`, `address`, `qualifications`, `contactNo`, `email`) VALUES
(1, 'Sarachandra Nayananga Chamudini', 'S.N.Chamudini', '886456789v', 'Female', 'jhkh  jhf jfgjk ', 'Bacholor of Computer Science(UCSC)', 779876543, 'chamudini@gmail.com'),
(2, 'hbhbhh', 'hgftyf', 'rtyy', 'Male', 'gh', 'hhh', 566, 'ggg');

-- --------------------------------------------------------

--
-- Table structure for table `lecturehall`
--

CREATE TABLE IF NOT EXISTS `lecturehall` (
  `hallID` varchar(6) NOT NULL,
  `hallName` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `capacity` int(11) NOT NULL,
  `note` int(11) DEFAULT NULL,
  PRIMARY KEY (`hallID`),
  UNIQUE KEY `hallID` (`hallID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

CREATE TABLE IF NOT EXISTS `lecturer` (
  `lecID` int(5) NOT NULL AUTO_INCREMENT,
  `lecFullName` varchar(50) NOT NULL,
  `LecName` varchar(50) NOT NULL,
  `nic` varchar(11) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `qualifications` varchar(100) NOT NULL,
  `contactNo` int(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `whatCoursesDo` varchar(200) NOT NULL,
  PRIMARY KEY (`lecID`),
  UNIQUE KEY `lecID` (`lecID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`lecID`, `lecFullName`, `LecName`, `nic`, `gender`, `address`, `qualifications`, `contactNo`, `email`, `whatCoursesDo`) VALUES
(3, 'Ahamad Mudianselage Hakeem Liyanage', 'A.M.H. Liyanage', '582345678v', 'Male', '2/23, Fathima Rd, Halawatha.', 'Bacholor of MIT(Bsc.University of Moratuwa)', 715643289, 'liyanage58@gmail.com', 'IT'),
(4, 'Arachchi jayamuni Jayantha', 'A.J.Jayantha', '672345678v', 'Male', '8/34, ekanayaka Rd, Colombo 10.', 'Bsc Honc, Bachalor of IT(University of Moratuwa)', 713456123, 'jayantha67@gmail.com', 'Computer Network'),
(6, 'hpopijog', 'gbjbfg', 'rfoiuyp9g', 'Famale', 'ghgv', 'gjijgvb', 3444, 'jojno', 'hophj'),
(9, 'hpopijog', 'hghhhhhhhhhhhhh', 'rfoiuyp9g', 'Male', 'ghgv', 'gjijgvb gthg', 3444777, 'jojno', 'hophj');

-- --------------------------------------------------------

--
-- Table structure for table `postgraduate_student`
--

CREATE TABLE IF NOT EXISTS `postgraduate_student` (
  `indexNo` int(7) NOT NULL,
  `qualificationType` varchar(50) NOT NULL,
  `institute` varchar(50) NOT NULL,
  `yearOfCompletion` int(4) NOT NULL,
  `status` varchar(10) NOT NULL,
  PRIMARY KEY (`indexNo`),
  UNIQUE KEY `indexNo` (`indexNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postgraduate_student`
--

INSERT INTO `postgraduate_student` (`indexNo`, `qualificationType`, `institute`, `yearOfCompletion`, `status`) VALUES
(1800021, 'Bsc(hons)', 'University of Moratuwa', 2016, 'Married'),
(1800024, 'rfer', 'ffggfv', 444, 'Unmarried'),
(1800030, 'ee', 'ggr', 2014, 'Unmarried'),
(1800031, 'rtrt', 'ggrg', 56, 'Married'),
(1800032, 'grg', 'grg', 45, 'Unmarried');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE IF NOT EXISTS `result` (
  `indexNo` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  `sub1` varchar(10) DEFAULT NULL,
  `sub2` varchar(10) DEFAULT NULL,
  `sub3` varchar(10) DEFAULT NULL,
  `sub4` varchar(10) DEFAULT NULL,
  `sub5` varchar(10) DEFAULT NULL,
  `sub6` varchar(10) DEFAULT NULL,
  `gpa` decimal(10,0) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `sendOrNot` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`indexNo`,`semester`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`indexNo`, `semester`, `sub1`, `sub2`, `sub3`, `sub4`, `sub5`, `sub6`, `gpa`, `email`, `sendOrNot`) VALUES
(1800037, 1, 'A', 'B', 'A', 'B+', 'A-', 'A-', '2', 'amith.liyanage.9@gmail.com', 'Yes'),
(1800037, 2, 'A-', 'B+', 'A', 'A', 'A-', 'A-', '4', 'amith.liyanage.9@gmail.com', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `indexNo` int(7) NOT NULL AUTO_INCREMENT,
  `nameWithInitial` varchar(30) NOT NULL,
  `fullName` varchar(100) NOT NULL,
  `faculty` varchar(50) NOT NULL,
  `nic` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `address` varchar(100) NOT NULL,
  `contactNo` int(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `year` int(4) NOT NULL,
  `batch` varchar(20) NOT NULL,
  `courseType` varchar(50) NOT NULL,
  PRIMARY KEY (`indexNo`),
  UNIQUE KEY `indexNo` (`indexNo`),
  KEY `indexNo_2` (`indexNo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1800038 ;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`indexNo`, `nameWithInitial`, `fullName`, `faculty`, `nic`, `gender`, `address`, `contactNo`, `email`, `year`, `batch`, `courseType`) VALUES
(1800021, 'A.J.Shihan Dinuka', 'Athukoralage Jayalath Shihan Dinuka', 'School of Engineering', '861234567v', 'Male', '2/25, Gamini Mw, Dikwella, Matara.', 771234567, 'shihan.dinuka@gmail.com', 2020, 'July', 'Postgraduate Student'),
(1800022, 'R.A.Sahan Gamage', 'Rangamge Ariyasiri Sahan Gamage', 'School of Computing', '964667756v', 'Male', '"Gemunu", Pansala Para, Maharagama', 712345678, 'sahan.gamage86@gmail.com', 2018, 'July', 'Undergraduate Student'),
(1800023, 'cb nc', 'vbggg', 'School of Business', '111111111', 'Male', 'gggg', 444, 'gbggg', 2019, 'February', 'Undergraduate Student'),
(1800024, 'hgyfg', 'guhg', 'School of Business', 'r,jgg', 'Famale', 'ggrg', 434444, 'rfefre', 2018, 'February', 'Postgraduate Student'),
(1800026, 'dfrrtr', 'fgggg', 'School of Business', 'ggg', 'Male', 'ggg', 44, 'gggg', 2018, 'February', 'Undergraduate Student'),
(1800027, 'fkgf', 'gkhvg', 'School of Computing', 'gg', 'Famale', 'ggg', 45, 'gdgd', 2020, 'July', 'Undergraduate Student'),
(1800028, 'B.M.Manorathna', 'Binuri Maleesha', 'School of Computing', '954634689V', 'Famale', '11th Mile post,\nElpitiya.', 700565832, 'binubinuri@gmail.com', 2018, 'February', 'Undergraduate Student'),
(1800029, 'S.I.N.Fernando', 'Siyambalapitiyage Isuru Nimantha Fernando', 'School of Business', '970152636V', 'Male', 'Sumudu Sewana,\nMaikkulama,\nChilaw	', 717538781, 'isurunimantha1@gmail.com', 2018, 'February', 'Undergraduate Student'),
(1800030, 'ff', 'gfgf', 'School of Engineering', 'g4r4', 'Famale', 'bfgfg', 34434, 'gggf', 2021, 'July', 'Postgraduate Student'),
(1800031, 'reer', 'effefe', 'School of Engineering', 'fedef', 'Male', 'rgfgrfg', 45554, 'frt', 2018, 'February', 'Postgraduate Student'),
(1800032, 'fef', 'fdf', 'School of Business', 'vvd', 'Famale', 'vddv', 232344, 'ggfgrg', 2018, 'February', 'Postgraduate Student'),
(1800033, 'ytjt', 'mxs', 'School of Business', '78136763', 'Male', 'xghaj', 282186, 'ajhxga', 2018, 'February', 'Undergraduate Student'),
(1800037, 'kjdk', 'Lanka RATHNAYAKA', 'School of Business', '093456789V', 'Male', 'DFDFDF', 1234567890, 'rmllbrathnayaka@gmail.com', 2019, 'February', 'Undergraduate Student');

-- --------------------------------------------------------

--
-- Table structure for table `student_degree`
--

CREATE TABLE IF NOT EXISTS `student_degree` (
  `indexNo` int(11) NOT NULL,
  `semester` int(11) NOT NULL,
  `sub1` varchar(11) NOT NULL,
  `sub2` varchar(11) NOT NULL,
  `sub3` varchar(11) NOT NULL,
  `sub4` varchar(11) NOT NULL,
  `sub5` varchar(11) NOT NULL,
  `sub6` varchar(11) NOT NULL,
  `sub7` varchar(11) DEFAULT NULL,
  `fees` int(5) NOT NULL,
  `payedOrNot` varchar(10) DEFAULT 'No',
  PRIMARY KEY (`indexNo`,`semester`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_degree`
--

INSERT INTO `student_degree` (`indexNo`, `semester`, `sub1`, `sub2`, `sub3`, `sub4`, `sub5`, `sub6`, `sub7`, `fees`, `payedOrNot`) VALUES
(1800037, 1, 'MGT 1101', 'MGT 1102', 'MGT 1103', 'MGT 1104', 'MGT 1105', 'MGT 1107', '', 20300, 'No'),
(1800037, 2, 'MGT 1201', 'MGT 1202', 'MGT 1203', 'MGT 1204', 'MGT 1205', 'MGT 1206', '', 18500, 'No');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE IF NOT EXISTS `subject` (
  `subjectID` varchar(20) NOT NULL,
  `subjectName` varchar(50) NOT NULL,
  `degree` varchar(50) NOT NULL,
  `year` int(11) DEFAULT NULL,
  `semester` int(11) DEFAULT NULL,
  `fees` int(4) NOT NULL,
  `lecturer` varchar(50) NOT NULL,
  `instructors` varchar(100) NOT NULL,
  `timeSchedule` varchar(50) NOT NULL,
  `noOfAssignment` int(3) NOT NULL,
  `credit` int(3) NOT NULL,
  `compulsoryOrNot` varchar(20) NOT NULL,
  `placeLecture` varchar(50) DEFAULT NULL,
  `placePractical` varchar(50) DEFAULT NULL,
  `note` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`subjectID`),
  UNIQUE KEY `subjectID` (`subjectID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`subjectID`, `subjectName`, `degree`, `year`, `semester`, `fees`, `lecturer`, `instructors`, `timeSchedule`, `noOfAssignment`, `credit`, `compulsoryOrNot`, `placeLecture`, `placePractical`, `note`) VALUES
('MGT 1101', 'Management Process', 'CS', 1, 1, 2500, 'A.M.H.Liyanage', 'S.N.Chamudini', '2h x 40', 1, 2, 'Compulsory', 'E001', '', ''),
('MGT 1102', 'Business Communication', 'CS', 1, 1, 2500, 'R.T.M.Kulathilaka', 'S.H.P.Bandara', '2h x 40', 4, 2, 'Compulsory', 'S002', 'hgh', 'fbbbb'),
('MGT 1103', 'Financial Accounting', 'CS', 1, 1, 2800, 'fgfgg', 'fffg', '2h x 40', 5, 3, 'Compulsory', '', '', ''),
('MGT 1104', 'Economics for managers', 'CS', 1, 1, 3000, 'gfg', 'ggg', '1h x 40', 3, 2, 'Compulsory', '', '', ''),
('MGT 1105', 'Business Mathematics and Statistics', 'CS', 1, 1, 3500, 'uuy5t', '4ttt', 'ggg', 5, 3, 'Compulsory', '', '', ''),
('MGT 1107', 'Subject 1', 'CS', 1, 1, 3000, 'ggg', 'bbg', 'gg', 4, 3, 'Optional', '', '', ''),
('MGT 1108', 'Subject 2', 'CS', 1, 1, 3000, 'rer', 'rer', 'rgg', 4, 3, 'Optional', '', '', ''),
('MGT 1201', 'Managerial Mathematics and Statistics', 'CS', 1, 2, 3500, 'ggg', 'ggfff', 'hhhhg', 3, 3, 'Compulsory', '', '', ''),
('MGT 1202', 'Information and Communication Technology (ICT)', 'CS', 1, 2, 2500, 'ggr', 'bbfb', 'ggg', 2, 2, 'Compulsory', '', '', ''),
('MGT 1203', 'Business Envoironment', 'CS', 1, 2, 2800, 'gg', 'ggg', 'fef', 5, 2, 'Compulsory', '', '', ''),
('MGT 1204', 'Introduction to Project Mangement', 'CS', 1, 2, 3000, 'hjkgg', 'gklg', 'ggg', 4, 3, 'Compulsory', 'rrf', '', ''),
('MGT 1205', 'Critical Enable Skills Training', 'CS', 1, 2, 4000, 'hjjj', 'hjjj', 'fyhhh', 3, 3, 'Compulsory', '', '', ''),
('MGT 1206', 'Subject 3', 'CS', 1, 2, 2700, 'hbhbb', 'fff', 'fff', 4, 2, 'Optional', '', '', ''),
('MGT 1207', 'Subject 4', 'CS', 1, 2, 2700, 'ggf', 'ggg', 'fgg', 4, 2, 'Optional', '', '', ''),
('UIS 1101', 'Organizational Behaviour', 'IS', 1, 1, 2500, 'hhyhf', 'gkg', 'gggghg', 4, 2, 'Compulsory', '', '', ''),
('UIS 1102', 'Professional Development', 'IS', 1, 1, 2700, 'gygiv', 'bhohvf', 'flknjcfk', 6, 3, 'Compulsory', '', '', ''),
('UIS 1103', 'Marketing Management', 'IS', 1, 1, 3000, 'ijljfjf', 'vgkjg', 'gggg', 3, 2, 'Compulsory', '', '', ''),
('UIS 1104', 'Advanced Financial accounting', 'IS', 1, 1, 3200, 'bdhgfkh', 'jfgjjg', 'bhj', 2, 3, 'Compulsory', '', '', ''),
('UIS 1105', 'Logistics Management', 'IS', 1, 1, 2800, 'fff', 'bvdf', 'vbfb', 4, 2, 'Compulsory', '', '', ''),
('UIS 1106', 'Subject 5', 'IS', 1, 1, 2000, 'fgg', 'grg', 'ggg', 3, 3, 'Optional', '', '', ''),
('UIS 1107', 'Subject 6', 'IS', 1, 1, 3000, 'khg', 'ffff', 'fggvg', 2, 3, 'Optional', '', '', ''),
('UIS 1201', 'Financial Management', 'IS', 1, 2, 3000, 'gfggd', 'gssf', 'sfff', 2, 3, 'Compulsory', '', '', ''),
('UIS 1202', 'Human Resource Management', 'IS', 1, 2, 2700, 'hjhcf', 'fjkbjf', 'ffff', 5, 2, 'Compulsory', '', '', ''),
('UIS 1203', 'Quality Management', 'IS', 1, 2, 3200, 'ddwd', 'sdf', 'dsff', 4, 3, 'Compulsory', '', '', ''),
('UIS 1204', 'Introduction to Operations Management', 'IS', 1, 2, 4000, 'gfd', 'gsfg', 'erf', 6, 3, 'Compulsory', '', '', ''),
('UIS 1205', 'Industrial Relations', 'IS', 1, 2, 2500, 'vvvdv', 'dff', 'fff', 4, 2, 'Compulsory', '', '', ''),
('UIS 1206', 'Subject 7', 'IS', 1, 2, 3000, 'grgr', 'grg', 'grf', 3, 2, 'Optional', '', '', ''),
('UIS 1207', 'Subject 8', 'IS', 1, 2, 3000, 'grfe', 'fr', 'rggg', 3, 2, 'Optional', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `undergraduate_student`
--

CREATE TABLE IF NOT EXISTS `undergraduate_student` (
  `indexNo` int(7) NOT NULL DEFAULT '0',
  `year` int(4) DEFAULT NULL,
  `shy` varchar(10) DEFAULT NULL,
  `subject1` varchar(50) DEFAULT NULL,
  `subject2` varchar(50) DEFAULT NULL,
  `subject3` varchar(50) DEFAULT NULL,
  `generalEnglish` varchar(2) DEFAULT NULL,
  `zScore` double(5,4) DEFAULT NULL,
  PRIMARY KEY (`indexNo`),
  UNIQUE KEY `indexNo` (`indexNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduate_student`
--

INSERT INTO `undergraduate_student` (`indexNo`, `year`, `shy`, `subject1`, `subject2`, `subject3`, `generalEnglish`, `zScore`) VALUES
(1800022, 2016, '2nd Shy', 'A - Maths', 'B - Chemistry', 'B - Physics', 'C', 1.6789),
(1800023, 34, '1st Shy', 'A - ff', 'A - gg', 'A - gg', 'A', 2.1234),
(1800027, 56, '2nd Shy', 'A - grg', 'A - grg', 'A - gf', 'A', 2.3466),
(1800028, 2015, '2nd Shy', 'B - Maths', 'C - Physics', 'B - Chemistry', 'B', 1.3956),
(1800029, 2015, '1st Shy', 'A - Combined maths', 'A - chemistry', 'A - physics', 'A', 2.1999),
(1800033, 2122, '1st Shy', 'A - xschs', 'A - xajsj', 'A - xmnas', 'A', 2.4052),
(1800037, 2015, '1st Shy', 'B - w', 'C - e', 'S - r', 'A', 1.2345);

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

CREATE TABLE IF NOT EXISTS `user_login` (
  `user_ID` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`user_ID`),
  UNIQUE KEY `user_ID` (`user_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`user_ID`, `type`, `password`) VALUES
('1800021', 'Student', '123'),
('1800022', 'Student', 'qwert'),
('1800023', 'Student', 'tyu'),
('1800028', 'Student', '123'),
('1800029', 'Student', 'isuru123'),
('1800032', 'Student', '1234'),
('1800033', 'Student', '1234'),
('1800034', 'Student', '12345'),
('1800037', 'Student', 'lanka'),
('nsbmAdmin', 'Admin', '@qpwoeiRTYU');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
