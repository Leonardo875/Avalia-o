/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.Scanner;
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Digite um número de 1 a 10 para executar um programa ou 0 para sair: ");
       int a = entrada.nextInt();
       int b;
       
       int i = a;
       
       while(i!=0){
           switch(i){
                case 1 :um();break;
                case 2 :dois();break;
                case 3 :tres();break;
                case 4 :quatro();break;
                case 5 :cinco();break;
                case 6 :seis();break;
                case 7 :sete();break;
                case 8 :oito();break;
                case 9 :nove();break;
                case 10 :dez();break;
                default : System.out.println("Somente números de 1 a 10 ou 0");break;
           }
           System.out.print("Digite um número de 1 a 10 para executar um programa ou 0 para sair: ");
            a = entrada.nextInt();
           i = a;
       }
       
    
    
    
    }
      public static void um() {
       Scanner entrada = new Scanner(System.in);
       String sx;
       System.out.print("Informe seu sexo[M/F]:");
       sx = entrada.nextLine();
       System.out.print("Informe seu peso:");
       double pc = entrada.nextDouble();
       System.out.print("Informe sua altura em centimetros:");
       double alt = entrada.nextDouble();
       System.out.print("Informe sua idade:");
       int id = entrada.nextInt();
       
       
       
       if("M".equals(sx))
       {
           double geb = 66.47+(13.75*pc)+(5*alt)-(6.76*id);
           System.out.print("O valor energetico gasto é"+geb);
       }
       else if ("F".equals(sx))
       {
           double geb = 655.1+(9.56 * pc)+ (1.85*alt)-(4.67*id);
           System.out.print("O valor energetico gasto é"+geb);
       }
       
        
        
    }
      public static void dois(){
          Scanner num = new Scanner(System.in);
      int vlr,c,d,u,j;
      System.out.println("Digite um número de 0 a 999: ");
      String extenso,cent = null,dez = null,uni = null;
      vlr = num.nextInt();
      c = vlr/100;
      d = vlr % 100/10;
      u = (vlr % 100)%10;
      j = vlr/1;
      if(c==1 && d==0 && u == 0){
          System.out.println("cem");}
      else if (c == 0 && d==0 && u==0){
          System.out.println("zero");
      }
      else
      {
          if(c>=1 && d==0 && u==0){
              switch(c){
                  case 1 :System.out.println("Cento");
                  break;
                  case 2 :System.out.println("Duzentos");
                  break;
                  case 3 :System.out.println("Trezentos");
                  break;
                  case 4 :System.out.println("Quatrocentos");
                  break;
                  case 5 :System.out.println("Quinhentos");
                  break;
                  case 6 :System.out.println("Seiscentos");
                  break;
                  case 7 :System.out.println("Setecento");
                  break;
                  case 8 :System.out.println("Oitocentos");
                  break;
                  case 9 :System.out.println("Novecentos");
                  break;
              }
          }
      
            else
           
              switch(c)
              {
                  case 1 :System.out.println("Cento e");break;
                  case 2 :System.out.println("Duzentos e");break;
                  case 3  :System.out.println("Trezentos e");break;
                  case 4 :System.out.println("Quatrocentos e");break;
                  case 5 :System.out.println("Quinhentos e");break;
                  case 6 :System.out.println("Seiscentos e");break;
                  case 7 :System.out.println("Setecentos e");break;
                  case 8 :System.out.println("Oitocentos e");break;
                  case 9 :System.out.println("Nocecentos e");break;
              }
           }
          if (d==1)
          {
              switch(u)
              {
                  case 0 :System.out.println("Dez");break;
                  case 1 :System.out.println("Onze");break;
                  case 2 :System.out.println("Doze");break;
                  case 3 :System.out.println("Treze");break;
                  case 4 :System.out.println("Quatorze");break;
                  case 5:System.out.println("Quinze");break;
                  case 6:System.out.println("Dezesseis");break;
                  case 7 :System.out.println("Dezessete");break;
                  case 8 :System.out.println("Dezoito");break;
                  case 9 :System.out.println("Dezenove");break;
              }
          }
          else if(d>1)
          {
                switch(d)
                {
                    case 2 :System.out.println("Vinte");break;
                    case 3 :System.out.println("Trinta");break;
                    case 4 :System.out.println("Quarenta");break;
                    case 5 :System.out.println("Cinquenta");break;
                    case 6 :System.out.println("Sessenta");break;
                    case 7 :System.out.println("Setenta");break;
                    case 8 :System.out.println("Oitenta");break;
                    case 9 :System.out.println("Noventa");break;
                    
                }
                switch(u)
                {
                    case 1 :System.out.println(" e Um");break;
                    case 2 :System.out.println("e Dois");break;
                    case 3 :System.out.println("e Três");break;
                    case 4 :System.out.println("e Quatro");break;
                    case 5 :System.out.println("e Cinco");break;
                    case 6 :System.out.println("e Seis");break;
                    case 7 :System.out.println("e Sete");break;
                    case 8 :System.out.println("e Oito");break;
                    case 9 :System.out.println("e Nove");break;
                }
          }
          else
          {
              switch(u)
              {
                  case 1 :System.out.println("Um");break;
                  case 2 :System.out.println("Dois");break;
                  case 3 :System.out.println("Tres");break;
                  case 4 :System.out.println("Quatro");break;
                  case 5 :System.out.println("Cinco");break;
                  case 6 :System.out.println("Seis");break;
                  case 7 :System.out.println("Sete");break;
                  case 8 :System.out.println("Oito");break;
                  case 9 :System.out.println("Nove");break;
              }
             
          }
          extenso = (cent + dez + uni);
          System.out.println(extenso);
      }
   
       public static void tres(){ 
             String resposta;
         Scanner entrada = new Scanner (System.in);
         System.out.println("Digite um número :");
         int a = entrada.nextInt();
         System.out.print("Digite um número que pode ser multiplo de "+a+":");
         int b = entrada.nextInt();
         System.out.println("Os valores São multiplos ou Não são multiplos?");
         resposta = entrada.nextLine();
       
      
         }

       
          public static void quatro(){ 
            Scanner entrada = new Scanner(System.in);
        System.out.print("Digite 1 ou 2:");
        int i = entrada.nextInt();
        
        System.out.print("Digite um número real:");
         int a = entrada.nextInt();
          System.out.print("Digite um número real:");
         int b = entrada.nextInt();
          System.out.print("Digite um número real:");
         int c = entrada.nextInt();
         
         if(i==1){
            if(a==b && a==c){
            System.out.println(a);
            System.out.println(a);
            System.out.println(a);
            }
        
            if (a!=b && a!=c){
                if(a<b && a<c){
                    if(b==c){
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(b);
                    }
                    if(b<c){
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                    }
                    if(b>c){
                        System.out.println(a);
                        System.out.println(c);
                        System.out.println(b);
                    }
                }


                if(a>b && a>c){
                    if(b==c){
                        System.out.println(b);
                        System.out.println(b);
                        System.out.println(a);
                    }
                    if(b<c){
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(a);
                    }
                    if(b>c){
                        System.out.println(c);
                        System.out.println(b);
                        System.out.println(a);
                    }
                }
            }

            if(a>c && a<b){
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }

            if(a>b && a<c){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }
        }
          
        if(i==2){
            if(a==b && a==c){
                System.out.println(a);
                System.out.println(a);
                System.out.println(a);
            }
        
            if (a!=b && a!=c){
                if(a<b && a<c){
                    if(b==c){
                        System.out.println(b);
                        System.out.println(b);
                        System.out.println(a);
                    }
                    if(b<c){
                        System.out.println(c);
                        System.out.println(b);
                        System.out.println(a);
                    }
                    if(b>c){
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(a);
                    }
                }


                if(a>b && a>c){
                    if(b==c){
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                    }
                    if(b<c){
                        System.out.println(a);
                        System.out.println(c);
                        System.out.println(b);
                    }
                    if(b>c){
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                    }
                }
            }
        
            if(a>c && a<b){
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            }

            if(a>b && a<c){
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        }
        
        
        else if(i!=1 && i!=2){
            System.out.println("O programa só aceita inteiros 1 e 2");
        }
        }

          
          public static void cinco(){
            Scanner entrada = new Scanner(System.in);
       int h,hfh,hxh;
       System.out.println("Digite horas extras em minutos:");
       int hx = entrada.nextInt();
       System.out.println("Digite o número de horas-falta em minutos:");
       int hf = entrada.nextInt();
       
      
       
       hfh = hf/60;
       System.out.println("O número de horas faltas em horas  é"+hfh);
       
       hfh = hf/60;
       System.out.println("O número de horas extras em horas  é"+hfh);
       h = (hfh)-(2/3*(hfh));
       
       if(h >2400)
       {
           
           System.out.println("O premio e 500,00 reais");
           
           
       } 
       
       if(h>1801 && h<2400)
       {
         
           System.out.println("O premio e 400,00 reais");
          
       }
       if(h>1201 && h<1800)
       {
        
           System.out.println("O premio e 300,OO reais");
          
       }
       if (h>600 && h<1200)
       {
          
           System.out.println("O premio e 200,00 reais ");
           
       }
        if(h<600)
        {
          
            System.out.print("O premio e 100,00 reais");
           
        }
   
        }
        
          
           public static void seis()
           { 
             Scanner scan = new Scanner(System.in);
        
             System.out.print("Digite o seu horário de entrada (0 a 24h): ");
             int entrada = scan.nextInt();
        
             int saida = entrada+6;
             int saida_especial = saida - 24;
        
             if(entrada>18){
             System.out.println("A sua saida é as"+saida_especial+ "h");
            
             }
            else if (entrada>12){
            System.out.println(" A sua saída é as "+saida+"h");
            }
             else if(entrada>6){
            System.out.println("A sua saida é as "+saida+"h");
            }
         
          else {
             System.err.println("A sua saida é as "+saida+"h" );
            }

        }
        
           
         public static void sete(){ 
         Scanner scan = new Scanner(System.in);
       
        float i = 0;
        float fat = 1;
        float a = 1;
       
         while(a>=0){
         System.out.print("Digite um número: ");
          a = scan.nextInt();
          fat+=a;
          i++;
       }
         System.out.println(fat/(i-1));
    }
 
        public static void oito(){ 
            Scanner entrada = new Scanner(System.in);
     
    
    String codigo;
    int quanto;
    double a;
     
     System.out.println("Cachorro custa R$ 2,00 Código[C] ");
     System.out.println("Refrigerante custa R$ 2,50 Código[R] ");
     System.out.println("Sobremesa custa R$ 1,50 Código[S] ");
     
     System.out.print("Digite o código do pedido: ");
     codigo = entrada.next();
     
     System.out.print("Qual a quantidade desejada? somente números: ");
     quanto = entrada.nextInt();
     
     int i = 1;
     double b = 0;
     
     while(i!=0){
         if("C".equals(codigo)){
             a = 2*quanto;
             System.out.println(quanto+"Cachorro Quente é R$"+a);
             b +=a;
         }
         else if("R".equals(codigo)){
             a = 2.5*quanto;
             System.out.println(quanto+"Refrigerante é R$"+a);
             b += a;
         }
         else if("S".equals(codigo)){
             a = 1.5*quanto;
             System.out.println(quanto+"Sobremesa é R$"+a);
             b += a;
         }
         else{
             System.out.println("Só aceita código como (C,R,S)");
         }
        System.out.print("Digite X para sair ou qualquer letra para prosseguir: ");
        String saida = entrada.next();
        
        if("X".equals(saida)){
            System.out.println("O preço total será R$"+b);
            i = 0;
        }
        else{
            System.out.print("Digite o Código do Alimento: ");
            codigo = entrada.next();
            System.out.print("Qual é a quantidade desejada? somente números: ");
            quanto = entrada.nextInt();
            
            i = 1;
          }
        System.out.println();
        }
             
     
       }

         
      public static void nove(){ 
           Scanner entrada = new Scanner(System.in);
       
       int i , fat = 0;
       
       System.err.print("Digite um número: ");
       int num  =  entrada.nextInt();
       
       for(i = 1 ; i <= num; i++){
           fat+=i;
       }
       System.out.println(fat);
    
      }

     public static void dez(){
          Scanner entrada = new Scanner(System.in);
       System.out.print("Digite um número inteiro positivo: ");
       int n = entrada.nextInt();
       int soma = 1; 
       int i = 1;
       while(i<=n){
           if(n>=7){
               float a = i%2;
              float b = i%3;
              float c = i%4;
              float d = i%5;
              float e = i%6;
              float f = i%7;
              float g = i%8;
             float h = i%9;
                      
                      if(a!=0 && b!=0 && c!=0 && d!=0 && e!=0 && f!=0 && g!=0 && h!=0){
                      soma +=i;
                    } 
           }
           i++;
         }
        if(n>=7){
            System.out.println(soma+2+3+5+7);
        }
             
        else if(n<7){
            switch(n){
                case 1 : System.out.println("1"); break;
                case 2 : System.out.println("3"); break;
                case 3 : System.out.println("6"); break;
                case 4 : System.out.println("6"); break;
                case 5 : System.out.println("11"); break;
                case 6 : System.out.println("11"); break;
            }
        }
             
    }
          
     
}
