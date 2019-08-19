package com.skul.backend.enumz;

public enum HttpClientType implements IType {
	
	HttpClient("HttpClient"), OkHttpClient("OkHttpClient");
	
	
	private String name;

	private HttpClientType(String name) {
		this.name = name;
	}
	
	public String getString() {
		// TODO Auto-generated method stub
		return name;
	}

	public String[] getItems() {
		// TODO Auto-generated method stub
		return new String[] {  HttpClient.getString() , OkHttpClient.getString()};
	}
	
}
