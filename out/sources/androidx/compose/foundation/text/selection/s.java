package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: SelectionLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f11622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f11623c;

    public s(boolean z10, i iVar, h hVar) {
        this.f11621a = z10;
        this.f11622b = iVar;
        this.f11623c = hVar;
    }

    @Override // androidx.compose.foundation.text.selection.o
    public final boolean a() {
        return this.f11621a;
    }

    @Override // androidx.compose.foundation.text.selection.o
    public final CrossStatus b() {
        h hVar = this.f11623c;
        int i10 = hVar.f11598a;
        int i11 = hVar.f11599b;
        if (i10 < i11) {
            return CrossStatus.f11531c;
        }
        return i10 > i11 ? CrossStatus.f11530b : CrossStatus.f11532d;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f11621a + ", crossed=" + b() + ", info=\n\t" + this.f11623c + ')';
    }
}
