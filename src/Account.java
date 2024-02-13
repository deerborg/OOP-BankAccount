/**
 * @author Furkan Aydemir, deerborg
 * @since 2024
 * @version alpha 1.1
 * Calling BankAccountForATm application with OOP and a single code.
 */
import java.util.Scanner;
public class Account {
    private String fullName;
    private long IdNo;
    private String securityQuestion;
    private int password;
    private double balance;
    private int selector;
    private String loading;
    private String bracket;
    private String warning;
    
    public void warning(){
        System.out.println("************************************");
    }
    public void bracket(){
        System.out.println("------------------------------------------");
    }
    public void loading(){
        System.out.println("-------------- Please wait --------------");
    }
    public Account(){
        // Register panel
        this.balance = 0;
        Scanner fullNameScanner = new Scanner(System.in);
        System.out.println("Welcome the XXX Bank. \n Please create an account, enter ur name and surname");
        this.fullName = fullNameScanner.nextLine();
        
        Scanner IdScanner = new Scanner(System.in);
        System.out.println("Enter ur ID no");
        this.IdNo = IdScanner.nextLong();
         
        Scanner passwordScanner = new Scanner(System.in);
        System.out.println("Please create an password");
        this.password = passwordScanner.nextInt();
        
        Scanner securityQuestionScanner = new Scanner(System.in);
        System.out.println("This is a security question. Please enter your favorite color information. For example, black.");
        this.securityQuestion = securityQuestionScanner.nextLine();
        
        loading();
        System.out.println("Account information has been successfully saved. I'm directing you to the login page.");
        loading();
        // Login panel
        while(true){
            System.out.println("Welcome to XXX Bank. Please enter your ID and password.");
            Scanner checkId = new Scanner(System.in);
            double checkIdNo = checkId.nextDouble();
            if(checkIdNo != IdNo){
                warning();
                System.out.println("ID number is wrong, try again.");
                warning();
                continue;
            }if (checkIdNo == IdNo){
                System.out.println("Hello," + fullName + " enter your password.");
            }
            Scanner checkPass = new Scanner(System.in);
            int checkPassNo = checkPass.nextInt();
            if(checkPassNo != password){
                warning();
                System.out.println("Incorrect password, try again.");
                warning();
                continue;
            }
            if(checkPassNo == password){
                System.out.println("Welcome " + fullName + " I direct you to the transaction menu.");
                loading();
            }break;
        }
        // Selection menu
        while(true){
            System.out.println("Please select the option you want to perform. For example, 2 .");
            bracket();
            System.out.println("1 - Deposit \n 2 - Withdraw \n 3 - Change password \n 4 - Exit");
            Scanner selecScanner = new Scanner(System.in);
            this.selector = selecScanner.nextInt();
                if(selector == 1){
                    Scanner balanceScanner = new Scanner(System.in);
                    System.out.println("Enter the amount you want to deposit.");
                    double newBalance = balanceScanner.nextDouble();
                    balance += newBalance;
                    System.out.println("The deposit was successful, thank you. Your balance: " + "\n"+balance);
                    loading();
                    System.out.println("You are directed to the menu....");
                    bracket();
                
                    if(newBalance <= 0){
                        warning();
                        System.out.println("Please enter a valid amount.");
                        warning();
                        continue;
                } 
            }
                else if(selector == 2){
                    if(balance == 0){
                        warning();
                        System.out.println("You cannot perform this transaction because you do not have any amount in your account.");
                        warning();
                        System.out.println("You are directed to the menu....");
                        loading();
                        continue;
                    }
                    System.out.println("Enter the amount you want to withdraw. Total balance: " +"\n"+ balance);
                    Scanner reBalanceScanner = new Scanner(System.in);
                    double removeBalance = reBalanceScanner.nextDouble();
                    if(removeBalance > balance){
                        System.out.println("There is not enough balance in your account. Your total balance: " + balance);
                        continue;
                    }
                    balance -= removeBalance;
                    System.out.println("The withdraw was successful, thank you. Your balance: " +"\n"+ balance);
                    loading();
                    System.out.println("You are directed to the menu....");
                    bracket();
                    
                }
                else if (selector == 3){
                    System.out.println("Please enter your security question answer: ");
                    Scanner secScanner = new Scanner(System.in);
                    String checkSecurty = secScanner.nextLine();
                    if(checkSecurty.equals(securityQuestion)){
                        System.out.println("Please enter your new password.");
                        Scanner newPassScanner = new Scanner(System.in);
                        password = newPassScanner.nextInt();
                        System.out.println("Your password has been changed.");
                        loading();
                        bracket();  
                    }
                    else{
                        System.out.println("The answer is incorrect, try again.");
                        System.out.println("The session is closed for security reasons.");
                        break;
                    }
                }
                else if(selector == 4){
                    System.out.println("Exiting safely. Thank you for choosing us.");
                    bracket();
                    break;
                }
        }
    }
    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the securityQuestion
     */
    public String getSecurityQuestion() {
        return securityQuestion;
    }

    /**
     * @param securityQuestion the securityQuestion to set
     */
    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * @return the selector
     */
    public int getSelector() {
        return selector;
    }

    /**
     * @param selector the selector to set
     */
    public void setSelector(int selector) {
        this.selector = selector;
    }

    /**
     * @return the IdNo
     */
    public long getIdNo() {
        return IdNo;
    }

    /**
     * @param IdNo the IdNo to set
     */
    public void setIdNo(long IdNo) {
        this.IdNo = IdNo;
    }

    /**
     * @return the loading
     */
    public String getLoading() {
        return loading;
    }

    /**
     * @param loading the loading to set
     */
    public void setLoading(String loading) {
        this.loading = loading;
    }

    /**
     * @return the bracket
     */
    public String getBracket() {
        return bracket;
    }

    /**
     * @param bracket the bracket to set
     */
    public void setBracket(String bracket) {
        this.bracket = bracket;
    }

    /**
     * @return the warning
     */
    public String getWarning() {
        return warning;
    }

    /**
     * @param warning the warning to set
     */
    public void setWarning(String warning) {
        this.warning = warning;
    }
    
    
    
    
    
    
    
    
}
