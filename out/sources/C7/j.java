package C7;

import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

/* JADX INFO: compiled from: FirebaseRemoteConfigSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2445b;

    /* JADX INFO: compiled from: FirebaseRemoteConfigSettings.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f2446a = 60;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f2447b = ConfigFetchHandler.f28551i;

        public final void a(long j) {
            if (j >= 0) {
                this.f2447b = j;
                return;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public j(a aVar) {
        this.f2444a = aVar.f2446a;
        this.f2445b = aVar.f2447b;
    }
}
