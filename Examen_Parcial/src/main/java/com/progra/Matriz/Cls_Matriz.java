package com.progra.Matriz;

/**
 *
 * @author ASUS
 */
public class Cls_Matriz 
{
    public static String ma[][] = {{"Nombre", "Enero", "Febrero", "Marzo", "Abril", "Total Ventas", "20%", "35%", "Total VC","ISR 5%", "Liquido a Recibir"},
        {"Juan", "199", "248", "398", "725", "     0", "         0", " 0", "    0", "           0", "        0        "},
        {"Rodigo", "195", "200","475", "787", "     0", "         0", " 0", "    0", "           0", "        0        "},
        {"Luisa", "285", "345", "913", "598", "     0", "         0", " 0", "    0", "           0", "        0        "}, 
        {"Rosmey", "356", "348", "535", "800", "     0", "         0", " 0", "    0", "           0", "        0        "},
        {"Carlos", "200", "435", "999", "124", "     0", "         0", " 0", "    0", "           0", "        0        "},
        {"Total", "0","0","0","0","     0","         0"," 0","    0","           0","        0        "}};
    
//    public static String ma[][] = {{"Nombre", "Enero", "Febrero", "Marzo", "Abril", "Total Ventas", "20%", "35%", "Total VC","ISR 5%", "Liquido a Recibir"},
//        {"Juan", "199", "248", "398", "725", "0", "0", "0", "0", "0", "0"},
//        {"Rodigo", "195", "200","475", "787", "0", "0", "0", "0", "0", "0"},
//        {"Luisa", "285", "345", "913", "598", "0", "0", "0", "0", "0", "0"}, 
//        {"Rosmey", "356", "348", "535", "800", "0", "0", "0", "0", "0", "0"},
//        {"Carlos", "200", "435", "999", "124", "0", "0", "0", "0", "0", "0"},
//        {"Total", "0","0","0","0","0","0","0","0","0","0"}};

        
        public static final int NOMBRES = 0;
        public static final int ENERO = 1;
        public static final int FEBRERO = 2;
        public static final int MARZO = 3;
        public static final int ABRIL = 4;
        public static final int TOTALV = 5;
        public static final int VEINTE = 6;
        public static final int TREINTA = 7;
        public static final int TOTALVC = 8;
        public static final int ISR = 9;
        public static final int LIQUIDO = 10;
        
        public static final int TOTAL = 6;
    
