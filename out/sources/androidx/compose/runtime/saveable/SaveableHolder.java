package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C1108r0;
import androidx.compose.runtime.Q0;
import androidx.compose.runtime.Z;
import androidx.compose.runtime.snapshots.k;
import androidx.compose.runtime.t0;

/* JADX INFO: compiled from: RememberSaveable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SaveableHolder<T> implements j, t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i<T, Object> f13117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f13118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f13120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f13121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.a f13122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Ia.a<Object> f13123h = new SaveableHolder$valueProvider$1(this);

    public SaveableHolder(i<T, Object> iVar, f fVar, String str, T t8, Object[] objArr) {
        this.f13117b = iVar;
        this.f13118c = fVar;
        this.f13119d = str;
        this.f13120e = t8;
        this.f13121f = objArr;
    }

    @Override // androidx.compose.runtime.saveable.j
    public final boolean a(Object obj) {
        f fVar = this.f13118c;
        return fVar == null || fVar.a(obj);
    }

    @Override // androidx.compose.runtime.t0
    public final void b() {
        f.a aVar = this.f13122g;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.compose.runtime.t0
    public final void c() {
        f.a aVar = this.f13122g;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.compose.runtime.t0
    public final void d() {
        e();
    }

    public final void e() {
        String strA;
        f fVar = this.f13118c;
        if (this.f13122g != null) {
            throw new IllegalArgumentException(("entry(" + this.f13122g + ") is not null").toString());
        }
        if (fVar != null) {
            Ia.a<Object> aVar = this.f13123h;
            Object objInvoke = ((SaveableHolder$valueProvider$1) aVar).invoke();
            if (objInvoke == null || fVar.a(objInvoke)) {
                this.f13122g = fVar.e(aVar, this.f13119d);
                return;
            }
            if (objInvoke instanceof k) {
                k kVar = (k) objInvoke;
                if (kVar.a() == Z.f12934a || kVar.a() == Q0.f12888a || kVar.a() == C1108r0.f13116a) {
                    strA = "MutableState containing " + kVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = b.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }
}
