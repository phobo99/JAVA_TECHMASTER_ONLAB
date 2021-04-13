public class LopVoDanh {
    public static void main(String[] args) {
//        HinhTron hinhTron = new HinhTron(5);
//        hinhTron.display();
        HinhHoc hinhGiDo = new HinhHoc() {
            float r;

            @Override
            public void nhapBanKinh(float banKinh) {
                this.r = banKinh;
            }

            @Override
            public float tinhDientich() {
                return (float) (Math.PI * r * r);
            }

            @Override
            public float tinhChuVi() {
                return (float) (2 * Math.PI * r);
            }

            @Override
            public void display() {
                System.out.println("Chu vi: " + tinhChuVi());
                System.out.println("Dien tich: " + tinhDientich());
            }
        };

        hinhGiDo.nhapBanKinh(5);
        hinhGiDo.display();
    }
}
