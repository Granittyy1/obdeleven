package p014b1;

import D2.V;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import p241t7.b;

/* JADX INFO: compiled from: ViewModelProviderImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f20503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0.c f20504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f20506d;

    public f(b0 store, a0.c factory, a defaultExtras) {
        i.e(store, "store");
        i.e(factory, "factory");
        i.e(defaultExtras, "defaultExtras");
        this.f20503a = store;
        this.f20504b = factory;
        this.f20505c = defaultExtras;
        this.f20506d = new V();
    }

    public final Y a(c cVar, String key) {
        Y viewModel;
        Y yCreate;
        i.e(key, "key");
        synchronized (this.f20506d) {
            try {
                b0 b0Var = this.f20503a;
                b0Var.getClass();
                viewModel = (Y) b0Var.f17808a.get(key);
                if (cVar.f(viewModel)) {
                    Object obj = this.f20504b;
                    if (obj instanceof a0.e) {
                        i.b(viewModel);
                        ((a0.e) obj).a(viewModel);
                    }
                    i.c(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    d dVar = new d(this.f20505c);
                    dVar.f20497a.put(a0.f17795b, key);
                    a0.c factory = this.f20504b;
                    i.e(factory, "factory");
                    try {
                        try {
                            yCreate = factory.create(cVar, dVar);
                        } catch (AbstractMethodError unused) {
                            yCreate = factory.create((Class<Y>) b.r(cVar), dVar);
                        }
                    } catch (AbstractMethodError unused2) {
                        yCreate = factory.create(b.r(cVar));
                    }
                    viewModel = yCreate;
                    b0 b0Var2 = this.f20503a;
                    b0Var2.getClass();
                    i.e(viewModel, "viewModel");
                    Y y10 = (Y) b0Var2.f17808a.put(key, viewModel);
                    if (y10 != null) {
                        y10.clear$lifecycle_viewmodel_release();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return viewModel;
    }
}
