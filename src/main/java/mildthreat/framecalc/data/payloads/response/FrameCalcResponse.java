package mildthreat.framecalc.data.payloads.response;

public class FrameCalcResponse {
    private String message;

    public FrameCalcResponse(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
