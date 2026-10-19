package androidx.media3.exoplayer.mediacodec;

import V.j;
import android.media.MediaCodecInfo;
import java.util.List;
import p078g1.n;
import p078g1.t;

/* JADX INFO: compiled from: MediaCodecPerformancePointCoverageProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f18584a;

    /* JADX INFO: compiled from: MediaCodecPerformancePointCoverageProvider.java */
    public static final class a {
        public static int a(boolean z10) {
            List supportedPerformancePoints;
            try {
                n.a aVar = new n.a();
                aVar.f35338m = t.m("video/avc");
                n nVar = new n(aVar);
                if (nVar.f35302n != null) {
                    List listG = MediaCodecUtil.g(f.f18585e0, nVar, z10, false);
                    for (int i10 = 0; i10 < listG.size(); i10++) {
                        if (((d) listG.get(i10)).f18578d != null && ((d) listG.get(i10)).f18578d.getVideoCapabilities() != null && (supportedPerformancePoints = ((d) listG.get(i10)).f18578d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            I3.f.c();
                            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointB = j.b();
                            for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
                                if (U2.a.c(supportedPerformancePoints.get(i11)).covers(performancePointB)) {
                                    return 2;
                                }
                            }
                            return 1;
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }
    }
}
