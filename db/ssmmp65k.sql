-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmmp65k
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssmmp65k/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssmmp65k/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmmp65k/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussduihuanshangcheng`
--

DROP TABLE IF EXISTS `discussduihuanshangcheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussduihuanshangcheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=197 DEFAULT CHARSET=utf8 COMMENT='兑换商城评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussduihuanshangcheng`
--

LOCK TABLES `discussduihuanshangcheng` WRITE;
/*!40000 ALTER TABLE `discussduihuanshangcheng` DISABLE KEYS */;
INSERT INTO `discussduihuanshangcheng` VALUES (191,'2021-02-26 10:15:44',1,1,'评论内容1','回复内容1'),(192,'2021-02-26 10:15:44',2,2,'评论内容2','回复内容2'),(193,'2021-02-26 10:15:44',3,3,'评论内容3','回复内容3'),(194,'2021-02-26 10:15:44',4,4,'评论内容4','回复内容4'),(195,'2021-02-26 10:15:44',5,5,'评论内容5','回复内容5'),(196,'2021-02-26 10:15:44',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussduihuanshangcheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusshuanbaohuodong`
--

DROP TABLE IF EXISTS `discusshuanbaohuodong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusshuanbaohuodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8 COMMENT='环保活动评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusshuanbaohuodong`
--

LOCK TABLES `discusshuanbaohuodong` WRITE;
/*!40000 ALTER TABLE `discusshuanbaohuodong` DISABLE KEYS */;
INSERT INTO `discusshuanbaohuodong` VALUES (201,'2021-02-26 10:15:44',1,1,'评论内容1','回复内容1'),(202,'2021-02-26 10:15:44',2,2,'评论内容2','回复内容2'),(203,'2021-02-26 10:15:44',3,3,'评论内容3','回复内容3'),(204,'2021-02-26 10:15:44',4,4,'评论内容4','回复内容4'),(205,'2021-02-26 10:15:44',5,5,'评论内容5','回复内容5'),(206,'2021-02-26 10:15:44',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusshuanbaohuodong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusshuanbaoshetuan`
--

DROP TABLE IF EXISTS `discusshuanbaoshetuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusshuanbaoshetuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=187 DEFAULT CHARSET=utf8 COMMENT='环保社团评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusshuanbaoshetuan`
--

LOCK TABLES `discusshuanbaoshetuan` WRITE;
/*!40000 ALTER TABLE `discusshuanbaoshetuan` DISABLE KEYS */;
INSERT INTO `discusshuanbaoshetuan` VALUES (181,'2021-02-26 10:15:44',1,1,'评论内容1','回复内容1'),(182,'2021-02-26 10:15:44',2,2,'评论内容2','回复内容2'),(183,'2021-02-26 10:15:44',3,3,'评论内容3','回复内容3'),(184,'2021-02-26 10:15:44',4,4,'评论内容4','回复内容4'),(185,'2021-02-26 10:15:44',5,5,'评论内容5','回复内容5'),(186,'2021-02-26 10:15:44',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusshuanbaoshetuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusshuanbaozhongchou`
--

DROP TABLE IF EXISTS `discusshuanbaozhongchou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusshuanbaozhongchou` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=217 DEFAULT CHARSET=utf8 COMMENT='环保众筹评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusshuanbaozhongchou`
--

LOCK TABLES `discusshuanbaozhongchou` WRITE;
/*!40000 ALTER TABLE `discusshuanbaozhongchou` DISABLE KEYS */;
INSERT INTO `discusshuanbaozhongchou` VALUES (211,'2021-02-26 10:15:44',1,1,'评论内容1','回复内容1'),(212,'2021-02-26 10:15:44',2,2,'评论内容2','回复内容2'),(213,'2021-02-26 10:15:44',3,3,'评论内容3','回复内容3'),(214,'2021-02-26 10:15:44',4,4,'评论内容4','回复内容4'),(215,'2021-02-26 10:15:44',5,5,'评论内容5','回复内容5'),(216,'2021-02-26 10:15:44',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusshuanbaozhongchou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `duihuanshangcheng`
--

DROP TABLE IF EXISTS `duihuanshangcheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `duihuanshangcheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinbianhao` varchar(200) DEFAULT NULL COMMENT '商品编号',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `shangpinleixing` varchar(200) DEFAULT NULL COMMENT '商品类型',
  `shangpinguige` varchar(200) DEFAULT NULL COMMENT '商品规格',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `pinpai` varchar(200) DEFAULT NULL COMMENT '品牌',
  `suoxuhuanbaobi` varchar(200) DEFAULT NULL COMMENT '所需环保币',
  `shangpinjieshao` longtext COMMENT '商品介绍',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shangpinbianhao` (`shangpinbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='兑换商城';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `duihuanshangcheng`
--

LOCK TABLES `duihuanshangcheng` WRITE;
/*!40000 ALTER TABLE `duihuanshangcheng` DISABLE KEYS */;
INSERT INTO `duihuanshangcheng` VALUES (71,'2021-02-26 10:15:43','商品编号1','商品名称1','商品类型1','商品规格1','http://localhost:8080/ssmmp65k/upload/duihuanshangcheng_tupian1.jpg','品牌1','所需环保币1','商品介绍1',1,1),(72,'2021-02-26 10:15:43','商品编号2','商品名称2','商品类型2','商品规格2','http://localhost:8080/ssmmp65k/upload/duihuanshangcheng_tupian2.jpg','品牌2','所需环保币2','商品介绍2',2,2),(73,'2021-02-26 10:15:43','商品编号3','商品名称3','商品类型3','商品规格3','http://localhost:8080/ssmmp65k/upload/duihuanshangcheng_tupian3.jpg','品牌3','所需环保币3','商品介绍3',3,3),(74,'2021-02-26 10:15:43','商品编号4','商品名称4','商品类型4','商品规格4','http://localhost:8080/ssmmp65k/upload/duihuanshangcheng_tupian4.jpg','品牌4','所需环保币4','商品介绍4',4,4),(75,'2021-02-26 10:15:43','商品编号5','商品名称5','商品类型5','商品规格5','http://localhost:8080/ssmmp65k/upload/duihuanshangcheng_tupian5.jpg','品牌5','所需环保币5','商品介绍5',5,5),(76,'2021-02-26 10:15:43','商品编号6','商品名称6','商品类型6','商品规格6','http://localhost:8080/ssmmp65k/upload/duihuanshangcheng_tupian6.jpg','品牌6','所需环保币6','商品介绍6',6,6);
/*!40000 ALTER TABLE `duihuanshangcheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huanbaobikoujian`
--

DROP TABLE IF EXISTS `huanbaobikoujian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huanbaobikoujian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghumingcheng` varchar(200) DEFAULT NULL COMMENT '用户名称',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `huanbaobi` varchar(200) DEFAULT NULL COMMENT '环保币',
  `koujianyuanyin` longtext COMMENT '扣减原因',
  `riqi` date DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='环保币扣减';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huanbaobikoujian`
--

LOCK TABLES `huanbaobikoujian` WRITE;
/*!40000 ALTER TABLE `huanbaobikoujian` DISABLE KEYS */;
INSERT INTO `huanbaobikoujian` VALUES (51,'2021-02-26 10:15:43','用户账号1','用户名称1','手机1','环保币1','扣减原因1','2021-02-26'),(52,'2021-02-26 10:15:43','用户账号2','用户名称2','手机2','环保币2','扣减原因2','2021-02-26'),(53,'2021-02-26 10:15:43','用户账号3','用户名称3','手机3','环保币3','扣减原因3','2021-02-26'),(54,'2021-02-26 10:15:43','用户账号4','用户名称4','手机4','环保币4','扣减原因4','2021-02-26'),(55,'2021-02-26 10:15:43','用户账号5','用户名称5','手机5','环保币5','扣减原因5','2021-02-26'),(56,'2021-02-26 10:15:43','用户账号6','用户名称6','手机6','环保币6','扣减原因6','2021-02-26');
/*!40000 ALTER TABLE `huanbaobikoujian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huanbaobiruzhang`
--

DROP TABLE IF EXISTS `huanbaobiruzhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huanbaobiruzhang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghumingcheng` varchar(200) DEFAULT NULL COMMENT '用户名称',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `huanbaobi` varchar(200) DEFAULT NULL COMMENT '环保币',
  `ruzhangyuanyin` longtext COMMENT '入账原因',
  `riqi` date DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='环保币入账';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huanbaobiruzhang`
--

LOCK TABLES `huanbaobiruzhang` WRITE;
/*!40000 ALTER TABLE `huanbaobiruzhang` DISABLE KEYS */;
INSERT INTO `huanbaobiruzhang` VALUES (41,'2021-02-26 10:15:43','用户账号1','用户名称1','手机1','环保币1','入账原因1','2021-02-26'),(42,'2021-02-26 10:15:43','用户账号2','用户名称2','手机2','环保币2','入账原因2','2021-02-26'),(43,'2021-02-26 10:15:43','用户账号3','用户名称3','手机3','环保币3','入账原因3','2021-02-26'),(44,'2021-02-26 10:15:43','用户账号4','用户名称4','手机4','环保币4','入账原因4','2021-02-26'),(45,'2021-02-26 10:15:43','用户账号5','用户名称5','手机5','环保币5','入账原因5','2021-02-26'),(46,'2021-02-26 10:15:43','用户账号6','用户名称6','手机6','环保币6','入账原因6','2021-02-26');
/*!40000 ALTER TABLE `huanbaobiruzhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huanbaofenlei`
--

DROP TABLE IF EXISTS `huanbaofenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huanbaofenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huanbaoleixing` varchar(200) DEFAULT NULL COMMENT '环保类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='环保分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huanbaofenlei`
--

LOCK TABLES `huanbaofenlei` WRITE;
/*!40000 ALTER TABLE `huanbaofenlei` DISABLE KEYS */;
INSERT INTO `huanbaofenlei` VALUES (101,'2021-02-26 10:15:43','环保类型1'),(102,'2021-02-26 10:15:43','环保类型2'),(103,'2021-02-26 10:15:43','环保类型3'),(104,'2021-02-26 10:15:43','环保类型4'),(105,'2021-02-26 10:15:43','环保类型5'),(106,'2021-02-26 10:15:43','环保类型6');
/*!40000 ALTER TABLE `huanbaofenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huanbaohuodong`
--

DROP TABLE IF EXISTS `huanbaohuodong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huanbaohuodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shetuanbianhao` varchar(200) DEFAULT NULL COMMENT '社团编号',
  `shetuanmingcheng` varchar(200) DEFAULT NULL COMMENT '社团名称',
  `huodongmingcheng` varchar(200) DEFAULT NULL COMMENT '活动名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `huanbaoleixing` varchar(200) DEFAULT NULL COMMENT '环保类型',
  `huodongshijian` datetime DEFAULT NULL COMMENT '活动时间',
  `huodongdidian` varchar(200) DEFAULT NULL COMMENT '活动地点',
  `baomingwendang` varchar(200) DEFAULT NULL COMMENT '报名文档',
  `huodongjieshao` longtext COMMENT '活动介绍',
  `huodongjinzhan` longtext COMMENT '活动进展',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='环保活动';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huanbaohuodong`
--

LOCK TABLES `huanbaohuodong` WRITE;
/*!40000 ALTER TABLE `huanbaohuodong` DISABLE KEYS */;
INSERT INTO `huanbaohuodong` VALUES (111,'2021-02-26 10:15:43','社团编号1','社团名称1','活动名称1','http://localhost:8080/ssmmp65k/upload/huanbaohuodong_tupian1.jpg','环保类型1','2021-02-26 18:15:43','活动地点1','','活动介绍1','活动进展1','是','',1,1),(112,'2021-02-26 10:15:43','社团编号2','社团名称2','活动名称2','http://localhost:8080/ssmmp65k/upload/huanbaohuodong_tupian2.jpg','环保类型2','2021-02-26 18:15:43','活动地点2','','活动介绍2','活动进展2','是','',2,2),(113,'2021-02-26 10:15:43','社团编号3','社团名称3','活动名称3','http://localhost:8080/ssmmp65k/upload/huanbaohuodong_tupian3.jpg','环保类型3','2021-02-26 18:15:43','活动地点3','','活动介绍3','活动进展3','是','',3,3),(114,'2021-02-26 10:15:43','社团编号4','社团名称4','活动名称4','http://localhost:8080/ssmmp65k/upload/huanbaohuodong_tupian4.jpg','环保类型4','2021-02-26 18:15:43','活动地点4','','活动介绍4','活动进展4','是','',4,4),(115,'2021-02-26 10:15:43','社团编号5','社团名称5','活动名称5','http://localhost:8080/ssmmp65k/upload/huanbaohuodong_tupian5.jpg','环保类型5','2021-02-26 18:15:43','活动地点5','','活动介绍5','活动进展5','是','',5,5),(116,'2021-02-26 10:15:43','社团编号6','社团名称6','活动名称6','http://localhost:8080/ssmmp65k/upload/huanbaohuodong_tupian6.jpg','环保类型6','2021-02-26 18:15:43','活动地点6','','活动介绍6','活动进展6','是','',6,6);
/*!40000 ALTER TABLE `huanbaohuodong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huanbaoshetuan`
--

DROP TABLE IF EXISTS `huanbaoshetuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huanbaoshetuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shetuanbianhao` varchar(200) DEFAULT NULL COMMENT '社团编号',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `shetuanmingcheng` varchar(200) DEFAULT NULL COMMENT '社团名称',
  `fuzerenxingming` varchar(200) DEFAULT NULL COMMENT '负责人姓名',
  `shetuanrenshu` varchar(200) DEFAULT NULL COMMENT '社团人数',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `shetuanjianjie` longtext COMMENT '社团简介',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shetuanbianhao` (`shetuanbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='环保社团';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huanbaoshetuan`
--

LOCK TABLES `huanbaoshetuan` WRITE;
/*!40000 ALTER TABLE `huanbaoshetuan` DISABLE KEYS */;
INSERT INTO `huanbaoshetuan` VALUES (21,'2021-02-26 10:15:43','环保社团1','123456','社团名称1','负责人姓名1','社团人数1','http://localhost:8080/ssmmp65k/upload/huanbaoshetuan_tupian1.jpg','社团简介1','是',''),(22,'2021-02-26 10:15:43','环保社团2','123456','社团名称2','负责人姓名2','社团人数2','http://localhost:8080/ssmmp65k/upload/huanbaoshetuan_tupian2.jpg','社团简介2','是',''),(23,'2021-02-26 10:15:43','环保社团3','123456','社团名称3','负责人姓名3','社团人数3','http://localhost:8080/ssmmp65k/upload/huanbaoshetuan_tupian3.jpg','社团简介3','是',''),(24,'2021-02-26 10:15:43','环保社团4','123456','社团名称4','负责人姓名4','社团人数4','http://localhost:8080/ssmmp65k/upload/huanbaoshetuan_tupian4.jpg','社团简介4','是',''),(25,'2021-02-26 10:15:43','环保社团5','123456','社团名称5','负责人姓名5','社团人数5','http://localhost:8080/ssmmp65k/upload/huanbaoshetuan_tupian5.jpg','社团简介5','是',''),(26,'2021-02-26 10:15:43','环保社团6','123456','社团名称6','负责人姓名6','社团人数6','http://localhost:8080/ssmmp65k/upload/huanbaoshetuan_tupian6.jpg','社团简介6','是','');
/*!40000 ALTER TABLE `huanbaoshetuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huanbaozhongchou`
--

DROP TABLE IF EXISTS `huanbaozhongchou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huanbaozhongchou` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shetuanbianhao` varchar(200) DEFAULT NULL COMMENT '社团编号',
  `shetuanmingcheng` varchar(200) DEFAULT NULL COMMENT '社团名称',
  `huanbaoleixing` varchar(200) DEFAULT NULL COMMENT '环保类型',
  `xiangmubianhao` varchar(200) DEFAULT NULL COMMENT '项目编号',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `zhongchoujine` varchar(200) DEFAULT NULL COMMENT '众筹金额',
  `faqishijian` date DEFAULT NULL COMMENT '发起时间',
  `jiezhishijian` date DEFAULT NULL COMMENT '截止时间',
  `xiangmujieshao` longtext COMMENT '项目介绍',
  `xiangmujinzhan` longtext COMMENT '项目进展',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiangmubianhao` (`xiangmubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='环保众筹';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huanbaozhongchou`
--

LOCK TABLES `huanbaozhongchou` WRITE;
/*!40000 ALTER TABLE `huanbaozhongchou` DISABLE KEYS */;
INSERT INTO `huanbaozhongchou` VALUES (131,'2021-02-26 10:15:43','社团编号1','社团名称1','环保类型1','项目编号1','项目名称1','http://localhost:8080/ssmmp65k/upload/huanbaozhongchou_tupian1.jpg','众筹金额1','2021-02-26','2021-02-26','项目介绍1','项目进展1','是','',1,1),(132,'2021-02-26 10:15:43','社团编号2','社团名称2','环保类型2','项目编号2','项目名称2','http://localhost:8080/ssmmp65k/upload/huanbaozhongchou_tupian2.jpg','众筹金额2','2021-02-26','2021-02-26','项目介绍2','项目进展2','是','',2,2),(133,'2021-02-26 10:15:43','社团编号3','社团名称3','环保类型3','项目编号3','项目名称3','http://localhost:8080/ssmmp65k/upload/huanbaozhongchou_tupian3.jpg','众筹金额3','2021-02-26','2021-02-26','项目介绍3','项目进展3','是','',3,3),(134,'2021-02-26 10:15:43','社团编号4','社团名称4','环保类型4','项目编号4','项目名称4','http://localhost:8080/ssmmp65k/upload/huanbaozhongchou_tupian4.jpg','众筹金额4','2021-02-26','2021-02-26','项目介绍4','项目进展4','是','',4,4),(135,'2021-02-26 10:15:43','社团编号5','社团名称5','环保类型5','项目编号5','项目名称5','http://localhost:8080/ssmmp65k/upload/huanbaozhongchou_tupian5.jpg','众筹金额5','2021-02-26','2021-02-26','项目介绍5','项目进展5','是','',5,5),(136,'2021-02-26 10:15:43','社团编号6','社团名称6','环保类型6','项目编号6','项目名称6','http://localhost:8080/ssmmp65k/upload/huanbaozhongchou_tupian6.jpg','众筹金额6','2021-02-26','2021-02-26','项目介绍6','项目进展6','是','',6,6);
/*!40000 ALTER TABLE `huanbaozhongchou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huodongbaoming`
--

DROP TABLE IF EXISTS `huodongbaoming`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huodongbaoming` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shetuanbianhao` varchar(200) DEFAULT NULL COMMENT '社团编号',
  `shetuanmingcheng` varchar(200) DEFAULT NULL COMMENT '社团名称',
  `huodongmingcheng` varchar(200) DEFAULT NULL COMMENT '活动名称',
  `baomingbiao` varchar(200) DEFAULT NULL COMMENT '报名表',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghumingcheng` varchar(200) DEFAULT NULL COMMENT '用户名称',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='活动报名';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huodongbaoming`
--

LOCK TABLES `huodongbaoming` WRITE;
/*!40000 ALTER TABLE `huodongbaoming` DISABLE KEYS */;
INSERT INTO `huodongbaoming` VALUES (121,'2021-02-26 10:15:43','社团编号1','社团名称1','活动名称1','','用户账号1','用户名称1','手机1','备注1','是',''),(122,'2021-02-26 10:15:43','社团编号2','社团名称2','活动名称2','','用户账号2','用户名称2','手机2','备注2','是',''),(123,'2021-02-26 10:15:43','社团编号3','社团名称3','活动名称3','','用户账号3','用户名称3','手机3','备注3','是',''),(124,'2021-02-26 10:15:43','社团编号4','社团名称4','活动名称4','','用户账号4','用户名称4','手机4','备注4','是',''),(125,'2021-02-26 10:15:43','社团编号5','社团名称5','活动名称5','','用户账号5','用户名称5','手机5','备注5','是',''),(126,'2021-02-26 10:15:43','社团编号6','社团名称6','活动名称6','','用户账号6','用户名称6','手机6','备注6','是','');
/*!40000 ALTER TABLE `huodongbaoming` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaruhuanbaoshetuan`
--

DROP TABLE IF EXISTS `jiaruhuanbaoshetuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaruhuanbaoshetuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shetuanbianhao` varchar(200) DEFAULT NULL COMMENT '社团编号',
  `shetuanmingcheng` varchar(200) DEFAULT NULL COMMENT '社团名称',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghumingcheng` varchar(200) DEFAULT NULL COMMENT '用户名称',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenqingwendang` varchar(200) DEFAULT NULL COMMENT '申请文档',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='加入环保社团';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaruhuanbaoshetuan`
--

LOCK TABLES `jiaruhuanbaoshetuan` WRITE;
/*!40000 ALTER TABLE `jiaruhuanbaoshetuan` DISABLE KEYS */;
INSERT INTO `jiaruhuanbaoshetuan` VALUES (91,'2021-02-26 10:15:43','社团编号1','社团名称1','用户账号1','用户名称1','手机1','','备注1','是',''),(92,'2021-02-26 10:15:43','社团编号2','社团名称2','用户账号2','用户名称2','手机2','','备注2','是',''),(93,'2021-02-26 10:15:43','社团编号3','社团名称3','用户账号3','用户名称3','手机3','','备注3','是',''),(94,'2021-02-26 10:15:43','社团编号4','社团名称4','用户账号4','用户名称4','手机4','','备注4','是',''),(95,'2021-02-26 10:15:43','社团编号5','社团名称5','用户账号5','用户名称5','手机5','','备注5','是',''),(96,'2021-02-26 10:15:43','社团编号6','社团名称6','用户账号6','用户名称6','手机6','','备注6','是','');
/*!40000 ALTER TABLE `jiaruhuanbaoshetuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '留言内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8 COMMENT='留言板';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (171,'2021-02-26 10:15:44',1,'用户名1','留言内容1','回复内容1'),(172,'2021-02-26 10:15:44',2,'用户名2','留言内容2','回复内容2'),(173,'2021-02-26 10:15:44',3,'用户名3','留言内容3','回复内容3'),(174,'2021-02-26 10:15:44',4,'用户名4','留言内容4','回复内容4'),(175,'2021-02-26 10:15:44',5,'用户名5','留言内容5','回复内容5'),(176,'2021-02-26 10:15:44',6,'用户名6','留言内容6','回复内容6');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='科普资讯';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (161,'2021-02-26 10:15:43','标题1','简介1','http://localhost:8080/ssmmp65k/upload/news_picture1.jpg','内容1'),(162,'2021-02-26 10:15:43','标题2','简介2','http://localhost:8080/ssmmp65k/upload/news_picture2.jpg','内容2'),(163,'2021-02-26 10:15:43','标题3','简介3','http://localhost:8080/ssmmp65k/upload/news_picture3.jpg','内容3'),(164,'2021-02-26 10:15:43','标题4','简介4','http://localhost:8080/ssmmp65k/upload/news_picture4.jpg','内容4'),(165,'2021-02-26 10:15:43','标题5','简介5','http://localhost:8080/ssmmp65k/upload/news_picture5.jpg','内容5'),(166,'2021-02-26 10:15:44','标题6','简介6','http://localhost:8080/ssmmp65k/upload/news_picture6.jpg','内容6');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shangpinduihuan`
--

DROP TABLE IF EXISTS `shangpinduihuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shangpinduihuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinbianhao` varchar(200) DEFAULT NULL COMMENT '商品编号',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `shangpinleixing` varchar(200) DEFAULT NULL COMMENT '商品类型',
  `suoxuhuanbaobi` varchar(200) DEFAULT NULL COMMENT '所需环保币',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghumingcheng` varchar(200) DEFAULT NULL COMMENT '用户名称',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shouhuodizhi` varchar(200) DEFAULT NULL COMMENT '收货地址',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='商品兑换';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shangpinduihuan`
--

LOCK TABLES `shangpinduihuan` WRITE;
/*!40000 ALTER TABLE `shangpinduihuan` DISABLE KEYS */;
INSERT INTO `shangpinduihuan` VALUES (81,'2021-02-26 10:15:43','商品编号1','商品名称1','商品类型1','所需环保币1','用户账号1','用户名称1','手机1','收货地址1','备注1','是',''),(82,'2021-02-26 10:15:43','商品编号2','商品名称2','商品类型2','所需环保币2','用户账号2','用户名称2','手机2','收货地址2','备注2','是',''),(83,'2021-02-26 10:15:43','商品编号3','商品名称3','商品类型3','所需环保币3','用户账号3','用户名称3','手机3','收货地址3','备注3','是',''),(84,'2021-02-26 10:15:43','商品编号4','商品名称4','商品类型4','所需环保币4','用户账号4','用户名称4','手机4','收货地址4','备注4','是',''),(85,'2021-02-26 10:15:43','商品编号5','商品名称5','商品类型5','所需环保币5','用户账号5','用户名称5','手机5','收货地址5','备注5','是',''),(86,'2021-02-26 10:15:43','商品编号6','商品名称6','商品类型6','所需环保币6','用户账号6','用户名称6','手机6','收货地址6','备注6','是','');
/*!40000 ALTER TABLE `shangpinduihuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shangpinfenlei`
--

DROP TABLE IF EXISTS `shangpinfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shangpinfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shangpinleixing` varchar(200) DEFAULT NULL COMMENT '商品类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='商品分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shangpinfenlei`
--

LOCK TABLES `shangpinfenlei` WRITE;
/*!40000 ALTER TABLE `shangpinfenlei` DISABLE KEYS */;
INSERT INTO `shangpinfenlei` VALUES (61,'2021-02-26 10:15:43','商品类型1'),(62,'2021-02-26 10:15:43','商品类型2'),(63,'2021-02-26 10:15:43','商品类型3'),(64,'2021-02-26 10:15:43','商品类型4'),(65,'2021-02-26 10:15:43','商品类型5'),(66,'2021-02-26 10:15:43','商品类型6');
/*!40000 ALTER TABLE `shangpinfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-02-26 10:15:44');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `yonghumingcheng` varchar(200) DEFAULT NULL COMMENT '用户名称',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-02-26 10:15:43','用户1','123456','用户名称1','年龄1','男','13823888881','773890001@qq.com','http://localhost:8080/ssmmp65k/upload/yonghu_touxiang1.jpg'),(12,'2021-02-26 10:15:43','用户2','123456','用户名称2','年龄2','男','13823888882','773890002@qq.com','http://localhost:8080/ssmmp65k/upload/yonghu_touxiang2.jpg'),(13,'2021-02-26 10:15:43','用户3','123456','用户名称3','年龄3','男','13823888883','773890003@qq.com','http://localhost:8080/ssmmp65k/upload/yonghu_touxiang3.jpg'),(14,'2021-02-26 10:15:43','用户4','123456','用户名称4','年龄4','男','13823888884','773890004@qq.com','http://localhost:8080/ssmmp65k/upload/yonghu_touxiang4.jpg'),(15,'2021-02-26 10:15:43','用户5','123456','用户名称5','年龄5','男','13823888885','773890005@qq.com','http://localhost:8080/ssmmp65k/upload/yonghu_touxiang5.jpg'),(16,'2021-02-26 10:15:43','用户6','123456','用户名称6','年龄6','男','13823888886','773890006@qq.com','http://localhost:8080/ssmmp65k/upload/yonghu_touxiang6.jpg');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghuhuanbaobi`
--

DROP TABLE IF EXISTS `yonghuhuanbaobi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghuhuanbaobi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghumingcheng` varchar(200) DEFAULT NULL COMMENT '用户名称',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `huanbaobi` varchar(200) DEFAULT NULL COMMENT '环保币',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='用户环保币';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghuhuanbaobi`
--

LOCK TABLES `yonghuhuanbaobi` WRITE;
/*!40000 ALTER TABLE `yonghuhuanbaobi` DISABLE KEYS */;
INSERT INTO `yonghuhuanbaobi` VALUES (31,'2021-02-26 10:15:43','用户账号1','用户名称1','手机1','环保币1'),(32,'2021-02-26 10:15:43','用户账号2','用户名称2','手机2','环保币2'),(33,'2021-02-26 10:15:43','用户账号3','用户名称3','手机3','环保币3'),(34,'2021-02-26 10:15:43','用户账号4','用户名称4','手机4','环保币4'),(35,'2021-02-26 10:15:43','用户账号5','用户名称5','手机5','环保币5'),(36,'2021-02-26 10:15:43','用户账号6','用户名称6','手机6','环保币6');
/*!40000 ALTER TABLE `yonghuhuanbaobi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhongchouzhichi`
--

DROP TABLE IF EXISTS `zhongchouzhichi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhongchouzhichi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shetuanbianhao` varchar(200) DEFAULT NULL COMMENT '社团编号',
  `shetuanmingcheng` varchar(200) DEFAULT NULL COMMENT '社团名称',
  `xiangmubianhao` varchar(200) DEFAULT NULL COMMENT '项目编号',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `zhichijine` int(11) DEFAULT NULL COMMENT '支持金额',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghumingcheng` varchar(200) DEFAULT NULL COMMENT '用户名称',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='众筹支持';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhongchouzhichi`
--

LOCK TABLES `zhongchouzhichi` WRITE;
/*!40000 ALTER TABLE `zhongchouzhichi` DISABLE KEYS */;
INSERT INTO `zhongchouzhichi` VALUES (141,'2021-02-26 10:15:43','社团编号1','社团名称1','项目编号1','项目名称1',1,'用户账号1','用户名称1','备注1','未支付'),(142,'2021-02-26 10:15:43','社团编号2','社团名称2','项目编号2','项目名称2',2,'用户账号2','用户名称2','备注2','未支付'),(143,'2021-02-26 10:15:43','社团编号3','社团名称3','项目编号3','项目名称3',3,'用户账号3','用户名称3','备注3','未支付'),(144,'2021-02-26 10:15:43','社团编号4','社团名称4','项目编号4','项目名称4',4,'用户账号4','用户名称4','备注4','未支付'),(145,'2021-02-26 10:15:43','社团编号5','社团名称5','项目编号5','项目名称5',5,'用户账号5','用户名称5','备注5','未支付'),(146,'2021-02-26 10:15:43','社团编号6','社团名称6','项目编号6','项目名称6',6,'用户账号6','用户名称6','备注6','未支付');
/*!40000 ALTER TABLE `zhongchouzhichi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-26 18:23:40
