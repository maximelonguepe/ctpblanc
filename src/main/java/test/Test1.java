package test;

import dao.DaoFactory;
import dao.DaoMedicament;
import entities.E_TMedicamentsEntity;
import enums.PersistenceType;

public class Test1 {
    public static void main(String[] args) {
        DaoMedicament daoMedicament = DaoFactory.getDaoFactory(PersistenceType.JSON).getDaoMedicament();
        //daoMedicament.create(new E_TMedicamentsEntity("aab"));
        //E_TMedicamentsEntity entity=daoMedicament.find(1234,E_TMedicamentsEntity.class);
        //
        // System.out.println(daoMedicament.find(1234, E_TMedicamentsEntity.class));
        System.out.println(daoMedicament.findAll(E_TMedicamentsEntity.class));

    }
}
