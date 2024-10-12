import java.util.Stack;
public class Postfix1 {
    public static void Postfix(String str){
        Stack stack=new Stack();
        String result=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&& str.charAt(i)<='z'||str.charAt(i)>='A'&& str.charAt(i)<='Z'||str.charAt(i)>=0&& str.charAt(i)<=9){
                result=result+str.charAt(i);
            }
            else if (str.charAt(i)>='+'||str.charAt(i)>='-'||str.charAt(i)>='/'||str.charAt(i)=='*'){
                stack.push(str.charAt(i));
            } 
            if (i==4){
                result=result+stack.pop();
                result=result+stack.pop();
            }
            if(i==6){
                result=result+stack.pop();
            }
        }
        System.out.println("The actual String is "+str);
        System.out.println("The result after postfix is "+result);
    }
    public static void main(String[] args) {
        String str="A+B*C+D";
        Postfix(str);
}
}

