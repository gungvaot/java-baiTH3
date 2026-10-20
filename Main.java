import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        QuanLyThiSinh ql = new QuanLyThiSinh();
        int chon;
        do {
            System.out.println("\n========== QUAN LY THI SINH DU THI DAI HOC ==========");
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh va khoi thi");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoat chuong trinh");
            chon = docSoNguyen("Chon chuc nang: ");

            switch (chon) {
                case 1: themThiSinh(ql); break;
                case 2: ql.hienThiDanhSach(); break;
                case 3: timKiem(ql); break;
                case 4: System.out.println("Tam biet!"); break;
                default: System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 4);
    }

    private static void themThiSinh(QuanLyThiSinh ql) {
        System.out.print("So bao danh: ");
        String sbd = sc.nextLine().trim();
        if (ql.timTheoSoBaoDanh(sbd) != null) {
            System.out.println("So bao danh da ton tai!");
            return;
        }
        System.out.print("Ho ten: ");
        String ten = sc.nextLine().trim();
        System.out.print("Dia chi: ");
        String diaChi = sc.nextLine().trim();
        int uuTien = docSoNguyen("Muc uu tien: ");

        String khoi;
        do {
            System.out.print("Khoi thi (A/B/C): ");
            khoi = sc.nextLine().trim().toUpperCase();
        } while (!khoi.equals("A") && !khoi.equals("B") && !khoi.equals("C"));

        ThiSinh ts; // bien kieu cha, doi tuong kieu con (da hinh)
        switch (khoi) {
            case "A": ts = new ThiSinhKhoiA(sbd, ten, diaChi, uuTien); break;
            case "B": ts = new ThiSinhKhoiB(sbd, ten, diaChi, uuTien); break;
            default:  ts = new ThiSinhKhoiC(sbd, ten, diaChi, uuTien);
        }
        ql.themThiSinh(ts);
        System.out.println("Da them thi sinh thanh cong!");
    }

    private static void timKiem(QuanLyThiSinh ql) {
        System.out.print("Nhap so bao danh can tim: ");
        ThiSinh ts = ql.timTheoSoBaoDanh(sc.nextLine());
        if (ts == null) {
            System.out.println("Khong tim thay thi sinh.");
        } else {
            ts.hienThi();
        }
    }

    private static int docSoNguyen(String thongBao) {
        while (true) {
            System.out.print(thongBao);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen!");
            }
        }
    }
}