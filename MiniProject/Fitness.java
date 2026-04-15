package MiniProject;

import java.util.*;

abstract class Activity{
    protected int duration;
    public Activity(int duration){
        if(duration<=0){
            throw new IllegalArgumentException("Duration must be positive");
        }
        this.duration=duration;
    }

    abstract double calculateCalories();
}

class Running extends Activity{
    private double speed;
    public Running(int duration,double speed){
        super(duration);
        if(speed<=0){
            throw new IllegalArgumentException("Speed must be positive");
        }
        this.speed=speed;
    }

    @Override
    double calculateCalories(){
        return duration*speed*0.8;
    }
}

class Cycling extends Activity{
    private double speed;
    public Cycling(int duration,double speed) {
        super(duration);
        if(speed<=0){
            throw new IllegalArgumentException("Speed must be positive");
        }
        this.speed=speed;
    }
    @Override
    double calculateCalories() {
        return duration*speed*0.5;
    }
}

class User {
    private String name;
    private int age;

    public User(String name,int age) {
        if(age<=0) {
            throw new IllegalArgumentException("Age must be valid");
        }
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
}

class FitnessTracker{
    private User user;
    private List<Activity> activities;

    public FitnessTracker(User user){
        this.user=user;
        this.activities=new ArrayList<>();
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public void showSummary(){
        double totalCalories=0;

        for(Activity a:activities) {
            totalCalories+=a.calculateCalories();
        }

        System.out.println("User: "+user.getName());
        System.out.println("Total Activities: "+activities.size());
        System.out.println("Total Calories Burned: "+totalCalories);
    }
}

public class Fitness{
    public static void main(String[] args){
        try{
            User user=new User("Saaivishrudh",20);
            FitnessTracker tracker=new FitnessTracker(user);

            tracker.addActivity(new Running(30,10));
            tracker.addActivity(new Cycling(45,15));
            tracker.showSummary();

        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
