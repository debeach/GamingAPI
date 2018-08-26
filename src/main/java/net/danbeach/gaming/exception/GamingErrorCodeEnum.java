package net.danbeach.gaming.exception;

public enum GamingErrorCodeEnum {
    INVALID_ARGUMENT(1, "Argument provided is invalid"),
    NULL_PARAMETER(2, "Parameter cannot be null.");

    private String errorMessage;
    private Integer numericErrorCode;
    /////////////////////////////////////////////////////////////////////////////////////

    private GamingErrorCodeEnum(Integer errCode, String errMsg){
        this.numericErrorCode = errCode;
        this.errorMessage = errMsg;
    }
    /////////////////////////////////////////////////////////////////////////////////////

    /**
     * Returns the error message for the given gaming error
     * @return the default error.
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Returns the numeric error code for the given gaming error.
     * @return the numeric error code.
     */
    public Integer getNumericErrorCode() {
        return numericErrorCode;
    }
    /////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString(){
        return "GamingErrorCodeEnum[errCode=" + this.numericErrorCode + ", errMsg=" + this.errorMessage + "]";
    }

}
