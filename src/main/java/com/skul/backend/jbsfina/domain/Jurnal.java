package com.skul.backend.jbsfina.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the jurnal database table.
 * 
 */
@Entity
@NamedQuery(name="Jurnal.findAll", query="SELECT j FROM Jurnal j")
public class Jurnal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer replid;

	private String idpetugas;

	private int idtahunbuku;

	private String info1;

	private String info2;

	private String info3;

	private byte issync;

	private String keterangan;

	private String nokas;

	private String petugas;

	private String sumber;

	@Temporal(TemporalType.DATE)
	private Date tanggal;

	private int token;

	private String transaksi;

	private Timestamp ts;

	//bi-directional many-to-one association to Tabungan
	@OneToMany(mappedBy="jurnal", fetch=FetchType.EAGER)
	private List<Tabungan> tabungans;

	public Jurnal() {
	}

	public Integer getReplid() {
		return this.replid;
	}

	public void setReplid(Integer replid) {
		this.replid = replid;
	}

	public String getIdpetugas() {
		return this.idpetugas;
	}

	public void setIdpetugas(String idpetugas) {
		this.idpetugas = idpetugas;
	}

	public int getIdtahunbuku() {
		return this.idtahunbuku;
	}

	public void setIdtahunbuku(int idtahunbuku) {
		this.idtahunbuku = idtahunbuku;
	}

	public String getInfo1() {
		return this.info1;
	}

	public void setInfo1(String info1) {
		this.info1 = info1;
	}

	public String getInfo2() {
		return this.info2;
	}

	public void setInfo2(String info2) {
		this.info2 = info2;
	}

	public String getInfo3() {
		return this.info3;
	}

	public void setInfo3(String info3) {
		this.info3 = info3;
	}

	public byte getIssync() {
		return this.issync;
	}

	public void setIssync(byte issync) {
		this.issync = issync;
	}

	public String getKeterangan() {
		return this.keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public String getNokas() {
		return this.nokas;
	}

	public void setNokas(String nokas) {
		this.nokas = nokas;
	}

	public String getPetugas() {
		return this.petugas;
	}

	public void setPetugas(String petugas) {
		this.petugas = petugas;
	}

	public String getSumber() {
		return this.sumber;
	}

	public void setSumber(String sumber) {
		this.sumber = sumber;
	}

	public Date getTanggal() {
		return this.tanggal;
	}

	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}

	public int getToken() {
		return this.token;
	}

	public void setToken(int token) {
		this.token = token;
	}

	public String getTransaksi() {
		return this.transaksi;
	}

	public void setTransaksi(String transaksi) {
		this.transaksi = transaksi;
	}

	public Timestamp getTs() {
		return this.ts;
	}

	public void setTs(Timestamp ts) {
		this.ts = ts;
	}

	public List<Tabungan> getTabungans() {
		return this.tabungans;
	}

	public void setTabungans(List<Tabungan> tabungans) {
		this.tabungans = tabungans;
	}

	public Tabungan addTabungan(Tabungan tabungan) {
		getTabungans().add(tabungan);
		tabungan.setJurnal(this);

		return tabungan;
	}

	public Tabungan removeTabungan(Tabungan tabungan) {
		getTabungans().remove(tabungan);
		tabungan.setJurnal(null);

		return tabungan;
	}

}