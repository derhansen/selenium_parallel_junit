package selenium;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Assert;
import org.junit.runner.notification.Failure;

public class ParallelTest {

    @Test
    public void runTests() {
        Class[] cls={SeleniumTest.class};

        // Run tests parallel among methods
        Result result = JUnitCore.runClasses(ParallelComputer.methods(), cls);

        String failures = "";

        if (!result.wasSuccessful()) {
            System.out.print("Tests failed with " + result.getFailureCount() + " error(s).\n");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString() + "\n");
                failures += failure.toString() + "\n";
            }
        }

        Assert.assertTrue(failures, result.wasSuccessful());

        // Run tests parallel among classes
        //JUnitCore.runClasses(ParallelComputer.methods(), cls);

        // Run all tests parallel for all methods in all classes
        //JUnitCore.runClasses(new ParallelComputer(true, true), cls);
    }
}
