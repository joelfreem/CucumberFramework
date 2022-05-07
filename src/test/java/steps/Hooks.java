package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    @Before
    public void start(){
        openBrowserAndLauchApplication();
    }

    @After
    public void end(Scenario scenario){

        byte[] pic;
        //scenario class from cucumber holds complete information of our execution
        if(scenario.isFailed()){
            pic = takesScreenshot("failed/"+scenario.getName());
        }else{
            pic = takesScreenshot("passed/"+ scenario.getName());
        }

        //it will attach the pic in report
        scenario.attach(pic, "image/png", scenario.getName());
        tearDown();
    }

}
