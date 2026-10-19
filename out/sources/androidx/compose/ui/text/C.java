package androidx.compose.ui.text;

/* JADX INFO: compiled from: TextLinkStyles.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f15306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f15307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f15308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f15309d;

    public C() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return kotlin.jvm.internal.i.a(this.f15306a, c10.f15306a) && kotlin.jvm.internal.i.a(this.f15307b, c10.f15307b) && kotlin.jvm.internal.i.a(this.f15308c, c10.f15308c) && kotlin.jvm.internal.i.a(this.f15309d, c10.f15309d);
    }

    public final int hashCode() {
        v vVar = this.f15306a;
        int iHashCode = (vVar != null ? vVar.hashCode() : 0) * 31;
        v vVar2 = this.f15307b;
        int iHashCode2 = (iHashCode + (vVar2 != null ? vVar2.hashCode() : 0)) * 31;
        v vVar3 = this.f15308c;
        int iHashCode3 = (iHashCode2 + (vVar3 != null ? vVar3.hashCode() : 0)) * 31;
        v vVar4 = this.f15309d;
        return iHashCode3 + (vVar4 != null ? vVar4.hashCode() : 0);
    }

    public C(v vVar, v vVar2, v vVar3, v vVar4) {
        this.f15306a = vVar;
        this.f15307b = vVar2;
        this.f15308c = vVar3;
        this.f15309d = vVar4;
    }

    public /* synthetic */ C(v vVar, int i10) {
        this((i10 & 1) != 0 ? null : vVar, null, null, null);
    }
}
