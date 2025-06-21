
import java.sql.*;
import java.util.Scanner;

public class Employee {
    static final String URL = "jdbc:mysql://localhost:3306/employeedb";
    static final String USER = "root";
    static final String PASSWORD = "Madhumati@10"; // 

    static Connection conn;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            int choice;
            do {
                System.out.println("\n Employee Management System ");
                System.out.println("1. Add Employee");
                System.out.println("2. View All Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Search Employee by ID");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1: addEmployee(); 
                    break;
                    case 2: viewAll();
                     break;
                    case 3: updateEmployee();
                     break;
                    case 4: deleteEmployee();
                     break;
                    case 5: searchEmployee(); 
                    break;
                    case 0: System.out.println("Exiting..."); break;
                    default: System.out.println("Invalid Choice");
                }
            } while (choice != 0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addEmployee() throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();  
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        String sql = "INSERT INTO employee VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setString(3, dept);
        stmt.setDouble(4, salary);
        stmt.executeUpdate();
        System.out.println("Employee added successfully.");
    }

    static void viewAll() throws SQLException {
        String sql = "SELECT * FROM employee";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("\n Employee List ");
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") + 
                               ", Name: " + rs.getString("name") +
                               ", Dept: " + rs.getString("department") +
                               ", Salary: " + rs.getDouble("salary"));
        }
    }

    static void updateEmployee() throws SQLException {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new Name: ");
        String name = sc.nextLine();
        System.out.print("Enter new Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter new Salary: ");
        double salary = sc.nextDouble();

        String sql = "UPDATE employee SET name=?, department=?, salary=? WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, dept);
        stmt.setDouble(3, salary);
        stmt.setInt(4, id);
        int rows = stmt.executeUpdate();
        if (rows > 0) System.out.println("Employee updated.");
        else System.out.println("Employee not found.");
    }

    static void deleteEmployee() throws SQLException {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        String sql = "DELETE FROM employee WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        int rows = stmt.executeUpdate();
        if (rows > 0) System.out.println("Employee deleted.");
        else System.out.println("Employee not found.");
    }

    static void searchEmployee() throws SQLException {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        String sql = "SELECT * FROM employee WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") +
                               ", Name: " + rs.getString("name") +
                               ", Dept: " + rs.getString("department") +
                               ", Salary: " + rs.getDouble("salary"));
        } else {
            System.out.println("Employee not found.");
        }
    }
}
