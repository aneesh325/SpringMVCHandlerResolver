package com.test.core;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//import com.google.gson.Gson;

public class CoreTest {
	
	
	public static void main(String[] args) throws IOException {
		
//		System.out.println("enter first number to be added");
//		
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		System.out.println("enter second number to be added");
//
//		int b = sc.nextInt();
//
//		CoreTest c = new CoreTest();
		
//		c.addition(a,b);
//		c.reverse("java");
	
//		duplicateCharCount("JavaJ2EE22");
		OptionMarkingEngine engine = new OptionMarkingEngine();
while(sc.hasNext()) {
	engine.handleEvent(sc.nextLine());
}
/*		String jsonstr = "";
	   
		jsonstr = new String ( Files.readAllBytes( Paths.get("C:\\test\\jsonString.txt") ) );
	
//	System.out.println(jsonstr);
	engine.handleEvent(jsonstr);*/
	}
	
	
	    
	    public static class OptionMarkingEngine {
	        public OptionMarkingEngine() { }

	        public void handleEvent(String jsonEvent) {
        		System.out.println(jsonEvent);

	        	StringBuilder completeJson = new StringBuilder();;
	        /*	while(jsonEvent.equals("}")) {
	        		completeJson = completeJson.append(jsonEvent);
	        		System.out.println(jsonEvent);

	        	}*/
//        		System.out.println(completeJson);
	        	if(jsonEvent.contains("time")) {
//	        	Gson gson = new Gson();
//	        	JsonObj marker = gson.fromJson(jsonEvent, JsonObj.class);
//	        	System.out.println(marker.toString());
	        	}
	        }
	    }
	
	
	
	
	
	
	
	
	
	

	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println((a+b));
	}
	
	public void reverse(String str) {
		StringBuffer strBuffer = new StringBuffer(str);
		strBuffer.reverse();
		String revStr = new String();
		for(int i = str.length()-1; i>=0; i-- ) {
			revStr = revStr.concat(str.charAt(i)+"");
		}
		System.out.println(revStr);
		
	}
public class JsonObj {
	
	private String type;
	private String symbol;
	private String order_id;
	private String side;
	private Integer quantity;
	private String time;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "JsonObj [type=" + type + ", symbol=" + symbol + ", orderId=" + order_id + ", side=" + side
				+ ", quantity=" + quantity + ", time=" + time + "]";
	}

	
	

	
	}
	
	static void duplicateCharCount(String inputString)
    {
        //Creating a HashMap containing char as key and it's occurrences as value
 
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
 
        //Converting given string to char array
 
        char[] strArray = inputString.toCharArray();
 
        //checking each char of strArray
 
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
 
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
 
                charCountMap.put(c, 1);
            }
        }
 
        //Getting a Set containing all keys of charCountMap
 
        Set<Character> charsInString = charCountMap.keySet();
 
        System.out.println("Duplicate Characters In "+inputString);
 
        //Iterating through Set 'charsInString'
 
        for (Character ch : charsInString)
        {
            if(charCountMap.get(ch) > 1)
            {
                //If any char has a count of more than 1, printing it's count
 
                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }
		

}


