package mildthreat.framecalc.service;

import mildthreat.framecalc.data.payloads.request.FrameCalcRequest;
import mildthreat.framecalc.data.payloads.response.FrameCalcResponse;
import mildthreat.framecalc.data.payloads.response.TelemetryResponse;
import org.springframework.stereotype.Component;

@Component
public interface FrameCalcService {
    // Interface method to calculate frame details
    FrameCalcResponse calculateFrameDetails(FrameCalcRequest frameCalcRequest);
    // Interface method to return telemetry details
    TelemetryResponse getTelemetryResults();

}
