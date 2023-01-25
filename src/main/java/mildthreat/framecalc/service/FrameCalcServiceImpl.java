package mildthreat.framecalc.service;

import mildthreat.framecalc.data.payloads.request.FrameCalcRequest;
import mildthreat.framecalc.data.payloads.response.FrameCalcResponse;
import mildthreat.framecalc.data.payloads.response.TelemetryResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.stereotype.Service;

@Service
public class FrameCalcServiceImpl implements FrameCalcService {
    private static long usageCount = 0;

    @Override
    public FrameCalcResponse calculateFrameDetails(FrameCalcRequest frameCalcRequest) {
        float offset = 2 * (frameCalcRequest.getFrameWidth() - frameCalcRequest.getRabbetDepth() + frameCalcRequest.getFudgeFactor());
        float ofd_height = frameCalcRequest.getPictureHeight() + offset;
        float ofd_width = frameCalcRequest.getPictureWidth() + offset;
        ++usageCount;
        return new FrameCalcResponse("Frame width is " + ofd_width + " and height is " + ofd_height);
    }

    @Override
    public TelemetryResponse getTelemetryResults() {
        return new TelemetryResponse(usageCount);
    }

}
