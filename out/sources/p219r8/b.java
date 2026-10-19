package p219r8;

import O.e;
import V8.m;
import V8.p;
import V8.q;
import V8.r;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.presentation.controlUnit.E;
import com.voltasit.obdeleven.ui.activity.v;
import java.util.List;
import p134k8.T1;
import p194p8.h;
import p194p8.j;

/* JADX INFO: compiled from: KWP2000OutputTest.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f46394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f46396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46398g;

    /* JADX INFO: compiled from: KWP2000OutputTest.java */
    public class a extends h {
        @Override // p194p8.h
        public final Task<List<T1>> g(ValueUnit valueUnit) {
            return null;
        }

        @Override // p194p8.h
        public final Task<List<T1>> h(String str, ValueUnit valueUnit) {
            return null;
        }
    }

    public b(ControlUnit controlUnit) {
        super(controlUnit);
        this.f46394c = new a(0, controlUnit);
    }

    @Override // p219r8.e
    public final Task<Void> a() {
        e.s(l(), "closeInternal()");
        return this.f46400a.f29335r.d(h()).continueWith(new m(7, this));
    }

    @Override // p219r8.e
    public final boolean b() {
        return this.f46395d;
    }

    @Override // p219r8.e
    public final Task<j> c() {
        e.s(l(), "measInternal()");
        return !this.f46397f ? Task.forError(new CommandException(-3)) : Task.forResult(this.f46394c);
    }

    @Override // p219r8.e
    public final String d() {
        return this.f46396e;
    }

    @Override // p219r8.e
    public final Task<Void> e() {
        e.s(l(), "nextInternal()");
        if (!this.f46397f) {
            return Task.forError(new CommandException(-3));
        }
        return this.f46400a.f29335r.d(i()).continueWith(new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.b(2)).onSuccessTask(new p(6, this));
    }

    @Override // p219r8.e
    public final Task<Void> f() {
        e.s(l(), "openInternal()");
        if (this.f46397f) {
            return Task.forResult(null);
        }
        String strJ = j();
        return this.f46400a.f29335r.d(strJ).continueWith(new v(this, 2, strJ)).onSuccessTask(new com.parse.b(9, this));
    }

    @Override // p219r8.e
    public final Task<Void> g() {
        e.s(l(), "readInternal()");
        return this.f46395d ? Task.forResult(null) : f().onSuccessTask(new E(5, this));
    }

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public final Task<Void> m() {
        e.j(l(), "identify() with request: ".concat(k()));
        return this.f46400a.f29335r.d(k()).continueWith(new q(6, this)).onSuccessTask(new r(5, this));
    }
}
