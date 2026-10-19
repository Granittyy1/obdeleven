package androidx.compose.material;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DrawerState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnchoredDraggableState<DrawerValue> f11733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p013b0.c f11734b;

    public DrawerState(DrawerValue drawerValue, Ia.l<? super DrawerValue, Boolean> lVar) {
        this.f11733a = new AnchoredDraggableState<>(drawerValue, new Ia.l<Float, Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$1
            {
                super(1);
            }

            @Override // Ia.l
            public final Float invoke(Float f10) {
                f10.floatValue();
                return Float.valueOf(DrawerState.a(this.this$0).T0(DrawerKt.f11729b));
            }
        }, new Ia.a<Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Float invoke() {
                return Float.valueOf(DrawerState.a(this.this$0).T0(DrawerKt.f11730c));
            }
        }, DrawerKt.f11731d, lVar);
    }

    public static final p013b0.c a(DrawerState drawerState) {
        p013b0.c cVar = drawerState.f11734b;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + drawerState + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }
}
