public class Doweek1 {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day today = Day.THURSDAY; // Set the current day

        switch (today) {
            case MONDAY:
                System.out.println("It's Monday. It's Oral Time");
                break;
            case TUESDAY:
                System.out.println("Unlimitid Quizzes");
                break;
            case WEDNESDAY:
                System.out.println("Spear Time");

                break;
            case THURSDAY:
                System.out.println("It's Vacation Time!");
                break;
            case FRIDAY:
                System.out.println("Party");
                break;
            case SATURDAY:
                System.out.println("Outing ");
                break;

            case SUNDAY:
                System.out.println("It's the weekend, IT's timw to go to church. Enjoy your free time!");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}