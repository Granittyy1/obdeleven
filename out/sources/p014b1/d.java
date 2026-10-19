package p014b1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CreationExtras.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    public d(a initialExtras) {
        i.e(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f20497a;
        i.e(initialExtras2, "initialExtras");
        this.f20497a.putAll(initialExtras2);
    }

    @Override // p014b1.a
    public final <T> T a(a.b<T> bVar) {
        return (T) this.f20497a.get(bVar);
    }

    public /* synthetic */ d(Object obj) {
        this((a) a.C0207a.f20498b);
    }
}
