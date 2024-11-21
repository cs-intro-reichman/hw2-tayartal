public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minToAdd = Integer.parseInt(args[1]);
        //System.out.println(hours);
        //System.out.println(minutes);
        int addedH = minToAdd / 60 ; 
        int addedM = minToAdd % 60 ; 
        int newHour = hours + addedH ; 
        int newMin = minutes + addedM ; 
        if (newMin>= 60) {
            newMin -= 60;
            newHour += 1;
        }
        newHour = newHour % 24;
        //System.out.println(newHour + ":" + newMin);
        System.out.printf("%02d:%02d%n", newHour, newMin);
    }
}