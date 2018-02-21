/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {
    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Different types of accounts that are accessible
         */
        CHECKING;
        final ThreadLocal<SAVINGS>
                STUDENT;

        BankAccountType() {
            STUDENT = new ThreadLocal<>();
        }

        WORKPLACE
    }

    private int accountNumber;
    public final ThreadLocal<BankAccountType> accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    /**
     */
    private BankAccount() {
        String x;
        this(x,BankAccountType.CHECKING );
    }

    /**
     * @param name
     * @param accountCategory
     */
    BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.name = name;
        accountType = new ThreadLocal<BankAccountType>();
        accountType.set(accountCategory);
    }
    public void setAccountNumber(final int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void getAccountBalance() {
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setAccountType(final BankAccountType nAccountType) {
        this.accountNumber = nAccountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public BankAccountType getAccountType() {
        return accountType;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}