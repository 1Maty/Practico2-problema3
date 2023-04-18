import java.lang.reflect.Array;

public class Problema3 {
    public static boolean equilibrioSimbolos(String expresion){
        String[] expreseionLista = expresion.split("");
        Stack<String> cositasEnStack = new Stack<>();
        for(String cositas:expreseionLista){
            if(cositas.equals("(") || cositas.equals("{") || cositas.equals("[")){
                cositasEnStack.push(cositas);
            }
            else if(cositas.equals(")")){
                if (cositasEnStack.isEmpty()) {
                    return false;
                }
                if(cositasEnStack.top().equals("(")){
                    cositasEnStack.pop();
                }}
                else if(cositas.equals("}")){
                if (cositasEnStack.isEmpty()) {
                    return false;
                }
                    if(cositasEnStack.top().equals("{")){
                        cositasEnStack.pop();
                    }}
                    else if(cositas.equals("]")){
                        if (cositasEnStack.isEmpty()) {
                            return false;
                        }
                        if(cositasEnStack.top().equals("[")){
                            cositasEnStack.pop();
                        }}
        }



        return cositasEnStack.isEmpty();
    }
    public static void main(String [] args){
        System.out.println(equilibrioSimbolos("([})"));
    }
}
