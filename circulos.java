public class circulos {
    //atributos
    private String nombre, color;
    private int radio;

    public circulos () {
        this.nombre = "circulo";
        this.color = "azul";
        this.radio = 1;
    }
        public circulos (String nombre){
            this.nombre = nombre;
            this.color = "azul";
            this.radio =1;
        }
        public circulos (String nombre, String color){
        this.nombre = nombre;
        this.color = color;
        this.radio = 1;
        }
        public circulos (String nombre, String color, int radio){
        this.nombre = nombre;
        this.color = color;
        this. radio = radio;
        }

        public String getNombre(){
        return nombre;
        }
        public void setNombre (String nombre){
        this.nombre = nombre;
        }
        public String getColor(){
        return color;
        }
        public void setColor(){
        this.color = color;
        }
        public int getRadio(){
        return radio;
        }
        public void setRadio(){
        this.radio = radio;
        }
        public int calculardiametro (){
        return 2 * radio;
        }
        public double calculararea(){
        return 3.14 * (radio * radio);
        }
        public static void main (String args[]){
        circulos circulopordefecto = new circulos();
            System.out.println("diametro del circulo por defecto; " + circulopordefecto.calculardiametro());
            System.out.println("area del circulo por defecto: " + circulopordefecto.calculararea());

            circulos circulonombre = new circulos("circuloito");
            System.out.println("diametro de circuloito: " + circulonombre.calculardiametro());
            System.out.println("area circuloito: " + circulonombre.calculararea());

            circulos circulocolor = new circulos("circuloito" + "azul");
            System.out.println("diametro de circuloito azul" + circulocolor.calculardiametro());
            System.out.println("area de circuloito azul: " + circulocolor.calculararea());

            circulos circulocompleto = new circulos("circuloito", "azul", 5);
            System.out.println("diametro de circuloito azul con radio 5" + circulocompleto.calculardiametro());
            System.out.println("area de circuloito azul con radio 5: " + circulocompleto.calculararea());


            circulos circulorojo = new circulos("circulorojo", "rojo", 3);
            System.out.println("suma de radios de circulocompleto y circulo rojo; " + circulos.sumarcirculocompleto(circulorojo));

        }
    }

