public class DogWalker
{
    private int maxDogs;
    private DogWalkCompany company;
    public DogWalker(int max, DogWalkCompany comp)
    {
        maxDogs = max;
        company = comp;
    }
    public int walkDogs(int hour)
    {
        int dogs = company.numAvailableDogs(hour);
        if (dogs < maxDogs)
        {
            company.updateDogs(hour, dogs);
            return dogs;
        }
        else
        {
            company.updateDogs(hour, maxDogs);
            return maxDogs;
        }
    }
}
