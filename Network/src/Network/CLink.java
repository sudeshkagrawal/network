/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

/**
 *
 * @author Sudesh Kumar Agrawal
 * @
 */
public class CLink
{
    private int tail;
    private int head;
    public double cost;	//Generalized travel cost or just travel time
    public double length;//length of the link
    public int capacity;	//capacity of the link
    public double FFT;	//free flow travel time
    public double speed_limit;	//speed limit on the link
    public double toll;	//toll on the link
    public short link_type;	//link type
    //if BPR function is used for link performance function
    //Link travel time = free flow time * ( 1 + B * (flow/capacity)^Power )
    public double B;
    public double Power;
    //if quadratic (p*x^2+q*x+r), linear(q*x+r), or constant(r) functions are used for link perfomance function
    public double p;
    public double q;
    public double r;
    public double flow;	//current flow on that link
    private double tt;	//current travel time on the link — based on the link performance function (BPR, quadratic, linear, etc.)
}
