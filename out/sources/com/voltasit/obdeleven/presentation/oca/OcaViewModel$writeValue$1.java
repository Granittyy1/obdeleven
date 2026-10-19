package com.voltasit.obdeleven.presentation.oca;

import G8.D;
import Ia.p;
import android.os.Build;
import androidx.core.view.C1293h;
import androidx.lifecycle.Z;
import com.obdeleven.service.util.Texttabe;
import com.parse.ParseFile;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.core.app.AbstractC2107w;
import com.voltasit.obdeleven.core.app.C2098m;
import com.voltasit.obdeleven.domain.exceptions.AppException;
import com.voltasit.obdeleven.domain.exceptions.FairUsePolicyBreachException;
import com.voltasit.obdeleven.domain.exceptions.NotEnoughCreditsException;
import com.voltasit.obdeleven.domain.exceptions.SubscriptionExpiredException;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.domain.usecases.user.v;
import com.voltasit.obdeleven.utils.CreditUtils;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: OcaViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.OcaViewModel$writeValue$1", f = "OcaViewModel.kt", l = {316, 332, 342, 364, 367, 383}, m = "invokeSuspend")
final class OcaViewModel$writeValue$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ C2098m $appWorker;
    final /* synthetic */ int $oldPosition;
    final /* synthetic */ int $position;
    final /* synthetic */ E $vehicle;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ k this$0;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.oca.OcaViewModel$writeValue$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: OcaViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.oca.OcaViewModel$writeValue$1$1", f = "OcaViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Task<Void> $writeTask;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Task<Void> task, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$writeTask = task;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$writeTask, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.$writeTask.waitForCompletion();
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcaViewModel$writeValue$1(k kVar, int i10, int i11, C2098m c2098m, E e10, kotlin.coroutines.c<? super OcaViewModel$writeValue$1> cVar) {
        super(2, cVar);
        this.this$0 = kVar;
        this.$position = i10;
        this.$oldPosition = i11;
        this.$appWorker = c2098m;
        this.$vehicle = e10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OcaViewModel$writeValue$1(this.this$0, this.$position, this.$oldPosition, this.$appWorker, this.$vehicle, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OcaViewModel$writeValue$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0441  */
    /* JADX WARN: Code duplicated, block: B:101:0x0450  */
    /* JADX WARN: Code duplicated, block: B:103:0x0458  */
    /* JADX WARN: Code duplicated, block: B:104:0x0460  */
    /* JADX WARN: Code duplicated, block: B:107:0x046f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00da  */
    /* JADX WARN: Code duplicated, block: B:32:0x0148 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x014f  */
    /* JADX WARN: Code duplicated, block: B:37:0x018b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x018c  */
    /* JADX WARN: Code duplicated, block: B:41:0x019a  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0213 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x021a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0222  */
    /* JADX WARN: Code duplicated, block: B:56:0x0226  */
    /* JADX WARN: Code duplicated, block: B:58:0x0232  */
    /* JADX WARN: Code duplicated, block: B:60:0x0242 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0243  */
    /* JADX WARN: Code duplicated, block: B:62:0x0247  */
    /* JADX WARN: Code duplicated, block: B:64:0x0271 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x0278  */
    /* JADX WARN: Code duplicated, block: B:68:0x0292  */
    /* JADX WARN: Code duplicated, block: B:70:0x0296  */
    /* JADX WARN: Code duplicated, block: B:73:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0314  */
    /* JADX WARN: Code duplicated, block: B:80:0x0335  */
    /* JADX WARN: Code duplicated, block: B:81:0x034a  */
    /* JADX WARN: Code duplicated, block: B:82:0x035e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0372  */
    /* JADX WARN: Code duplicated, block: B:84:0x0386  */
    /* JADX WARN: Code duplicated, block: B:85:0x039a  */
    /* JADX WARN: Code duplicated, block: B:86:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:90:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x0416  */
    /* JADX WARN: Code duplicated, block: B:95:0x041a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0431  */
    /* JADX WARN: Code duplicated, block: B:98:0x0439  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00da, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x0278, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x02f2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0314, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objD;
        I8.a aVar;
        Object objH;
        C8.a aVar2;
        k kVar;
        Throwable th;
        String str;
        P8.e eVar;
        Task<Void> taskE;
        Sa.a aVar3;
        AnonymousClass1 anonymousClass1;
        String str2;
        P8.e eVar2;
        Task<Void> task;
        String str3;
        CopyOnWriteArrayList copyOnWriteArrayList;
        Object objE;
        Object objA;
        C8.a aVar4;
        SubscriptionType subscriptionType;
        SubscriptionType subscriptionType2;
        v vVar;
        C8.a aVar5;
        int iA;
        String str4;
        byte[] byteArray;
        E e10;
        AbstractC2107w abstractC2107w;
        I8.a aVar6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                this.this$0.f32763r.f("OcaViewModel", C1293h.h("writeValue(position:", ", oldPosition: ", ")", this.$position, this.$oldPosition));
                I8.a aVar7 = (I8.a) this.this$0.f32727M.d();
                if (aVar7 == null) {
                    return r.f47939a;
                }
                this.this$0.i(1);
                List list = (List) this.this$0.f32731O.d();
                ArrayList arrayListP0 = list != null ? q.p0(list) : new ArrayList();
                k kVar2 = this.this$0;
                C2098m c2098m = this.$appWorker;
                int i10 = this.$position;
                int i11 = this.$oldPosition;
                E e11 = this.$vehicle;
                this.L$0 = aVar7;
                this.label = 1;
                objD = k.d(kVar2, arrayListP0, c2098m, i10, i11, e11, this);
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = aVar7;
                if (((Boolean) objD).booleanValue()) {
                    this.this$0.i(2);
                    return r.f47939a;
                }
                String str5 = aVar.f3901a;
                String objectId = this.$vehicle.getObjectId();
                kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
                int i12 = this.$oldPosition;
                int i13 = this.$position;
                boolean z10 = this.$appWorker.f30123h;
                String str6 = "Android " + Build.VERSION.RELEASE + " (" + Build.VERSION.SDK_INT + ")";
                int i14 = this.$vehicle.getInt("mileage");
                String strE = this.this$0.f32705B.Y().e();
                kotlin.jvm.internal.i.d(strE, "getLanguageCode(...)");
                I8.c cVar = new I8.c(str5, objectId, i12, i13, z10, str6, i14, strE);
                com.voltasit.obdeleven.domain.usecases.oca.k kVar3 = this.this$0.f32778z;
                this.L$0 = aVar;
                this.label = 2;
                objH = kVar3.f30886a.h(cVar, this);
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar2 = (C8.a) objH;
                if (!(aVar2 instanceof C8.a.b)) {
                    if (!(aVar2 instanceof C8.a.C0024a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar = this.this$0;
                    th = ((C8.a.C0024a) aVar2).f2462a;
                    kVar.f32763r.d(th, false);
                    kVar.i(2);
                    if (th.equals(SubscriptionExpiredException.f30433b)) {
                        kVar.f32708C0.j(r.f47939a);
                    } else if (th.equals(NotEnoughCreditsException.f30413b)) {
                        C2680e.c(Z.a(kVar), null, null, new OcaViewModel$handleStartOcaSessionFailure$1(kVar, null), 3);
                    } else if (th.equals(FairUsePolicyBreachException.f30404b)) {
                        kVar.f32724K0.j(r.f47939a);
                    } else {
                        kVar.f32119h.j(Integer.valueOf(R.string.common_check_network_connection));
                    }
                    return r.f47939a;
                }
                str = (String) ((C8.a.b) aVar2).f2463a;
                eVar = new P8.e();
                P8.c.c(eVar);
                taskE = this.$appWorker.e(this.this$0.f32707C, this.$position, new Integer(this.$oldPosition), false);
                aVar3 = N.f43200c;
                anonymousClass1 = new AnonymousClass1(taskE, null);
                this.L$0 = aVar;
                this.L$1 = str;
                this.L$2 = eVar;
                this.L$3 = taskE;
                this.label = 3;
                if (C2680e.f(aVar3, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str;
                eVar2 = eVar;
                task = taskE;
                str3 = str2;
                copyOnWriteArrayList = P8.c.f4964a;
                if (copyOnWriteArrayList.contains(eVar2)) {
                    copyOnWriteArrayList.remove(eVar2);
                    eVar2.d();
                }
                this.this$0.f32765s.a();
                if (!task.isFaulted()) {
                    this.this$0.f32707C.e0(J8.r.a.a(aVar.f3901a, aVar.f3903c, aVar.f3905e, true));
                    B7.b.h(this.$position, this.this$0.f32737U);
                    this.this$0.i(2);
                    B7.b.h(R.string.common_success, this.this$0.f32122l);
                    if (this.this$0.f32761q.L().getInt("role") != 3) {
                        k kVar4 = this.this$0;
                        C2680e.c(C2673a0.f43223b, kVar4.f32112a, null, new OcaViewModel$increaseOcaUsage$1(kVar4, null), 2);
                    }
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34261e, 1);
                    GetUserDetailsUC getUserDetailsUC = this.this$0.f32709D;
                    this.L$0 = aVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    objA = getUserDetailsUC.a(this);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar4 = (C8.a) objA;
                    if (!(aVar4 instanceof C8.a.b)) {
                        boolean z11 = aVar4 instanceof C8.a.C0024a;
                    } else if (this.this$0.g() || aVar.f3905e > 0) {
                        subscriptionType = ((D) ((C8.a.b) aVar4).f2463a).f3410a;
                        subscriptionType2 = SubscriptionType.Ultimate;
                        if (subscriptionType == subscriptionType2) {
                            vVar = this.this$0.f32711E;
                            this.L$0 = null;
                            this.label = 5;
                            if (vVar.a(subscriptionType2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    CreditUtils.b(this.this$0.f32761q.L());
                    return r.f47939a;
                }
                this.this$0.f32707C.e0(J8.r.a.a(aVar.f3901a, aVar.f3903c, aVar.f3905e, false));
                com.voltasit.obdeleven.domain.usecases.oca.j jVar = this.this$0.f32703A;
                this.L$0 = eVar2;
                this.L$1 = task;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 6;
                objE = jVar.f30885a.e(str3, this);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar5 = (C8.a) objE;
                if (aVar5 instanceof C8.a.b) {
                    this.this$0.f32763r.e("OcaViewModel", "Refund successful: " + ((C8.a.b) aVar5).f2463a);
                } else if (aVar5 instanceof C8.a.C0024a) {
                    this.this$0.f32763r.d(((C8.a.C0024a) aVar5).f2462a, false);
                }
                this.this$0.i(2);
                this.this$0.f32763r.b("OcaViewModel", "Failed to write value");
                Exception error = task.getError();
                kotlin.jvm.internal.i.c(error, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.exceptions.AppException");
                iA = ((AppException) error).a();
                J8.p pVar = this.this$0.f32763r;
                Exception error2 = task.getError();
                kotlin.jvm.internal.i.d(error2, "getError(...)");
                pVar.d(error2, false);
                this.this$0.f32763r.b("OcaViewModel", "Result: " + iA);
                if (iA == -3) {
                    this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_CHECK_IGNITION");
                    B7.b.h(this.$position, this.this$0.f32753k0);
                } else if (iA != -2) {
                    switch (iA) {
                        case -12:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_COUNTRY_UNSUPPORTED");
                            B7.b.h(R.string.dialog_sfd_country_not_supported_message, this.this$0.f32119h);
                            break;
                        case -11:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_SECOND");
                            B7.b.h(R.string.dialog_sfd_error_one_sec_limit_reached, this.this$0.f32720I0);
                            break;
                        case -10:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_HOUR");
                            B7.b.h(R.string.dialog_sfd_error_hour_limit_reached, this.this$0.f32720I0);
                            break;
                        case -9:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_DAY");
                            B7.b.h(R.string.dialog_sfd_error_day_limit_reached, this.this$0.f32720I0);
                            break;
                        case -8:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD");
                            B7.b.h(R.string.common_problem_with_sfd, this.this$0.f32119h);
                            break;
                        default:
                            if (iA <= 128) {
                                this.this$0.f32763r.b("OcaViewModel", "Unknown status: " + iA);
                                B7.b.h(R.string.common_failed, this.this$0.f32119h);
                            } else {
                                String strA = Texttabe.a(iA);
                                this.this$0.f32763r.b("OcaViewModel", "NRC: " + strA);
                                this.this$0.j.j(strA);
                            }
                            break;
                    }
                } else {
                    this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_NOT_SUPPORTED");
                    B7.b.h(R.string.view_app_app_not_supported, this.this$0.f32119h);
                    this.this$0.i(3);
                }
                k kVar5 = this.this$0;
                str4 = (String) this.$appWorker.c().get(this.$position);
                byteArray = eVar2.f4965b.toByteArray();
                kotlin.jvm.internal.i.d(byteArray, "getLogData(...)");
                e10 = this.$vehicle;
                abstractC2107w = this.$appWorker.f30124i;
                aVar6 = (I8.a) kVar5.f32727M.d();
                if (aVar6 != null) {
                    ParseFile parseFile = new ParseFile("log.txt", byteArray);
                    parseFile.saveInBackground().onSuccessTask(new j(aVar6, e10, iA, str4, parseFile, abstractC2107w));
                }
                CreditUtils.b(this.this$0.f32761q.L());
                return r.f47939a;
            case 1:
                I8.a aVar8 = (I8.a) this.L$0;
                kotlin.b.b(obj);
                aVar = aVar8;
                objD = obj;
                if (((Boolean) objD).booleanValue()) {
                    this.this$0.i(2);
                    return r.f47939a;
                }
                String str7 = aVar.f3901a;
                String objectId2 = this.$vehicle.getObjectId();
                kotlin.jvm.internal.i.d(objectId2, "getObjectId(...)");
                int i15 = this.$oldPosition;
                int i16 = this.$position;
                boolean z12 = this.$appWorker.f30123h;
                String str8 = "Android " + Build.VERSION.RELEASE + " (" + Build.VERSION.SDK_INT + ")";
                int i17 = this.$vehicle.getInt("mileage");
                String strE2 = this.this$0.f32705B.Y().e();
                kotlin.jvm.internal.i.d(strE2, "getLanguageCode(...)");
                I8.c cVar2 = new I8.c(str7, objectId2, i15, i16, z12, str8, i17, strE2);
                com.voltasit.obdeleven.domain.usecases.oca.k kVar6 = this.this$0.f32778z;
                this.L$0 = aVar;
                this.label = 2;
                objH = kVar6.f30886a.h(cVar2, this);
                if (objH == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar2 = (C8.a) objH;
                if (!(aVar2 instanceof C8.a.b)) {
                    if (!(aVar2 instanceof C8.a.C0024a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar = this.this$0;
                    th = ((C8.a.C0024a) aVar2).f2462a;
                    kVar.f32763r.d(th, false);
                    kVar.i(2);
                    if (th.equals(SubscriptionExpiredException.f30433b)) {
                        kVar.f32708C0.j(r.f47939a);
                    } else if (th.equals(NotEnoughCreditsException.f30413b)) {
                        C2680e.c(Z.a(kVar), null, null, new OcaViewModel$handleStartOcaSessionFailure$1(kVar, null), 3);
                    } else if (th.equals(FairUsePolicyBreachException.f30404b)) {
                        kVar.f32724K0.j(r.f47939a);
                    } else {
                        kVar.f32119h.j(Integer.valueOf(R.string.common_check_network_connection));
                    }
                    return r.f47939a;
                }
                str = (String) ((C8.a.b) aVar2).f2463a;
                eVar = new P8.e();
                P8.c.c(eVar);
                taskE = this.$appWorker.e(this.this$0.f32707C, this.$position, new Integer(this.$oldPosition), false);
                aVar3 = N.f43200c;
                anonymousClass1 = new AnonymousClass1(taskE, null);
                this.L$0 = aVar;
                this.L$1 = str;
                this.L$2 = eVar;
                this.L$3 = taskE;
                this.label = 3;
                if (C2680e.f(aVar3, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str;
                eVar2 = eVar;
                task = taskE;
                str3 = str2;
                copyOnWriteArrayList = P8.c.f4964a;
                if (copyOnWriteArrayList.contains(eVar2)) {
                    copyOnWriteArrayList.remove(eVar2);
                    eVar2.d();
                }
                this.this$0.f32765s.a();
                if (!task.isFaulted()) {
                    this.this$0.f32707C.e0(J8.r.a.a(aVar.f3901a, aVar.f3903c, aVar.f3905e, true));
                    B7.b.h(this.$position, this.this$0.f32737U);
                    this.this$0.i(2);
                    B7.b.h(R.string.common_success, this.this$0.f32122l);
                    if (this.this$0.f32761q.L().getInt("role") != 3) {
                        k kVar7 = this.this$0;
                        C2680e.c(C2673a0.f43223b, kVar7.f32112a, null, new OcaViewModel$increaseOcaUsage$1(kVar7, null), 2);
                    }
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34261e, 1);
                    GetUserDetailsUC getUserDetailsUC2 = this.this$0.f32709D;
                    this.L$0 = aVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    objA = getUserDetailsUC2.a(this);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar4 = (C8.a) objA;
                    if (!(aVar4 instanceof C8.a.b)) {
                        boolean z13 = aVar4 instanceof C8.a.C0024a;
                    } else if (this.this$0.g()) {
                        subscriptionType = ((D) ((C8.a.b) aVar4).f2463a).f3410a;
                        subscriptionType2 = SubscriptionType.Ultimate;
                        if (subscriptionType == subscriptionType2) {
                            vVar = this.this$0.f32711E;
                            this.L$0 = null;
                            this.label = 5;
                            if (vVar.a(subscriptionType2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        subscriptionType = ((D) ((C8.a.b) aVar4).f2463a).f3410a;
                        subscriptionType2 = SubscriptionType.Ultimate;
                        if (subscriptionType == subscriptionType2) {
                            vVar = this.this$0.f32711E;
                            this.L$0 = null;
                            this.label = 5;
                            if (vVar.a(subscriptionType2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    CreditUtils.b(this.this$0.f32761q.L());
                    return r.f47939a;
                }
                this.this$0.f32707C.e0(J8.r.a.a(aVar.f3901a, aVar.f3903c, aVar.f3905e, false));
                com.voltasit.obdeleven.domain.usecases.oca.j jVar2 = this.this$0.f32703A;
                this.L$0 = eVar2;
                this.L$1 = task;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 6;
                objE = jVar2.f30885a.e(str3, this);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar5 = (C8.a) objE;
                if (aVar5 instanceof C8.a.b) {
                    this.this$0.f32763r.e("OcaViewModel", "Refund successful: " + ((C8.a.b) aVar5).f2463a);
                } else if (aVar5 instanceof C8.a.C0024a) {
                    this.this$0.f32763r.d(((C8.a.C0024a) aVar5).f2462a, false);
                }
                this.this$0.i(2);
                this.this$0.f32763r.b("OcaViewModel", "Failed to write value");
                Exception error3 = task.getError();
                kotlin.jvm.internal.i.c(error3, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.exceptions.AppException");
                iA = ((AppException) error3).a();
                J8.p pVar2 = this.this$0.f32763r;
                Exception error4 = task.getError();
                kotlin.jvm.internal.i.d(error4, "getError(...)");
                pVar2.d(error4, false);
                this.this$0.f32763r.b("OcaViewModel", "Result: " + iA);
                if (iA == -3) {
                    this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_CHECK_IGNITION");
                    B7.b.h(this.$position, this.this$0.f32753k0);
                } else if (iA != -2) {
                    switch (iA) {
                        case -12:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_COUNTRY_UNSUPPORTED");
                            B7.b.h(R.string.dialog_sfd_country_not_supported_message, this.this$0.f32119h);
                            break;
                        case -11:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_SECOND");
                            B7.b.h(R.string.dialog_sfd_error_one_sec_limit_reached, this.this$0.f32720I0);
                            break;
                        case -10:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_HOUR");
                            B7.b.h(R.string.dialog_sfd_error_hour_limit_reached, this.this$0.f32720I0);
                            break;
                        case -9:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_DAY");
                            B7.b.h(R.string.dialog_sfd_error_day_limit_reached, this.this$0.f32720I0);
                            break;
                        case -8:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD");
                            B7.b.h(R.string.common_problem_with_sfd, this.this$0.f32119h);
                            break;
                        default:
                            if (iA <= 128) {
                                this.this$0.f32763r.b("OcaViewModel", "Unknown status: " + iA);
                                B7.b.h(R.string.common_failed, this.this$0.f32119h);
                            } else {
                                String strA2 = Texttabe.a(iA);
                                this.this$0.f32763r.b("OcaViewModel", "NRC: " + strA2);
                                this.this$0.j.j(strA2);
                            }
                            break;
                    }
                } else {
                    this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_NOT_SUPPORTED");
                    B7.b.h(R.string.view_app_app_not_supported, this.this$0.f32119h);
                    this.this$0.i(3);
                }
                k kVar8 = this.this$0;
                str4 = (String) this.$appWorker.c().get(this.$position);
                byteArray = eVar2.f4965b.toByteArray();
                kotlin.jvm.internal.i.d(byteArray, "getLogData(...)");
                e10 = this.$vehicle;
                abstractC2107w = this.$appWorker.f30124i;
                aVar6 = (I8.a) kVar8.f32727M.d();
                if (aVar6 != null) {
                    ParseFile parseFile2 = new ParseFile("log.txt", byteArray);
                    parseFile2.saveInBackground().onSuccessTask(new j(aVar6, e10, iA, str4, parseFile2, abstractC2107w));
                }
                CreditUtils.b(this.this$0.f32761q.L());
                return r.f47939a;
            case 2:
                I8.a aVar9 = (I8.a) this.L$0;
                kotlin.b.b(obj);
                aVar = aVar9;
                objH = obj;
                aVar2 = (C8.a) objH;
                if (!(aVar2 instanceof C8.a.b)) {
                    if (!(aVar2 instanceof C8.a.C0024a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar = this.this$0;
                    th = ((C8.a.C0024a) aVar2).f2462a;
                    kVar.f32763r.d(th, false);
                    kVar.i(2);
                    if (th.equals(SubscriptionExpiredException.f30433b)) {
                        kVar.f32708C0.j(r.f47939a);
                    } else if (th.equals(NotEnoughCreditsException.f30413b)) {
                        C2680e.c(Z.a(kVar), null, null, new OcaViewModel$handleStartOcaSessionFailure$1(kVar, null), 3);
                    } else if (th.equals(FairUsePolicyBreachException.f30404b)) {
                        kVar.f32724K0.j(r.f47939a);
                    } else {
                        kVar.f32119h.j(Integer.valueOf(R.string.common_check_network_connection));
                    }
                    return r.f47939a;
                }
                str = (String) ((C8.a.b) aVar2).f2463a;
                eVar = new P8.e();
                P8.c.c(eVar);
                taskE = this.$appWorker.e(this.this$0.f32707C, this.$position, new Integer(this.$oldPosition), false);
                aVar3 = N.f43200c;
                anonymousClass1 = new AnonymousClass1(taskE, null);
                this.L$0 = aVar;
                this.L$1 = str;
                this.L$2 = eVar;
                this.L$3 = taskE;
                this.label = 3;
                if (C2680e.f(aVar3, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str;
                eVar2 = eVar;
                task = taskE;
                str3 = str2;
                copyOnWriteArrayList = P8.c.f4964a;
                if (copyOnWriteArrayList.contains(eVar2)) {
                    copyOnWriteArrayList.remove(eVar2);
                    eVar2.d();
                }
                this.this$0.f32765s.a();
                if (!task.isFaulted()) {
                    this.this$0.f32707C.e0(J8.r.a.a(aVar.f3901a, aVar.f3903c, aVar.f3905e, true));
                    B7.b.h(this.$position, this.this$0.f32737U);
                    this.this$0.i(2);
                    B7.b.h(R.string.common_success, this.this$0.f32122l);
                    if (this.this$0.f32761q.L().getInt("role") != 3) {
                        k kVar9 = this.this$0;
                        C2680e.c(C2673a0.f43223b, kVar9.f32112a, null, new OcaViewModel$increaseOcaUsage$1(kVar9, null), 2);
                    }
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34261e, 1);
                    GetUserDetailsUC getUserDetailsUC3 = this.this$0.f32709D;
                    this.L$0 = aVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    objA = getUserDetailsUC3.a(this);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar4 = (C8.a) objA;
                    if (!(aVar4 instanceof C8.a.b)) {
                        boolean z14 = aVar4 instanceof C8.a.C0024a;
                    } else if (this.this$0.g()) {
                        subscriptionType = ((D) ((C8.a.b) aVar4).f2463a).f3410a;
                        subscriptionType2 = SubscriptionType.Ultimate;
                        if (subscriptionType == subscriptionType2) {
                            vVar = this.this$0.f32711E;
                            this.L$0 = null;
                            this.label = 5;
                            if (vVar.a(subscriptionType2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        subscriptionType = ((D) ((C8.a.b) aVar4).f2463a).f3410a;
                        subscriptionType2 = SubscriptionType.Ultimate;
                        if (subscriptionType == subscriptionType2) {
                            vVar = this.this$0.f32711E;
                            this.L$0 = null;
                            this.label = 5;
                            if (vVar.a(subscriptionType2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    CreditUtils.b(this.this$0.f32761q.L());
                    return r.f47939a;
                }
                this.this$0.f32707C.e0(J8.r.a.a(aVar.f3901a, aVar.f3903c, aVar.f3905e, false));
                com.voltasit.obdeleven.domain.usecases.oca.j jVar3 = this.this$0.f32703A;
                this.L$0 = eVar2;
                this.L$1 = task;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 6;
                objE = jVar3.f30885a.e(str3, this);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar5 = (C8.a) objE;
                if (aVar5 instanceof C8.a.b) {
                    this.this$0.f32763r.e("OcaViewModel", "Refund successful: " + ((C8.a.b) aVar5).f2463a);
                } else if (aVar5 instanceof C8.a.C0024a) {
                    this.this$0.f32763r.d(((C8.a.C0024a) aVar5).f2462a, false);
                }
                this.this$0.i(2);
                this.this$0.f32763r.b("OcaViewModel", "Failed to write value");
                Exception error5 = task.getError();
                kotlin.jvm.internal.i.c(error5, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.exceptions.AppException");
                iA = ((AppException) error5).a();
                J8.p pVar3 = this.this$0.f32763r;
                Exception error6 = task.getError();
                kotlin.jvm.internal.i.d(error6, "getError(...)");
                pVar3.d(error6, false);
                this.this$0.f32763r.b("OcaViewModel", "Result: " + iA);
                if (iA == -3) {
                    this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_CHECK_IGNITION");
                    B7.b.h(this.$position, this.this$0.f32753k0);
                } else if (iA != -2) {
                    switch (iA) {
                        case -12:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_COUNTRY_UNSUPPORTED");
                            B7.b.h(R.string.dialog_sfd_country_not_supported_message, this.this$0.f32119h);
                            break;
                        case -11:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_SECOND");
                            B7.b.h(R.string.dialog_sfd_error_one_sec_limit_reached, this.this$0.f32720I0);
                            break;
                        case -10:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_HOUR");
                            B7.b.h(R.string.dialog_sfd_error_hour_limit_reached, this.this$0.f32720I0);
                            break;
                        case -9:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_DAY");
                            B7.b.h(R.string.dialog_sfd_error_day_limit_reached, this.this$0.f32720I0);
                            break;
                        case -8:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD");
                            B7.b.h(R.string.common_problem_with_sfd, this.this$0.f32119h);
                            break;
                        default:
                            if (iA <= 128) {
                                this.this$0.f32763r.b("OcaViewModel", "Unknown status: " + iA);
                                B7.b.h(R.string.common_failed, this.this$0.f32119h);
                            } else {
                                String strA3 = Texttabe.a(iA);
                                this.this$0.f32763r.b("OcaViewModel", "NRC: " + strA3);
                                this.this$0.j.j(strA3);
                            }
                            break;
                    }
                } else {
                    this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_NOT_SUPPORTED");
                    B7.b.h(R.string.view_app_app_not_supported, this.this$0.f32119h);
                    this.this$0.i(3);
                }
                k kVar10 = this.this$0;
                str4 = (String) this.$appWorker.c().get(this.$position);
                byteArray = eVar2.f4965b.toByteArray();
                kotlin.jvm.internal.i.d(byteArray, "getLogData(...)");
                e10 = this.$vehicle;
                abstractC2107w = this.$appWorker.f30124i;
                aVar6 = (I8.a) kVar10.f32727M.d();
                if (aVar6 != null) {
                    ParseFile parseFile3 = new ParseFile("log.txt", byteArray);
                    parseFile3.saveInBackground().onSuccessTask(new j(aVar6, e10, iA, str4, parseFile3, abstractC2107w));
                }
                CreditUtils.b(this.this$0.f32761q.L());
                return r.f47939a;
            case 3:
                task = (Task) this.L$3;
                P8.e eVar3 = (P8.e) this.L$2;
                String str9 = (String) this.L$1;
                I8.a aVar10 = (I8.a) this.L$0;
                kotlin.b.b(obj);
                str2 = str9;
                eVar2 = eVar3;
                aVar = aVar10;
                str3 = str2;
                copyOnWriteArrayList = P8.c.f4964a;
                if (copyOnWriteArrayList.contains(eVar2)) {
                    copyOnWriteArrayList.remove(eVar2);
                    eVar2.d();
                }
                this.this$0.f32765s.a();
                if (!task.isFaulted()) {
                    this.this$0.f32707C.e0(J8.r.a.a(aVar.f3901a, aVar.f3903c, aVar.f3905e, true));
                    B7.b.h(this.$position, this.this$0.f32737U);
                    this.this$0.i(2);
                    B7.b.h(R.string.common_success, this.this$0.f32122l);
                    if (this.this$0.f32761q.L().getInt("role") != 3) {
                        k kVar11 = this.this$0;
                        C2680e.c(C2673a0.f43223b, kVar11.f32112a, null, new OcaViewModel$increaseOcaUsage$1(kVar11, null), 2);
                    }
                    UserTrackingUtils.c(UserTrackingUtils.Key.f34261e, 1);
                    GetUserDetailsUC getUserDetailsUC4 = this.this$0.f32709D;
                    this.L$0 = aVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    objA = getUserDetailsUC4.a(this);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar4 = (C8.a) objA;
                    if (!(aVar4 instanceof C8.a.b)) {
                        boolean z15 = aVar4 instanceof C8.a.C0024a;
                    } else if (this.this$0.g()) {
                        subscriptionType = ((D) ((C8.a.b) aVar4).f2463a).f3410a;
                        subscriptionType2 = SubscriptionType.Ultimate;
                        if (subscriptionType == subscriptionType2) {
                            vVar = this.this$0.f32711E;
                            this.L$0 = null;
                            this.label = 5;
                            if (vVar.a(subscriptionType2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        subscriptionType = ((D) ((C8.a.b) aVar4).f2463a).f3410a;
                        subscriptionType2 = SubscriptionType.Ultimate;
                        if (subscriptionType == subscriptionType2) {
                            vVar = this.this$0.f32711E;
                            this.L$0 = null;
                            this.label = 5;
                            if (vVar.a(subscriptionType2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    CreditUtils.b(this.this$0.f32761q.L());
                    return r.f47939a;
                }
                this.this$0.f32707C.e0(J8.r.a.a(aVar.f3901a, aVar.f3903c, aVar.f3905e, false));
                com.voltasit.obdeleven.domain.usecases.oca.j jVar4 = this.this$0.f32703A;
                this.L$0 = eVar2;
                this.L$1 = task;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 6;
                objE = jVar4.f30885a.e(str3, this);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar5 = (C8.a) objE;
                if (aVar5 instanceof C8.a.b) {
                    this.this$0.f32763r.e("OcaViewModel", "Refund successful: " + ((C8.a.b) aVar5).f2463a);
                } else if (aVar5 instanceof C8.a.C0024a) {
                    this.this$0.f32763r.d(((C8.a.C0024a) aVar5).f2462a, false);
                }
                this.this$0.i(2);
                this.this$0.f32763r.b("OcaViewModel", "Failed to write value");
                Exception error7 = task.getError();
                kotlin.jvm.internal.i.c(error7, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.exceptions.AppException");
                iA = ((AppException) error7).a();
                J8.p pVar4 = this.this$0.f32763r;
                Exception error8 = task.getError();
                kotlin.jvm.internal.i.d(error8, "getError(...)");
                pVar4.d(error8, false);
                this.this$0.f32763r.b("OcaViewModel", "Result: " + iA);
                if (iA == -3) {
                    this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_CHECK_IGNITION");
                    B7.b.h(this.$position, this.this$0.f32753k0);
                } else if (iA != -2) {
                    switch (iA) {
                        case -12:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_COUNTRY_UNSUPPORTED");
                            B7.b.h(R.string.dialog_sfd_country_not_supported_message, this.this$0.f32119h);
                            break;
                        case -11:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_SECOND");
                            B7.b.h(R.string.dialog_sfd_error_one_sec_limit_reached, this.this$0.f32720I0);
                            break;
                        case -10:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_HOUR");
                            B7.b.h(R.string.dialog_sfd_error_hour_limit_reached, this.this$0.f32720I0);
                            break;
                        case -9:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_DAY");
                            B7.b.h(R.string.dialog_sfd_error_day_limit_reached, this.this$0.f32720I0);
                            break;
                        case -8:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD");
                            B7.b.h(R.string.common_problem_with_sfd, this.this$0.f32119h);
                            break;
                        default:
                            if (iA <= 128) {
                                this.this$0.f32763r.b("OcaViewModel", "Unknown status: " + iA);
                                B7.b.h(R.string.common_failed, this.this$0.f32119h);
                            } else {
                                String strA4 = Texttabe.a(iA);
                                this.this$0.f32763r.b("OcaViewModel", "NRC: " + strA4);
                                this.this$0.j.j(strA4);
                            }
                            break;
                    }
                } else {
                    this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_NOT_SUPPORTED");
                    B7.b.h(R.string.view_app_app_not_supported, this.this$0.f32119h);
                    this.this$0.i(3);
                }
                k kVar12 = this.this$0;
                str4 = (String) this.$appWorker.c().get(this.$position);
                byteArray = eVar2.f4965b.toByteArray();
                kotlin.jvm.internal.i.d(byteArray, "getLogData(...)");
                e10 = this.$vehicle;
                abstractC2107w = this.$appWorker.f30124i;
                aVar6 = (I8.a) kVar12.f32727M.d();
                if (aVar6 != null) {
                    ParseFile parseFile4 = new ParseFile("log.txt", byteArray);
                    parseFile4.saveInBackground().onSuccessTask(new j(aVar6, e10, iA, str4, parseFile4, abstractC2107w));
                }
                CreditUtils.b(this.this$0.f32761q.L());
                return r.f47939a;
            case 4:
                I8.a aVar11 = (I8.a) this.L$0;
                kotlin.b.b(obj);
                aVar = aVar11;
                objA = obj;
                aVar4 = (C8.a) objA;
                if (!(aVar4 instanceof C8.a.b)) {
                    boolean z16 = aVar4 instanceof C8.a.C0024a;
                } else if (this.this$0.g()) {
                    subscriptionType = ((D) ((C8.a.b) aVar4).f2463a).f3410a;
                    subscriptionType2 = SubscriptionType.Ultimate;
                    if (subscriptionType == subscriptionType2) {
                        vVar = this.this$0.f32711E;
                        this.L$0 = null;
                        this.label = 5;
                        if (vVar.a(subscriptionType2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    subscriptionType = ((D) ((C8.a.b) aVar4).f2463a).f3410a;
                    subscriptionType2 = SubscriptionType.Ultimate;
                    if (subscriptionType == subscriptionType2) {
                        vVar = this.this$0.f32711E;
                        this.L$0 = null;
                        this.label = 5;
                        if (vVar.a(subscriptionType2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                CreditUtils.b(this.this$0.f32761q.L());
                return r.f47939a;
            case 5:
                kotlin.b.b(obj);
                CreditUtils.b(this.this$0.f32761q.L());
                return r.f47939a;
            case 6:
                task = (Task) this.L$1;
                P8.e eVar4 = (P8.e) this.L$0;
                kotlin.b.b(obj);
                eVar2 = eVar4;
                objE = obj;
                aVar5 = (C8.a) objE;
                if (aVar5 instanceof C8.a.b) {
                    this.this$0.f32763r.e("OcaViewModel", "Refund successful: " + ((C8.a.b) aVar5).f2463a);
                } else if (aVar5 instanceof C8.a.C0024a) {
                    this.this$0.f32763r.d(((C8.a.C0024a) aVar5).f2462a, false);
                }
                this.this$0.i(2);
                this.this$0.f32763r.b("OcaViewModel", "Failed to write value");
                Exception error9 = task.getError();
                kotlin.jvm.internal.i.c(error9, "null cannot be cast to non-null type com.voltasit.obdeleven.domain.exceptions.AppException");
                iA = ((AppException) error9).a();
                J8.p pVar5 = this.this$0.f32763r;
                Exception error10 = task.getError();
                kotlin.jvm.internal.i.d(error10, "getError(...)");
                pVar5.d(error10, false);
                this.this$0.f32763r.b("OcaViewModel", "Result: " + iA);
                if (iA == -3) {
                    this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_CHECK_IGNITION");
                    B7.b.h(this.$position, this.this$0.f32753k0);
                } else if (iA != -2) {
                    switch (iA) {
                        case -12:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_COUNTRY_UNSUPPORTED");
                            B7.b.h(R.string.dialog_sfd_country_not_supported_message, this.this$0.f32119h);
                            break;
                        case -11:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_SECOND");
                            B7.b.h(R.string.dialog_sfd_error_one_sec_limit_reached, this.this$0.f32720I0);
                            break;
                        case -10:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_HOUR");
                            B7.b.h(R.string.dialog_sfd_error_hour_limit_reached, this.this$0.f32720I0);
                            break;
                        case -9:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD_LIMIT_DAY");
                            B7.b.h(R.string.dialog_sfd_error_day_limit_reached, this.this$0.f32720I0);
                            break;
                        case -8:
                            this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_SFD");
                            B7.b.h(R.string.common_problem_with_sfd, this.this$0.f32119h);
                            break;
                        default:
                            if (iA <= 128) {
                                this.this$0.f32763r.b("OcaViewModel", "Unknown status: " + iA);
                                B7.b.h(R.string.common_failed, this.this$0.f32119h);
                            } else {
                                String strA5 = Texttabe.a(iA);
                                this.this$0.f32763r.b("OcaViewModel", "NRC: " + strA5);
                                this.this$0.j.j(strA5);
                            }
                            break;
                    }
                } else {
                    this.this$0.f32763r.b("OcaViewModel", "APP_ERROR_NOT_SUPPORTED");
                    B7.b.h(R.string.view_app_app_not_supported, this.this$0.f32119h);
                    this.this$0.i(3);
                }
                k kVar13 = this.this$0;
                str4 = (String) this.$appWorker.c().get(this.$position);
                byteArray = eVar2.f4965b.toByteArray();
                kotlin.jvm.internal.i.d(byteArray, "getLogData(...)");
                e10 = this.$vehicle;
                abstractC2107w = this.$appWorker.f30124i;
                aVar6 = (I8.a) kVar13.f32727M.d();
                if (aVar6 != null) {
                    ParseFile parseFile5 = new ParseFile("log.txt", byteArray);
                    parseFile5.saveInBackground().onSuccessTask(new j(aVar6, e10, iA, str4, parseFile5, abstractC2107w));
                }
                CreditUtils.b(this.this$0.f32761q.L());
                return r.f47939a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
