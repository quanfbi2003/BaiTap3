package controller.DAO;

import java.io.*;
import java.util.List;
import model.Definitions;

public class DbUtils {
    
    public static void writeFileXM(List list) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Definitions.DATABASE_XM));
            for (Object i : list) {
                out.writeObject(i);
            }
            out.close();
        } catch (IOException e) {
        }
    }
    
    public static void readFileXM(List list) {
        try {
            list.clear();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(Definitions.DATABASE_XM));
            Object o = null;
            while ((o = in.readObject()) != null) list.add(o);
            in.close();
        } catch (Exception e) {
        }
    }
    public static void writeFileHSX(List list) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Definitions.DATABASE_HSX));
            for (Object i : list) {
                out.writeObject(i);
            }
            out.close();
        } catch (IOException e) {
        }
    }
    
    public static void readFileHSX(List list) {
        try {
            list.clear();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(Definitions.DATABASE_HSX));
            Object o = null;
            while ((o = in.readObject()) != null) list.add(o);
            in.close();
        } catch (Exception e) {
        }
    }
}