package in.brainupgrade.k8s.probes.health;

import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.stereotype.Component;

@Component
public class ManualHealthHolder {
    private AtomicBoolean healthy = new AtomicBoolean(false);
    public void switchHealth() {
        healthy.set(!healthy.get());
    }
    public boolean isHealthy() {
        return healthy.get();
    }
}
