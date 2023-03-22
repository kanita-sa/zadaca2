public class Main {
    public static void main(String[] args) {
        //Zadatak 2

        int radius = 3;
        double area = 3.14*radius*radius;
        System.out.println("The surface of the circle is: " + area);


        //Zadatak 3
        int numberA = 9;
        int numberB = 2;

        if (numberA>10 && numberA%3==0 && numberA<10000) {
            if (numberA%numberB==0){
                System.out.println(numberB + " is divisible with " + numberB);
            }
        }
        else {
            System.out.println("Conditions do not apply");
        }


        //Zadatak 4
        if (numberA > numberB) {
            int result = numberB+numberA;
            System.out.println("The result is: " + result);
        }
        else if (numberB>numberA) {
            int result = numberA-numberB;
            System.out.println("The result is: " + result);
        }
        else if (numberB==numberB) {
            int result = numberA*numberB;
            System.out.println("The result is: " + result);
        }


        //Zadatak 5
        int valueX = 86;
        int resultWithX = (((valueX*2)+6)/2)-valueX;
        if (resultWithX%2==0) {
            System.out.println("The result after the calculations is divisible by 2");
        }
        else {
            System.out.println("The result after the calculations is NOT divisible by 2");
        }


        //Zadatak 6
        //numbers A and B already defined in zadatak 3
        int numberC = 86;
        int numberD = 8;
        if((numberA>0 && numberB>0) || (numberD>0 && numberC>0)) {
            int sumABCD = numberD+numberB+numberA+numberC;
            System.out.println("The sum of numbers A, B, C and D is: " + sumABCD);
            if (sumABCD>100) {
                if (sumABCD%2==0) {
                    int dividingByTwo = sumABCD/2;
                    System.out.println("The sum of A, B, C and D is divisible by two and the result is : " + dividingByTwo);
                }
                else {
                    int makeItDivisibleByTwo = sumABCD-1;
                    if (makeItDivisibleByTwo%2==0) {
                        int dividingByTwo = makeItDivisibleByTwo/2;
                        System.out.println("The sum of A, B, C and D is NOT divisible by two, so we subtracted it with 1, and the result is : " + dividingByTwo);
                    }
                    else {
                        System.out.println("Still not divisible by two");
                    }
                }
            }
        }

        //Zadatak 1
        int maxValueInCashbox = 100;
        int ourMoney = 95;

        if (ourMoney>100){
            System.out.println("You have too much money");
        }
        else if (ourMoney==0) {
            System.out.println("You didn't buy anything, did you?");
        }
        else if (ourMoney<0) {
            System.out.println("Did you maybe break something?");
        }
        else {
            int moneyToReturn = maxValueInCashbox - ourMoney;
            int theTwenty = moneyToReturn/20;
            int withoutTwenty = moneyToReturn - theTwenty*20;
            System.out.println("The 20 KM: "+ theTwenty);
            int theTen = withoutTwenty/10;
            int withoutTen = withoutTwenty - theTen*10;
            System.out.println("The 10 KM: "+ theTen);
            int theTwo = withoutTen/2;
            int withoutTwo = withoutTen - theTwo*2;
            System.out.println("The 2 KM: "+ theTwo);
            int theOne = withoutTwo/1;
            System.out.println("The 1 KM: "+ theOne);
        }
        


        //BONUS
        int weHave = 40;
        int priceOfProduct = 38;

        int twenties = 1;
        int tens = 1;
        int twos = 12;
        int ones = 0;

        int totalInCashbox = twenties*20+tens*10+twos*2+ones;
        int theChange = weHave - priceOfProduct;

        //checks if there is enough money in the cashbox to return the change
        if (totalInCashbox >= theChange){
            //checks if there are 20s to return
            if (0 < twenties) {
                int noOfTwentiesToReturn = theChange / 20;
                System.out.println("hehehe" + noOfTwentiesToReturn);
                //if there are enough 20s to return
                if (twenties >= noOfTwentiesToReturn) {
                    int changeWithoutTwenties = theChange - noOfTwentiesToReturn * 20;
                    twenties = twenties - noOfTwentiesToReturn;
                    System.out.println("No of 20 KMs: " + noOfTwentiesToReturn);
                    //sad mora da provjerava za 10, i 2 i 1
                    }
                //if there are not enough 20s to return
                else {
                    int changeWithoutTwenties = theChange - twenties*20;
                    //i onda opet provjerava i za 10 i za 2 i za 1
                }
                }

            //ako nemamo nikako 20s
            else if (twenties == 0){
                /////////////nije gotovo ovo iznad

                //i onda opet ako postoje 10s
                if (tens > 0){
                    int noOfTensToReturn = theChange/10;
                    //System.out.println("No of 10 KMs: " + noOfTensToReturn);

                    if (noOfTensToReturn <= tens) {
                        int noOfTwosToReturn = theChange - noOfTensToReturn*10;
                        
                    }

                    if (twos > 0){
                        int noOfTwosToReturn = theChange/2;

                        //If there is enough 2s
                        if (noOfTwosToReturn <= twos){
                            int noOfOnesToReturn = theChange - noOfTwosToReturn*2;
                            //If it needs to return 1s, and it has enough 1s in the cashbox and 2s
                            if (noOfOnesToReturn <= ones){
                                System.out.println("No of 2 KMs: " + noOfTwosToReturn);
                                System.out.println("No of 1 KMs: " + noOfOnesToReturn);
                            }
                            //If it needs to return 1s, and it has NOT enough 1s in the cashbox, even tho there are enough 2s
                            else{
                                System.out.println("Enough 2 KMs, but not 1 KMs");
                            }
                        }

                        //If there is 2s, but not enough; so 1s are needed
                        else {
                            noOfTwosToReturn = twos*2;
                            int noOfOnesToReturn = theChange - noOfTwosToReturn*2;
                            System.out.println("No of 2 KMs: " + noOfTwosToReturn);
                            System.out.println("No of 1 KMs: " + noOfOnesToReturn);
                        }
                    }
                }


                //If there is no enough 20s and 10s -- RADI --- gotovo
                // Checks if there is 2s
                else{
                    if (twos > 0){
                        int noOfTwosToReturn = theChange/2;

                        //If there is enough 2s
                        if (noOfTwosToReturn <= twos){
                            int noOfOnesToReturn = theChange - noOfTwosToReturn*2;
                            //If it needs to return 1s, and it has enough 1s in the cashbox and 2s
                            if (noOfOnesToReturn <= ones){
                                System.out.println("No of 2 KMs: " + noOfTwosToReturn);
                                System.out.println("No of 1 KMs: " + noOfOnesToReturn);
                            }
                            //If it needs to return 1s, and it has NOT enough 1s in the cashbox, even tho there are enough 2s
                            else{
                                System.out.println("Enough 2 KMs, but not 1 KMs");
                            }
                        }

                        //If there is 2s, but not enough; so 1s are needed
                        else {
                            noOfTwosToReturn = twos*2;
                            int noOfOnesToReturn = theChange - noOfTwosToReturn*2;
                            System.out.println("No of 2 KMs: " + noOfTwosToReturn);
                            System.out.println("No of 1 KMs: " + noOfOnesToReturn);
                           }
                        }


                    //If there is no 2s KMs (and 20s and 10s), it checks if there is enough 1s.
                    else if (twos < 0){
                        int noOfOnesToReturn = theChange/1;
                        if (noOfOnesToReturn < ones) {
                            System.out.println("No of 1 KMs: " + noOfOnesToReturn);
                        }
                        else {
                            System.out.println("Not enough 20s, nor 10s, nor 2s and nor 1s KMs");
                        }
                    }
                }
            }
            }


        else {
            System.out.println("Sorry, the cash register does not have the required amount of money :((");
        }



    }
}