

 class Reverse
{
 

    static void  reverse(int A[], int start, int end )
    {
        int temp;

        for(start=0 ;start<end;start++)
        {
            temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            end--;
        }
       
    }
    
    static void printA(int []A)
    {
        for(int x : A)
        {
            System.out.println(x);
        }
    }

    public static void main(String []  args )
    {
        int b[] ={2,3,4,5,6};

        System.out.println("reversed");
        reverse(b,0,b.length-1);
        printA(b);
    }



}