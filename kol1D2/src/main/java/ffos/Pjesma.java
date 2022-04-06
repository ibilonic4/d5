/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

/**
 *
 * @author Ivor
 */
public class Pjesma {
    private String izvodjac;
    private String naziv;

    public Pjesma() {
    }

    public Pjesma(String izvodjac, String naziv) {
        this.izvodjac = izvodjac;
        this.naziv = naziv;
    }

    
    
    public String getIzvodjac() {
        return izvodjac;
    }

    public void setIzvodjac(String izvodjac) {
        this.izvodjac = izvodjac;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
return izvodjac + ": " +naziv;    }

    @Override
    public boolean equals(Object o) {
        
        if(this==o){return true;}
        if(o == null || getClass() != o.getClass()){return false;}
        
        Pjesma pjsm = (Pjesma) o;
        
        if(!izvodjac.equals(pjsm.getIzvodjac())){return false;}
        if(!naziv.equals(pjsm.getNaziv())){return false;}
        
        return true;
    }

    @Override
    public int hashCode() {
        
        int result = naziv.hashCode() + izvodjac.hashCode();
        result = 31 * result;
        
        return result;
        
    }
    
    
    
    
    
}
