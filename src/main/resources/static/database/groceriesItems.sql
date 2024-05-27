CREATE DATABASE  IF NOT EXISTS `grocery_application`;
USE `grocery_application`;

--
-- Table structure for table `groceryitems`
--

DROP TABLE IF EXISTS `inventoryItems`;
DROP TABLE IF EXISTS `groceryOrders`;
DROP TABLE IF EXISTS `orderItems`;

CREATE TABLE `inventoryItems` (
  `item_id` int NOT NULL AUTO_INCREMENT,
  `item_name` varchar(45) DEFAULT NULL,
  `item_price` float  DEFAULT 0.00,
  `item_count` int DEFAULT 0,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `groceryOrders` (
  `order_id` int NOT NULL ,
  `total_price` float  DEFAULT 0.00,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

ALTER TABLE groceryOrders AUTO_INCREMENT=101;

CREATE TABLE `orderItems` (
  `order_item_id` int NOT NULL AUTO_INCREMENT,
  `order_id` int NOT NULL,
  `item_id` INT NOT NULL,
  `item_quantity` int NOT NULL,
  PRIMARY KEY (`order_item_id`),
  FOREIGN KEY (`order_id`) REFERENCES `groceryOrders` (`order_id`),
  FOREIGN KEY (`item_id`) REFERENCES `inventoryItems` (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
ALTER TABLE groceryOrders AUTO_INCREMENT=1001;
