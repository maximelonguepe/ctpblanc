package dao;

import jsondao.JsonDaoMedicaments;

import java.io.FileNotFoundException;

public class DaoFactoryJson extends DaoFactory{
    private static DaoFactoryJson instance;
    @Override
    public DaoMedicament getDaoMedicament() {
        try {
            return JsonDaoMedicaments.getInstance();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;

    }
}
