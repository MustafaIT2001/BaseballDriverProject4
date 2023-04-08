/***********************************************************************
 * REVISION HISTORY (Newest First)
 *********************************************************************** 
 *
 * 08/04/2016 - Anne Applin - formatting and JavaDoc
 * 2014 - David Briggs - original starting code and comments
 ***********************************************************************/ 
package baseballdriver;

/**
 * A class to represent the pitchers on a team.
 * You must
 * <ol>
 * <li> define private data members for the additional
 *    attributes that are specific to pitchers,
 *    essentially a few additional statistics </li>
 * <li>  define a public constructor to take values for all the
 *    inherited and local data members, which sets their
 *    data members' values to the parameter values</li>
 * <li>  define public getters for the count data members to be 
 *    used in calculating aggregate statistics for the the team's
 *    pitching</li>
 * <li> define a public toString method that produces a
 *    String in the format needed for the lookup method of
 *    Team </li>
 * </ol>
 *<pre>    n is a pitcher named name and has statistics
 *    PA: k  BB: m  SO: p  H: q  IP: r  ER: s  ERA: x  WHIP: y</pre>
 *    which is discussed in the program assignment. The first 4 items 
 *    come from the super class toString()
 * If you do extra credits, you may need to define more methods, but
 * all data members must be private, so only object instances can
 * directly access them.
 * 
 * @author dbriggs
 */
public class Pitcher extends Player{
    // class properties go here
    
    
    // class implementation goes here

    
    
    
    
    /**
     * Unit test for Pitcher.  There is no need to comment this out! 
     * Do NOT Change.  Leave it at the bottom of the file!
     * @param args command line args 
     */   
    public static void main (String[] args){
        Pitcher pitcher = new Pitcher(4, "Jim", 1 , 
            true, 12, 2, 3, 5, 12, 3);
        // test toString
        System.out.println(pitcher);
        System.out.println("Expectd Output:\n"
                + "PA: 12 BB: 2 SO: 3 H: 5 IP: 4 0/3 ER: 3 ERA: 6.75 "
                + "WHIP: 1.75\n\n");
        // test accessors for Player class
        System.out.println(pitcher.getName() + " is a " 
                          + pitcher.getPositionWord());
        System.out.println("Expected Output: ");
        System.out.println("Jim is a Pitcher\n\n");
        Player p = new Pitcher(65, "Jonathan", 1, true, 416, 23, 80, 
                111, 259, 32);
        System.out.println((Pitcher)p);
        System.out.println("Expected Output:");                
        System.out.println("PA: 416 BB: 23 SO: 80 H: 111 IP: 86 1/3 ER: 32 "
                + "ERA: 3.34 WHIP: 1.55\n\n");
        p = new Pitcher(65, "Jonathan", 1, true, 416, 23, 80, 
                111, 0, 32);
        System.out.println((Pitcher)p);
        System.out.println("Expected Output:");                
        System.out.println("PA: 416 BB: 23 SO: 80 H: 111 IP: 0 0/3 ER: 32 "
                + "ERA: n/a WHIP: n/a");
    }

}