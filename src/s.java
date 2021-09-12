class s {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        int temp=0;ListNode a=l1,b;
        b=a;
        while(l2!=null||l1!=null){



            if (l1.val+l2.val>=10) {a.val=l1.val+l2.val+temp-10;temp=1; }
            else { a.val=l1.val+l2.val+temp;temp=0;}




            a=a.next;
            l2=l2.next;
            l1=l1.next;




        }



        return b;
    }

    public static void main(String[] args) {
     ListNode a=   new ListNode(2,new ListNode(4,new ListNode(3)));
      ListNode b=  new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode c=  new s().addTwoNumbers(a,b);
        while (c!=null){
            System.out.println(c.val);
            c=c.next;
        }
    }

}