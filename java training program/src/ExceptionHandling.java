public class ExceptionHandling {
    //to control the errors in programs
    public static void main(String[] args) {
        // System.out.println(100/0);
        //read the exception name /by zero
        //how to control the exception


        try {
            System.out.println(100/0);
        }catch (Exception exception){
            System.out.println("exception");
        }


        //null pointer or value exceotion
        String name = null;
        try {
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e);
        }


        //input  type or format error
        String fullname = "adham kareem";
        try {
            int z= Integer.parseInt(fullname);
            System.out.println(z);
        }catch (NumberFormatException e){
            System.out.println(e);
        }

        //array exceotion
        int array[]={1,2,3,4};
        try {
            System.out.println(array[4]);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this is finally code");
        }

    }
}
