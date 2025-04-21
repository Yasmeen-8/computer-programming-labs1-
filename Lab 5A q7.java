public static void sumOfEven(){ // start 
    Scanner scan = new Scanner(System.in); // intiate scanner
    int input = 0; // intiate the input var
    int sum = 0; // intiiate the sum 
    
    do{ //start do state ment
        System.out.println("Enter a number (0 to quit):");  //prompt user
        input = scan.nextInt();  // get input
        if((input % 2 == 0)){ // check if even
        sum += input;  // add to sum
        }
    }while(input != 0); // check if input equals 0
    
    System.out.println("The sum of even numbers is " + sum); // print sum
}
