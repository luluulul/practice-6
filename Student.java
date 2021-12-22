package ru.mirea.prac6.res;




public class Student {
    private String Name;
    private int id;
    private int points;
    public Student(){
        id = 0;
        points = 0;
    }
    public Student(int id){
        this.id = id;
    }

//    public Student(@NotNull Student student){
//        this.id = student.getId();
//    }
    public void setPoints(int points){
        this.points = points;
    }
    public int getPoints(){
        return points;
    }
    public int getId(){
        return this.id;
    }
    @Override
    public String toString(){
        return this.id + " ";
    }
}
