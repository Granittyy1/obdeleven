package p131k5;

import U4.C0804l;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zziq;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class L0 extends D1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Pair<String, Long> f41860A = new Pair<>("", 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f41861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f41862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f41863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public O0 f41864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final P0 f41865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q0 f41866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f41867i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f41868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final P0 f41869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N0 f41870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Q0 f41871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M0 f41872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final N0 f41873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final P0 f41874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final P0 f41875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f41876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final N0 f41877t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final N0 f41878u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final P0 f41879v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Q0 f41880w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Q0 f41881x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final P0 f41882y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final M0 f41883z;

    public L0(C2523i1 c2523i1) {
        super(c2523i1);
        this.f41862d = new Object();
        this.f41869l = new P0(this, "session_timeout", 1800000L);
        this.f41870m = new N0(this, "start_new_session", true);
        this.f41874q = new P0(this, "last_pause_time", 0L);
        this.f41875r = new P0(this, "session_id", 0L);
        this.f41871n = new Q0(this, "non_personalized_ads");
        this.f41872o = new M0(this, "last_received_uri_timestamps_by_source");
        this.f41873p = new N0(this, "allow_remote_dynamite", false);
        this.f41865g = new P0(this, "first_open_time", 0L);
        C0804l.e("app_install_time");
        this.f41866h = new Q0(this, "app_instance_id");
        this.f41877t = new N0(this, "app_backgrounded", false);
        this.f41878u = new N0(this, "deep_link_retrieval_complete", false);
        this.f41879v = new P0(this, "deep_link_retrieval_attempts", 0L);
        this.f41880w = new Q0(this, "firebase_feature_rollouts");
        this.f41881x = new Q0(this, "deferred_attribution_cache");
        this.f41882y = new P0(this, "deferred_attribution_cache_timestamp", 0L);
        this.f41883z = new M0(this, "default_event_parameters");
    }

    public final zziq A() {
        p();
        return zziq.e(y().getInt("consent_source", 100), y().getString("consent_settings", "G1"));
    }

    @Override // p131k5.D1
    public final boolean s() {
        return true;
    }

    public final boolean t(int i10) {
        return zziq.h(i10, y().getInt("consent_source", 100));
    }

    public final boolean u(long j) {
        return j - this.f41869l.a() > this.f41874q.a();
    }

    public final void v(boolean z10) {
        p();
        B0 b0D = d();
        b0D.f41719n.b(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = y().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    public final SharedPreferences w() {
        p();
        q();
        if (this.f41863e == null) {
            synchronized (this.f41862d) {
                try {
                    if (this.f41863e == null) {
                        String str = ((C2523i1) this.f3968a).f42212a.getPackageName() + "_preferences";
                        d().f41719n.b(str, "Default prefs file");
                        this.f41863e = ((C2523i1) this.f3968a).f42212a.getSharedPreferences(str, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f41863e;
    }

    public final SharedPreferences y() {
        p();
        q();
        C0804l.h(this.f41861c);
        return this.f41861c;
    }

    public final SparseArray<Long> z() {
        Bundle bundleA = this.f41872o.a();
        if (bundleA == null) {
            return new SparseArray<>();
        }
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            d().f41712f.c("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }
}