    public static void imprimir()
    {
        for (int x = 0; x < ma.length; x++) 
        {
            System.out.print("|");
            for (int y = 0; y < ma[x].length; y++) 
            {
                 System.out.print(ma[x][y]);
                if(y != ma[x].length-1)
                {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
     
    public void totalv(){
        int suma;
        //TOTALV
        for (int c = 1; c <= 5; c++) {
                
                suma = Integer.valueOf(ma[c][ENERO]);
                suma = suma + Integer.valueOf(ma[c][FEBRERO]);
                suma = suma + Integer.valueOf(ma[c][MARZO]);
                suma = suma + Integer.valueOf(ma[c][ABRIL]);
                
                ma[c][TOTALV] = String.valueOf("   "+suma); 
        } 
    }
    
    public void porcentajes(){
        double porcentaje;
        //PORCENTAJES
        for (int c = 1; c <= 5; c++) {
            
            if(Double.valueOf(ma[c][TOTALV]) <= 2000){
                porcentaje = Double.valueOf(ma[c][TOTALV]) * 0.20;
                
                ma[c][VEINTE] = "       "+String.format("%.2f", porcentaje);
            }
            else if(Double.valueOf(ma[c][TOTALV]) >= 2001){
                porcentaje = Double.valueOf(ma[c][TOTALV]) * 0.35;
                
                ma[c][TREINTA] = String.format("%.2f", porcentaje);
            } 
        }
    }
    
    public void totalvc(){
        
        double suma2;
        //TOTALVC
        for (int c = 1; c <= 5; c++) {
            
            suma2 = Double.valueOf(ma[c][TOTALV]);
            suma2 = Double.valueOf(ma[c][VEINTE]) + suma2;
            suma2 = suma2 + Double.valueOf(ma[c][TREINTA]);
            
            ma[c][TOTALVC] = String.format("%.2f", suma2);
        }
    }
    
    public void isr(){     
        double isr;
        //ISR
        for (int c = 1; c <= 5; c++) {
            
            isr = Double.valueOf(ma[c][TOTALVC]) * 0.05;
            
            ma[c][ISR] = "        "+(String.format("%.2f", isr));
        }
    }
    
    public void liquido(){
        double suma3;
        //Liquido
        for (int c = 1; c <= 5; c++) {
            
           suma3 = Double.valueOf(ma[c][ISR]);
           suma3 = Double.valueOf(ma[c][TOTALVC]) - suma3;
           
           ma[c][LIQUIDO] = "     "+(String.format("%.2f", suma3)+"     "); 
        }
    }
    
    public void masrecibio(){
        
        double a = Double.valueOf(ma[1][LIQUIDO]);
        int b = 0;
        for (int c = 1; c <= 5; c++) {
            
            if(a < (Double.valueOf(ma[c][LIQUIDO]))){
                
                a = Double.valueOf(ma[c+1][LIQUIDO]);
                b = c+1;
            }
        }
        System.out.println("El que mas recibio es: "+ma[b][NOMBRES]+ " "+a);
    }
    
    public void menosrecibio(){
        
        double a = Double.valueOf(ma[1][LIQUIDO]);
        int b = 0;
        for (int c = 1; c <= 5; c++) {
            
            if(a > Double.valueOf(ma[c][LIQUIDO])){
                
                a = Double.valueOf(ma[c+1][LIQUIDO]);
                b = c;
            }
        }
        System.out.println("El que menos recivio es: "+ma[b+1][NOMBRES]+" "+a);
    }
    
    public void total(){
        
        int suma = 0;
        double suma2 = 0.0;
        int en[] = new int[5];
        int fe[] = new int[5];
        int mar[] = new int[5];
        int ab[] = new int[5];
        int ven[] = new int[5];
        double veinte[] = new double[5];
        double treinta[] = new double[5];
        double tvc[] = new double[5];
        double isr[] = new double[5];
        double liquido[] = new double[5];
        
        //enero
        for (int c = 0; c <= 4; c++) {
            
            en[c] = Integer.valueOf(ma[c+1][ENERO]);      
            
        }
        for (int elemento:en) {
            
            suma = suma + elemento;
        }
        ma[TOTAL][ENERO] = suma+"";
        
        suma = 0;
        //febrero
        for (int c = 0; c <= 4; c++) {
            
            fe[c] = Integer.valueOf(ma[c+1][FEBRERO]);      
            
        }
        for (int elemento:fe) {
            
            suma = suma + elemento;
        }
        ma[TOTAL][FEBRERO] = suma+"";
        
        suma = 0;
        //marzo
        for (int c = 0; c <= 4; c++) {
            
            mar[c] = Integer.valueOf(ma[c+1][MARZO]);      
            
        }
        for (int elemento:mar) {
            
            suma = suma + elemento;
        }
        ma[TOTAL][MARZO] = suma+"";
        
        suma = 0;
        //abril
        for (int c = 0; c <= 4; c++) {
            
            ab[c] = Integer.valueOf(ma[c+1][ABRIL]);      
            
        }
        for (int elemento:ab) {
            
            suma = suma + elemento;
        }
        ma[TOTAL][ABRIL] = suma+"";
        
        suma = 0;
        //total ventas
        for (int c = 0; c <= 4; c++) {
            
            String b = ma[c+1][TOTALV].replaceAll("\\s+","");
            ven[c] = Integer.valueOf(b);      
            
        }
        for (int elemento:ven) {
            
            suma = suma + elemento;            
        }
        ma[TOTAL][TOTALV] = "   "+suma;
        
        suma2 = 0.0;
        //veinte
        for (int c = 0; c <= 4; c++) {
            
            String b = ma[c+1][VEINTE].replaceAll("\\s+","");
            veinte[c] = Double.valueOf(b);      
            
        }
        for (double elemento:veinte) {
            
            suma2 = suma2 + elemento;
 
        }
        ma[TOTAL][VEINTE] = "       "+suma2;
        
        suma2 = 0.0;
        //treinta
        for (int c = 0; c <= 4; c++) {
            
            String b = ma[c+1][TREINTA].replaceAll("\\s+","");
            treinta[c] = Double.valueOf(b);      
            
        }
        for (double elemento:treinta) {
            
            suma2 = suma2 + elemento;            
        }
        ma[TOTAL][TREINTA] = ""+suma2;
        
        suma2 = 0.0;
        //total ventas comisiones
        for (int c = 0; c <= 4; c++) {
            
            String b = ma[c+1][TOTALVC].replaceAll("\\s+","");
            tvc[c] = Double.valueOf(b);      
            
        }
        for (double elemento:tvc) {
            
            suma2 = suma2 + elemento;    
        }
        ma[TOTAL][TOTALVC] = ""+suma2;
        
        suma2 = 0.0;
        //ISR
        for (int c = 0; c <= 4; c++) {
            
            String b = ma[c+1][ISR].replaceAll("\\s+","");
            isr[c] = Double.valueOf(b);      
            
        }
        for (double elemento:isr) {
            
            suma2 = suma2 + elemento;            
        }
        ma[TOTAL][ISR] = "        "+suma2;
        
        suma2 = 0.0;
        //liquido
        for (int c = 0; c <= 4; c++) {
            
            String b = ma[c+1][LIQUIDO].replaceAll("\\s+","");
            liquido[c] = Double.valueOf(b);      
            
        }
        for (double elemento:liquido) {
            
            suma2 = suma2 + elemento;            
        }
        ma[TOTAL][LIQUIDO] = "    "+suma2+"     ";
    }
}
