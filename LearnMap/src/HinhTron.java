public class HinhTron implements HinhHoc {
    float r;

    public HinhTron(float r) {
        this.r = r;
    }

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

    public void display() {
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Dien tich: " + tinhDientich());
    }
}
