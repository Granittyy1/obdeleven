package androidx.work.impl;

import Ia.t;
import K2.J;
import K2.r;
import K2.w;
import L2.c;
import N2.e;
import O2.n;
import R2.q;
import S2.b;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.k;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: WorkManagerImplExt.kt */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends FunctionReferenceImpl implements t<Context, androidx.work.a, b, WorkDatabase, n, r, List<? extends K2.t>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 f20371b = new WorkManagerImplExtKt$WorkManagerImpl$1();

    public WorkManagerImplExtKt$WorkManagerImpl$1() {
        super(6, a.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // Ia.t
    public final List<? extends K2.t> i(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, n nVar, r rVar) {
        Context p10 = context;
        androidx.work.a p11 = aVar;
        b p12 = bVar;
        WorkDatabase p13 = workDatabase;
        r rVar2 = rVar;
        i.e(p10, "p0");
        i.e(p11, "p1");
        i.e(p12, "p2");
        i.e(p13, "p3");
        int i10 = w.f4232a;
        e eVar = new e(p10, p13, p11);
        q.a(p10, SystemJobService.class, true);
        k.c().getClass();
        return l.s(eVar, new c(p10, p11, nVar, rVar2, new J(rVar2, p12), p12));
    }
}
