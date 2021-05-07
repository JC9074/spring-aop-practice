package idv.jia.springaoppractice.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 切面類別，重複且邊緣的事情由它處理
@Aspect
// 即便是定義為切面，但仍是一個Bean，需要註譯為@Component
@Component
public class Venue {

  @Value("展覽場地-${organized} : ")
  String prsentationVenue;

  // PointcutExpression => 指定所有的Service方法
  @Pointcut("execution(* *Service(..))")
  public void pointCutForAllServiceInService() {
  }

  @Before("pointCutForAllServiceInService()")
  public void before() {

    System.out.println("====> "+prsentationVenue + "負責收門票錢\n");
    System.out.println("====> "+prsentationVenue + "負責幫忙量體溫\n");
  }

  @After("execution(public void exhibitService())")
  public void after() {

    System.out.println(prsentationVenue + "負責打掃場地 <=======\n" );
  }

}

