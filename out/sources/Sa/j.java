package Sa;

import com.voltasit.obdeleven.domain.usecases.device.u;
import kotlinx.coroutines.AbstractC2712w;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends AbstractC2712w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f5721c = new j();

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void Z0(kotlin.coroutines.e eVar, Runnable runnable) {
        b bVar = b.f5706d;
        bVar.f5708c.c(runnable, i.f5720h, false);
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void a1(kotlin.coroutines.e eVar, Runnable runnable) {
        b bVar = b.f5706d;
        bVar.f5708c.c(runnable, i.f5720h, true);
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final AbstractC2712w c1(int i10) {
        u.g(i10);
        return i10 >= i.f5716d ? this : super.c1(i10);
    }
}
