import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Motor objMotor = new Motor("FE3456", "Mercedez");
        Conductor objConductor = new Conductor(90876, "Leo Messi");
        System.out.print(objMotor);
        System.out.print(objConductor);
        
        Vehiculo objVehiculo = new Vehiculo("POM321", objMotor);
        
        System.out.print(objVehiculo);
        objVehiculo.asignarConductor(objConductor);
    }
}