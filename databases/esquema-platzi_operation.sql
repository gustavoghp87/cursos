-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: platzi_operation
-- ------------------------------------------------------
-- Server version	5.7.29-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `authors`
--

DROP TABLE IF EXISTS `authors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authors` (
  `author_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `nationality` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`author_id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authors`
--

LOCK TABLES `authors` WRITE;
/*!40000 ALTER TABLE `authors` DISABLE KEYS */;
INSERT INTO `authors` VALUES (1,'Gabriel García Márquez','COL'),(2,'Juan Rulfo','MEX'),(3,'Juan Gabriel Vasquez','COL'),(4,'Isabel Allende 1','CHI'),(5,'Isabel Allende 2','ARG'),(6,'Isabel Allende 3','URU'),(7,'Isabel Allende 4','BRA'),(16,'Pablo Neruda',NULL),(17,'Gabriel García Márquez','COL'),(18,'Juan Rulfo','MEX'),(19,'Juan Gabriel Vasquez','COL'),(20,'Isabel Allende 1','CHI'),(21,'Isabel Allende 2','ARG'),(22,'Isabel Allende 3','URU'),(23,'Isabel Allende 4','BRA'),(24,'Gabriel García Márquez','COL'),(25,'Juan Rulfo','MEX'),(26,'Juan Gabriel Vasquez','COL'),(27,'Isabel Allende 1','CHI'),(28,'Isabel Allende 2','ARG'),(29,'Isabel Allende 3','URU'),(30,'Isabel Allende 4','BRA'),(31,'Pablo Neruda2',NULL),(32,'Gabriel García Márquez','COL'),(33,'Juan Rulfo','MEX'),(34,'Juan Gabriel Vasquez','COL'),(35,'Isabel Allende 1','CHI'),(36,'Isabel Allende 2','ARG'),(37,'Isabel Allende 3','URU'),(38,'Isabel Allende 4','BRA'),(39,'Pablo Neruda2',NULL),(40,'Octavio Paz','CHI');
/*!40000 ALTER TABLE `authors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `books` (
  `book_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `author_id` int(10) unsigned DEFAULT NULL,
  `title` varchar(100) NOT NULL,
  `year` int(10) unsigned NOT NULL DEFAULT '1900',
  `language` varchar(2) NOT NULL DEFAULT 'es' COMMENT 'ISO 639-1 Language',
  `cover_url` varchar(500) DEFAULT NULL,
  `price` double(6,2) NOT NULL DEFAULT '10.00',
  `sellable` tinyint(1) DEFAULT '1',
  `copies` int(11) NOT NULL DEFAULT '1',
  `description` text,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (1,6,'El laberinto de la Soledad',1900,'es',NULL,10.00,1,1,NULL),(2,6,'El laberinto de la Soledad',1900,'es',NULL,10.00,1,1,NULL),(3,NULL,'Vuelta al Laberinto de la Soledad',1960,'es',NULL,10.00,1,1,NULL),(4,NULL,'Vuelta al Laberinto de la Soledad',1960,'es',NULL,10.00,1,1,NULL),(5,6,'Autobiografía de TuSand',1960,'es',NULL,10.00,1,1,NULL),(6,7,'Vuelta al Laberinto de la Soledad',1960,'es',NULL,10.00,1,1,NULL),(7,NULL,'Vuelta al Laberinto de la Soledad III',1969,'es',NULL,10.00,1,1,NULL),(8,40,'Vuelta al Laberinto de la Soledad III',1969,'es',NULL,10.00,1,1,NULL);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clients` (
  `client_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `birthdate` datetime DEFAULT NULL,
  `gender` enum('M','F','ND') NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`client_id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
INSERT INTO `clients` VALUES (1,'Maria Dolores','ghp@gmail.com','1971-06-06 00:00:00','F',1,'2020-03-24 03:58:55','2020-03-24 03:58:55'),(2,'Maria Dolores2','ghp2@gmail.com','1978-06-06 00:00:00','F',1,'2020-03-24 04:08:07','2020-03-24 04:08:07');
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operations`
--

DROP TABLE IF EXISTS `operations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operations` (
  `operation_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `book_id` int(10) unsigned DEFAULT NULL,
  `client_id` int(10) unsigned DEFAULT NULL,
  `type` enum('soll','lend','available') DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `finished` tinyint(1) NOT NULL,
  PRIMARY KEY (`operation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operations`
--

LOCK TABLES `operations` WRITE;
/*!40000 ALTER TABLE `operations` DISABLE KEYS */;
/*!40000 ALTER TABLE `operations` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-24  6:27:04
