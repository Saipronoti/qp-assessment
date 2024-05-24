CREATE DATABASE  IF NOT EXISTS `grocery_application`;
USE `grocery_application`;

--
-- Table structure for table `groceryitems`
--

DROP TABLE IF EXISTS `groceryitems`;

CREATE TABLE `groceryitems` (
  `id` int NOT NULL AUTO_INCREMENT,
  `item_name` varchar(45) DEFAULT NULL,
  `item_price` float  DEFAULT 0.00,
  `item_count` int DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

