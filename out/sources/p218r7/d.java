package p218r7;

import C.g;

/* JADX INFO: compiled from: ConfigurationConstants.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d f46367c;

    public static synchronized d i0() {
        try {
            if (f46367c == null) {
                f46367c = new d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f46367c;
    }

    @Override // C.g
    public final String P() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // C.g
    public final String R() {
        return "experiment_app_start_ttid";
    }
}
