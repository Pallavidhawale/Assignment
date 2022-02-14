package Static_Keyword_use;


	// Class and Object initialization use of static fields and static methods
    public class Cube
    {
        int length = 15;
        int breadth = 25;
        int height = 10;
        public static int numOfCubes = 0; // static variable
        public static int getNoOfCubes()////static method
        {     
            return numOfCubes;
        }
        public Cube()
        {    numOfCubes++; 
        }
    }
     

