package net.proselyte.basepatterns.creational.strategy;

public class developerrunner {
        public static void main(String[] args) {
            developer developer = new developer();

            developer.setActivity(new sleeping());
            developer.executeactivity();

            developer.setActivity(new trainng());
            developer.executeactivity();

            developer.setActivity(new coding());
            developer.executeactivity();

            developer.setActivity(new reading());
            developer.executeactivity();

            developer.setActivity(new sleeping());
            developer.executeactivity();

        }
}
