package com.practice.Client;

import java.io.File;

import javax.xml.parsers.*;
import org.w3c.dom.*;


public class XMLUtilHero {
	//该方法用于从XML配置文件中提取英雄名称，并返回该英雄名称
	public static String getHeroName() {
		try {
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src\\com\\practice\\Client\\config.xml"));
			
			//获取包含英雄名称的文本节点
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String dName = classNode.getNodeValue().trim();
			return dName;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
