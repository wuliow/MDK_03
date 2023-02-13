import java.time.Year;

public class Main {
    TimeYear timeYear;

    public static void main(String[] args) {
        TimeYear winter = TimeYear.spring;
        System.out.println(winter);
        System.out.println(winter.getDescription());

        for (TimeYear day : TimeYear.values()) {
            System.out.println(day);
        }
    }

    public static void Year(TimeYear timeYear){
        switch (timeYear){
            case winter:
                System.out.println("Я не люблю зиму");
            case summer:
                System.out.println("Я люблю лето");
            case sping:
                System.out.println("Я не люблю весну");
            case autumn:
                System.out.println("Я не люблю осень");
        }
    }

}