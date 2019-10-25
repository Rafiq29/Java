package classwork.lesson7work;

public class Transform {
    public void transform12(String origin){
        try{
            int s1= Integer.parseInt(origin);
            System.out.println(s1);
        }catch (NumberFormatException ex){
            System.out.println("Wrong");
        }
    }
}
