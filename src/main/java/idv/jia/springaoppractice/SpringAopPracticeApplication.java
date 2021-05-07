package idv.jia.springaoppractice;

import idv.jia.springaoppractice.service.Exhibition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:role.properties")
public class SpringAopPracticeApplication implements CommandLineRunner {
  @Autowired
  private Exhibition exhibition;


  @Override
  public void run(String... args){
    exhibition.exhibitService();
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringAopPracticeApplication.class, args);
  }

}
