package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements Wizard {
    private ChangeDressColor myChangeDressColor;

    @Override
    public String giveAdvice(){
        return "I'm the best !";
    }
    public void setChangeDressColor(ChangeDressColor theChangeDress) {
        myChangeDressColor = theChangeDress;
    }

    public String sayChangeDressColor() {
        return myChangeDressColor.changeDress();
    }

}

