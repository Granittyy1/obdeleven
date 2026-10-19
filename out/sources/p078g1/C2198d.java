package p078g1;

import android.media.AudioAttributes;
import com.obdeleven.service.core.b;
import p114j1.A;

/* JADX INFO: renamed from: g1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AudioAttributes.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2198d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2198d f35244b = new C2198d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f35245a;

    /* JADX INFO: renamed from: g1.d$a */
    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f35246a;

        public a(C2198d c2198d) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            c2198d.getClass();
            AudioAttributes.Builder usage = builder.setContentType(0).setFlags(0).setUsage(1);
            int i10 = A.f40996a;
            if (i10 >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            if (i10 >= 32) {
                usage.setSpatializationBehavior(0);
            }
            this.f35246a = usage.build();
        }
    }

    static {
        b.b(0, 1, 2, 3, 4);
    }

    public final a a() {
        if (this.f35245a == null) {
            this.f35245a = new a(this);
        }
        return this.f35245a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2198d.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }
}
