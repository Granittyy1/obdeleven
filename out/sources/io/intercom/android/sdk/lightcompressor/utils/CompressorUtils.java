package io.intercom.android.sdk.lightcompressor.utils;

import I2.e;
import Ka.a;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import io.intercom.android.sdk.lightcompressor.video.Mp4Movie;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlin.text.n;

/* JADX INFO: compiled from: CompressorUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CompressorUtils {
    public static final CompressorUtils INSTANCE = new CompressorUtils();
    private static final int I_FRAME_INTERVAL = 1;
    private static final double MIN_HEIGHT = 640.0d;
    private static final double MIN_WIDTH = 368.0d;

    /* JADX INFO: compiled from: CompressorUtils.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoQuality.values().length];
            try {
                iArr[VideoQuality.VERY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoQuality.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoQuality.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoQuality.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoQuality.VERY_HIGH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CompressorUtils() {
    }

    private final Integer getColorRange(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-range")) {
            return Integer.valueOf(mediaFormat.getInteger("color-range"));
        }
        return null;
    }

    private final Integer getColorStandard(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-standard")) {
            return Integer.valueOf(mediaFormat.getInteger("color-standard"));
        }
        return null;
    }

    private final Integer getColorTransfer(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-transfer")) {
            return Integer.valueOf(mediaFormat.getInteger("color-transfer"));
        }
        return null;
    }

    private final int getFrameRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("frame-rate")) {
            return mediaFormat.getInteger("frame-rate");
        }
        return 30;
    }

    private final int getIFrameIntervalRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("i-frame-interval")) {
            return mediaFormat.getInteger("i-frame-interval");
        }
        return 1;
    }

    public final int findTrack(MediaExtractor extractor, boolean z10) {
        Boolean boolValueOf;
        i.e(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i10);
            i.d(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (z10) {
                boolValueOf = string != null ? Boolean.valueOf(m.I(string, "video/", false)) : null;
                i.b(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    return i10;
                }
            } else {
                boolValueOf = string != null ? Boolean.valueOf(m.I(string, "audio/", false)) : null;
                i.b(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    return i10;
                }
            }
        }
        return -5;
    }

    public final Pair<Integer, Integer> generateWidthAndHeight(double d10, double d11, boolean z10) {
        int iGenerateWidthHeightValue;
        int iGenerateWidthHeightValue2;
        if (z10) {
            return new Pair<>(Integer.valueOf(a.a(d10)), Integer.valueOf(a.a(d11)));
        }
        if (d10 >= 1920.0d || d11 >= 1920.0d) {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d10, 0.5d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.5d);
        } else if (d10 >= 1280.0d || d11 >= 1280.0d) {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d10, 0.75d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.75d);
        } else if (d10 >= 960.0d || d11 >= 960.0d) {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d10, 0.95d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.95d);
        } else {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d10, 0.9d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.9d);
        }
        return new Pair<>(Integer.valueOf(iGenerateWidthHeightValue), Integer.valueOf(iGenerateWidthHeightValue2));
    }

    public final int getBitrate(int i10, VideoQuality quality) {
        i.e(quality, "quality");
        int i11 = WhenMappings.$EnumSwitchMapping$0[quality.ordinal()];
        if (i11 == 1) {
            return a.a(((double) i10) * 0.1d);
        }
        if (i11 == 2) {
            return a.a(((double) i10) * 0.2d);
        }
        if (i11 == 3) {
            return a.a(((double) i10) * 0.3d);
        }
        if (i11 == 4) {
            return a.a(((double) i10) * 0.4d);
        }
        if (i11 == 5) {
            return a.a(((double) i10) * 0.6d);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean hasQTI() {
        kotlin.jvm.internal.a aVarM = e.m(new MediaCodecList(0).getCodecInfos());
        while (aVarM.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) aVarM.next();
            mediaCodecInfo.getName();
            String name = mediaCodecInfo.getName();
            i.d(name, "getName(...)");
            if (n.J(name, "qti.avc", false)) {
                return true;
            }
        }
        return false;
    }

    public final double prepareVideoHeight(MediaMetadataRetriever mediaMetadataRetriever) {
        i.e(mediaMetadataRetriever, "mediaMetadataRetriever");
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
        return (strExtractMetadata == null || strExtractMetadata.length() == 0) ? MIN_HEIGHT : Double.parseDouble(strExtractMetadata);
    }

    public final double prepareVideoWidth(MediaMetadataRetriever mediaMetadataRetriever) {
        i.e(mediaMetadataRetriever, "mediaMetadataRetriever");
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        return (strExtractMetadata == null || strExtractMetadata.length() == 0) ? MIN_WIDTH : Double.parseDouble(strExtractMetadata);
    }

    public final void printException(Exception exception) {
        i.e(exception, "exception");
        String localizedMessage = exception.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "An error has occurred!";
        }
        Log.e("Compressor", localizedMessage, exception);
    }

    public final void setOutputFileParameters(MediaFormat inputFormat, MediaFormat outputFormat, int i10) {
        i.e(inputFormat, "inputFormat");
        i.e(outputFormat, "outputFormat");
        int frameRate = getFrameRate(inputFormat);
        int iFrameIntervalRate = getIFrameIntervalRate(inputFormat);
        outputFormat.setInteger("color-format", 2130708361);
        outputFormat.setInteger("frame-rate", frameRate);
        outputFormat.setInteger("i-frame-interval", iFrameIntervalRate);
        outputFormat.setInteger("bitrate", i10);
        outputFormat.setInteger("bitrate-mode", 2);
        CompressorUtils compressorUtils = INSTANCE;
        Integer colorStandard = compressorUtils.getColorStandard(inputFormat);
        if (colorStandard != null) {
            outputFormat.setInteger("color-standard", colorStandard.intValue());
        }
        Integer colorTransfer = compressorUtils.getColorTransfer(inputFormat);
        if (colorTransfer != null) {
            outputFormat.setInteger("color-transfer", colorTransfer.intValue());
        }
        Integer colorRange = compressorUtils.getColorRange(inputFormat);
        if (colorRange != null) {
            outputFormat.setInteger("color-range", colorRange.intValue());
        }
        outputFormat.toString();
    }

    public final Mp4Movie setUpMP4Movie(int i10, File cacheFile) {
        i.e(cacheFile, "cacheFile");
        Mp4Movie mp4Movie = new Mp4Movie();
        mp4Movie.setCacheFile(cacheFile);
        mp4Movie.setRotation(i10);
        return mp4Movie;
    }
}
