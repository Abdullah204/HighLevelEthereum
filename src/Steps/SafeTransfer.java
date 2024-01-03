package Steps;

public class SafeTransfer implements Step{
    int javaLine;
    String seller;
    String tokenId;
    public SafeTransfer(String seller , String tokenId){
        this.seller = seller;
        this.tokenId = tokenId;
    }

    @Override
    public String write() throws Exception {
        return "safeTransferFrom(_"+seller+", msg.sender, _"+tokenId+ ");";
    }

    @Override
    public void setJavaLine(int javaLine) {
        this.javaLine = javaLine;
    }
}
