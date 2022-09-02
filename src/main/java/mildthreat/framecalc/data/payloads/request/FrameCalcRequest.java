package mildthreat.framecalc.data.payloads.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class FrameCalcRequest {

    @NotBlank
    @NotNull
    private float pictureHeight;

    @NotBlank
    @NotNull
    private float pictureWidth;

    @NotBlank
    @NotNull
    private float frameWidth; // frame material width

    @NotBlank
    @NotNull
    private float rabbetDepth; // the border around the artwork that is behind the frame

    @NotBlank
    @NotNull
    private float fudgeFactor; // excess added to the rabbet depth to permit for installing the backer, glass, etc.

    public float getPictureHeight() {
        return pictureHeight;
    }

    public void setPictureHeight(float pictureHeight) {
        this.pictureHeight = pictureHeight;
    }

    public float getPictureWidth() {
        return pictureWidth;
    }

    public void setPictureWidth(float pictureWidth) {
        this.pictureWidth = pictureWidth;
    }

    public float getFrameWidth() {
        return frameWidth;
    }

    public void setFrameWidth(float frameWidth) {
        this.frameWidth = frameWidth;
    }

    public float getRabbetDepth() {
        return rabbetDepth;
    }

    public void setRabbetDepth(float rabbetDepth) {
        this.rabbetDepth = rabbetDepth;
    }

    public float getFudgeFactor() {
        return fudgeFactor;
    }

    public void setFudgeFactor(float fudgeFactor) {
        this.fudgeFactor = fudgeFactor;
    }
}

