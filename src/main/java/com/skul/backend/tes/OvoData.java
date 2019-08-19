package com.skul.backend.tes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "deviceId",
    "mobile",
    "appVersion",
    "macAddress",
    "osName",
    "osVersion",
    "pushNotificationId",
    "refId",
    "verificationCode"
    
    
})
public class OvoData {
	
	@JsonProperty("deviceId")
	private String deviceId;
	
	@JsonProperty("mobile")
	private String mobile;
	
	@JsonProperty("appVersion")
	private String appVersion;
	
	@JsonProperty("macAddress")
	private String macAddress;
	
	@JsonProperty("osName")
	private String osName;
	
	@JsonProperty("osVersion")
	private String osVersion;
	
	@JsonProperty("pushNotificationId")
	private String pushNotificationId;
	
	@JsonProperty("refId")
	private String refId;
	
	@JsonProperty("verificationCode")
	private String verificationCode;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getPushNotificationId() {
		return pushNotificationId;
	}

	public void setPushNotificationId(String pushNotificationId) {
		this.pushNotificationId = pushNotificationId;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}
	
	

}
