
public class enumType {
    public static void main(String[] args) {
        // Using the Day enum
        Day today = Day.THURSDAY;

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case FRIDAY:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("It's some other day.");
        }
    }
}
