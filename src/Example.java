import java.awt.List;
import java.util.*;

class Month {
    public enum MonthOfYear {

        January(31),
        February(28),
        March(31),
        April(30),
        May(31),
        June(30),
        July(31),
        August(31),
        September(30),
        November(30),
        December(31);

        private int value;

        MonthOfYear(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public String toString() {
            return "Amount of days = " + value;
        }
    }
}

// Створіть метод, який дозволяє сортувати одновимірний масив обєктів класу
// Студент по будь яким його властивостям(вік або зріст , або прізвище).
// Масив та умова сортування повинні передаватися як параметр методу.

class Student {
    private String studentName;
    private int studentAge;

    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    String getName() { return studentName; }
    int getAge() { return studentAge; }
}

class StudentNameComparator implements Comparator<Student> {
    public int compare(Student st1, Student st2) {
        return st1.getName().compareTo(st2.getName());
    }
}

class StudentAgeComparator implements Comparator<Student> {
    public int compare(Student st1, Student st2) {
        return Integer.compare(st1.getAge(), st2.getAge());
    }
}

// Создайте интерфейс Спортивный с методами , присущими спортивной
// деятельности по любому виду спорта. Имплементируйте его в классах
// Волейболист, Футболист, Борец, Лыжник,Боксер Создайте массив
// типа Спортивный и заполните его разными спортсменами.
// Продемонстрируйте полиморфизм , пробежавшись по массиву в foreach

interface Sports {
    void pushBall();
    void putOnTheShoulder();
    int countTheRound(int counter);
    void overtakeAnOpponent();
}

class VolleyballPlayer implements Sports {
    public int scoreOfPlay;
    public String winnerOfPlay;

    public VolleyballPlayer(int scoreOfPlay, String winnerOfPlay) {
        this.scoreOfPlay = scoreOfPlay;
        this.winnerOfPlay = winnerOfPlay;
    }

    @Override
    public void pushBall() {
        System.out.println("Push the ball");
    }

    @Override
    public void putOnTheShoulder() {
        System.out.println("Round is over");
    }

    @Override
    public int countTheRound(int counter) {
        return 0;
    }

    @Override
    public void overtakeAnOpponent() {

    }
}

class FootballPlayer implements Sports {
    public int countOfScore;
    public String winnerOfPlay;

    public FootballPlayer(int countOfScore, String winnerOfPlay) {
        this.countOfScore = countOfScore;
        this.winnerOfPlay = winnerOfPlay;
    }

    @Override
    public void pushBall() {
        System.out.println("Push the ball");
    }

    @Override
    public void putOnTheShoulder() {
        System.out.println("Round is over");
    }

    @Override
    public int countTheRound(int counter) {
        return 0;
    }

    @Override
    public void overtakeAnOpponent() {

    }
}

class Boxer implements Sports {
    public int amountOfRounds;
    public String nameOfOpponent;

    public Boxer(int amountOfRounds, String nameOfOpponent) {
        this.amountOfRounds = amountOfRounds;
        this.nameOfOpponent = nameOfOpponent;
    }

    @Override
    public void pushBall() {

    }

    @Override
    public void putOnTheShoulder() {

    }

    @Override
    public int countTheRound(int counter) {
        return counter;
    }

    @Override
    public void overtakeAnOpponent() {

    }
}

class Fighter implements Sports {
    public int scoreOfPlay;
    public String winnerOfPlay;
    public String nameOfFighter;

    public Fighter(int scoreOfPlay, String winnerOfPlay, String nameOfFighter) {
        this.scoreOfPlay = scoreOfPlay;
        this.winnerOfPlay = winnerOfPlay;
        this.nameOfFighter = nameOfFighter;
    }

    @Override
    public void pushBall() {

    }

    @Override
    public void putOnTheShoulder() {

    }

    @Override
    public int countTheRound(int counter) {
        return counter;
    }

    @Override
    public void overtakeAnOpponent() {

    }

