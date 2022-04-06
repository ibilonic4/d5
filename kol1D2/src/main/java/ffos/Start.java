/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class Start {
    private List<Evidencija> evidencije = new ArrayList<>();
    
    public Start(){
        ucitajEvidencije();
        ispisPjesama();
        
    }
    
    public static void main(String[] args) {
        new Start();
    }

    private void ucitajEvidencije() {

String s;
while(true){
ucitajEvidenciju();
s=JOptionPane.showInputDialog("unesi n za prekid");
if(s.trim().toLowerCase().equals("n")){break;}

    }
    
    
    
    
    
    
    
    
}

    private void ucitajEvidenciju() {


    JOptionPane.showMessageDialog(null, "unos nove evidencije");
        
       Evidencija e = new Evidencija();
       
       e.setNaziv(Pomocno.ucitajString("naziv"));
       e.setOsoba(Pomocno.ucitajString("osoba"));
       e.setPjesme(new ArrayList<>());
        
       
       String f;
while(true){   
    
    JOptionPane.showMessageDialog(null, "Slijedi unos pjesaka");
e.getPjesme().add(ucitajPjesmu());
f=JOptionPane.showInputDialog("unesi slovo k za prekid, sve drugo nastavlja program");
    if (f.toLowerCase().equals("k"))
   
  { break;}
} 
       
        evidencije.add(e);



    }

    private Pjesma ucitajPjesmu() {
Pjesma p = new Pjesma();
p.setIzvodjac(Pomocno.ucitajString("autor"));
p.setNaziv(Pomocno.ucitajString("naziv"));

return p;

    }

    private void ispisPjesama() {
ArrayList<Pjesma> lista = new ArrayList<>();

        Map<Pjesma,Integer> pjesme = new HashMap<>();
        Integer i =0;
        
        for (Evidencija e : evidencije){
        for(Pjesma p : e.getPjesme()){
        lista.add(p);
        }
        }

for(Pjesma p : lista){
 i= pjesme.get(p);
 pjesme.put(p, (i==null) ? 1 : i+1);
}

for(Map.Entry<Pjesma, Integer> val : pjesme.entrySet()){
if(val.getValue()>=2){
    System.out.println(val.getKey() + " " + val.getValue());
}
}
       

    }







}