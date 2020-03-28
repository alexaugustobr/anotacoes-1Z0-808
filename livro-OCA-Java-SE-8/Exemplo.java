public class Exemplo {

    public static void main (String[] args) {
        
        //OPERADORES

        //operacao de bytes sempre retorna int
        byte a = 10;
        byte b =2;
        int c = a/b; 
        // byte c = a/b; nao compila
        System.out.println(c);

        //operacoes sempre retornam o maior tipo
        int ia = 10;
        float fa = 2;
        float ra = ia + fa;
        System.out.println(ra);

        int x = 10;
        int y = x++;  
        // joga o valor de x na variavel y, e depois incrementa x
        // resultado y = 10, x = 11
        System.out.println(x);
        System.out.println(y);

        if (y == 10) {
            System.out.println("y é igual a 10");
        }


        //Estruturas lógicas

        //Estruturas validas, porém bizarras
        if (true) ; {

        };

        // nao faz diferença se inline ou nao
        if (true) {} else ;{};

        if (false) {} else ;{
             System.out.println("else ;{...};");
        };


        //atribuicoes validas
        long vv = 1;

        System.out.println("vv = " + ++vv);

        long vv2 = 1l;
        System.out.println("vv2 = " + vv2++);

        //Comparações enganosas


        Long l1 = 127l;
        Long l2 = 127L;

        if (l1 == l2) {
            System.out.println("l1 é igual a l2. Pois a comparação foi feita com base em endereço de memoria, o numero 127 é cacheado");
        }

        //Igual pois l1 esta na mesma posicao de memoria de l2, 
        //O java possui um cache interno, de alguns tipos, como numeros long 
        //cache de 0 a 127... (necessito de uma fonte para confirmar)


        l1 = 128l;
        l2 = 128l;
        if (l1 != l2) {
            System.out.println("l1 não é igual a l2. Pois a comparação foi feita com base em endereço de memoria, o numero 128 nao é cacheado.");
        }
        
        // Comparação de objetos deve ser feita com o equals
        if (l1.equals(l2)) {
            System.out.println("Verdadeiro o mesmo valor");
        }

        l1 = l2;
        if (l1.equals(l2)) {
            System.out.println("Verdadeiro a mesma instancia e valor");
        }


        //Strings

        String pirateMessage = "  Buried Treasure Chest! ";

        int f = pirateMessage.indexOf('u', 9);

        System.out.println(f);

        int f2 = pirateMessage.indexOf("u", 10);
        System.out.println(f2);

    }

}