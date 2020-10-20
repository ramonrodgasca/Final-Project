

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ArrayRead {

    public static void main(String... args) throws IOException{
    long start = System.nanoTime();
    var fileName = "C:\\Users\\ramon\\Desktop\\CSC\\WK7Sample500.csv";
    var filePath = Paths.get(fileName);
    if(!Files.exists(filePath)){
        System.out.println("The File " + fileName + " Colud not be found");
     }

     var Array = new ArrayList<String>();
     var readStream = Files.newBufferedReader(filePath);
     var Sample500 = readStream.readLine();

     while(Sample500 !=null && Sample500.length()>0){
        Array.add(Sample500);
        Sample500 = readStream.readLine();
     }
     var userDetails=new ArrayList<User>();
     System.out.println("SerialNumber CompanyNumber EmployeeMarkme Description Leave");
     for (var userData : Array){
         var elements = userData.split(",");
         var user= new User();
         user.SerialNumber = elements [0];
         user.CompanyName = elements [1];
         user.EmployeeMarkme = elements [2];
         user.Description = elements [3];
         user.Leave = elements [4];
         userDetails.add(user);
     }

     for (var userInfo : userDetails) {
         System.out.println(userInfo.SerialNumber+ ", "+ userInfo.CompanyName + "," + userInfo.EmployeeMarkme + "," + userInfo.Description + "," + userInfo.Leave);
     }    

     long end = System.nanoTime();
     long elapsedTime = end - start;
     System.out.println("Nanoseconds to process:" + elapsedTime);

     // *** Arrays/collections are data strucutre in memory storage
      var userInfos = newArrayList<String>();

      var dataElementCount = 0;
      var readStream = Files.newBufferedReader(filePath);
      var data = readStream.readLine(); // skip the line as this line is usually the header

      //** new key word looping with Java key word while
      var delimeter = "";
      while (data !=null) { // ** null in java signifies that the value is unknown

            if (data.length() > 0){
                data = readStream.readLine(); // read the data line

                var elements = data.split(",|".toCharArray());
                for (var elementItem : elements) {
                    System.out.println(elementItem);
                }
                System.out.println("----------------");
            }
        }

    }
}