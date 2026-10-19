package com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation;

import Ia.p;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.ODXLINK;
import com.obdeleven.service.odx.model.SNREF;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.Collection;
import java.util.List;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: UdsAdaptationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.UdsAdaptationViewModel$getCompuscales$1", f = "UdsAdaptationViewModel.kt", l = {R.styleable.AppCompatTheme_switchStyle, 129, 146}, m = "invokeSuspend")
final class UdsAdaptationViewModel$getCompuscales$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ ControlUnit $controlUnit;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.UdsAdaptationViewModel$getCompuscales$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: UdsAdaptationViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.UdsAdaptationViewModel$getCompuscales$1$1", f = "UdsAdaptationViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Task<com.obdeleven.service.odx.e> $task;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Task<com.obdeleven.service.odx.e> task, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$task = task;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$task, cVar);
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
            this.$task.waitForCompletion();
            return r.f47939a;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.UdsAdaptationViewModel$getCompuscales$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: UdsAdaptationViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.UdsAdaptationViewModel$getCompuscales$1$2", f = "UdsAdaptationViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super com.obdeleven.service.odx.e.g>, Object> {
        final /* synthetic */ com.obdeleven.service.odx.e $resultOdxWorker;
        final /* synthetic */ SNREF $snref;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.obdeleven.service.odx.e eVar, SNREF snref, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$resultOdxWorker = eVar;
            this.$snref = snref;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.$resultOdxWorker, this.$snref, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super com.obdeleven.service.odx.e.g> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return this.$resultOdxWorker.H(this.$snref);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UdsAdaptationViewModel$getCompuscales$1(i iVar, ControlUnit controlUnit, kotlin.coroutines.c<? super UdsAdaptationViewModel$getCompuscales$1> cVar) {
        super(2, cVar);
        this.this$0 = iVar;
        this.$controlUnit = controlUnit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UdsAdaptationViewModel$getCompuscales$1(this.this$0, this.$controlUnit, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((UdsAdaptationViewModel$getCompuscales$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0104  */
    /* JADX WARN: Code duplicated, block: B:33:0x0119  */
    /* JADX WARN: Code duplicated, block: B:36:0x0137  */
    /* JADX WARN: Code duplicated, block: B:37:0x0147  */
    /* JADX WARN: Code duplicated, block: B:39:0x0155 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x015c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0171  */
    /* JADX WARN: Code duplicated, block: B:45:0x0189  */
    /* JADX WARN: Code duplicated, block: B:46:0x019f  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x01bf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Task<com.obdeleven.service.odx.e> taskX;
        com.obdeleven.service.odx.e result;
        i iVar;
        i iVar2;
        com.obdeleven.service.odx.e.g gVar;
        com.obdeleven.service.odx.e.c cVarL;
        i iVar3;
        List<COMPUSCALE> list;
        C8.a aVar;
        C8.a.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                taskX = (Task) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 == 2) {
                    iVar = (i) this.L$1;
                    result = (com.obdeleven.service.odx.e) this.L$0;
                    kotlin.b.b(obj);
                    iVar.f31938C = (com.obdeleven.service.odx.e.g) obj;
                    iVar2 = this.this$0;
                    gVar = iVar2.f31938C;
                    if (gVar != null) {
                        ODXLINK keydopref = gVar.f29507a.getKEYDOPREF();
                        com.obdeleven.service.odx.e.g gVar2 = this.this$0.f31938C;
                        kotlin.jvm.internal.i.b(gVar2);
                        cVarL = result.l(keydopref, gVar2.f29508b);
                        if (cVarL != null) {
                            this.this$0.f31937B = ((DATAOBJECTPROP) cVarL.f29499a).getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE();
                        }
                        iVar3 = this.this$0;
                        list = iVar3.f31937B;
                        if (list == null) {
                            iVar3.f32113b.j(PreloaderState.d.f32643a);
                            B7.b.h(com.voltasit.obdeleven.R.string.view_adaptation_adaptations_not_available, this.this$0.f31952x);
                        } else {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 3;
                            obj = iVar3.f31944p.a(list, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        iVar2.f32113b.j(PreloaderState.d.f32643a);
                    }
                    return r.f47939a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                this.this$0.f32113b.j(PreloaderState.d.f32643a);
                bVar = (C8.a.b) aVar;
                if (((List) bVar.f2463a).isEmpty()) {
                    i iVar4 = this.this$0;
                    iVar4.f31937B = null;
                    iVar4.f32119h.j(new Integer(com.voltasit.obdeleven.R.string.view_adaptation_adaptations_not_available));
                    this.this$0.f32115d.j(Boolean.TRUE);
                } else {
                    this.this$0.f31937B = q.p0((Collection) bVar.f2463a);
                    this.this$0.f31954z.j(r.f47939a);
                }
            } else if (aVar instanceof C8.a.C0024a) {
                this.this$0.f32113b.j(PreloaderState.d.f32643a);
                this.this$0.f31945q.d(((C8.a.C0024a) aVar).f2462a, false);
                B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, this.this$0.f32119h);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        this.this$0.f32113b.j(PreloaderState.c.f32642a);
        taskX = this.$controlUnit.X();
        Sa.a aVar2 = N.f43200c;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(taskX, null);
        this.L$0 = taskX;
        this.label = 1;
        if (C2680e.f(aVar2, anonymousClass1, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (taskX.isFaulted()) {
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            if (taskX.getError() instanceof OdxFactory$Exception) {
                Exception error = taskX.getError();
                kotlin.jvm.internal.i.c(error, "null cannot be cast to non-null type com.obdeleven.service.odx.OdxFactory.Exception");
                int iA = ((OdxFactory$Exception) error).a();
                if (iA == 0) {
                    B7.b.h(com.voltasit.obdeleven.R.string.common_check_network_try_again, this.this$0.f31952x);
                } else if (iA != 1) {
                    J8.p pVar = this.this$0.f31945q;
                    Exception error2 = taskX.getError();
                    kotlin.jvm.internal.i.d(error2, "getError(...)");
                    pVar.d(error2, false);
                    B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, this.this$0.f31952x);
                } else {
                    B7.b.h(com.voltasit.obdeleven.R.string.common_description_data_na, this.this$0.f31952x);
                }
            } else {
                J8.p pVar2 = this.this$0.f31945q;
                Exception error3 = taskX.getError();
                kotlin.jvm.internal.i.d(error3, "getError(...)");
                pVar2.d(error3, false);
                B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, this.this$0.f31952x);
            }
        } else {
            result = taskX.getResult();
            this.this$0.f31939D = result;
            SNREF snref = new SNREF();
            snref.setSHORTNAME("TAB_RecorDataIdentCalibData");
            iVar = this.this$0;
            Sa.a aVar3 = N.f43200c;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(result, snref, null);
            this.L$0 = result;
            this.L$1 = iVar;
            this.label = 2;
            obj = C2680e.f(aVar3, anonymousClass2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            iVar.f31938C = (com.obdeleven.service.odx.e.g) obj;
            iVar2 = this.this$0;
            gVar = iVar2.f31938C;
            if (gVar != null) {
                ODXLINK keydopref2 = gVar.f29507a.getKEYDOPREF();
                com.obdeleven.service.odx.e.g gVar3 = this.this$0.f31938C;
                kotlin.jvm.internal.i.b(gVar3);
                cVarL = result.l(keydopref2, gVar3.f29508b);
                if (cVarL != null) {
                    this.this$0.f31937B = ((DATAOBJECTPROP) cVarL.f29499a).getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE();
                }
                iVar3 = this.this$0;
                list = iVar3.f31937B;
                if (list == null) {
                    iVar3.f32113b.j(PreloaderState.d.f32643a);
                    B7.b.h(com.voltasit.obdeleven.R.string.view_adaptation_adaptations_not_available, this.this$0.f31952x);
                } else {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    obj = iVar3.f31944p.a(list, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = (C8.a) obj;
                    if (aVar instanceof C8.a.b) {
                        this.this$0.f32113b.j(PreloaderState.d.f32643a);
                        bVar = (C8.a.b) aVar;
                        if (((List) bVar.f2463a).isEmpty()) {
                            i iVar5 = this.this$0;
                            iVar5.f31937B = null;
                            iVar5.f32119h.j(new Integer(com.voltasit.obdeleven.R.string.view_adaptation_adaptations_not_available));
                            this.this$0.f32115d.j(Boolean.TRUE);
                        } else {
                            this.this$0.f31937B = q.p0((Collection) bVar.f2463a);
                            this.this$0.f31954z.j(r.f47939a);
                        }
                    } else if (aVar instanceof C8.a.C0024a) {
                        this.this$0.f32113b.j(PreloaderState.d.f32643a);
                        this.this$0.f31945q.d(((C8.a.C0024a) aVar).f2462a, false);
                        B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, this.this$0.f32119h);
                    }
                }
            } else {
                iVar2.f32113b.j(PreloaderState.d.f32643a);
            }
        }
        return r.f47939a;
    }
}
