public class Main {


    public static void main(String[] args) {

        // Fire tråde der kører på samme tid
        for (int i = 0; i <= 3; i++) {
            MultithreadingThing multithreadingThing1 = new MultithreadingThing(i);
            MultithreadingThing2 multithreadingThing2 = new MultithreadingThing2(i);
            multithreadingThing1.start();
            multithreadingThing2.start();
        }
    }
}