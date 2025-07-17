// stack implementation in Java with array

class Stack{
    int arr [];
    int top ;
  Stack(int n)
  {
    arr=new int [n];
    top=-1;
  }
}

public class one {

public static void main(String[] args) {
    Stack s=new Stack(3);
    s.arr[++s.top]=11;
      s.arr[++s.top]=12;
        s.arr[++s.top]=13;
        for(int i=s.top;i>=0;i--)
        {
            System.out.print(s.arr[i]);
        }
  }
    
}
