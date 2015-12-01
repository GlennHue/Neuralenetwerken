//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

import java.util.Random;

public class NeuralNetworkModel {
    private int _numberOfInputCells;
    private int _numberOfHiddenCells;
    private int _numberOfOutputCells;
    private double[] inputCells = new double[]{1.0D, -2.0D, 3.0D};
    //private double[][] ihWeights = new double[][]{{0.001D, 0.002D, 0.003D, 0.004D}, {0.005D, 0.006D, 0.007D, 0.008D}, {0.009D, 0.01D, 0.011D, 0.012D}};
    private double[][] ihWeights = new double[4][3];
    private double[] hBiases = new double[]{0.013D, 0.014D, 0.015D, 0.016D};
    //private double[] hiddenCells = new double[]{0.031D, 0.034D, 0.037D, 0.04D};
    private double[] hiddenCells = new double[]{0,0,0,0};
    //private double[][] hoWeights = new double[][]{{0.017D, 0.018D}, {0.019D, 0.02D}, {0.021D, 0.022D}, {0.023D, 0.024D}};
    private double[][] hoWeights = new double[2][4];
    private double[] oBiases = new double[]{0.025D, 0.026D};
    private double[] outputCells = new double[]{0.507D, 0.5073D};
    private double[] targets;

    public NeuralNetworkModel() {
        Random r = new Random();
        this.targets = new double[]{r.nextDouble(), r.nextDouble()};
    }

    public double[] calculateHiddenCells(){
        double[] res = new double[4];
        for(int i = 0; i < ihWeights.length; i++) {
            double temp = 0;
            for(int j = 0; j < ihWeights[i].length; j++) {
                temp += inputCells[j] * ihWeights[i][j] + hBiases[i];
            }
            res[i] = temp;
        }
        double[] tempHiddens = new double[4];
        for(int i = 0; i < res.length; i++) {
            tempHiddens[i] = hyperTanFunction(res[i]);
        }

        return tempHiddens;


    }

    public double[] calculateOutputFunction(double[] tempHidden){
        double[] tempOutput = new double[2];
        for(int i = 0; i < outputCells.length;i++){
            double temp = 0;
            for(int j = 0; j < hoWeights[i].length;j++){
                temp += tempHidden[j] * hoWeights[j][i] + oBiases[i];
            }
            tempOutput[i] = temp;
        }

        for(int i = 0; i < tempOutput.length; i++) {
            tempOutput[i] = hyperTanFunction(tempOutput[i]);
        }

        return  tempOutput;
    }

    public void initializeWeightsIH(){
        for(int i = 0; i < ihWeights.length; i++){
            for(int j = 0; j < ihWeights[i].length; j++) {
                Random r = new Random();
                ihWeights[i][j] = r.nextDouble();
            }
        }
    }

    public void initializeWeightsHO() {
        for(int i = 0; i < hoWeights.length; i++){
            for(int j = 0; j < hoWeights[i].length; j++) {
                Random r = new Random();
                hoWeights[i][j] = r.nextDouble();
            }
        }
    }

    public int get_numberOfInputCells() {
        return this._numberOfInputCells;
    }

    public int get_numberOfHiddenCells() {
        return this._numberOfHiddenCells;
    }

    public int get_numberOfOutputCells() {
        return this._numberOfOutputCells;
    }

    public double[] getInputCells() {
        return this.inputCells;
    }

    public double[][] getIhWeights() {
        return this.ihWeights;
    }

    public double[] gethBiases() {
        return this.hBiases;
    }

    public double[] getHiddenCells() {
        return this.hiddenCells;
    }

    public double[][] getHoWeights() {
        return this.hoWeights;
    }

    public double[] getoBiases() {
        return this.oBiases;
    }

    public double[] getOutputCells() {
        return this.outputCells;
    }

    public double[] getTargets() {
        return this.targets;
    }

    public static double hyperTanFunction(double x)
    {
        if (x < -45.0)
            return -1.0;
        if (x > 45.0)
            return 1.0;
        return Math.tanh(x);
    }

}
