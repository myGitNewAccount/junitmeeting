/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kpi.methods;

/**
 *
 * @author Anton
 */
public class MathFunc {
    private int variable;
    
    public MathFunc(){
        variable = 0;
    }
    
    public MathFunc(int var){
        variable = var;
    }
    
    public int getVariable(){
        return variable;
    }
    
    public void setVariable(int variable){
        this.variable = variable;
    }
    
    public long factorial(){
        long result = 1;
        if(variable > 1){
            for(int i = 1; i <= variable; i++){
                result *= i;
            }
        }
        return result;
    }
    
    public long plus(int var){
        long result = variable + var;
        return result;
    }
}
