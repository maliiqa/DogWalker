public class Main
{
    public static void main(String[] args)
    {
    DogWalkCompany c = new DogWalkCompany();
    System.out.println(c);
    int hour = c.addDogs();
    System.out.println(c);
    DogWalker w = new DogWalker(4, c);
    System.out.println(w.walkDogs(hour) + " dogs walked.");
    System.out.println(c.numAvailableDogs(hour) + " dogs remaining.");
    hour = c.addDogs();
         w = new DogWalker(3, c);
    }
 public int dogWalkShift(int startHour, int endHour)
    {
        int pay = 0;
        while(startHour <= endHour)
            int dogs = walkdogs(startHour);
        pay += dogs * 5;
    }
}
