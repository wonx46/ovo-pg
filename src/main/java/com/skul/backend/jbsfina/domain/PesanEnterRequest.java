package com.skul.backend.jbsfina.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "port",
    "phone_no",
    "message",
    "filename",
    "group_name"
})
public class PesanEnterRequest {

//	@JsonProperty("port")
//	private String port;
	
	@JsonProperty("key")
	private String key;
	
	@JsonProperty("phone_no")
	private String phoneNumber;
	
	@JsonProperty("message")
	private String message;
	
	@JsonProperty("filename")
	private String fileName;
	
	@JsonProperty("group_name")
	private String groupName;
	
	

//	@JsonProperty("port")
//	public String getPort() {
//		return port;
//	}
//
//	@JsonProperty("port")
//	public void setPort(String port) {
//		this.port = port;
//	}

	@JsonProperty("key")
	public String getKey() {
		return key;
	}

	@JsonProperty("key")
	public void setKey(String key) {
		this.key = key;
	}

	@JsonProperty("phone_no")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@JsonProperty("phone_no")
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("filename")
	public String getFileName() {
		return fileName;
	}

	@JsonProperty("filename")
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@JsonProperty("group_name")
	public String getGroupName() {
		return groupName;
	}

	@JsonProperty("group_name")
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	
}
