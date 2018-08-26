package net.danbeach.gaming.exception;

public class GamingException extends RuntimeException {

    private static final long serialVersionUID = 599540437870557744L;

    private int numericErrorCode;
    private GamingErrorCodeEnum gamingErrorCodeEnum;

    public GamingException(){super();}

    public GamingException(int numErrCode){
        super();
        this.numericErrorCode = numErrCode;
    }

    public GamingException(String msg){
        super(msg);
    }

    public GamingException(final GamingErrorCodeEnum gamErrCode, final String msg){
        super(msg);
        this.numericErrorCode = gamErrCode.getNumericErrorCode();
        this.gamingErrorCodeEnum = gamErrCode;
    }

    public GamingException(int errCode, GamingErrorCodeEnum gamingErrorCode){
        super();
        this.numericErrorCode = errCode;
        this.gamingErrorCodeEnum = gamingErrorCode;
    }

    public GamingException(int errCode, GamingErrorCodeEnum gamingErrCode, String msg){
        super(msg);
        this.numericErrorCode = errCode;
        this.gamingErrorCodeEnum = gamingErrCode;
    }
    /////////////////////////////////////////////////////////////////////////////////////


    public int getNumericErrorCode() {
        return numericErrorCode;
    }

    public void setNumericErrorCode(int numericErrorCode) {
        this.numericErrorCode = numericErrorCode;
    }

    public GamingErrorCodeEnum getGamingErrorCodeEnum() {
        return gamingErrorCodeEnum;
    }

    public void setGamingErrorCodeEnum(GamingErrorCodeEnum gamingErrorCodeEnum) {
        this.gamingErrorCodeEnum = gamingErrorCodeEnum;
    }
}
