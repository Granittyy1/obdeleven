package m8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;

/* JADX INFO: compiled from: BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControlUnit f44617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p121j8.c f44618c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44620e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f44621f = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Task<Void> f44619d = Task.forResult(null);

    public g(int i10, ControlUnit controlUnit) {
        this.f44616a = i10;
        this.f44617b = controlUnit;
    }

    public abstract Task<Void> a();

    public abstract Task<Void> b();

    public abstract Task<p194p8.j> c();

    public abstract Task<Integer> d();
}
