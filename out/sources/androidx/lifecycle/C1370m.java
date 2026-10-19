package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LegacySavedStateHandleController.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1370m {

    /* JADX INFO: renamed from: androidx.lifecycle.m$a */
    /* JADX INFO: compiled from: LegacySavedStateHandleController.android.kt */
    public static final class a implements u2.c.a {
        @Override // u2.c.a
        public final void a(p248u2.e owner) {
            kotlin.jvm.internal.i.e(owner, "owner");
            if (!(owner instanceof c0)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            b0 viewModelStore = ((c0) owner).getViewModelStore();
            p248u2.c savedStateRegistry = owner.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.f17808a;
            for (String key : new HashSet(linkedHashMap.keySet())) {
                kotlin.jvm.internal.i.e(key, "key");
                Y y10 = (Y) linkedHashMap.get(key);
                if (y10 != null) {
                    C1370m.a(y10, savedStateRegistry, owner.getLifecycle());
                }
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    public static final void a(Y y10, p248u2.c registry, Lifecycle lifecycle) {
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        M m7 = (M) y10.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (m7 == null || m7.f17759d) {
            return;
        }
        m7.j(lifecycle, registry);
        Lifecycle.State stateB = lifecycle.b();
        if (stateB == Lifecycle.State.f17750c || stateB.compareTo(Lifecycle.State.f17752e) >= 0) {
            registry.d();
        } else {
            lifecycle.a(new C1371n(lifecycle, registry));
        }
    }
}
