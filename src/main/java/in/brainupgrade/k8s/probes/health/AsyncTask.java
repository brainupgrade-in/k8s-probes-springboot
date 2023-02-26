package in.brainupgrade.k8s.probes.health;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AsyncTask {
    @Autowired
    private ManualHealthHolder manualHealthHolder;
    @Async
    public void startAsync() throws InterruptedException {
        Thread.sleep(1000 * 30);
        manualHealthHolder.switchHealth();
    }
}
