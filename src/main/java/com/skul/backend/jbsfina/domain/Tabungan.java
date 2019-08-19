package com.skul.backend.jbsfina.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the tabungan database table.
 * 
 */
@Entity
@NamedQuery(name="Tabungan.findAll", query="SELECT t FROM Tabungan t")
public class Tabungan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer replid;

	private String alasan;

	private BigDecimal debet;

	private int idtabungan;

	private String info1;

	private String info2;

	private String info3;

	private byte issync;

	private String keterangan;

	private BigDecimal kredit;

	private String nis;

	private String petugas;

	@Temporal(TemporalType.TIMESTAMP)
	private Date tanggal;

	private int token;

	private Timestamp ts;

	//bi-directional many-to-one association to Jurnal
	@ManyToOne
	@JoinColumn(name="idjurnal")
	private Jurnal jurnal;

	public Tabungan() {
	}

	public Integer getReplid() {
		return this.replid;
	}

	public void setReplid(Integer replid) {
		this.replid = replid;
	}

	public String getAlasan() {
		return this.alasan;
	}

	public void setAlasan(String alasan) {
		this.alasan = alasan;
	}

	public BigDecimal getDebet() {
		return this.debet;
	}

	public void setDebet(BigDecimal debet) {
		this.debet = debet;
	}

	public int getIdtabungan() {
		return this.idtabungan;
	}

	public void setIdtabungan(int idtabungan) {
		this.idtabungan = idtabungan;
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

	public BigDecimal getKredit() {
		return this.kredit;
	}

	public void setKredit(BigDecimal kredit) {
		this.kredit = kredit;
	}

	public String getNis() {
		return this.nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getPetugas() {
		return this.petugas;
	}

	public void setPetugas(String petugas) {
		this.petugas = petugas;
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

	public Timestamp getTs() {
		return this.ts;
	}

	public void setTs(Timestamp ts) {
		this.ts = ts;
	}

	public Jurnal getJurnal() {
		return this.jurnal;
	}

	public void setJurnal(Jurnal jurnal) {
		this.jurnal = jurnal;
	}

}