package coil.disk;

import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import kotlinx.coroutines.N;
import p318zb.l;
import p318zb.t;
import p318zb.z;

/* JADX INFO: compiled from: DiskCache.kt */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: coil.disk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskCache.kt */
    public static final class C0240a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z f22945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f22946b = l.f49101a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f22947c = 0.02d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f22948d = 10485760;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f22949e = 262144000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Sa.a f22950f = N.f43200c;

        public final d a() {
            long jE;
            z zVar = this.f22945a;
            if (zVar == null) {
                throw new IllegalStateException("directory == null");
            }
            double d10 = this.f22947c;
            if (d10 > 0.0d) {
                try {
                    File fileE = zVar.e();
                    fileE.mkdir();
                    StatFs statFs = new StatFs(fileE.getAbsolutePath());
                    jE = Na.l.E((long) (d10 * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f22948d, this.f22949e);
                } catch (Exception unused) {
                    jE = this.f22948d;
                }
            } else {
                jE = 0;
            }
            return new d(jE, this.f22950f, this.f22946b, zVar);
        }
    }

    /* JADX INFO: compiled from: DiskCache.kt */
    public interface b extends Closeable {
        z L();

        d.a V();

        z getData();
    }

    d.a a(String str);

    d.b b(String str);

    l c();
}
