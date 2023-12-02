public interface AccountAllMethod {
    public Double consult();
    public  Double debit(Integer n);
    public Double credit(Integer n);
    public Double transaction(Integer n, Account receiver);
}
