/** Lop cha truu tuong: chua thong tin chung cua moi thi sinh. */
public abstract class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private String diaChi;
    private int mucUuTien;

    public ThiSinh() {
    }

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() { return soBaoDanh; }
    public void setSoBaoDanh(String soBaoDanh) { this.soBaoDanh = soBaoDanh; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    public int getMucUuTien() { return mucUuTien; }
    public void setMucUuTien(int mucUuTien) { this.mucUuTien = mucUuTien; }

    /** Moi khoi thi tu dinh nghia ten khoi (da hinh). */
    public abstract String getKhoiThi();

    /** Moi khoi thi tu dinh nghia cac mon thi (da hinh). */
    public abstract String[] getMonThi();

    /** Hien thi thong tin thi sinh; lop con dung lai nho da hinh. */
    public void hienThi() {
        System.out.println("-----------------------------------------");
        System.out.println("So bao danh : " + soBaoDanh);
        System.out.println("Ho ten      : " + hoTen);
        System.out.println("Dia chi     : " + diaChi);
        System.out.println("Muc uu tien : " + mucUuTien);
        System.out.println("Khoi thi    : " + getKhoiThi());
        System.out.println("Cac mon thi : " + String.join(", ", getMonThi()));
    }
}