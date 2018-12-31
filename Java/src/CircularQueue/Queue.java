package CircularQueue;

public class Queue {

    private int maxSize;
    private int queue[];
    private int front;
    private int rear;
    private int nItems;


    public Queue(int size){

        this.queue = new int[size];
        this.maxSize = size;
        this.rear = maxSize-1;
        this.front = 0;
        this.nItems = 0;
    }

    public boolean IsEmpty(){

        if(this.nItems == 0){

            return true;
        }
        return false;
    }

    public boolean IsFull(){

        if(this.nItems == this.maxSize){
            return true;
        }

        return false;
    }

//    public int size(){
//
//    }

    public boolean enqueue(int value){

        if(!IsFull()){
            this.rear = (rear + 1)% maxSize;
            queue[this.rear] = value;
            this.nItems ++;
            return true;
        }
        else{
            return false;
        }

    }

    public int dequeue(){

        if(IsEmpty()){
            return 0;
        }
        else{
            int dequeue = queue[this.front];
            this.front = (this.front+1)%maxSize;

            return dequeue;
        }

    }



}
