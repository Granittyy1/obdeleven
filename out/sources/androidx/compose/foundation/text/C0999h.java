package androidx.compose.foundation.text;

import androidx.compose.ui.platform.M0;

/* JADX INFO: renamed from: androidx.compose.foundation.text.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: KeyboardActionRunner.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0999h implements InterfaceC1000i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M0 f11252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f11253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.compose.ui.focus.n f11254c;

    public C0999h(M0 m7) {
        this.f11252a = m7;
    }

    public final j a() {
        j jVar = this.f11253b;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.i.m("keyboardActions");
        throw null;
    }
}
