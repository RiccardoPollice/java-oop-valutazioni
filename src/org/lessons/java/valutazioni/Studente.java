package org.lessons.java.valutazioni;

public class Studente {
    private int id;
    private static int counter = 1;
    private int absencesPer;
    private double averageGrades;


    public Studente (int absencesPer, double averageGrades) {
        this.id = counter++;
        this.absencesPer = absencesPer;
        this.averageGrades = averageGrades;
    }

    public final int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAbsencesPer() {
        return absencesPer;
    }

    public void setAbsencesPer(int absencesPer) {
        this.absencesPer = absencesPer;
    }

    public double getAverageGrades() {
        return averageGrades;
    }

    public void setAverageGrades(double averageGrades) {
        this.averageGrades = averageGrades;
    }
    public boolean getStudentResult(){
        if (absencesPer>50){
            return false;
        }
        if (absencesPer>25 && absencesPer<50 && averageGrades<=2){
            return false;
        }
        if (absencesPer<25 && averageGrades<2){
            return false;
        }
        else {
            return true;
        }
    }
    @Override
    public String toString() {
        return "id:"+id+ " percentuale assenze= "+ absencesPer+" %"+ " media voti: "+averageGrades;
    }


}
