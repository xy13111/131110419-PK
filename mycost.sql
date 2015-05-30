/*
Navicat MySQL Data Transfer

Source Server         : mysqluml
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : mycost

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2015-04-28 15:50:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `expend_sql`
-- ----------------------------
DROP TABLE IF EXISTS `expend_sql`;
CREATE TABLE `expend_sql` (
  `ExpendID` int(8) NOT NULL,
  `ExpendMoney` float(6,2) NOT NULL,
  `ExpendDate` datetime NOT NULL,
  `ExpendRemark` char(20) NOT NULL,
  `IsWright` int(2) NOT NULL,
  PRIMARY KEY (`ExpendID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of expend_sql
-- ----------------------------

-- ----------------------------
-- Table structure for `mywallet_sql`
-- ----------------------------
DROP TABLE IF EXISTS `mywallet_sql`;
CREATE TABLE `mywallet_sql` (
  `walletID` int(8) NOT NULL,
  `TotalRevenue` float(6,0) NOT NULL,
  `TotalExpend` float(6,0) NOT NULL,
  `UseMoney` float(6,0) NOT NULL,
  PRIMARY KEY (`walletID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of mywallet_sql
-- ----------------------------

-- ----------------------------
-- Table structure for `revenue_sql`
-- ----------------------------
DROP TABLE IF EXISTS `revenue_sql`;
CREATE TABLE `revenue_sql` (
  `RevenueID` int(8) NOT NULL,
  `RevenueMoney` float(6,2) NOT NULL,
  `RevenueDate` datetime NOT NULL,
  `RevenueRemark` char(20) NOT NULL,
  `IsPlan` int(2) NOT NULL,
  PRIMARY KEY (`RevenueID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of revenue_sql
-- ----------------------------
