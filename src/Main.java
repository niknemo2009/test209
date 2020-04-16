import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====The first Task=====");

        Month.MonthOfYear getSomeMonth = Month.MonthOfYear.March;
        System.out.println(getSomeMonth);

        System.out.println("=====The second Task=====");

        Comparator<Student> compareStud = new StudentAgeComparator();
        List<Student> students = new Vector<>();
        students.add(new Student("Оксана Крокодил", 19));
        students.add(new Student("Вася Карниз", 23));
        students.add(new Student("Дима Обознался", 18));
        students.add(new Student("Галя Застрижена", 19));
        students.add(new Student("Антон Дирижабль", 22));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        for(Student st : students) {
            System.out.println(st.getName() + " " + st.getAge());
        }

        /*
        Collections.sort(students1,new StudentAgeComparator());
        Collections.sort(students1,(x,w)->x.getAge()-w.getAge());
        System.out.println(students1);
        */
        System.out.println("=====The third Task=====");

        Fighter[] sportsman = {
                new Fighter(6, "Синий", "Коля"),
                new Fighter(3, "Красний", "Вася"),
                new Fighter(8, "Синий", "Петя"),
                new Fighter(2, "Синий", "Гриша"),
        };

        for (Fighter ft : sportsman){
            System.out.println(ft);
        }

        System.out.println("=====The fourth Task=====");

        Gym clientOfGym = new Gym();
        clientOfGym.addClientToGym();
        boolean getTimePermission = clientOfGym.doExercise();
        boolean getAmountPermission = clientOfGym.verifyAmountOfClients();
        if(getTimePermission && getAmountPermission) {
            System.out.println("Others can train here");
        } else {
            System.out.println("Others cannot train here");
        }


        System.out.println("=====The fifth Task=====");

        DemoExceptions exc = new DemoExceptions();
        int div1 = exc.DivNumbers(2, 1);
        System.out.println(div1);

        //int div2 = exc.OtherDivNumbers(1, 0);
        //System.out.println(div2);

    }
}
