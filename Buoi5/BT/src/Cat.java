public class Cat {
    public String species, color, gender;
    public Cat (String species, String color, String gender){
        this.species = species;
        this.color = color;
        this.gender = gender;
    }
    public void chirp(String chirp){
        System.out.println("Mèo " + species + " kêu : " + chirp);
    }
    public void display(){
        System.out.println("Loài : " + species);
        System.out.println("Màu sắc: " + color);
        System.out.println("Giới tính: " +gender);
    }
}
