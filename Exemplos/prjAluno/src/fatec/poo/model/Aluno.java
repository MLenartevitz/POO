
package fatec.poo.model;

/**
 *
 * @author 0030482211028
 */
public class Aluno {
    private int ra;
    private double ntPrv1;
    private double ntPrv2;
    private double ntTrab1;
    private double ntTrab2;

            
    public void setRa(int r){
    ra = r;
    }
    public double getRa(){
        return(ra);
    }
    public void setNtPrv1(double np1){
    ntPrv1 = np1;
    }
    public double getNtPrv1(){
        return(ntPrv1);
    }
    public void setNtPrv2(double np2){
    ntPrv2 = np2;
    }
    public double getNtPrv2(){
        return(ntPrv2);
    }
    public void setTrab1(double tb1){
    ntTrab1 = tb1;
    }
    public double getTrab1(){
        return(ntTrab1);
    }
    public void setTrab2(double tb2){
    ntTrab2 = tb2;
    }
    public double getTrab2(){
        return(ntTrab2);
    }
    public double calcMediaProva(){
    return(0.75 *(ntPrv1 + 2 * ntPrv2)/3);
    }
    public double calcMediaTrabalho(){
    return(0.25 *(ntTrab1 + ntTrab2)/2);
    }            
    public double calcMediaFinal(){
    return this.calcMediaTrabalho() + this.calcMediaProva();
    }          
}