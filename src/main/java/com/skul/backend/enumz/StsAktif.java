package com.skul.backend.enumz;

public enum StsAktif implements IType {
	
	TIDAK_AKTIF("Tidak Aktif"), AKTIF("Aktif");
	
	
	private String name;

	private StsAktif(String name) {
		this.name = name;
	}
	
	public String getString() {
		// TODO Auto-generated method stub
		return name;
	}

	public String[] getItems() {
		// TODO Auto-generated method stub
		return new String[] {  TIDAK_AKTIF.getString() , AKTIF.getString()};
	}
	
}
