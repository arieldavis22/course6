package AutoboxingUnboxing;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Ariel");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(52));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.22);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i = 0; i<=10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i<=10; i++) {
            System.out.println(i + " ---->" + integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 99;
        int myInt = myIntValue;

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        for (int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + "--->" + value);
        }

    }
}
