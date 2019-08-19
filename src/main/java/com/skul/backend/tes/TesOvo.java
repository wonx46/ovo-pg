package com.skul.backend.tes;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TesOvo {
	
	static String BASE_ENDPOINT = "https://api.ovo.id/";
	static String LOGIN = "v2.0/api/auth/customer/login2FA";
	static String LOGIN_VERIFY = "v2.0/api/auth/customer/login2FA/verify";
	static String AWS = "https://apigw01.aws.ovo.id/";
	static String appid = "C7UMRSMFRZ46D9GW9IK7";
	static String AppVersion="2.8.0";
	static String OS_NAME = "Android";
	static String OS_VERSION = "8.1.0";
	static String MAC_ADDRESS = "02:00:00:44:55:66";
	static String deviceId = "5d1fa7f9-fd99-3bae-95d5-67fedb901502";
	static String mobile = "081902512555";
	static String pushNotificationId = "FCM|f4OXYs_ZhuM:APA91bGde-ie2YBhmbALKPq94WjYex8gQDU2NMwJn_w9jYZx0emAFRGKHD2NojY6yh8ykpkcciPQpS0CBma-MxTEjaet-5I3T8u_YFWiKgyWoH7pHk7MXChBCBRwGRjMKIPdi3h0p2z7";
	
	

	public static void main(String[] args) {
		
		doLogin();
//		String smscode = "7115";
//		String refid   = "743a606065874437be35416b4c6efe51";
//		doLoginVeryfy(smscode, refid);
		
		
		

	}

	private static void doLoginVeryfy(String smscode, String refid) {
		 ObjectMapper mapper = new ObjectMapper();
			
			try {
				RestTemplate restTemplate = new RestTemplate();
				
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON);
				
				OvoData rest = new OvoData();
				rest.setDeviceId(deviceId);
				rest.setMobile(mobile);
				rest.setVerificationCode(smscode);
				rest.setRefId(refid);
				rest.setAppVersion(AppVersion);
				rest.setDeviceId(deviceId);
				rest.setMacAddress(MAC_ADDRESS);
				rest.setMobile(mobile);
				rest.setOsName(OS_NAME);
				rest.setOsVersion(OS_VERSION);
				rest.setPushNotificationId(pushNotificationId);
				
				
				HttpEntity<OvoData> request = new HttpEntity<OvoData>(rest,headers);
				
				ResponseEntity<String> exchange = restTemplate.exchange(BASE_ENDPOINT+LOGIN_VERIFY, HttpMethod.POST, request, String.class);
				System.out.println("code: "+exchange.getStatusCodeValue());
				System.out.println("body: "+exchange.getBody());
				
//				OvoResp resp = mapper.readValue(exchange.getBody(),OvoResp.class);
//				System.out.println(resp.getRefId());
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

	private static void doLogin() {
		 ObjectMapper mapper = new ObjectMapper();
			
			try {
				RestTemplate restTemplate = new RestTemplate();
				
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON);
				headers.set("app-id", appid);
				headers.set("App-Version", AppVersion);
				
				OvoData rest = new OvoData();
				rest.setDeviceId(deviceId);
				rest.setMobile(mobile);
				
				HttpEntity<OvoData> request = new HttpEntity<OvoData>(rest,headers);
				
				ResponseEntity<String> exchange = restTemplate.exchange(BASE_ENDPOINT+LOGIN, HttpMethod.POST, request, String.class);
				System.out.println("code: "+exchange.getStatusCodeValue());
				System.out.println("body: "+exchange.getBody());
				
				OvoResp resp = mapper.readValue(exchange.getBody(),OvoResp.class);
				System.out.println(resp.getRefId());
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

}
