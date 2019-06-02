package fr.wildcodeschool.thewizardproject.models;


public class Dumbeldore implements Wizard {
    private ChangeDressColor myChangeDressColor;

    @Override
    public String giveAdvice(){
        return "I'm the top !";
    }

    public void setChangeDressColor(ChangeDressColor theChangeDress) {
        myChangeDressColor = theChangeDress;
    }

    public String sayChangeDressColor() {
        return myChangeDressColor.changeDress();
    }
}
