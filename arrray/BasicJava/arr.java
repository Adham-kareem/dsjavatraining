package arrray.BasicJava;

public class arr {
        public static void main(String[]args){
            String[]studentName={"adham","abhay","satyam","kaif"};
            for(int i=0;i<studentName.length;i++){
                System.out.println(studentName[i]);
            }
            // print name of friends using for each loop
            for(String i:studentName){
                System.out.println(i);
            }
        }

    }


