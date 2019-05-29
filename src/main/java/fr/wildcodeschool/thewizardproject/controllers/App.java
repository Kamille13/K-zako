package fr.wildcodeschool.thewizardproject.controllers;
import fr.wildcodeschool.thewizardproject.models.Wizard;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        Wizard myWizard = context.getBean("Dumbeldore", Wizard.class);

        context.close();

        System.out.println("");
        System.out.println("******************");
        System.out.println(myWizard.giveAdvice());
        System.out.println("******************");
        System.out.println(myWizard.changeDress());
    }
}
