/** Thi sinh thi khoi B. */
public class ThiSinhKhoiB extends ThiSinh {

    public ThiSinhKhoiB() {
        super();
    }

    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String getKhoiThi() {
        return "B";
    }

    @Override
    public String[] getMonThi() {
        return new String[] { "Toan", "Hoa", "Sinh" };
    }
}