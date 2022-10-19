package za.ac.cput.classcommunicator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import za.ac.cput.classcommunicator.ui.libraryGUI;

import java.awt.*;

@SpringBootApplication
public class ClassCommunicatorApplication {

    public static void main(String[] args) {
        var ctx = new SpringApplicationBuilder(libraryGUI.class)
                .headless(false)
                .run(args);

        EventQueue.invokeLater(() -> {
            var ex = ctx.getBean(libraryGUI.class);
            ex.setVisible(true);
        });
    }

}
