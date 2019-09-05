package innerClass;

public class Outerclass {

    InnerClass in = new InnerClass();


    public void getMethod (){


        System.out.println(" hello my friends");

        in.goMethod();
    }


    private class InnerClass {


        private void goMethod (){

            System.out.println( "rain rain go away, little umi wants to play");
        }




    }







}
