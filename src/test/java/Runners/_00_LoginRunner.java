package Runners;


import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
       tags = "@SmokeTest,@Regression",
       features = {"src/test/java/FeatureFiles/_00_Login.feature"},
       glue = {"StepDefinitions"},
       plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _00_LoginRunner extends AbstractTestNGCucumberTests{

    @AfterClass
    public  static void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name", "Aygul Abilova");
        ExtentService.getInstance().setSystemInfo("Application Name", "mersys.io");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Extra row", "Explanation");
        ExtentService.getInstance().setSystemInfo("Extra row", "Explanation");
    }
}