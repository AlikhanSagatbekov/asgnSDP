package net.proselyte.basepatterns.creational.strategy;

public class developer {
    activity activity;

    public void setActivity(activity activity) {
        this.activity = activity;

    }
     public void executeactivity(){
        activity.justDoIt();
     }
}
