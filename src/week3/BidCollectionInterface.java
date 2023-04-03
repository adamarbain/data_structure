/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package week3;

/**
 *
 * @author user
 */
public interface BidCollectionInterface {
    
    // adding a bid to the collection
    public void addingBid (BidInterface bid);
    
    // return the bid with best yearly cost
    public BidInterface bestYearlyCost() ;
    
    // returning bid with best intitial cost (unit cost + installation cost)
    public BidInterface bestInitialCost () ;
    
    // method to clears all of items in this collection
    public void clearItems ();
    
    // method to gets the number of item in collection
    public int getItem () ;
    
    // method return boolean whether the collection is empty
    public boolean collectionIsEmpty () ;
    
    // method to search for bid based on price
    public BidCollectionInterface findMaxPriceOfBid (double limit) ;

    // method to search for bid based on performance
    public BidCollectionInterface findBasedPerformance (double SEERvalue, String description);
}

