package Models;
public abstract class Services { // khai bao abstract class
    String id;
    String tenDichVu;
    float dienTichSD;
    float cost;
    int maxPerson;
    String kieuThue;
    abstract void showInfor();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public float getDienTichSD() {
        return dienTichSD;
    }

    public void setDienTichSD(float dienTichSD) {
        this.dienTichSD = dienTichSD;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }




    public Services(String id, String tenDichVu, float dienTichSD, float cost, int maxPerson, String kieuThue) {
        this.id = id;
        this.tenDichVu = tenDichVu;
        this.dienTichSD = dienTichSD;
        this.cost = cost;
        this.maxPerson = maxPerson;
        this.kieuThue = kieuThue;
    }
}
