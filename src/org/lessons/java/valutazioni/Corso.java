package org.lessons.java.valutazioni;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Corso {
    private ArrayList<Studente>studentiTot = new ArrayList<>();

    public void getStudents(ArrayList<Studente>studentiTot){
        for (Studente studente: studentiTot){
            System.out.println(studente);
        }


    }
    public void removeStudent(ArrayList<Studente>studentiTot,int ID){
        studentiTot.remove(ID);

    }
    public void addStudent(ArrayList<Studente>studentiTot,Studente nuovoStudente){
        studentiTot.remove(nuovoStudente);

    }
    public  void getPercStudentiPromossi (ArrayList<Studente>studentiTot){
        ArrayList<Studente>promossi= new ArrayList<>();
        for (Studente studente:studentiTot){
            if (studente.getStudentResult()){
                promossi.add(studente);

            }


        }
        double perPromossi =(promossi.size()*100.0/studentiTot.size());
        DecimalFormat df = new DecimalFormat("#.##");
        String perPromossiFormatted = df.format(perPromossi);
        System.out.println("la percentuale di studenti promossi è:"+perPromossiFormatted + "%");
        System.out.println("ecco gli studenti promossi: ");
        for (Studente studentepromosso : promossi){
            System.out.println(studentepromosso);
        }
    }
}

