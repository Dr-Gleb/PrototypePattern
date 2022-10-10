import java.util.HashMap;
import java.util.Map;

public class AccountCashe {
    public static Map<String,Account> accountMap = new HashMap<>();
    static {Account currentAccount = new CurrentAccount();
            Account savingAccount = new SavingAccount();
            accountMap.put("CURRENT", currentAccount);
            accountMap.put("SAVING", savingAccount);
    }
}
