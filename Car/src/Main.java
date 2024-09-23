import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
        static String connectString = "jdbc:mysql://localhost:3306/car?useSSL=false";
        static String username = "root";
        static String password = "";


        static boolean cond=true; //boolean variable to check the condition
        //static int ref;

        //function to check the choice of the user
        public static boolean choice(char ch, Connection connection){

            if(ch=='y'){
                enterDete(connection);
            }
            else if(ch=='n'){
                cond=false;
            }
            else{
                choice(ch, connection);
            }
            return cond;
        }

        //function to enter the details of the car
        public static void enterDete(Connection connection){

            Scanner scan= new Scanner(System.in);
            Scanner sc= new Scanner(System.in);
            String nam;
            String modl;
            String clr;
            int yr;

            System.out.print("Enter Car name: ");
            nam=sc.nextLine();

            System.out.print("Enter Car model: ");
            modl=sc.nextLine();

            System.out.print("Enter Car color: ");
            clr=sc.nextLine();

            System.out.print("Enter Car year: ");
            yr=sc.nextInt();

            String sqls = "INSERT INTO cart (name, model, color, year) VALUES ('"+nam+"', '"+modl+"', '"+clr+"', '"+yr+"')";

            try{
                Statement statement = connection.createStatement();
                statement.executeUpdate(sqls);
                System.out.println("Data inserted successfully");
            }
            catch(Exception e){
                System.out.println("Data insertion failed");
            }

            String cho;
            System.out.print("Do you want to add more cars (y/n): ");
            cho=scan.nextLine();
            System.out.println("-----------------------------------");
            char ch=cho.charAt(0);
            choice(ch, connection);
        }

        //print details of the car
        public static void printDete(Connection connection){
            String sqls = "SELECT * FROM cart";
            try{
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sqls);
                System.out.println("Data imported successfully");

                while(resultSet.next()){
                    Car car = new Car(resultSet.getString("name"), resultSet.getString("model"), resultSet.getString("color"), resultSet.getInt("year"), resultSet.getInt("refno"));
                    car.displayInfo();
                }
            }
            catch(Exception e){
                System.out.println("Data importing failed");
            }

        }

        //delete the details of the car
        public static void deleteDete(Connection connection){
            Scanner scan= new Scanner(System.in);
            System.out.print("Enter the reference number of the car you want to delete: ");
            int ref=scan.nextInt();
            String sqls = "DELETE FROM cart WHERE refno = '"+ref+"'";
            try{
                Statement statement = connection.createStatement();
                statement.executeUpdate(sqls);
                System.out.println("Data deleted successfully");
            }
            catch(Exception e){
                System.out.println("Data deletion failed");
            }
        }

        public static void main(String[] args) {

            int ch = 0;
            boolean con = true;
            //Database connection
            Connection connection = null;
            try{
                connection = DriverManager.getConnection(connectString, username, password);
                System.out.println("Connection successful");
            }
            catch(Exception e){
                System.out.println("Connection failed");
            }
            //main function
            while(con){
                Scanner scan= new Scanner(System.in);
                System.out.println("1. Enter Car Details");
                System.out.println("2. Display Car Details");
                System.out.println("3. Delete Car Details");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                ch=scan.nextInt();
                System.out.println("-----------------------------------");

                switch(ch){
                    case 1:
                        enterDete(connection);
                        break;
                    case 2:
                        printDete(connection);
                        break;
                    case 3:
                        deleteDete(connection);
                        break;
                    case 4:
                        con=false;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        }

}