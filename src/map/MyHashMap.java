package map;

public class MyHashMap {
    Node[] buckets;
    int size;
    MyHashMap(int size){
        this.size=size;
        buckets=new Node[size];
    }

    public int getIndex(String key){
        return Math.abs(key.hashCode())%5;
    }

    public void put(String key,int value){
        int index=getIndex(key);
        Node newNode = new Node(key, value);
        if (buckets[index] == null) {
            buckets[index] = newNode;
        }else{
            Node temp=buckets[index];
            while(temp!=null){
                if(temp.key.equals(key)){
                    temp.value=value;
                    return;
                }
                if (temp.next == null) {
                    break;
                }
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public int get(String key){

        int index=getIndex(key);
        Node temp=buckets[index];
        while(temp!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp=temp.next;
        }
        return -1;
    }

    public void display(){
        for(int i=0;i< buckets.length;i++){
            System.out.print("Bucket "+i+" : ");
            Node temp=buckets[i];
            while(temp!=null){
                System.out.println("{"+temp.key+"="+temp.value+"}->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }

    public void removeByKey(String key) {
        int index = getIndex(key);
        Node temp = buckets[index];
        Node prev=null;

            while (temp != null) {
                if (temp.key.equals(key)) {
                    System.out.println("Removed Value : "+temp.value);
                    if(prev==null){
                        buckets[index] = temp.next;
                    }else {
                        prev.next = temp.next;
                    }
                    return;
                }
                prev=temp;
                temp = temp.next;
            }
        System.out.println("Key not found");
        }

}
