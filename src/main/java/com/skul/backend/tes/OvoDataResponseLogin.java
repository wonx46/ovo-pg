package com.skul.backend.tes;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/*
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "token", "tokenSeed", "timeStamp", "tokenSeedExpiredAt", "displayMessage", "email", "fullName",
		"isEmailVerified", "isSecurityCodeSet", "updateAccessToken" })*/
public class OvoDataResponseLogin {

//	@JsonProperty("token")
	private String token;
//	@JsonProperty("tokenSeed")
	private String tokenSeed;
//	@JsonProperty("timeStamp")
	private Date timeStamp;
//	@JsonProperty("tokenSeedExpiredAt")
	private Date tokenSeedExpiredAt;
//	@JsonProperty("displayMessage")
	private String displayMessage;
//	@JsonProperty("email")
	private String email;
//	@JsonProperty("fullName")
	private String fullName;
//	@JsonProperty("isEmailVerified")
	private boolean isEmailVerified;
//	@JsonProperty("isSecurityCodeSet")
	private boolean isSecurityCodeSet;
//	@JsonProperty("updateAccessToken")
	private String updateAccessToken;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTokenSeed() {
		return tokenSeed;
	}

	public void setTokenSeed(String tokenSeed) {
		this.tokenSeed = tokenSeed;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Date getTokenSeedExpiredAt() {
		return tokenSeedExpiredAt;
	}

	public void setTokenSeedExpiredAt(Date tokenSeedExpiredAt) {
		this.tokenSeedExpiredAt = tokenSeedExpiredAt;
	}

	public String getDisplayMessage() {
		return displayMessage;
	}

	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public boolean isEmailVerified() {
		return isEmailVerified;
	}

	public void setEmailVerified(boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}

	public boolean isSecurityCodeSet() {
		return isSecurityCodeSet;
	}

	public void setSecurityCodeSet(boolean isSecurityCodeSet) {
		this.isSecurityCodeSet = isSecurityCodeSet;
	}

	public String getUpdateAccessToken() {
		return updateAccessToken;
	}

	public void setUpdateAccessToken(String updateAccessToken) {
		this.updateAccessToken = updateAccessToken;
	}

}
