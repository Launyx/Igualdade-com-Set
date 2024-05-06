package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        

        // Quando se usa TreeSet, a classe a ser comparada necessita implementar o CompareTo
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);
        
        // Antes das implementações de HashCode e equals na classe Product, o set compara o local de memória/ponteiro dos objetos
        //ystem.out.println(set.contains(prod));
        // Depois da implementação, o set passa a comparar os conteúdos determinados no HashCode e no equals

        for (Product p : set){
            System.out.println(p);
        }

    }
}
