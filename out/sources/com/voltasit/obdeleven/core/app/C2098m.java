package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.exceptions.AppException;
import com.voltasit.obdeleven.domain.models.oca.CommandType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import org.json.JSONException;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppWorker.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2098m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I8.a f30116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f30117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f30118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.oca.a f30119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2108x f30120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J8.p f30121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<AbstractC2107w> f30122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AbstractC2107w f30124i;

    public C2098m(I8.a oca, ArrayList arrayList, ArrayList arrayList2, com.voltasit.obdeleven.domain.usecases.oca.a createOriginalAppValueUC, C2108x c2108x, J8.p logger) {
        kotlin.jvm.internal.i.e(oca, "oca");
        kotlin.jvm.internal.i.e(createOriginalAppValueUC, "createOriginalAppValueUC");
        kotlin.jvm.internal.i.e(logger, "logger");
        this.f30116a = oca;
        this.f30117b = arrayList;
        this.f30118c = arrayList2;
        this.f30119d = createOriginalAppValueUC;
        this.f30120e = c2108x;
        this.f30121f = logger;
        this.f30122g = new ArrayList<>();
        this.f30123h = !arrayList2.isEmpty();
        b(arrayList);
        d();
    }

    public static String a(I8.e eVar, I8.b bVar) {
        List listE0 = kotlin.text.n.e0(eVar.f3930b, new String[]{";"}, 0, 6);
        List listE1 = kotlin.text.n.e0(bVar.f3918d, new String[]{";"}, 0, 6);
        int size = listE1.size();
        String strConcat = "";
        for (int i10 = 0; i10 < size; i10++) {
            if (strConcat.length() > 0) {
                strConcat = strConcat.concat(";");
            }
            strConcat = strConcat + listE0.get(i10) + "/" + listE1.get(i10);
        }
        return strConcat;
    }

    public final void b(ArrayList arrayList) {
        if (this.f30123h) {
            ArrayList arrayList2 = this.f30118c;
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    I8.e eVar = (I8.e) arrayList2.get(i10);
                    int i11 = eVar.f3929a;
                    I8.b bVar = (I8.b) arrayList.get(i11);
                    String values = a(eVar, bVar);
                    CommandType commandType = bVar.f3915a;
                    String data = bVar.f3916b;
                    kotlin.jvm.internal.i.e(data, "data");
                    String type = bVar.f3917c;
                    kotlin.jvm.internal.i.e(type, "type");
                    kotlin.jvm.internal.i.e(values, "values");
                    this.f30117b.set(i11, new I8.b(commandType, data, type, values));
                } catch (JSONException e10) {
                    this.f30121f.d(e10, false);
                }
            }
            d();
        }
    }

    public final ArrayList c() {
        this.f30121f.f("AppWorker", "getValues()");
        ArrayList arrayListP0 = kotlin.collections.q.p0(this.f30116a.f3909i);
        if (this.f30123h && !arrayListP0.contains("Original")) {
            arrayListP0.add(0, "Original");
        }
        return arrayListP0;
    }

    public final void d() {
        AbstractC2107w a10;
        AbstractC2107w n0Var;
        AbstractC2107w l0Var;
        ArrayList<AbstractC2107w> arrayList = this.f30122g;
        arrayList.clear();
        for (I8.b command : this.f30117b) {
            Jb.a aVar = this.f30120e;
            kotlin.jvm.internal.i.e(command, "command");
            CommandType commandType = command.f3915a;
            int iOrdinal = commandType.ordinal();
            String str = command.f3916b;
            switch (iOrdinal) {
                case 0:
                    AbstractC2107w.f30175h = str;
                    a10 = new A(command);
                    break;
                case 1:
                    a10 = new g0(command);
                    break;
                case 2:
                    a10 = new C2106v(command, String.format("%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h}, 2)));
                    break;
                case 3:
                    a10 = new r0(command, String.format("%s_%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h, ((String[]) new Regex("/").h(str, 0).toArray(new String[0]))[0]}, 3)));
                    break;
                case 4:
                    a10 = new Y(command, String.format("%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h}, 2)));
                    break;
                case 5:
                    a10 = new v0(command, String.format("%s_%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h, ((String[]) new Regex("/").h(str, 0).toArray(new String[0]))[0]}, 3)));
                    break;
                case 6:
                    a10 = new C2089d(command, String.format("%s_%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h, ((String[]) new Regex("/").h(str, 0).toArray(new String[0]))[0]}, 3)));
                    break;
                case 7:
                    a10 = new W(command, String.format("%s_%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h, ((String[]) new Regex("/").h(str, 0).toArray(new String[0]))[0]}, 3)));
                    break;
                case 8:
                    a10 = new C2101p(command, String.format("%s_%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h, str}, 3)));
                    break;
                case 9:
                    a10 = new F(command, String.format("%s_%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h, ((String[]) new Regex("/").h(str, 0).toArray(new String[0]))[0]}, 3)));
                    break;
                case 10:
                    a10 = new e0(command, String.format("%s_%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h, str}, 3)));
                    break;
                case 11:
                    String[] strArr = (String[]) new Regex("/").h(str, 0).toArray(new String[0]);
                    n0Var = new n0(command, String.format("%s_%s_%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h, strArr[0], strArr[1]}, 4)));
                    a10 = n0Var;
                    break;
                case 12:
                    String[] strArr2 = (String[]) new Regex("/").h(str, 0).toArray(new String[0]);
                    n0Var = new S(command, String.format("%s_%s_%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h, strArr2[0], strArr2[1]}, 4)));
                    a10 = n0Var;
                    break;
                case 13:
                    a10 = new B0(command, String.format("%s_%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h, str}, 3)));
                    break;
                case 14:
                    a10 = new C2085a0(command);
                    break;
                case 15:
                    a10 = new C2103s(command);
                    break;
                case 16:
                    a10 = new h0(command);
                    break;
                case 17:
                    a10 = new c0(command);
                    break;
                case 18:
                    a10 = new N(command);
                    break;
                case 19:
                    a10 = new w0(command, String.format("%s_%s_%s", Arrays.copyOf(new Object[]{commandType, AbstractC2107w.f30175h, str}, 3)));
                    break;
                case 20:
                    a10 = new H(command);
                    break;
                case 21:
                    boolean z10 = aVar instanceof Jb.b;
                    l0Var = new l0(command, (com.voltasit.obdeleven.domain.usecases.sfd.j) (z10 ? ((Jb.b) aVar).b() : Jb.a.C0058a.a().f3935a.f5143b).a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.j.class)), (com.voltasit.obdeleven.domain.usecases.sfd.d) (z10 ? ((Jb.b) aVar).b() : Jb.a.C0058a.a().f3935a.f5143b).a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.d.class)));
                    a10 = l0Var;
                    break;
                case 22:
                    l0Var = new j0(command, (com.voltasit.obdeleven.domain.usecases.sfd.f) (aVar instanceof Jb.b ? ((Jb.b) aVar).b() : Jb.a.C0058a.a().f3935a.f5143b).a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.f.class)));
                    a10 = l0Var;
                    break;
                default:
                    a10 = new x0(command);
                    break;
            }
            arrayList.add(a10);
        }
    }

    public final Task<Void> e(final J8.a analyticsProvider, int i10, final Integer num, final boolean z10) {
        kotlin.jvm.internal.i.e(analyticsProvider, "analyticsProvider");
        this.f30121f.f("AppWorker", "writeValue(i=" + i10 + ", revertPosition=" + num + ", isRevert=" + z10 + ")");
        if (!z10) {
            this.f30124i = null;
        }
        analyticsProvider.E("OCA_WRITE_VALUE");
        ArrayList<AbstractC2107w> arrayList = this.f30122g;
        for (AbstractC2107w abstractC2107w : arrayList) {
            if (abstractC2107w instanceof A) {
                analyticsProvider.g("OCA_WRITE_VALUE", "connect_count");
            }
            analyticsProvider.g("OCA_WRITE_VALUE", "command_count");
            abstractC2107w.h(i10);
        }
        Task taskForResult = Task.forResult(0);
        Iterator<AbstractC2107w> it = arrayList.iterator();
        while (it.hasNext()) {
            taskForResult = taskForResult.continueWithTask(new C2096k(it.next(), 0, this));
        }
        kotlin.jvm.internal.i.b(taskForResult);
        Task<Void> taskContinueWith = taskForResult.continueWith(new Continuation() { // from class: com.voltasit.obdeleven.core.app.j
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) throws AppException, InterruptedException {
                J8.a analyticsProvider2 = analyticsProvider;
                kotlin.jvm.internal.i.e(analyticsProvider2, "$analyticsProvider");
                C2098m this$0 = this;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                kotlin.jvm.internal.i.e(task, "task");
                analyticsProvider2.S("OCA_WRITE_VALUE", "is_revert", String.valueOf(z10));
                analyticsProvider2.S("OCA_WRITE_VALUE", "app_group_id", String.valueOf(this$0.f30116a.f3902b));
                String localizedMessage = task.isFaulted() ? task.getError().getLocalizedMessage() : "Success";
                kotlin.jvm.internal.i.b(localizedMessage);
                analyticsProvider2.S("OCA_WRITE_VALUE", "result", localizedMessage);
                analyticsProvider2.W("OCA_WRITE_VALUE");
                Integer num2 = (Integer) task.getResult();
                Integer num3 = num;
                J8.p pVar = this$0.f30121f;
                if ((num2 == null || num2.intValue() != 0) && num3 != null) {
                    pVar.b("AppWorker", "reverting app write");
                    ControlUnit controlUnit = AbstractC2107w.f30176i;
                    if (controlUnit != null) {
                        controlUnit.a();
                    }
                    this$0.e(analyticsProvider2, num3.intValue(), null, true).waitForCompletion();
                }
                if (num3 != null) {
                    if (task.isFaulted()) {
                        Exception error = task.getError();
                        kotlin.jvm.internal.i.d(error, "getError(...)");
                        pVar.d(error, false);
                        throw new AppException(-4);
                    }
                    pVar.b("AppWorker", "Result: " + num2);
                    if (num2 == null || num2.intValue() != 0) {
                        if (num2 != null && num2.intValue() == -5) {
                            throw new AppException(-2);
                        }
                        if (num2 != null && num2.intValue() == -2) {
                            throw new AppException(-3);
                        }
                        if ((num2 != null && num2.intValue() == -1) || (num2 != null && num2.intValue() == -3)) {
                            kotlin.jvm.internal.i.b(num2);
                            if (num2.intValue() > 128) {
                                throw new AppException(num2.intValue());
                            }
                            throw new AppException(-4);
                        }
                        if (num2 != null && num2.intValue() == -6) {
                            throw new AppException(-8);
                        }
                        if (num2 != null && num2.intValue() == -9) {
                            throw new AppException(-11);
                        }
                        if (num2 != null && num2.intValue() == -7) {
                            throw new AppException(-9);
                        }
                        if (num2 != null && num2.intValue() == -8) {
                            throw new AppException(-10);
                        }
                        if (num2 != null && num2.intValue() == -10) {
                            throw new AppException(-12);
                        }
                        kotlin.jvm.internal.i.b(num2);
                        if (num2.intValue() > 128) {
                            throw new AppException(num2.intValue());
                        }
                        throw new AppException(-4);
                    }
                }
                return null;
            }
        });
        kotlin.jvm.internal.i.d(taskContinueWith, "continueWith(...)");
        return taskContinueWith;
    }
}
