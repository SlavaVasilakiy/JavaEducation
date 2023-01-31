
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class Main
{
    private static String staffFile = "D:\\GeekBrains\\Coding_language_education_java" +
            "\\JavaEducation\\JavaEducation\\src\\Practice\\SkillBox_02\\data\\staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        ArrayList<Employee> staff = loadStaffFromFile();





//        LRUCache<Employee> cache = new LRUCache<>(5);
//
//        for(Employee employee : staff) {
//            cache.addElement(employee);
//        }
//
//        System.out.println(cache.getElement(4).getSalary());
//
//        cache.getAllElements().forEach(System.out::println);

//        staff.stream().map(e -> e.getSalary())
//                .filter(s -> s >= 99999)
//                .reduce((s1, s2) -> s1 + s2)
//                .ifPresent(System.out::println);

//        Stream<Employee> stream = staff.stream();
//        stream.filter(employee -> employee.getSalary() >= 99999).forEach(System.out::println);




        /* 1 vaiant
                Collections.sort(staff, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2)
                    {
                        return o1.getSalary().compareTo(o2.getSalary());
                    }
                });
        */

        // 2 variant
        // Collections.sort(staff, (o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));



// 1 variant
//        for (Employee employee : staff)
//        {
//            System.out.println(employee);
//        }

// 2 variant
//        staff.forEach(employee -> System.out.println(employee));

// 3 variant
//        System.out.println("Old list salaries: ");
//        staff.forEach(System.out::println);


        
// 1 variant
//        staff.forEach(employee -> {
//            int salary = employee.getSalary();
//            employee.setSalary(salary + 9999);
//        });

// 2 variant
//        staff.forEach(e -> e.setSalary(e.getSalary() + 9999));



//        System.out.println("\nNew list salaries: ");
//        staff.forEach(System.out::println);
    }


    private static ArrayList<Employee> loadStaffFromFile()
    {
        ArrayList<Employee> staff = new ArrayList<>();
        try
        {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for(String line : lines)
            {
                String[] fragments = line.split("\t");
                if(fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}