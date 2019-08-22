package com.skul.backend.tes;

import java.text.SimpleDateFormat;
import java.util.Date;

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
	static String LOGIN_SECURITY_CODE = "v2.0/api/auth/customer/loginSecurityCode/verify";
	static String BUDGET = "v1.0/budget/detail";
	static String BALANCE = "v1.0/api/front/";
	static String WALLETTRANSACTION = "wallet/v2/transaction?page=1&limit1&productType=001";
	static String LOGOUT = "v1.0/api/auth/customer/logout";
	static String AWS = "https://apigw01.aws.ovo.id/";
	static String appid = "C7UMRSMFRZ46D9GW9IK7";
	static String AppVersion="2.8.0";
	static String OS_NAME = "Android";
	static String OS_VERSION = "8.1.0";
	static String MAC_ADDRESS = "02:00:00:44:55:66";
	static String deviceId = "46A6F580BBC4BE81";
	static String mobile = "081902512555";
	static String pushNotificationId = "FCM|f4OXYs_ZhuM:APA91bGde-ie2YBhmbALKPq94WjYex8gQDU2NMwJn_w9jYZx0emAFRGKHD2NojY6yh8ykpkcciPQpS0CBma-MxTEjaet-5I3T8u_YFWiKgyWoH7pHk7MXChBCBRwGRjMKIPdi3h0p2z7";
	
	

	public static void main(String[] args) {
		
	//	doLogin();
//		String smscode = "7115";
//		String refid   = "743a606065874437be35416b4c6efe51";
		//doLoginVeryfy("4927", "89983ba4fc87471fb1a5ba5bc4ea56c6");
		//doLoginSecurityCode("123456", "2d8bb31e6a1a4e7e831856ff67b6dd01");
		
		String token="eyJhbGciOiJSUzI1NiJ9.eyJleHBpcnlJbk1pbGxpU2Vjb25kcyI6NjA0ODAwMDAwLCJjcmVhdGVUaW1lIjoxNTY2NDU0MjU5MjY2LCJzZWNyZXQiOiJGa21mNlU0VU9VOEl0Q0ZQdS8yVjhWeWxLOTVjbmg0Q09XczJ6SUpCdCtRVFVvQWR1Y1hpR3gxcjV6cDlCQm1lb25wV25vaU9GRW1Hc3VFdVZGK0FRbDVEQzhNdFZpZVJvVVVwOC9BQW1rSTBDNWZLeGt3RzZYeG5EOWVWeGdtMVVlTXVJdWlOaS9IK2pYUEowWFJLbnUxYUgxZ05rNHdLaUNRV3ZjVVV2Q3lVUXdHd3lIN2pXVDR6NWdPYWNiUFZqWXNHQVVZNFZ6RytocVI2Qlp6djJScGxLMmk3YXlwMnFqbjljUHIwdmtzNVBZSG9YSkorNlgxRDVkR1lxWStXaGc3anR0WWNtQVFXRzVJaVZrRjI3dFBrRFdwTTFDeUkxL3FhaXBqV0pHNzhxeFhnV1RtMnZEZEEySmIxYTBZZVlpNUZGK0dCU3FxRFhTM01sYTlQVlE9PSJ9.fxrvkEumy9olP-2E8ApoGORD1X5mvksQnAE2xDRC01Zn1j9WsFL7S_J5QYraSEaF-oueFbhZyYYoggFMKOPZpbx1i8mCG9OWU3rMDfyMJv4BZLTLmUP9sjMH_XwpQa8CrWGTxhpkMd0P5V2svxSjQV4PVoQ5TQMySQ8NgPBQRfpNykzppIpvQ8BNS_ViQd1wdxjwPgHUF7ASJAftrlIyhRLDMSWhxdTM4Rr_ApIXp0xVt5z0BwWq_0HYN3pWYg3xF_MiaplmgH2BYGuJahp5iR3CBs6-FvP8JumOBcGGAl0gsqlXKWmhK-LggxH7ky7NEMZt3xiVQN4y4_m8JsdyAg";
		doGetWalletTransaction(token);
	//	doLogout(token);
		
	}
	
	private static void doLoginSecurityCode(String securityCode, String updateAccessToken){
		try {
			RestTemplate restTemplate = new RestTemplate();
			
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("app-id", appid);
			headers.set("App-Version", AppVersion);
			
			OvoDataSecurityCode rest = new OvoDataSecurityCode();
			rest.setDeviceUnixtime("1543693061");
			rest.setSecurityCode(securityCode);
			rest.setUpdateAccessToken(updateAccessToken);
			rest.setMessage("");
			
			HttpEntity<OvoDataSecurityCode> request = new HttpEntity<OvoDataSecurityCode>(rest,headers);
			ResponseEntity<String> exchange = restTemplate.exchange(BASE_ENDPOINT+LOGIN_SECURITY_CODE, HttpMethod.POST, request, String.class);
			System.out.println("code: "+exchange.getStatusCodeValue());
			System.out.println("body: "+exchange.getBody());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private static void doLogout(String token){
		try {
			RestTemplate restTemplate = new RestTemplate();
			
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("app-id", appid);
			headers.set("App-Version", AppVersion);
			headers.set("Authorization", token);
			headers.set("OS", OS_NAME);
			
			HttpEntity<OvoDataSecurityCode> request = new HttpEntity<>(null,headers);
			
			ObjectMapper mapper2 = new ObjectMapper();
			try {
				System.out.println(mapper2.writeValueAsString(request));
			} catch (Exception e) {
				// TODO: handle exception
			}
			ResponseEntity<String> exchange = restTemplate.exchange(BASE_ENDPOINT+LOGOUT, HttpMethod.GET, request, String.class);
			System.out.println("code: "+exchange.getStatusCodeValue());
			System.out.println("body: "+exchange.getBody());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void doGetWalletTransaction(String token){
		try {
			RestTemplate restTemplate = new RestTemplate();
			
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.set("app-id", appid);
			headers.set("App-Version", AppVersion);
			headers.set("Authorization", token);
			headers.set("OS", OS_NAME);
			
			HttpEntity<OvoDataSecurityCode> request = new HttpEntity<>(null,headers);
			
			ObjectMapper mapper2 = new ObjectMapper();
			try {
				System.out.println(mapper2.writeValueAsString(request));
			} catch (Exception e) {
				// TODO: handle exception
			}
			ResponseEntity<String> exchange = restTemplate.exchange(BASE_ENDPOINT+WALLETTRANSACTION, HttpMethod.GET, request, String.class);
			System.out.println("code: "+exchange.getStatusCodeValue());
			System.out.println("body: "+exchange.getBody());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void doLoginVeryfy(String smscode, String refid) {
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
