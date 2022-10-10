public class Main {
    public static void main(String[] args) {
        Account currentAccount =
                (Account) AccountCashe.accountMap.get("CURRENT").clone();
        currentAccount.accountType();
        Account savingAccount=(Account) AccountCashe.accountMap.get("SAVING");
        savingAccount.accountType();

    }
}