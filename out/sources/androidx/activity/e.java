package androidx.activity;

import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8228c;

    public /* synthetic */ e(int i10, Object obj) {
        this.f8227b = i10;
        this.f8228c = obj;
    }

    @Override // androidx.lifecycle.r
    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
        switch (this.f8227b) {
            case 0:
                ComponentActivity._init_$lambda$2((ComponentActivity) this.f8228c, interfaceC1376t, event);
                break;
            default:
                Ia.p onEvent = (Ia.p) this.f8228c;
                kotlin.jvm.internal.i.e(onEvent, "$onEvent");
                onEvent.invoke(interfaceC1376t, event);
                break;
        }
    }
}
