//Problem: AgeValidation
//Concept Using => Local & Anonymous Class

import java.time.LocalDate;
import java.time.Period;

interface calculateAge{
    int getAge();
}

public class AgeValidationBasic {

    LocalDate dateofBirth;

    //implementation using local class
    /*boolean isEligibleLocal(){
        //local class
        class calculateAge{
            int getAge(){
                Period p1 = Period.between(dateofBirth, LocalDate.now());
                return p1.getYears();
            }
        }
        calculateAge a1=new calculateAge();
        int age=a1.getAge();
        return age>60;
    }*/

    //implementation with anonymous class
    boolean isEligibleAnonymous(){
        calculateAge a1=new calculateAge(){
            public int getAge(){
                Period p1 = Period.between(dateofBirth, LocalDate.now());
                return p1.getYears();
            }
        };

        int age=a1.getAge();
        return age>60;
    }


    public static void main(String[] args) {
        AgeValidationBasic p = new AgeValidationBasic();
        p.dateofBirth = LocalDate.of(2020 ,1, 1);
        if(p.isEligibleAnonymous()){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }

    }
}