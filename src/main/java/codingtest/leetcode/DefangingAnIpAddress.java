package codingtest.leetcode;

public class DefangingAnIpAddress {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
