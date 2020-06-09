public class ListClient1 {
    public static void main(String[] args) {
 /*       ArrayList list1 = new ArrayList();
        list1.add(18);
        list1.add(27);
        list1.add(93);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);

        LinkedIntList2 list2 = new LinkedIntList2();
        list2.add(18);
        list2.add(27);
        list2.add(93);
        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2.size());
 */       
        LinkedIntList2 list3 = new LinkedIntList2();
        list3.add(18);
        list3.add(27);
        list3.add(93);
        System.out.println(list3);
        System.out.println(list3.isSorted());	//true
        
        LinkedIntList2 list4 = new LinkedIntList2();
        list4.add(93);
        list4.add(18);
        list4.add(27);
        System.out.println(list4); //false
        list4.isSorted();

        LinkedIntList2 list5 = new LinkedIntList2();
        list5.add(18);
        list5.add(19);
        list5.add(5);
        System.out.println(list5); 
        System.out.println(list5.isSorted());//false
    }
}
