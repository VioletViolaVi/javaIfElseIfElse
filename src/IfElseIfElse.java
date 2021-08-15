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


    }
}
