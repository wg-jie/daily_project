/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost:3306
 Source Schema         : foods

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 10/07/2021 11:16:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `starttime` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES (1, '面包', '2021-07-02');
INSERT INTO `food` VALUES (2, '可乐', '2021-07-07');
INSERT INTO `food` VALUES (4, '曲奇饼', '2021-07-07');
INSERT INTO `food` VALUES (7, '黑暗系花', '2021-07-08');

SET FOREIGN_KEY_CHECKS = 1;
