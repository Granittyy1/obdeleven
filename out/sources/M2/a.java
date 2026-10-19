package M2;

import Q2.C0732i;
import Q2.C0738o;
import Q2.InterfaceC0733j;
import R2.m;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.k;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Alarms.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4518a = 0;

    /* JADX INFO: renamed from: M2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Alarms.java */
    public static class C0066a {
        public static void a(AlarmManager alarmManager, int i10, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j, pendingIntent);
        }
    }

    static {
        k.d("Alarms");
    }

    public static void a(Context context, C0738o c0738o, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = b.f4519g;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        b.d(intent, c0738o);
        PendingIntent service = PendingIntent.getService(context, i10, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        k kVarC = k.c();
        c0738o.toString();
        kVarC.getClass();
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, C0738o c0738o, long j) {
        InterfaceC0733j interfaceC0733jQ = workDatabase.q();
        C0732i c0732iB = interfaceC0733jQ.b(c0738o);
        if (c0732iB != null) {
            int i10 = c0732iB.f5020c;
            a(context, c0738o, i10);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = b.f4519g;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            b.d(intent, c0738o);
            PendingIntent service = PendingIntent.getService(context, i10, intent, 201326592);
            if (alarmManager != null) {
                C0066a.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        Object objL = workDatabase.l(new R2.k(0, new m(workDatabase)));
        i.d(objL, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objL).intValue();
        interfaceC0733jQ.f(new C0732i(c0738o.f5025a, c0738o.f5026b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = b.f4519g;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        b.d(intent2, c0738o);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            C0066a.a(alarmManager2, 0, j, service2);
        }
    }
}
