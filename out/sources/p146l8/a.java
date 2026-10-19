package p146l8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import p121j8.c;
import p194p8.j;

/* JADX INFO: compiled from: Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControlUnit f44413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Task<Void> f44414c = Task.forResult(null);

    public a(int i10, ControlUnit controlUnit) {
        this.f44412a = i10;
        this.f44413b = controlUnit;
    }

    public abstract Task<Void> a();

    public abstract c b();

    public abstract String c();

    public abstract String d();

    public abstract Task<j> e();

    public abstract Task<String> f(boolean z10);

    public abstract Task<Void> g(String str);

    public abstract Task<Void> h(String str);
}
