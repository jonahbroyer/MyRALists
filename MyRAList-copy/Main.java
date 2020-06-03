class Main {
    public static void main(String[] args){
        // creating integer array
        RAList<Integer> int_Array;
        DLCList<Person> theList = new DLCList<>();

        try {
            int_Array = new RAList(-1);
        }
        catch(BadLengthException e) {
            System.out.println(e.toString());
            int_Array = new RAList();
            throw new BadLengthException(-1);
            //int_Array = new RAList();
        }
        finally {
            System.out.println("Finally block....");
        }
        System.out.print("Generic Array <Integer>:" + " ");
        int howMany = 10;

        //int_Array.add(new Double(34.44));

        for (int i = 0; i < howMany; i++) {
            int_Array.add(i * 2);
        }

        int_Array.set(0, 99);        
        System.out.println(int_Array);

        try {
            int x = int_Array.get(13);
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

        // creating string array
        RAList<String> str_Array = new RAList();

        System.out.print("Generic Array <String>:" + " ");

        for (int i = 0; i < howMany; i++)
            str_Array.add(String.valueOf((char)(i + 97)));

        System.out.println(str_Array);
    }
}