public class Car 
{
    String color;
    double speed;
    double regularPrice;

    public double salePrice()
    {
        return regularPrice;
    }

    static class Truck extends Car
    {
        double weight;
        double getsalePrice;

        public double getsalePrice()
        {
            
            if(weight > 2300)
            {
                getsalePrice = regularPrice - (0.1 * regularPrice);
            }
            else
            getsalePrice = regularPrice - (0.2 * regularPrice);

            return getsalePrice;
        }

    }
    
    
}
