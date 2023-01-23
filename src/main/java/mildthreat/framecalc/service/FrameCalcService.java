package mildthreat.framecalc.service;

import mildthreat.framecalc.data.payloads.request.FrameCalcRequest;
import mildthreat.framecalc.data.payloads.response.FrameCalcResponse;
import org.springframework.stereotype.Component;

@Component
public interface FrameCalcService {
    FrameCalcResponse calculateFrameDimensions(FrameCalcRequest frameCalcRequest);

    Long getUsageStats();
}
