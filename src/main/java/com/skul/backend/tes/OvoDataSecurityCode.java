package com.skul.backend.tes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "deviceUnixtime",
    "securityCode",
    "updateAccessToken",
    "message"    
    
})
public class OvoDataSecurityCode {

	@JsonProperty("deviceUnixtime")
	private String deviceUnixtime;
	@JsonProperty("securityCode")
	private String securityCode;
	@JsonProperty("updateAccessToken")
	private String updateAccessToken;
	@JsonProperty("message")
	private String message;
	public String getDeviceUnixtime() {
		return deviceUnixtime;
	}
	public void setDeviceUnixtime(String deviceUnixtime) {
		this.deviceUnixtime = deviceUnixtime;
	}
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public String getUpdateAccessToken() {
		return updateAccessToken;
	}
	public void setUpdateAccessToken(String updateAccessToken) {
		this.updateAccessToken = updateAccessToken;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
