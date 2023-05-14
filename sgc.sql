-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 11, 2023 at 04:45 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sgc`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `ID` bigint(20) NOT NULL,
  `ADRESS` varchar(255) DEFAULT NULL,
  `APELIDO` varchar(255) DEFAULT NULL,
  `BI` varchar(255) DEFAULT NULL,
  `DATA` varchar(255) DEFAULT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `PERFIL` varchar(255) DEFAULT NULL,
  `SENHA2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ID`, `ADRESS`, `APELIDO`, `BI`, `DATA`, `NOME`, `PERFIL`, `SENHA2`) VALUES
(51, 'Maputo', 'Baciquete', '123456c', '2023-05-11T00:34:48.109', 'Joao', 'Admin', '12345'),
(201, 'Maputo', 'Machava', '54327987c', '2023-05-11T16:26:07.615', 'Melgar', 'Admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `empcondominio`
--

DROP TABLE IF EXISTS `empcondominio`;
CREATE TABLE IF NOT EXISTS `empcondominio` (
  `ID` bigint(20) NOT NULL,
  `CATEGORIA` varchar(255) DEFAULT NULL,
  `DATA` varchar(255) DEFAULT NULL,
  `emp_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `emp_id` (`emp_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `empcondominio`
--

INSERT INTO `empcondominio` (`ID`, `CATEGORIA`, `DATA`, `emp_id`) VALUES
(151, 'Porteiro', '2023-05-11T02:19:20.846', 152),
(251, 'Porteiro', '2023-05-11T16:35:18.139', 252);

-- --------------------------------------------------------

--
-- Table structure for table `empregadosdom`
--

DROP TABLE IF EXISTS `empregadosdom`;
CREATE TABLE IF NOT EXISTS `empregadosdom` (
  `ID` bigint(20) NOT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `emp_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_EMPREGADOSDOM_emp_id` (`emp_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `empregdos`
--

DROP TABLE IF EXISTS `empregdos`;
CREATE TABLE IF NOT EXISTS `empregdos` (
  `ID` bigint(20) NOT NULL,
  `ADRESS` varchar(255) DEFAULT NULL,
  `APELIDO` varchar(255) DEFAULT NULL,
  `BI` varchar(255) DEFAULT NULL,
  `DATA` varchar(255) DEFAULT NULL,
  `DATA_NASC` varchar(255) DEFAULT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `PASS` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `empregdos`
--

INSERT INTO `empregdos` (`ID`, `ADRESS`, `APELIDO`, `BI`, `DATA`, `DATA_NASC`, `NOME`, `PASS`) VALUES
(152, 'MOAMBA', 'Matavele', '36576726763J', '2023-05-11T02:19:20.846', NULL, 'Terencio', '0000'),
(252, 'Maputo', 'Machava', '1234567c', '2023-05-11T16:35:18.139', NULL, 'Joao', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `financas`
--

DROP TABLE IF EXISTS `financas`;
CREATE TABLE IF NOT EXISTS `financas` (
  `ID` bigint(20) NOT NULL,
  `DATA` varchar(255) DEFAULT NULL,
  `PAGAMENTE` float DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `morador`
--

DROP TABLE IF EXISTS `morador`;
CREATE TABLE IF NOT EXISTS `morador` (
  `ID` bigint(20) NOT NULL,
  `APELIDO` varchar(255) DEFAULT NULL,
  `BI` varchar(255) DEFAULT NULL,
  `DATA` varchar(255) DEFAULT NULL,
  `DATA_NASC` int(11) DEFAULT NULL,
  `ENDERECO` varchar(255) DEFAULT NULL,
  `NOME` varchar(255) DEFAULT NULL,
  `SEXO` varchar(255) DEFAULT NULL,
  `TELEFONE` int(11) DEFAULT NULL,
  `TITULO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `recepcao`
--

DROP TABLE IF EXISTS `recepcao`;
CREATE TABLE IF NOT EXISTS `recepcao` (
  `ID` bigint(20) NOT NULL,
  `DATA` varchar(255) DEFAULT NULL,
  `HORAENT` varchar(255) DEFAULT NULL,
  `HORASAID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sequence`
--

DROP TABLE IF EXISTS `sequence`;
CREATE TABLE IF NOT EXISTS `sequence` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sequence`
--

INSERT INTO `sequence` (`SEQ_NAME`, `SEQ_COUNT`) VALUES
('SEQ_GEN', '600');

-- --------------------------------------------------------

--
-- Table structure for table `sindico`
--

DROP TABLE IF EXISTS `sindico`;
CREATE TABLE IF NOT EXISTS `sindico` (
  `ID` bigint(20) NOT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `apelido` varchar(255) DEFAULT NULL,
  `bi` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `perfil` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sindico`
--

INSERT INTO `sindico` (`ID`, `endereco`, `apelido`, `bi`, `data`, `nome`, `perfil`, `senha`) VALUES
(101, 'Matola', 'Ngovene', '5376422384L', '2023-05-11T01:50:49.820', 'Mario', 'Sindico', '12345'),
(301, '', '', '', '2023-05-11T16:48:23.610', '', 'Sindico', ''),
(302, '', '', '', '2023-05-11T16:48:28.171', '', 'Sindico', ''),
(303, '', '', '', '2023-05-11T16:48:31.967', '', 'Sindico', ''),
(351, '', '', '', '2023-05-11T16:51:21.505', '', 'Sindico', ''),
(401, '', '', '', '2023-05-11T16:53:59.313', '', 'Sindico', ''),
(451, '', '', '', '2023-05-11T16:57:54.955', '', 'Sindico', ''),
(501, '', '', '', '2023-05-11T17:33:16.469', '', 'Sindico', ''),
(551, '', '', '', '2023-05-11T17:35:56.739', '', 'Sindico', '');

-- --------------------------------------------------------

--
-- Table structure for table `veiculo`
--

DROP TABLE IF EXISTS `veiculo`;
CREATE TABLE IF NOT EXISTS `veiculo` (
  `ID` bigint(20) NOT NULL,
  `ANO` int(11) DEFAULT NULL,
  `COR` varchar(255) DEFAULT NULL,
  `DATA` varchar(255) DEFAULT NULL,
  `PLACA` varchar(255) DEFAULT NULL,
  `TIPO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
