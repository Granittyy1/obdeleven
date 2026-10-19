package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.media3.exoplayer.C1391i;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;
import p078g1.h;
import p078g1.n;
import p078g1.t;
import p114j1.A;
import p114j1.k;

/* JADX INFO: compiled from: MediaCodecInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f18578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18583i;

    public d(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.f18575a = str;
        this.f18576b = str2;
        this.f18577c = str3;
        this.f18578d = codecCapabilities;
        this.f18581g = z10;
        this.f18579e = z13;
        this.f18580f = z14;
        this.f18582h = z15;
        this.f18583i = t.l(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(A.e(i10, widthAlignment) * widthAlignment, A.e(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    public static d i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z14 = false;
        } else {
            if (A.f40996a <= 22) {
                String str4 = Build.MODEL;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z14 = false;
                }
            }
            z14 = true;
        }
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z16 = z13 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (A.f40996a < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z15 = false;
        } else {
            String str5 = Build.MANUFACTURER;
            if (str5.equals("Xiaomi") || str5.equals("OPPO")) {
                z15 = false;
            } else {
                z15 = true;
            }
        }
        return new d(str, str2, str3, codecCapabilities, z10, z11, z12, z14, z16, z15);
    }

    public final C1391i b(n nVar, n nVar2) {
        int i10 = !Objects.equals(nVar.f35302n, nVar2.f35302n) ? 8 : 0;
        if (this.f18583i) {
            if (nVar.f35312x != nVar2.f35312x) {
                i10 |= 1024;
            }
            if (!this.f18579e && (nVar.f35309u != nVar2.f35309u || nVar.f35310v != nVar2.f35310v)) {
                i10 |= 512;
            }
            h hVar = nVar.f35277B;
            boolean zE = h.e(hVar);
            h hVar2 = nVar2.f35277B;
            if ((!zE || !h.e(hVar2)) && !Objects.equals(hVar, hVar2)) {
                i10 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f18575a) && !nVar.c(nVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C1391i(this.f18575a, nVar, nVar2, nVar.c(nVar2) ? 3 : 2, 0);
            }
        } else {
            if (nVar.f35279D != nVar2.f35279D) {
                i10 |= 4096;
            }
            if (nVar.f35280E != nVar2.f35280E) {
                i10 |= 8192;
            }
            if (nVar.f35281F != nVar2.f35281F) {
                i10 |= 16384;
            }
            String str = this.f18576b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair<Integer, Integer> pairD = MediaCodecUtil.d(nVar);
                Pair<Integer, Integer> pairD2 = MediaCodecUtil.d(nVar2);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C1391i(this.f18575a, nVar, nVar2, 3, 0);
                    }
                }
            }
            if (!nVar.c(nVar2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C1391i(this.f18575a, nVar, nVar2, 1, 0);
            }
        }
        return new C1391i(this.f18575a, nVar, nVar2, 0, i10);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(n nVar, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair<Integer, Integer> pair;
        String strA;
        Pair<Integer, Integer> pairB;
        int i10;
        int i11 = 4;
        int i12 = 3;
        Pair<Integer, Integer> pairD = MediaCodecUtil.d(nVar);
        String str = this.f18577c;
        int i13 = 1;
        String str2 = nVar.f35302n;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM = t.m(str);
            if (strM.equals("video/mv-hevc")) {
                return true;
            }
            if (strM.equals("video/hevc")) {
                List<byte[]> list = nVar.f35305q;
                int i14 = 0;
                loop0: while (true) {
                    if (i14 >= list.size()) {
                        pair = null;
                        strA = null;
                        break;
                    }
                    byte[] bArr = list.get(i14);
                    int length = bArr.length;
                    if (length > i12) {
                        boolean[] zArr = new boolean[i12];
                        ImmutableList.b bVar = ImmutableList.f27874c;
                        ImmutableList.a aVar = new ImmutableList.a();
                        int i15 = 0;
                        while (i15 < bArr.length) {
                            int iB = p127k1.e.b(bArr, i15, bArr.length, zArr);
                            if (iB != bArr.length) {
                                aVar.c(Integer.valueOf(iB));
                            }
                            i15 = iB + i12;
                        }
                        ImmutableList immutableListH = aVar.h();
                        int i16 = 0;
                        while (i16 < immutableListH.size()) {
                            if (((Integer) immutableListH.get(i16)).intValue() + i12 < length) {
                                p127k1.f fVar = new p127k1.f(bArr, ((Integer) immutableListH.get(i16)).intValue() + i12, length);
                                k1.e.b bVarE = p127k1.e.e(fVar);
                                if (bVarE.f41405a == 33 && bVarE.f41406b == 0) {
                                    fVar.l(4);
                                    int iF = fVar.f(3);
                                    fVar.k();
                                    pair = null;
                                    k1.e.c cVarF = p127k1.e.f(fVar, true, iF, null);
                                    strA = p114j1.d.a(cVarF.f41408a, cVarF.f41409b, cVarF.f41410c, cVarF.f41411d, cVarF.f41412e, cVarF.f41413f);
                                    break loop0;
                                }
                                i12 = 3;
                                i10 = 1;
                            } else {
                                i10 = i13;
                            }
                            i16 += i10;
                            i13 = i10;
                        }
                    }
                    int i17 = i13;
                    i14 += i17;
                    i13 = i17;
                }
                if (strA == null) {
                    pairB = pair;
                } else {
                    String strTrim = strA.trim();
                    int i18 = A.f40996a;
                    pairB = p114j1.d.b(strA, strTrim.split("\\.", -1), nVar.f35277B);
                }
                pairD = pairB;
            }
        }
        if (pairD == null) {
            return true;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        int iIntValue2 = ((Integer) pairD.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str2);
        String str3 = this.f18576b;
        if (zEquals) {
            str3.getClass();
            switch (str3) {
                case "video/av01":
                case "video/hevc":
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    break;
            }
            iIntValue2 = 0;
        }
        if (!this.f18583i && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18578d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (A.f40996a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i11 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i11 = 512;
            } else if (iIntValue3 >= 60000000) {
                i11 = 256;
            } else if (iIntValue3 >= 30000000) {
                i11 = 128;
            } else if (iIntValue3 >= 18000000) {
                i11 = 64;
            } else if (iIntValue3 >= 12000000) {
                i11 = 32;
            } else if (iIntValue3 >= 7200000) {
                i11 = 16;
            } else if (iIntValue3 >= 3600000) {
                i11 = 8;
            } else if (iIntValue3 < 1800000) {
                i11 = iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i11;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z10)) {
                if (!"video/hevc".equals(str3) || 2 != iIntValue) {
                    return true;
                }
                String str4 = Build.DEVICE;
                if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                    return true;
                }
            }
        }
        h("codec.profileLevel, " + nVar.f35299k + ", " + str);
        return false;
    }

    public final boolean d(n nVar) {
        return (Objects.equals(nVar.f35302n, "audio/flac") && nVar.f35281F == 22 && A.f40996a < 34 && this.f18575a.equals("c2.android.flac.decoder")) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:75:0x0102  */
    /* JADX WARN: Code duplicated, block: B:76:0x0104  */
    /* JADX WARN: Code duplicated, block: B:78:0x010c  */
    /* JADX WARN: Code duplicated, block: B:79:0x010f  */
    /* JADX WARN: Code duplicated, block: B:82:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x013c, please report this as an issue */
    public final boolean e(n nVar) throws MediaCodecUtil.DecoderQueryException {
        int i10;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int maxInputChannelCount;
        int i11;
        int i12;
        String str = nVar.f35302n;
        String str2 = this.f18576b;
        if (!(str2.equals(str) || str2.equals(MediaCodecUtil.b(nVar))) || !c(nVar, true) || !d(nVar)) {
            return false;
        }
        if (this.f18583i) {
            int i13 = nVar.f35309u;
            if (i13 <= 0 || (i12 = nVar.f35310v) <= 0) {
                return true;
            }
            return g(i13, i12, nVar.f35311w);
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18578d;
        int i14 = nVar.f35280E;
        if (i14 == -1) {
            i10 = nVar.f35279D;
            if (i10 != -1) {
                return true;
            }
            if (codecCapabilities == null) {
                h("channelCount.caps");
            } else {
                audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("channelCount.aCaps");
                } else {
                    maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((A.f40996a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i11 = 6;
                        } else if ("audio/eac3".equals(str2)) {
                            i11 = 16;
                        } else {
                            i11 = 30;
                        }
                        k.f("AssumedMaxChannelAdjustment: " + this.f18575a + ", [" + maxInputChannelCount + " to " + i11 + "]");
                        maxInputChannelCount = i11;
                    }
                    if (maxInputChannelCount < i10) {
                        return true;
                    }
                    h("channelCount.support, " + i10);
                }
            }
        } else if (codecCapabilities == null) {
            h("sampleRate.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                h("sampleRate.aCaps");
            } else if (audioCapabilities2.isSampleRateSupported(i14)) {
                i10 = nVar.f35279D;
                if (i10 != -1) {
                    return true;
                }
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                } else {
                    audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        h("channelCount.aCaps");
                    } else {
                        maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1) {
                            if ("audio/ac3".equals(str2)) {
                                i11 = 6;
                            } else if ("audio/eac3".equals(str2)) {
                                i11 = 16;
                            } else {
                                i11 = 30;
                            }
                            k.f("AssumedMaxChannelAdjustment: " + this.f18575a + ", [" + maxInputChannelCount + " to " + i11 + "]");
                            maxInputChannelCount = i11;
                        }
                        if (maxInputChannelCount < i10) {
                            return true;
                        }
                        h("channelCount.support, " + i10);
                    }
                }
            } else {
                h("sampleRate.support, " + i14);
            }
        }
        return false;
    }

    public final boolean f(n nVar) {
        if (this.f18583i) {
            return this.f18579e;
        }
        Pair<Integer, Integer> pairD = MediaCodecUtil.d(nVar);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    public final boolean g(int i10, int i11, double d10) {
        char c10;
        Boolean bool;
        List supportedPerformancePoints;
        boolean z10;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f18578d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i12 = A.f40996a;
        if (i12 >= 29) {
            if (i12 < 29 || (((bool = e.f18584a) != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty())) {
                c10 = 0;
            } else {
                I3.f.c();
                MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointC = I3.g.c(i10, i11, (int) d10);
                int i13 = 0;
                while (true) {
                    if (i13 >= supportedPerformancePoints.size()) {
                        c10 = 1;
                        break;
                    }
                    if (U2.a.c(supportedPerformancePoints.get(i13)).covers(performancePointC)) {
                        c10 = 2;
                        break;
                    }
                    i13++;
                }
                if (c10 == 1 && e.f18584a == null) {
                    if (i12 >= 35) {
                        z10 = false;
                    } else {
                        int iA = e.a.a(false);
                        int iA2 = e.a.a(true);
                        if (iA != 0 && (iA2 != 0 ? iA == 2 && iA2 == 2 : iA == 2)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    }
                    e.f18584a = Boolean.valueOf(z10);
                    if (z10) {
                        c10 = 0;
                    }
                }
            }
            if (c10 == 2) {
                return true;
            }
            if (c10 == 1) {
                StringBuilder sbA = B6.a.a("sizeAndRate.cover, ", "x", "@", i10, i11);
                sbA.append(d10);
                h(sbA.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                String str = this.f18575a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i11, i10, d10)) {
                    StringBuilder sbA2 = B6.a.a("sizeAndRate.rotated, ", "x", "@", i10, i11);
                    sbA2.append(d10);
                    StringBuilder sbC = B6.a.c("AssumedSupport [", sbA2.toString(), "] [", str, ", ");
                    sbC.append(this.f18576b);
                    sbC.append("] [");
                    sbC.append(A.f40997b);
                    sbC.append("]");
                    k.b(sbC.toString());
                }
            }
            StringBuilder sbA3 = B6.a.a("sizeAndRate.support, ", "x", "@", i10, i11);
            sbA3.append(d10);
            h(sbA3.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder sbA = C7.g.a("NoSupport [", str, "] [");
        sbA.append(this.f18575a);
        sbA.append(", ");
        sbA.append(this.f18576b);
        sbA.append("] [");
        sbA.append(A.f40997b);
        sbA.append("]");
        k.b(sbA.toString());
    }

    public final String toString() {
        return this.f18575a;
    }
}
