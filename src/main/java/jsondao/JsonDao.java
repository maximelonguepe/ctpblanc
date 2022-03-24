package jsondao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dao.Dao;
import generalclass.ClassId;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JsonDao<T> implements Dao<T> {
    File file;

    public JsonDao() {

    }

    @Override
    public boolean create(T obj) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        file = new File("src/main/resources/" + obj.getClass().getSimpleName() + ".json");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Object ob = JSONValue.parse(br);
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray array = (JSONArray) ob;
        array.add(obj);

        String jsonString = gson.toJson(array);
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("src/main/resources/" + obj.getClass().getSimpleName() + ".json");
            myWriter.write(jsonString);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public T find(Integer id, Class<T> tClass) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        file = new File("src/main/resources/" + tClass.getSimpleName() + ".json");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Object ob = JSONValue.parse(br);
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray array = (JSONArray) ob;
        for (int i = 0; i < array.size(); i++) {
            JSONObject object = (JSONObject) array.get(i);
            Long toto = (Long) object.get("id");
            Long longid = new Long(id);
            if (Objects.equals(toto, longid)) {
                String test = object.toJSONString();
                return gson.fromJson(test, tClass);
            }
        }
        return null;
    }

    @Override
    public List<T> findAll(Class<T> tClass) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        ArrayList<T> list=new ArrayList<T>();
        file = new File("src/main/resources/" + tClass.getSimpleName() + ".json");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Object ob = JSONValue.parse(br);
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray array = (JSONArray) ob;
        for (int i = 0; i < array.size(); i++) {
            JSONObject object = (JSONObject) array.get(i);
            String test =object.toJSONString();
            list.add(gson.fromJson(test,tClass));

        }

        return list;
    }

    @Override
    public boolean update(T obj) {

        return false;
    }

    @Override
    public boolean delete(T obj) {
        return false;
    }

    @Override
    public boolean deleteAll(Class<T> tClass) {

        return false;
    }

    @Override
    public void close() {

    }
}
