package io.pivotal.microservices.accounts;

import io.pivotal.microservices.services.web.SearchCriteria;

/**
 * Created by Riskiana on 8/8/2017.
 */
public class AccountHandler {
    private final AccountRepository accountRepository;
    public AccountHandler(final AccountRepository accountRepository){
        super();
        this.accountRepository=accountRepository;

    }

    public void createAccount(SearchCriteria criteria){

        final AccountEntity accountData=new AccountEntity();
        accountData.setNumber(criteria.getAccountNumber());
        accountData.setOwner(criteria.getSearchText());
        this.accountRepository.save(accountData);
    }

}
