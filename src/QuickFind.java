public class QuickFind {
    //creating the array
    private int[] id;

    public QuickFind(int j){
        id=new int[j];
        //initialising the objects
        for(int i=0;i<j;i++){
            id[i]=i;
        }
    }

    public void connected(int p,int q){
        //checking objects are same
        if(id[p]==id[q]){
            System.out.println(p+" and "+q+" is connected");
        }
        else{
            System.out.println(p+" and "+q+" are not connected");
        }
    }

    public void union(int p,int q){
        //check the first argument's corresponding id
        int id_p=id[p];
        //check the second argument's corresponding id
        int id_q=id[q];
        for (int i=0;i<id.length;i++){
            //if the entries are the same to the first argumrnt
            if(id[i]==id_p){
                //replacing the source id with destination
                id[i]=id_q;
            }
        }
    }

    public static void main (String[] args){
        QuickFind quickFind=new QuickFind(15);
        quickFind.union(5,6);
        quickFind.union(6,7);
        quickFind.connected(5,7);
        quickFind.union(3,4);
        quickFind.connected(4,5);

    }
}
