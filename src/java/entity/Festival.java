package entity;
// Generated Jan 24, 2017 7:49:35 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Festival generated by hbm2java
 */
public class Festival  implements java.io.Serializable {


     private Long idFest;
     private String naziv;
     private Date datumVremeOd;
     private Date datumVremeDo;
     private String mesto;
     private String status;
     private Double prosecnaOcena;
     private String info;
     private Integer maxRezUser;
     private Integer brojPregleda;
     private Double cenaPaket;
     private Double cenaDan;
     private Set rezervacijas = new HashSet(0);
     private Set izvodjacs = new HashSet(0);
     private Set links = new HashSet(0);
     private Set ocenas = new HashSet(0);
     private Set medias = new HashSet(0);
     private Set porukas = new HashSet(0);
     private Set komentars = new HashSet(0);
     private Set dans = new HashSet(0);

    public Festival() {
    }

    public Festival(String naziv, Date datumVremeOd, Date datumVremeDo, String mesto, String status, Double prosecnaOcena, String info, Integer maxRezUser, Integer brojPregleda, Double cenaPaket, Double cenaDan, Set rezervacijas, Set izvodjacs, Set links, Set ocenas, Set medias, Set porukas, Set komentars, Set dans) {
       this.naziv = naziv;
       this.datumVremeOd = datumVremeOd;
       this.datumVremeDo = datumVremeDo;
       this.mesto = mesto;
       this.status = status;
       this.prosecnaOcena = prosecnaOcena;
       this.info = info;
       this.maxRezUser = maxRezUser;
       this.brojPregleda = brojPregleda;
       this.cenaPaket = cenaPaket;
       this.cenaDan = cenaDan;
       this.rezervacijas = rezervacijas;
       this.izvodjacs = izvodjacs;
       this.links = links;
       this.ocenas = ocenas;
       this.medias = medias;
       this.porukas = porukas;
       this.komentars = komentars;
       this.dans = dans;
    }
   
    public Long getIdFest() {
        return this.idFest;
    }
    
    public void setIdFest(Long idFest) {
        this.idFest = idFest;
    }
    public String getNaziv() {
        return this.naziv;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public Date getDatumVremeOd() {
        return this.datumVremeOd;
    }
    
    public void setDatumVremeOd(Date datumVremeOd) {
        this.datumVremeOd = datumVremeOd;
    }
    public Date getDatumVremeDo() {
        return this.datumVremeDo;
    }
    
    public void setDatumVremeDo(Date datumVremeDo) {
        this.datumVremeDo = datumVremeDo;
    }
    public String getMesto() {
        return this.mesto;
    }
    
    public void setMesto(String mesto) {
        this.mesto = mesto;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Double getProsecnaOcena() {
        return this.prosecnaOcena;
    }
    
    public void setProsecnaOcena(Double prosecnaOcena) {
        this.prosecnaOcena = prosecnaOcena;
    }
    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }
    public Integer getMaxRezUser() {
        return this.maxRezUser;
    }
    
    public void setMaxRezUser(Integer maxRezUser) {
        this.maxRezUser = maxRezUser;
    }
    public Integer getBrojPregleda() {
        return this.brojPregleda;
    }
    
    public void setBrojPregleda(Integer brojPregleda) {
        this.brojPregleda = brojPregleda;
    }
    public Double getCenaPaket() {
        return this.cenaPaket;
    }
    
    public void setCenaPaket(Double cenaPaket) {
        this.cenaPaket = cenaPaket;
    }
    public Double getCenaDan() {
        return this.cenaDan;
    }
    
    public void setCenaDan(Double cenaDan) {
        this.cenaDan = cenaDan;
    }
    public Set getRezervacijas() {
        return this.rezervacijas;
    }
    
    public void setRezervacijas(Set rezervacijas) {
        this.rezervacijas = rezervacijas;
    }
    public Set getIzvodjacs() {
        return this.izvodjacs;
    }
    
    public void setIzvodjacs(Set izvodjacs) {
        this.izvodjacs = izvodjacs;
    }
    public Set getLinks() {
        return this.links;
    }
    
    public void setLinks(Set links) {
        this.links = links;
    }
    public Set getOcenas() {
        return this.ocenas;
    }
    
    public void setOcenas(Set ocenas) {
        this.ocenas = ocenas;
    }
    public Set getMedias() {
        return this.medias;
    }
    
    public void setMedias(Set medias) {
        this.medias = medias;
    }
    public Set getPorukas() {
        return this.porukas;
    }
    
    public void setPorukas(Set porukas) {
        this.porukas = porukas;
    }
    public Set getKomentars() {
        return this.komentars;
    }
    
    public void setKomentars(Set komentars) {
        this.komentars = komentars;
    }
    public Set getDans() {
        return this.dans;
    }
    
    public void setDans(Set dans) {
        this.dans = dans;
    }




}


