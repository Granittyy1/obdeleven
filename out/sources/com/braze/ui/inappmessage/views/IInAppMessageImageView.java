package com.braze.ui.inappmessage.views;

import com.braze.enums.inappmessage.CropType;

/* JADX INFO: compiled from: IInAppMessageImageView.kt */
/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageImageView {
    void setAspectRatio(float f10);

    void setCornersRadiiPx(float f10, float f11, float f12, float f13);

    void setCornersRadiusPx(float f10);

    void setInAppMessageImageCropType(CropType cropType);

    void setToHalfParentHeight(boolean z10);
}
