import java.util.ArrayList;
import java.util.List;

/** Lop quan ly danh sach thi sinh. */
public class QuanLyThiSinh {
    private List<ThiSinh> danhSach = new ArrayList<>();

    public List<ThiSinh> getDanhSach() { return danhSach; }
    public void setDanhSach(List<ThiSinh> danhSach) { this.danhSach = danhSach; }

    /** Them thi sinh; tra ve false neu so bao danh da ton tai. */
    public boolean themThiSinh(ThiSinh ts) {
        if (timTheoSoBaoDanh(ts.getSoBaoDanh()) != null) {
            return false;
        }
        danhSach.add(ts);
        return true;
    }

    /** Hien thi tat ca thi sinh (goi phuong thuc da hinh hienThi()). */
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach thi sinh dang trong.");
            return;
        }
        for (ThiSinh ts : danhSach) {
            ts.hienThi();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Tong so thi sinh: " + danhSach.size());
    }

    /** Tim theo so bao danh; tra ve null neu khong thay. */
    public ThiSinh timTheoSoBaoDanh(String sbd) {
        for (ThiSinh ts : danhSach) {
            if (ts.getSoBaoDanh().equalsIgnoreCase(sbd.trim())) {
                return ts;
            }
        }
        return null;
    }
}