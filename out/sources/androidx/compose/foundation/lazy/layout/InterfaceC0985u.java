package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyLayoutItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0985u {
    int b();

    default Object c(int i10) {
        return new C0969d(i10);
    }

    default int e(Object obj) {
        return -1;
    }

    default Object f(int i10) {
        return null;
    }

    void i(int i10, InterfaceC1084f interfaceC1084f, Object obj);
}
