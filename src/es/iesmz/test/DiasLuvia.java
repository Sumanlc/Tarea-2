package es.iesmz.test;

public class DiasLuvia {

    private boolean [] [] diasLluviosos;

    public DiasLuvia(){
        diasLluviosos = new boolean[12][31];
    }

    public boolean registrarDia(int dia, int mes, boolean lluvia){
        if( mes < 1 || mes > 12 || dia < 1 || dia > 31){
            System.out.println("Error: Día no válido (" + dia + "/" + mes + ")");
            return false;
        }
        diasLluviosos[mes - 1 ][dia - 1] = lluvia;
        return true;
    }

    public boolean consultarDia( int dia, int mes){
        if(mes < 1 || mes > 12 || dia < 1 || dia > 31 ){
            System.out.println("Error: Día no válido (" + dia + "/" + mes + ")");
            return false;
        }
        return diasLluviosos [mes - 1] [dia - 1];


    }

    public int contarDiasLluviosos(){
        int cont = 0;
        for(boolean[] mes : diasLluviosos){
            for (boolean dia : mes){
                if(dia){
                    cont++;
                }
            }
        }
        System.out.println("Se han registrado " + cont + " días de lluvia");
        return cont;

    }

    /*public int trimestreLluvioso(){

    }

    public int primerDiaLluvia(){

    }*/

}
