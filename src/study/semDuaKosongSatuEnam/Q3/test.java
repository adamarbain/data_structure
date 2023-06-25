package study.semDuaKosongSatuEnam.Q3;


public class test {

    Queue<Integer> alpha = new Queue<>();
    Queue<Integer> bravo = new Queue<>();


    public static void main(String[] args) {
        test t = new test () ;
        t.ChangeOrder(4);
    }
    
   
        
    public void ChangeOrder(int k){
    int num = 0;
    for (int i = 1 ; i < 10 ; i++){
        num = i * 10 ;
        alpha.enqueue(num);
        if (i>=k)
            bravo.enqueue(num);
        }
        System.out.println(alpha.toString());        
        
        for (int i = 1 ; i < 10 ; i++){
            if (i<k)
                bravo.enqueue(i*10);
        }
         
        System.out.println("After ChangeOrder("+k+") method:");
        System.out.println(bravo.toString());
    }
    
}
