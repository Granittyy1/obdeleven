package m8;

import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p134k8.T1;

/* JADX INFO: compiled from: KWP1281BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f44622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f44624i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f44625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f44626l;

    /* JADX INFO: compiled from: KWP1281BasicSettings.java */
    public class a extends p194p8.h {
        @Override // p194p8.h
        public final Task<List<T1>> g(ValueUnit valueUnit) {
            return Task.forResult(a(valueUnit));
        }

        @Override // p194p8.h
        public final Task<List<T1>> h(String str, ValueUnit valueUnit) {
            return null;
        }
    }

    /* JADX INFO: compiled from: KWP1281BasicSettings.java */
    public class b implements Continuation<Void, Task<Integer>> {
        public b() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Integer> then(Task<Void> task) throws Exception {
            h hVar = h.this;
            int i10 = hVar.f44616a;
            ControlUnit controlUnit = hVar.f44617b;
            if (i10 == 0) {
                return controlUnit.f29335r.d("11").continueWith(new i(this));
            }
            return controlUnit.f29335r.d(String.format(Locale.US, "28%02X", Integer.valueOf(i10))).continueWithTask(new j(this));
        }
    }

    public h(int i10, ControlUnit controlUnit) {
        super(i10, controlUnit);
        this.f44625k = new ArrayList();
        this.f44626l = new ArrayList();
        this.f44622g = new a(i10, controlUnit);
    }

    @Override // m8.g
    public final Task<Void> a() {
        return Task.forResult(null);
    }

    @Override // m8.g
    public final Task<Void> b() {
        return Task.forResult(null);
    }

    @Override // m8.g
    public final Task<p194p8.j> c() {
        return Task.forResult(this.f44622g);
    }

    @Override // m8.g
    public final Task<Integer> d() {
        Task taskForResult;
        if (this.f44618c == null) {
            ControlUnitLabelDB.Type type = ControlUnitLabelDB.Type.f34412e;
            taskForResult = p121j8.c.a(this.f44616a, this.f44617b, type).continueWith(new f(this));
        } else {
            taskForResult = Task.forResult(null);
        }
        return taskForResult.continueWithTask(new b());
    }
}
