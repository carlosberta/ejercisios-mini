
public class circulos2 {
    public static void main (String args[]){
        circulos circulo1 = new circulos("circulo1", "azul", 5);
        circulos circulo2 = new circulos ("circulo2", "rojo", 3);

        System.out.println("valores iniciales de circulo1");
        System.out.println("nombre: " + circulo1.getNombre());
        System.out.println("color: " + circulo1.getColor());
        System.out.println("radio: " + circulo1.getRadio());

        System.out.println("valores iniciales de circulo2");
        System.out.println("nombre: " + circulo2.getNombre());
        System.out.println("color: " + circulo2.getColor());
        System.out.println("radio: " + circulo2.getRadio());

        circulo1.setNombre("circulo1modificado");
        circulo1.setColor("negro");
        circulo1.setRadio(10);

        circulo2.setNombre("circulo2modificado");
        circulo2.setColor ("naranja");
        circulo2.setRadio(8);

        System.out.println("valores modificados de circulo1");
        System.out.println("nombre: " + circulo1.getNombre());
        System.out.println("color: " + circulo1.getColor());
        System.out.println("radio: " + circulo1.getRadio());

        System.out.println("valores modificados de circulo2");
        System.out.println("nombre: " + circulo2.getNombre());
        System.out.println("color: " + circulo2.getColor());
        System.out.println("radio: " + circulo2.getRadio());

        int diametro1 = circulo1.calculardiametro();
        double area1= circulo1.calculararea();
        System.out.println("diametro de circulo1 + " + diametro1);
        System.out.println("area de circulo1: " + area1);

        int diametro2 = circulo2.calculardiametro();
        double area2 = circulo2.calculararea();
        System.out.println("diametro de circulo2 + " + diametro2);
        System.out.println("area de circulo2: " + area2);

        int sumadediametros = diametro1 + diametro2;
        System.out.println("suma de los diametros: " + sumadediametros);

        double sumaareas = area1 + area2;
        System.out.println("suma de las areas: " + sumaareas);




    }
}
