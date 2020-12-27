package cc.ztl.cool.Timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Taylor
 */

@Service
public class ScheduledService {

    @Scheduled(cron = "0/2 * * * * ?")
    public void schedule(){
        System.out.println("我该签到了");
    }
}
