package dia1VectoresyExcepciones.entities;

import java.util.Arrays;

public class Vector {
    private int[] vector;
    private int sizeDataVector;
    private int index;

    //constructor
    //hay que incializar index a 0 y crear un nuevo arreglo a la clase vector porque aqui se inicializan los objetos
    public Vector(int sizeDataVector) {
        this.vector = new int[sizeDataVector];
        this.sizeDataVector = sizeDataVector;
        this.index = 0;
    }


    //getters and setters
    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getSizeDataVector() {
        return sizeDataVector;
    }

    public void setSizeDataVector(int sizeDataVector) {
        this.sizeDataVector = sizeDataVector;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    //metodos propios del vector, utilizando excepcion ArrayIndexOutOfBoundsException

    // Metodo para inicializar el vector
    public void initializeVector() {
        if (this.vector == null) {  // Si el vector no está inicializado
            this.vector = new int[sizeDataVector];  // Inicializa el vector
        }
    }
    //para almacenar datos
    public void storeData( int data){
        //this.index = 0;  es inicializar el index en el constructor porque el indice se reinicia a 0
        if(index < sizeDataVector){
            vector[index]= data;
            index ++;
        }else{
            System.out.println("Vector is full, you cannot add more data");
        }
    }

    //para lanzar excepcion
    public int accessData(int index) {
        if (index < 0 || index >= sizeDataVector) {
            throw new ArrayIndexOutOfBoundsException("Error: you tried to access an invalid position in the vector.");
        }
        return vector[index];
    }

    //tostring
    @Override
    public String toString() {
        return "Vector{" +
                "vector=" + Arrays.toString(vector) +
                ", sizeDataVector=" + sizeDataVector +
                ", index=" + index +
                '}';
    }
}
