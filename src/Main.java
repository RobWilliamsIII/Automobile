import javax.sound.midi.SysexMessage;
import java.io.PrintWriter;
import java.util.Scanner; // Required for user input
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Automobile vehicle = new Automobile();


        vehicle.setVehicleMake("");


        String make = vehicle.getVehicleMake();
        vehicle.setVehicleModel("");


        String model = vehicle.getVehicleModel();
        vehicle.setVehicleColor("");


        String color = vehicle.getVehicleColor();
        vehicle.setVehicleYear(0);


        Integer year = vehicle.getVehicleYear();
        vehicle.setVehicleYear(0);


        Integer mileage = vehicle.getVehicleMileage();

        int removeVehicle;


        int updateVehicle;


        Scanner input = new Scanner(System.in);


        ArrayList<String> vehicleMake = new ArrayList<>();


        ArrayList<String> vehicleModel = new ArrayList<>();


        ArrayList<String> vehicleColor = new ArrayList<>();


        ArrayList<Integer> vehicleYear = new ArrayList<>();


        ArrayList<Integer> vehicleMileage = new ArrayList<>();

        do {
            System.out.println("");

            try {

// Ask for user input


                System.out.println("Select an option from the list? (Enter '1-5')");


                System.out.println("1. List all vehicles");


                System.out.println("2. Remove a vehicle");


                System.out.println("3. Add a vehicle");


                System.out.println("4. Update a vehicle");


                System.out.println("5. Export vehicles to text file");


                int menu = input.nextInt();

                // List all vehicles

                if (menu == 1) {
                    if (vehicleMake.size() <= 0) {
                        System.out.println("");
                        System.out.println("No vehicles exist, please select option 3 from menu to add a vehicle to the list.");
                        System.out.println("");
                    } else {
                        System.out.println("All vehicles:");
                        System.out.println("");


                        System.out.println("Make, Model, Color, Year, Mileage: ");



                        for (int i = 0; i < vehicleMake.size() && i < vehicleModel.size() && i < vehicleColor.size()


                                && i < vehicleYear.size() && i < vehicleMileage.size(); i++)


                            System.out.println(vehicleMake.get(i) + ", " + vehicleModel.get(i) + ", " + vehicleColor.get(i) + ", "


                                    + vehicleYear.get(i) + ", " + vehicleMileage.get(i) + ".");
                    }





                } else if (menu == 2) {

// Remove a vehicle
                    System.out.println("Select vehicle to remove? ");
                    System.out.println("");
                    if (vehicleMake.isEmpty()) {
                        System.out.println("No vehicles to remove at this time.");
                    } else {

                        for (int i = 0; i < vehicleMake.size() && i < vehicleModel.size() && i < vehicleColor.size()


                                && i < vehicleYear.size() && i < vehicleMileage.size(); i++)


                            System.out.println(


                                    vehicleMake.indexOf(vehicleMake.get(i)) + ": " + vehicleMake.get(i) + ", " + vehicleModel.get(i) + ", "


                                            + vehicleColor.get(i) + ", " + vehicleYear.get(i) + ", " + vehicleMileage.get(i) + ".");


                        removeVehicle = input.nextInt();


                        vehicleMake.remove(removeVehicle);


                        vehicleModel.remove(removeVehicle);


                        vehicleColor.remove(removeVehicle);


                        vehicleYear.remove(removeVehicle);


                        vehicleMileage.remove(removeVehicle);
                    }

                } else if (menu == 3) {

                    // Add a vehicle
                    System.out.println("Enter make:");


                    make = input.next();


                    vehicleMake.add(make);
                    System.out.println("Enter model:");


                    model = input.next();


                    vehicleModel.add(model);
                    System.out.println("Enter color:");


                    color = input.next();


                    vehicleColor.add(color);
                    System.out.println("Enter year:");


                    year = input.nextInt();


                    vehicleYear.add(year);
                    System.out.println("Enter mileage:");


                    mileage = input.nextInt();


                    vehicleMileage.add(mileage);

                    System.out.println("Vehicle added: " + make + " " + model + " " + color + " " + year + " "+ mileage);


                } else if (menu == 4) {



                    System.out.println("Select vehicle to update: ");
                    System.out.println("");

                    if (vehicleMake.isEmpty()) {
                        System.out.println("No vehicles to update, please add a vehicle to the list.");
                    } else {

                    for (int i = 0; i < vehicleMake.size() && i < vehicleModel.size() && i < vehicleColor.size()


                            && i < vehicleYear.size() && i < vehicleMileage.size(); i++)


                        System.out.println(


                                vehicleMake.indexOf(vehicleMake.get(i)) + ": " + vehicleMake.get(i) + ", " + vehicleModel.get(i) + ", "


                                        + vehicleColor.get(i) + ", " + vehicleYear.get(i) + ", " + vehicleMileage.get(i) + ".");
                    updateVehicle = input.nextInt();


                    System.out.println("Enter new make:");


                    vehicleMake.set(updateVehicle, input.next());


                    System.out.println("Enter new model:");


                    vehicleModel.set(updateVehicle, input.next());


                    System.out.println("Enter new color:");


                    vehicleColor.set(updateVehicle, input.next());


                    System.out.println("Enter new year:");


                    vehicleYear.set(updateVehicle, input.nextInt());


                    System.out.println("Enter new mileage:");


                    vehicleMileage.set(updateVehicle, input.nextInt());
                    }


                } else if (menu == 5) {

                    //Export list of vehicles to text file


                    System.out.println("Exporting");
                    PrintWriter writer = new PrintWriter("AutomobileProgram_Print.txt", "UTF-8");


                    for (int i = 0; i < vehicleMake.size() && i < vehicleModel.size() && i < vehicleColor.size()


                            && i < vehicleYear.size() && i < vehicleMileage.size(); i++)


                        writer.println(vehicleMake.get(i) + ", " + vehicleModel.get(i) + ", " + vehicleColor.get(i) + ", "


                                + vehicleYear.get(i) + ", " + vehicleMileage.get(i));


                    writer.close();
                    System.out.println("Exported to AutomobileProgram_Print.txt");


                } else {


                    System.out.println("You must select a menu option.");


                }


            } catch (Exception e) {


                input.next();


                System.out.println("You must use an integer value.\n");


            }


        } while (true);


    }


}
