package src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ApplePieRecipe {

    // ingredient object instantieren waarbij je de methode met de parameters aanroept


    Ingredient roomboter = new Ingredient(200, "gram", "ongezouten roomboter" );
    Ingredient witteBastardSuiker = new Ingredient(200, "gram", "witte bastard suiker" );
    Ingredient bakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel" );
    Ingredient ei = new Ingredient(1, "stuk(s)", "ei" );
    Ingredient vanilleSuiker = new Ingredient(8, "gram", "vanille suiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient zoetZureAppels = new Ingredient(1500, "gram", "zoetzure appels");
    Ingredient suiker = new Ingredient(75, "gram", "kristal suiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");

    public Ingredient[] ingredients = {roomboter, witteBastardSuiker, bakmeel, ei, vanilleSuiker, zout, zoetZureAppels, suiker, kaneel, paneermeel};

    public void printIngredients() {

        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
        }
    }

    @Override
    public String toString() {
        return "ApplePieRecipe{" + "roomboter=" + roomboter + ", witteBastardSuiker=" + witteBastardSuiker +
                ", bakmeel=" + bakmeel +
                ", ei=" + ei +
                ", vanilleSuiker=" + vanilleSuiker +
                ", zout=" + zout +
                ", zoetZureAppels=" + zoetZureAppels +
                ", suiker=" + suiker +
                ", kaneel=" + kaneel +
                ", paneermeel=" + paneermeel +
                '}';
    }

    public void voorVerwarmenOven1(){
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void eiVerdelen2(){
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void eiMengen3(){
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void appels4(){
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void springvorm5(){
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void deeg6(){
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void appelsInVorm7(){
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void deegSnijden8(){
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void deegUitleggen9(){
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void ovenInstellen10(){
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }


//    public static void autoList(){
//
//    }

}
