public class MultipleInheritance{
    public static void main(String[] args)
    {
        System.out.println("FEATURES OF CHILD --> (Following data can be printed even if implementation class is empty)");
        Father father=new ChildImpl();
        System.out.println("Hair : "+father.hair);
        Mother mother=new ChildImpl();
        System.out.println("Eyes : "+mother.eyes);
        Child child=new ChildImpl();
        System.out.println("Stature : "+child.stature);
        System.out.println("Complexion : "+child.complexion);
        System.out.println("Height : "+child.height);
        ChildImpl implChild=new ChildImpl();

        System.out.println("\n\n\nFeatures of Child --> from implementation class");
        implChild.ChildFeatures();
    }
}

interface Father
{
    String hair="Deep Black";
    String eyes="Blue";
    String height="Tall";
    default void setDadCharacter()
    {
        String character="Good";
    }
}
interface Mother
{
    String hair="Blond";
    String eyes="Hazel Brown";
    String stature="Normal";
    default void setMomCharacter()
    {
        String character="Good";
    }
}
interface Child extends Father,Mother
{
    String complexion="Fair";
}
class ChildImpl implements Child
{
    Father dad;
    Mother mom;
    Child child;
    void ChildFeatures()
    {
        System.out.println("Hair.."+mom.hair);
        System.out.println("Eyes.."+dad.eyes);
        System.out.println("Stature.."+child.stature);
        System.out.println("Complexion.."+child.complexion);
        System.out.println("Height.."+child.height);
    }
}


/*
+ Objects created using interface as reference in implementation class and used to access properties with same name in two different interfaces
+ If default methods with same methodName are created in both Father and Mother Interfaces then it shows an error
*/