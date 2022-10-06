package com.bezkoder.spring.files.csv.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
  @Column(name = "id")
  //@GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "omc_upw_i")
  private String omcUpwI;

  @Column(name = "short_name")
  private String shortName;

  @Column(name = "omc_name")
  private String omcName;

  @Column(name = "co_dn")
  private String coDn;

  @Column(name = "ne_release")
  private String neRelease;

  @Column(name = "ne_state")
  private String neState;

  @Column(name = "kpi")
  private String kpi;

  @Column(name = "date")
  private String date;

  public Tutorial() {

  }

  @Override
  public String toString() {
    return "Tutorial{" +
            "id=" + id +
            ", omcUpwI='" + omcUpwI + '\'' +
            ", shortName='" + shortName + '\'' +
            ", omcName='" + omcName + '\'' +
            ", coDn='" + coDn + '\'' +
            ", neRelease='" + neRelease + '\'' +
            ", neState='" + neState + '\'' +
            ", kpi='" + kpi + '\'' +
            ", date='" + date + '\'' +
            '}';
  }

  public String getCoDn() {
    return coDn;
  }

  public void setCoDn(String coDn) {
    this.coDn = coDn;
  }

  public String getNeRelease() {
    return neRelease;
  }

  public void setNeRelease(String neRelease) {
    this.neRelease = neRelease;
  }

  public String getNeState() {
    return neState;
  }

  public void setNeState(String neState) {
    this.neState = neState;
  }

  public String getKpi() {
    return kpi;
  }

  public void setKpi(String kpi) {
    this.kpi = kpi;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getOmcUpwI() {
    return omcUpwI;
  }

  public void setOmcUpwI(String omcUpwI) {
    this.omcUpwI = omcUpwI;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getOmcName() {
    return omcName;
  }

  public void setOmcName(String omcName) {
    this.omcName = omcName;
  }

  public Tutorial(long id, String omcUpwI, String shortName, String omcName, String coDn, String neRelease, String neState, String kpi, String date) {
    this.id = id;
    this.omcUpwI = omcUpwI;
    this.shortName = shortName;
    this.omcName = omcName;
    this.coDn = coDn;
    this.neRelease = neRelease;
    this.neState = neState;
    this.kpi = kpi;
    this.date = date;
  }
}
