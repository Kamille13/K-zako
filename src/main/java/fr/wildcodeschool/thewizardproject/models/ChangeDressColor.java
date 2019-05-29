package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class ChangeDressColor implements changeDressInterface {

     @Override
     public String changeDress() {
         return "The wizard's dress is blue";
     }

}
