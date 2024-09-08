package oblig2;

public class VoteOption {
    private String caption;
    private int presentationOrder;

    public VoteOption(){
        
    }

    public void setCaption(String caption){

        this.caption = caption;
    }   
    
    public String getCaption(){
        
        return caption;
    }    

    public void setPresentationOrder(int order){

        presentationOrder = order;
    }

    public int getPresentationOrder(){
        return presentationOrder;
    }

}
