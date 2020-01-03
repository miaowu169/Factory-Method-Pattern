package com.practice.Client;

import java.io.File;

import javax.xml.parsers.*;
import org.w3c.dom.*;


public class XMLUtilHero {
	//该方法用于从XML配置文件中提取具体类类名。并返回一个实例对象
	public static Object getHeroFactory() {
		try {
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src\\com\\practice\\Client\\config.xml"));
			
			//获取包含类名的文本节点
			NodeList nl = doc.getElementsByTagName("HeroFactory");
			Node classNode = nl.item(0).getFirstChild();
			String HeroFactory = classNode.getNodeValue();
			
			//通过类名生成实例对象并将其返回
			String ClassName = "com.practice.HeroFactory."+ HeroFactory;
			Class<?> c = Class.forName(ClassName);
			@SuppressWarnings("deprecation")
			Object obj = c.newInstance();			
			return obj;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
