
public class Main {
    public static void main(String[] args) {
        exceptions();
    }

    public static void exceptions(){
        try{
            throw new Exception("im in exception :) ");

        }

        catch (Exception e){
            e.getMessage();



        }finally {
            System.out.println("im finally");
        }
    }


}