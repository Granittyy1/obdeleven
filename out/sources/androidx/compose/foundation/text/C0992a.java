package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

/* JADX INFO: renamed from: androidx.compose.foundation.text.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0992a implements androidx.compose.runtime.A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f11247a;

    public C0992a(TextFieldSelectionManager textFieldSelectionManager) {
        this.f11247a = textFieldSelectionManager;
    }

    @Override // androidx.compose.runtime.A
    public final void dispose() {
        this.f11247a.m();
    }
}
