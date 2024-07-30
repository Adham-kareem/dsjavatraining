package oopsjava;

public class Inheritence {
    public static void main(String[] args) {
        Parents parents = new Parents();
        parents.printParent();
        //using inheritence call grandparent method
        parents.printGrandParents();

    }
}

class Parents extends GrandParents {
    void printParent(){
        System.out.println("Iam parent");
    }
}

class GrandParents{
    void printGrandParents(){
        System.out.println("Iam grand parent");
    }
}
