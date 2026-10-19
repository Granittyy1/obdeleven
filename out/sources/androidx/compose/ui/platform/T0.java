package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class T0 implements kotlin.sequences.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable f14965b;

    public T0(Iterable iterable) {
        this.f14964a = 1;
        this.f14965b = iterable;
    }

    public void b(Object obj, String str) {
        ((ArrayList) this.f14965b).add(new S0(str, obj));
    }

    @Override // kotlin.sequences.g
    public final Iterator iterator() {
        switch (this.f14964a) {
            case 0:
                return ((ArrayList) this.f14965b).iterator();
            default:
                return this.f14965b.iterator();
        }
    }

    public T0() {
        this.f14964a = 0;
        this.f14965b = new ArrayList();
    }
}
