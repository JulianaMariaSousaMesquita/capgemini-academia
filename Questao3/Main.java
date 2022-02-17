import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

class Main {  
  public static int anagrama(String palavra){
    int numeroPares = 0;
    HashMap<String, Integer> map= new HashMap<>();		  
		for(int i = 0; i < palavra.length(); i++){
		  for(int j = i; j < palavra.length(); j++){
        char[] letra = palavra.substring(i, j+1).toCharArray();
        Arrays.sort(letra);
		    String valor = new String(letra);
		    if (map.containsKey(valor)){
          map.put(valor, map.get(valor)+1);
        }else{
          map.put(valor, 1);
          }
		    }
		}
		for(String key: map.keySet()){
		  int n = map.get(key);
		  numeroPares += (n * (n-1))/2;
		}
		return numeroPares;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um texto:");
    String palavra = sc.nextLine();

    System.out.print(anagrama(palavra));

    sc.close();
  }
}