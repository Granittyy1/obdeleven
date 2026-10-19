package coil.decode;

import D2.V;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;
import p318zb.C;
import p318zb.InterfaceC2841h;

/* JADX INFO: compiled from: ImageSource.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x.a f22843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2841h f22845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ia.a<? extends File> f22846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p318zb.z f22847f;

    public A(InterfaceC2841h interfaceC2841h, Ia.a<? extends File> aVar, x.a aVar2) {
        this.f22843b = aVar2;
        this.f22845d = interfaceC2841h;
        this.f22846e = aVar;
    }

    @Override // coil.decode.x
    public final synchronized p318zb.z b() {
        Throwable th;
        if (this.f22844c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        p318zb.z zVar = this.f22847f;
        if (zVar != null) {
            return zVar;
        }
        Ia.a<? extends File> aVar = this.f22846e;
        kotlin.jvm.internal.i.b(aVar);
        File fileInvoke = aVar.invoke();
        if (!fileInvoke.isDirectory()) {
            throw new IllegalStateException("cacheDirectory must be a directory.");
        }
        String str = p318zb.z.f49122c;
        p318zb.z zVarB = zb.z.a.b(File.createTempFile("tmp", null, fileInvoke));
        p318zb.B bA = p318zb.v.a(p318zb.l.f49101a.h(zVarB));
        try {
            InterfaceC2841h interfaceC2841h = this.f22845d;
            kotlin.jvm.internal.i.b(interfaceC2841h);
            bA.k0(interfaceC2841h);
            try {
                bA.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                bA.close();
            } catch (Throwable th4) {
                V.e(th3, th4);
            }
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        this.f22845d = null;
        this.f22847f = zVarB;
        this.f22846e = null;
        return zVarB;
    }

    @Override // coil.decode.x
    public final synchronized p318zb.z c() {
        if (this.f22844c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        return this.f22847f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f22844c = true;
            InterfaceC2841h interfaceC2841h = this.f22845d;
            if (interfaceC2841h != null) {
                coil.util.k.a(interfaceC2841h);
            }
            p318zb.z zVar = this.f22847f;
            if (zVar != null) {
                p318zb.t tVar = p318zb.l.f49101a;
                tVar.getClass();
                tVar.a(zVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // coil.decode.x
    public final x.a h() {
        return this.f22843b;
    }

    @Override // coil.decode.x
    public final synchronized InterfaceC2841h i() {
        if (this.f22844c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        InterfaceC2841h interfaceC2841h = this.f22845d;
        if (interfaceC2841h != null) {
            return interfaceC2841h;
        }
        p318zb.t tVar = p318zb.l.f49101a;
        p318zb.z zVar = this.f22847f;
        kotlin.jvm.internal.i.b(zVar);
        C cB = p318zb.v.b(tVar.i(zVar));
        this.f22845d = cB;
        return cB;
    }
}
