package ferrari;

import java.util.ArrayList;

public class Scene
{
	private ArrayList<Entity> entities;
	
	public Scene()
	{
		new ArrayList<Entity>();
	}
	
	public ArrayList<Entity> getEntities()
	{
		return entities;
	}
	
	public void setEntities(ArrayList<Entities> ents)
	{
		entities = ents;
	}
	
	public void add(Entity ent)
	{
		entities.add(ent);
	}
	
	public void remove(Entity ent)
	{
		entites.remove(ent);
	}
	
	public void clear()
	{
		entities.clear();
	}
}
