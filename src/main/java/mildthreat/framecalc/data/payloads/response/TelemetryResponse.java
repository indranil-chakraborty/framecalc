package mildthreat.framecalc.data.payloads.response;

public class TelemetryResponse {

    private int usageCount;

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }

    public TelemetryResponse(int usageCount){
        this.usageCount = usageCount;
    }

}
