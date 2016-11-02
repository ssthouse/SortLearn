package com.ssthouse.InsertSort;

import java.util.Vector;

/**
 * Created by ssthouse on 16/5/9.
 */
public class DirectInsert {


    static class Person {
        String name;
        String ageStr;

        public Person(String name, String ageStr) {
            this.name = name;
            this.ageStr = ageStr;
        }

        @Override
        public String toString() {
            return name + "  " + ageStr;
        }
    }

    public static void main(String[] args) {
        testGc();
    }

    private void tryTransferStrObj() {
        String str = "string1";
        System.out.println(str);
        changeStr(str);
        System.out.println(str);
        System.out.println();
    }

    private void tryTransferObj() {
        Person person = new Person("name1", "age1");
        System.out.println(person);
        changePerson(person);
        System.out.println(person);
    }

    private static void changeStr(String str) {
        str = "string2";
    }

    private static void changePerson(Person person) {
        person.name = "name2";
        person.ageStr = "age2";
    }

    protected static void testGc() {
        Vector v = new Vector(10);
        Person person = new Person("ssthouse", "21");
        v.add(person);
        person = null;
        System.out.println(v.get(0));
    }
}
