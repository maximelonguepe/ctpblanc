package dao;

import entities.E_TMedicamentsEntity;
import jpadao.JpaDaoMedicaments;
import jsondao.JsonDao;

public class DaoFactoryJpa extends DaoFactory  {


    @Override
    public DaoMedicament getDaoMedicament() {
        return JpaDaoMedicaments.getInstance();
    }
}
