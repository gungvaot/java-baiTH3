/** Thi sinh thi khoi A. */
public class ThiSinhKhoiA extends ThiSinh {

    public ThiSinhKhoiA() {
        super();
    }

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String getKhoiThi() {
        return "A";
    }

    @Override
    public String[] getMonThi() {
        return new String[] { "Toan", "Ly", "Hoa" };
    }
}