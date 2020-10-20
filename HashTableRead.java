

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class HashTableRead {

    public static void main(String[] args) throws IOException{
    long start = System.nanoTime();
    var fileName = "C:\\Users\\ramon\\Desktop\\CSC\\WK7\\Sample500.csv";
    var filePath = Paths.get(fileName);
    if(!Files.exists(filePath)){
        System.out.println("The File " + fileName + " Colud not be found");
     }

     var userData = new HashMap<Integer,User>();
     var readStream = Files.newBufferedReader (filePath);
     var data = readStream.readLine();

     var key = 1;

     System.out.println("SerialNumber CompanyNumber EmployeeMarkme Description Leave");
     while (data != null) {
         data = readStream.readLine();
         if(data!=null){
             var elements = data.split(",");
             var user = new User();
             user.SerialNumber = elements [0];
             user.CompanyName = elements [1];
             user.EmployeeMarkme = elements [2];
             user.Description = elements [3];
             user.Leave = elements [4];

             userData.put(key, user);

             key++;
         }


     }
     for(Map.Entry<Integer,User> m: userData.entrySet()) {
         System.out.println(m.getValue().SerialNumber + ", "+ m.getValue().CompanyName+", "+m.getValue().EmployeeMarkme+", "+m.getValue().Description+", "+m.getValue().Leave);
     }
     long end = System.nanoTime();
     long elapsedTime = end - start;
     System.out.println("Nanoseconds to process:" + elapsedTime);
    }

}




