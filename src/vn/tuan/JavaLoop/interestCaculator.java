package vn.tuan.JavaLoop;

import java.util.Scanner;

public class interestCaculator {
    public static void main(String[] args) {
        double soTienGui = 1.0;
        double laiXuat = 1.0;
        int soThang = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi: ");
        soTienGui = scanner.nextDouble();

        System.out.print("Tỉ lệ lãi xuất năm (% năm): ");
        laiXuat = scanner.nextDouble();

        System.out.print("Số tháng gửi: ");
        soThang = scanner.nextInt();

        double tienLai = 0;
        for (int i = 0; i < soThang; i++) {
            tienLai = soTienGui * (laiXuat / 100) / 12 * soThang;
        }
        System.out.printf("Số tiền lãi của bạn là: %f", tienLai);
    }
}
