package com.hxht;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.synth.SynthSpinnerUI;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import com.google.gson.Gson;
import com.hxht.json.MsgBean;
import com.hxht.json.MsgBeanNew;

public class TestString {

	public static void main(String[] args) {
//		String json1 = "{\"Id\":185,\"Type\":\"Fire\",\"Status\":1}";
//		String json1 = "{\"Id\":185,\"Type\":\"Fire\"}";
//		Gson gson = new Gson();
//		MsgBean msg = gson.fromJson(json1, MsgBean.class);
//		System.out.println(msg.Id);
//		
//		MsgBeanNew msg2 = gson.fromJson(json1, MsgBeanNew.class);
//		System.out.println(msg2.Status);
		
//		ArrayList<String> allStr = new ArrayList<>();
//		allStr.add("cheng");
//		allStr.add("jun");
//		System.out.println(allStr.size());
//		allStr = new ArrayList();
//		System.out.println(allStr.size());
//		
//		String oldStr = "121.V0.2";
//		System.out.println(substringAfter(oldStr, "V"));
//		String time = "1218";
//		System.out.println(isValidTime(time));
//		
//		ArrayList<String> resourceTypes = new ArrayList<>();
//		resourceTypes.add("好水");
//		resourceTypes.add("好D");
//		resourceTypes.add("好C");
//		resourceTypes.add("好水");
//		resourceTypes.add("好水");
//		resourceTypes.add("好B");
//		resourceTypes.add("好A");
//		System.out.println(resourceTypes.size());
		
//		ArrayList<String> alldata = new ArrayList();
//		System.out.println(alldata.toArray());
//		
//        for (int n = 0; n < resourceTypes.size(); n++) {
//            if (resourceTypes.get(n).contains("水")) {
//                resourceTypes.remove(n);
//            }
//        }
//        System.out.println(resourceTypes.size());
//        System.out.println(resourceTypes.toString());
		
//        for (Iterator<String> iterator = resourceTypes.iterator(); iterator.hasNext(); ) {
//            String resourceType = iterator.next();
//            if (resourceType.contains("水"))
//                iterator.remove();
//        }
//      System.out.println(resourceTypes.toString());
        
        
//        TimeZone.setDefault(
//        		TimeZone.getTimeZone("CST"));
//        try{   
//        	String d = "Wed Jan 15 00:00:00 CST 2014";   
//        	SimpleDateFormat formatter = new SimpleDateFormat("E MM dd hh:mm:ss z yyyy");   
//        	Date date = formatter.parse(d);   
//        	System.out.println(date);
////        	SimpleDateFormat format = new SimpleDate(Format("yyyy-MM-dd HH:mm:ss");   
////        	String dd =format.format(date );   
////        	Date ddd;   ddd = format.parse(dd);   
////        	System.out.println("dd>>>>  "+dd);   
////        	System.out.println("ddd>>>  "+format.format(ddd));
//      
//        } catch(Exception ex) {ex.printStackTrace();}
        
//        String s = "Tue Jul 12 00:00:00 GMT+08:00 2016";
//        String s = "May, 2018 6:44:56";
////        SimpleDateFormat sf1 = new SimpleDateFormat("EEE MMM dd hh:mm:ss z yyyy", Locale.ENGLISH);
//        SimpleDateFormat sf1 = new SimpleDateFormat("MMM, yyyy hh:mm:ss", Locale.ENGLISH);
//        Date date = new Date();
//		try {
//			date = sf1.parse(s);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(sf2.format(date));
//		Date d = new Date("May 14, 2018 6:44:56 PM");
//      try{   
//
//    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
//    	String dd =format.format(d);   
//    	Date ddd;   ddd = format.parse(dd);   
//    	System.out.println("dd>>>>  "+dd);   
//    	System.out.println("ddd>>>  "+format.format(ddd));
//  
//    } catch(Exception ex) {ex.printStackTrace();}
//		System.out.println(d.toString());
//		
//	}
//    private static String substringAfter(String oldStr, String mark){
//        String result = oldStr;
//        if(oldStr != null){
//            int index = oldStr.indexOf(mark);
//            if(index >= 0){
//                result = oldStr.substring(index+1, oldStr.length());
//            }
//        }
//        return result;
		
		String oldStr = "60:94:A7:7C:91:1F:93:40:2D:21:79:6E:08:67:C0:82";
		oldStr = oldStr.replace(":", "");
		System.out.println(oldStr.toLowerCase());
//		String method = "/basedata/InterfaceCon";
//		String print = getMD5(method);
//		System.out.println(print.length());
//		System.out.println(print);
    }
    public static String getMD5(String str) {

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(str.getBytes("UTF-8"));
            byte[] encryption = md5.digest();
            System.out.println(encryption.length);

            StringBuffer strBuf = new StringBuffer();
            for (int i = 0; i < encryption.length; i++) {
                if (Integer.toHexString(0xff & encryption[i]).length() == 1) {
                    strBuf.append("0").append(Integer.toHexString(0xff & encryption[i]));
                } else {
                    strBuf.append(Integer.toHexString(0xff & encryption[i]));
                }
            }
            return strBuf.toString();
        } catch (NoSuchAlgorithmException e) {
            return "";
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
    
    private static final String REGEX_TIME = "[0-9]+[0-9]:[0-9][0-9]";

    public static boolean isValidTime(String address) {
        Pattern p = Pattern.compile(REGEX_TIME);
        Matcher m = p.matcher(address);
        return m.matches();
    }
}
