package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("Gandalf")
public class Gandalf implements Wizard {


    @Override
    public String giveAdvice(){
        return "Salut les mecs!";
    }

    @Override
    public String changeDress() {
        // TODO Auto-generated method stub
        return null;
    }
}

