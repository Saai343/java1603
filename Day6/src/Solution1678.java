class Solution1678 {
    public String interpret(String command) {
        command=command.replace("()","o");
        return(command.replace("(al)","al"));
    }
}