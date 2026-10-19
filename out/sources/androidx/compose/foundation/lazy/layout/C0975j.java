package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.InterfaceC1160f;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0975j implements InterfaceC1160f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutBeyondBoundsModifierNode f10723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<C0973h.a> f10724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10725c;

    public C0975j(LazyLayoutBeyondBoundsModifierNode lazyLayoutBeyondBoundsModifierNode, Ref$ObjectRef<C0973h.a> ref$ObjectRef, int i10) {
        this.f10723a = lazyLayoutBeyondBoundsModifierNode;
        this.f10724b = ref$ObjectRef;
        this.f10725c = i10;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1160f.a
    public final boolean a() {
        return this.f10723a.Q1(this.f10724b.element, this.f10725c);
    }
}
