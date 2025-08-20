public class tallervariable {
     
public static void main (String[]args){

double d1=42.0;
double d2=58.5;
double d3=37.2;
double t1=0.9;
double t2=1.4;
double t3=0.8;
double l1=5.1;
double l2=6.9;
double l3=4.3;
double precioLitro=1.35;
double masaCargaKg=1200;
double largo=2.0;
double ancho=1.2;
double alto=1.1;
double p1=2.5;
double p2=3.0;
double p3=2.0;
double deprecPorKm=0.08;
double volCamionM3=10.0;
double fCO2=2.68;
double galPorLitro=0.264;
int vmin=30;
int vmax=90;
int va=40;
int vb=80;
double ca=0.05;
double cb=0.09;
double a=0.0008;
double b=0.08;
double c=4.0;

System.out.println(d1/t1);

System.out.println(d2/t2);

System.out.println(d3/t3);

double v1=46.67;

double v2=41.79;

double v3=46.50;

System.out.println((d1*v1+d2*v2+d3*v3)/(d1+d2+d3));

System.out.println(d1/l1);

System.out.println(d2/l2);

System.out.println(d3/l3);

double vkml1=8.23;

double kml2=8.47;

double kml3=8.65;

System.out.println((d1+d2+d3)/(l1+l2+l3));

double kmltotal=8.44;

System.out.println((l1+l2+l3)*precioLitro);

Double comb=22.00;

System.out.println((d1+d2+d3)*deprecPorKm);

double dep=11.016;

System.out.println(p1+p2+p3);

double peajes=7.5;

System.out.println(comb+dep+peajes);

double directo=40.51;

System.out.println(directo/(d1+d2+d3));

double costoKm=0.29;

System.out.println(largo*ancho*alto);

double VolumenM3=2.64;

System.out.println(masaCargaKg/VolumenM3);

double densidad=454.54;

System.out.println(VolumenM3/volCamionM3);

double ocupacion=0.264;

System.out.println((l1+l2+l3)*fCO2);

double CO2total=43.68;

System.out.println(CO2total/(d1+d2+d3));

double CO2porkm=0.317;

System.out.println();

}
}
