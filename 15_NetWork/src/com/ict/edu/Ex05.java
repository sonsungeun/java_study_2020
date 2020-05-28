package com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// 파싱 : 파싱은 어떤 페이지(문서, Html)에서
//		  내가 원하는 데이터를 특정 패턴이나 순서로 추출해 가공하는 것을 말한다.

// XML :  eXtensible Markup Language => 확장 될 수 있는 표시 언어
//		  사용자가 태그를 만들어서 사용할 수 있다.(=확장될 수 있는)
//		  <시작태그 속성 ="값" 속성 ="값" 속성 ="값"> 내용 </끝태그>
//		  Markup Language => 태그

// XML파싱 : xml로 구성된 데이터를 원하는 데이터만 추출, 가공하는 방법
//	- DOM(Document Object Model) 방식 : 웹브라우저가 태그를 해석하고 표현하는 방식

public class Ex05 {
	public static void main(String[] args) {
		BufferedReader br = null;

		// 파일로 저장
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "오늘날씨.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String msg = null;
			StringBuffer sb = new StringBuffer();

			while ((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			InputSource is = new InputSource(new StringReader(sb.toString()));

			// sb에 존재하는 내용을 읽어야된다.
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(is);

			// 원하는 태그(local)를 찾기;
			
			//파일 저장을 위한 파일
			StringBuffer sb2 = new StringBuffer();
			NodeList locals = document.getElementsByTagName("local");
			for (int i = 0; i < locals.getLength(); i++) {
				// 태그(element) 텍스트 구하기
				String txt = locals.item(i).getFirstChild().getNodeValue();
				System.out.print(txt + "\t");

				// 태그(element) 속성(attribute)
				String att1 = ((Element) (locals.item(i))).getAttribute("desc");
				String att2 = ((Element) (locals.item(i))).getAttribute("ta");
				System.out.print(att1 + "\t\t\t" + att2 + "\n");
				// sb2에 누적 저장
				sb2.append(txt+"\t");
				sb2.append(att1+"\t");
				sb2.append(att2+"\n");
			}
			

			// 파일로 저장하기
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb2.toString());
			bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
