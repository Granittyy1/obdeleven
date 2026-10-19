package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0949i implements InterfaceC0948h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0949i f10304a = new C0949i();

    @Override // androidx.compose.foundation.layout.InterfaceC0948h
    public final androidx.compose.ui.h f(androidx.compose.ui.h hVar, androidx.compose.ui.f fVar) {
        return hVar.i(new BoxChildDataElement(fVar, false, InspectableValueKt.f14929a));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0948h
    public final androidx.compose.ui.h j() {
        return new BoxChildDataElement(androidx.compose.ui.d.a.f13339e, true, InspectableValueKt.f14929a);
    }
}
