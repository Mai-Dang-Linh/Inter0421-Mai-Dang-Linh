package Controllers;

import Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    public static final String COMMA = ",";

    public static Scanner input(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
//    public void displayMainMenu()
//    {
//        int select;
//        do
//        {
//            select = 0;
//            System.out.println("1. Add New Services ");
//            System.out.println("2. Show Services ");
//            System.out.println("3. Add New Customer ");
//            System.out.println("4. Show Information of Customer ");
//            System.out.println("5. Add New Booking ");
//            System.out.println("6. Show Information of Employee ");
//            System.out.println("7. Exit ");
//            System.out.print(" Enter number of K :");
//            select = input().nextInt();
//            switch (select) {
//                case 1:
//                    System.out.println("A");
////                addNewServices();
//                    break;
//                case 2:
//                    System.out.println("B");
////                showServices();
//                    break;
//                case 3:
//                    System.out.println("C");
////                addNewCustomer();
//                    break;
//                case 4:
//                    System.out.println("D");
////                showInfor();
//                    break;
//                case 5:
//                    System.out.println("E");
////                addNewBooking();
//                    break;
//                case 6:
//                    System.out.println("F");
////                toString();
//                    break;
//                case 7:
//                    System.out.println("Exit");
//                    select =0 ;
//                default:
//                    System.out.println(" Ưởng selection !");
//                    select =0;
//                    break;
//
//            }
//        }while(select != 0);
//
//    }
//    public void mNewServies()
//    {
//        System.out.println("1. Add new Villa ");
//        System.out.println("2. Add new House ");
//        System.out.println("3. Add new room ");
//        System.out.println("4. Back to menu ");
//        System.out.println("5. Exit");
//
//    }
//    public void addNewServies()
//    {
//        mNewServies();
//        boolean var = true;
//        int m;
//        System.out.print(" Enter number of m :");
//        m = input().nextInt();
//        while(var) {
//            switch (m) {
//                case 1:
////                    addNewVilla();
//                    System.out.println(1);
//                    break;
//                case 2:
////                    addNewHouse();
//                    System.out.println(2);
//                    break;
//                case 3:
////                    addNewRoom();
//                    System.out.println(3);
//                    break;
//                case 4:
//                    System.out.println(4);
//                    mNewServies();
//                    break;
//                case 5:
//                    var = false;
//                    break;
//            }
//        }
//    }
    public void addNewVilla()
    {
        ArrayList<Villa> listNewVilla = new ArrayList<>();
        float dienTichHoBoi;
        String id = inputId();
        String tenDichVu = inputtenDichVu();
        float dientichSD = inputDienTich();
        float cost = inputCost();
        int maxPerson = inputMaxPerson();
        String kieuThue = inputKieuThue();
        String tieuChuan = inputTieuChuan();
        String tienNghiKhac = inputTienNghiKhac();
        System.out.println("DienTichHoBoi : ");
        dienTichHoBoi = input().nextInt();
        int soTang = inputSoTang();
        Villa villa = new Villa(id,tenDichVu,dientichSD,cost,maxPerson,kieuThue,tieuChuan,tienNghiKhac,dienTichHoBoi,soTang);
        listNewVilla.add(villa);

//        ReadWrite.writeFile("src/data/Villa.csv");
        String line = null;
        for( Villa villa1: listNewVilla){
            line = villa.getId()+ COMMA +villa.getTenDichVu()+COMMA+villa.getDienTichSD()+COMMA +villa.getCost()+COMMA+villa.getMaxPerson()+COMMA+villa.getKieuThue()+COMMA+villa.getTieuChuan()+COMMA+villa.getTienNghiKhac()+COMMA+villa.getDienTichHoBoi()+COMMA+villa.getSoTang();
            ReadWrite.writeFile("src/data/Villa.csv",line);
        }

    }
//    public void addNewHouse(){
//        int id = inputId();
//        int dientichSD = inputDienTich();
//        float cost = inputCost();
//        int maxPerson = inputMaxPerson();
//        String kieuThue = inputKieuThue();
//        String tieuChuan = inputTieuChuan();
//        String tienNghiKhac = inputTienNghiKhac();
//        int soTang = inputSoTang();
//    }
//    public void addNewRoom(){
//        String dichVuDiKem;
//        int id = inputId();
//        int dientichSD = inputDienTich();
//        float cost = inputCost();
//        int maxPerson = inputMaxPerson();
//        String kieuThue = inputKieuThue();
//        System.out.println("Dich vu di kem: ");
//        dichVuDiKem = input().nextLine();
//    }

    public static String inputId(){
        System.out.println("ID : ");
        return input().nextLine();
    }
    public static String inputtenDichVu()
    {
        System.out.println("Ten dịch vu: ");
        return input().nextLine();
    }
    public static float inputDienTich(){
        System.out.println("Dien tich su dung: ");
        return input().nextFloat();
    }
    public static float inputCost(){
        System.out.println("Cost: ");
        return input().nextFloat();
    }
    public static int inputMaxPerson(){
        System.out.println("Max Person: ");
        return input().nextInt();
    }
    public static String inputKieuThue(){
        System.out.println("Kieu thue: ");
        return input().nextLine();
    }
    public  static String inputTieuChuan(){
        System.out.println("TieuChuan : " );
        return input().nextLine();
    }
    public static String inputTienNghiKhac(){
        System.out.println("TienNghiKhac : ");
        return input().nextLine();
    }
    public static int inputSoTang(){
        System.out.println("So tang: ");
        return input().nextInt();
    }

//    public void showServices() {
//        System.out.println("1. Show all Villa ");
//        System.out.println("2. Show all House ");
//        System.out.println("3. Show all Room ");
//        System.out.println("4. Show all Name Villa Not Duplicate ");
//        System.out.println("5. Show all Name House Not Duplicate ");
//        System.out.println("6. Show all Name Room NoT Duplicate ");
//        System.out.println("7. Back to menu ");
//        System.out.println("8.Exit ");
//    }

}
