package makeSomeCoffy;

import makeSomeCoffy.IngradientsAndMore.command;
import makeSomeCoffy.IngradientsAndMore.cup;
import makeSomeCoffy.IngradientsAndMore.patern;

import java.util.Scanner;

public class coffyMachine{
    command ourCommand = new command();
    public cup makeDrink(){
        System.out.println("Enter drinkType and how much sugar you wanna ( in C:2 format for example )");
        Scanner in1 = new Scanner(System.in);
        String a = in1.nextLine();
        patern ourPattern = ourCommand.resolve(a);
        cup yourDrink = new cup();
        yourDrink.ingradients1 = new Object[ourPattern.ingradients.length]; // Some pointless code from here
        for (int i = 0; i < ourPattern.ingradients.length; i++){
            yourDrink.ingradients1[i] = ourPattern.ingradients[i];
        }                                                                   // to here. i know i know (.❛ ᴗ ❛.)
        return yourDrink;
    }
}
