package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatSpinner.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0867u extends G {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner.e f9022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f9023l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0867u(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, AppCompatSpinner.e eVar) {
        super(appCompatSpinner2);
        this.f9023l = appCompatSpinner;
        this.f9022k = eVar;
    }

    @Override // androidx.appcompat.widget.G
    public final p150m.f b() {
        return this.f9022k;
    }

    @Override // androidx.appcompat.widget.G
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.f9023l;
        if (appCompatSpinner.getInternalPopup().b()) {
            return true;
        }
        appCompatSpinner.f8643g.m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
