

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.TreeSet;
public class TreeSetRead {

    public static void main(String... args)  throws IOException{
        long start = System.nanoTime();
        var fileName = "C:\\Users\\ramon\\Desktop\\CSC\\WK7\\Sample500.csv";
        // it is a good habit to check if the file can be found using java code
        var filePath = Paths.get(fileName);
        if(!Files.exists(filePath)){
            System.out.println("The File "+ fileName + " Could not be found");
            return;
        }
       
        var userData = new TreeSet<String>();
        var readStream = Files.newBufferedReader (filePath);
        var data = readStream.readLine();
        
        System.out.println("SerialNumber CompanyNumber EmployeeMarkme Description Leave");
        while (data != null) {
            data = readStream.readLine();
            if(data==null){
                break;
            }
            if(data.trim().length()==0){
                continue;
            }
            userData.add(data);
        }
        for (var userInfo : userData){
            System.out.println(userInfo);
            }
            long end = System.nanoTime();
            long elapsedTime = end - start;
            System.out.println("Nanoseconds to process:" + elapsedTime);

    }
}