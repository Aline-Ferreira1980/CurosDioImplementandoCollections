package one.digitalinnovation.list.map;

import javax.sound.midi.Soundbank;
import java.util.TreeMap;

public class Exercicio {
    public static void main(String[] args) {
        TreeMap<String,String> estados = new TreeMap<>();

        estados.put("AC", "Acre");
        estados.put("AL","Alagoas");
        estados.put("AP","Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE","Ceará");
        estados.put("PR", "Paraná");
        estados.put("ES", "Espírito Santo");
        estados.put("GO","Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS","Mato Grosso do Sul");
        estados.put("MG","Minas Gerais");
        estados.put("PA","Pará");
        estados.put("PB","Parabíba");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN","Rio Grande do Norte");
        estados.put("RS","Rio Grande do Sul");
        estados.put("RO","Ronndonia");
        estados.put("RR", "Roraima");
        estados.put("SC","Santa Catarina");
        estados.put("SPs","São Paulo");
        estados.put("SE","Sergipe");
        estados.put("TO", "Tocantins");

        System.out.println(estados);


        System.out.println(estados.remove("MG"));

        System.out.println(estados.get("SC"));


        estados.remove("Mato Grosso do Sul");

        for(String key: estados.keySet()){
            System.out.println(key + "-"+ estados.get(key));
        }
        System.out.println(estados.containsKey("SC"));

        System.out.println(estados.containsValue("Maranhão"));



    }
}
