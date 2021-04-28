package Models;

public class House extends Services {
    String tieuChuan;
    String tienNghiKhac;
    int soTang;
    public House(String id, String tenDichVu, float dienTichSD, float cost, int maxPerson, String kieuThue, String tieuChuan, String tienNghiKhac, int soTang) {
        super(id, tenDichVu, dienTichSD, cost, maxPerson, kieuThue);
        this.tieuChuan = tieuChuan;
        this.tienNghiKhac = tienNghiKhac;
        this.soTang = soTang;
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public String getTienNghiKhac() {
        return tienNghiKhac;
    }

    public void setTienNghiKhac(String tienNghiKhac) {
        this.tienNghiKhac = tienNghiKhac;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    void showInfor() {
        System.out.println("ID : " + id);
        System.out.println("TenDichVu : " +tenDichVu);
        System.out.println("DienTichSD : " +dienTichSD);
        System.out.println("Cost : " +cost);
        System.out.println("MaxPerSon : " +maxPerson);
        System.out.println("KieuThue : " +kieuThue);
        System.out.println("TieuChuan : " + tieuChuan);
        System.out.println("TienNghiKhac : " +tienNghiKhac);
        System.out.println("SoTang : " +soTang);
    }
}
