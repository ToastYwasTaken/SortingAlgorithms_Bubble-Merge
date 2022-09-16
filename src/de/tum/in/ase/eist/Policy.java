package de.tum.in.ase.eist;

public class Policy {

    private Context context;
    public Policy(Context context){
        this.context = context;
    }

    public void configure(){
        System.out.println(context.getDates().size());
        if(context.getDates().size() > 10){
            context.setSortAlgorithm(new MergeSort());
        }else context.setSortAlgorithm(new BubbleSort());
    }
}
