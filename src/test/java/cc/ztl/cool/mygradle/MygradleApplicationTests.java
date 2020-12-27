package cc.ztl.cool.mygradle;

import cc.ztl.cool.Timer.ScheduledService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootTest
class MygradleApplicationTests {

    @Autowired
    ScheduledService scheduledService;
    @Test
    void contextLoads() {

        scheduledService.schedule();
    }

}
