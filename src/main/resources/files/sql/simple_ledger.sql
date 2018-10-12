/*
Navicat MySQL Data Transfer

Source Server         : 47.94.18.61
Source Server Version : 50722
Source Host           : 47.94.18.61:9001
Source Database       : simple_ledger

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-10-12 13:29:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `linkman` varchar(32) DEFAULT NULL,
  `shop_name` varchar(32) DEFAULT '',
  `username` varchar(32) DEFAULT '',
  `mobile_phone` varchar(32) DEFAULT '',
  `telephone` varchar(32) DEFAULT '',
  `address` varchar(256) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('1', 'root', 'root\'s shop', 'root', '13213543643', '3242434', 'this is address');
INSERT INTO `supplier` VALUES ('2', 'rick', 'rick_shop', 'rick', '13213213112', '234242', '地球');
