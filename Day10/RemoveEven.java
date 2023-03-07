import java.util.ArrayList;

class RemoveEven{
RemoveEven(){
System.out.println("\t\t\t Removing even elements in an ArrayList");
}
public static void main(String args[]){
ArrayList<Integer> list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);
list.add(7);
list.add(8);
System.out.println("Present ArrayList : "+list);
for(int i=list.size()-1;i>=0;i--){
if(list.get(i)%2==0)
list.remove(i);
}
System.out.println("After Removal Of Even Elements In Array : "+list);
}
}

