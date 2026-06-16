package test;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;

public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Starting JUnit 5 Test Runner...");
        
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
            .selectors(selectPackage("test"))
            .build();
            
        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);
        
        TestExecutionSummary summary = listener.getSummary();
        System.out.println("\n--- TEST EXECUTION SUMMARY ---");
        summary.printTo(new java.io.PrintWriter(System.out, true));
        
        if (summary.getTestsFailedCount() > 0) {
            System.out.println("\n--- DETAILED FAILURES ---");
            for (TestExecutionSummary.Failure failure : summary.getFailures()) {
                System.out.println("Test: " + failure.getTestIdentifier().getDisplayName());
                System.out.println("Source: " + failure.getTestIdentifier().getSource().orElse(null));
                System.out.println("Error: " + failure.getException().toString());
                failure.getException().printStackTrace(System.out);
                System.out.println("-------------------------");
            }
            System.out.println("\nSome tests FAILED.");
            System.exit(1);
        } else {
            System.out.println("\nAll tests PASSED successfully.");
            System.exit(0);
        }
    }
}
