package metier;

public class Actions
{


    public Actions()
    {

    }

    public void tirer(Players cicble, int x, int y)
    {
        for (Bateaux bateaux : cicble.getBateau())
        {
            if(bateaux.estToucher(x,y))
            {
                System.out.println("Toucher");
                if(bateaux.estCoule())
                {
                    System.out.println("Bateaux Couler");
                }
            }    
        }
    }
}
