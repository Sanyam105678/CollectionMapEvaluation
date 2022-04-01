package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class Mobile {

    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model) {
        //this method will take a string as a company name and its model as an //argument.
        //ex: "apple", "Iphone13"
        AtomicBoolean cExists= new AtomicBoolean(false);
        this.mobiles.forEach((k,v)->{
            if(k.equals(company))
                cExists.set(true);

        });
        if(cExists.get())
            this.mobiles.get(company).add(model);
        else {
            this.mobiles.put(company, new ArrayList<String>());
            this.mobiles.get(company).add(model);

        }

        //add the company as key and its model as an element of ArrayList in the above //mobiles HashMap.
        //if the company name already exists then their model should be added to the //existing list.
        //This method should return a message "Mobile added successfully" after //adding a mobile.


        return "Mobile added successfully";
    }
    public ArrayList<String> getModels(String company){
        //This method return the list of all the models of the supplied company
        //if we supply any invalid company name then it should return null value
        AtomicBoolean cExist= new AtomicBoolean(false);
        this.mobiles.forEach((k,v)->{
            if(k.equals(company))
                cExist.set(true);

        });

            return this.mobiles.get(company);

    }
}
