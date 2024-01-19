public class CheckedVsUnchecked {
    public void validateString(String str) throws EmptyStringException {
        if (str.length() == 0) {
            throw new EmptyStringException("The string is empty");
        }
    }
}
