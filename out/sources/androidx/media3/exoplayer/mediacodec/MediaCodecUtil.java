package androidx.media3.exoplayer.mediacodec;

import B8.E0;
import J4.n;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.ui.platform.r;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import me.zhanghai.android.materialprogressbar.R;
import p078g1.h;
import p078g1.t;
import p114j1.A;
import p114j1.k;

/* JADX INFO: loaded from: classes.dex */
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<a, List<androidx.media3.exoplayer.mediacodec.d>> f18554a = new HashMap<>();

    public static class DecoderQueryException extends Exception {
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f18557c;

        public a(String str, boolean z10, boolean z11) {
            this.f18555a = str;
            this.f18556b = z10;
            this.f18557c = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            return TextUtils.equals(this.f18555a, aVar.f18555a) && this.f18556b == aVar.f18556b && this.f18557c == aVar.f18557c;
        }

        public final int hashCode() {
            return ((B1.a.b(this.f18555a, 31, 31) + (this.f18556b ? 1231 : 1237)) * 31) + (this.f18557c ? 1231 : 1237);
        }
    }

    public interface b {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    public static final class c implements b {
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b
        public final MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b
        public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b
        public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b
        public final int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b
        public final boolean e() {
            return false;
        }
    }

    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MediaCodecInfo[] f18559b;

        public d(boolean z10, boolean z11, boolean z12) {
            this.f18558a = (z10 || z11 || z12) ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b
        public final MediaCodecInfo a(int i10) {
            if (this.f18559b == null) {
                this.f18559b = new MediaCodecList(this.f18558a).getCodecInfos();
            }
            return this.f18559b[i10];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b
        public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b
        public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b
        public final int d() {
            if (this.f18559b == null) {
                this.f18559b = new MediaCodecList(this.f18558a).getCodecInfos();
            }
            return this.f18559b.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.b
        public final boolean e() {
            return true;
        }
    }

    public interface e<T> {
        int b(T t8);
    }

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (A.f40996a < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((androidx.media3.exoplayer.mediacodec.d) arrayList.get(0)).f18575a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(androidx.media3.exoplayer.mediacodec.d.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new r(1, new n(10)));
        }
        if (A.f40996a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((androidx.media3.exoplayer.mediacodec.d) arrayList.get(0)).f18575a)) {
            return;
        }
        arrayList.add((androidx.media3.exoplayer.mediacodec.d) arrayList.remove(0));
    }

    public static String b(p078g1.n nVar) {
        Pair<Integer, Integer> pairD;
        if ("audio/eac3-joc".equals(nVar.f35302n)) {
            return "audio/eac3";
        }
        String str = nVar.f35302n;
        if ("video/dolby-vision".equals(str) && (pairD = d(nVar)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:158:0x0247  */
    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:246:0x0333  */
    /* JADX WARN: Code duplicated, block: B:247:0x033a  */
    /* JADX WARN: Code duplicated, block: B:280:0x03d9 A[PHI: r2
      0x03d9: PHI (r2v17 int) = (r2v16 int), (r2v19 int), (r2v20 int), (r2v21 int), (r2v22 int) binds: [B:261:0x03ad, B:264:0x03b3, B:266:0x03b7, B:268:0x03bb, B:270:0x03bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    /* JADX WARN: Code duplicated, block: B:84:0x0144  */
    @Deprecated
    public static Pair<Integer, Integer> d(p078g1.n nVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Pair<Integer, Integer> pair;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        char c10;
        Integer num;
        Integer num2;
        byte[] bArr = p114j1.d.f41012a;
        String str = nVar.f35299k;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(nVar.f35302n);
        String str2 = nVar.f35299k;
        if (!zEquals) {
            String str3 = strArrSplit[0];
            str3.getClass();
            h hVar = nVar.f35277B;
            switch (str3) {
                case "av01":
                    if (strArrSplit.length < 4) {
                        Q8.d.e("Ignoring malformed AV1 codec string: ", str2);
                        return null;
                    }
                    try {
                        int i23 = Integer.parseInt(strArrSplit[1]);
                        int i24 = 2;
                        int i25 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i26 = Integer.parseInt(strArrSplit[3]);
                        if (i23 != 0) {
                            com.google.gson.internal.b.e(i23, "Unknown AV1 profile: ");
                            return null;
                        }
                        if (i26 != 8 && i26 != 10) {
                            com.google.gson.internal.b.e(i26, "Unknown AV1 bit depth: ");
                            return null;
                        }
                        int i27 = i26 == 8 ? 1 : (hVar == null || !(hVar.f35257d != null || (i10 = hVar.f35256c) == 7 || i10 == 6)) ? 2 : 4096;
                        switch (i25) {
                            case 0:
                                i24 = 1;
                                i11 = -1;
                                break;
                            case 1:
                                i11 = -1;
                                break;
                            case 2:
                                i24 = 4;
                                i11 = -1;
                                break;
                            case 3:
                                i24 = 8;
                                i11 = -1;
                                break;
                            case 4:
                                i24 = 16;
                                i11 = -1;
                                break;
                            case 5:
                                i24 = 32;
                                i11 = -1;
                                break;
                            case 6:
                                i24 = 64;
                                i11 = -1;
                                break;
                            case 7:
                                i24 = 128;
                                i11 = -1;
                                break;
                            case 8:
                                i24 = 256;
                                i11 = -1;
                                break;
                            case 9:
                                i24 = 512;
                                i11 = -1;
                                break;
                            case 10:
                                i24 = 1024;
                                i11 = -1;
                                break;
                            case 11:
                                i24 = 2048;
                                i11 = -1;
                                break;
                            case 12:
                                i24 = 4096;
                                i11 = -1;
                                break;
                            case 13:
                                i24 = 8192;
                                i11 = -1;
                                break;
                            case 14:
                                i24 = 16384;
                                i11 = -1;
                                break;
                            case 15:
                                i24 = 32768;
                                i11 = -1;
                                break;
                            case 16:
                                i24 = 65536;
                                i11 = -1;
                                break;
                            case 17:
                                i24 = 131072;
                                i11 = -1;
                                break;
                            case 18:
                                i24 = 262144;
                                i11 = -1;
                                break;
                            case 19:
                                i24 = 524288;
                                i11 = -1;
                                break;
                            case 20:
                                i24 = 1048576;
                                i11 = -1;
                                break;
                            case 21:
                                i24 = 2097152;
                                i11 = -1;
                                break;
                            case 22:
                                i24 = 4194304;
                                i11 = -1;
                                break;
                            case 23:
                                i24 = 8388608;
                                i11 = -1;
                                break;
                            default:
                                i11 = -1;
                                i24 = -1;
                                break;
                        }
                        if (i24 != i11) {
                            return new Pair<>(Integer.valueOf(i27), Integer.valueOf(i24));
                        }
                        com.google.gson.internal.b.e(i25, "Unknown AV1 level: ");
                        return null;
                    } catch (NumberFormatException unused) {
                        Q8.d.e("Ignoring malformed AV1 codec string: ", str2);
                        return null;
                    }
                case "avc1":
                case "avc2":
                    if (strArrSplit.length < 2) {
                        Q8.d.e("Ignoring malformed AVC codec string: ", str2);
                        return null;
                    }
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i12 = 16;
                            i13 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i14 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else {
                            i12 = 16;
                            if (strArrSplit.length < 3) {
                                k.f("Ignoring malformed AVC codec string: " + str2);
                                return null;
                            }
                            i13 = Integer.parseInt(strArrSplit[1]);
                            i14 = Integer.parseInt(strArrSplit[2]);
                        }
                        if (i13 == 66) {
                            i15 = 1;
                        } else if (i13 == 77) {
                            i15 = 2;
                        } else if (i13 == 88) {
                            i15 = 4;
                        } else if (i13 == 100) {
                            i15 = 8;
                        } else if (i13 == 110) {
                            i15 = i12;
                        } else if (i13 != 122) {
                            i15 = i13 != 244 ? -1 : 64;
                        } else {
                            i15 = 32;
                        }
                        if (i15 == -1) {
                            com.google.gson.internal.b.e(i13, "Unknown AVC profile: ");
                            return null;
                        }
                        switch (i14) {
                            case 10:
                                i16 = 1;
                                i17 = -1;
                                break;
                            case 11:
                                i17 = -1;
                                i16 = 4;
                                break;
                            case 12:
                                i17 = -1;
                                i16 = 8;
                                break;
                            case 13:
                                i16 = i12;
                                i17 = -1;
                                break;
                            default:
                                switch (i14) {
                                    case 20:
                                        i16 = 32;
                                        i17 = -1;
                                        break;
                                    case 21:
                                        i16 = 64;
                                        i17 = -1;
                                        break;
                                    case 22:
                                        i16 = 128;
                                        i17 = -1;
                                        break;
                                    default:
                                        switch (i14) {
                                            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                                                i16 = 256;
                                                i17 = -1;
                                                break;
                                            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                                                i16 = 512;
                                                i17 = -1;
                                                break;
                                            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                                                i16 = 1024;
                                                i17 = -1;
                                                break;
                                            default:
                                                switch (i14) {
                                                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                                        i16 = 2048;
                                                        i17 = -1;
                                                        break;
                                                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                                        i16 = 4096;
                                                        i17 = -1;
                                                        break;
                                                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                                        i16 = 8192;
                                                        i17 = -1;
                                                        break;
                                                    default:
                                                        switch (i14) {
                                                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                                                i16 = 16384;
                                                                i17 = -1;
                                                                break;
                                                            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                                                i16 = 32768;
                                                                i17 = -1;
                                                                break;
                                                            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                                                i16 = 65536;
                                                                i17 = -1;
                                                                break;
                                                            default:
                                                                i17 = -1;
                                                                i16 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (i16 == i17) {
                            com.google.gson.internal.b.e(i14, "Unknown AVC level: ");
                            return null;
                        }
                        pair = new Pair<>(Integer.valueOf(i15), Integer.valueOf(i16));
                    } catch (NumberFormatException unused2) {
                        Q8.d.e("Ignoring malformed AVC codec string: ", str2);
                        return null;
                    }
                    break;
                    break;
                case "hev1":
                case "hvc1":
                    return p114j1.d.b(str2, strArrSplit, hVar);
                case "mp4a":
                    if (strArrSplit.length != 3) {
                        Q8.d.e("Ignoring malformed MP4A codec string: ", str2);
                        return null;
                    }
                    try {
                        if (!"audio/mp4a-latm".equals(t.e(Integer.parseInt(strArrSplit[1], 16)))) {
                            return null;
                        }
                        int i28 = Integer.parseInt(strArrSplit[2]);
                        int i29 = 17;
                        if (i28 == 17) {
                            i18 = i29;
                            i19 = -1;
                        } else {
                            if (i28 != 20) {
                                i29 = 23;
                                if (i28 != 23) {
                                    i29 = 29;
                                    if (i28 != 29) {
                                        i29 = 39;
                                        if (i28 != 39) {
                                            i29 = 42;
                                            if (i28 != 42) {
                                                switch (i28) {
                                                    case 1:
                                                        i18 = 1;
                                                        break;
                                                    case 2:
                                                        i19 = -1;
                                                        i18 = 2;
                                                        break;
                                                    case 3:
                                                        i19 = -1;
                                                        i18 = 3;
                                                        break;
                                                    case 4:
                                                        i19 = -1;
                                                        i18 = 4;
                                                        break;
                                                    case 5:
                                                        i18 = 5;
                                                        break;
                                                    case 6:
                                                        i19 = -1;
                                                        i18 = 6;
                                                        break;
                                                    default:
                                                        i19 = -1;
                                                        i18 = -1;
                                                        break;
                                                }
                                            } else {
                                                i18 = i29;
                                            }
                                        } else {
                                            i18 = i29;
                                        }
                                    } else {
                                        i18 = i29;
                                    }
                                } else {
                                    i18 = i29;
                                }
                            } else {
                                i18 = 20;
                            }
                            i19 = -1;
                        }
                        if (i18 == i19) {
                            return null;
                        }
                        pair = new Pair<>(Integer.valueOf(i18), 0);
                    } catch (NumberFormatException unused3) {
                        Q8.d.e("Ignoring malformed MP4A codec string: ", str2);
                        return null;
                    }
                    break;
                    break;
                case "s263":
                    pair = new Pair<>(1, 1);
                    if (strArrSplit.length < 3) {
                        Q8.d.e("Ignoring malformed H263 codec string: ", str2);
                        break;
                    } else {
                        try {
                            return new Pair<>(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                        } catch (NumberFormatException unused4) {
                            Q8.d.e("Ignoring malformed H263 codec string: ", str2);
                        }
                        break;
                    }
                    break;
                case "vp09":
                    if (strArrSplit.length < 3) {
                        Q8.d.e("Ignoring malformed VP9 codec string: ", str2);
                        return null;
                    }
                    try {
                        int i30 = Integer.parseInt(strArrSplit[1]);
                        int i31 = Integer.parseInt(strArrSplit[2]);
                        if (i30 == 0) {
                            i20 = 1;
                        } else if (i30 == 1) {
                            i20 = 2;
                        } else if (i30 != 2) {
                            i20 = i30 != 3 ? -1 : 8;
                        } else {
                            i20 = 4;
                        }
                        if (i20 == -1) {
                            com.google.gson.internal.b.e(i30, "Unknown VP9 profile: ");
                            return null;
                        }
                        if (i31 != 10) {
                            if (i31 == 11) {
                                i22 = -1;
                                i21 = 2;
                            } else if (i31 == 20) {
                                i22 = -1;
                                i21 = 4;
                            } else if (i31 == 21) {
                                i22 = -1;
                                i21 = 8;
                            } else if (i31 == 30) {
                                i22 = -1;
                                i21 = 16;
                            } else if (i31 == 31) {
                                i21 = 32;
                            } else if (i31 == 40) {
                                i21 = 64;
                            } else if (i31 == 41) {
                                i21 = 128;
                            } else if (i31 == 50) {
                                i21 = 256;
                            } else if (i31 != 51) {
                                switch (i31) {
                                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                                        i21 = 2048;
                                        break;
                                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                                        i21 = 4096;
                                        break;
                                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                        i21 = 8192;
                                        break;
                                    default:
                                        i22 = -1;
                                        i21 = -1;
                                        break;
                                }
                            } else {
                                i21 = 512;
                            }
                            if (i21 == i22) {
                                com.google.gson.internal.b.e(i31, "Unknown VP9 level: ");
                                return null;
                            }
                            pair = new Pair<>(Integer.valueOf(i20), Integer.valueOf(i21));
                        } else {
                            i21 = 1;
                        }
                        i22 = -1;
                        if (i21 == i22) {
                            com.google.gson.internal.b.e(i31, "Unknown VP9 level: ");
                            return null;
                        }
                        pair = new Pair<>(Integer.valueOf(i20), Integer.valueOf(i21));
                    } catch (NumberFormatException unused5) {
                        Q8.d.e("Ignoring malformed VP9 codec string: ", str2);
                        return null;
                    }
                    break;
                    break;
                default:
                    return null;
            }
        } else {
            if (strArrSplit.length < 3) {
                Q8.d.e("Ignoring malformed Dolby Vision codec string: ", str2);
                return null;
            }
            Matcher matcher = p114j1.d.f41014c.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                Q8.d.e("Ignoring malformed Dolby Vision codec string: ", str2);
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup) {
                    case "00":
                        c10 = 2;
                        num = 1;
                        break;
                    case "01":
                        c10 = 2;
                        num = 2;
                        break;
                    case "02":
                        num = 4;
                        c10 = 2;
                        break;
                    case "03":
                        num = 8;
                        c10 = 2;
                        break;
                    case "04":
                        num = 16;
                        c10 = 2;
                        break;
                    case "05":
                        num = 32;
                        c10 = 2;
                        break;
                    case "06":
                        num = 64;
                        c10 = 2;
                        break;
                    case "07":
                        num = 128;
                        c10 = 2;
                        break;
                    case "08":
                        num = 256;
                        c10 = 2;
                        break;
                    case "09":
                        num = 512;
                        c10 = 2;
                        break;
                    case "10":
                        num = 1024;
                        c10 = 2;
                        break;
                    default:
                        num = null;
                        c10 = 2;
                        break;
                }
            } else {
                num = null;
                c10 = 2;
            }
            if (num == null) {
                Q8.d.e("Unknown Dolby Vision profile string: ", strGroup);
                return null;
            }
            String str4 = strArrSplit[c10];
            if (str4 != null) {
                switch (str4) {
                    case "01":
                        num2 = 1;
                        break;
                    case "02":
                        num2 = 2;
                        break;
                    case "03":
                        num2 = 4;
                        break;
                    case "04":
                        num2 = 8;
                        break;
                    case "05":
                        num2 = 16;
                        break;
                    case "06":
                        num2 = 32;
                        break;
                    case "07":
                        num2 = 64;
                        break;
                    case "08":
                        num2 = 128;
                        break;
                    case "09":
                        num2 = 256;
                        break;
                    case "10":
                        num2 = 512;
                        break;
                    case "11":
                        num2 = 1024;
                        break;
                    case "12":
                        num2 = 2048;
                        break;
                    case "13":
                        num2 = 4096;
                        break;
                    default:
                        num2 = null;
                        break;
                }
            } else {
                num2 = null;
            }
            if (num2 == null) {
                Q8.d.e("Unknown Dolby Vision level string: ", str4);
                return null;
            }
            pair = new Pair<>(num, num2);
        }
        return pair;
    }

    public static synchronized List<androidx.media3.exoplayer.mediacodec.d> e(String str, boolean z10, boolean z11) throws DecoderQueryException {
        try {
            a aVar = new a(str, z10, z11);
            HashMap<a, List<androidx.media3.exoplayer.mediacodec.d>> map = f18554a;
            List<androidx.media3.exoplayer.mediacodec.d> list = map.get(aVar);
            if (list != null) {
                return list;
            }
            ArrayList<androidx.media3.exoplayer.mediacodec.d> arrayListF = f(aVar, new d(z10, z11, str.equals("video/mv-hevc")));
            if (z10 && arrayListF.isEmpty() && A.f40996a <= 23) {
                arrayListF = f(aVar, new c());
                if (!arrayListF.isEmpty()) {
                    k.f("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListF.get(0).f18575a);
                }
            }
            a(str, arrayListF);
            ImmutableList immutableListG = ImmutableList.G(arrayListF);
            map.put(aVar, immutableListG);
            return immutableListG;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public static ArrayList<androidx.media3.exoplayer.mediacodec.d> f(a aVar, b bVar) throws DecoderQueryException {
        String strC;
        String str;
        String str2;
        int i10;
        boolean z10;
        boolean z11;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        String str3;
        a aVar2 = aVar;
        try {
            ArrayList<androidx.media3.exoplayer.mediacodec.d> arrayList = new ArrayList<>();
            String str4 = aVar2.f18555a;
            int iD = bVar.d();
            boolean zE = bVar.e();
            int i11 = 0;
            while (i11 < iD) {
                MediaCodecInfo mediaCodecInfoA = bVar.a(i11);
                int i12 = A.f40996a;
                if (i12 < 29 || !mediaCodecInfoA.isAlias()) {
                    String name = mediaCodecInfoA.getName();
                    if (h(mediaCodecInfoA, name, zE, str4) && (strC = c(mediaCodecInfoA, name, str4)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strC);
                            boolean zB = bVar.b("tunneled-playback", strC, capabilitiesForType);
                            boolean zC = bVar.c("tunneled-playback", capabilitiesForType);
                            boolean z12 = aVar2.f18557c;
                            if ((z12 || !zC) && (!z12 || zB)) {
                                boolean zB2 = bVar.b("secure-playback", strC, capabilitiesForType);
                                boolean zC2 = bVar.c("secure-playback", capabilitiesForType);
                                boolean z13 = aVar2.f18556b;
                                if ((z13 || !zC2) && (!z13 || zB2)) {
                                    if (i12 >= 29) {
                                        zIsHardwareAccelerated = mediaCodecInfoA.isHardwareAccelerated();
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                        zIsHardwareAccelerated = !i(mediaCodecInfoA, str4);
                                    }
                                    boolean zI = i(mediaCodecInfoA, str4);
                                    if (i12 >= 29) {
                                        zIsVendor = mediaCodecInfoA.isVendor();
                                    } else {
                                        String strL = I.e.l(mediaCodecInfoA.getName());
                                        zIsVendor = (strL.startsWith("omx.google.") || strL.startsWith("c2.android.") || strL.startsWith("c2.google.")) ? false : z11;
                                    }
                                    if (!(zE && z13 == zB2) && (zE || z13)) {
                                        str = strC;
                                        str3 = name;
                                        i10 = i11;
                                        z10 = zE;
                                        if (!z10 && zB2) {
                                            StringBuilder sb2 = new StringBuilder();
                                            try {
                                                sb2.append(str3);
                                                sb2.append(".secure");
                                                str2 = str3;
                                                try {
                                                    arrayList.add(androidx.media3.exoplayer.mediacodec.d.i(sb2.toString(), str4, str, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, true));
                                                    return arrayList;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    if (A.f40996a <= 23) {
                                                    }
                                                    k.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                str2 = str3;
                                            }
                                        }
                                    } else {
                                        str = strC;
                                        str3 = name;
                                        i10 = i11;
                                        z10 = zE;
                                        try {
                                            arrayList.add(androidx.media3.exoplayer.mediacodec.d.i(name, str4, strC, capabilitiesForType, zIsHardwareAccelerated, zI, zIsVendor, false));
                                        } catch (Exception e12) {
                                            e = e12;
                                            str2 = str3;
                                            if (A.f40996a <= 23 || arrayList.isEmpty()) {
                                                k.c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                            k.c("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                        }
                                    }
                                } else {
                                    i10 = i11;
                                    z10 = zE;
                                }
                            } else {
                                i10 = i11;
                                z10 = zE;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            str = strC;
                            str2 = name;
                            i10 = i11;
                            z10 = zE;
                        }
                    } else {
                        i10 = i11;
                        z10 = zE;
                    }
                } else {
                    i10 = i11;
                    z10 = zE;
                }
                i11 = i10 + 1;
                aVar2 = aVar;
                zE = z10;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new DecoderQueryException("Failed to query underlying media codecs", e14);
        }
    }

    public static List g(E0 e10, p078g1.n nVar, boolean z10, boolean z11) throws DecoderQueryException {
        String str = nVar.f35302n;
        e10.getClass();
        List<androidx.media3.exoplayer.mediacodec.d> listE = e(str, z10, z11);
        String strB = b(nVar);
        List listK = strB == null ? ImmutableList.K() : e(strB, z10, z11);
        ImmutableList.a aVar = new ImmutableList.a();
        aVar.f(listE);
        aVar.f(listK);
        return aVar.h();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = A.f40996a;
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (A.f40996a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (t.i(str)) {
            return true;
        }
        String strL = I.e.l(mediaCodecInfo.getName());
        if (strL.startsWith("arc.")) {
            return false;
        }
        if (strL.startsWith("omx.google.") || strL.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strL.startsWith("omx.sec.") && strL.contains(".sw.")) || strL.equals("omx.qcom.video.decoder.hevcswvdec") || strL.startsWith("c2.android.") || strL.startsWith("c2.google.")) {
            return true;
        }
        return (strL.startsWith("omx.") || strL.startsWith("c2.")) ? false : true;
    }
}
