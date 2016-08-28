package datamanagement;
//navinder singh atwal	
//11542757
//
public class ListUnitsCTL 

//spaces corrected and code is aligned in good way

{
    private UnitManager um;
    public ListUnitsCTL() 
		
        {
		 um = UnitManager.UM();
		}
    
    public void listUnits( IUnitLister lister ) 
        
        {
         lister.clearUnits();UnitMap units = um.getUnits();
         for (String s : units.keySet() ) lister.addUnit(units.get(s));
        }
}