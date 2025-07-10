import java.sql.*;
import java.util.Scanner;

public class EmployeeJDBC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Employees", "root", "pass");

            while (true) {
                System.out.println("\n1. Add\n2. View\n3. Update\n4. Delete\n5. Exit");
                int choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                if (choice == 1) {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    PreparedStatement ps = conn.prepareStatement("INSERT INTO employee VALUES (?, ?, ?)");
                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setString(3, dept);
                    ps.executeUpdate();
                    System.out.println("Employee Added!");

                } else if (choice == 2) {
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM employee");
                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("department"));
                    }

                } else if (choice == 3) {
                    System.out.print("Enter ID to Update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter New Department: ");
                    String dept = sc.nextLine();

                    PreparedStatement ps = conn.prepareStatement("UPDATE employee SET name=?, department=? WHERE id=?");
                    ps.setString(1, name);
                    ps.setString(2, dept);
                    ps.setInt(3, id);
                    ps.executeUpdate();
                    System.out.println("Employee Updated!");

                } else if (choice == 4) {
                    System.out.print("Enter ID to Delete: ");
                    int id = sc.nextInt();

                    PreparedStatement ps = conn.prepareStatement("DELETE FROM employee WHERE id=?");
                    ps.setInt(1, id);
                    ps.executeUpdate();
                    System.out.println("Employee Deleted!");

                } else {
                    conn.close();
                    System.out.println("Exiting....!");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

