package p131k5;

/* JADX INFO: renamed from: k5.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2557r0<V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f42423g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2554q0<V> f42425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f42426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f42427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f42428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile V f42429f;

    public C2557r0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2557r0(String str, Object obj, Object obj2, InterfaceC2554q0 interfaceC2554q0) {
        this.f42428e = new Object();
        this.f42429f = null;
        this.f42424a = str;
        this.f42426c = obj;
        this.f42427d = obj2;
        this.f42425b = interfaceC2554q0;
    }

    public final V a(V v10) {
        synchronized (this.f42428e) {
        }
        if (v10 != null) {
            return v10;
        }
        if (H.f41814e == null) {
            return this.f42426c;
        }
        synchronized (f42423g) {
            try {
                if (C2507f0.b()) {
                    return this.f42429f == null ? this.f42426c : this.f42429f;
                }
                try {
                    for (C2557r0<?> c2557r0 : B.f41657a) {
                        if (C2507f0.b()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        V v11 = null;
                        try {
                            InterfaceC2554q0<?> interfaceC2554q0 = c2557r0.f42425b;
                            if (interfaceC2554q0 != null) {
                                v11 = (V) interfaceC2554q0.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f42423g) {
                            c2557r0.f42429f = v11;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC2554q0<V> interfaceC2554q1 = this.f42425b;
                if (interfaceC2554q1 == null) {
                    return this.f42426c;
                }
                try {
                    return interfaceC2554q1.a();
                } catch (IllegalStateException unused3) {
                    return this.f42426c;
                } catch (SecurityException unused4) {
                    return this.f42426c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
