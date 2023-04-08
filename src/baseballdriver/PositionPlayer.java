/***********************************************************************
 * REVISION HISTORY (Newest First)
 *********************************************************************** 
 *
 * 08/04/2016 - Anne Applin - formatting and JavaDoc
 * 2014 - David Briggs - original starting code and comments
 ***********************************************************************/ 

package baseballdriver;

/**
 * A class to represent non-pitcher position players.
 * You must
 * <ol>
 * <li> define private data members for the additional
 *    attributes that are specific to non-Pitcher players,
 *    essentially additional hitting statistics</li>
 * <li> define a public constructor to take values for all the
 *    inherited and local data members, which sets their
 *    data members' values to the parameter values</li>
 * <li> define public getters for the data members to be 
 *    used in calculating aggregate statistics for the the team's hitting
 *    stats</li>
 * <li> define a public toString method that produces a
 *    String in the format needed for the lookup method of  
 *    Team <br>
 *    <pre>n is a position named name and has statistics
 *    PA: k  BB: m  SO: p  H: q  AB: r  BI: s  HR: t HBP: u BA: x  OBP: y </pre>
 *    which is discussed in the program assignment. The first 4 items 
 *    come from the super class toString()</li>
 * </ol>
 *    If you do extra credits, you may need to define more methods, but
 *    all data members must be private, so only object instances can
 *    directly access them.
 * @author dbriggs
 */
public class PositionPlayer extends Player{
    // class properties go here
    
    // class implementation goes here
    
    
    
    
    
/**
     * Unit test for PositionPlayer - creates a PositionPlayer by calling 
     * the constructor and then prints it out. There is no need to comment 
     * this out!  
     * * Do NOT Change.  Leave it at the bottom of the file!
     * @param args command line args 
     */
    public static void main (String[] args){
        Player posPlayer = new PositionPlayer(12, "Bob", 7 , 
            true, 12, 2, 3, 5, 12, 3, 4, 0);
        // test toString
        System.out.println((PositionPlayer)posPlayer);
        System.out.println("Expected:");
        System.out.println("PA: 12 BB: 2 SO: 3 H: 5 AB: 12 BI: 3 HR: 4 "
                + "HBP: 0 BA: 0.417  OBP: 0.583\n\n");
        // test accessors for Player class
        System.out.println(posPlayer.getName() + " is a " 
                           + posPlayer.getPositionWord());
        System.out.println("Expected:");
        System.out.println("Bob is a left fielder\n\n");
        Player p = new PositionPlayer(26, "Brock", 4,  true, 1443, 33, 83, 
                422, 454, 274, 50, 2);
        System.out.println((PositionPlayer)p);
        System.out.println("Expected:");
        System.out.println("PA: 1443 BB: 33 SO: 83 H: 422 AB: 454 BI: 274 "
                + "HR: 50 HBP: 2 BA: 0.930  OBP: 0.317\n\n");
        p = new PositionPlayer(26, "Brock", 4,  true, 1443, 33, 83, 
                422, 0, 274, 50, 2); 
        System.out.println((PositionPlayer)p);
        System.out.println("Expected:");
        System.out.println("PA: 1443 BB: 33 SO: 83 H: 422 AB: 0 BI: 274 "
                + "HR: 50 HBP: 2 BA: n/a  OBP: 0.317\n\n");
        p = new PositionPlayer(26, "Brock", 4,  true, 0, 33, 83, 
                422, 454, 274, 50, 2);
        System.out.println((PositionPlayer)p);
        System.out.println("Expected:");
        System.out.println("PA: 0 BB: 33 SO: 83 H: 422 AB: 454 BI: 274 "
                + "HR: 50 HBP: 2 BA: 0.930  OBP: n/a");
    }
}