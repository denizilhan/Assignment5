public class Exercise2 {

    public String ex2(int inputParameter){

        String returnParameter = "";
        if( inputParameter <0)
            return "incorrect number";

        for(int i=0;i<inputParameter;i++){
            returnParameter+= "*";
        }
        return returnParameter;
    }

}
