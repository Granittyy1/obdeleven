package m8;

import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.List;
import java.util.Locale;
import p134k8.T1;

/* JADX INFO: compiled from: KWP2000BasicSettings.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f44630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44631h;

    /* JADX INFO: compiled from: KWP2000BasicSettings.java */
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

    /* JADX INFO: compiled from: KWP2000BasicSettings.java */
    public class b implements Continuation<Void, Task<Integer>> {
        public b() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Integer> then(Task<Void> task) throws Exception {
            k kVar = k.this;
            ControlUnit controlUnit = kVar.f44617b;
            return controlUnit.f29335r.d(String.format(Locale.US, "31BA00%02X", Integer.valueOf(kVar.f44616a))).continueWith(new n(this));
        }
    }

    /* JADX INFO: compiled from: KWP2000BasicSettings.java */
    public class c implements Continuation<String, Void> {
        @Override // com.parse.boltsinternal.Continuation
        public final Void then(Task<String> task) throws Exception {
            String result = task.getResult();
            if (result.contains("71B9")) {
                return null;
            }
            if (result.startsWith("7F31")) {
                throw new CommandException(Integer.parseInt(result.substring(4, 6), 16));
            }
            throw new CommandException(-1);
        }
    }

    /* JADX INFO: compiled from: KWP2000BasicSettings.java */
    public class d implements Continuation<String, Void> {
        public d() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Void then(Task<String> task) throws Exception {
            String result = task.getResult();
            if (result.contains("72")) {
                k.this.f44631h = false;
                return null;
            }
            if (result.startsWith("7F32")) {
                throw new CommandException(Integer.parseInt(result.substring(4, 6), 16));
            }
            throw new CommandException(-1);
        }
    }

    public k(int i10, ControlUnit controlUnit) {
        super(i10, controlUnit);
        this.f44630g = new a(i10, controlUnit);
    }

    @Override // m8.g
    public final Task<Void> a() {
        if (!this.f44631h) {
            return Task.forError(new CommandException(-3));
        }
        return this.f44617b.f29335r.d(String.format(Locale.US, "31B900%02X", Integer.valueOf(this.f44616a))).continueWith(new c());
    }

    @Override // m8.g
    public final Task<Void> b() {
        return this.f44617b.f29335r.d(String.format(Locale.US, "32B800%02X", Integer.valueOf(this.f44616a))).continueWith(new d());
    }

    @Override // m8.g
    public final Task<p194p8.j> c() {
        return !this.f44631h ? Task.forError(new CommandException(-3)) : Task.forResult(this.f44630g);
    }

    @Override // m8.g
    public final Task<Integer> d() {
        Task taskForResult;
        Task taskContinueWith;
        if (this.f44631h) {
            taskContinueWith = Task.forResult(null);
        } else {
            if (this.f44618c == null) {
                ControlUnitLabelDB.Type type = ControlUnitLabelDB.Type.f34412e;
                taskForResult = p121j8.c.a(this.f44616a, this.f44617b, type).continueWith(new f(this));
            } else {
                taskForResult = Task.forResult(null);
            }
            taskContinueWith = taskForResult.continueWithTask(new m(this)).continueWith(new l(this));
        }
        return taskContinueWith.onSuccessTask(new b());
    }
}
