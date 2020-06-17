CREATE DATABASE  IF NOT EXISTS `crowd_manager` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `crowd_manager`;
-- MySQL dump 10.13  Distrib 5.7.26, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: crowd_manager
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.18.10.1

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
-- Table structure for table `crowd_spot`
--

DROP TABLE IF EXISTS `crowd_spot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crowd_spot` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `addedBy` int(11) DEFAULT NULL,
  `addedDate` datetime NOT NULL,
  `editedBy` int(11) DEFAULT NULL,
  `editedDate` datetime NOT NULL,
  `name` varchar(255) NOT NULL,
  `code` varchar(255) NOT NULL,
  `lat` decimal(10,8) NOT NULL,
  `lng` decimal(11,8) NOT NULL,
  `address` varchar(255) NOT NULL,
  `staffCount` int(11) DEFAULT '0',
  `spotCapacity` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crowd_spot`
--

LOCK TABLES `crowd_spot` WRITE;
/*!40000 ALTER TABLE `crowd_spot` DISABLE KEYS */;
INSERT INTO `crowd_spot` VALUES (1,1,'2020-06-16 11:06:03',1,'2020-06-16 11:06:03','Forum Mall','FORUM_MALL',12.10000000,12.10000000,'kukatpally',10,10000,'ACTIVE');
/*!40000 ALTER TABLE `crowd_spot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `crowd_spot_daily_count`
--

DROP TABLE IF EXISTS `crowd_spot_daily_count`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crowd_spot_daily_count` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `addedBy` int(11) NOT NULL,
  `addedDate` datetime NOT NULL,
  `editedBy` int(11) NOT NULL,
  `editedDate` datetime NOT NULL,
  `count` int(11) DEFAULT '0',
  `crowdSpotId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_crowd_spot_crowd_spot_daily_count` (`crowdSpotId`),
  CONSTRAINT `FK_crowd_spot_crowd_spot_daily_count` FOREIGN KEY (`crowdSpotId`) REFERENCES `crowd_spot` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crowd_spot_daily_count`
--

LOCK TABLES `crowd_spot_daily_count` WRITE;
/*!40000 ALTER TABLE `crowd_spot_daily_count` DISABLE KEYS */;
INSERT INTO `crowd_spot_daily_count` VALUES (1,1,'2020-06-16 11:11:10',1,'2020-06-16 11:11:10',5,1),(2,1,'2020-06-16 11:11:41',1,'2020-06-16 11:11:41',-2,1);
/*!40000 ALTER TABLE `crowd_spot_daily_count` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hours_table`
--

DROP TABLE IF EXISTS `hours_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hours_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `addedBy` int(11) DEFAULT NULL,
  `addedDate` datetime NOT NULL,
  `editedBy` int(11) DEFAULT NULL,
  `editedDate` datetime NOT NULL,
  `hour` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hours_table`
--

LOCK TABLES `hours_table` WRITE;
/*!40000 ALTER TABLE `hours_table` DISABLE KEYS */;
INSERT INTO `hours_table` VALUES (1,1,'2020-06-16 11:30:11',1,'2020-06-16 11:30:11',0),(2,1,'2020-06-16 11:30:45',1,'2020-06-16 11:30:45',1),(3,1,'2020-06-16 11:31:30',1,'2020-06-16 11:31:30',2),(4,1,'2020-06-16 11:31:30',1,'2020-06-16 11:31:30',3),(5,1,'2020-06-16 11:31:30',1,'2020-06-16 11:31:30',4),(6,1,'2020-06-16 11:32:43',1,'2020-06-16 11:32:43',5),(7,1,'2020-06-16 11:32:43',1,'2020-06-16 11:32:43',6),(8,1,'2020-06-16 11:32:43',1,'2020-06-16 11:32:43',7),(9,1,'2020-06-16 11:33:31',1,'2020-06-16 11:33:31',8),(10,1,'2020-06-16 11:33:31',1,'2020-06-16 11:33:31',9),(11,1,'2020-06-16 11:33:31',1,'2020-06-16 11:33:31',10),(12,1,'2020-06-16 11:34:10',1,'2020-06-16 11:34:10',11),(13,1,'2020-06-16 11:34:10',1,'2020-06-16 11:34:10',12),(14,1,'2020-06-16 11:34:10',1,'2020-06-16 11:34:10',13),(15,1,'2020-06-16 11:36:28',1,'2020-06-16 11:36:28',14),(16,1,'2020-06-16 11:36:28',1,'2020-06-16 11:36:28',15),(17,1,'2020-06-16 11:36:28',1,'2020-06-16 11:36:28',16),(18,1,'2020-06-16 11:37:18',1,'2020-06-16 11:37:18',17),(19,1,'2020-06-16 11:37:18',1,'2020-06-16 11:37:18',18),(20,1,'2020-06-16 11:37:18',1,'2020-06-16 11:37:18',19),(21,1,'2020-06-16 11:38:07',1,'2020-06-16 11:38:07',20),(22,1,'2020-06-16 11:38:07',1,'2020-06-16 11:38:07',21),(23,1,'2020-06-16 11:38:07',1,'2020-06-16 11:38:07',22),(24,1,'2020-06-16 11:38:25',1,'2020-06-16 11:38:25',23);
/*!40000 ALTER TABLE `hours_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'crow_manager'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-16 11:54:12
