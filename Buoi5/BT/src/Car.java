public class Car {
    public String brand , color;
    public int price;

    public Car (String brand, String color, int price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void speed(int speedLimit){
        System.out.println("Xe " +brand + " có thể chạy được maxspeed " + speedLimit + "km/h");
    }
    public void display(){
        System.out.println("Ten xe: "+brand);
        System.out.println("Màu sac: "+color);
        System.out.println("Giá thành là: "+price +"$");
    }

}
