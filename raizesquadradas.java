package raizesquadradas;
import java.util.Scanner;
public class raizesquadradas {
	//Fun�ao Geral
	static void Raiz (int Linf , int Lsup)
	{
	    //Scanner
	    Scanner dados=new Scanner(System.in);
	    //Introdu�ao valores
	    System.out.print("Qual � o limite Superior ? ");
	    Lsup=dados.nextInt();
	    System.out.print("Qual � o limite Inferior ?");
	    Linf=dados.nextInt();
	    //Fun�ao Tecnica
	    for(int I=Linf ; I<Lsup ; I++)
	        System.out.print(String.format("%5.1f",Math.sqrt(I)));
	}
	    public static void main(String[] args) {
	    //Chamar a Fun�ao
	        {
	        Raiz(0,0);
	        }
	    }
	    
	}