package Models;

public class Room extends Services{
    String dichVuDiKem;

    public Room(String id, String tenDichVu, float dienTichSD, float cost, int maxPerson, String kieuThue) {
        super(id, tenDichVu, dienTichSD, cost, maxPerson, kieuThue);
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    void showInfor() {
        System.out.println("ID :" + id);
        System.out.println("TenDichVu : " +tenDichVu);
        System.out.println("DienTichSD : " +dienTichSD);
        System.out.println("Cost : " + cost);
        System.out.println("MaxPerSon : " +maxPerson);
        System.out.println("KieuThue : " +kieuThue);
        System.out.println("DichVuDiKem : "+ dichVuDiKem);

    }
}
