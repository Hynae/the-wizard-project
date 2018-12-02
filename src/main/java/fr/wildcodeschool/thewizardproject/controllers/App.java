package fr.wildcodeschool.thewizardproject.controllers;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;



public class App {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface Dumbledore = context.getBean("Dumbledore", WizardInterface.class);
        context.close();
        System.out.println("******************");
        System.out.println(Dumbledore.giveAdvice());
        System.out.println("******************");
        System.out.println(Dumbledore.changeDress("red"));
    }
}