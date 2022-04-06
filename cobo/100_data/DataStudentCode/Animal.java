/*
uwu kittens: Ivina Wang, Jaylen Zeng, Anthony Sun
APCS
LAB08 -- data
2022-04-06r
time spent: 4 hrs
*/

public class Animal{
  private String id;
  private String intype;
  private String indate;
  private String name;
  private String animaltype;
  private String age;
  private String size;
  private String color;
  private String breed;
  private String sex;

  Animal(String id, String intype, String indate, String name, String animaltype,
  String age, String size, String color, String breed, String sex){
    this.id = id;
    this.intype = intype;
    this.name = name;
    this.animaltype = animaltype;
    this.age = age;
    this.size = size;
    this.color = color;
    this.breed = breed;
    this.sex = sex;
  }

  public String getId(){
    return id;
  }

  public String getIntype(){
    return intype;
  }

  public String getIndate() {
    return indate;
  }

  public String getName() {
    return name;
  }

  public String getAnimalType(){
    return animaltype;
  }

  public String getAge() {
    return age;
  }

  public String getSize(){
    return size;
  }

  public String getColor() {
    return color;
  }

  public String getBreed() {
    return breed;
  }

  public String getSex() {
    return sex;
  }
}
