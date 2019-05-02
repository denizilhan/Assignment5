public class Exercise2 {

    public String ex2(int inputParameter){

        String returnParameter = null;
        if( inputParameter <0)
            return "incorrect number";

        for(int i=1;i<inputParameter;i++){
            returnParameter+= "*";
        }
        
        return returnParameter;
    }

}
