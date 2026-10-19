package io.intercom.android.sdk.lightcompressor.config;

import Q8.d;
import androidx.compose.animation.D;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Configuration {
    private boolean disableAudio;
    private boolean isMinBitrateCheckEnabled;
    private final boolean keepOriginalResolution;
    private VideoQuality quality;
    private Integer videoBitrateInMbps;
    private Double videoHeight;
    private List<String> videoNames;
    private Double videoWidth;

    public Configuration(VideoQuality quality, boolean z10, Integer num, boolean z11, boolean z12, Double d10, Double d11, List<String> videoNames) {
        i.e(quality, "quality");
        i.e(videoNames, "videoNames");
        this.quality = quality;
        this.isMinBitrateCheckEnabled = z10;
        this.videoBitrateInMbps = num;
        this.disableAudio = z11;
        this.keepOriginalResolution = z12;
        this.videoHeight = d10;
        this.videoWidth = d11;
        this.videoNames = videoNames;
    }

    public final VideoQuality component1() {
        return this.quality;
    }

    public final boolean component2() {
        return this.isMinBitrateCheckEnabled;
    }

    public final Integer component3() {
        return this.videoBitrateInMbps;
    }

    public final boolean component4() {
        return this.disableAudio;
    }

    public final boolean component5() {
        return this.keepOriginalResolution;
    }

    public final Double component6() {
        return this.videoHeight;
    }

    public final Double component7() {
        return this.videoWidth;
    }

    public final List<String> component8() {
        return this.videoNames;
    }

    public final Configuration copy(VideoQuality quality, boolean z10, Integer num, boolean z11, boolean z12, Double d10, Double d11, List<String> videoNames) {
        i.e(quality, "quality");
        i.e(videoNames, "videoNames");
        return new Configuration(quality, z10, num, z11, z12, d10, d11, videoNames);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return this.quality == configuration.quality && this.isMinBitrateCheckEnabled == configuration.isMinBitrateCheckEnabled && i.a(this.videoBitrateInMbps, configuration.videoBitrateInMbps) && this.disableAudio == configuration.disableAudio && this.keepOriginalResolution == configuration.keepOriginalResolution && i.a(this.videoHeight, configuration.videoHeight) && i.a(this.videoWidth, configuration.videoWidth) && i.a(this.videoNames, configuration.videoNames);
    }

    public final boolean getDisableAudio() {
        return this.disableAudio;
    }

    public final boolean getKeepOriginalResolution() {
        return this.keepOriginalResolution;
    }

    public final VideoQuality getQuality() {
        return this.quality;
    }

    public final Integer getVideoBitrateInMbps() {
        return this.videoBitrateInMbps;
    }

    public final Double getVideoHeight() {
        return this.videoHeight;
    }

    public final List<String> getVideoNames() {
        return this.videoNames;
    }

    public final Double getVideoWidth() {
        return this.videoWidth;
    }

    public int hashCode() {
        int iB = D.b(this.quality.hashCode() * 31, 31, this.isMinBitrateCheckEnabled);
        Integer num = this.videoBitrateInMbps;
        int iB2 = D.b(D.b((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.disableAudio), 31, this.keepOriginalResolution);
        Double d10 = this.videoHeight;
        int iHashCode = (iB2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.videoWidth;
        return this.videoNames.hashCode() + ((iHashCode + (d11 != null ? d11.hashCode() : 0)) * 31);
    }

    public final boolean isMinBitrateCheckEnabled() {
        return this.isMinBitrateCheckEnabled;
    }

    public final void setDisableAudio(boolean z10) {
        this.disableAudio = z10;
    }

    public final void setMinBitrateCheckEnabled(boolean z10) {
        this.isMinBitrateCheckEnabled = z10;
    }

    public final void setQuality(VideoQuality videoQuality) {
        i.e(videoQuality, "<set-?>");
        this.quality = videoQuality;
    }

    public final void setVideoBitrateInMbps(Integer num) {
        this.videoBitrateInMbps = num;
    }

    public final void setVideoHeight(Double d10) {
        this.videoHeight = d10;
    }

    public final void setVideoNames(List<String> list) {
        i.e(list, "<set-?>");
        this.videoNames = list;
    }

    public final void setVideoWidth(Double d10) {
        this.videoWidth = d10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration(quality=");
        sb2.append(this.quality);
        sb2.append(", isMinBitrateCheckEnabled=");
        sb2.append(this.isMinBitrateCheckEnabled);
        sb2.append(", videoBitrateInMbps=");
        sb2.append(this.videoBitrateInMbps);
        sb2.append(", disableAudio=");
        sb2.append(this.disableAudio);
        sb2.append(", keepOriginalResolution=");
        sb2.append(this.keepOriginalResolution);
        sb2.append(", videoHeight=");
        sb2.append(this.videoHeight);
        sb2.append(", videoWidth=");
        sb2.append(this.videoWidth);
        sb2.append(", videoNames=");
        return d.b(sb2, this.videoNames, ')');
    }

    public /* synthetic */ Configuration(VideoQuality videoQuality, boolean z10, Integer num, boolean z11, boolean z12, Double d10, Double d11, List list, int i10, e eVar) {
        this((i10 & 1) != 0 ? VideoQuality.MEDIUM : videoQuality, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? null : d10, (i10 & 64) != 0 ? null : d11, list);
    }
}
