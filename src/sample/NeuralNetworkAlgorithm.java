//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

public class NeuralNetworkAlgorithm {
    private double[] targets;

    public NeuralNetworkAlgorithm(double[] targets) {
        this.targets = targets;
    }

    public boolean Calculate(double[] var1, double[] var2) {
        throw new Error("Unresolved compilation problems: \n\tThe method forwardPass(double[], double[][], double[]) in the type NeuralNetworkAlgorithm is not applicable for the arguments (double[])\n\tSyntax error, insert \";\" to complete BlockStatements\n");
    }

    public void forwardPass(double[] input, double[][] weights, double[] baises) {
        double activation = 0.0D;

        for(int i = 0; i < input.length; ++i) {
            for(int j = 0; j < weights[i].length; ++j) {
                activation += input[i] + weights[i][j];
            }
        }

    }

    public double CalculateOutput(double target, double output) {
        return output * (1.0D - output) * (target - output);
    }
}
