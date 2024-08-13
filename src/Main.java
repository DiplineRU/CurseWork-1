public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.setEmployees(new Employee("Sarah", "Shishkin", "Olegovna", 1, 10_000, 1));
        employeeBook.setEmployees(new Employee("Artem", "Gulyan", "Sergeevich", 2, 12_000, 2));
        employeeBook.setEmployees(new Employee("Pavel", "Komarov", "Olegovich", 3, 14_000, 3));
        employeeBook.setEmployees(new Employee("Mariya", "Chudinova", "Mongolovna", 4, 16_000, 4));
        employeeBook.setEmployees(new Employee("Anna", "Horobrova", "Igorevna", 5, 18_000, 5));
        employeeBook.setEmployees(new Employee("Vladislav", "Polugarov", "Igorevich", 1, 20_000, 6));
        employeeBook.setEmployees(new Employee("Evgeniy", "Kolesnikov", "Polupoker", 2, 22_000, 7));
        employeeBook.printAll();
        employeeBook.removeEmployee(3);
        employeeBook.changeSalary("Shishkin", 50_000);
        employeeBook.changeDepartment("Shishkin", 4);
        employeeBook.printEmployeeByDepartment();
        employeeBook.printEmployee();
        employeeBook.printSalary();
        employeeBook.minSalary();
        employeeBook.maxSalary();
        employeeBook.midlSalary();
        employeeBook.printFIO();
        employeeBook.indexSalary();
        employeeBook.minSalaryInDepartment(3);
        employeeBook.maxSalaryInDepartment(3);
        employeeBook.salaryInDepartment(1);
        employeeBook.midlSlararyInDepartment(5);
        employeeBook.indexForDepartment(1, 5);
        employeeBook.printEmployeeForOneDepartment(5);
        employeeBook.salaryLessNumber(19000);
        employeeBook.salaryHigherNumber(18900);
    }
}