package mildthreat.framecalc.service;

import mildthreat.framecalc.data.payloads.request.FrameCalcRequest;
import mildthreat.framecalc.data.payloads.response.FrameCalcResponse;
import org.springframework.stereotype.Service;

@Service
public class FrameCalcServiceImpl implements FrameCalcService {
    private static Long usageCount = Long.valueOf(0);

    @Override
    public Long getUsageStats() {
        return usageCount;
    }

    @Override
    public FrameCalcResponse calculateFrameDimensions(FrameCalcRequest frameCalcRequest) {
        float offset = 2 * (frameCalcRequest.getFrameWidth() - frameCalcRequest.getRabbetDepth() + frameCalcRequest.getFudgeFactor());
        float ofd_height = frameCalcRequest.getPictureHeight() + offset;
        float ofd_width = frameCalcRequest.getPictureWidth() + offset;
        // Increment usage count
        ++usageCount;
        return new FrameCalcResponse("Frame width is " + ofd_width + " and height is " + ofd_height);
    }

}
