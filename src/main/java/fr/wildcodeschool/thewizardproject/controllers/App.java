package fr.wildcodeschool.thewizardproject.controllers;
import fr.wildcodeschool.thewizardproject.models.ChangeDressColor;
import fr.wildcodeschool.thewizardproject.models.Gandalf;
import fr.wildcodeschool.thewizardproject.models.Wizard;

public class App {

    public void start() {

        Wizard myWizard = new Gandalf();
        System.out.println("");
        System.out.println("******************");
        System.out.println(myWizard.giveAdvice());
        System.out.println("******************");
        ChangeDressColor myChangeDress = new ChangeDressColor();
        ((Gandalf) myWizard).setChangeDressColor(myChangeDress);
        System.out.println(((Gandalf) myWizard).sayChangeDressColor());
    }
}
