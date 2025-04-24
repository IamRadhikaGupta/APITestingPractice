package Base;

import java.io.FileInputStream;
import java.util.Properties;

public class TestBase {

    public TestBase(){
try{
    Properties prop=new Properties();
    FileInputStream fi=new FileInputStream("C:\\Users\\radhi\\IdeaProjects\\APIAutomationPractice\\src\\test\\resources\\config.properties");
    prop.load(fi);
}
catch(Exception e){

}
    }
}
