package p219r8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import p194p8.j;

/* JADX INFO: compiled from: OutputTest.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControlUnit f46400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Task<Void> f46401b = Task.forResult(null);

    public e(ControlUnit controlUnit) {
        this.f46400a = controlUnit;
    }

    public abstract Task<Void> a();

    public abstract boolean b();

    public abstract Task<j> c();

    public abstract String d();

    public abstract Task<Void> e();

    public abstract Task<Void> f();

    public abstract Task<Void> g();
}
