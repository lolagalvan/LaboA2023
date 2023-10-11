package restauranteInterfaz;

import java.util.HashSet;

public class Restaurante implements IncluirPlato, Contratar  {
     private HashSet<Plato>menu;
    private HashSet<Chef>chefs;
    private String nombre;

    public Restaurante(HashSet<Plato> menu, HashSet<Chef> chefs,String nombre) {
        this.menu = menu;
        this.chefs = chefs;
        this.nombre=nombre;
    }

    public HashSet<Plato> getMenu() {
        return menu;
    }

    public void setMenu(HashSet<Plato> menu) {
        this.menu = menu;
    }

    public HashSet<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(HashSet<Chef> chefs) {
        this.chefs = chefs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void verificarMenu(Plato plato)throws PlatoYaestaEnMenu{
        if (menu.contains(plato)){
            throw new PlatoYaestaEnMenu("El plato: "+plato.getNombre()+","+" ya esta en el menu");
        }
    }

    public void verificarChef(Plato plato)throws NoEstaElChef{
        if (!chefs.contains(plato.getCocineroPlato())){
            throw new NoEstaElChef("El chef de el plato: "+plato.getNombre()+","+" no esta en el restaurante");
        }
    }
    @Override
    public void agregarPlato(Plato plato) {
        try {
            verificarChef(plato);
            verificarMenu(plato);
            System.out.println("El plato: "+plato.getNombre()+","+" se agrego al menu de: "+getNombre());
            menu.add(plato);
        } catch (NoEstaElChef e) {
            System.out.println(e.getMessage());;
        } catch (PlatoYaestaEnMenu e) {
            System.out.println(e.getMessage());;
        }
    }

    @Override
    public void agregarChef(Chef chef) {
            try {
                chef.verificarExperiencia();
                chef.verificarEdad();
                System.out.println("El chef: "+chef.getNombre()+","+" se unio al restaurante: "+nombre);
                chefs.add(chef);
                chef.setRestauranteActual(this);
            } catch (ExperienciaInsuficiente e) {
                System.out.println(e.getMessage());;
            } catch (EdadNoCorrespondiente e) {
                System.out.println(e.getMessage());
            }
        }
    }

