package modele;
// Generated 2015-11-15 12:00:10 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tblfilm generated by hbm2java
 */
public class Tblfilm implements java.io.Serializable {

	private BigDecimal idfilm;
	private String titrefilm;
	private Date datesortiefilm;
	private String langueorigfilm;
	private BigDecimal dureefilm;
	private String resumefilm;
	private Set tblgenres = new HashSet(0);
	private Set tblrealisateurs = new HashSet(0);
	private Set tblcopies = new HashSet(0);
	private Set tblroles = new HashSet(0);
	private Set tblpaysproductions = new HashSet(0);
	private Set tblscenaristes = new HashSet(0);

	public Tblfilm() {
	}

	public Tblfilm(BigDecimal idfilm, String titrefilm) {
		this.idfilm = idfilm;
		this.titrefilm = titrefilm;
	}

	public Tblfilm(BigDecimal idfilm, String titrefilm, Date datesortiefilm, String langueorigfilm,
			BigDecimal dureefilm, String resumefilm, Set tblgenres, Set tblrealisateurs, Set tblcopies, Set tblroles,
			Set tblpaysproductions, Set tblscenaristes) {
		this.idfilm = idfilm;
		this.titrefilm = titrefilm;
		this.datesortiefilm = datesortiefilm;
		this.langueorigfilm = langueorigfilm;
		this.dureefilm = dureefilm;
		this.resumefilm = resumefilm;
		this.tblgenres = tblgenres;
		this.tblrealisateurs = tblrealisateurs;
		this.tblcopies = tblcopies;
		this.tblroles = tblroles;
		this.tblpaysproductions = tblpaysproductions;
		this.tblscenaristes = tblscenaristes;
	}

	public BigDecimal getIdfilm() {
		return this.idfilm;
	}

	public void setIdfilm(BigDecimal idfilm) {
		this.idfilm = idfilm;
	}

	public String getTitrefilm() {
		return this.titrefilm;
	}

	public void setTitrefilm(String titrefilm) {
		this.titrefilm = titrefilm;
	}

	public Date getDatesortiefilm() {
		return this.datesortiefilm;
	}

	public void setDatesortiefilm(Date datesortiefilm) {
		this.datesortiefilm = datesortiefilm;
	}

	public String getLangueorigfilm() {
		return this.langueorigfilm;
	}

	public void setLangueorigfilm(String langueorigfilm) {
		this.langueorigfilm = langueorigfilm;
	}

	public BigDecimal getDureefilm() {
		return this.dureefilm;
	}

	public void setDureefilm(BigDecimal dureefilm) {
		this.dureefilm = dureefilm;
	}

	public String getResumefilm() {
		return this.resumefilm;
	}

	public void setResumefilm(String resumefilm) {
		this.resumefilm = resumefilm;
	}

	public Set getTblgenres() {
		return this.tblgenres;
	}

	public void setTblgenres(Set tblgenres) {
		this.tblgenres = tblgenres;
	}

	public Set getTblrealisateurs() {
		return this.tblrealisateurs;
	}

	public void setTblrealisateurs(Set tblrealisateurs) {
		this.tblrealisateurs = tblrealisateurs;
	}

	public Set getTblcopies() {
		return this.tblcopies;
	}

	public void setTblcopies(Set tblcopies) {
		this.tblcopies = tblcopies;
	}

	public Set getTblroles() {
		return this.tblroles;
	}

	public void setTblroles(Set tblroles) {
		this.tblroles = tblroles;
	}

	public Set getTblpaysproductions() {
		return this.tblpaysproductions;
	}

	public void setTblpaysproductions(Set tblpaysproductions) {
		this.tblpaysproductions = tblpaysproductions;
	}

	public Set getTblscenaristes() {
		return this.tblscenaristes;
	}

	public void setTblscenaristes(Set tblscenaristes) {
		this.tblscenaristes = tblscenaristes;
	}

}
