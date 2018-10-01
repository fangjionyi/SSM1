package net.togogo.bean;


public class Users {
    private String name;
    private int age;
    private int num;
   private int sex;
    public Users() {
    }

    public Users(String name, int age, int num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }

   public int getSex(){
   
       return  sex;
   }
    
    public void setSex(int sex){
    
        this.sex=sex;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", num=" + num +
                '}';
    }
}
