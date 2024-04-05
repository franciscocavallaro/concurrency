public class Matrix {
    private final double[][] values;

    public Matrix(double[][] values) {
        this.values = values;
    }

    public double sum() {
        var result = 0.0;
        for (double[] value : values) {
            result += addRow(value);
        }
        return result;
    }

    public double sumParallel() {
        throw new RuntimeException("Implement me!");
    }

    public Matrix addSerial(Matrix other) {
        double[][] result = new double[values.length][];
        for (int i = 0; i < values.length; i++) {
            int cols = values[i].length;
            var row = new double[cols];
            for (int j = 0; j < cols; j++) {
                row[j] = values[i][j] + other.values[i][j];
            }
            result[i] = row;
        }
        return new Matrix(result);
    }
    public Matrix addParallel(Matrix other) {
        throw new RuntimeException("Implement me!");
    }

    private double addRow(double[] value) {
        var result = 0.0;
        for (double v : value) {
            result += v;
        }
        return result;
    }


}