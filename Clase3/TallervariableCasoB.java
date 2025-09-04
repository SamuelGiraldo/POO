public class TallervariableCasoB {
     
public static void main (String[]args){

double  d1=35.0;
double  d2=72.0;
double  d3=53.0;
double  t1=0.7;
double  t2=1.6;
double  t3=1.1;
double  l1=4.4;
double  l2=9.0;
double  l3=6.2;
double  precioLitro=1.42;
double  masaCargaKg=1450;
double  largo=2.2;
double  ancho=1.3;
double  alto=1.0;
double  p1=3.2;
double  p2=3.8;
double  p3=2.7;
double  deprecPorKm=0.085;
double  volCamionM3=12.0;
double  fCO2=2.64;
double  galPorLitro=0.264172;
double vmin=30;
double vmax=90;
double va=40;
double vb=80;
double  ca=0.05;
double  cb=0.09;
double  a=0.0009;
double  b=0.09;
double  c=3.8;


System.out.println(d1/t1);

System.out.println(d2/t2);

System.out.println(d3/t3);

double  v1=50.0;

double  v2=45.0;

double  v3=48.18;

System.out.println((d1*v1+d2*v2+d3*v3)/(d1+d2+d3));

double  vprom=47.14;

System.out.println(d1/l1);

System.out.println(d2/l2);

System.out.println(d3/l3);

double  kml1=7.95;

double  kml2=8.00;

double  kml3=8.548;

System.out.println((d1+d2+d3)/(l1+l2+l3));

double  kmltotal=8.163;

System.out.println((l1+l2+l3)*precioLitro);

double  comb=27.832;

System.out.println((d1+d2+d3)*deprecPorKm);

double  dep=13.600;

System.out.println(p1+p2+p3);

double  peajes=9.7;

System.out.println(comb+dep+peajes);

double  directo=51.132;

System.out.println(directo/(d1+d2+d3));

double  costoKm=0.319;

System.out.println(largo*ancho*alto);

double  VolumenM3=2.860;

System.out.println(masaCargaKg/VolumenM3);

double  densidad=506.993;

System.out.println(VolumenM3/volCamionM3);

double  ocupacion=0.238;

System.out.println((l1+l2+l3)*fCO2);

double  CO2total=51.744;

System.out.println(CO2total/(d1+d2+d3));

double  CO2porkm=0.323;

System.out.println((l1+l2+l3)*galPorLitro);

double  galTot=5.177;

System.out.println((vprom-vmin)/(vmax-vmin));

double  vnorm=0.285;   

System.out.println((v1+v2+v3)/3);

double  vmedia=47.726;

System.out.println(Math.sqrt(((Math.pow(v1-vmedia,2))+(Math.pow(v2-vmedia,2))+(Math.pow(v3-vmedia,2)))/3));

double  sigma=2.066;

System.out.println((t1*v1+t2*v2+t3*v3)/(t1+t2+t3));

double  vpond_t=47.058;

System.out.println(ca+(cb-ca)*(vprom-va)/(vb-va));

double  cvprom=0.05714;

System.out.println((cvprom)*(d1+d2+d3));

double  costoMant=9.142;

double  w1=0.25;

double  w2=0.25;

double  w3=0.25;

double  w4=0.25;

System.out.println(w1*(1/costoKm)+(w2*kmltotal)+w3*(1/CO2porkm)+w4*(1/(1+sigma)));

double  Score=3.6799;
}
}