package lab4_lt;

public class cam extends lab4_lt.hoaqua{
     private int camsanh;
     private int camcaophong;
     public cam(){
         super();
     }
     public cam(int camsanh,int camcaophong){
         super();
        this.camsanh=camsanh;
        this.camcaophong=camcaophong;
     }
     public int getCamcaophong() {
        return camcaophong;
    }
     public int setCamcaophong(int camcaophong) {
       this.camcaophong=camcaophong;
         return 0;
    }
     public int getcamsanh() {
        return camsanh;
    }
     public int setCamsanh(int camsanh) {
       this.camsanh=camsanh;
         return 0;
    }
     @Override
      public String toString() {
        return super.toString() + "cam sành " + this.camsanh+"cam cao phong"+this.camcaophong;
        
    }
    
}
