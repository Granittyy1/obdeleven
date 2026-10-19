package M2;

import android.content.Context;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.k;

/* JADX INFO: compiled from: ConstraintsCommandHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F8.a f4526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkConstraintsTracker f4528d;

    static {
        k.d("ConstraintsCmdHandler");
    }

    public c(Context context, F8.a aVar, int i10, g gVar) {
        this.f4525a = context;
        this.f4526b = aVar;
        this.f4527c = i10;
        this.f4528d = new WorkConstraintsTracker(gVar.f4551f.j);
    }
}
