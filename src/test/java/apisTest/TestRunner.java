package apisTest;

import static org.junit.jupiter.api.Assertions.*;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;
import java.io.IOException;

class TestRunner {

    @Test
    void testParallel() throws IOException {
        Results results = Runner.builder().relativeTo(getClass()).debugMode(true)
                .outputCucumberJson(true)
                .parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }
}
