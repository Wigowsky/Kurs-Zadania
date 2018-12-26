class Calc {

    double Add (double a, double b) {
        return(a+b);
    }

    double Add (double a, double b, double c) {

        return Add(a,b)+ c;

    }

    double subtract (double a, double b) {
        return(a-b);
    }

    double subtract (double a, double b, double c) {
        return subtract(a, b)-c;
    }

    double multiply (double a, double b) {
        return(a*b);
    }

    double divide (double a, double b) {
        return(a/b);
    }

}
