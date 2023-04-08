/***********************************************************************
 * REVISION HISTORY (Newest First)
 * **********************************************************************
 * 
 * 08/04/2016 - Anne Applin - formatting and JavaDoc
 * 2014 - David Briggs - original starting code and comments 
 ***********************************************************************/

package baseballdriver;

import java.util.*;

/**
 * A class to hold a number of team rosters for the teams of a league.
 * You must use a Map data member to hold the Team objects, either a HashMap
 * or a TreeMap may be used.
 * You must
 * <ol>
 * <li> code a constructor that takes a Scanner object and which loads
 *     the Map data member with the collection of Team objects from the file
 *     given by the Scanner.</li>
 * <li> code a public method String lookupPlayer(String t, int n)
 *     that returns the appropriate choice from the following three results
 *    <ol>
 *     <li>No team named t is in the league.</li>
 *     <li>No player with number n is on the roster for the t.</li>
 *     <li><code><player stats for player n of team t></code></li>
 *    </ol>
 *     where the format of the last is given in the program assignment.</li>
 * <li> code a public method String calcPitchingStats(String t)
 *     that returns the appropriate choice from the following three results</li>
 *     <ol>
 *     <li>No team named t is in the league.</li>
 *     <li>The t appear to have no pitchers at this time.</li>
 *     <li><code><pitching stats for t></code></li>
 *     where the format of the last is given in the program assignment.</li>
 * <li> code a public method String calcHittingStats(String t)
 *     that returns the appropriate choice from the following three results</li>
 *     <ol>
 *     <li>No team named t is in the league.<li>
 *     <li>The t appear to have no hitters at this time.</li>
 *     <li><code><hitting stats for t></code></li>
 *     where the format of the last is given in the program assignment.
 *     The other two methods are extra credit options that you may do if
 *     you wish.  Consult the program assignment for their specifications.</li>
 *</ol> 
 * @author David Briggs
 */
public class League{
    /*
         Properties 
    */
    
    
    /**
     * Constructor for League.  Reads the input file given and validated
     * on the command line.
     * @param s a Scanner object that has already been connected to a 
     *    physical file in the driver.
     */
    public League(Scanner s){
        
        
    }

    

    /**
     * Lookup a specific player on a specific team.
     * be sure to use ignore case for all string inputs
     * @param team a String representing the team name
     * @param playerNum an int representing the player we are looking up
     * @return a string representing the results of the lookup.  
     */
    public String lookup(String team, int playerNum){
        StringBuilder str = new StringBuilder();
        str.append("lookup stub");
        return str.toString();
    }

    /**
     * Calculate the pitching statistics for a given team
     * be sure to use ignore case for all string inputs
     * @param team a String that is the team name - the key for the map
     * @return a String representing the results of the calculations
     */
    public String calcPitchingStats(String team){
        StringBuilder str = new StringBuilder();
        str.append("pitching stub");
        return str.toString();
    }

    /**
     * Calculate the hitting statistics for a given team
     * be sure to use ignore case for all string inputs
     * @param team a String that is the team name - the key for the map
     * @return a String representing the results of the calculations
     */
    public String calcHittingStats(String team){
        StringBuilder str = new StringBuilder();
        str.append("hitting stub");
        return str.toString();
    }


    /**
     * Allows the players on a team to update statistics based on the
     * outcome of a current game. (ideally will update two teams from one game)
     * There is no need to comment this out! 
     * Do NOT Change until you implement it.
     * @param scnr a keyboard Scanner object
     * @return A String as specified
     */
    public String update(Scanner scnr){
        StringBuilder str = new StringBuilder();
        str.append("update stub");
        return str.toString();
    }

    /**
     * Calculates the statistics for the league for right handed and left \
     *  handed pitchers and hitters
     * There is no need to comment this out! 
     * Do NOT Change until you implement it.
     * @return a String as specified
     */
    public String calculateHandedness(){
        StringBuilder str = new StringBuilder();
        str.append("handedness stub");
        return str.toString();
    }

}