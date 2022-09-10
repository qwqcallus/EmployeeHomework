public class MainProgram {
    public static void main(String[] args) {
        Employee e1 = new Employee("Callus Heisenberg", 'm', "4.10.2007", "A38", "Is a furry owo", 14, 60, 1500, 0);
        System.out.println(" Name: " + e1.getName() + "\n Gender: " + e1.getGender() + "\n Birthdate: " + e1.getBirthdate() + "\n Department: " + e1.getDepartment() + "\n Specialities: " + e1.getSpecialities() + "\n Age: " + e1.getAge() + "\n Weight: " + e1.getWeight() + "\n Salary: " + e1.getSalary() + "\n Working Experience: " + e1.getWorking());

        if(e1.getWeight() > 65) {
            System.out.println(" Fettsack :^(");
        }
    }
}
