package com.voltasit.obdeleven.ui.activity;

import com.braze.Constants;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.models.ConnectionRedirectType;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.models.vehicle.ManufacturerGroup;
import com.voltasit.obdeleven.models.vehicle.SupportedManufacturer;
import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p255u9.D;
import p255u9.E;
import p255u9.F;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$handleVehicleIdentification$1", f = "MainActivityViewModel.kt", l = {556, 578}, m = "invokeSuspend")
final class MainActivityViewModel$handleVehicleIdentification$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ MainActivity $mainActivity;
    final /* synthetic */ Task<E> $vehicleIdentificationTask;
    Object L$0;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivityViewModel$handleVehicleIdentification$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: MainActivityViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$handleVehicleIdentification$1$1", f = "MainActivityViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ Task<E> $vehicleModificationSavingTask;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Task<E> task, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$vehicleModificationSavingTask = task;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$vehicleModificationSavingTask, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.$vehicleModificationSavingTask.waitForCompletion();
            return p293xa.r.f47939a;
        }
    }

    /* JADX INFO: compiled from: MainActivityViewModel.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33668a;

        static {
            int[] iArr = new int[ConnectionRedirectType.values().length];
            try {
                ConnectionRedirectType connectionRedirectType = ConnectionRedirectType.f30451b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ConnectionRedirectType connectionRedirectType2 = ConnectionRedirectType.f30451b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f33668a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$handleVehicleIdentification$1(MainActivityViewModel mainActivityViewModel, Task<E> task, MainActivity mainActivity, kotlin.coroutines.c<? super MainActivityViewModel$handleVehicleIdentification$1> cVar) {
        super(2, cVar);
        this.this$0 = mainActivityViewModel;
        this.$vehicleIdentificationTask = task;
        this.$mainActivity = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainActivityViewModel$handleVehicleIdentification$1(this.this$0, this.$vehicleIdentificationTask, this.$mainActivity, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$handleVehicleIdentification$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x0154  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Task<E> task;
        ConnectionRedirectType connectionRedirectType;
        String string;
        SupportedManufacturer supportedManufacturer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                task = (Task) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        this.this$0.f33652t.f("MainActivityViewModel", "resumeConnectToVehicle()");
        MainActivityViewModel mainActivityViewModel = this.this$0;
        task = this.$vehicleIdentificationTask;
        final MainActivity mainActivity = this.$mainActivity;
        mainActivityViewModel.getClass();
        final E result = task.getResult();
        if (result != null && result.j() == null) {
            ParseQuery query = ParseQuery.getQuery(F.class);
            query.whereEqualTo("vehicleBase", result.i());
            query.include("vehicleBase");
            query.setLimit(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
            Task<E> taskContinueWithTask = query.findInBackground().continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.ui.activity.u
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task2) {
                    p315z8.d dVar;
                    p315z8.c cVar;
                    Task vehicleTask = task;
                    kotlin.jvm.internal.i.e(vehicleTask, "$vehicleTask");
                    MainActivity mainActivity2 = mainActivity;
                    kotlin.jvm.internal.i.e(mainActivity2, "$mainActivity");
                    kotlin.jvm.internal.i.e(task2, "task");
                    List<F> list = (List) task2.getResult();
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        return vehicleTask;
                    }
                    int size = list.size();
                    E e10 = result;
                    if (size == 1) {
                        e10.put("vehicleModification", (F) list.get(0));
                        e10.saveEventually();
                        return vehicleTask;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (F f10 : list) {
                        D d10 = (D) f10.getParseObject("vehicleBase");
                        Iterator it = arrayList.iterator();
                        do {
                            dVar = null;
                            if (!it.hasNext()) {
                                cVar = null;
                                break;
                            }
                            cVar = (p315z8.c) it.next();
                        } while (!cVar.f48948a.getObjectId().equals(d10.getObjectId()));
                        if (cVar == null) {
                            cVar = new p315z8.c(d10);
                            arrayList.add(cVar);
                        }
                        ArrayList<p315z8.d> arrayList2 = cVar.f48949b;
                        for (p315z8.d dVar2 : arrayList2) {
                            if (dVar2.f48950a.equals(f10.getString("model"))) {
                                dVar = dVar2;
                                break;
                            }
                        }
                        if (dVar == null) {
                            dVar = new p315z8.d(f10.getString("model"));
                            arrayList2.add(dVar);
                        }
                        dVar.f48951b.add(f10);
                    }
                    Collections.sort(arrayList, new p315z8.b());
                    return new DialogC2146g0(mainActivity2, arrayList).b().continueWithTask(new v(e10, 0, vehicleTask));
                }
            }, Task.UI_THREAD_EXECUTOR);
            kotlin.jvm.internal.i.d(taskContinueWithTask, "continueWithTask(...)");
            task = taskContinueWithTask;
        }
        Sa.a aVar = N.f43200c;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(task, null);
        this.L$0 = task;
        this.label = 1;
        if (C2680e.f(aVar, anonymousClass1, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        MainActivityViewModel mainActivityViewModel2 = this.this$0;
        Task<E> task2 = this.$vehicleIdentificationTask;
        mainActivityViewModel2.getClass();
        if (task2.isFaulted()) {
            Exception error = task2.getError();
            if ((error instanceof ParseException) && ((ParseException) error).getCode() == 119) {
                U7.a<p293xa.r> aVar2 = this.this$0.f33603N0;
                p293xa.r rVar = p293xa.r.f47939a;
                aVar2.j(rVar);
                return rVar;
            }
        }
        int i11 = 0;
        if (task.isFaulted()) {
            this.this$0.j(false);
            return p293xa.r.f47939a;
        }
        if (task.getResult() == null) {
            U7.a<p293xa.r> aVar3 = this.this$0.f33664z0;
            p293xa.r rVar2 = p293xa.r.f47939a;
            aVar3.j(rVar2);
            return rVar2;
        }
        this.this$0.f33627Z0 = task.getResult();
        com.voltasit.obdeleven.domain.usecases.vehicle.c cVar = this.this$0.f33614T;
        Task<E> vehicleIdentificationTask = this.$vehicleIdentificationTask;
        cVar.getClass();
        kotlin.jvm.internal.i.e(vehicleIdentificationTask, "vehicleIdentificationTask");
        if (cVar.f31042a.k() && !(cVar.f31044c.d() instanceof com.voltasit.obdeleven.utils.bluetooth.m)) {
            E result2 = vehicleIdentificationTask.getResult();
            if (result2 != null) {
                SupportedManufacturer.a aVar4 = SupportedManufacturer.f31173b;
                D dI = result2.i();
                if (dI == null || (string = dI.getString("make")) == null) {
                    string = "";
                }
                aVar4.getClass();
                SupportedManufacturer[] supportedManufacturerArrValues = SupportedManufacturer.values();
                int length = supportedManufacturerArrValues.length;
                while (true) {
                    if (i11 >= length) {
                        supportedManufacturer = null;
                        break;
                    }
                    supportedManufacturer = supportedManufacturerArrValues[i11];
                    String strA = supportedManufacturer.a();
                    Locale locale = Locale.ROOT;
                    String lowerCase = strA.toLowerCase(locale);
                    kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
                    String lowerCase2 = string.toLowerCase(locale);
                    kotlin.jvm.internal.i.d(lowerCase2, "toLowerCase(...)");
                    if (lowerCase.equals(lowerCase2)) {
                        break;
                    }
                    i11++;
                }
                if (supportedManufacturer == null) {
                    supportedManufacturer = SupportedManufacturer.f31174c;
                }
                if (supportedManufacturer.b() != ManufacturerGroup.f31170c) {
                    connectionRedirectType = ConnectionRedirectType.f30452c;
                } else if (((G8.D) cVar.f31043b.A().getValue()).f3410a != SubscriptionType.None) {
                    connectionRedirectType = null;
                } else {
                    connectionRedirectType = ConnectionRedirectType.f30451b;
                }
            } else if (((G8.D) cVar.f31043b.A().getValue()).f3410a != SubscriptionType.None) {
                connectionRedirectType = null;
            } else {
                connectionRedirectType = ConnectionRedirectType.f30451b;
            }
        } else {
            connectionRedirectType = null;
        }
        int i12 = connectionRedirectType == null ? -1 : a.f33668a[connectionRedirectType.ordinal()];
        if (i12 == -1) {
            MainActivityViewModel mainActivityViewModel3 = this.this$0;
            E e10 = mainActivityViewModel3.f33627Z0;
            kotlin.jvm.internal.i.b(e10);
            this.L$0 = null;
            this.label = 2;
            if (MainActivityViewModel.c(mainActivityViewModel3, e10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i12 == 1) {
            this.this$0.f33607P0.j(p293xa.r.f47939a);
        } else if (i12 == 2) {
            this.this$0.f33603N0.j(p293xa.r.f47939a);
        }
        return p293xa.r.f47939a;
    }
}
