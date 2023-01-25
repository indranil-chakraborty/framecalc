package mildthreat.framecalc.data.payloads.response;

public class TelemetryResponse {

    private long usageCount;

    public long getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(long usageCount) {
        this.usageCount = usageCount;
    }

    public TelemetryResponse(long usageCount) {
        this.usageCount = usageCount;
    }

}
