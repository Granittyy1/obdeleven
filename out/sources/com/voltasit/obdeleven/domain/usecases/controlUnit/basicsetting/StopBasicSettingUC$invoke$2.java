package com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting;

import Aa.c;
import Ia.p;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.e;
import com.obdeleven.service.odx.model.DIAGLAYER;
import com.obdeleven.service.odx.model.PARAM;
import com.obdeleven.service.odx.model.SNREF;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt;
import com.voltasit.obdeleven.domain.timers.BasicSettingStatusTimer;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.z0;
import me.zhanghai.android.materialprogressbar.R;
import p109i8.k;
import p293xa.r;

/* JADX INFO: compiled from: StopBasicSettingUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StopBasicSettingUC$invoke$2", f = "StopBasicSettingUC.kt", l = {R.styleable.AppCompatTheme_buttonStyle, R.styleable.AppCompatTheme_dialogTheme, R.styleable.AppCompatTheme_imageButtonStyle, R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated}, m = "invokeSuspend")
final class StopBasicSettingUC$invoke$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ p207q8.a $basicSetting;
    final /* synthetic */ ControlUnit $controlUnit;
    final /* synthetic */ boolean $disconnect;
    final /* synthetic */ boolean $putToCacheOnly;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasicSettingUC$invoke$2(a aVar, boolean z10, boolean z11, p207q8.a aVar2, ControlUnit controlUnit, kotlin.coroutines.c<? super StopBasicSettingUC$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$disconnect = z10;
        this.$putToCacheOnly = z11;
        this.$basicSetting = aVar2;
        this.$controlUnit = controlUnit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new StopBasicSettingUC$invoke$2(this.this$0, this.$disconnect, this.$putToCacheOnly, this.$basicSetting, this.$controlUnit, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((StopBasicSettingUC$invoke$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9 A[Catch: Exception -> 0x0017, TRY_ENTER, TryCatch #1 {Exception -> 0x0017, blocks: (B:8:0x0012, B:55:0x011b, B:14:0x0022, B:50:0x0103, B:52:0x0107, B:44:0x00d9, B:46:0x00e2, B:47:0x00e5), top: B:62:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2 A[Catch: Exception -> 0x0017, TryCatch #1 {Exception -> 0x0017, blocks: (B:8:0x0012, B:55:0x011b, B:14:0x0022, B:50:0x0103, B:52:0x0107, B:44:0x00d9, B:46:0x00e2, B:47:0x00e5), top: B:62:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0107 A[Catch: Exception -> 0x0017, TryCatch #1 {Exception -> 0x0017, blocks: (B:8:0x0012, B:55:0x011b, B:14:0x0022, B:50:0x0103, B:52:0x0107, B:44:0x00d9, B:46:0x00e2, B:47:0x00e5), top: B:62:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10;
        k kVar;
        Param param;
        z0 z0Var;
        Task<String> taskD;
        Task<Boolean> taskA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = this.label;
        try {
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        i10 = this.I$0;
                        b.b(obj);
                    } else if (i11 == 2) {
                        kVar = (k) this.L$0;
                        b.b(obj);
                        param = (Param) obj;
                        if (this.$putToCacheOnly) {
                            return r.f47939a;
                        }
                        BasicSettingStatusTimer basicSettingStatusTimer = this.this$0.f30667c;
                        z0Var = basicSettingStatusTimer.f30607c;
                        if (z0Var != null) {
                            z0Var.i(null);
                        }
                        basicSettingStatusTimer.f30607c = null;
                        taskD = kVar.d(E8.a.g(param.g()));
                        i.d(taskD, "request(...)");
                        this.L$0 = null;
                        this.label = 3;
                        if (ParseTaskExtensionsKt.b(taskD, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (this.$disconnect) {
                            taskA = this.$controlUnit.a();
                            i.d(taskA, "disconnect(...)");
                            this.label = 4;
                            if (ParseTaskExtensionsKt.b(taskA, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else if (i11 == 3) {
                        b.b(obj);
                        if (this.$disconnect) {
                            taskA = this.$controlUnit.a();
                            i.d(taskA, "disconnect(...)");
                            this.label = 4;
                            if (ParseTaskExtensionsKt.b(taskA, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b.b(obj);
                    }
                    this.this$0.f30668d.a(this.$controlUnit, this.$basicSetting);
                    return r.f47939a;
                }
                b.b(obj);
                this.this$0.f30666b.f("StopBasicSettingUC", "StopBasicSettingUC(disconnect=" + this.$disconnect + ", putToCacheOnly=" + this.$putToCacheOnly + ")");
                i10 = this.$basicSetting.f46177d;
                Task<e> taskX = this.$controlUnit.X();
                i.d(taskX, "getODX(...)");
                this.I$0 = i10;
                this.label = 1;
                obj = ParseTaskExtensionsKt.b(taskX, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                int i12 = i10;
                i.d(obj, "suspend(...)");
                e eVar = (e) obj;
                kVar = this.$controlUnit.f29335r;
                if (kVar == null) {
                    return r.f47939a;
                }
                SNREF snref = new SNREF();
                snref.setSHORTNAME("DiagnServi_RoutiContrStopBasicSetti");
                e.b bVarF = eVar.f(snref);
                if (bVarF == null) {
                    return r.f47939a;
                }
                e.f fVarY = eVar.y(bVarF.f29497a.getREQUESTREF(), bVarF.f29498b);
                if (fVarY == null) {
                    return r.f47939a;
                }
                a aVar = this.this$0;
                DIAGLAYER diaglayer = fVarY.f29506b;
                List<PARAM> param2 = fVarY.f29505a.getPARAMS().getPARAM();
                i.d(param2, "getPARAM(...)");
                this.L$0 = kVar;
                this.label = 2;
                obj = a.a(aVar, diaglayer, param2, eVar, i12, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                param = (Param) obj;
                if (this.$putToCacheOnly) {
                    return r.f47939a;
                }
                BasicSettingStatusTimer basicSettingStatusTimer2 = this.this$0.f30667c;
                z0Var = basicSettingStatusTimer2.f30607c;
                if (z0Var != null) {
                    z0Var.i(null);
                }
                basicSettingStatusTimer2.f30607c = null;
                taskD = kVar.d(E8.a.g(param.g()));
                i.d(taskD, "request(...)");
                this.L$0 = null;
                this.label = 3;
                if (ParseTaskExtensionsKt.b(taskD, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (this.$disconnect) {
                    taskA = this.$controlUnit.a();
                    i.d(taskA, "disconnect(...)");
                    this.label = 4;
                    if (ParseTaskExtensionsKt.b(taskA, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                this.this$0.f30668d.a(this.$controlUnit, this.$basicSetting);
                return r.f47939a;
            } catch (Throwable unused) {
                return r.f47939a;
            }
        } catch (Exception e10) {
            this.this$0.f30666b.d(e10, false);
        }
    }
}
