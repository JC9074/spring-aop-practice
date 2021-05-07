package idv.jia.springaoppractice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
// 策展方只要專注於自己的核心業務
public class Exhibition {

  @Value("策展人-${curator}: ")
  private String curator;

  public void exhibitService(){
    System.out.println(curator+ "負責佈展\n");
    System.out.println(curator+ "走出來跟參觀者打招呼\n");

  }

}
