package Animalitos;

public class Perro extends Canido{
    public String getSonido(){
        return "Ladrido";
    }
@Override
    public String getAlimentacion(){
        return "Carnivoro";
    }
    @Override
  public String getHabitat(){
        return "Domestico";
  }
  @Override
  public  String getNombreCientifico(){
        return "Canus lupus familiaris";
  }
}
