package Models;

public class Villa extends Services
{
    String tieuChuan;
    String tienNghiKhac;
    float dienTichHoBoi;
    int soTang;

    public Villa(String id, String tenDichVu, float dienTichSD, float cost, int maxPerson, String kieuThue, String tieuChuan, String tienNghiKhac, float dienTichHoBoi, int soTang) {
        super(id, tenDichVu, dienTichSD, cost, maxPerson, kieuThue);
        this.tieuChuan = tieuChuan;
        this.tienNghiKhac = tienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
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

    public float getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(float dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }


    @Override
    void showInfor() {
        System.out.println("ID : " + getId());
        System.out.println("TenDichVu : " + getTenDichVu());
        System.out.println("DienTichSD : " + getDienTichSD());
        System.out.println("Cost : " + getCost());
        System.out.println("MaxPerSon : " + getMaxPerson());
        System.out.println("KieuThue : " +getKieuThue());
        System.out.println("TieuChuan : " + getTieuChuan());
        System.out.println("TienNghiKhac : " + getTienNghiKhac());
        System.out.println("DienTichHoBoi : " + getDienTichHoBoi());
        System.out.println("SoTang : " +getSoTang());
    }
}
