package br.ufc.nuvem.patrimoniomanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = { "br.ufc.nuvem.patrimoniomanager" })
@EnableWebMvc
public class PatrimoniomanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatrimoniomanagerApplication.class, args);
    }

}
