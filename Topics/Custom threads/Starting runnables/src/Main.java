class Starter {

    public static void startRunnables(Runnable[] runnables) {
        for (int i = 0; i < runnables.length; i++) {
            Thread thread = new Thread(runnables[i]);
            thread.start();
        }
        // implement the method
    }
}