package step;

import core.DriverFactory;
import org.junit.Assert;
import page.VladPage;

public class VladPerformanceStep extends BackgroundSteps{

    VladPage vladPage =  new VladPage(DriverFactory.getDriver());

    public void testTimeResponseUnderHeavyLoad() {
        long responseStartTime = System.currentTimeMillis();
        long measureResponseTime = 3000;

        for (int i = 0; i < 100 ; i++) {
            goToURL();
            long responseEndTime = System.currentTimeMillis();
            long responseTime = responseEndTime - responseStartTime;

            Assert.assertTrue(responseTime < measureResponseTime);
        }
    }


}
