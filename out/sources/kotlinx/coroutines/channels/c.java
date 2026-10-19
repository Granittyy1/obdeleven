package kotlinx.coroutines.channels;

import kotlinx.coroutines.InterfaceC2691h;
import p114j1.C2479a;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i<Object> f43269a = new i<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f43270b = C2479a.p("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f43271c = C2479a.p("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D3.l f43272d = new D3.l(4, "BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D3.l f43273e = new D3.l(4, "SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D3.l f43274f = new D3.l(4, "S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final D3.l f43275g = new D3.l(4, "RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D3.l f43276h = new D3.l(4, "POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D3.l f43277i = new D3.l(4, "DONE_RCV");
    public static final D3.l j = new D3.l(4, "INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final D3.l f43278k = new D3.l(4, "INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final D3.l f43279l = new D3.l(4, "CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final D3.l f43280m = new D3.l(4, "SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final D3.l f43281n = new D3.l(4, "SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final D3.l f43282o = new D3.l(4, "FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final D3.l f43283p = new D3.l(4, "NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final D3.l f43284q = new D3.l(4, "CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final D3.l f43285r = new D3.l(4, "CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final D3.l f43286s = new D3.l(4, "NO_CLOSE_CAUSE");

    public static final <T> boolean a(InterfaceC2691h<? super T> interfaceC2691h, T t8, Ia.l<? super Throwable, p293xa.r> lVar) {
        D3.l lVarR = interfaceC2691h.r(t8, lVar);
        if (lVarR == null) {
            return false;
        }
        interfaceC2691h.w(lVarR);
        return true;
    }
}
