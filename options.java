public static void menu () {
    //write the code here to answer the question
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose an option to display the corresponding piece of information:\n1.Capital of Bahrain\n2.Population of Bahrain\n3.Climate of Bahrain\n4.GDP of Bahrain\n5.Size of Bahrain (square km)");
    
    int option = scan.nextInt();
    
    switch(option){
        case 1: System.out.println("You chose 1. The capital of Bahrain is Manama."); break;
        case 2: System.out.println("You chose 2. The population of Bahrain: 1,039,297."); break;
        case 3: System.out.println("You chose 3. Bahrain has two seasons: summer and winter."); break;
        case 4: System.out.println("You chose 4. Bahrain's GDP was 44.38 billion USD in 2022."); break;
        case 5: System.out.println("You chose 5. Bahrain is 765.3 square km."); break;
        default: System.out.println("You entered a wrong choice."); 
    }
}
