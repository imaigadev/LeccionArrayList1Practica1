package com.mycompany.estudiar2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Estudiar2 {
    public static void main(String[] args) {
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        List<Cobrador> co = new ArrayList<>();
        List<Almacenador> alm = new ArrayList<>();
        List<JefeArea> jA = new ArrayList<>();
        
        jA.add(new JefeArea (901,"Panaderia","Ezequiel","Ramirez","Solis",60752345,45,7800,"SORE090727","SORE090727HMCTMRA8"));
        jA.add(new JefeArea (902,"Carnes","Carlos","Perez","Gomez",55432198,38,8500,"PEGC881012","PEGC881012HDFRMN02"));
        jA.add(new JefeArea (903,"Lacteos","Maria","Lopez","Hernandez",55887766,41,8200,"LOHM850505","LOHM850505MDFPRZ09"));
        jA.add(new JefeArea (904,"Abarrotes","Alejandro","Torres","Ruiz",66332211,29,7900,"TORA970315","TORA970315HMCXRS05"));
        jA.add(new JefeArea (905,"Electronica","Sofia","Mendoza","Castillo",77112233,35,9500,"MECS911120","MECS911120MMNLST01"));
        
        co.add(new Cobrador(101, "General", "Luis", "Garcia", "Gomez", 55123456, 25, 6000, "GAGL990812", "GAGL990812HDFRMN05"));
        co.add(new Cobrador(102, "Panaderia", "Ana", "Martinez", "Lopez", 55234567, 30, 6500, "MALA940520", "MALA940520MDFRMN08"));
        co.add(new Cobrador(103, "Frutas y Verduras", "Jorge", "Diaz", "Perez", 55345678, 22, 5800, "DIPJ021130", "DIPJ021130HDFRMN01"));
        co.add(new Cobrador(104, "Carne", "Laura", "Sanchez", "Ramirez", 55456789, 28, 6200, "SARL960214", "SARL960214MDFRMN03"));
        co.add(new Cobrador(105, "Electronica", "Miguel", "Gomez", "Torres", 55567890, 35, 6800, "GOTM890725", "GOTM890725HDFRMN09"));
        
        alm.add(new Almacenador(201, "Bodega", "Pedro", "Ramirez", "Vargas", 55876543, 29, 7000, "RAVP950418", "RAVP950418HMCXRS02"));
        alm.add(new Almacenador(202, "Estantes", "Juan", "Ortiz", "Cruz", 55987654, 24, 6500, "ORCJ000910", "ORCJ000910HMCXRS07"));
        alm.add(new Almacenador(203, "Reabastecedor", "Diana", "Reyes", "Mendez", 55098765, 27, 6800, "REMD970605", "REMD970605MMCXRS04"));
        alm.add(new Almacenador(204, "Bodega", "Hugo", "Morales", "Silva", 55109876, 32, 7200, "MOSH920122", "MOSH920122HMCXRS08"));
        alm.add(new Almacenador(205, "Estantes", "Elena", "Castillo", "Rojas", 55210987, 26, 6600, "CARE981015", "CARE981015MMCXRS01"));
        do{
            System.out.println("Selecciona una opcion");
            System.out.println("1. Lista de Cobradores");
            System.out.println("2. Lista de Almacenadores");
            System.out.println("3. Lista de Jefes de Area");
            System.out.println("-----------------------------");
            System.out.println("4. Agregar Cobrador");
            System.out.println("5. Agregar Almacenador");
            System.out.println("6. Agregar Jefe de Area");
            System.out.println("-----------------------------");
            System.out.println("7. Despedir Cobrador");
            System.out.println("8. Despedir Almacenador");
            System.out.println("9. Despedir Jefe de Area");
            System.out.println("------------------------------");
            System.out.println("10. Salir");
            if (sc.hasNextInt()){
            opc = sc.nextInt();
            }else{
                System.out.println("Ingresa un numero valido");
                sc.next();
            }
            if (opc == 1){
                System.out.println("COBRADORES");
                for(int i = 0; i<co.size(); i++){
                    System.out.println(co.get(i).getNombre()+" "+co.get(i).getAppaterno()+" "+co.get(i).getApmaterno());
                }
            }
            if (opc == 2){
                System.out.println("ALMACENADORES");
                for(int i = 0; i<alm.size();i++){
                    System.out.println(alm.get(i).getNombre()+" "+alm.get(i).getAppaterno()+" "+alm.get(i).getApmaterno());
                }
            }
            if (opc == 3){
                System.out.println("JEFES DE AREA");
                for(int i = 0; i<jA.size(); i++){
                    System.out.println(jA.get(i).getNombre()+" "+jA.get(i).getAppaterno()+" "+jA.get(i).getApmaterno());
                }
            }
            //--------------------------------------------------------------------------------------------------------------
            if (opc == 4){
                System.out.println("Ingresa el id del cobrador");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa el area del cobrador");
                String aria = sc.nextLine();
                System.out.println("Ingresa el nombre del cobrador");
                String nom = sc.nextLine();
                System.out.println("Ingresa el apellido paterno del cobrador");
                String app = sc.nextLine();
                System.out.println("Ingresa el apellido materno del cobrador");
                String apm = sc.nextLine();
                System.out.println("Ingresa el telefono del cobrador");
                int num = sc.nextInt();
                System.out.println("Ingresa la edad del cobrador");
                int ed = sc.nextInt();
                System.out.println("Ingresa el sueldo del cobrador");
                int sueld = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa el RFC del cobrador");
                String rfc= sc.nextLine();
                System.out.println("Ingresa el CURP del cobrador");
                String curp = sc.nextLine();
                co.add(new Cobrador(id,aria,nom,app,apm,num,ed,sueld,rfc,curp));
            }
            if (opc == 5){
                sc.nextLine();
                System.out.println("Ingresa el id del almacenador");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa el area del tipo de almacenador");
                String tipo = sc.nextLine();
                System.out.println("Ingresa el nombre del almacenador");
                String nom = sc.nextLine();
                System.out.println("Ingresa el apellido paterno del almacenador");
                String app = sc.nextLine();
                System.out.println("Ingresa el apellido materno del almacenador");
                String apm = sc.nextLine();
                System.out.println("Ingresa el telefono del almacenador");
                int num = sc.nextInt();
                System.out.println("Ingresa la edad del almacenador");
                int ed = sc.nextInt();
                System.out.println("Ingresa el sueldo del almacenador");
                int sueld = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa el RFC del almacenador");
                String rfc= sc.nextLine();
                System.out.println("Ingresa el CURP del almacenador");
                String curp = sc.nextLine();
                alm.add(new Almacenador(id,tipo,nom,app,apm,num,ed,sueld,rfc,curp));
            }
            if (opc == 6){
                sc.nextLine();
                System.out.println("Ingresa el id del Jefe de Area");
                int numemp = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa el area del Jefe de Area");
                String aria = sc.nextLine();
                System.out.println("Ingresa el nombre del Jefe de Area");
                String nom = sc.nextLine();
                System.out.println("Ingresa el apellido paterno del Jefe de Area");
                String app = sc.nextLine();
                System.out.println("Ingresa el apellido materno del Jefe de Area");
                String apm = sc.nextLine();
                System.out.println("Ingresa el telefono del Jefe de Area");
                int num = sc.nextInt();
                System.out.println("Ingresa la edad del Jefe de Area");
                int ed = sc.nextInt();
                System.out.println("Ingresa el sueldo del Jefe de Area");
                int sueld = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa el RFC del Jefe de Area");
                String rfc= sc.nextLine();
                System.out.println("Ingresa el CURP del Jefe de Area");
                String curp = sc.nextLine();
                jA.add(new JefeArea(numemp,aria,nom,app,apm,num,ed,sueld,rfc,curp));
            }
            
            //-------------------------------------------------------------------------------
            if (opc == 7){
                System.out.println("Ingresa el id del cobrador");
                int idemp= sc.nextInt();
                for(int i = 0; i<co.size();i++){
                    int ID = co.get(i).getIdempleado();
                    if (idemp == ID){
                        co.remove(i);
                        System.out.println("Cobrador eliminado con exito");
                        break;
                    }
                }
            }
            if ( opc == 8){
                System.out.println("Ingresa el id del almacenador");
                int idalm= sc.nextInt();
                for (int i = 0 ; i<alm.size();i++){
                    int ID = alm.get(i).getIdalmacenador();
                    if(idalm==ID){
                        alm.remove(i);
                        System.out.println("Almacenador despedido con exito");
                        break;
                    }
                }
            }
            if (opc==9){
                System.out.println("Ingrese el id unico de Jefe de area");
                int nemp = sc.nextInt();
                for(int i = 0; i<jA.size();i++){
                    int NEP = jA.get(i).getNumempleado();
                    if (nemp==NEP){
                        jA.remove(i);
                        System.out.println("Jefe de area eliminado correctamente");
                        break;
                    }
                }
            }
        }while(opc != 10);
    }
}
