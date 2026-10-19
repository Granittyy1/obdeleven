package W6;

import android.app.Application;

/* JADX INFO: compiled from: BindingWrapperFactory_Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements p268va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7006b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f7005a = i10;
        this.f7006b = obj;
    }

    @Override // p268va.a
    public final Object get() {
        switch (this.f7005a) {
            case 0:
                return new a((Application) ((p268va.a) this.f7006b).get());
            default:
                j jVar = ((Y6.e) this.f7006b).f7626b.get();
                if (jVar != null) {
                    return jVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }
}
