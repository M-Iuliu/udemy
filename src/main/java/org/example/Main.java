package org.example;

public class Main {
    int n = 15;

    public static void main(String[] args) {

        {
            int n = 20;
            System.out.println(n);
        }

        int n = 10;
      System.out.println(n);

//        Ex: 1
//        Person myObj = new Person("Emi", "Demon");
//        myObj.findHumanOrAnomaly(myObj.getName(), myObj.getSpecies());

//        Ex: 2
//        HashMap<String, Integer> myScoreMap = new HashMap<>();
//        myScoreMap.put("Tim", 500);
//        myScoreMap.put("Charly", 1000);
//        myScoreMap.put("Lisa", 100);
//        myScoreMap.put("Ana", 25);
//        myScoreMap.put("Raul", 1500);
//
//        Score myScore = new Score(myScoreMap);
//        HashMap<String, Integer> orderedByHighScore = myScore.orderByHighScore(myScore.getScoreMap());
//        System.out.println();
//        System.out.println("Ordered by score: " + orderedByHighScore);
//        System.out.println();
//        HashMap <String, Integer> calculatedHighScore = myScore.calculateHighScore(orderedByHighScore);
//        System.out.println("High score tiers by player: " + calculatedHighScore);
//        System.out.println();
//        System.out.println(myScore.findPosition("Tim", calculatedHighScore));

//        Ex: 3
//        PositiveNegativeZero.checkNumber(5);
//        PositiveNegativeZero.checkNumber(-5);
//        PositiveNegativeZero.checkNumber(0);

//        Ex: 4
//        SpeedConverter.printConversion(0.0);

//        Ex:5
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

//        Ex: 6
//        System.out.println(BarkingDog.shouldWakeUp(true, 1));

//        Ex: 7
//        System.out.println(LeapYear.isLeapYear(2000));

//        Ex: 8
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.175,-3.1757));

//        Ex: 9
//        boolean result = SumOf3Numbers.hasEqualSum(1, -1, 8);
//        System.out.println(result);
//        Ex: 10
//        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));

//        Ex: 11
//        System.out.println(ConvertInToCm.convertToCm(5, 9));

//        EX 12:
//        System.out.println(ConvertTime.convertTime(5600));
//        System.out.println(ConvertTime.convertTime(93, 20));

//        Ex: 13
//        printYearsAndDays(0);
//        IntEqualityPrinter.printEqual(1,-1,1);
//        System.out.println(PlayingCat.isCatPlaying(false, 35));
//        System.out.println(PrimeNumberCounter.primeNumberCount(1000));
//        System.out.println(NumberPalindrome.isPalindrome(-102));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
//        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));

//        EX: 14
//        System.out.println(SharedDigit.hasSharedDigit(21, 12));
//        FactorPrinter.printFactors(6);
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
//        System.out.println(PerfectNumber.isPerfectNumber(0));
//            numberToWords(0);

//        printSumOfFiveInputNumbers();
//        storeMinMax();
//        inputThenPrintSumAndAverage();
//        System.out.println (getBucketCount(-3.4, 1.5));
//        System.out.println(PerfectNumber.isPerfectNumber(0));

    }

    public void print(){
        {
            int n = 20;
            this.n = 5;
            System.out.println(n);
        }

        int n = 10;
        System.out.println(n);
    }
}