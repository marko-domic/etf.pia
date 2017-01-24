package entity;
// Generated Jan 24, 2017 8:19:08 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Rezervacija generated by hbm2java
 */
public class Rezervacija  implements java.io.Serializable {


     private Long idRez;
     private Dan dan;
     private Festival festival;
     private Korisnik korisnik;
     private Boolean paket;
     private Integer brojUlaznica;
     private Date vremeRez;
     private String status;

    public Rezervacija() {
    }

	
    public Rezervacija(Dan dan, Festival festival, Korisnik korisnik) {
        this.dan = dan;
        this.festival = festival;
        this.korisnik = korisnik;
    }
    public Rezervacija(Dan dan, Festival festival, Korisnik korisnik, Boolean paket, Integer brojUlaznica, Date vremeRez, String status) {
       this.dan = dan;
       this.festival = festival;
       this.korisnik = korisnik;
       this.paket = paket;
       this.brojUlaznica = brojUlaznica;
       this.vremeRez = vremeRez;
       this.status = status;
    }
   
    public Long getIdRez() {
        return this.idRez;
    }
    
    public void setIdRez(Long idRez) {
        this.idRez = idRez;
    }
    public Dan getDan() {
        return this.dan;
    }
    
    public void setDan(Dan dan) {
        this.dan = dan;
    }
    public Festival getFestival() {
        return this.festival;
    }
    
    public void setFestival(Festival festival) {
        this.festival = festival;
    }
    public Korisnik getKorisnik() {
        return this.korisnik;
    }
    
    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
    public Boolean getPaket() {
        return this.paket;
    }
    
    public void setPaket(Boolean paket) {
        this.paket = paket;
    }
    public Integer getBrojUlaznica() {
        return this.brojUlaznica;
    }
    
    public void setBrojUlaznica(Integer brojUlaznica) {
        this.brojUlaznica = brojUlaznica;
    }
    public Date getVremeRez() {
        return this.vremeRez;
    }
    
    public void setVremeRez(Date vremeRez) {
        this.vremeRez = vremeRez;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


