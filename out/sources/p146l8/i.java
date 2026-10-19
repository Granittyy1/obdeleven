package p146l8;

import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.List;
import p134k8.T1;
import p194p8.h;
import p194p8.j;

/* JADX INFO: compiled from: KWP2000Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends p146l8.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f44440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f44442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f44443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f44445i;
    public p121j8.c j;

    /* JADX INFO: compiled from: KWP2000Adaptation.java */
    public class a implements Continuation<String, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44446a;

        public a(String str) {
            this.f44446a = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Void then(Task<String> task) throws Exception {
            String result = task.getResult();
            if (result.startsWith("71")) {
                i.this.f44445i = this.f44446a;
                return null;
            }
            if (result.startsWith("7F31")) {
                throw new CommandException(Integer.parseInt(result.substring(4, 6), 16));
            }
            throw new CommandException(-1);
        }
    }

    /* JADX INFO: compiled from: KWP2000Adaptation.java */
    public class b extends h {
        public b(ControlUnit controlUnit, int i10) {
            super(i10, controlUnit);
        }

        @Override // p194p8.h
        public final Task<List<T1>> g(ValueUnit valueUnit) {
            return Task.forResult(a(valueUnit));
        }

        @Override // p194p8.h, p194p8.j
        public final int getChannel() {
            return i.this.f44412a;
        }

        @Override // p194p8.h
        public final Task<List<T1>> h(String str, ValueUnit valueUnit) {
            return null;
        }
    }

    /* JADX INFO: compiled from: KWP2000Adaptation.java */
    public class c implements Continuation<Void, Task<Void>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44449a;

        public c(String str) {
            this.f44449a = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Void> then(Task<Void> task) throws Exception {
            return i.this.o(this.f44449a);
        }
    }

    /* JADX INFO: compiled from: KWP2000Adaptation.java */
    public class d implements Continuation<Void, Task<Void>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44451a;

        public d(String str) {
            this.f44451a = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Void> then(Task<Void> task) throws Exception {
            i iVar = i.this;
            if (!iVar.f44441e) {
                return Task.forError(new CommandException(-3));
            }
            String str = iVar.f44445i;
            String str2 = this.f44451a;
            return ((str == null || !str.equals(str2)) ? iVar.o(str2).onSuccessTask(new j(iVar)) : Task.forResult(null)).onSuccessTask(new m(iVar, str2)).onSuccessTask(new k(iVar));
        }
    }

    /* JADX INFO: compiled from: KWP2000Adaptation.java */
    public class e implements Continuation<Void, Task<Void>> {
        public e() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Void> then(Task<Void> task) throws Exception {
            return i.i(i.this);
        }
    }

    /* JADX INFO: compiled from: KWP2000Adaptation.java */
    public class f implements Continuation<Void, Task<String>> {
        public f() {
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<String> then(Task<Void> task) throws Exception {
            i iVar = i.this;
            ControlUnit controlUnit = iVar.f44413b;
            return controlUnit.f29335r.d(String.format("31BA01%02X", Integer.valueOf(iVar.j()))).continueWith(new u(this));
        }
    }

    public i(int i10, ControlUnit controlUnit) {
        super(i10, controlUnit);
        this.f44440d = new b(controlUnit, i10);
        this.f44444h = false;
    }

    public static Task i(i iVar) {
        iVar.f44444h = false;
        return iVar.f44413b.f29335r.d(String.format("32B801%02X", Integer.valueOf(iVar.j()))).continueWith(new n(iVar));
    }

    @Override // p146l8.a
    public final Task<Void> a() {
        Task taskContinueWithTask = this.f44414c.continueWithTask(new e());
        this.f44414c = taskContinueWithTask;
        return taskContinueWithTask;
    }

    @Override // p146l8.a
    public final p121j8.c b() {
        return this.j;
    }

    @Override // p146l8.a
    public final String c() {
        return this.f44443g;
    }

    @Override // p146l8.a
    public final String d() {
        return this.f44442f;
    }

    @Override // p146l8.a
    public final Task<j> e() {
        return !this.f44441e ? Task.forError(new CommandException(-3)) : Task.forResult(this.f44440d);
    }

    @Override // p146l8.a
    public final Task<String> f(final boolean z10) {
        Task taskContinueWithTask = this.f44414c.continueWithTask(new Continuation() { // from class: l8.h
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                return this.f44438a.n(z10);
            }
        });
        this.f44414c = taskContinueWithTask.makeVoid();
        return taskContinueWithTask;
    }

    @Override // p146l8.a
    public final Task<Void> g(String str) {
        Task taskContinueWithTask = this.f44414c.continueWithTask(new c(str));
        this.f44414c = taskContinueWithTask.makeVoid();
        return taskContinueWithTask;
    }

    @Override // p146l8.a
    public final Task<Void> h(String str) {
        Task taskContinueWithTask = this.f44414c.continueWithTask(new d(str));
        this.f44414c = taskContinueWithTask.makeVoid();
        return taskContinueWithTask;
    }

    public abstract int j();

    public abstract byte[] k(String str);

    public abstract String l(String str);

    public abstract String m(String str);

    public final Task<String> n(boolean z10) {
        Task taskForResult;
        Task taskOnSuccessTask;
        if (this.f44441e) {
            taskOnSuccessTask = Task.forResult(null);
        } else {
            this.f44444h = false;
            if (this.j == null && z10) {
                ControlUnitLabelDB.Type type = ControlUnitLabelDB.Type.f34411d;
                taskForResult = p121j8.c.a(this.f44412a, this.f44413b, type).continueWith(new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.e(4, this));
            } else {
                taskForResult = Task.forResult(null);
            }
            taskOnSuccessTask = taskForResult.continueWithTask(new t(this)).continueWith(new s()).onSuccessTask(new r(this)).onSuccessTask(new p(this));
        }
        return taskOnSuccessTask.onSuccessTask(new f());
    }

    public final Task<Void> o(String str) {
        if (!this.f44441e) {
            return Task.forError(new CommandException(-3));
        }
        return this.f44413b.f29335r.d(String.format("31B901%02X%s", Integer.valueOf(j()), m(str))).continueWith(new a(str));
    }
}
