package mildthreat.framecalc.web;

import mildthreat.framecalc.data.payloads.request.FrameCalcRequest;
import mildthreat.framecalc.data.payloads.response.FrameCalcResponse;
import mildthreat.framecalc.service.FrameCalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frameCalc")

public class FrameCalcController {

    @Autowired
    FrameCalcService frameCalcService;

    @PostMapping("/calculate")
    @ResponseBody
    public ResponseEntity<FrameCalcResponse> calculateFrameDimensions(@RequestBody FrameCalcRequest frameCalcRequest) {
        FrameCalcResponse frameDetails = frameCalcService.calculateFrameDimensions(frameCalcRequest);
        return new ResponseEntity<>(frameDetails, HttpStatus.CREATED);
    }

    @GetMapping("/usageStats")
    @ResponseBody
    public ResponseEntity<Long> getUsageStats() {
        Long usageStats = frameCalcService.getUsageStats();
        return new ResponseEntity<>(usageStats, HttpStatus.CREATED);
    }
}
