package com.douzone.dscode.controller;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@Controller
public class SimpleController {
	
    @RequestMapping({"/", "/index"})
    public String home() {
        return "index";
    }
 // hollydays api
 	@ResponseBody
 	   @RequestMapping(value="/api/hollydays/{year}/{month}", method=RequestMethod.GET )
 	   public String hollydays(@PathVariable String year, @PathVariable String month) {
 	      System.out.println("year : " + year + ", month : " + month);
 	      String result = "";
 	      try{
 	         while(true){
 	            // parsing할 url 지정(API 키 포함해서)
 	            String url = "http://apis.data.go.kr/B090041/openapi/service/SpcdeInfoService/getHoliDeInfo?ServiceKey=";
 	            String serviceKey = "UBwvSOzIBNMzxSshLPsSxQ%2FKseq2QLt5Q4Q2caFwf6XEoNlwPV%2Fig5TwyBviHGd6Jt22HpvM3pA5%2FIQOdmsO7w%3D%3D";
 	            String solYear = "&solYear=" + year;
 	            String solMonth = "&solMonth=" + month;
 	            url += serviceKey + solYear + solMonth;
 	            
 	            DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
 	            DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
 	            Document doc = dBuilder.parse(url);
 	            
 	            // root tag 
 	            doc.getDocumentElement().normalize();
 	            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
 	            
 	            // 파싱할 tag
 	            NodeList nList = doc.getElementsByTagName("item");
 	            //System.out.println("파싱할 리스트 수 : "+ nList.getLength());
 	            
 	            for(int temp = 0; temp < nList.getLength(); temp++){
 	               Node nNode = nList.item(temp);
 	               if(nNode.getNodeType() == Node.ELEMENT_NODE){
 	                  Element eElement = (Element) nNode;
// 	                  System.out.println("######################");
// 	                  System.out.println(eElement.getTextContent());
// 	                  System.out.println("dateName  : " + getTagValue("dateName", eElement));
 	                  System.out.println("isHoliday  : " + getTagValue("isHoliday", eElement));
// 	                  System.out.println("locdate : " + getTagValue("locdate", eElement));
 	                  if(getTagValue("isHoliday", eElement).equals("Y")) 
 	                     result += getTagValue("dateName", eElement) + ',' + getTagValue("locdate", eElement) + "/";
 	               }   // for end
 	            }   // if end
 	            break;
 	         }   // while end
 	         
 	      } catch (Exception e){   
 	         e.printStackTrace();
 	      }   // try~catch end
 	      System.out.println(result);
 	      
 	      return result;
 	   }
 	//tag값의 정보를 가져오는 메소드
	   public String getTagValue(String tag, Element eElement) {
	       NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
	       Node nValue = (Node) nlList.item(0);
	       if(nValue == null) 
	           return null;
	       return nValue.getNodeValue();
	   }
}
