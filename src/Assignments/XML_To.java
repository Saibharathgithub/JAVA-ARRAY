package Assignments;
import java.io.*;
import java.sql.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
public class XML_To {
	public static void main(String[] args) throws SQLException, SAXException, IOException, ParserConfigurationException{ 
	try {
	Class.forName("org.postgresql.Driver");
	Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SAI BHARATH KUMAR", "postgres", "Sai@123456");
	Statement st=con.createStatement();
	DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
	Document doc = docBuilder.parse (new File("C:\\Users\\Admin\\eclipse-workspace\\JAVA ARRAY\\src\\Assignments\\roseindia.xml"));
	doc.getDocumentElement().normalize();
	System.out.println ("Root element of the doc is " + doc.getDocumentElement().getNodeName());
	NodeList nodeList = doc.getElementsByTagName("employee1");
	for (int itr = 0; itr < nodeList.getLength(); itr++)   
	{  
	Node node = nodeList.item(itr);  
	System.out.println("\nNode Name :" + node.getNodeName());  
	if (node.getNodeType() == Node.ELEMENT_NODE)   
	{  
	Element eElement = (Element) node;    
	String name  = eElement.getElementsByTagName("name").item(0).getTextContent();  
	String address =  eElement.getElementsByTagName("address").item(0).getTextContent();  
	int r=st.executeUpdate("insert into public.employee1(name,address) values("+name+","+address+")");
	con.close();
	}  
	}  
	System.out.println("Data is successfully inserted!");
	}
	catch (Exception e)   
	{  
	e.printStackTrace();  
	}
	}
}
