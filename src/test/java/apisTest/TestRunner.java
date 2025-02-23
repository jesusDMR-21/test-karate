package apisTest;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.jupiter.api.Assertions.*;

//import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
//import java.io.File;
import java.io.IOException;
//import java.util.*;

//import net.masterthought.cucumber.Configuration;
//import net.masterthought.cucumber.ReportBuilder;

class TestRunner {

    @Test
    void testParallel() throws IOException {
        Results results = Runner.builder().relativeTo(getClass()).debugMode(true)
                .outputCucumberJson(true)
                .parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
        // generateReport(results.getReportDir());
    }

    /*
     * public static void generateReport(String karateOutputPath) {
     * Collection<File> jsonFiles = FileUtils.listFiles(new File(karateOutputPath),
     * new String[] { "json" }, true);
     * List<String> jsonPaths = new ArrayList<String>(jsonFiles.size());
     * jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
     * Configuration config = new Configuration(new File("target"), "demo");
     * ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
     * reportBuilder.generateReports();
     * }
     */

}
