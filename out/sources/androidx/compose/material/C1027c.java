package androidx.compose.material;

/* JADX INFO: renamed from: androidx.compose.material.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1027c implements InterfaceC1025a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnchoredDraggableState<Object> f11878a;

    public C1027c(AnchoredDraggableState<Object> anchoredDraggableState) {
        this.f11878a = anchoredDraggableState;
    }

    @Override // androidx.compose.material.InterfaceC1025a
    public final void a(float f10, float f11) {
        AnchoredDraggableState<Object> anchoredDraggableState = this.f11878a;
        anchoredDraggableState.j.f(f10);
        anchoredDraggableState.f11677k.f(f11);
    }
}
