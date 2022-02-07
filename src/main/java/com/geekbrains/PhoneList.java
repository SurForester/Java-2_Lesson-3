package com.geekbrains;

import java.util.ArrayList;

public class PhoneList {

    ArrayList<phoneRecord> phonesList;

    public void add(String lastName, String phone) {
        if (phonesList == null) {
            phonesList = new ArrayList<phoneRecord>();
        }
        phonesList.add(new phoneRecord(lastName, phone));

    }

    public ArrayList<String> get(String searchName) {
        ArrayList<String> result = new ArrayList<String>();
        for (phoneRecord record : phonesList) {
            if (record.isLastName(searchName)) {
                result.add(record.getPhone());
            }
        }
        return result;
    }

}
