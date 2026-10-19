package Ub;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: AudioSpecificConfig.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f6586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f6587n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6594i = -1;
    public final int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6595k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6596l = -1;

    static {
        HashMap map = new HashMap();
        f6586m = map;
        HashMap map2 = new HashMap();
        f6587n = map2;
        map.put(0, 96000);
        map.put(1, 88200);
        map.put(2, 64000);
        map.put(3, 48000);
        map.put(4, 44100);
        map.put(5, 32000);
        map.put(6, 24000);
        map.put(7, 22050);
        map.put(8, 16000);
        map.put(9, 12000);
        map.put(10, 11025);
        map.put(11, 8000);
        map2.put(1, "AAC main");
        map2.put(2, "AAC LC");
        map2.put(3, "AAC SSR");
        map2.put(4, "AAC LTP");
        map2.put(5, "SBR");
        map2.put(6, "AAC Scalable");
        map2.put(7, "TwinVQ");
        map2.put(8, "CELP");
        map2.put(9, "HVXC");
        map2.put(10, "(reserved)");
        map2.put(11, "(reserved)");
        map2.put(12, "TTSI");
        map2.put(13, "Main synthetic");
        map2.put(14, "Wavetable synthesis");
        map2.put(15, "General MIDI");
        map2.put(16, "Algorithmic Synthesis and Audio FX");
        map2.put(17, "ER AAC LC");
        map2.put(18, "(reserved)");
        map2.put(19, "ER AAC LTP");
        map2.put(20, "ER AAC Scalable");
        map2.put(21, "ER TwinVQ");
        map2.put(22, "ER BSAC");
        map2.put(23, "ER AAC LD");
        map2.put(24, "ER CELP");
        map2.put(25, "ER HVXC");
        map2.put(26, "ER HILN");
        map2.put(27, "ER Parametric");
        map2.put(28, "SSC");
        map2.put(29, "PS");
        map2.put(30, "MPEG Surround");
        map2.put(31, "(escape)");
        map2.put(32, "Layer-1");
        map2.put(33, "Layer-2");
        map2.put(34, "Layer-3");
        map2.put(35, "DST");
        map2.put(36, "ALS");
        map2.put(37, "SLS");
        map2.put(38, "SLS non-core");
        map2.put(39, "ER AAC ELD");
        map2.put(40, "SMR Simple");
        map2.put(41, "SMR Main");
    }

    public a() {
        this.f6597b = 5;
    }

    public static void k(int i10, c cVar) {
        if (i10 < 32) {
            cVar.a(i10, 5);
        } else {
            cVar.a(31, 5);
            cVar.a(i10 - 32, 6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6588c == aVar.f6588c && this.f6590e == aVar.f6590e && this.f6591f == aVar.f6591f && this.f6594i == aVar.f6594i && this.f6593h == aVar.f6593h && this.f6589d == aVar.f6589d && this.f6592g == aVar.f6592g && this.j == aVar.j && Arrays.equals((byte[]) null, (byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0053 A[PHI: r0
      0x0053: PHI (r0v10 int) = (r0v9 int), (r0v12 int), (r0v13 int) binds: [B:24:0x003d, B:29:0x0049, B:32:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // Ub.b
    public final int f() {
        int i10 = 5 + 4;
        if (this.f6589d == 15) {
            i10 = 5 + 28;
        }
        int i11 = i10 + 4;
        int i12 = this.f6588c;
        if (i12 == 5 || i12 == 29) {
            i11 = i10 + 8;
            if (this.f6594i == 15) {
                i11 = i10 + 32;
            }
        }
        if (i12 == 22) {
            i11 += 4;
        }
        int i13 = this.f6596l;
        if (i13 >= 0) {
            int i14 = i11 + 11;
            if (i13 == 695) {
                int i15 = i11 + 16;
                int i16 = this.f6591f;
                if (i16 > 30) {
                    i15 = i11 + 22;
                }
                if (i16 == 5) {
                    int i17 = i15 + 1;
                    if (this.f6592g) {
                        i17 = i15 + 5;
                        if (this.f6594i == 15) {
                            i17 = i15 + 29;
                        }
                        int i18 = this.f6595k;
                        if (i18 >= 0) {
                            i11 = i17 + 11;
                            if (i18 == 1352) {
                                i17 += 12;
                                i11 = i17;
                            }
                        } else {
                            i11 = i17;
                        }
                    } else {
                        i11 = i17;
                    }
                } else {
                    i11 = i15;
                }
                if (i16 == 22) {
                    int i19 = i11 + 1;
                    if (this.f6592g) {
                        i19 = i11 + 5;
                        if (this.f6594i == 15) {
                            i19 = i11 + 29;
                        }
                    }
                    i11 = i19 + 4;
                }
            } else {
                i11 = i14;
            }
        }
        return (int) Math.ceil(((double) i11) / 8.0d);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((0 * 31) + this.f6588c) * 31) + this.f6589d) * 31) + 0) * 31) + this.f6590e) * 31) + this.f6591f) * 31) + (this.f6592g ? 1 : 0)) * 31) + (this.f6593h ? 1 : 0)) * 31) + this.f6594i) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.j) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb2.append(ac.a.a(0, null));
        sb2.append(", audioObjectType=");
        sb2.append(this.f6588c);
        sb2.append(" (");
        HashMap map = f6587n;
        sb2.append((String) map.get(Integer.valueOf(this.f6588c)));
        sb2.append("), samplingFrequencyIndex=");
        sb2.append(this.f6589d);
        sb2.append(" (");
        HashMap map2 = f6586m;
        sb2.append(map2.get(Integer.valueOf(this.f6589d)));
        sb2.append("), samplingFrequency=");
        sb2.append(0);
        sb2.append(", channelConfiguration=");
        sb2.append(this.f6590e);
        if (this.f6591f > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f6591f);
            sb2.append(" (");
            sb2.append((String) map.get(Integer.valueOf(this.f6591f)));
            sb2.append("), sbrPresentFlag=");
            sb2.append(this.f6592g);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f6593h);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f6594i);
            sb2.append(" (");
            sb2.append(map2.get(Integer.valueOf(this.f6594i)));
            sb2.append("), extensionSamplingFrequency=");
            sb2.append(0);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(0);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.j);
        sb2.append('}');
        return sb2.toString();
    }
}
