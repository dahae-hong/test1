package scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
 
// cron 스케줄러 클래스임을 선언하는 어노테이션.
@Component
public class Scheduler {
  // cron 문법으로 스케줄러가 실행되는 주기를 설정.(아래의 cron 스케줄 문법에 자세한 설명)
  @Scheduled(cron = "5 * * * * *") //초 분 시 일 월 요일 년도
  public void run() {
    System.out.println("cron test!!");
  }
}
//https://nowonbun.tistory.com/671