/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ProgressAnimate extends javax.swing.JProgressBar implements java.lang.Runnable{
    
    int progressVal;
    Thread t;
    ProgressAnimate()
    {
        super();
        System.out.print("Thread Initialized Here");
        //t = new Thread(this);
    }
    public void startAnimation()
    {
        this.run();
    }
    
    @Override
    public void run()
    {
        try
        {
        progressVal = this.getValue();
        for(int i=0;i<progressVal;i++)
        {
            this.setValue(i);
            Thread.sleep(500);
            System.out.print("Current Thread : getValue: "+progressVal+", Value of i : "+1);
        }
        }
        catch(Exception e)
        {
            
        }
    
    }
}
