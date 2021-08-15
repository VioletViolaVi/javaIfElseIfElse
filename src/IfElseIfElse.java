public class IfElseIfElse {
    public static void main(String[] args) {
        // movie age restriction
        int personsAge = 16;
        if (personsAge >= 0 && personsAge <= 14) {
            System.out.println("You can watch U, PG and 12 rated films!");
        } else if (personsAge >= 15) {
            System.out.println("You can watch U, PG, 12 and 15 rated films!");
        } else if (personsAge >= 18) {
            System.out.println("You're old enough to watch anything!");
        } else {
            System.out.println("Invalid age!");
        }

        // 1-12 o'clock
        int timeOfDay = 12;
        if (timeOfDay >= 1 && timeOfDay <= 4) {
            System.out.println("Good Night!");
        } else if (timeOfDay >= 5 && timeOfDay <= 11) {
            System.out.println("Good Morning!");
        } else {
            System.out.println("Good Afternoon!");
        }

        // 24hr clock
        int time = 19;
        if (time >= 0 && time <= 4) {
            System.out.println("Good EARLY Morning! - " + "0" + time + ":00");
        } else if (time >= 5 && time <= 11) {
            if (time >= 5 && time <= 9) {
                System.out.println("Good Morning! - " + "0" + time + ":00");
            } else {
                System.out.println("Good Morning! - " + time + ":00");
            }
        } else if (time >= 12 && time <= 16) {
            System.out.println("Good Afternoon! - " + time + ":00");
        } else if (time >= 17 && time <= 20) {
            System.out.println("Good Evening! - " + time + ":00");
        } else if (time >= 21 && time <= 23) {
            System.out.println("Good Night! - " + time + ":00");
        } else {
            System.out.println("Invalid time!");
        }
    }
}