    @Override
    public String toString() {
        return "Fighter{" +
                "scoreOfPlay=" + scoreOfPlay +
                ", winnerOfPlay='" + winnerOfPlay + '\'' +
                ", nameOfFighter='" + nameOfFighter + '\'' +
                '}';
    }
}

class Skier implements Sports {
    public int amountOfPlayers;
    public int amountOfWinPlayers;
    public float scoreOfPlayers;


    public Skier(int amountOfPlayers, int amountOfWinPlayers, float scoreOfPlayers) {
        this.amountOfPlayers = amountOfPlayers;
        this.amountOfWinPlayers = amountOfWinPlayers;
        this.scoreOfPlayers = scoreOfPlayers;
    }

    @Override
    public void pushBall() {

    }

    @Override
    public void putOnTheShoulder() {

    }

    @Override
    public int countTheRound(int counter) {
        return counter;
    }

    @Override
    public void overtakeAnOpponent() {

    }
}

// В тренажерный зал пускают только клиентов , которые умеют
// тренироваться- это и школьники, и пенсионеры , и студенты и
// дворники- в общем любые профессии.Создайте модель по которой в
// зал может попасть только умеющий тренироваться, если есть свободное
// место в зале. Примените интерфейсы для обобщения поведения.

interface ClientOfGym {
    void addClientToGym();
    boolean doExercise();
    boolean verifyAmountOfClients();
}

class Gym implements ClientOfGym {
    private String typeOfHuman;
    private int capacityOfGym;
    private int ageOfClient;
    private int timeOfTraining;
    ArrayList<Gym> clientsOfGym = new ArrayList<Gym>();

    public Gym() {}

    public Gym(String typeOfHuman, int capacityOfGym, int ageOfClient, int timeOfTraining) {
        this.typeOfHuman = typeOfHuman;
        this.capacityOfGym = capacityOfGym;
        this.ageOfClient = ageOfClient;
        this.timeOfTraining = timeOfTraining;
    }

    String getTypeOfHuman() { return typeOfHuman; }
    int getCapacityOfGym() { return capacityOfGym; }
    int getAgeOfClient() { return ageOfClient; }
    int getTimeOfTraining() { return timeOfTraining; }

    @Override
    public void addClientToGym() {
        clientsOfGym.add(new Gym("Student", 25, 19, 0));
        clientsOfGym.add(new Gym("Pensioner", 25, 85, 30));
        clientsOfGym.add(new Gym("Schoolboy", 25, 15, 40));
    }

    @Override
    public boolean doExercise() {
        boolean permission = false;
        ArrayList<Integer> trainingTime = new ArrayList<Integer>();
        for(int i = 0; i < clientsOfGym.size(); i++) {
            trainingTime.add(clientsOfGym.get(i).getTimeOfTraining());
            if(trainingTime.get(i) <= 0) {
                permission = false;
                System.out.println(clientsOfGym.get(i).getTypeOfHuman() + " cannot train here");
            } else {
                permission = true;
            }
        }
        return permission;
    }

    public boolean verifyAmountOfClients() {
        boolean permission = false;
        int countFreePlaces = clientsOfGym.get(0).getCapacityOfGym() - clientsOfGym.size();
        if(countFreePlaces >= 0) {
            permission = true;
        }

        return permission;
    }

    @Override
    public String toString() {
        return "Client {" +
                "typeOfHuman=" + typeOfHuman +
                ", capacityOfGym='" + capacityOfGym + '\'' +
                ", ageOfClient='" + ageOfClient + '\'' +
                ", timeOfTraining='" + timeOfTraining + '\'' +
                '}';
    }
}

// Продемонстрируйте в коде 2 способа  обработки исключительных
// ситуаций в методе (с try-catch и  throws) , а также особенности
// использования блока finally. В качестве обрабатываемого
// исключения перехватите ошибку деления на 0.

class DemoExceptions {
    int DivNumbers(int a, int b) {
        int res;
        try {
            res = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }
        finally {
            res = 0;
        }
        return res;
    }

    int OtherDivNumbers(int x, int y) throws Exception {
        int result = 0;
        try {
            if(y == 0 || x == 0) throw new Exception("Divide by zero exc");
            result = x / y;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}