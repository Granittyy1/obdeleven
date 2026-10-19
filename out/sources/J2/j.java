package J2;

import io.grpc.internal.InterfaceC2223h0;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: WebViewProviderFactoryAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i, InterfaceC2223h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3967a;

    @Override // io.grpc.internal.InterfaceC2223h0
    public void a() {
        ((AtomicLong) this.f3967a).getAndAdd(1L);
    }

    @Override // J2.i
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f3967a).getSupportedFeatures();
    }

    @Override // J2.i
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) Bb.a.a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f3967a).getWebkitToCompatConverter());
    }
}
