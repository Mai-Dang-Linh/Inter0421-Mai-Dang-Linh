package Controllers;

import Models.Villa;

import java.util.ArrayList;
import java.util.List;


public class main {
//    public static final String FILE_NAME = "src/data/Villa.csv";
//    public static final String COMMA = ",";

    public static void main(String[] args)
    {

//        int k;
        MainController vs = new MainController();
//        vs.displayMainMenu();
//        Villa villa1 = new Villa(1,"Villa",200,2000,5,"Tháng","Cao Cấp","Xe du lịch",40,2);
//        Villa villa2 = new Villa(2,"Villa",201,2300,7,"Ngay","Thuong","Karaoke",50,2);
//        List<Villa> villalist = new ArrayList<>();
//        villalist.add(villa1);
//        villalist.add(villa2);
//
//        String line = null;
//        for(Villa villa: villalist){
//            line = villa.getId()+ COMMA +villa.getTenDichVu()+COMMA+villa.getDienTichSD()+COMMA +villa.getCost()+COMMA+villa.getMaxPerson()+COMMA+villa.getKieuThue()+COMMA+villa.getTieuChuan()+COMMA+villa.getTienNghiKhac()+COMMA+villa.getDienTichHoBoi()+COMMA+villa.getSoTang();
//            ReadWrite.writeFile(FILE_NAME,line);
//        }
//        List<String> listLine = ReadWrite.readFile(FILE_NAME);
//        System.out.println(listLine);
//
//        String[] lineSplit = listLine.get(0).split(COMMA);
//        Villa villa =  new Villa(Integer.parseInt(lineSplit[0]),lineSplit[1],Integer.parseInt(lineSplit[2]),Float.parseFloat(lineSplit[3]),Integer.parseInt(lineSplit[4]),lineSplit[5],lineSplit[6],lineSplit[7],Integer.parseInt(lineSplit[8]),Integer.parseInt(lineSplit[9]));
        vs.addNewVilla();
    }
}
