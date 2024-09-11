import java.util.*;

public class Hostel {

    public static Tenant addTenant(ArrayList<Room> rooms){
        String name = " ";
        int number = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter tenant name: ");
        name = scn.nextLine();
        System.out.print("Enter Room number: ");
        number = scn.nextInt();
        scn.nextLine();
        for(Room r: rooms){
            if(number==r.getNumber()){
                r.setAvailable();
            }
        }
        Tenant tenant = new Tenant(name, number);

        return tenant;

    }

    public static void removeTenant (ArrayList<Tenant> tenants, ArrayList<Room> rooms){
        String removeName = " ";
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter name of the tenant to be removed: ");
        removeName = scn.nextLine();

        for(Tenant t: tenants){
            if(removeName.equals(t.getName())){
                tenants.remove(t);
                for(Room r: rooms){
                    if(r.getNumber()==t.getNumber()){
                        r.unsetAvailable();
                    }
                }
                break;
            }
        }
    }

    public static void listTenant (ArrayList<Tenant> tenants){
        for(Tenant t: tenants){
            System.out.println(" Tenant Name: "+t.getName()+" Room Number: "+t.getNumber());
            System.out.println("---------------");
        }
    }

    public static void checkRooms(ArrayList<Room> rooms){
        for(Room r: rooms){
            System.out.println(" Room Name: "+r.getNumber()+" Available: "+r.isAvailable());
            System.out.println("---------------");
        }
    }

    public static Payment recordPayment(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter month: ");
        String month = scn.nextLine();
        System.out.print("Enter amount: ");
        int amount = scn.nextInt();
        scn.nextLine();

        Payment payment = new Payment(month, amount);

        return payment;
    }

    public static void main(String[] args){

        boolean state = true;
        int i = 1;
        int choice = 0;
        ArrayList<Tenant> tenants = new ArrayList<Tenant>();
        ArrayList<Room> rooms = new ArrayList<Room>();
        for(int j=0; j<50; j++){
            Room room = new Room(i);
            rooms.add(room);
            i++;
        }
        Scanner scn = new Scanner(System.in);

        System.out.print("State current month no: ");
        int monthNo = scn.nextInt();
        scn.nextLine();
        System.out.println("\n1. Add a Tenant: ");
        System.out.println("2. Remove a Tenant: ");
        System.out.println("3. List All Tenants: ");
        System.out.println("4. Check Room Availability: ");
        System.out.println("5. Record Monthly Payments: ");
        System.out.println("6. Display the Payment History of a Tenant: ");
        System.out.println("7. Calculate the Total Payment for a Room: ");
        System.out.println("8. Check the Payment Status of a Tenant: ");
        System.out.println("9. Identify Tenants with Missing Payments: ");
        
        while(state){

            System.out.print("\nEnter your choice: ");
            choice = scn.nextInt();
            scn.nextLine();
            
            switch (choice){
                case 1:
                    tenants.add(addTenant(rooms));
                    break;
                case 2:
                    removeTenant(tenants, rooms);
                    break;
                case 3:
                    listTenant(tenants);
                    break;
                case 4:
                    checkRooms(rooms);
                    break;
                case 5:
                    System.out.print("Enter tenant Name: ");
                    String name = scn.nextLine();
                    for(Tenant t : tenants){
                        if(t.getName().equals(name)){
                            t.addPayment(recordPayment());
                            System.out.print("State month no: ");
                            int no = scn.nextInt();
                            scn.nextLine();
                            t.setPayMonth(no);
                        }
                    }
                    break;
                case 6:
                    System.out.print("Enter tenant Name: ");
                    name = scn.nextLine();
                    for(Tenant t : tenants){
                        if(t.getName().equals(name)){
                            t.viewPayment();
                            break;
                        }
                    }
                    break;
                case 7:
                    System.out.print("Enter tenant Name: ");
                    name = scn.nextLine();
                    for(Tenant t : tenants){
                        if(t.getName().equals(name)){
                            t.sumPay();
                            break;
                        }
                    }
                    break;
                case 8:
                    System.out.print("Enter tenant Name: ");
                    name = scn.nextLine();
                    for(Tenant t : tenants){
                        if(t.getName().equals(name)){
                            int n = t.getPaymentMonth();
                            if(n<monthNo){
                                int diff = (monthNo-n);
                                System.out.println("The tenant hasn' paid for"+ diff +"month(s)");  
                            }
                        }
                    }
                    break;
                case 9:
                    for(Tenant t : tenants){
                        int n = t.getPaymentMonth();
                            if(n<monthNo){
                                int diff = (monthNo-n);
                                System.out.println("The "+t.getName()+" tenant hasn't paid for "+ diff +" month(s)");  
                            }
                    }
                    break;   
                default:
                    System.out.println("You have entered a wrong choice");
                    break;
                       
            }
                System.out.print("Do you want to continue? (y/n): ");
                String cont = " ";
                cont = scn.nextLine();    
                if(cont.charAt(0)=='n'){
                    state = false;
                }
                else{
                    state = true;
                }
        }
        
    }
}
