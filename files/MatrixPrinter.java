public class MatrixPrinter {

    // native method declaration
    public native void printMatrix();

    // load the native C library
    static {
        System.loadLibrary("matrixlib");
    }

    public static void main(String[] args) {

        MatrixPrinter m = new MatrixPrinter();

        // call native C method
        m.printMatrix();

    }
}
