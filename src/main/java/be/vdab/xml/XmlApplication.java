package be.vdab.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//Spring verwerkt dit bestand bij de start v/d website
@ImportResource("beans.xml")
@SpringBootApplication
public class XmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmlApplication.class, args);
    }

}
