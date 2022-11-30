package in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in28minutes.spring.learnspringframework.game.MarioGame;
import in28minutes.spring.learnspringframework.game.SuperContraGame;
import in28minutes.spring.learnspringframework.enterprise.MyWebController;
import in28minutes.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		// MarioGame game = new MarioGame();
		// SuperContraGame game = new SuperContraGame();
		// GameRunner runner = new GameRunner(game);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println( controller.returnFromService());
	}

}
