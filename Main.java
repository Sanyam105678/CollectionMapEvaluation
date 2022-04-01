package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mobile obj = new Mobile();
        System.out.println(obj.addMobile("Apple","iPhone13"));
        System.out.println(obj.addMobile("Apple","iPhone12"));
        System.out.println(obj.addMobile("Apple","iPhone11"));
        System.out.println(obj.addMobile("Samsung","Galaxy S32"));
        System.out.println(obj.addMobile("Realme","M32"));

        System.out.println(obj.getModels("Apple"));
        System.out.println(obj.getModels("Samsung"));
        System.out.println(obj.getModels("Realme"));
        System.out.println(obj.getModels("Vivo"));





    }
}
