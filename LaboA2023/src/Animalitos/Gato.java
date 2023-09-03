package Animalitos;

public class Gato extends Felino{
    @Override
    public String getSonido(){
        return "Miau";
    }
    @Override
    public String getAlimentacion(){
        return "Ratones";
    }
    @Override
    public String getHabitat(){
        return "Domestico";
    }
    @Override
    public  String getNombreCientifico(){
        return "Felis silvestris catus";
    }
}
