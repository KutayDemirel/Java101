import  java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int year, result;
        String zodiac;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please, enter your birth year  :");
        year = inp.nextInt();
        result = year % 12;

        switch (result){
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Rooster";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Rat";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            default:
                zodiac = "Sheep";
                break;
        }
        System.out.println("Your chinese zodiac sign is " + zodiac);

    }
}
