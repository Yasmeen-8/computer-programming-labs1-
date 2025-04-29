public static void printDescendingOrder() {
    int num1;
    int num2;
    int num3;
    
    int highest = 0;
    int high = 0;
    int lowest = 0;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter an integer as value1:");
    num1 = scan.nextInt();
    System.out.println("Enter an integer as value2:");
    num2 = scan.nextInt();
    System.out.println("Enter an integer as value3:");
    num3 = scan.nextInt();
    
    
    //write your code here
    if(num1 >= num2 && num1 >= num3){// num1 highest
        highest = num1;
        if(num2 >= num3){ // num2 higher num 3 lower
            high = num2;
            lowest = num3;
        }else{ //opp
            high = num3;
            lowest = num2;
        }
    }else if(num2 >= num1 && num2 >= num3){//num2 highest
        highest = num2;
        if(num1 >= num3){ // num2 higher num 3 lower
            high = num1;
            lowest = num3;
        }else{ //opp
            high = num3;
            lowest = num1;
        }
    }else if(num3 >= num1 && num3 >= num2){//num3 highest
        highest = num3;
        if(num1 >= num2){ // num2 higher num 3 lower
            high = num1;
            lowest = num2;
        }else{ //opp
            high = num2;
            lowest = num1;
        }
    }else{
        System.out.println("its out of the if loop");
    }
    
    System.out.println("Values in descending order are: " + highest + " " + high + " " + lowest + ".");
   
}
