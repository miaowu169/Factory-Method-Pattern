package com.practice.Client;

import java.io.File;

import javax.xml.parsers.*;
import org.w3c.dom.*;


public class XMLUtilHero {
	//�÷������ڴ�XML�����ļ�����ȡӢ�����ƣ������ظ�Ӣ������
	public static String getHeroName() {
		try {
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src\\com\\practice\\Client\\config.xml"));
			
			//��ȡ����Ӣ�����Ƶ��ı��ڵ�
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
