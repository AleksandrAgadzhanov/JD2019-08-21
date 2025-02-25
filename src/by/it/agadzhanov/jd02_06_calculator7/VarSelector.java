package by.it.agadzhanov.jd02_06_calculator7;

class VarSelector {

    static VarCreator selectCreator(String operand) throws CalculationException {
        operand = operand.trim().replace(" ", "");
        if (operand.matches(Patterns.SCALAR))
            return new ScalarCreator();
        else if (operand.matches(Patterns.VECTOR))
            return new VectorCreator();
        else if (operand.matches(Patterns.MATRIX))
            return new MatrixCreator();
        else return null;
    }
}
