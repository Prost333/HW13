import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);
        System.out.println("Введите имя машины: ");
        String nameCar1=scnr.nextLine();
        System.out.println("Введите имя мотоцикла: ");
        String namebike1=scnr.nextLine();
        Car car1=new Car(nameCar1);
        Moto bike1=new Moto(namebike1);
        Garage<Car>carGarage=new Garage<>(new Car(nameCar1));
        Garage<Moto>motoGarage= new Garage<>(new Moto(namebike1));
        System.out.println("name car: "+carGarage.getTransport().getName());
        System.out.println("Name bike: "+motoGarage.getTransport().getName());
    }
}