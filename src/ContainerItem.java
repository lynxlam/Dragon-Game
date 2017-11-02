/*
*@description Location class
*
*@author Team 4B : Linh Lam, So Negishi, Hoang Pham, Duc Nguyen
*@version November 1, 2017
*/

import java.util.List;
import java.util.ArrayList;

public class ContainerItem extends Item {
    private List<Item> collection;
    
    public ContainerItem( String Name, String Type, String Description ) {
        super(  Name,  Type,  Description );
        collection = new ArrayList<>();
    }


    public ContainerItem() {
        collection = new ArrayList<>();
    }
    
    public String getName() {
    	return super.getName();
    }

    // This method adds an item to the collection
    public void addItem( Item item ) {
    	if (collection!= null)
        collection.add(item);
    }

    // This method removes an item to the collection
    public void removeItem( Item item ) {
    	if(collection!=null)
        collection.remove(item);
    }

    // This methods queries the collection
    public List<Item> getCollection() {
        return collection;
    }
    
    public Item retrieveContainedItem( String shortName ) {
        for (Item i: collection) {

            if (i.getName().contains(shortName)) {
               return i;           
        
            }
        }

        return null;
    }
    
    
   
    
    public boolean isHolding(String item) {
    	for( Item i : this.collection ) {
    		if ( item.contains(i.getName()))  {
    			//System.out.println("True");
    			return true;
    			
			}
		}
    	//System.out.println("false");
    	return false;
    	
    	}
    public void print() {
    	System.out.println("\t\tShortname: " + super.getName() + "\n\t\tType: " + super.getType() + "\n\t\tDescription: It contains: ") ;
    	int countBox = 0;
    	for( Item i : collection ) {
    		countBox++;
        	System.out.println(  String.format("\t\t%s", i.getName())) ;
    	}
    	if (countBox == 0)
    		System.out.print("\t\tNothing");
    }

    public String toString( ) {
    	
        return "\t\tShortname: " + super.getName() + "\n\t\tType: " + super.getType() + "\n\t\tDescription: "+ super.getDescription() ;
        
    } 
    
}


