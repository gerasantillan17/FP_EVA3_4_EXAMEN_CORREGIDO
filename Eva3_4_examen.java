/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_examen;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class Eva3_4_examen {
 static final int PIEDRA =1;
      static final int PAPEL =2; 
      static final int  TIJERA =3;
      
      public static final int EMPATE = 0;
     public static final int GANA = 1;
     public static final int PIERDE = 2;
    public static void main(String[] args) {
       
        int resu;
        int jugada;
        int resuJugada;
        do{
            resu = piedrajugar("Introduce tu jugada (1-piedra, 2-papel, 3-tijera, 0-salir");  
            jugada = generarJugadaCamp();
            System.out.println(jugada);
             resuJugada = evaluarPartidad(resu, jugada);
            System.out.println(resuJugada);
        }while(resu!= 0);
          
        
    }
    public static int piedrajugar(String mensaje){
          Scanner captu = new Scanner(System.in);
          System.out.println(mensaje);
          int seleccion = captu.nextInt();
          return seleccion;
     }
    public static int generarJugadaCamp(){
        int jugada;
        double valor = Math.random();
        //Como  generamos la jugada
        if ((valor >=0) &&(valor <0.3))     
            jugada =PIEDRA;// piedra
        else if((valor >=0.3) &&(valor <0.6))
            jugada= PAPEL;//PAPEL
        else
            jugada = TIJERA;//TIJERA
        return jugada;
    }
    public static int evaluarPartidad(int jugadaUsu, int jugadaPc){
        int resu=0; //empate 0, gana 1, pierde 2
        if ((jugadaUsu ==PIEDRA) &&(jugadaPc==PIEDRA))
            resu =EMPATE;
        else if((jugadaUsu ==PAPEL) &&(jugadaPc==PIEDRA))
            resu=PIERDE;
        else if((jugadaUsu ==PIEDRA) &&(jugadaPc ==TIJERA))
            resu=PIERDE;
        else if((jugadaUsu ==PAPEL) &&(jugadaPc==PIEDRA))
             resu=GANA;
        else if((jugadaUsu ==PIEDRA) &&(jugadaPc==PIEDRA))
             resu=EMPATE;
        else if((jugadaUsu ==PAPEL) &&(jugadaPc==TIJERA))
             resu=PIERDE;
        else if((jugadaUsu ==TIJERA) &&(jugadaPc==PIEDRA))
             resu=PIERDE;
        else if((jugadaUsu ==PIEDRA) &&(jugadaPc==TIJERA))
               resu=GANA;
             return resu;
    }
}