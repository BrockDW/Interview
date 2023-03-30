import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static List<Employee> employeeList = new ArrayList<>();

//    Task:
//            1. Load Cvs file (or strings) and parse each line and load it as list of Java objects.
//            2. find out how many employees are over the age of 50 years today.
//            3. How many people live in following two city/state combination:
//            4. How many people have same last name?
//            5. print list of employees in ascending order of Code

    public static void loadEmployees(String csvName){
        String csvSep = ",";
        try(BufferedReader br = new BufferedReader(new FileReader(csvName))){
            br.readLine();
            String line;
            while ((line = br.readLine()) != null){

                String[] values = line.split(csvSep);
                employeeList.add(new Employee(values[0], values[1], values[2], values[3], values[4], values[5], values[6]));


            }
        } catch (IOException e){
            // do something
        }

        System.out.println(employeeList);
    }

    public static void main(String[] args) {
        loadEmployees("src/table.csv");
        System.out.println("Hello world!");
    }
}