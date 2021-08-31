package com.workshops.javasamples.grokkingjavainterview;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Mike", 25, 6000);
        String file = "C:\\temp\\byteStream.txt";

        {
            try {
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(emp);
                fos.close();
                oos.close();
                System.out.println("Employee is Serialized: " + emp);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);

                Employee emp1 = (Employee) ois.readObject();

                fis.close();
                ois.close();

                System.out.println("Employee is De-Serialized: " + emp1);

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
