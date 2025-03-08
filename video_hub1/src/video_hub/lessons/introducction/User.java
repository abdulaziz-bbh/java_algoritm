package video_hub.lessons.introducction;

public class User {
    String name;
    String surname;
    int age;


    public String toString(){
        return name + " " + surname + " " +age;
    }

    public String nameToUpper(){
        return name.toUpperCase() +" " +  surname.toUpperCase();
    }

}
