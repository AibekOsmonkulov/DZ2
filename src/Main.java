public class Main {
    public static void main(String[] args) {
        System.out.println(condition(35, -10));
        System.out.println(condition(15, 25));
        System.out.println(condition(20, 0));
        System.out.println(condition(10, 30));
        System.out.println(condition(25, 10));

    }
    public static String condition(int age, int temperature){
        if(age >20 && age <45 && temperature > -20 && temperature < 30){
            return "Можно идти гулять";

        } else if (age<20 && temperature >0 && temperature <28) {
            return "Можно идти гулять";

        } else if (age >45 && temperature >-10 && temperature <25){
            return "Можно идти гулять";
        }else {
    return "Остоваться дома";

        }
    }
}