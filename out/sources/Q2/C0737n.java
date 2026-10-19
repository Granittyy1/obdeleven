package Q2;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* JADX INFO: renamed from: Q2.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SystemIdInfoDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0737n implements InterfaceC0733j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f5021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0734k f5022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0735l f5023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0736m f5024d;

    public C0737n(WorkDatabase_Impl workDatabase_Impl) {
        this.f5021a = workDatabase_Impl;
        this.f5022b = new C0734k(workDatabase_Impl);
        this.f5023c = new C0735l(workDatabase_Impl);
        this.f5024d = new C0736m(workDatabase_Impl);
    }

    @Override // Q2.InterfaceC0733j
    public final ArrayList a() {
        androidx.room.k kVarH = androidx.room.k.h(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = this.f5021a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(cursorK.isNull(0) ? null : cursorK.getString(0));
            }
            return arrayList;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    @Override // Q2.InterfaceC0733j
    public final C0732i b(C0738o c0738o) {
        return c(c0738o.f5026b, c0738o.f5025a);
    }

    @Override // Q2.InterfaceC0733j
    public final C0732i c(int i10, String str) {
        androidx.room.k kVarH = androidx.room.k.h(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (str == null) {
            kVarH.p0(1);
        } else {
            kVarH.r(1, str);
        }
        kVarH.O(2, i10);
        WorkDatabase_Impl workDatabase_Impl = this.f5021a;
        workDatabase_Impl.b();
        C0732i c0732i = null;
        String string = null;
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            int i11 = kotlin.jvm.internal.n.i(cursorK, "work_spec_id");
            int i12 = kotlin.jvm.internal.n.i(cursorK, "generation");
            int i13 = kotlin.jvm.internal.n.i(cursorK, "system_id");
            if (cursorK.moveToFirst()) {
                if (!cursorK.isNull(i11)) {
                    string = cursorK.getString(i11);
                }
                c0732i = new C0732i(string, cursorK.getInt(i12), cursorK.getInt(i13));
            }
            return c0732i;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    @Override // Q2.InterfaceC0733j
    public final void d(C0738o c0738o) {
        e(c0738o.f5026b, c0738o.f5025a);
    }

    @Override // Q2.InterfaceC0733j
    public final void e(int i10, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f5021a;
        workDatabase_Impl.b();
        C0735l c0735l = this.f5023c;
        p285x2.f fVarA = c0735l.a();
        if (str == null) {
            fVarA.p0(1);
        } else {
            fVarA.r(1, str);
        }
        fVarA.O(2, i10);
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            c0735l.d(fVarA);
        }
    }

    @Override // Q2.InterfaceC0733j
    public final void f(C0732i c0732i) {
        WorkDatabase_Impl workDatabase_Impl = this.f5021a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.f5022b.f(c0732i);
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
        }
    }

    @Override // Q2.InterfaceC0733j
    public final void g(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f5021a;
        workDatabase_Impl.b();
        C0736m c0736m = this.f5024d;
        p285x2.f fVarA = c0736m.a();
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
            c0736m.d(fVarA);
        }
    }
}
