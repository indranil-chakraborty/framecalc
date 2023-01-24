package mildthreat.framecalc.service;

import mildthreat.framecalc.data.payloads.request.FrameCalcRequest;
import mildthreat.framecalc.data.payloads.response.FrameCalcResponse;
import org.springframework.stereotype.Service;

@Service
public class FrameCalcServiceImpl implements FrameCalcService {
    @Override
    public FrameCalcResponse calculateFrameDetails(FrameCalcRequest frameCalcRequest) {
        float offset = 2 * (frameCalcRequest.getFrameWidth() - frameCalcRequest.getRabbetDepth() + frameCalcRequest.getFudgeFactor());
        float ofd_height = frameCalcRequest.getPictureHeight() + offset;
        float ofd_width = frameCalcRequest.getPictureWidth() + offset;

        return new FrameCalcResponse("Frame width is " + ofd_width + " and height is " + ofd_height);
    }
}
