public class TOH {
    public static void towerOfHanoi(int n,char source,char target,char auxillary){
        if(n==1){
            System.out.println("Move disk 1 from"+source+"to"+target);
            return;
        }
        if(n==1){
            System.out.println("Move disk from " + source + " to " + target);
            return;
        }
        towerOfHanoi(n - 1, source, auxillary, target);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + target);
        towerOfHanoi(n - 1, auxillary, target,source);

        }
            
    }

