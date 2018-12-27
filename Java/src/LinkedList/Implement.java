package LinkedList;
public class Implement {

    public Node head;

    public void insertdata(int value){

        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public void print(){
        Node current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void remove(int value){

        Node current = head;
        Node pre = head;

        int index  =  this.findindex(value);
        if(index > 0){

            while(current != null){
                if(current.data == value){
                    pre.next = current.next;
                    System.out.println("value deleted sucesfully");
                    break;
                }

                pre = current;
                current = current.next;


            }

            System.out.println("value deleted sucesfully");

        }

        if(index == 0){
            head = head.next;

        }
        else{
            System.out.println("value not in the list");
        }


    }

    public boolean find(long value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public int findindex(int value){
        Node current  = head;

        if(find(value)){
            int count = 0;
            while(true){
                if(current.data == value){
                    break;
                }
                current = current.next;
                count++;
            }

            return count;
        }
      else{
          return -1;
        }

    }

}
