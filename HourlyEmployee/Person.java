public class Person {
    private int number;
    private String name, education;
    public int getNumber(){
        return  number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEducation(){
        return education;
    }
    public void setEducation(String education){
        this.education = education;
    }
    public Person(){

    }
    public Person(String name, String education, int number){
        this.name = name;
        this.education = education;
        this.number = number;
    }
    public String toString(){
        return "Name: " + this.name + " with an education " + this.education + " and number " + this.number;
    }

}
