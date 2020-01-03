package com.practice.Client;

import java.io.File;

import javax.xml.parsers.*;
import org.w3c.dom.*;


public class XMLUtilHero {
	//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Object getHeroFactory() {
		try {
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src\\com\\practice\\Client\\config.xml"));
			
			//��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("HeroFactory");
			Node classNode = nl.item(0).getFirstChild();
			String HeroFactory = classNode.getNodeValue();
			
			//ͨ����������ʵ�����󲢽��䷵��
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
