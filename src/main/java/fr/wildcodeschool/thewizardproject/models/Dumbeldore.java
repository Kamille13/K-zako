package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Dumbeldore")
public class Dumbeldore implements Wizard {

    private changeDressInterface changeDress;

    @Autowired
    public Dumbeldore(@Qualifier("changeDressColor") changeDressInterface theChangeDress) {
        changeDress = theChangeDress;
    }

    @Override
    public String giveAdvice(){
        return "Je suis une machine !";
    }

    @Override
    public String changeDress()  {
        return this.changeDress.changeDress();
    }
}
