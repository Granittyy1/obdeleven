package Q2;

import androidx.work.impl.WorkDatabase_Impl;

/* JADX INFO: renamed from: Q2.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WorkProgressDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0747y implements InterfaceC0743u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f5032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0744v f5033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0745w f5034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0746x f5035d;

    public C0747y(WorkDatabase_Impl workDatabase_Impl) {
        this.f5032a = workDatabase_Impl;
        this.f5033b = new C0744v(workDatabase_Impl);
        this.f5034c = new C0745w(workDatabase_Impl);
        this.f5035d = new C0746x(workDatabase_Impl);
    }

    @Override // Q2.InterfaceC0743u
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f5032a;
        workDatabase_Impl.b();
        C0745w c0745w = this.f5034c;
        p285x2.f fVarA = c0745w.a();
        if (str == null) {
            fVarA.p0(1);
        } else {
            fVarA.r(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            c0745w.d(fVarA);
        }
    }

    @Override // Q2.InterfaceC0743u
    public final void b(C0742t c0742t) {
        WorkDatabase_Impl workDatabase_Impl = this.f5032a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f5033b.f(c0742t);
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
        }
    }

    @Override // Q2.InterfaceC0743u
    public final void c() {
        WorkDatabase_Impl workDatabase_Impl = this.f5032a;
        workDatabase_Impl.b();
        C0746x c0746x = this.f5035d;
        p285x2.f fVarA = c0746x.a();
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            c0746x.d(fVarA);
        }
    }
}
