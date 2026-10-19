package Q2;

import android.database.Cursor;
import androidx.collection.C0873a;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Q2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DependencyDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0727d implements InterfaceC0725b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5015b;

    public C0727d() {
        this.f5014a = new AtomicReference();
        this.f5015b = new C0873a();
    }

    @Override // Q2.InterfaceC0725b
    public ArrayList a(String str) {
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            kVarH.p0(1);
        } else {
            kVarH.r(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5014a;
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

    @Override // Q2.InterfaceC0725b
    public void b(C0724a c0724a) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5014a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C0726c) this.f5015b).f(c0724a);
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
        }
    }

    @Override // Q2.InterfaceC0725b
    public boolean c(String str) {
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            kVarH.p0(1);
        } else {
            kVarH.r(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5014a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            boolean z10 = false;
            if (cursorK.moveToFirst()) {
                z10 = cursorK.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    @Override // Q2.InterfaceC0725b
    public boolean d(String str) {
        androidx.room.k kVarH = androidx.room.k.h(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            kVarH.p0(1);
        } else {
            kVarH.r(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5014a;
        workDatabase_Impl.b();
        Cursor cursorK = workDatabase_Impl.k(kVarH, null);
        try {
            boolean z10 = false;
            if (cursorK.moveToFirst()) {
                z10 = cursorK.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorK.close();
            kVarH.i();
        }
    }

    public C0727d(WorkDatabase_Impl workDatabase_Impl) {
        this.f5014a = workDatabase_Impl;
        this.f5015b = new C0726c(workDatabase_Impl);
    }
}
