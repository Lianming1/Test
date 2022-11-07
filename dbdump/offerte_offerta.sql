-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: offerte
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `offerta`
--

DROP TABLE IF EXISTS `offerta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `offerta` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Fornitore` varchar(30) NOT NULL,
  `Prodotto` varchar(30) NOT NULL,
  `Prezzo` float NOT NULL,
  `Magazzino` float NOT NULL,
  `Percentuale` float NOT NULL,
  `scontoQuantita` varchar(1) DEFAULT NULL,
  `Quantita` int DEFAULT NULL,
  `scontoTotale` varchar(1) DEFAULT NULL,
  `Importo` float DEFAULT NULL,
  `scontoStagione` varchar(1) DEFAULT NULL,
  `Stagione` varchar(10) DEFAULT NULL,
  `Spedizione` int NOT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `offerta_chk_1` CHECK (((`scontoQuantita` = _utf8mb4'Y') or (`scontoQuantita` = _utf8mb4'N'))),
  CONSTRAINT `offerta_chk_2` CHECK (((`scontoTotale` = _utf8mb4'Y') or (`scontoTotale` = _utf8mb4'N'))),
  CONSTRAINT `offerta_chk_3` CHECK (((`scontoStagione` = _utf8mb4'Y') or (`scontoStagione` = _utf8mb4'N')))
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `offerta`
--

LOCK TABLES `offerta` WRITE;
/*!40000 ALTER TABLE `offerta` DISABLE KEYS */;
INSERT INTO `offerta` VALUES (1,'mediaworld','PC',300,30,10,'Y',10,'N',0,'N','nessuno',4),(2,'euronics','PC',280,40,7,'N',0,'Y',1000,'N','nessuno',3),(3,'trony','PC',250,10,12,'N',0,'N',0,'Y','autunno',5),(4,'mediaWorld','PC',300,30,1,'N',0,'Y',3000,'N','nessuno',4);
/*!40000 ALTER TABLE `offerta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-07 11:34:10
