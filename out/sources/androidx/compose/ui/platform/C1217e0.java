package androidx.compose.ui.platform;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.platform.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1217e0 implements androidx.compose.runtime.saveable.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.a<p293xa.r> f15040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.saveable.h f15041b;

    public C1217e0(androidx.compose.runtime.saveable.h hVar, Ia.a aVar) {
        this.f15040a = aVar;
        this.f15041b = hVar;
    }

    @Override // androidx.compose.runtime.saveable.f
    public final boolean a(Object obj) {
        return this.f15041b.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.f
    public final Map<String, List<Object>> b() {
        return this.f15041b.b();
    }

    @Override // androidx.compose.runtime.saveable.f
    public final Object c(String str) {
        return this.f15041b.c(str);
    }

    @Override // androidx.compose.runtime.saveable.f
    public final androidx.compose.runtime.saveable.f.a e(Ia.a aVar, String str) {
        return this.f15041b.e(aVar, str);
    }
}
