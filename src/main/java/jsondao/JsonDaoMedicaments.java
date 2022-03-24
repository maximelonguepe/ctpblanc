package jsondao;

import dao.DaoMedicament;
import entities.E_TMedicamentsEntity;

import java.io.FileNotFoundException;

public class JsonDaoMedicaments extends JsonDao<E_TMedicamentsEntity> implements DaoMedicament {
    private static JsonDaoMedicaments instance=null;
    public static JsonDaoMedicaments getInstance() throws FileNotFoundException {
        if(instance==null){
            instance=new JsonDaoMedicaments();
        }
        return instance;
    }

}
