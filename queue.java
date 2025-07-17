
// queue implementation in Java with array

class array{
int arr[];
int front;
int  rear;
array(int n) {
    arr = new int[n];
    front = 0;
    rear = -1;
}
}
public class queue {
    public static void main(String[] args) {
        array obj = new array(5);
        obj.arr[++obj.rear] = 10;
        obj.arr[++obj.rear] = 20;
        obj.arr[++obj.rear] = 30;
        
        for (int i = obj.front; i <= obj.rear; i++) {
            System.out.print(obj.arr[i] + " ");
        }
}
    
    
}
