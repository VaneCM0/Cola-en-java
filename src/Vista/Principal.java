/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.Pacientes;
import Controlador.ColaDinamica;
import Controlador.Nodo;
import Controlador.Teclado;
import java.io.IOException;

/**
 *
 * @author medin
 */

public class Principal {
    public static void main(String[] args) throws IOException{
    ColaDinamica<Pacientes> espera = new ColaDinamica<>();
ColaDinamica<Pacientes> atencion = new ColaDinamica<>();
Teclado sc = new Teclado();



int op = 0;



do {
System.out.println("\n\n<<< Pacientes >>>");
System.out.println("1.- Registro de Paciente");
System.out.println("2.- Registro de Atencón");
System.out.println("3.- Pacientes en espera");
System.out.println("4.- Pacientes atendidos");
System.out.println("5.- Total de pacientes");
System.out.println("6.- Reporte pacientes en espera");
System.out.println("7.- Reporte pacientes atendidos");
System.out.println("0.- Salir");
System.out.print("Opcion? ---> ");
op = sc.getInt();



switch (op) {
case 1:
System.out.println("\n\n<<< Registro de Pacientes>>>");
System.out.print("Número de Seguro Social: ");
String num = sc.getString();
System.out.print("Nombre: ");
String nombre = sc.getString();
System.out.print("Padecimiento: ");
String padecimiento = sc.getString();
System.out.print("Alergías: ");
String alergia = sc.getString();
System.out.println("\n*** Tipos de Atención ***");
System.out.println("1.- Atención inminente");
System.out.println("2.- Atención urgente");
System.out.println("3.- Atención próxima");
System.out.println("***********************");
System.out.print("Tipo de atención: ");
int ate = sc.getInt();
Pacientes e = new Pacientes(num, nombre, padecimiento, alergia, ate);



espera.enqueue(e);
System.out.println("***Agregado Correctamente ***");
//System.out.println("el primero es" + espera.primero());
//System.out.println("toda" + espera.toString());
break;
case 2: System.out.println("\n\n<<< Registro de Atención>>>");
e = espera.dequeue();
System.out.println("El paciente con los siguientes datos \n"+ atencion.enqueue(e));
System.out.println("***Ha sido atendido***");
break;
case 3: System.out.println("\n\n<<<Pacientes en espera>>>");
System.out.println("Los pacientes en espera son: " +espera.size());
System.out.println("*****************************************");
break;
case 4: System.out.println("\n\n<<<Pacientes atendidos>>>");
System.out.println("Los pacientes atendidos son: " +atencion.size());
System.out.println("*****************************************");
break;
case 5: System.out.println("\n\n<<<Total de pacientes>>>");
int suma = espera.size()+atencion.size();
System.out.println("Los pacientes en turno son: " + suma);
System.out.println("*****************************************");
break;
case 6: System.out.println("\n\n<<<Reporte pacientes en espera>>>");
System.out.println(espera.toString());
System.out.println("*****************************************");
break;
case 7: System.out.println("\n\n<<<Reporte pacientes en atención1>>>");
System.out.println(atencion.toString());
System.out.println("*****************************************");
break;
default:
System.out.println("\n\n<<<Opción incorrecta>>>");
break;
}
} while (op != 0);
}
    }
    

