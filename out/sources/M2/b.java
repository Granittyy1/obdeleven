package M2;

import K2.InterfaceC0711d;
import K2.x;
import Q2.C0732i;
import Q2.C0738o;
import Q2.InterfaceC0733j;
import Q2.z;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.NetworkType;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: CommandHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0711d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f4519g = k.d("CommandHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4521c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4522d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F8.a f4523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final G6.a f4524f;

    public b(Context context, F8.a aVar, G6.a aVar2) {
        this.f4520b = context;
        this.f4523e = aVar;
        this.f4524f = aVar2;
    }

    public static C0738o c(Intent intent) {
        return new C0738o(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, C0738o c0738o) {
        intent.putExtra("KEY_WORKSPEC_ID", c0738o.f5025a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", c0738o.f5026b);
    }

    public final void a(int i10, g gVar, Intent intent) {
        List<x> listD;
        ArrayList arrayList;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            k kVarC = k.c();
            Objects.toString(intent);
            kVarC.getClass();
            c cVar = new c(this.f4520b, this.f4523e, i10, gVar);
            ArrayList<z> arrayListM = gVar.f4551f.f4146c.t().m();
            int i11 = ConstraintProxy.f20372a;
            Iterator it = arrayListM.iterator();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (it.hasNext()) {
                androidx.work.c cVar2 = ((z) it.next()).j;
                z10 |= cVar2.f20344d;
                z11 |= cVar2.f20342b;
                z12 |= cVar2.f20345e;
                z13 |= cVar2.f20341a != NetworkType.f20296b;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            int i12 = ConstraintProxyUpdateReceiver.f20373a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = cVar.f4525a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            ArrayList<z> arrayList2 = new ArrayList(arrayListM.size());
            cVar.f4526b.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (z zVar : arrayListM) {
                if (jCurrentTimeMillis >= zVar.a() && (!zVar.b() || cVar.f4528d.a(zVar))) {
                    arrayList2.add(zVar);
                }
            }
            for (z zVar2 : arrayList2) {
                String str = zVar2.f5036a;
                C0738o c0738oG = Lb.a.g(zVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, c0738oG);
                k.c().getClass();
                gVar.f4548c.b().execute(new g.b(cVar.f4527c, gVar, intent3));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            k kVarC2 = k.c();
            Objects.toString(intent);
            kVarC2.getClass();
            gVar.f4551f.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            k.c().a(f4519g, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            C0738o c0738oC = c(intent);
            k kVarC3 = k.c();
            c0738oC.toString();
            kVarC3.getClass();
            WorkDatabase workDatabase = gVar.f4551f.f4146c;
            workDatabase.c();
            try {
                z zVarT = workDatabase.t().t(c0738oC.f5025a);
                if (zVarT == null) {
                    k kVarC4 = k.c();
                    c0738oC.toString();
                    kVarC4.getClass();
                } else if (zVarT.f5037b.a()) {
                    k kVarC5 = k.c();
                    c0738oC.toString();
                    kVarC5.getClass();
                } else {
                    long jA = zVarT.a();
                    boolean zB = zVarT.b();
                    Context context2 = this.f4520b;
                    if (zB) {
                        k kVarC6 = k.c();
                        c0738oC.toString();
                        kVarC6.getClass();
                        a.b(context2, workDatabase, c0738oC, jA);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        gVar.f4548c.b().execute(new g.b(i10, gVar, intent4));
                    } else {
                        k kVarC7 = k.c();
                        c0738oC.toString();
                        kVarC7.getClass();
                        a.b(context2, workDatabase, c0738oC, jA);
                    }
                    workDatabase.m();
                }
                return;
            } finally {
                workDatabase.j();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f4522d) {
                try {
                    C0738o c0738oC2 = c(intent);
                    k kVarC8 = k.c();
                    c0738oC2.toString();
                    kVarC8.getClass();
                    if (this.f4521c.containsKey(c0738oC2)) {
                        k kVarC9 = k.c();
                        c0738oC2.toString();
                        kVarC9.getClass();
                    } else {
                        f fVar = new f(this.f4520b, i10, gVar, this.f4524f.e(c0738oC2));
                        this.f4521c.put(c0738oC2, fVar);
                        fVar.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                k kVarC10 = k.c();
                intent.toString();
                kVarC10.getClass();
                return;
            } else {
                C0738o c0738oC3 = c(intent);
                boolean z14 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                k kVarC11 = k.c();
                intent.toString();
                kVarC11.getClass();
                b(c0738oC3, z14);
                return;
            }
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        G6.a aVar = this.f4524f;
        if (zContainsKey) {
            int i13 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(1);
            x xVarC = aVar.c(new C0738o(string, i13));
            if (xVarC != null) {
                listD = arrayList;
                arrayList.add(xVarC);
                listD = arrayList;
            }
        } else {
            listD = aVar.d(string);
        }
        listD = arrayList;
        for (x xVar : listD) {
            k.c().getClass();
            gVar.f4555k.b(xVar);
            WorkDatabase workDatabase2 = gVar.f4551f.f4146c;
            C0738o c0738o = xVar.f4233a;
            int i14 = a.f4518a;
            InterfaceC0733j interfaceC0733jQ = workDatabase2.q();
            C0732i c0732iB = interfaceC0733jQ.b(c0738o);
            if (c0732iB != null) {
                a.a(this.f4520b, c0738o, c0732iB.f5020c);
                k kVarC12 = k.c();
                c0738o.toString();
                kVarC12.getClass();
                interfaceC0733jQ.d(c0738o);
            }
            gVar.b(xVar.f4233a, false);
        }
    }

    @Override // K2.InterfaceC0711d
    public final void b(C0738o c0738o, boolean z10) {
        synchronized (this.f4522d) {
            try {
                f fVar = (f) this.f4521c.remove(c0738o);
                this.f4524f.c(c0738o);
                if (fVar != null) {
                    fVar.g(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
