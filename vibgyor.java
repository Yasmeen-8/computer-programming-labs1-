public static void findColorInRainbow()
{
    
    
    
    Scanner input = new Scanner(System.in); // intiates scanner
    System.out.println("VIBGYOR Spectrum" + "\n" + "Enter your color choice:"); // prompts user
    char color = input.next().charAt(0); // gets char
    color = Character.toLowerCase(color); 
    
    switch(color) // checks the letter 
    {
        case 'v': System.out.println("Violet"); break;
        case 'i': System.out.println("Indigo"); break;
        case 'b': System.out.println("Blue"); break;
        case 'g': System.out.println("Green"); break;
        case 'y': System.out.println("Yellow"); break;
        case 'o': System.out.println("Orange"); break;
        case 'r': System.out.println("Red"); break;
        default: System.out.println("Invalid choice");
    }
}
