import java.util.Scanner;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static boolean digitos(String s){
    String digitosStr = "0123456789";
    for(int i = 0; i<s.length(); i++){
      for(int j = 0; j<digitosStr.length(); j++){
        if((s.charAt(i)) == (digitosStr.charAt(j))){
          return true;
        }
      }
    }
    return false;
  }

  public static boolean minusculo(String s){
    String alfabetoStr = "abcdefghijklmnopqrstuvwxyz";
    for(int i = 0; i<s.length(); i++){
      for(int j = 0; j<alfabetoStr.length(); j++){
        if((s.charAt(i)) == (alfabetoStr.charAt(j))){
          return true;
        }
      }
    }
    return false;
  }  

  public static boolean maiusculo(String s){
    String alfabetoStrM = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";   
    for(int i = 0; i<s.length(); i++){
      for(int j = 0; j < alfabetoStrM.length(); j++){
        if((s.charAt(i)) == (alfabetoStrM.charAt(j))){
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean caracterEspecial(String s){
    String especialStr = "!@#$%^&*()-+";
    for(int i = 0; i<s.length(); i++){
      for(int j = 0; j < especialStr.length(); j++){
        if((s.charAt(i)) == (especialStr.charAt(j))){
          return true;
        }
      }
    }
    return false;
  }

  public static int senhaSegura(String s){
    int falta = 0;
    boolean digito = digitos(s), minusculo = minusculo(s), maiusculo = maiusculo(s), caracterEspecial = caracterEspecial(s);

    if((s.length()) < 6){
      falta = 6 - (s.length());
      System.out.println("A senha precisa conter no mínimo 6 caracteres");
    }else{ 
      if(!digito){
        falta = falta + 1;
        System.out.println("A senha precisa conter no mínimo 1 digito.");
      }
      if(!minusculo){
        falta = falta + 1;
        System.out.println("A senha precisa conter no mínimo 1 letra em minúsculo.");
      }
      if(!maiusculo){
        falta = falta + 1;
        System.out.println("A senha precisa conter no mínimo 1 letra em maiúsculo.");
      }
      if(!caracterEspecial){
        falta = falta + 1;
        System.out.println("A senha precisa conter  no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
      }
    }
    return falta;
  }

  public static void main(String[] args) {
    System.out.print("Digite senha :");
    String senha = sc.nextLine();
    
    System.out.println(senhaSegura(senha)); 
    
  }

}