public class ex11 {
  public static void main(String[] args) {
    int fiveYearSeconds = 5 * 31536000;
    double currentPopulation = 312032486.0;

    double birthNextFiveYears = fiveYearSeconds / 7.0;
    double deathNextFiveYears = fiveYearSeconds / 13.0;
    double immigrantNextFileYears = fiveYearSeconds / 45;

    double population = currentPopulation - deathNextFiveYears + birthNextFiveYears + immigrantNextFileYears;
    System.out.println("The population is: " + Math.round(population));
  }

}
