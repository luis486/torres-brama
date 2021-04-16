package ui;
import model.*;
import java.util.Scanner;

public class Main {

  
    private static Scanner sc = new Scanner(System.in);
    private static Torres torres;
    
    public static void main(String[] args) throws Exception {
        torres = new Torres();
        initialize();
    }

    public static void initialize(){
        System.out.println("Por favor ingrese el numero de casos y luego el numero de discos que desea");
        int numberCases = Integer.parseInt(sc.nextLine());
        int[] disk = new int[numberCases]; 
        for(int i = 0; i < numberCases; i++){
            disk[i] = Integer.parseInt(sc.nextLine());
           
        }
        for(int j = 0; j < numberCases; j++){
            System.out.println(disk[j] + " " + 0 + " " + 0);
            torres.hanoiTowers(disk[j]);
            System.out.println("");
        }

    }
}
