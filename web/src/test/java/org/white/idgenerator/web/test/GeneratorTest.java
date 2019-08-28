package org.white.idgenerator.web.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;
import org.white.idgenerator.service.service.IdGenerateService;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * <p></p >
 *
 * @author white
 * @version $Id: GeneratorTest.java, v 0.1 2019年08月27日 19:47:00 white Exp$
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneratorTest {

    @Autowired
    private IdGenerateService idGenerateService;

    @Test
    public void testGenId() throws InterruptedException {
        final Set<String> set = new HashSet<String>();
        final CountDownLatch countDownLatch = new CountDownLatch(5);
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                StopWatch stopWatch = new StopWatch();
                stopWatch.start();
                for (int i = 0; i < 10000000; i++) {
                    String id = idGenerateService.gen32Id();
                }
                stopWatch.stop();
                System.out.println("耗时：" + stopWatch.getTotalTimeMillis());
                countDownLatch.countDown();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                StopWatch stopWatch = new StopWatch();
                stopWatch.start();
                for (int i = 0; i < 10000000; i++) {
                    String id = idGenerateService.gen32Id();
                }
                stopWatch.stop();
                System.out.println("耗时：" + stopWatch.getTotalTimeMillis());
                countDownLatch.countDown();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                StopWatch stopWatch = new StopWatch();
                stopWatch.start();
                for (int i = 0; i < 10000000; i++) {
                    String id = idGenerateService.gen32Id();
                }
                stopWatch.stop();
                System.out.println("耗时：" + stopWatch.getTotalTimeMillis());
                countDownLatch.countDown();
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            public void run() {
                StopWatch stopWatch = new StopWatch();
                stopWatch.start();
                for (int i = 0; i < 10000000; i++) {
                    String id = idGenerateService.gen32Id();
                }
                stopWatch.stop();
                System.out.println("耗时：" + stopWatch.getTotalTimeMillis());
                countDownLatch.countDown();
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            public void run() {
                StopWatch stopWatch = new StopWatch();
                stopWatch.start();
                for (int i = 0; i < 10000000; i++) {
                    String id = idGenerateService.gen32Id();
                }
                stopWatch.stop();
                System.out.println("耗时：" + stopWatch.getTotalTimeMillis());
                countDownLatch.countDown();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        while (countDownLatch.getCount() != 0) {
            Thread.sleep(1000);
        }
    }
}
