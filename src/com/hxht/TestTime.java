package com.hxht;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
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

public class TestTime {

	public static void main(String[] args) {

//        String formatData = "Jan 13, 2016 9:04:42 AM";
//        try {
//            Date date = new Date(formatData);
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            formatData = formatter.format(date);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(formatData);
		List<String> allStr= getExistVideoFile2();
		for(String temp: allStr) {
			System.out.println(temp);
		}
		System.out.println("Over");
    }
	
    public static List<String> getExistVideoFile2(){
        List<String> allVideo = new ArrayList<>();
//        if ((Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED))) {
            // 选择自己的文件夹
            String path = "C:\\Users\\YangBei\\Videos";
            // Constants.video_url 是个常量，代表存放视频的文件夹
            File mediaStorageDir = new File(path );
            if (mediaStorageDir.exists()) {
                String [] allPath = mediaStorageDir.list();
                for(int i =0; i<allPath.length; i++) {
                	allVideo.add(mediaStorageDir+File.separator+allPath[i]);
                }
            }

            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyMMddHHmmss");
            String imageFileName = "V" + simpleDateFormat.format(new Date());
            String suffix = ".mp4";

//        }
            
        return allVideo;
    }
}
