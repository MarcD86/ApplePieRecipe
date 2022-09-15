package src;

public class Main {

    public static void main (String[] args){


        ApplePieRecipe recept = new ApplePieRecipe();
       recept.voorVerwarmenOven1();
       recept.eiVerdelen2();
       recept.eiMengen3();
       recept.appels4();
       recept.springvorm5();
       recept.deeg6();
       recept.appelsInVorm7();
       recept.deegSnijden8();
       recept.deegUitleggen9();
       recept.ovenInstellen10();

       ApplePieRecipe test = new ApplePieRecipe();

         test.printIngredients();


    }
}