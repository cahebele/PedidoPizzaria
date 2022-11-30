package AulaPolimorfismo;
public class PizzaCalabresa {
		 private double preco;

		 public PizzaCalabresa(){
		 preco = 35.0;
		 }

		 public void setPreco(double valor){
		 preco = valor;
		 }

		 public String nome(){
		 return "Calabresa";
		 }

		 public String ingredientes(){
		 return "calabresa, tomate, cebola, tomate e queijo";
		 }

		 public int tempoForno(){
		 return 20;
		 }
		 public double valor( char tam, int quant ){
		 if( tam == 'P' ) return quant * preco * 0.9; // 10% DeDesconto
		 if( tam == 'M' ) return quant * preco;
		 if( tam == 'G' ) return quant * preco * 1.1; // 10% DeAcréscimo
		 return 0.0; // TamanhoNãoDefinido
		 }
}