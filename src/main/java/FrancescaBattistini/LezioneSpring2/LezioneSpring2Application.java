package FrancescaBattistini.LezioneSpring2;

import FrancescaBattistini.LezioneSpring2.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LezioneSpring2Application {

	public static void main(String[] args) {
		SpringApplication.run(LezioneSpring2Application.class, args);


	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(LezioneSpring2Application.class);// passando questa invece solo della classe con @Configuration ,
	// dico all'app prendi tutte le classi che hanno quest'ultima e non solo quella .
	Menu menu = ctx.getBean(Menu.class);
 menu.stampaMenu();
 ctx.close();
}
}
