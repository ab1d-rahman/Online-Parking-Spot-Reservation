
package Services;

/**
 *
 * @author ab1d_rahman
 */
public class userInfo {
    
    String email;
    String password;
    String firstName;
    String lastName;
    String phoneNo;
    
    public userInfo(String e, String pW, String fN, String lN, String pN) {
        this.email = e;
        this.password = pW;
        this.firstName = fN;
        this.lastName = lN;
        this.phoneNo = pN;
    }
}

