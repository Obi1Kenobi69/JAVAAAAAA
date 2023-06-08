package kosinka;
import java.util.ArrayList;

public class stopka
{
	private ArrayList<karta>ist;
	public stopka()
	{
		ist=new ArrayList<karta>();
	}
	public karta get(int nom)
	{
		return ist.get(nom);
	}
	public void add(karta elem)
	{
		ist.add(elem);
	}
	public void remove(int nom)
	{
		ist.remove(nom);
	}
	public int size()
	{
		return ist.size();
	}
	public void clear()
	{
		ist.clear();
	}
}
