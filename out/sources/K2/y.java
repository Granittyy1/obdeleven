package K2;

import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: WorkContinuationImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class y extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K f4234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExistingWorkPolicy f4235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<? extends androidx.work.p> f4236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f4237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f4238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0722o f4240i;

    static {
        androidx.work.k.d("WorkContinuationImpl");
    }

    public y() {
        throw null;
    }

    public y(K k10, List<? extends androidx.work.p> list) {
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.f20292b;
        this.f4234c = k10;
        this.f4235d = existingWorkPolicy;
        this.f4236e = list;
        this.f4237f = new ArrayList(list.size());
        this.f4238g = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String string = list.get(i10).f20466a.toString();
            kotlin.jvm.internal.i.d(string, "id.toString()");
            this.f4237f.add(string);
            this.f4238g.add(string);
        }
    }

    public static HashSet i0(y yVar) {
        HashSet hashSet = new HashSet();
        yVar.getClass();
        return hashSet;
    }
}
