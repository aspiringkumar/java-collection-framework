package learningCollection;

import java.util.HashMap;

public class mapEg {
    public static void main(String[] args) {
        HashMap<String,Integer>  courses = new HashMap<>();
        courses.put("core java",4000);
        courses.put("python",3000);
        courses.put("collection",5000);
        courses.put("spring",5000);
        System.out.println(courses);

        courses.forEach((e1,e2) ->{
            System.out.println(e1+ "=>" + e2);
        });

        System.out.println(courses.get("core java"));
    }
}
