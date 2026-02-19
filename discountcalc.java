public static double calculateDiscount(double price){
    //initiate vars
    double discountoff = 0;
    double finalprice = 0;
    
    // check the amount of money
    if(price < 10){
        finalprice = price; // just assign price as final price due to no discounts
    }else if(price >= 10 && price <= 30){ // check between 10 - 30
        discountoff = price * 0.1;
        finalprice = price - discountoff; // calculate discount
    }else if(price >= 31 && price < 50){// check between 30 - 49
        discountoff = price * 0.2;
        finalprice = price - discountoff; // calculate discount
    }else{ // more than 50
        discountoff = price * 0.3;
        finalprice = price - discountoff;// calculate discount
    }
    
    return finalprice; // return value
    
}
