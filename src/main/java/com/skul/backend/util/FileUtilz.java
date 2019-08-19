package com.skul.backend.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileUtilz {
	
	
	
	public final static void createFile(String[] listBody, String nohp, String path){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 try {
	        File myfile = new File(path+"/"+nohp+".txt");
	        List<String> lines = new ArrayList<>();
	        if(myfile.exists()){
	        	lines = FileUtils.readLines(myfile, 
	                    StandardCharsets.UTF_8.name());
	        }
	        
	        lines.add("Sending time: "+dateFormat.format(getTimeSending()));
	        for (String content : listBody) {
	        	 lines.add(content);
			}
	       
	        
			FileUtils.writeLines(myfile, 
				        StandardCharsets.UTF_8.name(), lines);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private static Date getTimeSending() {
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}

	public final static void createFileRekon(String nis, String path, String fileName){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		 try {
	        File myfile = new File(path+"/"+dateFormat.format(getTimeSending())+"-"+fileName+".txt");
	        List<String> lines = new ArrayList<>();
	        if(myfile.exists()){
	        	lines = FileUtils.readLines(myfile, 
	                    StandardCharsets.UTF_8.name());
	        }
	        
	        lines.add(nis);
	      
	        
			FileUtils.writeLines(myfile, 
				        StandardCharsets.UTF_8.name(), lines);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
