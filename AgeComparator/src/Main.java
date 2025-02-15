public class Main {
    public static void main(String[] args) {
        int vasyaAge = 3;
        int katyaAge = 16;
        int mishaAge = 21;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст


        if (vasyaAge <= 120 && vasyaAge >= 0 &&
                katyaAge <= 120 && katyaAge >= 0 &&
                mishaAge <= 120 && mishaAge >= 0) {

//            if (vasyaAge > mishaAge) {
//                max = vasyaAge;
//                min = mishaAge;
//            } else {
//                max = mishaAge;
//                min = vasyaAge;
//            }
//
//            if (katyaAge <= min) {
//                middle = min;
//                min = katyaAge;
//            } else if (katyaAge >= max) {
//                middle = max;
//                max = katyaAge;
//            }

            if (vasyaAge > mishaAge) {
                max = vasyaAge;
                min = mishaAge;
            } else {
                max = mishaAge;
                min = vasyaAge;
            }

            if (min > katyaAge) {
                middle = min;
                min = katyaAge;
            } else if (max < katyaAge) {
                middle = max;
                max = katyaAge;
            } else {
                middle = katyaAge;
            }
            System.out.println("Minimal age: " +  min);
            System.out.println("Middle age: " + middle);
            System.out.println("Maximal age: " + max);
        } else {
            System.out.println("Age incorrect");
        }
    }
}