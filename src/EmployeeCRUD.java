import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

public class EmployeeCRUD {
    private static List<Employee> employees = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    // CREATE
    public static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        employees.add(new Employee(id, name, dept));
        System.out.println("Employee added successfully.\n");
    }

    // READ
    public static void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.\n");
            return;
        }
        System.out.println("Employee List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
    }

    // UPDATE
    public static void updateEmployee() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                System.out.print("Enter New Name: ");
                String name = sc.nextLine();
                System.out.print("Enter New Department: ");
                String dept = sc.nextLine();
                emp.setName(name);
                emp.setDepartment(dept);
                System.out.println("Employee updated successfully.\n");
                return;
            }
        }
        System.out.println("Employee not found.\n");
    }

    // DELETE
    public static void deleteEmployee() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                employees.remove(emp);
                System.out.println("Employee deleted successfully.\n");
                return;
            }
        }
        System.out.println("Employee not found.\n");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=== Employee CRUD Menu ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    listEmployees();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.\n");
            }

        } while (choice != 5);
    }
}

