package jpadao;

import dao.DaoMedicament;
import entities.E_TMedicamentsEntity;

public class JpaDaoMedicaments extends JpaDao<E_TMedicamentsEntity> implements DaoMedicament {
    private static JpaDaoMedicaments instance;
    public static JpaDaoMedicaments getInstance(){
        if(instance==null){
            instance=new JpaDaoMedicaments();
        }
        return instance;
    }
}
