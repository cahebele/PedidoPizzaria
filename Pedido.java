package AulaPolimorfismo;
public class Pedido {

 private int numero;
 private char tamanho; // P,M,G
 private int quantidade;

 public Pedido(int n, char t, int q){
 numero = n;
 tamanho = Character.toUpperCase(t);
 quantidade = q;
 }

 public Pedido(int n){
 numero = n;
 tamanho = 'M';
 quantidade = 1;
 }
 public void fazer(PizzaCalabresa pizza){
	 System.out.println( "Número Pedido: " + numero );
	 System.out.println( "Tipo de Pizza: " + pizza.nome() );
	 System.out.println( "Ingredientes: " + pizza.ingredientes() );
	 System.out.println( "Tempo Forno: " + pizza.tempoForno() + " minutos" );
	 System.out.println( "Total à Pagar: R$ " + pizza.valor(tamanho, quantidade) );
	 }
	 public void fazer(PizzaNapolitana pizza){
	 System.out.println( "Número Pedido: " + numero );
	 System.out.println( "Tipo de Pizza: " + pizza.nome() );
	 System.out.println( "Ingredientes: " + pizza.ingredientes() );
	 System.out.println( "Tempo Forno: " + pizza.tempoForno() + " minutos" );
	 System.out.println( "Total à Pagar: R$ " + pizza.valor(tamanho, quantidade) );
	 }
	 public void fazer(QuatroQueijo pizza){
	 System.out.println( "Número Pedido: " + numero );
	 System.out.println( "Tipo de Pizza: " + pizza.nome() );
	 System.out.println( "Ingredientes: " + pizza.ingredientes() );
	 System.out.println( "Tempo Forno: " + pizza.tempoForno() + " minutos" );
	 System.out.println( "Total à Pagar: R$ " + pizza.valor(tamanho, quantidade) );
	 }
	}
