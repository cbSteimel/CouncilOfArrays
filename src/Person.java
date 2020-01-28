public class Person {

    String name, age, favoriteFood;

    public Person(){
        name= "unknown";
        age="unknown";
        favoriteFood = "unknown";
    }

    public Person(String name, String age, String favoriteFood){
        this.name = name;
        this.age = age;
        this.favoriteFood= favoriteFood;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String toString(){
        String message = name + "\n" + age + "\n" + favoriteFood + "\n********************";
        return message;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
