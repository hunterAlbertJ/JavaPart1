/*
 *A module is a named set of packages
 * The packages in this module are simply the ones that live here together
 * You dont have to list them explicitly
 * com.entertainment
 * com.entertainment.util
 */

module com.entertainment{
    //which *packages* does this module expose (via 'exports' directive)
    exports com.entertainment;

}