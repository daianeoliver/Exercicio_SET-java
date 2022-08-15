import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;
//SET não trabalha com  posição / não usa get (sem método)
public class ArcoIris {
    public static void main(String[] args){
        //hashset não mantém ordem de elementos
        Set<Cores> cores = new HashSet<>(){{
            add(new Cores("vermelho"));
            add(new Cores("azul"));
            add(new Cores("amarelo"));
            add(new Cores("anil"));
            add(new Cores("verde"));
            add(new Cores("violeta"));
            add(new Cores("laranja"));

        }};

        //Cores uma abaixo da outra
        Iterator lista = cores.iterator();
        System.out.println("Cores listadas: ");
        while (lista.hasNext()) {
            System.out.println(lista.next());
        }

        //Exibir Quantidade de cores que o arco-íris tem
        int numCores = cores.size();
        System.out.println("\nTotal cores: \n" + numCores);


        //Exibir cores em ordem alfabética
        System.out.println("\nOrdem Alfabética:");
        Set<Cores> cores2 = new TreeSet<>(cores);
        for(Cores Cores: cores2)
            System.out.println(Cores.getCor());

        //Ordenar  inverso do alfabético
        Set<Cores> cores3 = new TreeSet<>(Collections.reverseOrder());
        cores3.addAll(cores);
        System.out.println("\nOrdem inversa alfabético: \n" + cores3);

        //Exibir cores na ordem inversa que foram informadas - transformar em list
        Set<String> cores4 = new LinkedHashSet<>(
                Arrays.asList("vermelho","azul","amarelo","anil","verde","violeta","laranja"));
        List<String> cores5 = new ArrayList<>(cores4);
        Collections.reverse(cores5);
        System.out.println("\nOrdem Inversa: \n" + cores5);

        //Exibir cores que começam com v
        System.out.println("\nCores com V: ");
        for(String c: cores4){
            if(c.startsWith("v")) System.out.println(c);
        }

        //remover cores que não começam com V
        System.out.println("\nTodas as Cores: \n" + cores4);
        System.out.println("Remover cores que não começam com V: ");
        Iterator<String> iter = cores4.iterator();
        while (iter.hasNext()) {
            if (!iter.next().startsWith("v")) iter.remove();
        }
        System.out.println(cores4);

        //Limpar Conjunto
        System.out.println("Limpar Conjunto: \n");
        cores4.clear();

        //Checar se está vazio
        System.out.println("Checar se está vazio o conjunto: \n" + cores4.isEmpty());



    }
}
