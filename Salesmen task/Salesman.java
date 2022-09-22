public class Salesman 
{
	
	


	public String name;
	public int TotalSales;

	
	
	public Salesman(String name, int TotalSales) 
	{
	this.name = name;
	this.TotalSales = TotalSales;
	}


	public static Salesman[] getTopFive(Salesman[] sales)
	{
		Salesman top5[] = new Salesman[5];
		for(int i = 0; i < sales.length;i++)
		{
			int counter = 0;
			while( (top5[counter] == null ||  top5[counter].TotalSales < sales[i].TotalSales))
			{
				if(counter == 0)
				{
					top5[counter] = sales[i];
				}
				else
				{
					Salesman temp = null;
					temp = top5[counter];
					top5[counter] = sales[i];
					top5[counter - 1] = temp;
				}
				counter++;
			}
		}
		return top5;
	}

@Override 
	public String toString()
	{
	return "Salesmen: " + this.name + "has yearly total sales at $ " + this.TotalSales;
	}

	
 
}