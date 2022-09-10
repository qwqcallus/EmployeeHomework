import java.util.Random;
public class Employee {
    private String name;
    private char gender;
    private String birthdate;
    private String department;
    private String specialities;
    private int age;
    private double weight;
    private int salary = 1500;
    private int working = 0;
    Random rand = new Random();
    int low = 50;
    int high = 71;

        public Employee(String name, char gender, String birthdate, String department, String specialities, int age, double weight, int salary, int working) {
            this.name = name;
            this.gender = gender;
            this.birthdate = birthdate;
            this.department = department;
            this.specialities = specialities;
            this.age = age;
            this.weight = weight;
            this.salary = salary;
            this.working = working;
        }

        public String getName() {
            return name;
        }

        public char getGender() {
            return gender;
        }

        public String getBirthdate() {
            return birthdate;
        }

        public String getDepartment() {
            return department;
        }
        public String getSpecialities() {
            return specialities;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight = rand.nextInt(high-low) + low;
        }

        public int getSalary() {
            return salary;
        }

        public int getWorking() {
            return working;
        }
    }
