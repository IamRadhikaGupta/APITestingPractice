package POSTCALLS;

import org.apache.juneau.json.JsonSerializer;
import org.testng.annotations.Test;

public class SerializePojoWithArray {
    String[] suppliers;

    @Test
    public void test(){
        String[] suppliers={"amazon","meesho","myntra"};
     POJOClasswithArrayVariable obj=new POJOClasswithArrayVariable(suppliers,"900","maxi");

     //Pojo to json
        JsonSerializer serializer=JsonSerializer.DEFAULT_READABLE;
       String str= serializer.serialize(obj);

       System.out.println(str);




    }
}
