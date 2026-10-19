package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D3.l f43517a = new D3.l(4, "COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D3.l f43518b = new D3.l(4, "COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D3.l f43519c = new D3.l(4, "COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D3.l f43520d = new D3.l(4, "TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D3.l f43521e = new D3.l(4, "SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final T f43522f = new T(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final T f43523g = new T(true);

    public static final Object a(Object obj) {
        InterfaceC2677c0 interfaceC2677c0;
        C2679d0 c2679d0 = obj instanceof C2679d0 ? (C2679d0) obj : null;
        return (c2679d0 == null || (interfaceC2677c0 = c2679d0.f43300a) == null) ? obj : interfaceC2677c0;
    }
}
