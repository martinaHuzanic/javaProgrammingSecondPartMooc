/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martina
 */
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translationHashMap;

    public DictionaryOfManyTranslations() {

        this.translationHashMap = new HashMap<>();

    }

    public void add(String word, String translation) {

        this.translationHashMap.putIfAbsent(word, new ArrayList<String>());


        this.translationHashMap.get(word).add(translation);   

    }

    public ArrayList<String> translate(String word) {

        ArrayList<String> emptyList = new ArrayList<>();

        return this.translationHashMap.getOrDefault(word, emptyList);

    }

    public void remove(String word) {

        this.translationHashMap.remove(word);

    }

}
